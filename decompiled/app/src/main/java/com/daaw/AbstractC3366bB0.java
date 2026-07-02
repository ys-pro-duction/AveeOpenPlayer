package com.daaw;

import com.daaw.KA0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.bB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3366bB0 {
    public static final KA0 a(KA0 ka0, B81 b81) {
        G10.g(ka0, "<this>");
        G10.g(b81, "typeTable");
        if (ka0.n0()) {
            return ka0.V();
        }
        if (ka0.o0()) {
            return b81.a(ka0.W());
        }
        return null;
    }

    public static final List b(C9245wA0 c9245wA0, B81 b81) {
        G10.g(c9245wA0, "<this>");
        G10.g(b81, "typeTable");
        List listB0 = c9245wA0.B0();
        if (listB0.isEmpty()) {
            listB0 = null;
        }
        if (listB0 == null) {
            List listA0 = c9245wA0.A0();
            G10.f(listA0, "getContextReceiverTypeIdList(...)");
            List<Integer> list = listA0;
            listB0 = new ArrayList(AbstractC1703Nm.v(list, 10));
            for (Integer num : list) {
                G10.d(num);
                listB0.add(b81.a(num.intValue()));
            }
        }
        return listB0;
    }

    public static final List c(CA0 ca0, B81 b81) {
        G10.g(ca0, "<this>");
        G10.g(b81, "typeTable");
        List listC0 = ca0.c0();
        if (listC0.isEmpty()) {
            listC0 = null;
        }
        if (listC0 == null) {
            List listB0 = ca0.b0();
            G10.f(listB0, "getContextReceiverTypeIdList(...)");
            List<Integer> list = listB0;
            listC0 = new ArrayList(AbstractC1703Nm.v(list, 10));
            for (Integer num : list) {
                G10.d(num);
                listC0.add(b81.a(num.intValue()));
            }
        }
        return listC0;
    }

    public static final List d(HA0 ha0, B81 b81) {
        G10.g(ha0, "<this>");
        G10.g(b81, "typeTable");
        List listB0 = ha0.b0();
        if (listB0.isEmpty()) {
            listB0 = null;
        }
        if (listB0 == null) {
            List listA0 = ha0.a0();
            G10.f(listA0, "getContextReceiverTypeIdList(...)");
            List<Integer> list = listA0;
            listB0 = new ArrayList(AbstractC1703Nm.v(list, 10));
            for (Integer num : list) {
                G10.d(num);
                listB0.add(b81.a(num.intValue()));
            }
        }
        return listB0;
    }

    public static final KA0 e(LA0 la0, B81 b81) {
        G10.g(la0, "<this>");
        G10.g(b81, "typeTable");
        if (la0.h0()) {
            KA0 ka0X = la0.X();
            G10.f(ka0X, "getExpandedType(...)");
            return ka0X;
        }
        if (la0.i0()) {
            return b81.a(la0.Y());
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
    }

    public static final KA0 f(KA0 ka0, B81 b81) {
        G10.g(ka0, "<this>");
        G10.g(b81, "typeTable");
        if (ka0.s0()) {
            return ka0.f0();
        }
        if (ka0.t0()) {
            return b81.a(ka0.g0());
        }
        return null;
    }

    public static final boolean g(CA0 ca0) {
        G10.g(ca0, "<this>");
        return ca0.z0() || ca0.A0();
    }

    public static final boolean h(HA0 ha0) {
        G10.g(ha0, "<this>");
        return ha0.w0() || ha0.x0();
    }

    public static final KA0 i(C9245wA0 c9245wA0, B81 b81) {
        G10.g(c9245wA0, "<this>");
        G10.g(b81, "typeTable");
        if (c9245wA0.s1()) {
            return c9245wA0.N0();
        }
        if (c9245wA0.t1()) {
            return b81.a(c9245wA0.O0());
        }
        return null;
    }

    public static final KA0 j(KA0 ka0, B81 b81) {
        G10.g(ka0, "<this>");
        G10.g(b81, "typeTable");
        if (ka0.v0()) {
            return ka0.i0();
        }
        if (ka0.w0()) {
            return b81.a(ka0.j0());
        }
        return null;
    }

    public static final KA0 k(CA0 ca0, B81 b81) {
        G10.g(ca0, "<this>");
        G10.g(b81, "typeTable");
        if (ca0.z0()) {
            return ca0.j0();
        }
        if (ca0.A0()) {
            return b81.a(ca0.k0());
        }
        return null;
    }

    public static final KA0 l(HA0 ha0, B81 b81) {
        G10.g(ha0, "<this>");
        G10.g(b81, "typeTable");
        if (ha0.w0()) {
            return ha0.i0();
        }
        if (ha0.x0()) {
            return b81.a(ha0.j0());
        }
        return null;
    }

    public static final KA0 m(CA0 ca0, B81 b81) {
        G10.g(ca0, "<this>");
        G10.g(b81, "typeTable");
        if (ca0.B0()) {
            KA0 ka0L0 = ca0.l0();
            G10.f(ka0L0, "getReturnType(...)");
            return ka0L0;
        }
        if (ca0.C0()) {
            return b81.a(ca0.m0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final KA0 n(HA0 ha0, B81 b81) {
        G10.g(ha0, "<this>");
        G10.g(b81, "typeTable");
        if (ha0.y0()) {
            KA0 ka0K0 = ha0.k0();
            G10.f(ka0K0, "getReturnType(...)");
            return ka0K0;
        }
        if (ha0.z0()) {
            return b81.a(ha0.l0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static final List o(C9245wA0 c9245wA0, B81 b81) {
        G10.g(c9245wA0, "<this>");
        G10.g(b81, "typeTable");
        List listE1 = c9245wA0.e1();
        if (listE1.isEmpty()) {
            listE1 = null;
        }
        if (listE1 == null) {
            List listD1 = c9245wA0.d1();
            G10.f(listD1, "getSupertypeIdList(...)");
            List<Integer> list = listD1;
            listE1 = new ArrayList(AbstractC1703Nm.v(list, 10));
            for (Integer num : list) {
                G10.d(num);
                listE1.add(b81.a(num.intValue()));
            }
        }
        return listE1;
    }

    public static final KA0 p(KA0.b bVar, B81 b81) {
        G10.g(bVar, "<this>");
        G10.g(b81, "typeTable");
        if (bVar.E()) {
            return bVar.B();
        }
        if (bVar.F()) {
            return b81.a(bVar.C());
        }
        return null;
    }

    public static final KA0 q(OA0 oa0, B81 b81) {
        G10.g(oa0, "<this>");
        G10.g(b81, "typeTable");
        if (oa0.W()) {
            KA0 ka0Q = oa0.Q();
            G10.f(ka0Q, "getType(...)");
            return ka0Q;
        }
        if (oa0.X()) {
            return b81.a(oa0.R());
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static final KA0 r(LA0 la0, B81 b81) {
        G10.g(la0, "<this>");
        G10.g(b81, "typeTable");
        if (la0.l0()) {
            KA0 ka0E0 = la0.e0();
            G10.f(ka0E0, "getUnderlyingType(...)");
            return ka0E0;
        }
        if (la0.m0()) {
            return b81.a(la0.f0());
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
    }

    public static final List s(MA0 ma0, B81 b81) {
        G10.g(ma0, "<this>");
        G10.g(b81, "typeTable");
        List listW = ma0.W();
        if (listW.isEmpty()) {
            listW = null;
        }
        if (listW == null) {
            List listV = ma0.V();
            G10.f(listV, "getUpperBoundIdList(...)");
            List<Integer> list = listV;
            listW = new ArrayList(AbstractC1703Nm.v(list, 10));
            for (Integer num : list) {
                G10.d(num);
                listW.add(b81.a(num.intValue()));
            }
        }
        return listW;
    }

    public static final KA0 t(OA0 oa0, B81 b81) {
        G10.g(oa0, "<this>");
        G10.g(b81, "typeTable");
        if (oa0.Y()) {
            return oa0.S();
        }
        if (oa0.Z()) {
            return b81.a(oa0.T());
        }
        return null;
    }
}
