package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.am0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC3247am0 {
    public static final EnumC3247am0 B = new EnumC3247am0("READ_ONLY", 0);
    public static final EnumC3247am0 C = new EnumC3247am0("MUTABLE", 1);
    public static final /* synthetic */ EnumC3247am0[] D;
    public static final /* synthetic */ YG E;

    static {
        EnumC3247am0[] enumC3247am0ArrA = a();
        D = enumC3247am0ArrA;
        E = AbstractC3110aH.a(enumC3247am0ArrA);
    }

    public EnumC3247am0(String str, int i) {
    }

    public static final /* synthetic */ EnumC3247am0[] a() {
        return new EnumC3247am0[]{B, C};
    }

    public static EnumC3247am0 valueOf(String str) {
        return (EnumC3247am0) Enum.valueOf(EnumC3247am0.class, str);
    }

    public static EnumC3247am0[] values() {
        return (EnumC3247am0[]) D.clone();
    }
}
