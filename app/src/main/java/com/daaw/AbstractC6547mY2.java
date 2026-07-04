package com.daaw;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.daaw.mY2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6547mY2 {
    public static final Charset a = Charset.forName("UTF-8");

    public static final Y23 a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new C6268lY2("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i] = (byte) cCharAt;
        }
        return Y23.b(bArr);
    }
}
