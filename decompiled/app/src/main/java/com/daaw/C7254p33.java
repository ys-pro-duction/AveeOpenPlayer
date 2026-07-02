package com.daaw;

/* JADX INFO: renamed from: com.daaw.p33, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7254p33 extends C8090s33 {
    public final int G;
    public final int H;

    public C7254p33(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC9213w33.O(i, i + i2, bArr.length);
        this.G = i;
        this.H = i2;
    }

    @Override // com.daaw.C8090s33, com.daaw.AbstractC9213w33
    public final void D(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.F, this.G + i, bArr, i2, i3);
    }

    @Override // com.daaw.C8090s33
    public final int Z() {
        return this.G;
    }

    @Override // com.daaw.C8090s33, com.daaw.AbstractC9213w33
    public final byte q(int i) {
        AbstractC9213w33.W(i, this.H);
        return this.F[this.G + i];
    }

    @Override // com.daaw.C8090s33, com.daaw.AbstractC9213w33
    public final byte s(int i) {
        return this.F[this.G + i];
    }

    @Override // com.daaw.C8090s33, com.daaw.AbstractC9213w33
    public final int y() {
        return this.H;
    }
}
