package com.daaw;

import com.daaw.HN;

/* JADX INFO: renamed from: com.daaw.hO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5099hO {

    /* JADX INFO: renamed from: com.daaw.hO$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[EnumC7560q90.values().length];
            iArr[EnumC7560q90.Rtl.ordinal()] = 1;
            iArr[EnumC7560q90.Ltr.ordinal()] = 2;
            a = iArr;
            int[] iArr2 = new int[EnumC4252eO.values().length];
            iArr2[EnumC4252eO.Active.ordinal()] = 1;
            iArr2[EnumC4252eO.Captured.ordinal()] = 2;
            iArr2[EnumC4252eO.ActiveParent.ordinal()] = 3;
            iArr2[EnumC4252eO.DeactivatedParent.ordinal()] = 4;
            iArr2[EnumC4252eO.Inactive.ordinal()] = 5;
            iArr2[EnumC4252eO.Deactivated.ordinal()] = 6;
            b = iArr2;
        }
    }

    public static final C8565tm0 a(SN sn) {
        G10.g(sn, "<this>");
        C8565tm0 c8565tm0H = sn.h();
        int iR = c8565tm0H.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0H.q();
            int i = 0;
            int i2 = 0;
            while (!((SN) objArrQ[i2]).l().h()) {
                i2++;
                if (i2 >= iR) {
                }
            }
            C8565tm0 c8565tm0 = new C8565tm0(new SN[16], 0);
            C8565tm0 c8565tm0H2 = sn.h();
            int iR2 = c8565tm0H2.r();
            if (iR2 > 0) {
                Object[] objArrQ2 = c8565tm0H2.q();
                do {
                    SN sn2 = (SN) objArrQ2[i];
                    if (sn2.l().h()) {
                        c8565tm0.e(c8565tm0.r(), a(sn2));
                    } else {
                        c8565tm0.d(sn2);
                    }
                    i++;
                } while (i < iR2);
            }
            return c8565tm0;
        }
        return sn.h();
    }

    public static final SN b(SN sn) {
        G10.g(sn, "<this>");
        switch (a.b[sn.l().ordinal()]) {
            case 1:
            case 2:
                return sn;
            case 3:
            case 4:
                SN snM = sn.m();
                if (snM != null) {
                    return b(snM);
                }
                return null;
            case 5:
            case 6:
                return null;
            default:
                throw new C6902no0();
        }
    }

    public static final SN c(SN sn) {
        G10.g(sn, "<this>");
        SN snS = sn.s();
        if (snS == null) {
            return null;
        }
        switch (a.b[sn.l().ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                return c(snS);
            case 3:
                return sn;
            default:
                throw new C6902no0();
        }
    }

    public static final Q70 d(SN sn) {
        E90 e90X0;
        G10.g(sn, "<this>");
        K90 k90Q = sn.q();
        Q70 q70H = null;
        if (k90Q == null || (e90X0 = k90Q.X0()) == null) {
            return null;
        }
        C8565tm0 c8565tm0N = sn.n();
        int iR = c8565tm0N.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0N.q();
            int i = 0;
            do {
                Q70 q70 = (Q70) objArrQ[i];
                if (G10.c(q70.a(), e90X0)) {
                    q70H = h(q70, q70H);
                }
                i++;
            } while (i < iR);
        }
        return q70H != null ? q70H : sn.p();
    }

    public static final C3103aF0 e(SN sn) {
        C3103aF0 c3103aF0K;
        G10.g(sn, "<this>");
        K90 k90Q = sn.q();
        return (k90Q == null || (c3103aF0K = AbstractC7281p90.c(k90Q).K(k90Q, false)) == null) ? C3103aF0.e.a() : c3103aF0K;
    }

    public static final boolean f(SN sn, int i, EnumC7560q90 enumC7560q90, NQ nq) {
        int iC;
        G10.g(sn, "$this$focusSearch");
        G10.g(enumC7560q90, "layoutDirection");
        G10.g(nq, "onFound");
        HN.a aVar = HN.b;
        if (HN.l(i, aVar.d()) ? true : HN.l(i, aVar.f())) {
            return AbstractC0993Gq0.f(sn, i, nq);
        }
        if (HN.l(i, aVar.c()) ? true : HN.l(i, aVar.g()) ? true : HN.l(i, aVar.h()) ? true : HN.l(i, aVar.a())) {
            return AbstractC3348b71.r(sn, i, nq);
        }
        if (!HN.l(i, aVar.b())) {
            if (!HN.l(i, aVar.e())) {
                throw new IllegalStateException("Invalid FocusDirection");
            }
            SN snB = b(sn);
            SN snC = snB != null ? c(snB) : null;
            if (G10.c(snC, sn) || snC == null) {
                return false;
            }
            return ((Boolean) nq.invoke(snC)).booleanValue();
        }
        int i2 = a.a[enumC7560q90.ordinal()];
        if (i2 == 1) {
            iC = aVar.c();
        } else {
            if (i2 != 2) {
                throw new C6902no0();
            }
            iC = aVar.g();
        }
        SN snB2 = b(sn);
        if (snB2 != null) {
            return AbstractC3348b71.r(snB2, iC, nq);
        }
        return false;
    }

    public static final boolean g(SN sn) {
        E90 e90X0;
        K90 k90Q;
        E90 e90X02;
        G10.g(sn, "<this>");
        K90 k90Q2 = sn.q();
        return (k90Q2 == null || (e90X0 = k90Q2.X0()) == null || !e90X0.g() || (k90Q = sn.q()) == null || (e90X02 = k90Q.X0()) == null || !e90X02.C0()) ? false : true;
    }

    public static final Q70 h(Q70 q70, Q70 q702) {
        if (q702 == null) {
            return q70;
        }
        E90 e90A = q70.a();
        Q70 q70C = q702;
        while (!G10.c(q70C, q70)) {
            q70C = q70C.c();
            if (q70C == null || !G10.c(q70C.a(), e90A)) {
                return q70;
            }
        }
        return q702;
    }
}
