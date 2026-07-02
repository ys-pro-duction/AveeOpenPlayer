package com.daaw;

import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.daaw.cX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3731cX extends C4010dX {
    public C3731cX(boolean z, byte[] bArr) {
        super(z, bArr);
    }

    @Override // com.daaw.C4010dX, com.daaw.E
    public void b(byte[] bArr) {
        String strA;
        int length = 1;
        try {
            strA = AbstractC6308lh.a(bArr, 1, 3);
        } catch (UnsupportedEncodingException unused) {
            strA = "unknown";
        }
        this.b = "image/" + strA.toLowerCase();
        this.c = bArr[4];
        int iG = AbstractC6308lh.g(bArr, 5, bArr[0]);
        if (iG >= 0) {
            AG ag = new AG(bArr[0], AbstractC6308lh.e(bArr, 5, iG - 5));
            this.d = ag;
            length = iG + ag.e().length;
        } else {
            this.d = new AG(bArr[0], "");
        }
        this.e = AbstractC6308lh.e(bArr, length, bArr.length - length);
    }
}
