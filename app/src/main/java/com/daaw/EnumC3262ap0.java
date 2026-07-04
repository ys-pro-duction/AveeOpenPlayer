package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.ap0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC3262ap0 {
    public static final EnumC3262ap0 B = new EnumC3262ap0("FORCE_FLEXIBILITY", 0);
    public static final EnumC3262ap0 C = new EnumC3262ap0("NULLABLE", 1);
    public static final EnumC3262ap0 D = new EnumC3262ap0("NOT_NULL", 2);
    public static final /* synthetic */ EnumC3262ap0[] E;
    public static final /* synthetic */ YG F;

    static {
        EnumC3262ap0[] enumC3262ap0ArrA = a();
        E = enumC3262ap0ArrA;
        F = AbstractC3110aH.a(enumC3262ap0ArrA);
    }

    public EnumC3262ap0(String str, int i) {
    }

    public static final /* synthetic */ EnumC3262ap0[] a() {
        return new EnumC3262ap0[]{B, C, D};
    }

    public static EnumC3262ap0 valueOf(String str) {
        return (EnumC3262ap0) Enum.valueOf(EnumC3262ap0.class, str);
    }

    public static EnumC3262ap0[] values() {
        return (EnumC3262ap0[]) E.clone();
    }
}
