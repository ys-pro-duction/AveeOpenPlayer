package com.daaw;

import com.daaw.AbstractC6977o40;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class N6 {
    public static final AbstractC6977o40.a a = AbstractC6977o40.a.a("k", "x", "y");

    public static M6 a(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        ArrayList arrayList = new ArrayList();
        if (abstractC6977o40.W() == AbstractC6977o40.b.BEGIN_ARRAY) {
            abstractC6977o40.c();
            while (abstractC6977o40.o()) {
                arrayList.add(AbstractC8321st0.a(abstractC6977o40, c0737Ee0));
            }
            abstractC6977o40.j();
            AbstractC3352b80.b(arrayList);
        } else {
            arrayList.add(new Y70(AbstractC8936v40.e(abstractC6977o40, AbstractC0301Ab1.e())));
        }
        return new M6(arrayList);
    }

    public static X6 b(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        abstractC6977o40.d();
        M6 m6A = null;
        I6 i6E = null;
        I6 i6E2 = null;
        boolean z = false;
        while (abstractC6977o40.W() != AbstractC6977o40.b.END_OBJECT) {
            int iO0 = abstractC6977o40.o0(a);
            if (iO0 == 0) {
                m6A = a(abstractC6977o40, c0737Ee0);
            } else if (iO0 != 1) {
                if (iO0 != 2) {
                    abstractC6977o40.p0();
                    abstractC6977o40.q0();
                } else if (abstractC6977o40.W() == AbstractC6977o40.b.STRING) {
                    abstractC6977o40.q0();
                    z = true;
                } else {
                    i6E2 = Y6.e(abstractC6977o40, c0737Ee0);
                }
            } else if (abstractC6977o40.W() == AbstractC6977o40.b.STRING) {
                abstractC6977o40.q0();
                z = true;
            } else {
                i6E = Y6.e(abstractC6977o40, c0737Ee0);
            }
        }
        abstractC6977o40.l();
        if (z) {
            c0737Ee0.a("Lottie doesn't support expressions.");
        }
        return m6A != null ? m6A : new R6(i6E, i6E2);
    }
}
