package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class N71 {
    public static final InterfaceC3072a8 a;
    public static final UG b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC3262ap0.values().length];
            try {
                iArr[EnumC3262ap0.C.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3262ap0.D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    static {
        AP ap = B40.v;
        G10.f(ap, "ENHANCED_NULLABILITY_ANNOTATION");
        a = new UG(ap);
        AP ap2 = B40.w;
        G10.f(ap2, "ENHANCED_MUTABILITY_ANNOTATION");
        b = new UG(ap2);
    }

    public static final InterfaceC3072a8 e(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new C7464pp(AbstractC2455Um.M0(list)) : (InterfaceC3072a8) AbstractC2455Um.C0(list);
        }
        throw new IllegalStateException("At least one Annotations object expected");
    }

    public static final InterfaceC10240zl f(InterfaceC10240zl interfaceC10240zl, I30 i30, A71 a71) {
        C9768y30 c9768y30 = C9768y30.a;
        if (!B71.a(a71) || !(interfaceC10240zl instanceof InterfaceC4923gl)) {
            return null;
        }
        if (i30.c() == EnumC3247am0.B && a71 == A71.B) {
            InterfaceC4923gl interfaceC4923gl = (InterfaceC4923gl) interfaceC10240zl;
            if (c9768y30.c(interfaceC4923gl)) {
                return c9768y30.a(interfaceC4923gl);
            }
        }
        if (i30.c() == EnumC3247am0.C && a71 == A71.C) {
            InterfaceC4923gl interfaceC4923gl2 = (InterfaceC4923gl) interfaceC10240zl;
            if (c9768y30.d(interfaceC4923gl2)) {
                return c9768y30.b(interfaceC4923gl2);
            }
        }
        return null;
    }

    public static final InterfaceC3072a8 g() {
        return a;
    }

    public static final Boolean h(I30 i30, A71 a71) {
        if (!B71.a(a71)) {
            return null;
        }
        EnumC3262ap0 enumC3262ap0D = i30.d();
        int i = enumC3262ap0D == null ? -1 : a.a[enumC3262ap0D.ordinal()];
        if (i == 1) {
            return Boolean.TRUE;
        }
        if (i != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static final boolean i(I80 i80) {
        G10.g(i80, "<this>");
        return O71.c(CS0.a, i80);
    }
}
