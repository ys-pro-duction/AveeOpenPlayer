package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public class WW extends ZW {
    public WW(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // com.daaw.ZW
    public void e(byte[] bArr, int i) {
        this.b = AbstractC6308lh.m(bArr[i + 4], bArr[i + 5], bArr[i + 6], bArr[i + 7]);
    }

    @Override // com.daaw.ZW
    public boolean equals(Object obj) {
        if (obj instanceof WW) {
            return super.equals(obj);
        }
        return false;
    }
}
