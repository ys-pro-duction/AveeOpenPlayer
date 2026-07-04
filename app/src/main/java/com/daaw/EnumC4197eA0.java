package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.eA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC4197eA0 {
    public static final EnumC4197eA0 B = new EnumC4197eA0("PRETTY", 0);
    public static final EnumC4197eA0 C = new EnumC4197eA0("DEBUG", 1);
    public static final EnumC4197eA0 D = new EnumC4197eA0("NONE", 2);
    public static final /* synthetic */ EnumC4197eA0[] E;
    public static final /* synthetic */ YG F;

    static {
        EnumC4197eA0[] enumC4197eA0ArrA = a();
        E = enumC4197eA0ArrA;
        F = AbstractC3110aH.a(enumC4197eA0ArrA);
    }

    public EnumC4197eA0(String str, int i) {
    }

    public static final /* synthetic */ EnumC4197eA0[] a() {
        return new EnumC4197eA0[]{B, C, D};
    }

    public static EnumC4197eA0 valueOf(String str) {
        return (EnumC4197eA0) Enum.valueOf(EnumC4197eA0.class, str);
    }

    public static EnumC4197eA0[] values() {
        return (EnumC4197eA0[]) E.clone();
    }
}
