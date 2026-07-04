package com.daaw;

import com.daaw.AbstractC6977o40;

/* JADX INFO: loaded from: classes.dex */
public abstract class U6 {
    public static final AbstractC6977o40.a a = AbstractC6977o40.a.a("a");
    public static final AbstractC6977o40.a b = AbstractC6977o40.a.a("fc", "sc", "sw", "t");

    public static T6 a(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        abstractC6977o40.d();
        T6 t6B = null;
        while (abstractC6977o40.o()) {
            if (abstractC6977o40.o0(a) != 0) {
                abstractC6977o40.p0();
                abstractC6977o40.q0();
            } else {
                t6B = b(abstractC6977o40, c0737Ee0);
            }
        }
        abstractC6977o40.l();
        return t6B == null ? new T6(null, null, null, null) : t6B;
    }

    public static T6 b(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        abstractC6977o40.d();
        H6 h6C = null;
        H6 h6C2 = null;
        I6 i6E = null;
        I6 i6E2 = null;
        while (abstractC6977o40.o()) {
            int iO0 = abstractC6977o40.o0(b);
            if (iO0 == 0) {
                h6C = Y6.c(abstractC6977o40, c0737Ee0);
            } else if (iO0 == 1) {
                h6C2 = Y6.c(abstractC6977o40, c0737Ee0);
            } else if (iO0 == 2) {
                i6E = Y6.e(abstractC6977o40, c0737Ee0);
            } else if (iO0 != 3) {
                abstractC6977o40.p0();
                abstractC6977o40.q0();
            } else {
                i6E2 = Y6.e(abstractC6977o40, c0737Ee0);
            }
        }
        abstractC6977o40.l();
        return new T6(h6C, h6C2, i6E, i6E2);
    }
}
