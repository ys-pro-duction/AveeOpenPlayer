package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class H81 {
    public static final I80 A(I80 i80) {
        G10.g(i80, "<this>");
        I80 i80N = D81.n(i80);
        G10.f(i80N, "makeNotNullable(...)");
        return i80N;
    }

    public static final I80 B(I80 i80) {
        G10.g(i80, "<this>");
        I80 i80O = D81.o(i80);
        G10.f(i80O, "makeNullable(...)");
        return i80O;
    }

    public static final I80 C(I80 i80, InterfaceC3072a8 interfaceC3072a8) {
        G10.g(i80, "<this>");
        G10.g(interfaceC3072a8, "newAnnotations");
        return (i80.getAnnotations().isEmpty() && interfaceC3072a8.isEmpty()) ? i80 : i80.Q0().T0(AbstractC8666u71.a(i80.M0(), interfaceC3072a8));
    }

    public static final I80 D(I80 i80) {
        AbstractC5708ja1 abstractC5708ja1F;
        G10.g(i80, "<this>");
        AbstractC5708ja1 abstractC5708ja1Q0 = i80.Q0();
        if (abstractC5708ja1Q0 instanceof UM) {
            UM um = (UM) abstractC5708ja1Q0;
            YS0 ys0V0 = um.V0();
            if (!ys0V0.N0().getParameters().isEmpty() && ys0V0.N0().c() != null) {
                List parameters = ys0V0.N0().getParameters();
                G10.f(parameters, "getParameters(...)");
                List list = parameters;
                ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C3450bW0((Z71) it.next()));
                }
                ys0V0 = AbstractC8671u81.f(ys0V0, arrayList, null, 2, null);
            }
            YS0 ys0W0 = um.W0();
            if (!ys0W0.N0().getParameters().isEmpty() && ys0W0.N0().c() != null) {
                List parameters2 = ys0W0.N0().getParameters();
                G10.f(parameters2, "getParameters(...)");
                List list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C3450bW0((Z71) it2.next()));
                }
                ys0W0 = AbstractC8671u81.f(ys0W0, arrayList2, null, 2, null);
            }
            abstractC5708ja1F = M80.e(ys0V0, ys0W0);
        } else {
            if (!(abstractC5708ja1Q0 instanceof YS0)) {
                throw new C6902no0();
            }
            YS0 ys0 = (YS0) abstractC5708ja1Q0;
            boolean zIsEmpty = ys0.N0().getParameters().isEmpty();
            abstractC5708ja1F = ys0;
            if (!zIsEmpty) {
                InterfaceC10240zl interfaceC10240zlC = ys0.N0().c();
                abstractC5708ja1F = ys0;
                if (interfaceC10240zlC != null) {
                    List parameters3 = ys0.N0().getParameters();
                    G10.f(parameters3, "getParameters(...)");
                    List list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(AbstractC1703Nm.v(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new C3450bW0((Z71) it3.next()));
                    }
                    abstractC5708ja1F = AbstractC8671u81.f(ys0, arrayList3, null, 2, null);
                }
            }
        }
        return L81.b(abstractC5708ja1F, abstractC5708ja1Q0);
    }

    public static final boolean E(I80 i80) {
        G10.g(i80, "<this>");
        return e(i80, G81.B);
    }

    public static final boolean F(AbstractC5708ja1 abstractC5708ja1) {
        G10.g(abstractC5708ja1, "it");
        InterfaceC10240zl interfaceC10240zlC = abstractC5708ja1.N0().c();
        if (interfaceC10240zlC != null) {
            return (interfaceC10240zlC instanceof InterfaceC5586j71) || (interfaceC10240zlC instanceof Z71);
        }
        return false;
    }

    public static final InterfaceC6440m81 d(I80 i80) {
        G10.g(i80, "<this>");
        return new C6998o81(i80);
    }

    public static final boolean e(I80 i80, NQ nq) {
        G10.g(i80, "<this>");
        G10.g(nq, "predicate");
        return D81.c(i80, nq);
    }

    public static final boolean f(I80 i80, C71 c71, Set set) {
        boolean zF;
        if (G10.c(i80.N0(), c71)) {
            return true;
        }
        InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
        InterfaceC0339Al interfaceC0339Al = interfaceC10240zlC instanceof InterfaceC0339Al ? (InterfaceC0339Al) interfaceC10240zlC : null;
        List listV = interfaceC0339Al != null ? interfaceC0339Al.v() : null;
        Iterable<C8500tZ> iterableS0 = AbstractC2455Um.S0(i80.L0());
        if ((iterableS0 instanceof Collection) && ((Collection) iterableS0).isEmpty()) {
            return false;
        }
        for (C8500tZ c8500tZ : iterableS0) {
            int iA = c8500tZ.a();
            InterfaceC6440m81 interfaceC6440m81 = (InterfaceC6440m81) c8500tZ.b();
            Z71 z71 = listV != null ? (Z71) AbstractC2455Um.h0(listV, iA) : null;
            if ((z71 == null || set == null || !set.contains(z71)) && !interfaceC6440m81.c()) {
                I80 type = interfaceC6440m81.getType();
                G10.f(type, "getType(...)");
                zF = f(type, c71, set);
            } else {
                zF = false;
            }
            if (zF) {
                return true;
            }
        }
        return false;
    }

    public static final boolean g(I80 i80) {
        G10.g(i80, "<this>");
        return e(i80, F81.B);
    }

    public static final boolean h(AbstractC5708ja1 abstractC5708ja1) {
        G10.g(abstractC5708ja1, "it");
        InterfaceC10240zl interfaceC10240zlC = abstractC5708ja1.N0().c();
        if (interfaceC10240zlC != null) {
            return x(interfaceC10240zlC);
        }
        return false;
    }

    public static final boolean i(I80 i80) {
        G10.g(i80, "<this>");
        return D81.c(i80, E81.B);
    }

    public static final Boolean j(AbstractC5708ja1 abstractC5708ja1) {
        return Boolean.valueOf(D81.m(abstractC5708ja1));
    }

    public static final InterfaceC6440m81 k(I80 i80, EnumC1042Hc1 enumC1042Hc1, Z71 z71) {
        G10.g(i80, "type");
        G10.g(enumC1042Hc1, "projectionKind");
        if ((z71 != null ? z71.o() : null) == enumC1042Hc1) {
            enumC1042Hc1 = EnumC1042Hc1.F;
        }
        return new C6998o81(enumC1042Hc1, i80);
    }

    public static final Set l(I80 i80, Set set) {
        G10.g(i80, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m(i80, i80, linkedHashSet, set);
        return linkedHashSet;
    }

    public static final void m(I80 i80, I80 i802, Set set, Set set2) {
        InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
        if (interfaceC10240zlC instanceof Z71) {
            if (!G10.c(i80.N0(), i802.N0())) {
                set.add(interfaceC10240zlC);
                return;
            }
            for (I80 i803 : ((Z71) interfaceC10240zlC).getUpperBounds()) {
                G10.d(i803);
                m(i803, i802, set, set2);
            }
            return;
        }
        InterfaceC10240zl interfaceC10240zlC2 = i80.N0().c();
        InterfaceC0339Al interfaceC0339Al = interfaceC10240zlC2 instanceof InterfaceC0339Al ? (InterfaceC0339Al) interfaceC10240zlC2 : null;
        List listV = interfaceC0339Al != null ? interfaceC0339Al.v() : null;
        int i = 0;
        for (InterfaceC6440m81 interfaceC6440m81 : i80.L0()) {
            int i2 = i + 1;
            Z71 z71 = listV != null ? (Z71) AbstractC2455Um.h0(listV, i) : null;
            if ((z71 == null || set2 == null || !set2.contains(z71)) && !interfaceC6440m81.c() && !AbstractC2455Um.W(set, interfaceC6440m81.getType().N0().c()) && !G10.c(interfaceC6440m81.getType().N0(), i802.N0())) {
                I80 type = interfaceC6440m81.getType();
                G10.f(type, "getType(...)");
                m(type, i802, set, set2);
            }
            i = i2;
        }
    }

    public static final AbstractC8670u80 n(I80 i80) {
        G10.g(i80, "<this>");
        AbstractC8670u80 abstractC8670u80P = i80.N0().p();
        G10.f(abstractC8670u80P, "getBuiltIns(...)");
        return abstractC8670u80P;
    }

    public static final I80 o(Z71 z71) {
        Object obj;
        G10.g(z71, "<this>");
        List upperBounds = z71.getUpperBounds();
        G10.f(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List upperBounds2 = z71.getUpperBounds();
        G10.f(upperBounds2, "getUpperBounds(...)");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC10240zl interfaceC10240zlC = ((I80) next).N0().c();
            InterfaceC4923gl interfaceC4923gl = interfaceC10240zlC instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC10240zlC : null;
            if (interfaceC4923gl != null && interfaceC4923gl.i() != EnumC6886nl.D && interfaceC4923gl.i() != EnumC6886nl.G) {
                obj = next;
                break;
            }
        }
        I80 i80 = (I80) obj;
        if (i80 != null) {
            return i80;
        }
        List upperBounds3 = z71.getUpperBounds();
        G10.f(upperBounds3, "getUpperBounds(...)");
        Object objE0 = AbstractC2455Um.e0(upperBounds3);
        G10.f(objE0, "first(...)");
        return (I80) objE0;
    }

    public static final boolean p(Z71 z71) {
        G10.g(z71, "typeParameter");
        return r(z71, null, null, 6, null);
    }

    public static final boolean q(Z71 z71, C71 c71, Set set) {
        G10.g(z71, "typeParameter");
        List upperBounds = z71.getUpperBounds();
        G10.f(upperBounds, "getUpperBounds(...)");
        List<I80> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (I80 i80 : list) {
            G10.d(i80);
            if (f(i80, z71.s().N0(), set) && (c71 == null || G10.c(i80.N0(), c71))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean r(Z71 z71, C71 c71, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            c71 = null;
        }
        if ((i & 4) != 0) {
            set = null;
        }
        return q(z71, c71, set);
    }

    public static final boolean s(I80 i80) {
        G10.g(i80, "<this>");
        return AbstractC8670u80.f0(i80);
    }

    public static final boolean t(I80 i80) {
        G10.g(i80, "<this>");
        return AbstractC8670u80.n0(i80);
    }

    public static final boolean u(I80 i80) {
        G10.g(i80, "<this>");
        if (!(i80 instanceof C8906uy)) {
            return false;
        }
        ((C8906uy) i80).Z0();
        return false;
    }

    public static final boolean v(I80 i80) {
        G10.g(i80, "<this>");
        if (!(i80 instanceof C8906uy)) {
            return false;
        }
        ((C8906uy) i80).Z0();
        return false;
    }

    public static final boolean w(I80 i80, I80 i802) {
        G10.g(i80, "<this>");
        G10.g(i802, "superType");
        return J80.a.b(i80, i802);
    }

    public static final boolean x(InterfaceC10240zl interfaceC10240zl) {
        G10.g(interfaceC10240zl, "<this>");
        return (interfaceC10240zl instanceof Z71) && (((Z71) interfaceC10240zl).b() instanceof InterfaceC5586j71);
    }

    public static final boolean y(I80 i80) {
        G10.g(i80, "<this>");
        return D81.m(i80);
    }

    public static final boolean z(I80 i80) {
        G10.g(i80, "type");
        return (i80 instanceof C9830yH) && ((C9830yH) i80).X0().g();
    }
}
