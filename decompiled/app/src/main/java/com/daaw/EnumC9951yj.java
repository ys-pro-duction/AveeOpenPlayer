package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.yj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC9951yj {
    public static final EnumC9951yj B = new EnumC9951yj("FOR_SUBTYPING", 0);
    public static final EnumC9951yj C = new EnumC9951yj("FOR_INCORPORATION", 1);
    public static final EnumC9951yj D = new EnumC9951yj("FROM_EXPRESSION", 2);
    public static final /* synthetic */ EnumC9951yj[] E;
    public static final /* synthetic */ YG F;

    static {
        EnumC9951yj[] enumC9951yjArrA = a();
        E = enumC9951yjArrA;
        F = AbstractC3110aH.a(enumC9951yjArrA);
    }

    public EnumC9951yj(String str, int i) {
    }

    public static final /* synthetic */ EnumC9951yj[] a() {
        return new EnumC9951yj[]{B, C, D};
    }

    public static EnumC9951yj valueOf(String str) {
        return (EnumC9951yj) Enum.valueOf(EnumC9951yj.class, str);
    }

    public static EnumC9951yj[] values() {
        return (EnumC9951yj[]) E.clone();
    }
}
