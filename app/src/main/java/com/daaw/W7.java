package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class W7 {
    public static final W7 C = new W7("FIELD", 0, null, 1, null);
    public static final W7 D = new W7("FILE", 1, null, 1, null);
    public static final W7 E = new W7("PROPERTY", 2, null, 1, null);
    public static final W7 F = new W7("PROPERTY_GETTER", 3, "get");
    public static final W7 G = new W7("PROPERTY_SETTER", 4, "set");
    public static final W7 H = new W7("RECEIVER", 5, 0 == true ? 1 : 0, 1, null);
    public static final W7 I = new W7("CONSTRUCTOR_PARAMETER", 6, "param");
    public static final W7 J = new W7("SETTER_PARAMETER", 7, "setparam");
    public static final W7 K = new W7("PROPERTY_DELEGATE_FIELD", 8, "delegate");
    public static final /* synthetic */ W7[] L;
    public static final /* synthetic */ YG M;
    public final String B;

    static {
        W7[] w7ArrA = a();
        L = w7ArrA;
        M = AbstractC3110aH.a(w7ArrA);
    }

    public W7(String str, int i, String str2) {
        this.B = str2 == null ? AbstractC9393wj.f(name()) : str2;
    }

    public static final /* synthetic */ W7[] a() {
        return new W7[]{C, D, E, F, G, H, I, J, K};
    }

    public static W7 valueOf(String str) {
        return (W7) Enum.valueOf(W7.class, str);
    }

    public static W7[] values() {
        return (W7[]) L.clone();
    }

    public final String c() {
        return this.B;
    }

    public /* synthetic */ W7(String str, int i, String str2, int i2, AbstractC2911Yw abstractC2911Yw) {
        this(str, i, (i2 & 1) != 0 ? null : str2);
    }
}
