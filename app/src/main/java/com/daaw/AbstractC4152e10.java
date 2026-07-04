package com.daaw;

/* JADX INFO: renamed from: com.daaw.e10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4152e10 {
    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        String[] strArr = new String[2];
        AbstractC0405Bb1.B(str, 58, strArr);
        if ("internalres".equals(strArr[0])) {
            return C8620ty.b().a(strArr[1], 0);
        }
        return 0;
    }
}
