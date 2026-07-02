package com.daaw;

import com.daaw.AbstractC6977o40;

/* JADX INFO: renamed from: com.daaw.Xk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2759Xk {
    public static final AbstractC6977o40.a a = AbstractC6977o40.a.a("nm", "p", "s", "hd", "d");

    public static C2655Wk a(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0, int i) {
        boolean z = i == 3;
        String strR = null;
        X6 x6B = null;
        O6 o6I = null;
        boolean zS = false;
        while (abstractC6977o40.o()) {
            int iO0 = abstractC6977o40.o0(a);
            if (iO0 == 0) {
                strR = abstractC6977o40.R();
            } else if (iO0 == 1) {
                x6B = N6.b(abstractC6977o40, c0737Ee0);
            } else if (iO0 == 2) {
                o6I = Y6.i(abstractC6977o40, c0737Ee0);
            } else if (iO0 == 3) {
                zS = abstractC6977o40.s();
            } else if (iO0 != 4) {
                abstractC6977o40.p0();
                abstractC6977o40.q0();
            } else {
                z = abstractC6977o40.I() == 3;
            }
        }
        return new C2655Wk(strR, x6B, o6I, z, zS);
    }
}
