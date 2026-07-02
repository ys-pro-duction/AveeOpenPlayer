package com.daaw;

import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.rz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC8067rz0 {
    public static final a F;
    public static final Set G;
    public static final EnumC8067rz0 H = new EnumC8067rz0("BOOLEAN", 0, "Boolean");
    public static final EnumC8067rz0 I;
    public static final EnumC8067rz0 J;
    public static final EnumC8067rz0 K;
    public static final EnumC8067rz0 L;
    public static final EnumC8067rz0 M;
    public static final EnumC8067rz0 N;
    public static final EnumC8067rz0 O;
    public static final /* synthetic */ EnumC8067rz0[] P;
    public static final /* synthetic */ YG Q;
    public final C2352Tm0 B;
    public final C2352Tm0 C;
    public final O90 D;
    public final O90 E;

    /* JADX INFO: renamed from: com.daaw.rz0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    static {
        EnumC8067rz0 enumC8067rz0 = new EnumC8067rz0("CHAR", 1, "Char");
        I = enumC8067rz0;
        EnumC8067rz0 enumC8067rz02 = new EnumC8067rz0("BYTE", 2, "Byte");
        J = enumC8067rz02;
        EnumC8067rz0 enumC8067rz03 = new EnumC8067rz0("SHORT", 3, "Short");
        K = enumC8067rz03;
        EnumC8067rz0 enumC8067rz04 = new EnumC8067rz0("INT", 4, "Int");
        L = enumC8067rz04;
        EnumC8067rz0 enumC8067rz05 = new EnumC8067rz0("FLOAT", 5, "Float");
        M = enumC8067rz05;
        EnumC8067rz0 enumC8067rz06 = new EnumC8067rz0("LONG", 6, "Long");
        N = enumC8067rz06;
        EnumC8067rz0 enumC8067rz07 = new EnumC8067rz0("DOUBLE", 7, "Double");
        O = enumC8067rz07;
        EnumC8067rz0[] enumC8067rz0ArrA = a();
        P = enumC8067rz0ArrA;
        Q = AbstractC3110aH.a(enumC8067rz0ArrA);
        F = new a(null);
        G = AbstractC9867yQ0.g(enumC8067rz0, enumC8067rz02, enumC8067rz03, enumC8067rz04, enumC8067rz05, enumC8067rz06, enumC8067rz07);
    }

    public EnumC8067rz0(String str, int i, String str2) {
        C2352Tm0 c2352Tm0L = C2352Tm0.l(str2);
        G10.f(c2352Tm0L, "identifier(...)");
        this.B = c2352Tm0L;
        C2352Tm0 c2352Tm0L2 = C2352Tm0.l(str2 + "Array");
        G10.f(c2352Tm0L2, "identifier(...)");
        this.C = c2352Tm0L2;
        EnumC7395pb0 enumC7395pb0 = EnumC7395pb0.C;
        this.D = AbstractC3192ab0.b(enumC7395pb0, new C7510pz0(this));
        this.E = AbstractC3192ab0.b(enumC7395pb0, new C7789qz0(this));
    }

    public static final /* synthetic */ EnumC8067rz0[] a() {
        return new EnumC8067rz0[]{H, I, J, K, L, M, N, O};
    }

    public static final AP h(EnumC8067rz0 enumC8067rz0) {
        G10.g(enumC8067rz0, "this$0");
        return YV0.A.c(enumC8067rz0.C);
    }

    public static final AP q(EnumC8067rz0 enumC8067rz0) {
        G10.g(enumC8067rz0, "this$0");
        return YV0.A.c(enumC8067rz0.B);
    }

    public static EnumC8067rz0 valueOf(String str) {
        return (EnumC8067rz0) Enum.valueOf(EnumC8067rz0.class, str);
    }

    public static EnumC8067rz0[] values() {
        return (EnumC8067rz0[]) P.clone();
    }

    public final AP k() {
        Object value = this.E.getValue();
        G10.f(value, "getValue(...)");
        return (AP) value;
    }

    public final C2352Tm0 l() {
        return this.C;
    }

    public final AP n() {
        Object value = this.D.getValue();
        G10.f(value, "getValue(...)");
        return (AP) value;
    }

    public final C2352Tm0 o() {
        return this.B;
    }
}
