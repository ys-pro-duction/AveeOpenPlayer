package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.pb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC7395pb0 {
    public static final EnumC7395pb0 B = new EnumC7395pb0("SYNCHRONIZED", 0);
    public static final EnumC7395pb0 C = new EnumC7395pb0("PUBLICATION", 1);
    public static final EnumC7395pb0 D = new EnumC7395pb0("NONE", 2);
    public static final /* synthetic */ EnumC7395pb0[] E;
    public static final /* synthetic */ YG F;

    static {
        EnumC7395pb0[] enumC7395pb0ArrA = a();
        E = enumC7395pb0ArrA;
        F = AbstractC3110aH.a(enumC7395pb0ArrA);
    }

    public EnumC7395pb0(String str, int i) {
    }

    public static final /* synthetic */ EnumC7395pb0[] a() {
        return new EnumC7395pb0[]{B, C, D};
    }

    public static EnumC7395pb0 valueOf(String str) {
        return (EnumC7395pb0) Enum.valueOf(EnumC7395pb0.class, str);
    }

    public static EnumC7395pb0[] values() {
        return (EnumC7395pb0[]) E.clone();
    }
}
