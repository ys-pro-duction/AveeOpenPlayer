package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class S7 {
    public static final S7 C = new S7("METHOD_RETURN_TYPE", 0, "METHOD");
    public static final S7 D = new S7("VALUE_PARAMETER", 1, "PARAMETER");
    public static final S7 E = new S7("FIELD", 2, "FIELD");
    public static final S7 F = new S7("TYPE_USE", 3, "TYPE_USE");
    public static final S7 G = new S7("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");
    public static final S7 H = new S7("TYPE_PARAMETER", 5, "TYPE_PARAMETER");
    public static final /* synthetic */ S7[] I;
    public static final /* synthetic */ YG J;
    public final String B;

    static {
        S7[] s7ArrA = a();
        I = s7ArrA;
        J = AbstractC3110aH.a(s7ArrA);
    }

    public S7(String str, int i, String str2) {
        this.B = str2;
    }

    public static final /* synthetic */ S7[] a() {
        return new S7[]{C, D, E, F, G, H};
    }

    public static S7 valueOf(String str) {
        return (S7) Enum.valueOf(S7.class, str);
    }

    public static S7[] values() {
        return (S7[]) I.clone();
    }

    public final String c() {
        return this.B;
    }
}
