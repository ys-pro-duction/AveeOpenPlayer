package com.daaw;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.qc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7680qc1 {
    public static final boolean a(Member member) {
        if (member.getDeclaringClass() == null) {
            return false;
        }
        return !X40.e(r0).n();
    }

    public static final void g(InterfaceC2231Si interfaceC2231Si, int i, InterfaceC1583Mi interfaceC1583Mi, boolean z) {
        if (AbstractC2439Ui.a(interfaceC2231Si) == i) {
            return;
        }
        throw new E80("Inconsistent number of parameters in the descriptor and Java reflection object: " + AbstractC2439Ui.a(interfaceC2231Si) + " != " + i + "\nCalling: " + interfaceC1583Mi + "\nParameter types: " + interfaceC2231Si.a() + ")\nDefault: " + z);
    }

    public static final Object h(Object obj, InterfaceC1583Mi interfaceC1583Mi) {
        I80 i80L;
        Class clsT;
        Method methodM;
        G10.g(interfaceC1583Mi, "descriptor");
        return (((interfaceC1583Mi instanceof InterfaceC4476fA0) && JZ.e((InterfaceC0626Dc1) interfaceC1583Mi)) || (i80L = l(interfaceC1583Mi)) == null || (clsT = t(i80L)) == null || (methodM = m(clsT, interfaceC1583Mi)) == null) ? obj : methodM.invoke(obj, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.daaw.InterfaceC2231Si i(com.daaw.InterfaceC2231Si r3, com.daaw.InterfaceC1583Mi r4, boolean r5) {
        /*
            java.lang.String r0 = "<this>"
            com.daaw.G10.g(r3, r0)
            java.lang.String r0 = "descriptor"
            com.daaw.G10.g(r4, r0)
            boolean r0 = com.daaw.JZ.a(r4)
            if (r0 != 0) goto L96
            java.util.List r0 = r4.o0()
            java.lang.String r1 = "getContextReceiverParameters(...)"
            com.daaw.G10.f(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            java.lang.String r2 = "getType(...)"
            if (r1 == 0) goto L2b
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L2b
            goto L49
        L2b:
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r0.next()
            com.daaw.RE0 r1 = (com.daaw.RE0) r1
            com.daaw.I80 r1 = r1.getType()
            com.daaw.G10.f(r1, r2)
            boolean r1 = com.daaw.JZ.h(r1)
            if (r1 == 0) goto L2f
            goto L96
        L49:
            java.util.List r0 = r4.h()
            java.lang.String r1 = "getValueParameters(...)"
            com.daaw.G10.f(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L62
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L62
            goto L80
        L62:
            java.util.Iterator r0 = r0.iterator()
        L66:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L80
            java.lang.Object r1 = r0.next()
            com.daaw.yc1 r1 = (com.daaw.InterfaceC9918yc1) r1
            com.daaw.I80 r1 = r1.getType()
            com.daaw.G10.f(r1, r2)
            boolean r1 = com.daaw.JZ.h(r1)
            if (r1 == 0) goto L66
            goto L96
        L80:
            com.daaw.I80 r0 = r4.getReturnType()
            if (r0 == 0) goto L8e
            boolean r0 = com.daaw.JZ.c(r0)
            r1 = 1
            if (r0 != r1) goto L8e
            goto L96
        L8e:
            boolean r0 = q(r4)
            if (r0 == 0) goto L95
            goto L96
        L95:
            return r3
        L96:
            com.daaw.pc1 r0 = new com.daaw.pc1
            r0.<init>(r4, r3, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC7680qc1.i(com.daaw.Si, com.daaw.Mi, boolean):com.daaw.Si");
    }

    public static /* synthetic */ InterfaceC2231Si j(InterfaceC2231Si interfaceC2231Si, InterfaceC1583Mi interfaceC1583Mi, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return i(interfaceC2231Si, interfaceC1583Mi, z);
    }

    public static final Method k(Class cls, InterfaceC1583Mi interfaceC1583Mi) {
        try {
            return cls.getDeclaredMethod("box-impl", m(cls, interfaceC1583Mi).getReturnType());
        } catch (NoSuchMethodException unused) {
            throw new E80("No box method found in inline class: " + cls + " (calling " + interfaceC1583Mi + ')');
        }
    }

    public static final I80 l(InterfaceC1583Mi interfaceC1583Mi) {
        RE0 re0I0 = interfaceC1583Mi.i0();
        RE0 re0C0 = interfaceC1583Mi.c0();
        if (re0I0 != null) {
            return re0I0.getType();
        }
        if (re0C0 == null) {
            return null;
        }
        if (interfaceC1583Mi instanceof InterfaceC7195or) {
            return re0C0.getType();
        }
        InterfaceC8612tw interfaceC8612twB = interfaceC1583Mi.b();
        InterfaceC4923gl interfaceC4923gl = interfaceC8612twB instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC8612twB : null;
        if (interfaceC4923gl != null) {
            return interfaceC4923gl.s();
        }
        return null;
    }

    public static final Method m(Class cls, InterfaceC1583Mi interfaceC1583Mi) {
        G10.g(cls, "<this>");
        G10.g(interfaceC1583Mi, "descriptor");
        try {
            return cls.getDeclaredMethod("unbox-impl", null);
        } catch (NoSuchMethodException unused) {
            throw new E80("No unbox method found in inline class: " + cls + " (calling " + interfaceC1583Mi + ')');
        }
    }

    public static final List n(YS0 ys0) {
        G10.g(ys0, "type");
        List listO = o(AbstractC8671u81.a(ys0));
        if (listO == null) {
            return null;
        }
        List list = listO;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        InterfaceC10240zl interfaceC10240zlC = ys0.N0().c();
        G10.e(interfaceC10240zlC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class clsQ = AbstractC8511tb1.q((InterfaceC4923gl) interfaceC10240zlC);
        G10.d(clsQ);
        ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsQ.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    public static final List o(YS0 ys0) {
        Collection collectionE;
        if (!JZ.i(ys0)) {
            return null;
        }
        InterfaceC10240zl interfaceC10240zlC = ys0.N0().c();
        G10.e(interfaceC10240zlC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        C2034Ql0 c2034Ql0T = AbstractC8400tA.t((InterfaceC4923gl) interfaceC10240zlC);
        G10.d(c2034Ql0T);
        List<C0576Cs0> listC = c2034Ql0T.c();
        ArrayList arrayList = new ArrayList();
        for (C0576Cs0 c0576Cs0 : listC) {
            C2352Tm0 c2352Tm0 = (C2352Tm0) c0576Cs0.a();
            List listO = o((YS0) c0576Cs0.b());
            if (listO != null) {
                List list = listO;
                collectionE = new ArrayList(AbstractC1703Nm.v(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    collectionE.add(c2352Tm0.h() + '-' + ((String) it.next()));
                }
            } else {
                collectionE = AbstractC1496Lm.e(c2352Tm0.h());
            }
            AbstractC2141Rm.A(arrayList, collectionE);
        }
        return arrayList;
    }

    public static final List p(YS0 ys0, InterfaceC1583Mi interfaceC1583Mi) {
        Method methodM;
        List listN = n(ys0);
        if (listN != null) {
            return listN;
        }
        Class clsT = t(ys0);
        if (clsT == null || (methodM = m(clsT, interfaceC1583Mi)) == null) {
            return null;
        }
        return AbstractC1496Lm.e(methodM);
    }

    public static final boolean q(InterfaceC1583Mi interfaceC1583Mi) {
        I80 i80L = l(interfaceC1583Mi);
        return i80L != null && JZ.h(i80L);
    }

    public static final List r(InterfaceC1583Mi interfaceC1583Mi, Member member, NQ nq) {
        ArrayList arrayList = new ArrayList();
        RE0 re0I0 = interfaceC1583Mi.i0();
        I80 type = re0I0 != null ? re0I0.getType() : null;
        if (type != null) {
            arrayList.add(type);
        } else if (interfaceC1583Mi instanceof InterfaceC7195or) {
            InterfaceC4923gl interfaceC4923glA = ((InterfaceC7195or) interfaceC1583Mi).A();
            G10.f(interfaceC4923glA, "getConstructedClass(...)");
            if (interfaceC4923glA.K()) {
                InterfaceC8612tw interfaceC8612twB = interfaceC4923glA.b();
                G10.e(interfaceC8612twB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                arrayList.add(((InterfaceC4923gl) interfaceC8612twB).s());
            }
        } else {
            InterfaceC8612tw interfaceC8612twB2 = interfaceC1583Mi.b();
            G10.f(interfaceC8612twB2, "getContainingDeclaration(...)");
            if ((interfaceC8612twB2 instanceof InterfaceC4923gl) && ((Boolean) nq.invoke(interfaceC8612twB2)).booleanValue()) {
                if (member == null || !a(member)) {
                    arrayList.add(((InterfaceC4923gl) interfaceC8612twB2).s());
                } else {
                    YS0 ys0S = ((InterfaceC4923gl) interfaceC8612twB2).s();
                    G10.f(ys0S, "getDefaultType(...)");
                    arrayList.add(H81.B(ys0S));
                }
            }
        }
        List listH = interfaceC1583Mi.h();
        G10.f(listH, "getValueParameters(...)");
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC9918yc1) it.next()).getType());
        }
        return arrayList;
    }

    public static final Class s(InterfaceC8612tw interfaceC8612tw) {
        if (!(interfaceC8612tw instanceof InterfaceC4923gl) || !JZ.b(interfaceC8612tw)) {
            return null;
        }
        InterfaceC4923gl interfaceC4923gl = (InterfaceC4923gl) interfaceC8612tw;
        Class clsQ = AbstractC8511tb1.q(interfaceC4923gl);
        if (clsQ != null) {
            return clsQ;
        }
        throw new E80("Class object for the class " + interfaceC4923gl.getName() + " cannot be found (classId=" + AbstractC8400tA.n((InterfaceC10240zl) interfaceC8612tw) + ')');
    }

    public static final Class t(I80 i80) {
        I80 i80K;
        Class clsS = s(i80.N0().c());
        if (clsS == null) {
            return null;
        }
        if (D81.l(i80) && ((i80K = JZ.k(i80)) == null || D81.l(i80K) || AbstractC8670u80.s0(i80K))) {
            return null;
        }
        return clsS;
    }

    public static final String u(InterfaceC10240zl interfaceC10240zl) {
        G10.g(interfaceC10240zl, "<this>");
        C6607ml c6607mlN = AbstractC8400tA.n(interfaceC10240zl);
        G10.d(c6607mlN);
        return C7444pl.b(c6607mlN.b());
    }
}
