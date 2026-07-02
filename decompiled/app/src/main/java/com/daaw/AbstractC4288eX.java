package com.daaw;

/* JADX INFO: renamed from: com.daaw.eX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4288eX {
    public static F a(byte[] bArr) {
        UW uw = new UW(bArr);
        return uw.e().isEmpty() ? new UW(bArr, true) : uw;
    }

    public static F b(byte[] bArr) throws C5428ia1, C6344lo0 {
        c(bArr);
        byte b = bArr[3];
        if (b == 2) {
            return a(bArr);
        }
        if (b == 3) {
            return new VW(bArr);
        }
        if (b == 4) {
            return new XW(bArr);
        }
        throw new C5428ia1("Tag version not supported");
    }

    public static void c(byte[] bArr) throws C5428ia1, C6344lo0 {
        if (bArr.length < 10) {
            throw new C6344lo0("Buffer too short");
        }
        if (!"ID3".equals(AbstractC6308lh.c(bArr, 0, 3))) {
            throw new C6344lo0();
        }
        byte b = bArr[3];
        if (b == 2 || b == 3 || b == 4) {
            return;
        }
        throw new C5428ia1("Unsupported version 2." + ((int) b) + "." + ((int) bArr[4]));
    }
}
