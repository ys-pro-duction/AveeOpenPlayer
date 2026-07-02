package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.kW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC5970kW0 {
    public static final EnumC5970kW0 B = new EnumC5970kW0("BEGINNING", 0);
    public static final EnumC5970kW0 C = new EnumC5970kW0("MIDDLE", 1);
    public static final EnumC5970kW0 D = new EnumC5970kW0("AFTER_DOT", 2);
    public static final /* synthetic */ EnumC5970kW0[] E;
    public static final /* synthetic */ YG F;

    static {
        EnumC5970kW0[] enumC5970kW0ArrA = a();
        E = enumC5970kW0ArrA;
        F = AbstractC3110aH.a(enumC5970kW0ArrA);
    }

    public EnumC5970kW0(String str, int i) {
    }

    public static final /* synthetic */ EnumC5970kW0[] a() {
        return new EnumC5970kW0[]{B, C, D};
    }

    public static EnumC5970kW0 valueOf(String str) {
        return (EnumC5970kW0) Enum.valueOf(EnumC5970kW0.class, str);
    }

    public static EnumC5970kW0[] values() {
        return (EnumC5970kW0[]) E.clone();
    }
}
