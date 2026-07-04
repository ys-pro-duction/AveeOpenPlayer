package com.daaw;

import com.daaw.AbstractC9870yR;
import com.daaw.YV0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AR {
    public static final int a(I80 i80) {
        G10.g(i80, "<this>");
        O7 o7I = i80.getAnnotations().i(YV0.a.D);
        if (o7I == null) {
            return 0;
        }
        AbstractC2887Yq abstractC2887Yq = (AbstractC2887Yq) AbstractC1473Lg0.i(o7I.k(), YV0.q);
        G10.e(abstractC2887Yq, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((L00) abstractC2887Yq).b()).intValue();
    }

    public static final YS0 b(AbstractC8670u80 abstractC8670u80, InterfaceC3072a8 interfaceC3072a8, I80 i80, List list, List list2, List list3, I80 i802, boolean z) {
        G10.g(abstractC8670u80, "builtIns");
        G10.g(interfaceC3072a8, "annotations");
        G10.g(list, "contextReceiverTypes");
        G10.g(list2, "parameterTypes");
        G10.g(i802, "returnType");
        List listG = g(i80, list, list2, list3, i802, abstractC8670u80);
        InterfaceC4923gl interfaceC4923glF = f(abstractC8670u80, list2.size() + list.size() + (i80 == null ? 0 : 1), z);
        if (i80 != null) {
            interfaceC3072a8 = u(interfaceC3072a8, abstractC8670u80);
        }
        if (!list.isEmpty()) {
            interfaceC3072a8 = t(interfaceC3072a8, abstractC8670u80, list.size());
        }
        return M80.h(AbstractC8666u71.b(interfaceC3072a8), interfaceC4923glF, listG);
    }

    public static final C2352Tm0 d(I80 i80) {
        String str;
        G10.g(i80, "<this>");
        O7 o7I = i80.getAnnotations().i(YV0.a.E);
        if (o7I == null) {
            return null;
        }
        Object objD0 = AbstractC2455Um.D0(o7I.k().values());
        C7103oY0 c7103oY0 = objD0 instanceof C7103oY0 ? (C7103oY0) objD0 : null;
        if (c7103oY0 != null && (str = (String) c7103oY0.b()) != null) {
            if (!C2352Tm0.n(str)) {
                str = null;
            }
            if (str != null) {
                return C2352Tm0.l(str);
            }
        }
        return null;
    }

    public static final List e(I80 i80) {
        G10.g(i80, "<this>");
        p(i80);
        int iA = a(i80);
        if (iA == 0) {
            return AbstractC1599Mm.k();
        }
        List listSubList = i80.L0().subList(0, iA);
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC6440m81) it.next()).getType());
        }
        return arrayList;
    }

    public static final InterfaceC4923gl f(AbstractC8670u80 abstractC8670u80, int i, boolean z) {
        G10.g(abstractC8670u80, "builtIns");
        InterfaceC4923gl interfaceC4923glX = z ? abstractC8670u80.X(i) : abstractC8670u80.C(i);
        G10.d(interfaceC4923glX);
        return interfaceC4923glX;
    }

    public static final List g(I80 i80, List list, List list2, List list3, I80 i802, AbstractC8670u80 abstractC8670u80) {
        C2352Tm0 c2352Tm0;
        AbstractC8670u80 abstractC8670u802;
        G10.g(list, "contextReceiverTypes");
        G10.g(list2, "parameterTypes");
        G10.g(i802, "returnType");
        G10.g(abstractC8670u80, "builtIns");
        int i = 0;
        ArrayList arrayList = new ArrayList(list2.size() + list.size() + (i80 != null ? 1 : 0) + 1);
        List list4 = list;
        ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList2.add(H81.d((I80) it.next()));
        }
        arrayList.addAll(arrayList2);
        AbstractC1392Km.a(arrayList, i80 != null ? H81.d(i80) : null);
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC1599Mm.u();
            }
            I80 i80C = (I80) obj;
            if (list3 == null || (c2352Tm0 = (C2352Tm0) list3.get(i)) == null || c2352Tm0.m()) {
                c2352Tm0 = null;
            }
            if (c2352Tm0 != null) {
                AP ap = YV0.a.E;
                C2352Tm0 c2352Tm02 = YV0.m;
                String strC = c2352Tm0.c();
                G10.f(strC, "asString(...)");
                Map mapE = AbstractC1369Kg0.e(D61.a(c2352Tm02, new C7103oY0(strC)));
                abstractC8670u802 = abstractC8670u80;
                i80C = H81.C(i80C, InterfaceC3072a8.b.a(AbstractC2455Um.y0(i80C.getAnnotations(), new C9662xh(abstractC8670u802, ap, mapE, false, 8, null))));
            } else {
                abstractC8670u802 = abstractC8670u80;
            }
            arrayList.add(H81.d(i80C));
            i = i2;
            abstractC8670u80 = abstractC8670u802;
        }
        arrayList.add(H81.d(i802));
        return arrayList;
    }

    public static final AbstractC9870yR h(InterfaceC8612tw interfaceC8612tw) {
        G10.g(interfaceC8612tw, "<this>");
        if ((interfaceC8612tw instanceof InterfaceC4923gl) && AbstractC8670u80.B0(interfaceC8612tw)) {
            return i(AbstractC8400tA.p(interfaceC8612tw));
        }
        return null;
    }

    public static final AbstractC9870yR i(BP bp) {
        if (!bp.f() || bp.e()) {
            return null;
        }
        C10149zR c10149zRA = C10149zR.c.a();
        AP apE = bp.l().e();
        G10.f(apE, "parent(...)");
        String strC = bp.i().c();
        G10.f(strC, "asString(...)");
        return c10149zRA.b(apE, strC);
    }

    public static final AbstractC9870yR j(I80 i80) {
        G10.g(i80, "<this>");
        InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
        if (interfaceC10240zlC != null) {
            return h(interfaceC10240zlC);
        }
        return null;
    }

    public static final I80 k(I80 i80) {
        G10.g(i80, "<this>");
        p(i80);
        if (!s(i80)) {
            return null;
        }
        return ((InterfaceC6440m81) i80.L0().get(a(i80))).getType();
    }

    public static final I80 l(I80 i80) {
        G10.g(i80, "<this>");
        p(i80);
        I80 type = ((InterfaceC6440m81) AbstractC2455Um.p0(i80.L0())).getType();
        G10.f(type, "getType(...)");
        return type;
    }

    public static final List m(I80 i80) {
        G10.g(i80, "<this>");
        p(i80);
        return i80.L0().subList(a(i80) + (n(i80) ? 1 : 0), r0.size() - 1);
    }

    public static final boolean n(I80 i80) {
        G10.g(i80, "<this>");
        return p(i80) && s(i80);
    }

    public static final boolean o(InterfaceC8612tw interfaceC8612tw) {
        G10.g(interfaceC8612tw, "<this>");
        AbstractC9870yR abstractC9870yRH = h(interfaceC8612tw);
        return G10.c(abstractC9870yRH, AbstractC9870yR.a.e) || G10.c(abstractC9870yRH, AbstractC9870yR.d.e);
    }

    public static final boolean p(I80 i80) {
        G10.g(i80, "<this>");
        InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
        return interfaceC10240zlC != null && o(interfaceC10240zlC);
    }

    public static final boolean q(I80 i80) {
        G10.g(i80, "<this>");
        return G10.c(j(i80), AbstractC9870yR.a.e);
    }

    public static final boolean r(I80 i80) {
        G10.g(i80, "<this>");
        return G10.c(j(i80), AbstractC9870yR.d.e);
    }

    public static final boolean s(I80 i80) {
        return i80.getAnnotations().i(YV0.a.C) != null;
    }

    public static final InterfaceC3072a8 t(InterfaceC3072a8 interfaceC3072a8, AbstractC8670u80 abstractC8670u80, int i) {
        G10.g(interfaceC3072a8, "<this>");
        G10.g(abstractC8670u80, "builtIns");
        AP ap = YV0.a.D;
        return interfaceC3072a8.z(ap) ? interfaceC3072a8 : InterfaceC3072a8.b.a(AbstractC2455Um.y0(interfaceC3072a8, new C9662xh(abstractC8670u80, ap, AbstractC1369Kg0.e(D61.a(YV0.q, new L00(i))), false, 8, null)));
    }

    public static final InterfaceC3072a8 u(InterfaceC3072a8 interfaceC3072a8, AbstractC8670u80 abstractC8670u80) {
        G10.g(interfaceC3072a8, "<this>");
        G10.g(abstractC8670u80, "builtIns");
        AP ap = YV0.a.C;
        return interfaceC3072a8.z(ap) ? interfaceC3072a8 : InterfaceC3072a8.b.a(AbstractC2455Um.y0(interfaceC3072a8, new C9662xh(abstractC8670u80, ap, AbstractC1473Lg0.h(), false, 8, null)));
    }
}
