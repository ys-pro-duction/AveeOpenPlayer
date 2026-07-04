package com.daaw;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.w43, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9218w43 extends InputStream {
    public Iterator B;
    public ByteBuffer C;
    public int D = 0;
    public int E;
    public int F;
    public boolean G;
    public byte[] H;
    public int I;
    public long J;

    public C9218w43(Iterable iterable) {
        this.B = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.D++;
        }
        this.E = -1;
        if (c()) {
            return;
        }
        this.C = AbstractC8374t43.e;
        this.E = 0;
        this.F = 0;
        this.J = 0L;
    }

    public final void a(int i) {
        int i2 = this.F + i;
        this.F = i2;
        if (i2 == this.C.limit()) {
            c();
        }
    }

    public final boolean c() {
        this.E++;
        if (!this.B.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.B.next();
        this.C = byteBuffer;
        this.F = byteBuffer.position();
        if (this.C.hasArray()) {
            this.G = true;
            this.H = this.C.array();
            this.I = this.C.arrayOffset();
        } else {
            this.G = false;
            this.J = K53.m(this.C);
            this.H = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.E == this.D) {
            return -1;
        }
        if (this.G) {
            int i = this.H[this.F + this.I] & 255;
            a(1);
            return i;
        }
        int i2 = K53.i(((long) this.F) + this.J) & 255;
        a(1);
        return i2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.E == this.D) {
            return -1;
        }
        int iLimit = this.C.limit();
        int i3 = this.F;
        int i4 = iLimit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.G) {
            System.arraycopy(this.H, i3 + this.I, bArr, i, i2);
            a(i2);
            return i2;
        }
        int iPosition = this.C.position();
        this.C.position(this.F);
        this.C.get(bArr, i, i2);
        this.C.position(iPosition);
        a(i2);
        return i2;
    }
}
