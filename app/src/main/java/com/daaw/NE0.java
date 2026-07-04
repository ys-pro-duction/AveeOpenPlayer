package com.daaw;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class NE0 implements InterfaceC7145oh, AutoCloseable {
    public final C4057dh B = new C4057dh();
    public final InterfaceC9600xT0 C;
    public boolean D;

    public NE0(InterfaceC9600xT0 interfaceC9600xT0) {
        if (interfaceC9600xT0 == null) {
            throw new NullPointerException("sink == null");
        }
        this.C = interfaceC9600xT0;
    }

    @Override // com.daaw.InterfaceC7145oh
    public InterfaceC7145oh C(int i) {
        if (this.D) {
            throw new IllegalStateException("closed");
        }
        this.B.C(i);
        return a();
    }

    @Override // com.daaw.InterfaceC7145oh
    public InterfaceC7145oh J0(byte[] bArr) {
        if (this.D) {
            throw new IllegalStateException("closed");
        }
        this.B.J0(bArr);
        return a();
    }

    @Override // com.daaw.InterfaceC7145oh
    public InterfaceC7145oh L(int i) {
        if (this.D) {
            throw new IllegalStateException("closed");
        }
        this.B.L(i);
        return a();
    }

    @Override // com.daaw.InterfaceC9600xT0
    public void O0(C4057dh c4057dh, long j) {
        if (this.D) {
            throw new IllegalStateException("closed");
        }
        this.B.O0(c4057dh, j);
        a();
    }

    public InterfaceC7145oh a() {
        if (this.D) {
            throw new IllegalStateException("closed");
        }
        long j = this.B.j();
        if (j > 0) {
            this.C.O0(this.B, j);
        }
        return this;
    }

    @Override // com.daaw.InterfaceC9600xT0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.D) {
            return;
        }
        try {
            C4057dh c4057dh = this.B;
            long j = c4057dh.C;
            if (j > 0) {
                this.C.O0(c4057dh, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.C.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.D = true;
        if (th != null) {
            AbstractC7675qb1.c(th);
        }
    }

    @Override // com.daaw.InterfaceC7145oh
    public InterfaceC7145oh d0(String str) {
        if (this.D) {
            throw new IllegalStateException("closed");
        }
        this.B.d0(str);
        return a();
    }

    @Override // com.daaw.InterfaceC7145oh, com.daaw.InterfaceC9600xT0, java.io.Flushable
    public void flush() {
        if (this.D) {
            throw new IllegalStateException("closed");
        }
        C4057dh c4057dh = this.B;
        long j = c4057dh.C;
        if (j > 0) {
            this.C.O0(c4057dh, j);
        }
        this.C.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.D;
    }

    @Override // com.daaw.InterfaceC7145oh
    public InterfaceC7145oh n0(String str, int i, int i2) {
        if (this.D) {
            throw new IllegalStateException("closed");
        }
        this.B.n0(str, i, i2);
        return a();
    }

    public String toString() {
        return "buffer(" + this.C + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (this.D) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.B.write(byteBuffer);
        a();
        return iWrite;
    }

    @Override // com.daaw.InterfaceC7145oh
    public InterfaceC7145oh y(int i) {
        if (this.D) {
            throw new IllegalStateException("closed");
        }
        this.B.y(i);
        return a();
    }
}
