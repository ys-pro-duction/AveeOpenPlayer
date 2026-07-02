package com.daaw;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.daaw.iF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5343iF0 extends FilterInputStream implements AutoCloseable {
    public volatile byte[] B;
    public int C;
    public int D;
    public int E;
    public int F;

    /* JADX INFO: renamed from: com.daaw.iF0$a */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public C5343iF0(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.E = -1;
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("buffer is null or empty");
        }
        this.B = bArr;
    }

    public static IOException d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.E;
        if (i != -1) {
            int i2 = this.F - i;
            int i3 = this.D;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.C == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.B = bArr2;
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.F - this.E;
                this.F = i4;
                this.E = 0;
                this.C = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.F;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.C = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.E = -1;
            this.F = 0;
            this.C = i7;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.B == null || inputStream == null) {
            throw d();
        }
        return (this.C - this.F) + inputStream.available();
    }

    public synchronized void c() {
        this.D = this.B.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.B = null;
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        this.D = Math.max(this.D, i);
        this.E = this.F;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.B;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw d();
        }
        if (this.F >= this.C && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.B && (bArr = this.B) == null) {
            throw d();
        }
        int i = this.C;
        int i2 = this.F;
        if (i - i2 <= 0) {
            return -1;
        }
        this.F = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.B == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.E;
        if (-1 == i) {
            throw new a("Mark has been invalidated");
        }
        this.F = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) {
        byte[] bArr = this.B;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null) {
            throw d();
        }
        if (j < 1) {
            return 0L;
        }
        if (inputStream == null) {
            throw d();
        }
        int i = this.C;
        int i2 = this.F;
        if (i - i2 >= j) {
            this.F = (int) (((long) i2) + j);
            return j;
        }
        long j2 = i - i2;
        this.F = i;
        if (this.E == -1 || j > this.D) {
            return j2 + inputStream.skip(j - j2);
        }
        if (a(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.C;
        int i4 = this.F;
        long j3 = j - j2;
        if (i3 - i4 >= j3) {
            this.F = (int) (((long) i4) + j3);
            return j;
        }
        long j4 = (j2 + ((long) i3)) - ((long) i4);
        this.F = i3;
        return j4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.B;
        if (bArr2 == null) {
            throw d();
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.F;
            int i6 = this.C;
            if (i5 < i6) {
                int i7 = i6 - i5 >= i2 ? i2 : i6 - i5;
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.F += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.E == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.B && (bArr2 = this.B) == null) {
                        throw d();
                    }
                    int i8 = this.C;
                    int i9 = this.F;
                    i4 = i8 - i9 >= i3 ? i3 : i8 - i9;
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.F += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        } else {
            throw d();
        }
    }
}
