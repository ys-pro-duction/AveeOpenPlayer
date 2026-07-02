package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.yb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC9912yb0 {
    public static final EnumC9912yb0 B = new EnumC9912yb0("DEBUG", 0);
    public static final EnumC9912yb0 C = new EnumC9912yb0("INFO", 1);
    public static final EnumC9912yb0 D = new EnumC9912yb0("WARNING", 2);
    public static final EnumC9912yb0 E = new EnumC9912yb0("ERROR", 3);
    public static final EnumC9912yb0 F = new EnumC9912yb0("NONE", 4);
    public static final /* synthetic */ EnumC9912yb0[] G;
    public static final /* synthetic */ YG H;

    static {
        EnumC9912yb0[] enumC9912yb0ArrA = a();
        G = enumC9912yb0ArrA;
        H = AbstractC3110aH.a(enumC9912yb0ArrA);
    }

    public EnumC9912yb0(String str, int i) {
    }

    public static final /* synthetic */ EnumC9912yb0[] a() {
        return new EnumC9912yb0[]{B, C, D, E, F};
    }

    public static EnumC9912yb0 valueOf(String str) {
        return (EnumC9912yb0) Enum.valueOf(EnumC9912yb0.class, str);
    }

    public static EnumC9912yb0[] values() {
        return (EnumC9912yb0[]) G.clone();
    }
}
