package com.daaw;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.wC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C9253wC0 implements Closeable, AutoCloseable {
    public static final Logger H = Logger.getLogger(C9253wC0.class.getName());
    public final RandomAccessFile B;
    public int C;
    public int D;
    public b E;
    public b F;
    public final byte[] G = new byte[16];

    /* JADX INFO: renamed from: com.daaw.wC0$a */
    public class a implements d {
        public boolean a = true;
        public final /* synthetic */ StringBuilder b;

        public a(StringBuilder sb) {
            this.b = sb;
        }

        @Override // com.daaw.C9253wC0.d
        public void a(InputStream inputStream, int i) {
            if (this.a) {
                this.a = false;
            } else {
                this.b.append(", ");
            }
            this.b.append(i);
        }
    }

    /* JADX INFO: renamed from: com.daaw.wC0$b */
    public static class b {
        public static final b c = new b(0, 0);
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.a + ", length = " + this.b + "]";
        }
    }

    /* JADX INFO: renamed from: com.daaw.wC0$c */
    public final class c extends InputStream {
        public int B;
        public int C;

        public /* synthetic */ c(C9253wC0 c9253wC0, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            C9253wC0.U(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.C;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            C9253wC0.this.w0(this.B, bArr, i, i2);
            this.B = C9253wC0.this.E0(this.B + i2);
            this.C -= i2;
            return i2;
        }

        public c(b bVar) {
            this.B = C9253wC0.this.E0(bVar.a + 4);
            this.C = bVar.b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.C == 0) {
                return -1;
            }
            C9253wC0.this.B.seek(this.B);
            int i = C9253wC0.this.B.read();
            this.B = C9253wC0.this.E0(this.B + 1);
            this.C--;
            return i;
        }
    }

    /* JADX INFO: renamed from: com.daaw.wC0$d */
    public interface d {
        void a(InputStream inputStream, int i);
    }

    public C9253wC0(File file) throws IOException {
        if (!file.exists()) {
            N(file);
        }
        this.B = W(file);
        o0();
    }

    public static void N(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileW = W(file2);
        try {
            randomAccessFileW.setLength(4096L);
            randomAccessFileW.seek(0L);
            byte[] bArr = new byte[16];
            Y0(bArr, 4096, 0, 0, 0);
            randomAccessFileW.write(bArr);
            randomAccessFileW.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            randomAccessFileW.close();
            throw th;
        }
    }

    public static void Q0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public static Object U(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static RandomAccessFile W(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    public static void Y0(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            Q0(bArr, i, i2);
            i += 4;
        }
    }

    public static int p0(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public int B0() {
        if (this.D == 0) {
            return 16;
        }
        b bVar = this.F;
        int i = bVar.a;
        int i2 = this.E.a;
        return i >= i2 ? (i - i2) + 4 + bVar.b + 16 : (((i + 4) + bVar.b) + this.C) - i2;
    }

    public final int E0(int i) {
        int i2 = this.C;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final void F(int i) throws IOException {
        int i2 = i + 4;
        int iQ0 = q0();
        if (iQ0 >= i2) {
            return;
        }
        int i3 = this.C;
        do {
            iQ0 += i3;
            i3 <<= 1;
        } while (iQ0 < i2);
        y0(i3);
        b bVar = this.F;
        int iE0 = E0(bVar.a + 4 + bVar.b);
        if (iE0 < this.E.a) {
            FileChannel channel = this.B.getChannel();
            channel.position(this.C);
            long j = iE0 - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.F.a;
        int i5 = this.E.a;
        if (i4 < i5) {
            int i6 = (this.C + i4) - 16;
            K0(i3, this.D, i5, i6);
            this.F = new b(i6, this.F.b);
        } else {
            K0(i3, this.D, i5, i4);
        }
        this.C = i3;
    }

    public synchronized void I(d dVar) {
        int iE0 = this.E.a;
        for (int i = 0; i < this.D; i++) {
            b bVarY = Y(iE0);
            dVar.a(new c(this, bVarY, null), bVarY.b);
            iE0 = E0(bVarY.a + 4 + bVarY.b);
        }
    }

    public final void K0(int i, int i2, int i3, int i4) throws IOException {
        Y0(this.G, i, i2, i3, i4);
        this.B.seek(0L);
        this.B.write(this.G);
    }

    public synchronized boolean R() {
        return this.D == 0;
    }

    public final b Y(int i) throws IOException {
        if (i == 0) {
            return b.c;
        }
        this.B.seek(i);
        return new b(i, this.B.readInt());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.B.close();
    }

    public void l(byte[] bArr) {
        o(bArr, 0, bArr.length);
    }

    public synchronized void o(byte[] bArr, int i, int i2) {
        int iE0;
        try {
            U(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            F(i2);
            boolean zR = R();
            if (zR) {
                iE0 = 16;
            } else {
                b bVar = this.F;
                iE0 = E0(bVar.a + 4 + bVar.b);
            }
            b bVar2 = new b(iE0, i2);
            Q0(this.G, 0, i2);
            x0(bVar2.a, this.G, 0, 4);
            x0(bVar2.a + 4, bArr, i, i2);
            K0(this.C, this.D + 1, zR ? bVar2.a : this.E.a, bVar2.a);
            this.F = bVar2;
            this.D++;
            if (zR) {
                this.E = bVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o0() throws IOException {
        this.B.seek(0L);
        this.B.readFully(this.G);
        int iP0 = p0(this.G, 0);
        this.C = iP0;
        if (iP0 <= this.B.length()) {
            this.D = p0(this.G, 4);
            int iP02 = p0(this.G, 8);
            int iP03 = p0(this.G, 12);
            this.E = Y(iP02);
            this.F = Y(iP03);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.C + ", Actual length: " + this.B.length());
    }

    public final int q0() {
        return this.C - B0();
    }

    public synchronized void s() {
        try {
            K0(4096, 0, 0, 0);
            this.D = 0;
            b bVar = b.c;
            this.E = bVar;
            this.F = bVar;
            if (this.C > 4096) {
                y0(4096);
            }
            this.C = 4096;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void s0() {
        try {
            if (R()) {
                throw new NoSuchElementException();
            }
            if (this.D == 1) {
                s();
            } else {
                b bVar = this.E;
                int iE0 = E0(bVar.a + 4 + bVar.b);
                w0(iE0, this.G, 0, 4);
                int iP0 = p0(this.G, 0);
                K0(this.C, this.D - 1, iE0, this.F.a);
                this.D--;
                this.E = new b(iE0, iP0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.C);
        sb.append(", size=");
        sb.append(this.D);
        sb.append(", first=");
        sb.append(this.E);
        sb.append(", last=");
        sb.append(this.F);
        sb.append(", element lengths=[");
        try {
            I(new a(sb));
        } catch (IOException e) {
            H.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final void w0(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iE0 = E0(i);
        int i4 = iE0 + i3;
        int i5 = this.C;
        if (i4 <= i5) {
            this.B.seek(iE0);
            this.B.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iE0;
        this.B.seek(iE0);
        this.B.readFully(bArr, i2, i6);
        this.B.seek(16L);
        this.B.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final void x0(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iE0 = E0(i);
        int i4 = iE0 + i3;
        int i5 = this.C;
        if (i4 <= i5) {
            this.B.seek(iE0);
            this.B.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iE0;
        this.B.seek(iE0);
        this.B.write(bArr, i2, i6);
        this.B.seek(16L);
        this.B.write(bArr, i2 + i6, i3 - i6);
    }

    public final void y0(int i) throws IOException {
        this.B.setLength(i);
        this.B.getChannel().force(true);
    }
}
