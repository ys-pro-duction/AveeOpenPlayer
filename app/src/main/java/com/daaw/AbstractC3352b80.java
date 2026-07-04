package com.daaw;

import com.daaw.AbstractC6977o40;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.b80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3352b80 {
    public static AbstractC6977o40.a a = AbstractC6977o40.a.a("k");

    public static List a(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0, float f, InterfaceC0409Bc1 interfaceC0409Bc1, boolean z) {
        AbstractC6977o40 abstractC6977o402;
        C0737Ee0 c0737Ee02;
        float f2;
        InterfaceC0409Bc1 interfaceC0409Bc12;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (abstractC6977o40.W() == AbstractC6977o40.b.STRING) {
            c0737Ee0.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC6977o40.d();
        while (abstractC6977o40.o()) {
            if (abstractC6977o40.o0(a) != 0) {
                abstractC6977o40.q0();
            } else if (abstractC6977o40.W() == AbstractC6977o40.b.BEGIN_ARRAY) {
                abstractC6977o40.c();
                if (abstractC6977o40.W() == AbstractC6977o40.b.NUMBER) {
                    AbstractC6977o40 abstractC6977o403 = abstractC6977o40;
                    C0737Ee0 c0737Ee03 = c0737Ee0;
                    float f3 = f;
                    InterfaceC0409Bc1 interfaceC0409Bc13 = interfaceC0409Bc1;
                    boolean z3 = z;
                    Y70 y70C = AbstractC3073a80.c(abstractC6977o403, c0737Ee03, f3, interfaceC0409Bc13, false, z3);
                    abstractC6977o402 = abstractC6977o403;
                    c0737Ee02 = c0737Ee03;
                    f2 = f3;
                    interfaceC0409Bc12 = interfaceC0409Bc13;
                    z2 = z3;
                    arrayList.add(y70C);
                } else {
                    abstractC6977o402 = abstractC6977o40;
                    c0737Ee02 = c0737Ee0;
                    f2 = f;
                    interfaceC0409Bc12 = interfaceC0409Bc1;
                    z2 = z;
                    while (abstractC6977o402.o()) {
                        arrayList.add(AbstractC3073a80.c(abstractC6977o402, c0737Ee02, f2, interfaceC0409Bc12, true, z2));
                    }
                }
                abstractC6977o402.j();
                abstractC6977o40 = abstractC6977o402;
                c0737Ee0 = c0737Ee02;
                f = f2;
                interfaceC0409Bc1 = interfaceC0409Bc12;
                z = z2;
            } else {
                AbstractC6977o40 abstractC6977o404 = abstractC6977o40;
                arrayList.add(AbstractC3073a80.c(abstractC6977o404, c0737Ee0, f, interfaceC0409Bc1, false, z));
                abstractC6977o40 = abstractC6977o404;
            }
        }
        abstractC6977o40.l();
        b(arrayList);
        return arrayList;
    }

    public static void b(List list) {
        int i;
        Object obj;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            Y70 y70 = (Y70) list.get(i2);
            i2++;
            Y70 y702 = (Y70) list.get(i2);
            y70.h = Float.valueOf(y702.g);
            if (y70.c == null && (obj = y702.b) != null) {
                y70.c = obj;
                if (y70 instanceof C7764qt0) {
                    ((C7764qt0) y70).i();
                }
            }
        }
        Y70 y703 = (Y70) list.get(i);
        if ((y703.b == null || y703.c == null) && list.size() > 1) {
            list.remove(y703);
        }
    }
}
