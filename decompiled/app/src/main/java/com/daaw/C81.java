package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class C81 {
    public static final C81 B = new C81("SUPERTYPE", 0);
    public static final C81 C = new C81("COMMON", 1);
    public static final /* synthetic */ C81[] D;
    public static final /* synthetic */ YG E;

    static {
        C81[] c81ArrA = a();
        D = c81ArrA;
        E = AbstractC3110aH.a(c81ArrA);
    }

    public C81(String str, int i) {
    }

    public static final /* synthetic */ C81[] a() {
        return new C81[]{B, C};
    }

    public static C81 valueOf(String str) {
        return (C81) Enum.valueOf(C81.class, str);
    }

    public static C81[] values() {
        return (C81[]) D.clone();
    }
}
