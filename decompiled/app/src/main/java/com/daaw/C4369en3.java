package com.daaw;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.en3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4369en3 extends AbstractC1794Oi2 {
    public int i;
    public boolean j;
    public byte[] k;
    public byte[] l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;

    public C4369en3() {
        byte[] bArr = AbstractC9004vJ2.f;
        this.k = bArr;
        this.l = bArr;
    }

    @Override // com.daaw.InterfaceC6028ki2
    public final void b(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !h()) {
            int i = this.m;
            if (i == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.k.length));
                int iLimit2 = byteBuffer.limit();
                while (true) {
                    iLimit2 -= 2;
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(iLimit2)) > 1024) {
                        int i2 = this.i;
                        iPosition = ((iLimit2 / i2) * i2) + i2;
                        break;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.m = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    d(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.p = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i != 1) {
                int iLimit3 = byteBuffer.limit();
                int iL = l(byteBuffer);
                byteBuffer.limit(iL);
                this.q += (long) (byteBuffer.remaining() / this.i);
                n(byteBuffer, this.l, this.o);
                if (iL < iLimit3) {
                    m(this.l, this.o);
                    this.m = 0;
                    byteBuffer.limit(iLimit3);
                }
            } else {
                int iLimit4 = byteBuffer.limit();
                int iL2 = l(byteBuffer);
                int iPosition2 = iL2 - byteBuffer.position();
                byte[] bArr = this.k;
                int length = bArr.length;
                int i3 = this.n;
                int i4 = length - i3;
                if (iL2 >= iLimit4 || iPosition2 >= i4) {
                    int iMin = Math.min(iPosition2, i4);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.k, this.n, iMin);
                    int i5 = this.n + iMin;
                    this.n = i5;
                    byte[] bArr2 = this.k;
                    if (i5 == bArr2.length) {
                        if (this.p) {
                            m(bArr2, this.o);
                            long j = this.q;
                            int i6 = this.n;
                            int i7 = this.o;
                            this.q = j + ((long) ((i6 - (i7 + i7)) / this.i));
                            i5 = i6;
                        } else {
                            this.q += (long) ((i5 - this.o) / this.i);
                        }
                        n(byteBuffer, this.k, i5);
                        this.n = 0;
                        this.m = 2;
                    }
                    byteBuffer.limit(iLimit4);
                } else {
                    m(bArr, i3);
                    this.n = 0;
                    this.m = 0;
                }
            }
        }
    }

    @Override // com.daaw.AbstractC1794Oi2
    public final C3503bh2 c(C3503bh2 c3503bh2) throws C0855Fh2 {
        if (c3503bh2.c == 2) {
            return this.j ? c3503bh2 : C3503bh2.e;
        }
        throw new C0855Fh2("Unhandled input format:", c3503bh2);
    }

    @Override // com.daaw.AbstractC1794Oi2
    public final void e() {
        if (this.j) {
            this.i = this.b.d;
            int iK = k(150000L) * this.i;
            if (this.k.length != iK) {
                this.k = new byte[iK];
            }
            int iK2 = k(20000L) * this.i;
            this.o = iK2;
            if (this.l.length != iK2) {
                this.l = new byte[iK2];
            }
        }
        this.m = 0;
        this.q = 0L;
        this.n = 0;
        this.p = false;
    }

    @Override // com.daaw.AbstractC1794Oi2
    public final void f() {
        int i = this.n;
        if (i > 0) {
            m(this.k, i);
        }
        if (this.p) {
            return;
        }
        this.q += (long) (this.o / this.i);
    }

    @Override // com.daaw.AbstractC1794Oi2
    public final void g() {
        this.j = false;
        this.o = 0;
        byte[] bArr = AbstractC9004vJ2.f;
        this.k = bArr;
        this.l = bArr;
    }

    public final long i() {
        return this.q;
    }

    public final void j(boolean z) {
        this.j = z;
    }

    public final int k(long j) {
        return (int) ((j * ((long) this.b.a)) / 1000000);
    }

    public final int l(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > 1024) {
                int i = this.i;
                return i * (iPosition / i);
            }
        }
        return byteBuffer.limit();
    }

    public final void m(byte[] bArr, int i) {
        d(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.p = true;
        }
    }

    public final void n(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = Math.min(byteBuffer.remaining(), this.o);
        int i2 = this.o - iMin;
        System.arraycopy(bArr, i - i2, this.l, 0, i2);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.l, i2, iMin);
    }

    @Override // com.daaw.AbstractC1794Oi2, com.daaw.InterfaceC6028ki2
    public final boolean zzg() {
        return this.j;
    }
}
