package com.daaw;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'G' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.daaw.tK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC8440tK {
    public static final EnumC8440tK A0;
    public static final EnumC8440tK B0;
    public static final EnumC8440tK C0;
    public static final EnumC8440tK D0;
    public static final EnumC8440tK E0;
    public static final EnumC8440tK[] F0;
    public static final EnumC8440tK G;
    public static final Type[] G0;
    public static final EnumC8440tK H;
    public static final /* synthetic */ EnumC8440tK[] H0;
    public static final EnumC8440tK I;
    public static final EnumC8440tK J;
    public static final EnumC8440tK K;
    public static final EnumC8440tK L;
    public static final EnumC8440tK M;
    public static final EnumC8440tK N;
    public static final EnumC8440tK O;
    public static final EnumC8440tK P;
    public static final EnumC8440tK Q;
    public static final EnumC8440tK R;
    public static final EnumC8440tK S;
    public static final EnumC8440tK T;
    public static final EnumC8440tK U;
    public static final EnumC8440tK V;
    public static final EnumC8440tK W;
    public static final EnumC8440tK X;
    public static final EnumC8440tK Y;
    public static final EnumC8440tK Z;
    public static final EnumC8440tK a0;
    public static final EnumC8440tK b0;
    public static final EnumC8440tK c0;
    public static final EnumC8440tK d0;
    public static final EnumC8440tK e0;
    public static final EnumC8440tK f0;
    public static final EnumC8440tK g0;
    public static final EnumC8440tK h0;
    public static final EnumC8440tK i0;
    public static final EnumC8440tK j0;
    public static final EnumC8440tK k0;
    public static final EnumC8440tK l0;
    public static final EnumC8440tK m0;
    public static final EnumC8440tK n0;
    public static final EnumC8440tK o0;
    public static final EnumC8440tK p0;
    public static final EnumC8440tK q0;
    public static final EnumC8440tK r0;
    public static final EnumC8440tK s0;
    public static final EnumC8440tK t0;
    public static final EnumC8440tK u0;
    public static final EnumC8440tK v0;
    public static final EnumC8440tK w0;
    public static final EnumC8440tK x0;
    public static final EnumC8440tK y0;
    public static final EnumC8440tK z0;
    public final A30 B;
    public final int C;
    public final b D;
    public final Class E;
    public final boolean F;

    /* JADX INFO: renamed from: com.daaw.tK$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[A30.values().length];
            b = iArr;
            try {
                iArr[A30.L.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[A30.N.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[A30.K.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.tK$b */
    public enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        public final boolean B;

        b(boolean z) {
            this.B = z;
        }
    }

    static {
        b bVar = b.SCALAR;
        A30 a30 = A30.I;
        EnumC8440tK enumC8440tK = new EnumC8440tK("DOUBLE", 0, 0, bVar, a30);
        G = enumC8440tK;
        A30 a302 = A30.H;
        EnumC8440tK enumC8440tK2 = new EnumC8440tK("FLOAT", 1, 1, bVar, a302);
        H = enumC8440tK2;
        A30 a303 = A30.G;
        EnumC8440tK enumC8440tK3 = new EnumC8440tK("INT64", 2, 2, bVar, a303);
        I = enumC8440tK3;
        EnumC8440tK enumC8440tK4 = new EnumC8440tK("UINT64", 3, 3, bVar, a303);
        J = enumC8440tK4;
        A30 a304 = A30.F;
        EnumC8440tK enumC8440tK5 = new EnumC8440tK("INT32", 4, 4, bVar, a304);
        K = enumC8440tK5;
        EnumC8440tK enumC8440tK6 = new EnumC8440tK("FIXED64", 5, 5, bVar, a303);
        L = enumC8440tK6;
        EnumC8440tK enumC8440tK7 = new EnumC8440tK("FIXED32", 6, 6, bVar, a304);
        M = enumC8440tK7;
        A30 a305 = A30.J;
        EnumC8440tK enumC8440tK8 = new EnumC8440tK("BOOL", 7, 7, bVar, a305);
        N = enumC8440tK8;
        A30 a306 = A30.K;
        EnumC8440tK enumC8440tK9 = new EnumC8440tK("STRING", 8, 8, bVar, a306);
        O = enumC8440tK9;
        A30 a307 = A30.N;
        EnumC8440tK enumC8440tK10 = new EnumC8440tK("MESSAGE", 9, 9, bVar, a307);
        P = enumC8440tK10;
        A30 a308 = A30.L;
        EnumC8440tK enumC8440tK11 = new EnumC8440tK("BYTES", 10, 10, bVar, a308);
        Q = enumC8440tK11;
        EnumC8440tK enumC8440tK12 = new EnumC8440tK("UINT32", 11, 11, bVar, a304);
        R = enumC8440tK12;
        A30 a309 = A30.M;
        EnumC8440tK enumC8440tK13 = new EnumC8440tK("ENUM", 12, 12, bVar, a309);
        S = enumC8440tK13;
        EnumC8440tK enumC8440tK14 = new EnumC8440tK("SFIXED32", 13, 13, bVar, a304);
        T = enumC8440tK14;
        EnumC8440tK enumC8440tK15 = new EnumC8440tK("SFIXED64", 14, 14, bVar, a303);
        U = enumC8440tK15;
        EnumC8440tK enumC8440tK16 = new EnumC8440tK("SINT32", 15, 15, bVar, a304);
        V = enumC8440tK16;
        EnumC8440tK enumC8440tK17 = new EnumC8440tK("SINT64", 16, 16, bVar, a303);
        W = enumC8440tK17;
        EnumC8440tK enumC8440tK18 = new EnumC8440tK("GROUP", 17, 17, bVar, a307);
        X = enumC8440tK18;
        b bVar2 = b.VECTOR;
        EnumC8440tK enumC8440tK19 = new EnumC8440tK("DOUBLE_LIST", 18, 18, bVar2, a30);
        Y = enumC8440tK19;
        EnumC8440tK enumC8440tK20 = new EnumC8440tK("FLOAT_LIST", 19, 19, bVar2, a302);
        Z = enumC8440tK20;
        EnumC8440tK enumC8440tK21 = new EnumC8440tK("INT64_LIST", 20, 20, bVar2, a303);
        a0 = enumC8440tK21;
        EnumC8440tK enumC8440tK22 = new EnumC8440tK("UINT64_LIST", 21, 21, bVar2, a303);
        b0 = enumC8440tK22;
        EnumC8440tK enumC8440tK23 = new EnumC8440tK("INT32_LIST", 22, 22, bVar2, a304);
        c0 = enumC8440tK23;
        EnumC8440tK enumC8440tK24 = new EnumC8440tK("FIXED64_LIST", 23, 23, bVar2, a303);
        d0 = enumC8440tK24;
        EnumC8440tK enumC8440tK25 = new EnumC8440tK("FIXED32_LIST", 24, 24, bVar2, a304);
        e0 = enumC8440tK25;
        EnumC8440tK enumC8440tK26 = new EnumC8440tK("BOOL_LIST", 25, 25, bVar2, a305);
        f0 = enumC8440tK26;
        EnumC8440tK enumC8440tK27 = new EnumC8440tK("STRING_LIST", 26, 26, bVar2, a306);
        g0 = enumC8440tK27;
        EnumC8440tK enumC8440tK28 = new EnumC8440tK("MESSAGE_LIST", 27, 27, bVar2, a307);
        h0 = enumC8440tK28;
        EnumC8440tK enumC8440tK29 = new EnumC8440tK("BYTES_LIST", 28, 28, bVar2, a308);
        i0 = enumC8440tK29;
        EnumC8440tK enumC8440tK30 = new EnumC8440tK("UINT32_LIST", 29, 29, bVar2, a304);
        j0 = enumC8440tK30;
        EnumC8440tK enumC8440tK31 = new EnumC8440tK("ENUM_LIST", 30, 30, bVar2, a309);
        k0 = enumC8440tK31;
        EnumC8440tK enumC8440tK32 = new EnumC8440tK("SFIXED32_LIST", 31, 31, bVar2, a304);
        l0 = enumC8440tK32;
        EnumC8440tK enumC8440tK33 = new EnumC8440tK("SFIXED64_LIST", 32, 32, bVar2, a303);
        m0 = enumC8440tK33;
        EnumC8440tK enumC8440tK34 = new EnumC8440tK("SINT32_LIST", 33, 33, bVar2, a304);
        n0 = enumC8440tK34;
        EnumC8440tK enumC8440tK35 = new EnumC8440tK("SINT64_LIST", 34, 34, bVar2, a303);
        o0 = enumC8440tK35;
        b bVar3 = b.PACKED_VECTOR;
        EnumC8440tK enumC8440tK36 = new EnumC8440tK("DOUBLE_LIST_PACKED", 35, 35, bVar3, a30);
        p0 = enumC8440tK36;
        EnumC8440tK enumC8440tK37 = new EnumC8440tK("FLOAT_LIST_PACKED", 36, 36, bVar3, a302);
        q0 = enumC8440tK37;
        EnumC8440tK enumC8440tK38 = new EnumC8440tK("INT64_LIST_PACKED", 37, 37, bVar3, a303);
        r0 = enumC8440tK38;
        EnumC8440tK enumC8440tK39 = new EnumC8440tK("UINT64_LIST_PACKED", 38, 38, bVar3, a303);
        s0 = enumC8440tK39;
        EnumC8440tK enumC8440tK40 = new EnumC8440tK("INT32_LIST_PACKED", 39, 39, bVar3, a304);
        t0 = enumC8440tK40;
        EnumC8440tK enumC8440tK41 = new EnumC8440tK("FIXED64_LIST_PACKED", 40, 40, bVar3, a303);
        u0 = enumC8440tK41;
        EnumC8440tK enumC8440tK42 = new EnumC8440tK("FIXED32_LIST_PACKED", 41, 41, bVar3, a304);
        v0 = enumC8440tK42;
        EnumC8440tK enumC8440tK43 = new EnumC8440tK("BOOL_LIST_PACKED", 42, 42, bVar3, a305);
        w0 = enumC8440tK43;
        EnumC8440tK enumC8440tK44 = new EnumC8440tK("UINT32_LIST_PACKED", 43, 43, bVar3, a304);
        x0 = enumC8440tK44;
        EnumC8440tK enumC8440tK45 = new EnumC8440tK("ENUM_LIST_PACKED", 44, 44, bVar3, a309);
        y0 = enumC8440tK45;
        EnumC8440tK enumC8440tK46 = new EnumC8440tK("SFIXED32_LIST_PACKED", 45, 45, bVar3, a304);
        z0 = enumC8440tK46;
        EnumC8440tK enumC8440tK47 = new EnumC8440tK("SFIXED64_LIST_PACKED", 46, 46, bVar3, a303);
        A0 = enumC8440tK47;
        EnumC8440tK enumC8440tK48 = new EnumC8440tK("SINT32_LIST_PACKED", 47, 47, bVar3, a304);
        B0 = enumC8440tK48;
        EnumC8440tK enumC8440tK49 = new EnumC8440tK("SINT64_LIST_PACKED", 48, 48, bVar3, a303);
        C0 = enumC8440tK49;
        EnumC8440tK enumC8440tK50 = new EnumC8440tK("GROUP_LIST", 49, 49, bVar2, a307);
        D0 = enumC8440tK50;
        EnumC8440tK enumC8440tK51 = new EnumC8440tK("MAP", 50, 50, b.MAP, A30.E);
        E0 = enumC8440tK51;
        H0 = new EnumC8440tK[]{enumC8440tK, enumC8440tK2, enumC8440tK3, enumC8440tK4, enumC8440tK5, enumC8440tK6, enumC8440tK7, enumC8440tK8, enumC8440tK9, enumC8440tK10, enumC8440tK11, enumC8440tK12, enumC8440tK13, enumC8440tK14, enumC8440tK15, enumC8440tK16, enumC8440tK17, enumC8440tK18, enumC8440tK19, enumC8440tK20, enumC8440tK21, enumC8440tK22, enumC8440tK23, enumC8440tK24, enumC8440tK25, enumC8440tK26, enumC8440tK27, enumC8440tK28, enumC8440tK29, enumC8440tK30, enumC8440tK31, enumC8440tK32, enumC8440tK33, enumC8440tK34, enumC8440tK35, enumC8440tK36, enumC8440tK37, enumC8440tK38, enumC8440tK39, enumC8440tK40, enumC8440tK41, enumC8440tK42, enumC8440tK43, enumC8440tK44, enumC8440tK45, enumC8440tK46, enumC8440tK47, enumC8440tK48, enumC8440tK49, enumC8440tK50, enumC8440tK51};
        G0 = new Type[0];
        EnumC8440tK[] enumC8440tKArrValues = values();
        F0 = new EnumC8440tK[enumC8440tKArrValues.length];
        for (EnumC8440tK enumC8440tK52 : enumC8440tKArrValues) {
            F0[enumC8440tK52.C] = enumC8440tK52;
        }
    }

    public EnumC8440tK(String str, int i, int i2, b bVar, A30 a30) {
        int i3;
        this.C = i2;
        this.D = bVar;
        this.B = a30;
        int i4 = a.a[bVar.ordinal()];
        if (i4 == 1 || i4 == 2) {
            this.E = a30.a();
        } else {
            this.E = null;
        }
        this.F = (bVar != b.SCALAR || (i3 = a.b[a30.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : true;
    }

    public static EnumC8440tK valueOf(String str) {
        return (EnumC8440tK) Enum.valueOf(EnumC8440tK.class, str);
    }

    public static EnumC8440tK[] values() {
        return (EnumC8440tK[]) H0.clone();
    }

    public int a() {
        return this.C;
    }
}
