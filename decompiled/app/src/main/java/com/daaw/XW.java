package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public class XW extends F {
    public XW(byte[] bArr) {
        super(bArr);
    }

    @Override // com.daaw.F
    public ZW c(byte[] bArr, int i) {
        return new WW(bArr, i);
    }

    @Override // com.daaw.F
    public void g(byte[] bArr) {
        this.a = AbstractC6308lh.d(bArr[5], 7);
        this.b = AbstractC6308lh.d(bArr[5], 6);
        this.c = AbstractC6308lh.d(bArr[5], 5);
        this.d = AbstractC6308lh.d(bArr[5], 4);
    }

    @Override // com.daaw.F
    public boolean l() {
        return this.a;
    }
}
