package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.e80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC4187e80 {
    public static final EnumC4187e80 B = new EnumC4187e80("Singleton", 0);
    public static final EnumC4187e80 C = new EnumC4187e80("Factory", 1);
    public static final EnumC4187e80 D = new EnumC4187e80("Scoped", 2);
    public static final /* synthetic */ EnumC4187e80[] E;
    public static final /* synthetic */ YG F;

    static {
        EnumC4187e80[] enumC4187e80ArrA = a();
        E = enumC4187e80ArrA;
        F = AbstractC3110aH.a(enumC4187e80ArrA);
    }

    public EnumC4187e80(String str, int i) {
    }

    public static final /* synthetic */ EnumC4187e80[] a() {
        return new EnumC4187e80[]{B, C, D};
    }

    public static EnumC4187e80 valueOf(String str) {
        return (EnumC4187e80) Enum.valueOf(EnumC4187e80.class, str);
    }

    public static EnumC4187e80[] values() {
        return (EnumC4187e80[]) E.clone();
    }
}
