package com.daaw;

import com.daaw.AbstractC6977o40;
import com.daaw.C0596Cx0;

/* JADX INFO: renamed from: com.daaw.Dx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0709Dx0 {
    public static final AbstractC6977o40.a a = AbstractC6977o40.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    public static C0596Cx0 a(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0, int i) {
        boolean z = i == 3;
        String strR = null;
        C0596Cx0.a aVarA = null;
        I6 i6F = null;
        X6 x6B = null;
        I6 i6F2 = null;
        I6 i6E = null;
        I6 i6E2 = null;
        I6 i6F3 = null;
        I6 i6F4 = null;
        boolean zS = false;
        while (abstractC6977o40.o()) {
            switch (abstractC6977o40.o0(a)) {
                case 0:
                    strR = abstractC6977o40.R();
                    break;
                case 1:
                    aVarA = C0596Cx0.a.a(abstractC6977o40.I());
                    break;
                case 2:
                    i6F = Y6.f(abstractC6977o40, c0737Ee0, false);
                    break;
                case 3:
                    x6B = N6.b(abstractC6977o40, c0737Ee0);
                    break;
                case 4:
                    i6F2 = Y6.f(abstractC6977o40, c0737Ee0, false);
                    break;
                case 5:
                    i6E2 = Y6.e(abstractC6977o40, c0737Ee0);
                    break;
                case 6:
                    i6F4 = Y6.f(abstractC6977o40, c0737Ee0, false);
                    break;
                case 7:
                    i6E = Y6.e(abstractC6977o40, c0737Ee0);
                    break;
                case 8:
                    i6F3 = Y6.f(abstractC6977o40, c0737Ee0, false);
                    break;
                case 9:
                    zS = abstractC6977o40.s();
                    break;
                case 10:
                    z = abstractC6977o40.I() == 3;
                    break;
                default:
                    abstractC6977o40.p0();
                    abstractC6977o40.q0();
                    break;
            }
        }
        return new C0596Cx0(strR, aVarA, i6F, x6B, i6F2, i6E, i6E2, i6F3, i6F4, zS, z);
    }
}
