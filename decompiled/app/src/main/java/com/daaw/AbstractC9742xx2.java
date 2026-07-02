package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.xx2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9742xx2 {
    public static final Class a;
    public static final AbstractC9550xG2 b;
    public static final AbstractC9550xG2 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        AbstractC9550xG2 abstractC9550xG2 = null;
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
                abstractC9550xG2 = (AbstractC9550xG2) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = abstractC9550xG2;
        c = new EH2();
    }

    public static void A(int i, List list, InterfaceC10148zQ2 interfaceC10148zQ2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10148zQ2.r(i, list, z);
    }

    public static void B(int i, List list, InterfaceC10148zQ2 interfaceC10148zQ2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10148zQ2.k(i, list, z);
    }

    public static void C(int i, List list, InterfaceC10148zQ2 interfaceC10148zQ2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10148zQ2.h(i, list, z);
    }

    public static void D(int i, List list, InterfaceC10148zQ2 interfaceC10148zQ2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10148zQ2.n(i, list, z);
    }

    public static void E(int i, List list, InterfaceC10148zQ2 interfaceC10148zQ2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10148zQ2.s(i, list, z);
    }

    public static void F(int i, List list, InterfaceC10148zQ2 interfaceC10148zQ2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10148zQ2.i(i, list, z);
    }

    public static void G(int i, List list, InterfaceC10148zQ2 interfaceC10148zQ2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10148zQ2.q(i, list, z);
    }

    public static void a(int i, List list, InterfaceC10148zQ2 interfaceC10148zQ2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10148zQ2.v(i, list, z);
    }

    public static void b(int i, List list, InterfaceC10148zQ2 interfaceC10148zQ2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10148zQ2.x(i, list, z);
    }

    public static void c(int i, List list, InterfaceC10148zQ2 interfaceC10148zQ2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10148zQ2.A(i, list, z);
    }

    public static void d(int i, List list, InterfaceC10148zQ2 interfaceC10148zQ2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10148zQ2.H(i, list, z);
    }

    public static void e(int i, List list, InterfaceC10148zQ2 interfaceC10148zQ2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10148zQ2.w(i, list, z);
    }

    public static void f(int i, List list, InterfaceC10148zQ2 interfaceC10148zQ2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10148zQ2.D(i, list, z);
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5854k42)) {
            int iX = 0;
            while (i < size) {
                iX += AbstractC5392iR1.x(((Integer) list.get(i)).intValue());
                i++;
            }
            return iX;
        }
        C5854k42 c5854k42 = (C5854k42) list;
        int iX2 = 0;
        while (i < size) {
            iX2 += AbstractC5392iR1.x(c5854k42.m(i));
            i++;
        }
        return iX2;
    }

    public static int i(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC5392iR1.w(i << 3) + 4);
    }

    public static int j(List list) {
        return list.size() * 4;
    }

    public static int k(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC5392iR1.w(i << 3) + 8);
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
        if (!(list instanceof C5854k42)) {
            int iX = 0;
            while (i < size) {
                iX += AbstractC5392iR1.x(((Integer) list.get(i)).intValue());
                i++;
            }
            return iX;
        }
        C5854k42 c5854k42 = (C5854k42) list;
        int iX2 = 0;
        while (i < size) {
            iX2 += AbstractC5392iR1.x(c5854k42.m(i));
            i++;
        }
        return iX2;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1586Mi2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iX = 0;
        for (int i = 0; i < size; i++) {
            iX += AbstractC5392iR1.x(((Long) list.get(i)).longValue());
        }
        return iX;
    }

    public static int o(int i, Object obj, InterfaceC7500pw2 interfaceC7500pw2) {
        return AbstractC5392iR1.w(i << 3) + AbstractC5392iR1.u((InterfaceC7467pp2) obj, interfaceC7500pw2);
    }

    public static int p(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5854k42)) {
            int iW = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iW += AbstractC5392iR1.w((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iW;
        }
        C5854k42 c5854k42 = (C5854k42) list;
        int iW2 = 0;
        while (i < size) {
            int iM = c5854k42.m(i);
            iW2 += AbstractC5392iR1.w((iM >> 31) ^ (iM + iM));
            i++;
        }
        return iW2;
    }

    public static int q(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1586Mi2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iX = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iX += AbstractC5392iR1.x((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iX;
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5854k42)) {
            int iW = 0;
            while (i < size) {
                iW += AbstractC5392iR1.w(((Integer) list.get(i)).intValue());
                i++;
            }
            return iW;
        }
        C5854k42 c5854k42 = (C5854k42) list;
        int iW2 = 0;
        while (i < size) {
            iW2 += AbstractC5392iR1.w(c5854k42.m(i));
            i++;
        }
        return iW2;
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1586Mi2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iX = 0;
        for (int i = 0; i < size; i++) {
            iX += AbstractC5392iR1.x(((Long) list.get(i)).longValue());
        }
        return iX;
    }

    public static AbstractC9550xG2 t() {
        return b;
    }

    public static AbstractC9550xG2 u() {
        return c;
    }

    public static Object v(Object obj, int i, int i2, Object obj2, AbstractC9550xG2 abstractC9550xG2) {
        if (obj2 == null) {
            obj2 = abstractC9550xG2.c(obj);
        }
        abstractC9550xG2.f(obj2, i, i2);
        return obj2;
    }

    public static void w(AbstractC4850gV1 abstractC4850gV1, Object obj, Object obj2) {
        GX1 gx1B = abstractC4850gV1.b(obj2);
        if (gx1B.a.isEmpty()) {
            return;
        }
        abstractC4850gV1.c(obj).f(gx1B);
    }

    public static void x(AbstractC9550xG2 abstractC9550xG2, Object obj, Object obj2) {
        abstractC9550xG2.h(obj, abstractC9550xG2.e(abstractC9550xG2.d(obj), abstractC9550xG2.d(obj2)));
    }

    public static void y(Class cls) {
        Class cls2;
        if (!F32.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void z(int i, List list, InterfaceC10148zQ2 interfaceC10148zQ2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10148zQ2.f(i, list, z);
    }
}
