package com.daaw;

/* JADX INFO: renamed from: com.daaw.bX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3453bX extends ZW {
    public C3453bX(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // com.daaw.ZW
    public int c() {
        return this.b + 6;
    }

    @Override // com.daaw.ZW
    public void e(byte[] bArr, int i) {
        this.b = AbstractC6308lh.l((byte) 0, bArr[i + 3], bArr[i + 4], bArr[i + 5]);
    }

    @Override // com.daaw.ZW
    public int h(byte[] bArr, int i) {
        this.a = AbstractC6308lh.c(bArr, i, 3);
        e(bArr, i);
        return i + 6;
    }
}
