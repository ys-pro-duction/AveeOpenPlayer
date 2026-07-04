package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.wz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC9468wz {
    public static final EnumC9468wz B = new EnumC9468wz("WARNING", 0);
    public static final EnumC9468wz C = new EnumC9468wz("ERROR", 1);
    public static final EnumC9468wz D = new EnumC9468wz("HIDDEN", 2);
    public static final /* synthetic */ EnumC9468wz[] E;
    public static final /* synthetic */ YG F;

    static {
        EnumC9468wz[] enumC9468wzArrA = a();
        E = enumC9468wzArrA;
        F = AbstractC3110aH.a(enumC9468wzArrA);
    }

    public EnumC9468wz(String str, int i) {
    }

    public static final /* synthetic */ EnumC9468wz[] a() {
        return new EnumC9468wz[]{B, C, D};
    }

    public static EnumC9468wz valueOf(String str) {
        return (EnumC9468wz) Enum.valueOf(EnumC9468wz.class, str);
    }

    public static EnumC9468wz[] values() {
        return (EnumC9468wz[]) E.clone();
    }
}
