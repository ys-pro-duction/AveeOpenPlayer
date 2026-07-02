package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.rt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC8041rt {
    public static final EnumC8041rt B = new EnumC8041rt("COROUTINE_SUSPENDED", 0);
    public static final EnumC8041rt C = new EnumC8041rt("UNDECIDED", 1);
    public static final EnumC8041rt D = new EnumC8041rt("RESUMED", 2);
    public static final /* synthetic */ EnumC8041rt[] E;
    public static final /* synthetic */ YG F;

    static {
        EnumC8041rt[] enumC8041rtArrA = a();
        E = enumC8041rtArrA;
        F = AbstractC3110aH.a(enumC8041rtArrA);
    }

    public EnumC8041rt(String str, int i) {
    }

    public static final /* synthetic */ EnumC8041rt[] a() {
        return new EnumC8041rt[]{B, C, D};
    }

    public static EnumC8041rt valueOf(String str) {
        return (EnumC8041rt) Enum.valueOf(EnumC8041rt.class, str);
    }

    public static EnumC8041rt[] values() {
        return (EnumC8041rt[]) E.clone();
    }
}
