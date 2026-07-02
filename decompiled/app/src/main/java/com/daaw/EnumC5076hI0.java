package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.hI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC5076hI0 {
    public static final a C;
    public static final EnumC5076hI0 D = new EnumC5076hI0("IGNORE", 0, "ignore");
    public static final EnumC5076hI0 E = new EnumC5076hI0("WARN", 1, "warn");
    public static final EnumC5076hI0 F = new EnumC5076hI0("STRICT", 2, "strict");
    public static final /* synthetic */ EnumC5076hI0[] G;
    public static final /* synthetic */ YG H;
    public final String B;

    /* JADX INFO: renamed from: com.daaw.hI0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    static {
        EnumC5076hI0[] enumC5076hI0ArrA = a();
        G = enumC5076hI0ArrA;
        H = AbstractC3110aH.a(enumC5076hI0ArrA);
        C = new a(null);
    }

    public EnumC5076hI0(String str, int i, String str2) {
        this.B = str2;
    }

    public static final /* synthetic */ EnumC5076hI0[] a() {
        return new EnumC5076hI0[]{D, E, F};
    }

    public static EnumC5076hI0 valueOf(String str) {
        return (EnumC5076hI0) Enum.valueOf(EnumC5076hI0.class, str);
    }

    public static EnumC5076hI0[] values() {
        return (EnumC5076hI0[]) G.clone();
    }

    public final String c() {
        return this.B;
    }

    public final boolean g() {
        return this == D;
    }

    public final boolean h() {
        return this == E;
    }
}
