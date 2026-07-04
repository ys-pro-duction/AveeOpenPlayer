package com.daaw;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'E' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class Z33 {
    public static final Z33 A0;
    public static final Z33 B0;
    public static final Z33 C0;
    public static final Z33[] D0;
    public static final Z33 E;
    public static final /* synthetic */ Z33[] E0;
    public static final Z33 F;
    public static final Z33 G;
    public static final Z33 H;
    public static final Z33 I;
    public static final Z33 J;
    public static final Z33 K;
    public static final Z33 L;
    public static final Z33 M;
    public static final Z33 N;
    public static final Z33 O;
    public static final Z33 P;
    public static final Z33 Q;
    public static final Z33 R;
    public static final Z33 S;
    public static final Z33 T;
    public static final Z33 U;
    public static final Z33 V;
    public static final Z33 W;
    public static final Z33 X;
    public static final Z33 Y;
    public static final Z33 Z;
    public static final Z33 a0;
    public static final Z33 b0;
    public static final Z33 c0;
    public static final Z33 d0;
    public static final Z33 e0;
    public static final Z33 f0;
    public static final Z33 g0;
    public static final Z33 h0;
    public static final Z33 i0;
    public static final Z33 j0;
    public static final Z33 k0;
    public static final Z33 l0;
    public static final Z33 m0;
    public static final Z33 n0;
    public static final Z33 o0;
    public static final Z33 p0;
    public static final Z33 q0;
    public static final Z33 r0;
    public static final Z33 s0;
    public static final Z33 t0;
    public static final Z33 u0;
    public static final Z33 v0;
    public static final Z33 w0;
    public static final Z33 x0;
    public static final Z33 y0;
    public static final Z33 z0;
    public final EnumC9497x43 B;
    public final int C;
    public final Class D;

    static {
        EnumC9497x43 enumC9497x43 = EnumC9497x43.I;
        Z33 z33 = new Z33("DOUBLE", 0, 0, 1, enumC9497x43);
        E = z33;
        EnumC9497x43 enumC9497x432 = EnumC9497x43.H;
        Z33 z332 = new Z33("FLOAT", 1, 1, 1, enumC9497x432);
        F = z332;
        EnumC9497x43 enumC9497x433 = EnumC9497x43.G;
        Z33 z333 = new Z33("INT64", 2, 2, 1, enumC9497x433);
        G = z333;
        Z33 z334 = new Z33("UINT64", 3, 3, 1, enumC9497x433);
        H = z334;
        EnumC9497x43 enumC9497x434 = EnumC9497x43.F;
        Z33 z335 = new Z33("INT32", 4, 4, 1, enumC9497x434);
        I = z335;
        Z33 z336 = new Z33("FIXED64", 5, 5, 1, enumC9497x433);
        J = z336;
        Z33 z337 = new Z33("FIXED32", 6, 6, 1, enumC9497x434);
        K = z337;
        EnumC9497x43 enumC9497x435 = EnumC9497x43.J;
        Z33 z338 = new Z33("BOOL", 7, 7, 1, enumC9497x435);
        L = z338;
        EnumC9497x43 enumC9497x436 = EnumC9497x43.K;
        Z33 z339 = new Z33("STRING", 8, 8, 1, enumC9497x436);
        M = z339;
        EnumC9497x43 enumC9497x437 = EnumC9497x43.N;
        Z33 z3310 = new Z33("MESSAGE", 9, 9, 1, enumC9497x437);
        N = z3310;
        EnumC9497x43 enumC9497x438 = EnumC9497x43.L;
        Z33 z3311 = new Z33("BYTES", 10, 10, 1, enumC9497x438);
        O = z3311;
        Z33 z3312 = new Z33("UINT32", 11, 11, 1, enumC9497x434);
        P = z3312;
        EnumC9497x43 enumC9497x439 = EnumC9497x43.M;
        Z33 z3313 = new Z33("ENUM", 12, 12, 1, enumC9497x439);
        Q = z3313;
        Z33 z3314 = new Z33("SFIXED32", 13, 13, 1, enumC9497x434);
        R = z3314;
        Z33 z3315 = new Z33("SFIXED64", 14, 14, 1, enumC9497x433);
        S = z3315;
        Z33 z3316 = new Z33("SINT32", 15, 15, 1, enumC9497x434);
        T = z3316;
        Z33 z3317 = new Z33("SINT64", 16, 16, 1, enumC9497x433);
        U = z3317;
        Z33 z3318 = new Z33("GROUP", 17, 17, 1, enumC9497x437);
        V = z3318;
        Z33 z3319 = new Z33("DOUBLE_LIST", 18, 18, 2, enumC9497x43);
        W = z3319;
        Z33 z3320 = new Z33("FLOAT_LIST", 19, 19, 2, enumC9497x432);
        X = z3320;
        Z33 z3321 = new Z33("INT64_LIST", 20, 20, 2, enumC9497x433);
        Y = z3321;
        Z33 z3322 = new Z33("UINT64_LIST", 21, 21, 2, enumC9497x433);
        Z = z3322;
        Z33 z3323 = new Z33("INT32_LIST", 22, 22, 2, enumC9497x434);
        a0 = z3323;
        Z33 z3324 = new Z33("FIXED64_LIST", 23, 23, 2, enumC9497x433);
        b0 = z3324;
        Z33 z3325 = new Z33("FIXED32_LIST", 24, 24, 2, enumC9497x434);
        c0 = z3325;
        Z33 z3326 = new Z33("BOOL_LIST", 25, 25, 2, enumC9497x435);
        d0 = z3326;
        Z33 z3327 = new Z33("STRING_LIST", 26, 26, 2, enumC9497x436);
        e0 = z3327;
        Z33 z3328 = new Z33("MESSAGE_LIST", 27, 27, 2, enumC9497x437);
        f0 = z3328;
        Z33 z3329 = new Z33("BYTES_LIST", 28, 28, 2, enumC9497x438);
        g0 = z3329;
        Z33 z3330 = new Z33("UINT32_LIST", 29, 29, 2, enumC9497x434);
        h0 = z3330;
        Z33 z3331 = new Z33("ENUM_LIST", 30, 30, 2, enumC9497x439);
        i0 = z3331;
        Z33 z3332 = new Z33("SFIXED32_LIST", 31, 31, 2, enumC9497x434);
        j0 = z3332;
        Z33 z3333 = new Z33("SFIXED64_LIST", 32, 32, 2, enumC9497x433);
        k0 = z3333;
        Z33 z3334 = new Z33("SINT32_LIST", 33, 33, 2, enumC9497x434);
        l0 = z3334;
        Z33 z3335 = new Z33("SINT64_LIST", 34, 34, 2, enumC9497x433);
        m0 = z3335;
        Z33 z3336 = new Z33("DOUBLE_LIST_PACKED", 35, 35, 3, enumC9497x43);
        n0 = z3336;
        Z33 z3337 = new Z33("FLOAT_LIST_PACKED", 36, 36, 3, enumC9497x432);
        o0 = z3337;
        Z33 z3338 = new Z33("INT64_LIST_PACKED", 37, 37, 3, enumC9497x433);
        p0 = z3338;
        Z33 z3339 = new Z33("UINT64_LIST_PACKED", 38, 38, 3, enumC9497x433);
        q0 = z3339;
        Z33 z3340 = new Z33("INT32_LIST_PACKED", 39, 39, 3, enumC9497x434);
        r0 = z3340;
        Z33 z3341 = new Z33("FIXED64_LIST_PACKED", 40, 40, 3, enumC9497x433);
        s0 = z3341;
        Z33 z3342 = new Z33("FIXED32_LIST_PACKED", 41, 41, 3, enumC9497x434);
        t0 = z3342;
        Z33 z3343 = new Z33("BOOL_LIST_PACKED", 42, 42, 3, enumC9497x435);
        u0 = z3343;
        Z33 z3344 = new Z33("UINT32_LIST_PACKED", 43, 43, 3, enumC9497x434);
        v0 = z3344;
        Z33 z3345 = new Z33("ENUM_LIST_PACKED", 44, 44, 3, enumC9497x439);
        w0 = z3345;
        Z33 z3346 = new Z33("SFIXED32_LIST_PACKED", 45, 45, 3, enumC9497x434);
        x0 = z3346;
        Z33 z3347 = new Z33("SFIXED64_LIST_PACKED", 46, 46, 3, enumC9497x433);
        y0 = z3347;
        Z33 z3348 = new Z33("SINT32_LIST_PACKED", 47, 47, 3, enumC9497x434);
        z0 = z3348;
        Z33 z3349 = new Z33("SINT64_LIST_PACKED", 48, 48, 3, enumC9497x433);
        A0 = z3349;
        Z33 z3350 = new Z33("GROUP_LIST", 49, 49, 2, enumC9497x437);
        B0 = z3350;
        Z33 z3351 = new Z33("MAP", 50, 50, 4, EnumC9497x43.E);
        C0 = z3351;
        E0 = new Z33[]{z33, z332, z333, z334, z335, z336, z337, z338, z339, z3310, z3311, z3312, z3313, z3314, z3315, z3316, z3317, z3318, z3319, z3320, z3321, z3322, z3323, z3324, z3325, z3326, z3327, z3328, z3329, z3330, z3331, z3332, z3333, z3334, z3335, z3336, z3337, z3338, z3339, z3340, z3341, z3342, z3343, z3344, z3345, z3346, z3347, z3348, z3349, z3350, z3351};
        Z33[] z33ArrValues = values();
        D0 = new Z33[z33ArrValues.length];
        for (Z33 z3352 : z33ArrValues) {
            D0[z3352.C] = z3352;
        }
    }

    public Z33(String str, int i, int i2, int i3, EnumC9497x43 enumC9497x43) {
        this.C = i2;
        this.B = enumC9497x43;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            this.D = enumC9497x43.a();
        } else {
            this.D = null;
        }
        if (i3 == 1) {
            EnumC9497x43 enumC9497x432 = EnumC9497x43.E;
            enumC9497x43.ordinal();
        }
    }

    public static Z33[] values() {
        return (Z33[]) E0.clone();
    }

    public final int zza() {
        return this.C;
    }
}
