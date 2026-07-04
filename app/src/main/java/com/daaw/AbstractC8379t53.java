package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.daaw.t53, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8379t53 {
    public static final Class a;
    public static final AbstractC9223w53 b;
    public static final AbstractC9223w53 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        AbstractC9223w53 abstractC9223w53 = null;
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
                abstractC9223w53 = (AbstractC9223w53) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = abstractC9223w53;
        c = new C9781y53();
    }

    public static void A(int i, List list, Q33 q33, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q33.n(i, list, z);
    }

    public static void B(int i, List list, Q33 q33, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q33.r(i, list, z);
    }

    public static void C(int i, List list, Q33 q33, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q33.u(i, list, z);
    }

    public static void D(int i, List list, Q33 q33, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q33.w(i, list, z);
    }

    public static void E(int i, List list, Q33 q33, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q33.y(i, list, z);
    }

    public static void F(int i, List list, Q33 q33, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q33.A(i, list, z);
    }

    public static void G(int i, List list, Q33 q33, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q33.D(i, list, z);
    }

    public static void a(int i, List list, Q33 q33, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q33.F(i, list, z);
    }

    public static void b(int i, List list, Q33 q33, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q33.I(i, list, z);
    }

    public static void c(int i, List list, Q33 q33, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q33.K(i, list, z);
    }

    public static void d(int i, List list, Q33 q33, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q33.b(i, list, z);
    }

    public static void e(int i, List list, Q33 q33, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q33.d(i, list, z);
    }

    public static void f(int i, List list, Q33 q33, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q33.i(i, list, z);
    }

    public static void g(int i, List list, Q33 q33, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q33.k(i, list, z);
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5855k43)) {
            int iA = 0;
            while (i < size) {
                iA += P33.A(((Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        C5855k43 c5855k43 = (C5855k43) list;
        int iA2 = 0;
        while (i < size) {
            iA2 += P33.A(c5855k43.m(i));
            i++;
        }
        return iA2;
    }

    public static int i(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (P33.b(i << 3) + 4);
    }

    public static int j(List list) {
        return list.size() * 4;
    }

    public static int k(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (P33.b(i << 3) + 8);
    }

    public static int l(List list) {
        return list.size() * 8;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5855k43)) {
            int iA = 0;
            while (i < size) {
                iA += P33.A(((Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        C5855k43 c5855k43 = (C5855k43) list;
        int iA2 = 0;
        while (i < size) {
            iA2 += P33.A(c5855k43.m(i));
            i++;
        }
        return iA2;
    }

    public static int n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof G43)) {
            int iC = 0;
            while (i < size) {
                iC += P33.c(((Long) list.get(i)).longValue());
                i++;
            }
            return iC;
        }
        G43 g43 = (G43) list;
        int iC2 = 0;
        while (i < size) {
            iC2 += P33.c(g43.m(i));
            i++;
        }
        return iC2;
    }

    public static int o(int i, Object obj, InterfaceC7821r53 interfaceC7821r53) {
        return P33.b(i << 3) + P33.B((U43) obj, interfaceC7821r53);
    }

    public static int p(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5855k43)) {
            int iB = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iB += P33.b((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iB;
        }
        C5855k43 c5855k43 = (C5855k43) list;
        int iB2 = 0;
        while (i < size) {
            int iM = c5855k43.m(i);
            iB2 += P33.b((iM >> 31) ^ (iM + iM));
            i++;
        }
        return iB2;
    }

    public static int q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof G43)) {
            int iC = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iC += P33.c((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iC;
        }
        G43 g43 = (G43) list;
        int iC2 = 0;
        while (i < size) {
            long jM = g43.m(i);
            iC2 += P33.c((jM >> 63) ^ (jM + jM));
            i++;
        }
        return iC2;
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5855k43)) {
            int iB = 0;
            while (i < size) {
                iB += P33.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iB;
        }
        C5855k43 c5855k43 = (C5855k43) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += P33.b(c5855k43.m(i));
            i++;
        }
        return iB2;
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof G43)) {
            int iC = 0;
            while (i < size) {
                iC += P33.c(((Long) list.get(i)).longValue());
                i++;
            }
            return iC;
        }
        G43 g43 = (G43) list;
        int iC2 = 0;
        while (i < size) {
            iC2 += P33.c(g43.m(i));
            i++;
        }
        return iC2;
    }

    public static AbstractC9223w53 t() {
        return b;
    }

    public static AbstractC9223w53 u() {
        return c;
    }

    public static Object v(Object obj, int i, List list, InterfaceC6701n43 interfaceC6701n43, Object obj2, AbstractC9223w53 abstractC9223w53) {
        if (interfaceC6701n43 == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!interfaceC6701n43.c(iIntValue)) {
                    obj2 = w(obj, i, iIntValue, obj2, abstractC9223w53);
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
            if (interfaceC6701n43.c(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = w(obj, i, iIntValue2, obj2, abstractC9223w53);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    public static Object w(Object obj, int i, int i2, Object obj2, AbstractC9223w53 abstractC9223w53) {
        if (obj2 == null) {
            obj2 = abstractC9223w53.c(obj);
        }
        abstractC9223w53.l(obj2, i, i2);
        return obj2;
    }

    public static void x(AbstractC9223w53 abstractC9223w53, Object obj, Object obj2) {
        abstractC9223w53.o(obj, abstractC9223w53.e(abstractC9223w53.d(obj), abstractC9223w53.d(obj2)));
    }

    public static void y(Class cls) {
        Class cls2;
        if (!AbstractC4449f43.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean z(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
