package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class A71 {
    public static final A71 B = new A71("FLEXIBLE_LOWER", 0);
    public static final A71 C = new A71("FLEXIBLE_UPPER", 1);
    public static final A71 D = new A71("INFLEXIBLE", 2);
    public static final /* synthetic */ A71[] E;
    public static final /* synthetic */ YG F;

    static {
        A71[] a71ArrA = a();
        E = a71ArrA;
        F = AbstractC3110aH.a(a71ArrA);
    }

    public A71(String str, int i) {
    }

    public static final /* synthetic */ A71[] a() {
        return new A71[]{B, C, D};
    }

    public static A71 valueOf(String str) {
        return (A71) Enum.valueOf(A71.class, str);
    }

    public static A71[] values() {
        return (A71[]) E.clone();
    }
}
