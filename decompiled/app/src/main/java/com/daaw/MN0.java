package com.daaw;

import com.daaw.AbstractC3317b10;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MN0 {
    public static final Class a = A();
    public static final K91 b = B(false);
    public static final K91 c = B(true);
    public static final K91 d = new M91();

    public static Class A() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static K91 B(boolean z) {
        try {
            Class clsC = C();
            if (clsC == null) {
                return null;
            }
            return (K91) clsC.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class C() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void D(AbstractC7042oJ abstractC7042oJ, Object obj, Object obj2) {
        C7325pK c7325pKC = abstractC7042oJ.c(obj2);
        if (c7325pKC.j()) {
            return;
        }
        abstractC7042oJ.d(obj).p(c7325pKC);
    }

    public static void E(InterfaceC0424Bg0 interfaceC0424Bg0, Object obj, Object obj2, long j) {
        AbstractC3188aa1.V(obj, j, interfaceC0424Bg0.a(AbstractC3188aa1.G(obj, j), AbstractC3188aa1.G(obj2, j)));
    }

    public static void F(K91 k91, Object obj, Object obj2) {
        k91.p(obj, k91.k(k91.g(obj), k91.g(obj2)));
    }

    public static K91 G() {
        return b;
    }

    public static K91 H() {
        return c;
    }

    public static void I(Class cls) {
        Class cls2;
        if (!AbstractC5394iS.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static boolean J(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object K(Object obj, int i, int i2, Object obj2, K91 k91) {
        if (obj2 == null) {
            obj2 = k91.f(obj);
        }
        k91.e(obj2, i, i2);
        return obj2;
    }

    public static K91 L() {
        return d;
    }

    public static void M(int i, List list, InterfaceC9674xj1 interfaceC9674xj1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC9674xj1.B(i, list, z);
    }

    public static void N(int i, List list, InterfaceC9674xj1 interfaceC9674xj1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC9674xj1.O(i, list);
    }

    public static void O(int i, List list, InterfaceC9674xj1 interfaceC9674xj1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC9674xj1.M(i, list, z);
    }

    public static void P(int i, List list, InterfaceC9674xj1 interfaceC9674xj1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC9674xj1.L(i, list, z);
    }

    public static void Q(int i, List list, InterfaceC9674xj1 interfaceC9674xj1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC9674xj1.A(i, list, z);
    }

    public static void R(int i, List list, InterfaceC9674xj1 interfaceC9674xj1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC9674xj1.w(i, list, z);
    }

    public static void S(int i, List list, InterfaceC9674xj1 interfaceC9674xj1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC9674xj1.a(i, list, z);
    }

    public static void T(int i, List list, InterfaceC9674xj1 interfaceC9674xj1, DN0 dn0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC9674xj1.C(i, list, dn0);
    }

    public static void U(int i, List list, InterfaceC9674xj1 interfaceC9674xj1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC9674xj1.q(i, list, z);
    }

    public static void V(int i, List list, InterfaceC9674xj1 interfaceC9674xj1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC9674xj1.K(i, list, z);
    }

    public static void W(int i, List list, InterfaceC9674xj1 interfaceC9674xj1, DN0 dn0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC9674xj1.n(i, list, dn0);
    }

    public static void X(int i, List list, InterfaceC9674xj1 interfaceC9674xj1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC9674xj1.x(i, list, z);
    }

    public static void Y(int i, List list, InterfaceC9674xj1 interfaceC9674xj1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC9674xj1.h(i, list, z);
    }

    public static void Z(int i, List list, InterfaceC9674xj1 interfaceC9674xj1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC9674xj1.I(i, list, z);
    }

    public static int a(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? AbstractC10245zm.Q(i) + AbstractC10245zm.A(size) : size * AbstractC10245zm.e(i, true);
    }

    public static void a0(int i, List list, InterfaceC9674xj1 interfaceC9674xj1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC9674xj1.E(i, list, z);
    }

    public static int b(List list) {
        return list.size();
    }

    public static void b0(int i, List list, InterfaceC9674xj1 interfaceC9674xj1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC9674xj1.m(i, list);
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iQ = size * AbstractC10245zm.Q(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iQ += AbstractC10245zm.i((AbstractC4340ei) list.get(i2));
        }
        return iQ;
    }

    public static void c0(int i, List list, InterfaceC9674xj1 interfaceC9674xj1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC9674xj1.D(i, list, z);
    }

    public static int d(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z ? AbstractC10245zm.Q(i) + AbstractC10245zm.A(iE) : iE + (size * AbstractC10245zm.Q(i));
    }

    public static void d0(int i, List list, InterfaceC9674xj1 interfaceC9674xj1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC9674xj1.i(i, list, z);
    }

    public static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C9753y00)) {
            int iM = 0;
            while (i < size) {
                iM += AbstractC10245zm.m(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM;
        }
        C9753y00 c9753y00 = (C9753y00) list;
        int iM2 = 0;
        while (i < size) {
            iM2 += AbstractC10245zm.m(c9753y00.D(i));
            i++;
        }
        return iM2;
    }

    public static int f(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? AbstractC10245zm.Q(i) + AbstractC10245zm.A(size * 4) : size * AbstractC10245zm.n(i, 0);
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? AbstractC10245zm.Q(i) + AbstractC10245zm.A(size * 8) : size * AbstractC10245zm.p(i, 0L);
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i, List list, DN0 dn0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iT += AbstractC10245zm.t(i, (InterfaceC1900Pj0) list.get(i2), dn0);
        }
        return iT;
    }

    public static int k(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z ? AbstractC10245zm.Q(i) + AbstractC10245zm.A(iL) : iL + (size * AbstractC10245zm.Q(i));
    }

    public static int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C9753y00)) {
            int iX = 0;
            while (i < size) {
                iX += AbstractC10245zm.x(((Integer) list.get(i)).intValue());
                i++;
            }
            return iX;
        }
        C9753y00 c9753y00 = (C9753y00) list;
        int iX2 = 0;
        while (i < size) {
            iX2 += AbstractC10245zm.x(c9753y00.D(i));
            i++;
        }
        return iX2;
    }

    public static int m(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z ? AbstractC10245zm.Q(i) + AbstractC10245zm.A(iN) : iN + (list.size() * AbstractC10245zm.Q(i));
    }

    public static int n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC4321ee0)) {
            int iZ = 0;
            while (i < size) {
                iZ += AbstractC10245zm.z(((Long) list.get(i)).longValue());
                i++;
            }
            return iZ;
        }
        AbstractC4321ee0 abstractC4321ee0 = (AbstractC4321ee0) list;
        int iZ2 = 0;
        while (i < size) {
            iZ2 += AbstractC10245zm.z(abstractC4321ee0.p(i));
            i++;
        }
        return iZ2;
    }

    public static int o(int i, Object obj, DN0 dn0) {
        return AbstractC10245zm.B(i, (InterfaceC1900Pj0) obj, dn0);
    }

    public static int p(int i, List list, DN0 dn0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iQ = AbstractC10245zm.Q(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            iQ += AbstractC10245zm.D((InterfaceC1900Pj0) list.get(i2), dn0);
        }
        return iQ;
    }

    public static int q(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z ? AbstractC10245zm.Q(i) + AbstractC10245zm.A(iR) : iR + (size * AbstractC10245zm.Q(i));
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C9753y00)) {
            int iL = 0;
            while (i < size) {
                iL += AbstractC10245zm.L(((Integer) list.get(i)).intValue());
                i++;
            }
            return iL;
        }
        C9753y00 c9753y00 = (C9753y00) list;
        int iL2 = 0;
        while (i < size) {
            iL2 += AbstractC10245zm.L(c9753y00.D(i));
            i++;
        }
        return iL2;
    }

    public static int s(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z ? AbstractC10245zm.Q(i) + AbstractC10245zm.A(iT) : iT + (size * AbstractC10245zm.Q(i));
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC4321ee0)) {
            int iN = 0;
            while (i < size) {
                iN += AbstractC10245zm.N(((Long) list.get(i)).longValue());
                i++;
            }
            return iN;
        }
        AbstractC4321ee0 abstractC4321ee0 = (AbstractC4321ee0) list;
        int iN2 = 0;
        while (i < size) {
            iN2 += AbstractC10245zm.N(abstractC4321ee0.p(i));
            i++;
        }
        return iN2;
    }

    public static int u(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iQ = AbstractC10245zm.Q(i) * size;
        if (!(list instanceof InterfaceC6837nb0)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                iQ += obj instanceof AbstractC4340ei ? AbstractC10245zm.i((AbstractC4340ei) obj) : AbstractC10245zm.P((String) obj);
                i2++;
            }
            return iQ;
        }
        InterfaceC6837nb0 interfaceC6837nb0 = (InterfaceC6837nb0) list;
        while (i2 < size) {
            Object objA = interfaceC6837nb0.A(i2);
            iQ += objA instanceof AbstractC4340ei ? AbstractC10245zm.i((AbstractC4340ei) objA) : AbstractC10245zm.P((String) objA);
            i2++;
        }
        return iQ;
    }

    public static int v(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z ? AbstractC10245zm.Q(i) + AbstractC10245zm.A(iW) : iW + (size * AbstractC10245zm.Q(i));
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C9753y00)) {
            int iS = 0;
            while (i < size) {
                iS += AbstractC10245zm.S(((Integer) list.get(i)).intValue());
                i++;
            }
            return iS;
        }
        C9753y00 c9753y00 = (C9753y00) list;
        int iS2 = 0;
        while (i < size) {
            iS2 += AbstractC10245zm.S(c9753y00.D(i));
            i++;
        }
        return iS2;
    }

    public static int x(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z ? AbstractC10245zm.Q(i) + AbstractC10245zm.A(iY) : iY + (size * AbstractC10245zm.Q(i));
    }

    public static int y(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC4321ee0)) {
            int iU = 0;
            while (i < size) {
                iU += AbstractC10245zm.U(((Long) list.get(i)).longValue());
                i++;
            }
            return iU;
        }
        AbstractC4321ee0 abstractC4321ee0 = (AbstractC4321ee0) list;
        int iU2 = 0;
        while (i < size) {
            iU2 += AbstractC10245zm.U(abstractC4321ee0.p(i));
            i++;
        }
        return iU2;
    }

    public static Object z(Object obj, int i, List list, AbstractC3317b10.c cVar, Object obj2, K91 k91) {
        if (cVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!cVar.a(iIntValue)) {
                    obj2 = K(obj, i, iIntValue, obj2, k91);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (cVar.a(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = K(obj, i, iIntValue2, obj2, k91);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }
}
