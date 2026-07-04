package com.daaw;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.Pp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1924Pp0 extends AbstractC4425f0 {
    public final C4057dh B;

    public C1924Pp0(C4057dh c4057dh) {
        this.B = c4057dh;
    }

    @Override // com.daaw.IE0
    public IE0 E(int i) {
        C4057dh c4057dh = new C4057dh();
        c4057dh.O0(this.B, i);
        return new C1924Pp0(c4057dh);
    }

    @Override // com.daaw.IE0
    public int G() {
        try {
            c();
            return this.B.j0() & 255;
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // com.daaw.IE0
    public void L0(OutputStream outputStream, int i) throws IOException {
        this.B.q1(outputStream, i);
    }

    @Override // com.daaw.IE0
    public void a1(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.IE0
    public int b() {
        return (int) this.B.f1();
    }

    @Override // com.daaw.AbstractC4425f0, com.daaw.IE0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.B.c();
    }

    @Override // com.daaw.IE0
    public void i0(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int iS0 = this.B.s0(bArr, i, i2);
            if (iS0 == -1) {
                throw new IndexOutOfBoundsException("EOF trying to read " + i2 + " bytes");
            }
            i2 -= iS0;
            i += iS0;
        }
    }

    @Override // com.daaw.IE0
    public void p(int i) {
        try {
            this.B.skip(i);
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    public final void c() {
    }
}
