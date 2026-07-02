package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.Hc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1042Hc1 {
    public static final EnumC1042Hc1 F = new EnumC1042Hc1("INVARIANT", 0, "", true, true, 0);
    public static final EnumC1042Hc1 G = new EnumC1042Hc1("IN_VARIANCE", 1, "in", true, false, -1);
    public static final EnumC1042Hc1 H = new EnumC1042Hc1("OUT_VARIANCE", 2, "out", false, true, 1);
    public static final /* synthetic */ EnumC1042Hc1[] I;
    public static final /* synthetic */ YG J;
    public final String B;
    public final boolean C;
    public final boolean D;
    public final int E;

    static {
        EnumC1042Hc1[] enumC1042Hc1ArrA = a();
        I = enumC1042Hc1ArrA;
        J = AbstractC3110aH.a(enumC1042Hc1ArrA);
    }

    public EnumC1042Hc1(String str, int i, String str2, boolean z, boolean z2, int i2) {
        this.B = str2;
        this.C = z;
        this.D = z2;
        this.E = i2;
    }

    public static final /* synthetic */ EnumC1042Hc1[] a() {
        return new EnumC1042Hc1[]{F, G, H};
    }

    public static EnumC1042Hc1 valueOf(String str) {
        return (EnumC1042Hc1) Enum.valueOf(EnumC1042Hc1.class, str);
    }

    public static EnumC1042Hc1[] values() {
        return (EnumC1042Hc1[]) I.clone();
    }

    public final boolean c() {
        return this.D;
    }

    public final String g() {
        return this.B;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.B;
    }
}
