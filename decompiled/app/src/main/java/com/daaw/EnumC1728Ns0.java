package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.Ns0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1728Ns0 {
    public static final EnumC1728Ns0 B = new EnumC1728Ns0("ALL", 0);
    public static final EnumC1728Ns0 C = new EnumC1728Ns0("ONLY_NON_SYNTHESIZED", 1);
    public static final EnumC1728Ns0 D = new EnumC1728Ns0("NONE", 2);
    public static final /* synthetic */ EnumC1728Ns0[] E;
    public static final /* synthetic */ YG F;

    static {
        EnumC1728Ns0[] enumC1728Ns0ArrA = a();
        E = enumC1728Ns0ArrA;
        F = AbstractC3110aH.a(enumC1728Ns0ArrA);
    }

    public EnumC1728Ns0(String str, int i) {
    }

    public static final /* synthetic */ EnumC1728Ns0[] a() {
        return new EnumC1728Ns0[]{B, C, D};
    }

    public static EnumC1728Ns0 valueOf(String str) {
        return (EnumC1728Ns0) Enum.valueOf(EnumC1728Ns0.class, str);
    }

    public static EnumC1728Ns0[] values() {
        return (EnumC1728Ns0[]) E.clone();
    }
}
