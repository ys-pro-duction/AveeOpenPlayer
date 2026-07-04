package com.daaw;

import java.util.HashSet;

/* JADX INFO: renamed from: com.daaw.aJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3118aJ {
    public static final HashSet a = new HashSet();
    public static String b = "goog.exo.core";

    public static synchronized void a(String str) {
        if (a.add(str)) {
            b += ", " + str;
        }
    }

    public static synchronized String b() {
        return b;
    }
}
