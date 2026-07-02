package com.daaw;

import com.daaw.AbstractC6977o40;
import com.daaw.C1069Hj0;

/* JADX INFO: renamed from: com.daaw.Jj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1277Jj0 {
    public static final AbstractC6977o40.a a = AbstractC6977o40.a.a("nm", "mm", "hd");

    public static C1069Hj0 a(AbstractC6977o40 abstractC6977o40) {
        String strR = null;
        C1069Hj0.a aVarA = null;
        boolean zS = false;
        while (abstractC6977o40.o()) {
            int iO0 = abstractC6977o40.o0(a);
            if (iO0 == 0) {
                strR = abstractC6977o40.R();
            } else if (iO0 == 1) {
                aVarA = C1069Hj0.a.a(abstractC6977o40.I());
            } else if (iO0 != 2) {
                abstractC6977o40.p0();
                abstractC6977o40.q0();
            } else {
                zS = abstractC6977o40.s();
            }
        }
        return new C1069Hj0(strR, aVarA, zS);
    }
}
