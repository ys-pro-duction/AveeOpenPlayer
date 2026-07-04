package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.Ak0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC0336Ak0 {
    public static final a B;
    public static final EnumC0336Ak0 C = new EnumC0336Ak0("FINAL", 0);
    public static final EnumC0336Ak0 D = new EnumC0336Ak0("SEALED", 1);
    public static final EnumC0336Ak0 E = new EnumC0336Ak0("OPEN", 2);
    public static final EnumC0336Ak0 F = new EnumC0336Ak0("ABSTRACT", 3);
    public static final /* synthetic */ EnumC0336Ak0[] G;
    public static final /* synthetic */ YG H;

    /* JADX INFO: renamed from: com.daaw.Ak0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final EnumC0336Ak0 a(boolean z, boolean z2, boolean z3) {
            return z ? EnumC0336Ak0.D : z2 ? EnumC0336Ak0.F : z3 ? EnumC0336Ak0.E : EnumC0336Ak0.C;
        }

        public a() {
        }
    }

    static {
        EnumC0336Ak0[] enumC0336Ak0ArrA = a();
        G = enumC0336Ak0ArrA;
        H = AbstractC3110aH.a(enumC0336Ak0ArrA);
        B = new a(null);
    }

    public EnumC0336Ak0(String str, int i) {
    }

    public static final /* synthetic */ EnumC0336Ak0[] a() {
        return new EnumC0336Ak0[]{C, D, E, F};
    }

    public static EnumC0336Ak0 valueOf(String str) {
        return (EnumC0336Ak0) Enum.valueOf(EnumC0336Ak0.class, str);
    }

    public static EnumC0336Ak0[] values() {
        return (EnumC0336Ak0[]) G.clone();
    }
}
