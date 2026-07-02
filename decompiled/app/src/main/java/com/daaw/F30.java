package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class F30 {
    public static final F30 B = new F30("INFLEXIBLE", 0);
    public static final F30 C = new F30("FLEXIBLE_UPPER_BOUND", 1);
    public static final F30 D = new F30("FLEXIBLE_LOWER_BOUND", 2);
    public static final /* synthetic */ F30[] E;
    public static final /* synthetic */ YG F;

    static {
        F30[] f30ArrA = a();
        E = f30ArrA;
        F = AbstractC3110aH.a(f30ArrA);
    }

    public F30(String str, int i) {
    }

    public static final /* synthetic */ F30[] a() {
        return new F30[]{B, C, D};
    }

    public static F30 valueOf(String str) {
        return (F30) Enum.valueOf(F30.class, str);
    }

    public static F30[] values() {
        return (F30[]) E.clone();
    }
}
