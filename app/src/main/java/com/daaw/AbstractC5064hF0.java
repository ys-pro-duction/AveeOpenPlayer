package com.daaw;

import com.daaw.AbstractC6977o40;

/* JADX INFO: renamed from: com.daaw.hF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5064hF0 {
    public static final AbstractC6977o40.a a = AbstractC6977o40.a.a("nm", "p", "s", "r", "hd");

    public static C4496fF0 a(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        String strR = null;
        X6 x6B = null;
        O6 o6I = null;
        I6 i6E = null;
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
                i6E = Y6.e(abstractC6977o40, c0737Ee0);
            } else if (iO0 != 4) {
                abstractC6977o40.q0();
            } else {
                zS = abstractC6977o40.s();
            }
        }
        return new C4496fF0(strR, x6B, o6I, i6E, zS);
    }
}
