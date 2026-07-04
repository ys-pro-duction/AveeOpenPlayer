package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class D70 {
    public static final D70 B = new D70("INVARIANT", 0);
    public static final D70 C = new D70("IN", 1);
    public static final D70 D = new D70("OUT", 2);
    public static final /* synthetic */ D70[] E;
    public static final /* synthetic */ YG F;

    static {
        D70[] d70ArrA = a();
        E = d70ArrA;
        F = AbstractC3110aH.a(d70ArrA);
    }

    public D70(String str, int i) {
    }

    public static final /* synthetic */ D70[] a() {
        return new D70[]{B, C, D};
    }

    public static D70 valueOf(String str) {
        return (D70) Enum.valueOf(D70.class, str);
    }

    public static D70[] values() {
        return (D70[]) E.clone();
    }
}
