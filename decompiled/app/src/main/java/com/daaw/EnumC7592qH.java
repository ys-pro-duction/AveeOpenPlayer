package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.qH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC7592qH {
    public static final EnumC7592qH C = new EnumC7592qH("ERROR_CLASS", 0, "<Error class: %s>");
    public static final EnumC7592qH D = new EnumC7592qH("ERROR_FUNCTION", 1, "<Error function>");
    public static final EnumC7592qH E = new EnumC7592qH("ERROR_SCOPE", 2, "<Error scope>");
    public static final EnumC7592qH F = new EnumC7592qH("ERROR_MODULE", 3, "<Error module>");
    public static final EnumC7592qH G = new EnumC7592qH("ERROR_PROPERTY", 4, "<Error property>");
    public static final EnumC7592qH H = new EnumC7592qH("ERROR_TYPE", 5, "[Error type: %s]");
    public static final EnumC7592qH I = new EnumC7592qH("PARENT_OF_ERROR_SCOPE", 6, "<Fake parent for error lexical scope>");
    public static final /* synthetic */ EnumC7592qH[] J;
    public static final /* synthetic */ YG K;
    public final String B;

    static {
        EnumC7592qH[] enumC7592qHArrA = a();
        J = enumC7592qHArrA;
        K = AbstractC3110aH.a(enumC7592qHArrA);
    }

    public EnumC7592qH(String str, int i, String str2) {
        this.B = str2;
    }

    public static final /* synthetic */ EnumC7592qH[] a() {
        return new EnumC7592qH[]{C, D, E, F, G, H, I};
    }

    public static EnumC7592qH valueOf(String str) {
        return (EnumC7592qH) Enum.valueOf(EnumC7592qH.class, str);
    }

    public static EnumC7592qH[] values() {
        return (EnumC7592qH[]) J.clone();
    }

    public final String c() {
        return this.B;
    }
}
