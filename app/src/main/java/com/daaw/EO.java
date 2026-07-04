package com.daaw;

import com.daaw.AbstractC6977o40;

/* JADX INFO: loaded from: classes.dex */
public abstract class EO {
    public static final AbstractC6977o40.a a = AbstractC6977o40.a.a("fFamily", "fName", "fStyle", "ascent");

    public static C6504mO a(AbstractC6977o40 abstractC6977o40) {
        abstractC6977o40.d();
        String strR = null;
        String strR2 = null;
        String strR3 = null;
        float F = 0.0f;
        while (abstractC6977o40.o()) {
            int iO0 = abstractC6977o40.o0(a);
            if (iO0 == 0) {
                strR = abstractC6977o40.R();
            } else if (iO0 == 1) {
                strR2 = abstractC6977o40.R();
            } else if (iO0 == 2) {
                strR3 = abstractC6977o40.R();
            } else if (iO0 != 3) {
                abstractC6977o40.p0();
                abstractC6977o40.q0();
            } else {
                F = (float) abstractC6977o40.F();
            }
        }
        abstractC6977o40.l();
        return new C6504mO(strR, strR2, strR3, F);
    }
}
