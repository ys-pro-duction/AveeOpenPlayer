package com.daaw;

/* JADX INFO: renamed from: com.daaw.fG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4500fG0 {
    public static final String b(C6607ml c6607ml) {
        String strB = c6607ml.g().b();
        G10.f(strB, "asString(...)");
        String strR = AY0.r(strB, '.', '$', false, 4, null);
        if (c6607ml.f().d()) {
            return strR;
        }
        return c6607ml.f() + '.' + strR;
    }
}
