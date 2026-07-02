package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class E70 {
    public static final E70 B = new E70("PUBLIC", 0);
    public static final E70 C = new E70("PROTECTED", 1);
    public static final E70 D = new E70("INTERNAL", 2);
    public static final E70 E = new E70("PRIVATE", 3);
    public static final /* synthetic */ E70[] F;
    public static final /* synthetic */ YG G;

    static {
        E70[] e70ArrA = a();
        F = e70ArrA;
        G = AbstractC3110aH.a(e70ArrA);
    }

    public E70(String str, int i) {
    }

    public static final /* synthetic */ E70[] a() {
        return new E70[]{B, C, D, E};
    }

    public static E70 valueOf(String str) {
        return (E70) Enum.valueOf(E70.class, str);
    }

    public static E70[] values() {
        return (E70[]) F.clone();
    }
}
