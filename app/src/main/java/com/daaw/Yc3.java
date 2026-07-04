package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Yc3 extends C5166hd3 {
    public final int G;

    public Yc3(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC9646xd3.G(0, i2, bArr.length);
        this.G = i2;
    }

    @Override // com.daaw.C5166hd3
    public final int K() {
        return 0;
    }

    @Override // com.daaw.C5166hd3, com.daaw.AbstractC9646xd3
    public final byte e(int i) {
        int i2 = this.G;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.F[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    @Override // com.daaw.C5166hd3, com.daaw.AbstractC9646xd3
    public final byte q(int i) {
        return this.F[i];
    }

    @Override // com.daaw.C5166hd3, com.daaw.AbstractC9646xd3
    public final int s() {
        return this.G;
    }
}
