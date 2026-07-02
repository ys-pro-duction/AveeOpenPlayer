package com.daaw;

import com.daaw.AbstractC6977o40;

/* JADX INFO: renamed from: com.daaw.yR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9871yR0 {
    public static AbstractC6977o40.a a = AbstractC6977o40.a.a("nm", "ind", "ks", "hd");

    public static C9592xR0 a(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        String strR = null;
        Q6 q6K = null;
        int I = 0;
        boolean zS = false;
        while (abstractC6977o40.o()) {
            int iO0 = abstractC6977o40.o0(a);
            if (iO0 == 0) {
                strR = abstractC6977o40.R();
            } else if (iO0 == 1) {
                I = abstractC6977o40.I();
            } else if (iO0 == 2) {
                q6K = Y6.k(abstractC6977o40, c0737Ee0);
            } else if (iO0 != 3) {
                abstractC6977o40.q0();
            } else {
                zS = abstractC6977o40.s();
            }
        }
        return new C9592xR0(strR, I, q6K, zS);
    }
}
