package com.daaw;

/* JADX INFO: renamed from: com.daaw.Kc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1353Kc0 {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        String[] strArr = new String[2];
        AbstractC0405Bb1.B(str, 58, strArr);
        if ("local".equals(strArr[0])) {
            return strArr[1];
        }
        return null;
    }
}
