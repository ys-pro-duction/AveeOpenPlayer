package com.daaw;

/* JADX INFO: renamed from: com.daaw.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6418m4 {
    public static boolean a;
    public static final Class b = a("libcore.io.Memory");
    public static final boolean c;

    static {
        c = (a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class b() {
        return b;
    }

    public static boolean c() {
        if (a) {
            return true;
        }
        return (b == null || c) ? false : true;
    }
}
