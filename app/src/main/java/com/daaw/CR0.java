package com.daaw;

import com.daaw.AbstractC6977o40;
import com.daaw.BR0;

/* JADX INFO: loaded from: classes.dex */
public abstract class CR0 {
    public static final AbstractC6977o40.a a = AbstractC6977o40.a.a("s", "e", "o", "nm", "m", "hd");

    public static BR0 a(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        String strR = null;
        BR0.a aVarA = null;
        I6 i6F = null;
        I6 i6F2 = null;
        I6 i6F3 = null;
        boolean zS = false;
        while (abstractC6977o40.o()) {
            int iO0 = abstractC6977o40.o0(a);
            if (iO0 == 0) {
                i6F = Y6.f(abstractC6977o40, c0737Ee0, false);
            } else if (iO0 == 1) {
                i6F2 = Y6.f(abstractC6977o40, c0737Ee0, false);
            } else if (iO0 == 2) {
                i6F3 = Y6.f(abstractC6977o40, c0737Ee0, false);
            } else if (iO0 == 3) {
                strR = abstractC6977o40.R();
            } else if (iO0 == 4) {
                aVarA = BR0.a.a(abstractC6977o40.I());
            } else if (iO0 != 5) {
                abstractC6977o40.q0();
            } else {
                zS = abstractC6977o40.s();
            }
        }
        return new BR0(strR, aVarA, i6F, i6F2, i6F3, zS);
    }
}
