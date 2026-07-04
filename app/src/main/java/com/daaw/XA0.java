package com.daaw;

import com.daaw.InterfaceC1583Mi;

/* JADX INFO: loaded from: classes4.dex */
public abstract class XA0 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[DA0.values().length];
            try {
                iArr[DA0.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DA0.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DA0.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DA0.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
            int[] iArr2 = new int[InterfaceC1583Mi.a.values().length];
            try {
                iArr2[InterfaceC1583Mi.a.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InterfaceC1583Mi.a.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InterfaceC1583Mi.a.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InterfaceC1583Mi.a.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
            int[] iArr3 = new int[RA0.values().length];
            try {
                iArr3[RA0.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[RA0.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[RA0.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[RA0.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[RA0.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[RA0.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            c = iArr3;
        }
    }

    public static final AbstractC8965vA a(WA0 wa0, RA0 ra0) {
        G10.g(wa0, "<this>");
        switch (ra0 == null ? -1 : a.c[ra0.ordinal()]) {
            case 1:
                AbstractC8965vA abstractC8965vA = AbstractC8679uA.d;
                G10.f(abstractC8965vA, "INTERNAL");
                return abstractC8965vA;
            case 2:
                AbstractC8965vA abstractC8965vA2 = AbstractC8679uA.a;
                G10.f(abstractC8965vA2, "PRIVATE");
                return abstractC8965vA2;
            case 3:
                AbstractC8965vA abstractC8965vA3 = AbstractC8679uA.b;
                G10.f(abstractC8965vA3, "PRIVATE_TO_THIS");
                return abstractC8965vA3;
            case 4:
                AbstractC8965vA abstractC8965vA4 = AbstractC8679uA.c;
                G10.f(abstractC8965vA4, "PROTECTED");
                return abstractC8965vA4;
            case 5:
                AbstractC8965vA abstractC8965vA5 = AbstractC8679uA.e;
                G10.f(abstractC8965vA5, "PUBLIC");
                return abstractC8965vA5;
            case 6:
                AbstractC8965vA abstractC8965vA6 = AbstractC8679uA.f;
                G10.f(abstractC8965vA6, "LOCAL");
                return abstractC8965vA6;
            default:
                AbstractC8965vA abstractC8965vA7 = AbstractC8679uA.a;
                G10.f(abstractC8965vA7, "PRIVATE");
                return abstractC8965vA7;
        }
    }

    public static final InterfaceC1583Mi.a b(WA0 wa0, DA0 da0) {
        G10.g(wa0, "<this>");
        int i = da0 == null ? -1 : a.a[da0.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? InterfaceC1583Mi.a.DECLARATION : InterfaceC1583Mi.a.SYNTHESIZED : InterfaceC1583Mi.a.DELEGATION : InterfaceC1583Mi.a.FAKE_OVERRIDE : InterfaceC1583Mi.a.DECLARATION;
    }
}
