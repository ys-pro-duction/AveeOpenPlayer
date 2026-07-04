package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.Cr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC0572Cr0 {
    public static final EnumC0572Cr0 B = new EnumC0572Cr0("RENDER_OVERRIDE", 0);
    public static final EnumC0572Cr0 C = new EnumC0572Cr0("RENDER_OPEN", 1);
    public static final EnumC0572Cr0 D = new EnumC0572Cr0("RENDER_OPEN_OVERRIDE", 2);
    public static final /* synthetic */ EnumC0572Cr0[] E;
    public static final /* synthetic */ YG F;

    static {
        EnumC0572Cr0[] enumC0572Cr0ArrA = a();
        E = enumC0572Cr0ArrA;
        F = AbstractC3110aH.a(enumC0572Cr0ArrA);
    }

    public EnumC0572Cr0(String str, int i) {
    }

    public static final /* synthetic */ EnumC0572Cr0[] a() {
        return new EnumC0572Cr0[]{B, C, D};
    }

    public static EnumC0572Cr0 valueOf(String str) {
        return (EnumC0572Cr0) Enum.valueOf(EnumC0572Cr0.class, str);
    }

    public static EnumC0572Cr0[] values() {
        return (EnumC0572Cr0[]) E.clone();
    }
}
