package com.daaw;

import com.daaw.AbstractC6977o40;

/* JADX INFO: renamed from: com.daaw.kK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5922kK0 {
    public static final AbstractC6977o40.a a = AbstractC6977o40.a.a("nm", "r", "hd");

    public static C5363iK0 a(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        boolean zS = false;
        String strR = null;
        I6 i6F = null;
        while (abstractC6977o40.o()) {
            int iO0 = abstractC6977o40.o0(a);
            if (iO0 == 0) {
                strR = abstractC6977o40.R();
            } else if (iO0 == 1) {
                i6F = Y6.f(abstractC6977o40, c0737Ee0, true);
            } else if (iO0 != 2) {
                abstractC6977o40.q0();
            } else {
                zS = abstractC6977o40.s();
            }
        }
        if (zS) {
            return null;
        }
        return new C5363iK0(strR, i6F);
    }
}
