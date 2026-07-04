package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.Tb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2308Tb0 {
    public static final EnumC2308Tb0 B = new EnumC2308Tb0("SOURCE", 0);
    public static final EnumC2308Tb0 C = new EnumC2308Tb0("BINARY", 1);
    public static final /* synthetic */ EnumC2308Tb0[] D;
    public static final /* synthetic */ YG E;

    static {
        EnumC2308Tb0[] enumC2308Tb0ArrA = a();
        D = enumC2308Tb0ArrA;
        E = AbstractC3110aH.a(enumC2308Tb0ArrA);
    }

    public EnumC2308Tb0(String str, int i) {
    }

    public static final /* synthetic */ EnumC2308Tb0[] a() {
        return new EnumC2308Tb0[]{B, C};
    }

    public static EnumC2308Tb0 valueOf(String str) {
        return (EnumC2308Tb0) Enum.valueOf(EnumC2308Tb0.class, str);
    }

    public static EnumC2308Tb0[] values() {
        return (EnumC2308Tb0[]) D.clone();
    }
}
