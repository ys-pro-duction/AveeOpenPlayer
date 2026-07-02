package com.daaw;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.in3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5494in3 extends AbstractC1794Oi2 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m = AbstractC9004vJ2.f;
    public int n;
    public long o;

    @Override // com.daaw.InterfaceC6028ki2
    public final void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.l);
        this.o += (long) (iMin / this.b.d);
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer byteBufferD = d(length);
        int iMax = Math.max(0, Math.min(length, this.n));
        byteBufferD.put(this.m, 0, iMax);
        int iMax2 = Math.max(0, Math.min(length - iMax, i2));
        byteBuffer.limit(byteBuffer.position() + iMax2);
        byteBufferD.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iMax2;
        int i4 = this.n - iMax;
        this.n = i4;
        byte[] bArr = this.m;
        System.arraycopy(bArr, iMax, bArr, 0, i4);
        byteBuffer.get(this.m, this.n, i3);
        this.n += i3;
        byteBufferD.flip();
    }

    @Override // com.daaw.AbstractC1794Oi2
    public final C3503bh2 c(C3503bh2 c3503bh2) throws C0855Fh2 {
        if (c3503bh2.c != 2) {
            throw new C0855Fh2("Unhandled input format:", c3503bh2);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? C3503bh2.e : c3503bh2;
    }

    @Override // com.daaw.AbstractC1794Oi2
    public final void e() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // com.daaw.AbstractC1794Oi2
    public final void f() {
        if (this.k) {
            int i = this.n;
            if (i > 0) {
                this.o += (long) (i / this.b.d);
            }
            this.n = 0;
        }
    }

    @Override // com.daaw.AbstractC1794Oi2
    public final void g() {
        this.m = AbstractC9004vJ2.f;
    }

    public final long i() {
        return this.o;
    }

    public final void j() {
        this.o = 0L;
    }

    public final void k(int i, int i2) {
        this.i = i;
        this.j = i2;
    }

    @Override // com.daaw.AbstractC1794Oi2, com.daaw.InterfaceC6028ki2
    public final ByteBuffer zzb() {
        int i;
        if (super.zzh() && (i = this.n) > 0) {
            d(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.zzb();
    }

    @Override // com.daaw.AbstractC1794Oi2, com.daaw.InterfaceC6028ki2
    public final boolean zzh() {
        return super.zzh() && this.n == 0;
    }
}
