package com.daaw;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class OE0 implements InterfaceC7424ph, AutoCloseable {
    public final C4057dh B = new C4057dh();
    public final PU0 C;
    public boolean D;

    public OE0(PU0 pu0) {
        if (pu0 == null) {
            throw new NullPointerException("source == null");
        }
        this.C = pu0;
    }

    @Override // com.daaw.PU0
    public long A0(C4057dh c4057dh, long j) {
        if (c4057dh == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.D) {
            throw new IllegalStateException("closed");
        }
        C4057dh c4057dh2 = this.B;
        if (c4057dh2.C == 0 && this.C.A0(c4057dh2, 8192L) == -1) {
            return -1L;
        }
        return this.B.A0(c4057dh, Math.min(j, this.B.C));
    }

    @Override // com.daaw.InterfaceC7424ph
    public int B() throws EOFException {
        X0(4L);
        return this.B.B();
    }

    @Override // com.daaw.InterfaceC7424ph
    public byte[] C0(long j) throws EOFException {
        X0(j);
        return this.B.C0(j);
    }

    @Override // com.daaw.InterfaceC7424ph
    public C4057dh J() {
        return this.B;
    }

    @Override // com.daaw.InterfaceC7424ph
    public boolean K() {
        if (this.D) {
            throw new IllegalStateException("closed");
        }
        return this.B.K() && this.C.A0(this.B, 8192L) == -1;
    }

    @Override // com.daaw.InterfaceC7424ph
    public short N0() throws EOFException {
        X0(2L);
        return this.B.N0();
    }

    @Override // com.daaw.InterfaceC7424ph
    public long P0(C4908gi c4908gi) {
        return c(c4908gi, 0L);
    }

    @Override // com.daaw.InterfaceC7424ph
    public void X0(long j) throws EOFException {
        if (!v0(j)) {
            throw new EOFException();
        }
    }

    public long a(C4908gi c4908gi, long j) {
        if (this.D) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jY = this.B.Y(c4908gi, j);
            if (jY != -1) {
                return jY;
            }
            C4057dh c4057dh = this.B;
            long j2 = c4057dh.C;
            if (this.C.A0(c4057dh, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, (j2 - ((long) c4908gi.s())) + 1);
        }
    }

    public long c(C4908gi c4908gi, long j) {
        if (this.D) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jO0 = this.B.o0(c4908gi, j);
            if (jO0 != -1) {
                return jO0;
            }
            C4057dh c4057dh = this.B;
            long j2 = c4057dh.C;
            if (this.C.A0(c4057dh, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, j2);
        }
    }

    @Override // com.daaw.PU0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.D) {
            return;
        }
        this.D = true;
        this.C.close();
        this.B.c();
    }

    @Override // com.daaw.InterfaceC7424ph
    public InputStream e1() {
        return new a();
    }

    @Override // com.daaw.InterfaceC7424ph
    public long f0(C4908gi c4908gi) {
        return a(c4908gi, 0L);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.D;
    }

    @Override // com.daaw.InterfaceC7424ph
    public byte j0() throws EOFException {
        X0(1L);
        return this.B.j0();
    }

    @Override // com.daaw.InterfaceC7424ph
    public InterfaceC7424ph peek() {
        return AbstractC2468Up0.b(new C0901Ft0(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        C4057dh c4057dh = this.B;
        if (c4057dh.C == 0 && this.C.A0(c4057dh, 8192L) == -1) {
            return -1;
        }
        return this.B.read(byteBuffer);
    }

    @Override // com.daaw.InterfaceC7424ph
    public void skip(long j) throws EOFException {
        if (this.D) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C4057dh c4057dh = this.B;
            if (c4057dh.C == 0 && this.C.A0(c4057dh, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, this.B.f1());
            this.B.skip(jMin);
            j -= jMin;
        }
    }

    @Override // com.daaw.InterfaceC7424ph
    public C4057dh t() {
        return this.B;
    }

    public String toString() {
        return "buffer(" + this.C + ")";
    }

    @Override // com.daaw.InterfaceC7424ph
    public C4908gi u(long j) throws EOFException {
        X0(j);
        return this.B.u(j);
    }

    @Override // com.daaw.InterfaceC7424ph
    public int u0(C4386er0 c4386er0) throws EOFException {
        if (this.D) {
            throw new IllegalStateException("closed");
        }
        do {
            int iC1 = this.B.c1(c4386er0, true);
            if (iC1 == -1) {
                return -1;
            }
            if (iC1 != -2) {
                this.B.skip(c4386er0.B[iC1].s());
                return iC1;
            }
        } while (this.C.A0(this.B, 8192L) != -1);
        return -1;
    }

    @Override // com.daaw.InterfaceC7424ph
    public boolean v0(long j) {
        C4057dh c4057dh;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.D) {
            throw new IllegalStateException("closed");
        }
        do {
            c4057dh = this.B;
            if (c4057dh.C >= j) {
                return true;
            }
        } while (this.C.A0(c4057dh, 8192L) != -1);
        return false;
    }

    public class a extends InputStream implements AutoCloseable {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            OE0 oe0 = OE0.this;
            if (oe0.D) {
                throw new IOException("closed");
            }
            return (int) Math.min(oe0.B.C, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            OE0.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            OE0 oe0 = OE0.this;
            if (oe0.D) {
                throw new IOException("closed");
            }
            C4057dh c4057dh = oe0.B;
            if (c4057dh.C == 0 && oe0.C.A0(c4057dh, 8192L) == -1) {
                return -1;
            }
            return OE0.this.B.j0() & 255;
        }

        public String toString() {
            return OE0.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!OE0.this.D) {
                AbstractC7675qb1.b(bArr.length, i, i2);
                OE0 oe0 = OE0.this;
                C4057dh c4057dh = oe0.B;
                if (c4057dh.C == 0 && oe0.C.A0(c4057dh, 8192L) == -1) {
                    return -1;
                }
                return OE0.this.B.s0(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }
}
