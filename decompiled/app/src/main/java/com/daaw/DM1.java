package com.daaw;

import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DM1 {
    public static final HashSet a = new HashSet();
    public static String b = "media3.common";

    public static synchronized String a() {
        return b;
    }

    public static synchronized void b(String str) {
        if (a.add(str)) {
            b = b + ", " + str;
        }
    }
}
