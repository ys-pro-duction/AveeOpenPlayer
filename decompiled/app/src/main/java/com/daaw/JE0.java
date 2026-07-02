package com.daaw;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class JE0 {
    public static final IE0 a = new c(new byte[0]);

    public static class c extends AbstractC4425f0 {
        public int B;
        public final int C;
        public final byte[] D;
        public int E;

        public c(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // com.daaw.IE0
        public int G() {
            a(1);
            byte[] bArr = this.D;
            int i = this.B;
            this.B = i + 1;
            return bArr[i] & 255;
        }

        @Override // com.daaw.IE0
        public void L0(OutputStream outputStream, int i) throws IOException {
            a(i);
            outputStream.write(this.D, this.B, i);
            this.B += i;
        }

        @Override // com.daaw.IE0
        public void a1(ByteBuffer byteBuffer) {
            AbstractC7785qy0.o(byteBuffer, "dest");
            int iRemaining = byteBuffer.remaining();
            a(iRemaining);
            byteBuffer.put(this.D, this.B, iRemaining);
            this.B += iRemaining;
        }

        @Override // com.daaw.IE0
        public int b() {
            return this.C - this.B;
        }

        @Override // com.daaw.IE0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c E(int i) {
            a(i);
            int i2 = this.B;
            this.B = i2 + i;
            return new c(this.D, i2, i);
        }

        @Override // com.daaw.IE0
        public void i0(byte[] bArr, int i, int i2) {
            System.arraycopy(this.D, this.B, bArr, i, i2);
            this.B += i2;
        }

        @Override // com.daaw.AbstractC4425f0, com.daaw.IE0
        public boolean markSupported() {
            return true;
        }

        @Override // com.daaw.IE0
        public void p(int i) {
            a(i);
            this.B += i;
        }

        @Override // com.daaw.AbstractC4425f0, com.daaw.IE0
        public void r0() {
            this.E = this.B;
        }

        @Override // com.daaw.AbstractC4425f0, com.daaw.IE0
        public void reset() {
            int i = this.E;
            if (i == -1) {
                throw new InvalidMarkException();
            }
            this.B = i;
        }

        public c(byte[] bArr, int i, int i2) {
            this.E = -1;
            AbstractC7785qy0.e(i >= 0, "offset must be >= 0");
            AbstractC7785qy0.e(i2 >= 0, "length must be >= 0");
            int i3 = i2 + i;
            AbstractC7785qy0.e(i3 <= bArr.length, "offset + length exceeds array boundary");
            this.D = (byte[]) AbstractC7785qy0.o(bArr, "bytes");
            this.B = i;
            this.C = i3;
        }
    }

    public static IE0 a() {
        return a;
    }

    public static IE0 b(IE0 ie0) {
        return new a(ie0);
    }

    public static InputStream c(IE0 ie0, boolean z) {
        if (!z) {
            ie0 = b(ie0);
        }
        return new b(ie0);
    }

    public static byte[] d(IE0 ie0) {
        AbstractC7785qy0.o(ie0, "buffer");
        int iB = ie0.b();
        byte[] bArr = new byte[iB];
        ie0.i0(bArr, 0, iB);
        return bArr;
    }

    public static String e(IE0 ie0, Charset charset) {
        AbstractC7785qy0.o(charset, "charset");
        return new String(d(ie0), charset);
    }

    public static IE0 f(byte[] bArr, int i, int i2) {
        return new c(bArr, i, i2);
    }

    public static final class b extends InputStream implements InterfaceC4466f80, AutoCloseable {
        public IE0 B;

        public b(IE0 ie0) {
            this.B = (IE0) AbstractC7785qy0.o(ie0, "buffer");
        }

        @Override // java.io.InputStream
        public int available() {
            return this.B.b();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.B.close();
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.B.r0();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.B.markSupported();
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.B.b() == 0) {
                return -1;
            }
            return this.B.G();
        }

        @Override // java.io.InputStream
        public void reset() {
            this.B.reset();
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            int iMin = (int) Math.min(this.B.b(), j);
            this.B.p(iMin);
            return iMin;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (this.B.b() == 0) {
                return -1;
            }
            int iMin = Math.min(this.B.b(), i2);
            this.B.i0(bArr, i, iMin);
            return iMin;
        }
    }

    public class a extends AbstractC9583xP {
        public a(IE0 ie0) {
            super(ie0);
        }

        @Override // com.daaw.IE0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
