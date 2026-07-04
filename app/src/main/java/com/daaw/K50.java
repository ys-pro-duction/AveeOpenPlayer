package com.daaw;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class K50 {
    public static final Map a = C8112s80.a.d();

    public static final String a(J50 j50) {
        G10.g(j50, "<this>");
        String str = (String) a.get(j50);
        return str == null ? b(j50) : str;
    }

    public static final String b(J50 j50) {
        G10.g(j50, "<this>");
        String strB = C8112s80.a.b(j50);
        a.put(j50, strB);
        return strB;
    }
}
