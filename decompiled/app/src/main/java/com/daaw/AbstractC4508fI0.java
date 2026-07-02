package com.daaw;

import com.daaw.AbstractC6977o40;

/* JADX INFO: renamed from: com.daaw.fI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4508fI0 {
    public static final AbstractC6977o40.a a = AbstractC6977o40.a.a("nm", "c", "o", "tr", "hd");

    public static C3951dI0 a(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        String strR = null;
        I6 i6F = null;
        I6 i6F2 = null;
        V6 v6G = null;
        boolean zS = false;
        while (abstractC6977o40.o()) {
            int iO0 = abstractC6977o40.o0(a);
            if (iO0 == 0) {
                strR = abstractC6977o40.R();
            } else if (iO0 == 1) {
                i6F = Y6.f(abstractC6977o40, c0737Ee0, false);
            } else if (iO0 == 2) {
                i6F2 = Y6.f(abstractC6977o40, c0737Ee0, false);
            } else if (iO0 == 3) {
                v6G = W6.g(abstractC6977o40, c0737Ee0);
            } else if (iO0 != 4) {
                abstractC6977o40.q0();
            } else {
                zS = abstractC6977o40.s();
            }
        }
        return new C3951dI0(strR, i6F, i6F2, v6G, zS);
    }
}
