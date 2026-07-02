package com.daaw;

import com.daaw.Cif;
import com.daaw.HN;

/* JADX INFO: renamed from: com.daaw.b71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3348b71 {

    /* JADX INFO: renamed from: com.daaw.b71$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4252eO.values().length];
            iArr[EnumC4252eO.ActiveParent.ordinal()] = 1;
            iArr[EnumC4252eO.DeactivatedParent.ordinal()] = 2;
            iArr[EnumC4252eO.Active.ordinal()] = 3;
            iArr[EnumC4252eO.Captured.ordinal()] = 4;
            iArr[EnumC4252eO.Deactivated.ordinal()] = 5;
            iArr[EnumC4252eO.Inactive.ordinal()] = 6;
            a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.daaw.b71$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ SN B;
        public final /* synthetic */ SN C;
        public final /* synthetic */ int D;
        public final /* synthetic */ NQ E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SN sn, SN sn2, int i, NQ nq) {
            super(1);
            this.B = sn;
            this.C = sn2;
            this.D = i;
            this.E = nq;
        }

        public final Boolean a(Cif.a aVar) {
            G10.g(aVar, "$this$searchBeyondBounds");
            boolean zP = AbstractC3348b71.p(this.B, this.C, this.D, this.E);
            Boolean boolValueOf = Boolean.valueOf(zP);
            if (zP || !aVar.a()) {
                return boolValueOf;
            }
            return null;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC6314li0.a(obj);
            return a(null);
        }
    }

    public static final SN b(SN sn) {
        if (sn.l() != EnumC4252eO.ActiveParent && sn.l() != EnumC4252eO.DeactivatedParent) {
            throw new IllegalStateException("Check failed.");
        }
        SN snB = AbstractC5099hO.b(sn);
        if (snB != null) {
            return snB;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    public static final boolean c(C3103aF0 c3103aF0, C3103aF0 c3103aF02, C3103aF0 c3103aF03, int i) {
        if (d(c3103aF03, i, c3103aF0) || !d(c3103aF02, i, c3103aF0)) {
            return false;
        }
        if (!e(c3103aF03, i, c3103aF0)) {
            return true;
        }
        HN.a aVar = HN.b;
        return HN.l(i, aVar.c()) || HN.l(i, aVar.g()) || f(c3103aF02, i, c3103aF0) < g(c3103aF03, i, c3103aF0);
    }

    public static final boolean d(C3103aF0 c3103aF0, int i, C3103aF0 c3103aF02) {
        HN.a aVar = HN.b;
        if (HN.l(i, aVar.c()) ? true : HN.l(i, aVar.g())) {
            return c3103aF0.c() > c3103aF02.i() && c3103aF0.i() < c3103aF02.c();
        }
        if (HN.l(i, aVar.h()) ? true : HN.l(i, aVar.a())) {
            return c3103aF0.g() > c3103aF02.f() && c3103aF0.f() < c3103aF02.g();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final boolean e(C3103aF0 c3103aF0, int i, C3103aF0 c3103aF02) {
        HN.a aVar = HN.b;
        if (HN.l(i, aVar.c())) {
            return c3103aF02.f() >= c3103aF0.g();
        }
        if (HN.l(i, aVar.g())) {
            return c3103aF02.g() <= c3103aF0.f();
        }
        if (HN.l(i, aVar.h())) {
            return c3103aF02.i() >= c3103aF0.c();
        }
        if (HN.l(i, aVar.a())) {
            return c3103aF02.c() <= c3103aF0.i();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final float f(C3103aF0 c3103aF0, int i, C3103aF0 c3103aF02) {
        float fI;
        float fC;
        float fI2;
        float fC2;
        float f;
        HN.a aVar = HN.b;
        if (!HN.l(i, aVar.c())) {
            if (HN.l(i, aVar.g())) {
                fI = c3103aF0.f();
                fC = c3103aF02.g();
            } else if (HN.l(i, aVar.h())) {
                fI2 = c3103aF02.i();
                fC2 = c3103aF0.c();
            } else {
                if (!HN.l(i, aVar.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                fI = c3103aF0.i();
                fC = c3103aF02.c();
            }
            f = fI - fC;
            return Math.max(0.0f, f);
        }
        fI2 = c3103aF02.f();
        fC2 = c3103aF0.g();
        f = fI2 - fC2;
        return Math.max(0.0f, f);
    }

    public static final float g(C3103aF0 c3103aF0, int i, C3103aF0 c3103aF02) {
        float fC;
        float fC2;
        float fI;
        float fI2;
        float f;
        HN.a aVar = HN.b;
        if (!HN.l(i, aVar.c())) {
            if (HN.l(i, aVar.g())) {
                fC = c3103aF0.g();
                fC2 = c3103aF02.g();
            } else if (HN.l(i, aVar.h())) {
                fI = c3103aF02.i();
                fI2 = c3103aF0.i();
            } else {
                if (!HN.l(i, aVar.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                fC = c3103aF0.c();
                fC2 = c3103aF02.c();
            }
            f = fC - fC2;
            return Math.max(1.0f, f);
        }
        fI = c3103aF02.f();
        fI2 = c3103aF0.f();
        f = fI - fI2;
        return Math.max(1.0f, f);
    }

    public static final C3103aF0 h(C3103aF0 c3103aF0) {
        return new C3103aF0(c3103aF0.g(), c3103aF0.c(), c3103aF0.g(), c3103aF0.c());
    }

    public static final SN i(C8565tm0 c8565tm0, C3103aF0 c3103aF0, int i) {
        C3103aF0 c3103aF0M;
        HN.a aVar = HN.b;
        if (HN.l(i, aVar.c())) {
            c3103aF0M = c3103aF0.m(c3103aF0.j() + 1, 0.0f);
        } else if (HN.l(i, aVar.g())) {
            c3103aF0M = c3103aF0.m(-(c3103aF0.j() + 1), 0.0f);
        } else if (HN.l(i, aVar.h())) {
            c3103aF0M = c3103aF0.m(0.0f, c3103aF0.e() + 1);
        } else {
            if (!HN.l(i, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            c3103aF0M = c3103aF0.m(0.0f, -(c3103aF0.e() + 1));
        }
        int iR = c8565tm0.r();
        SN sn = null;
        if (iR > 0) {
            Object[] objArrQ = c8565tm0.q();
            int i2 = 0;
            do {
                SN sn2 = (SN) objArrQ[i2];
                if (AbstractC5099hO.g(sn2)) {
                    C3103aF0 c3103aF0E = AbstractC5099hO.e(sn2);
                    if (k(c3103aF0E, c3103aF0M, c3103aF0, i)) {
                        sn = sn2;
                        c3103aF0M = c3103aF0E;
                    }
                }
                i2++;
            } while (i2 < iR);
        }
        return sn;
    }

    public static final boolean j(SN sn, SN sn2, int i, NQ nq) {
        if (p(sn, sn2, i, nq)) {
            return true;
        }
        Boolean bool = (Boolean) AbstractC6010kf.a(sn, i, new b(sn, sn2, i, nq));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean k(C3103aF0 c3103aF0, C3103aF0 c3103aF02, C3103aF0 c3103aF03, int i) {
        if (!l(c3103aF0, i, c3103aF03)) {
            return false;
        }
        if (l(c3103aF02, i, c3103aF03) && !c(c3103aF03, c3103aF0, c3103aF02, i)) {
            return !c(c3103aF03, c3103aF02, c3103aF0, i) && o(i, c3103aF03, c3103aF0) < o(i, c3103aF03, c3103aF02);
        }
        return true;
    }

    public static final boolean l(C3103aF0 c3103aF0, int i, C3103aF0 c3103aF02) {
        HN.a aVar = HN.b;
        if (HN.l(i, aVar.c())) {
            return (c3103aF02.g() > c3103aF0.g() || c3103aF02.f() >= c3103aF0.g()) && c3103aF02.f() > c3103aF0.f();
        }
        if (HN.l(i, aVar.g())) {
            return (c3103aF02.f() < c3103aF0.f() || c3103aF02.g() <= c3103aF0.f()) && c3103aF02.g() < c3103aF0.g();
        }
        if (HN.l(i, aVar.h())) {
            return (c3103aF02.c() > c3103aF0.c() || c3103aF02.i() >= c3103aF0.c()) && c3103aF02.i() > c3103aF0.i();
        }
        if (HN.l(i, aVar.a())) {
            return (c3103aF02.i() < c3103aF0.i() || c3103aF02.c() <= c3103aF0.i()) && c3103aF02.c() < c3103aF0.c();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final float m(C3103aF0 c3103aF0, int i, C3103aF0 c3103aF02) {
        float fI;
        float fC;
        float fI2;
        float fC2;
        float f;
        HN.a aVar = HN.b;
        if (!HN.l(i, aVar.c())) {
            if (HN.l(i, aVar.g())) {
                fI = c3103aF0.f();
                fC = c3103aF02.g();
            } else if (HN.l(i, aVar.h())) {
                fI2 = c3103aF02.i();
                fC2 = c3103aF0.c();
            } else {
                if (!HN.l(i, aVar.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                fI = c3103aF0.i();
                fC = c3103aF02.c();
            }
            f = fI - fC;
            return Math.max(0.0f, f);
        }
        fI2 = c3103aF02.f();
        fC2 = c3103aF0.g();
        f = fI2 - fC2;
        return Math.max(0.0f, f);
    }

    public static final float n(C3103aF0 c3103aF0, int i, C3103aF0 c3103aF02) {
        float f;
        float f2;
        float f3;
        float fJ;
        HN.a aVar = HN.b;
        if (HN.l(i, aVar.c()) ? true : HN.l(i, aVar.g())) {
            f = 2;
            f2 = c3103aF02.i() + (c3103aF02.e() / f);
            f3 = c3103aF0.i();
            fJ = c3103aF0.e();
        } else {
            if (!(HN.l(i, aVar.h()) ? true : HN.l(i, aVar.a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = 2;
            f2 = c3103aF02.f() + (c3103aF02.j() / f);
            f3 = c3103aF0.f();
            fJ = c3103aF0.j();
        }
        return f2 - (f3 + (fJ / f));
    }

    public static final long o(int i, C3103aF0 c3103aF0, C3103aF0 c3103aF02) {
        long jAbs = (long) Math.abs(m(c3103aF02, i, c3103aF0));
        long jAbs2 = (long) Math.abs(n(c3103aF02, i, c3103aF0));
        return (((long) 13) * jAbs * jAbs) + (jAbs2 * jAbs2);
    }

    public static final boolean p(SN sn, SN sn2, int i, NQ nq) {
        SN snI;
        C8565tm0 c8565tm0 = new C8565tm0(new SN[sn.h().r()], 0);
        c8565tm0.e(c8565tm0.r(), sn.h());
        while (c8565tm0.u() && (snI = i(c8565tm0, AbstractC5099hO.e(sn2), i)) != null) {
            if (!snI.l().h()) {
                return ((Boolean) nq.invoke(snI)).booleanValue();
            }
            if (j(snI, sn2, i, nq)) {
                return true;
            }
            c8565tm0.w(snI);
        }
        return false;
    }

    public static final C3103aF0 q(C3103aF0 c3103aF0) {
        return new C3103aF0(c3103aF0.f(), c3103aF0.i(), c3103aF0.f(), c3103aF0.i());
    }

    public static final boolean r(SN sn, int i, NQ nq) {
        C3103aF0 c3103aF0H;
        G10.g(sn, "$this$twoDimensionalFocusSearch");
        G10.g(nq, "onFound");
        EnumC4252eO enumC4252eOL = sn.l();
        int[] iArr = a.a;
        switch (iArr[enumC4252eOL.ordinal()]) {
            case 1:
            case 2:
                SN snM = sn.m();
                if (snM == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                switch (iArr[snM.l().ordinal()]) {
                    case 1:
                    case 2:
                        return r(snM, i, nq) || j(sn, b(snM), i, nq);
                    case 3:
                    case 4:
                        return j(sn, snM, i, nq);
                    case 5:
                    case 6:
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    default:
                        throw new C6902no0();
                }
            case 3:
            case 4:
                C8565tm0 c8565tm0A = AbstractC5099hO.a(sn);
                if (c8565tm0A.r() <= 1) {
                    SN sn2 = (SN) (c8565tm0A.t() ? null : c8565tm0A.q()[0]);
                    if (sn2 != null) {
                        return ((Boolean) nq.invoke(sn2)).booleanValue();
                    }
                    return false;
                }
                HN.a aVar = HN.b;
                if (HN.l(i, aVar.g()) ? true : HN.l(i, aVar.a())) {
                    c3103aF0H = q(AbstractC5099hO.e(sn));
                } else {
                    if (!(HN.l(i, aVar.c()) ? true : HN.l(i, aVar.h()))) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search");
                    }
                    c3103aF0H = h(AbstractC5099hO.e(sn));
                }
                SN snI = i(c8565tm0A, c3103aF0H, i);
                if (snI != null) {
                    return ((Boolean) nq.invoke(snI)).booleanValue();
                }
                return false;
            case 5:
                return false;
            case 6:
                return ((Boolean) nq.invoke(sn)).booleanValue();
            default:
                throw new C6902no0();
        }
    }
}
