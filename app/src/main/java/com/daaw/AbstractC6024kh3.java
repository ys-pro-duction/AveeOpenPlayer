package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.kh3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6024kh3 {
    public static final Class a;
    public static final Ph3 b;
    public static final Ph3 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        Ph3 ph3 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                ph3 = (Ph3) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = ph3;
        c = new Th3();
    }

    public static int A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (Vd3.y(i << 3) + 4);
    }

    public static int B(List list) {
        return list.size() * 4;
    }

    public static int C(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (Vd3.y(i << 3) + 8);
    }

    public static int D(List list) {
        return list.size() * 8;
    }

    public static int E(int i, List list, InterfaceC4907gh3 interfaceC4907gh3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iU += Vd3.u(i, (Kg3) list.get(i2), interfaceC4907gh3);
        }
        return iU;
    }

    public static int F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + (size * Vd3.y(i << 3));
    }

    public static int G(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4618ff3)) {
            int iV = 0;
            while (i < size) {
                iV += Vd3.v(((Integer) list.get(i)).intValue());
                i++;
            }
            return iV;
        }
        C4618ff3 c4618ff3 = (C4618ff3) list;
        int iV2 = 0;
        while (i < size) {
            iV2 += Vd3.v(c4618ff3.m(i));
            i++;
        }
        return iV2;
    }

    public static int H(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return I(list) + (list.size() * Vd3.y(i << 3));
    }

    public static int I(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4623fg3)) {
            int iZ = 0;
            while (i < size) {
                iZ += Vd3.z(((Long) list.get(i)).longValue());
                i++;
            }
            return iZ;
        }
        C4623fg3 c4623fg3 = (C4623fg3) list;
        int iZ2 = 0;
        while (i < size) {
            iZ2 += Vd3.z(c4623fg3.c(i));
            i++;
        }
        return iZ2;
    }

    public static int J(int i, Object obj, InterfaceC4907gh3 interfaceC4907gh3) {
        return Vd3.y(i << 3) + Vd3.w((Kg3) obj, interfaceC4907gh3);
    }

    public static int K(int i, List list, InterfaceC4907gh3 interfaceC4907gh3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = Vd3.y(i << 3) * size;
        for (int i2 = 0; i2 < size; i2++) {
            iY += Vd3.w((Kg3) list.get(i2), interfaceC4907gh3);
        }
        return iY;
    }

    public static int L(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return M(list) + (size * Vd3.y(i << 3));
    }

    public static int M(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4618ff3)) {
            int iY = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iY += Vd3.y((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iY;
        }
        C4618ff3 c4618ff3 = (C4618ff3) list;
        int iY2 = 0;
        while (i < size) {
            int iM = c4618ff3.m(i);
            iY2 += Vd3.y((iM >> 31) ^ (iM + iM));
            i++;
        }
        return iY2;
    }

    public static int N(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return O(list) + (size * Vd3.y(i << 3));
    }

    public static int O(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4623fg3)) {
            int iZ = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZ += Vd3.z((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iZ;
        }
        C4623fg3 c4623fg3 = (C4623fg3) list;
        int iZ2 = 0;
        while (i < size) {
            long jC = c4623fg3.c(i);
            iZ2 += Vd3.z((jC >> 63) ^ (jC + jC));
            i++;
        }
        return iZ2;
    }

    public static int P(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z = list instanceof Rf3;
        int iY = Vd3.y(i << 3) * size;
        if (!z) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AbstractC9646xd3) {
                    int iS = ((AbstractC9646xd3) obj).s();
                    iY += Vd3.y(iS) + iS;
                } else {
                    iY += Vd3.x((String) obj);
                }
                i2++;
            }
            return iY;
        }
        Rf3 rf3 = (Rf3) list;
        while (i2 < size) {
            Object objD = rf3.d(i2);
            if (objD instanceof AbstractC9646xd3) {
                int iS2 = ((AbstractC9646xd3) objD).s();
                iY += Vd3.y(iS2) + iS2;
            } else {
                iY += Vd3.x((String) objD);
            }
            i2++;
        }
        return iY;
    }

    public static int Q(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return R(list) + (size * Vd3.y(i << 3));
    }

    public static int R(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4618ff3)) {
            int iY = 0;
            while (i < size) {
                iY += Vd3.y(((Integer) list.get(i)).intValue());
                i++;
            }
            return iY;
        }
        C4618ff3 c4618ff3 = (C4618ff3) list;
        int iY2 = 0;
        while (i < size) {
            iY2 += Vd3.y(c4618ff3.m(i));
            i++;
        }
        return iY2;
    }

    public static int S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * Vd3.y(i << 3));
    }

    public static int T(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4623fg3)) {
            int iZ = 0;
            while (i < size) {
                iZ += Vd3.z(((Long) list.get(i)).longValue());
                i++;
            }
            return iZ;
        }
        C4623fg3 c4623fg3 = (C4623fg3) list;
        int iZ2 = 0;
        while (i < size) {
            iZ2 += Vd3.z(c4623fg3.c(i));
            i++;
        }
        return iZ2;
    }

    public static Ph3 U() {
        return b;
    }

    public static Ph3 V() {
        return c;
    }

    public static Object a(Object obj, int i, int i2, Object obj2, Ph3 ph3) {
        if (obj2 == null) {
            obj2 = ph3.c(obj);
        }
        ph3.f(obj2, i, i2);
        return obj2;
    }

    public static void b(Ph3 ph3, Object obj, Object obj2) {
        ph3.h(obj, ph3.e(ph3.d(obj), ph3.d(obj2)));
    }

    public static void c(Class cls) {
        Class cls2;
        if (!AbstractC3772cf3.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void d(int i, List list, Hi3 hi3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hi3.f(i, list, z);
    }

    public static void e(int i, List list, Hi3 hi3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hi3.b(i, list);
    }

    public static void f(int i, List list, Hi3 hi3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hi3.r(i, list, z);
    }

    public static void g(int i, List list, Hi3 hi3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hi3.k(i, list, z);
    }

    public static void h(int i, List list, Hi3 hi3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hi3.h(i, list, z);
    }

    public static void i(int i, List list, Hi3 hi3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hi3.n(i, list, z);
    }

    public static void j(int i, List list, Hi3 hi3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hi3.s(i, list, z);
    }

    public static void k(int i, List list, Hi3 hi3, InterfaceC4907gh3 interfaceC4907gh3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((Wd3) hi3).B(i, list.get(i2), interfaceC4907gh3);
        }
    }

    public static void l(int i, List list, Hi3 hi3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hi3.i(i, list, z);
    }

    public static void m(int i, List list, Hi3 hi3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hi3.q(i, list, z);
    }

    public static void n(int i, List list, Hi3 hi3, InterfaceC4907gh3 interfaceC4907gh3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((Wd3) hi3).H(i, list.get(i2), interfaceC4907gh3);
        }
    }

    public static void o(int i, List list, Hi3 hi3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hi3.E(i, list, z);
    }

    public static void p(int i, List list, Hi3 hi3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hi3.u(i, list, z);
    }

    public static void q(int i, List list, Hi3 hi3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hi3.C(i, list, z);
    }

    public static void r(int i, List list, Hi3 hi3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hi3.G(i, list, z);
    }

    public static void s(int i, List list, Hi3 hi3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hi3.A(i, list);
    }

    public static void t(int i, List list, Hi3 hi3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hi3.z(i, list, z);
    }

    public static void u(int i, List list, Hi3 hi3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hi3.D(i, list, z);
    }

    public static boolean v(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int w(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (Vd3.y(i << 3) + 1);
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = size * Vd3.y(i << 3);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int iS = ((AbstractC9646xd3) list.get(i2)).s();
            iY += Vd3.y(iS) + iS;
        }
        return iY;
    }

    public static int y(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z(list) + (size * Vd3.y(i << 3));
    }

    public static int z(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4618ff3)) {
            int iV = 0;
            while (i < size) {
                iV += Vd3.v(((Integer) list.get(i)).intValue());
                i++;
            }
            return iV;
        }
        C4618ff3 c4618ff3 = (C4618ff3) list;
        int iV2 = 0;
        while (i < size) {
            iV2 += Vd3.v(c4618ff3.m(i));
            i++;
        }
        return iV2;
    }
}
