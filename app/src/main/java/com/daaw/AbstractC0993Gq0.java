package com.daaw;

import com.daaw.Cif;
import com.daaw.HN;
import java.util.Comparator;

/* JADX INFO: renamed from: com.daaw.Gq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0993Gq0 {

    /* JADX INFO: renamed from: com.daaw.Gq0$a */
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

    /* JADX INFO: renamed from: com.daaw.Gq0$b */
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
            boolean zI = AbstractC0993Gq0.i(this.B, this.C, this.D, this.E);
            Boolean boolValueOf = Boolean.valueOf(zI);
            if (zI || !aVar.a()) {
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

    /* JADX INFO: renamed from: com.daaw.Gq0$c */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            E90 e90X0;
            E90 e90X02;
            K90 k90Q = ((SN) obj).q();
            Integer numValueOf = null;
            Integer numValueOf2 = (k90Q == null || (e90X02 = k90Q.X0()) == null) ? null : Integer.valueOf(e90X02.m0());
            K90 k90Q2 = ((SN) obj2).q();
            if (k90Q2 != null && (e90X0 = k90Q2.X0()) != null) {
                numValueOf = Integer.valueOf(e90X0.m0());
            }
            return AbstractC1188In.a(numValueOf2, numValueOf);
        }
    }

    public static final boolean b(SN sn, NQ nq) {
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
                        return b(snM, nq) || ((Boolean) nq.invoke(snM)).booleanValue();
                    case 2:
                        return b(snM, nq) || d(sn, snM, HN.b.f(), nq);
                    case 3:
                    case 4:
                        return d(sn, snM, HN.b.f(), nq);
                    case 5:
                    case 6:
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    default:
                        throw new C6902no0();
                }
            case 3:
            case 4:
            case 5:
                return g(sn, nq);
            case 6:
                return g(sn, nq) || ((Boolean) nq.invoke(sn)).booleanValue();
            default:
                throw new C6902no0();
        }
    }

    public static final boolean c(SN sn, NQ nq) {
        switch (a.a[sn.l().ordinal()]) {
            case 1:
            case 2:
                SN snM = sn.m();
                if (snM != null) {
                    return c(snM, nq) || d(sn, snM, HN.b.d(), nq);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            case 3:
            case 4:
            case 5:
                return h(sn, nq);
            case 6:
                return ((Boolean) nq.invoke(sn)).booleanValue();
            default:
                throw new C6902no0();
        }
    }

    public static final boolean d(SN sn, SN sn2, int i, NQ nq) {
        if (i(sn, sn2, i, nq)) {
            return true;
        }
        Boolean bool = (Boolean) AbstractC6010kf.a(sn, i, new b(sn, sn2, i, nq));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean e(SN sn) {
        return sn.s() == null;
    }

    public static final boolean f(SN sn, int i, NQ nq) {
        G10.g(sn, "$this$oneDimensionalFocusSearch");
        G10.g(nq, "onFound");
        HN.a aVar = HN.b;
        if (HN.l(i, aVar.d())) {
            return c(sn, nq);
        }
        if (HN.l(i, aVar.f())) {
            return b(sn, nq);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search");
    }

    public static final boolean g(SN sn, NQ nq) {
        j(sn.h());
        C8565tm0 c8565tm0H = sn.h();
        int iR = c8565tm0H.r();
        if (iR <= 0) {
            return false;
        }
        int i = iR - 1;
        Object[] objArrQ = c8565tm0H.q();
        do {
            SN sn2 = (SN) objArrQ[i];
            if (AbstractC5099hO.g(sn2) && b(sn2, nq)) {
                return true;
            }
            i--;
        } while (i >= 0);
        return false;
    }

    public static final boolean h(SN sn, NQ nq) {
        j(sn.h());
        C8565tm0 c8565tm0H = sn.h();
        int iR = c8565tm0H.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0H.q();
            int i = 0;
            do {
                SN sn2 = (SN) objArrQ[i];
                if (AbstractC5099hO.g(sn2) && c(sn2, nq)) {
                    return true;
                }
                i++;
            } while (i < iR);
        }
        return false;
    }

    public static final boolean i(SN sn, SN sn2, int i, NQ nq) {
        if (sn.l() != EnumC4252eO.ActiveParent && sn.l() != EnumC4252eO.DeactivatedParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        j(sn.h());
        HN.a aVar = HN.b;
        if (HN.l(i, aVar.d())) {
            C8565tm0 c8565tm0H = sn.h();
            H00 h00 = new H00(0, c8565tm0H.r() - 1);
            int iP = h00.p();
            int iS = h00.s();
            if (iP <= iS) {
                boolean z = false;
                while (true) {
                    if (z) {
                        SN sn3 = (SN) c8565tm0H.q()[iP];
                        if (AbstractC5099hO.g(sn3) && c(sn3, nq)) {
                            return true;
                        }
                    }
                    if (G10.c(c8565tm0H.q()[iP], sn2)) {
                        z = true;
                    }
                    if (iP == iS) {
                        break;
                    }
                    iP++;
                }
            }
        } else {
            if (!HN.l(i, aVar.f())) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            C8565tm0 c8565tm0H2 = sn.h();
            H00 h002 = new H00(0, c8565tm0H2.r() - 1);
            int iP2 = h002.p();
            int iS2 = h002.s();
            if (iP2 <= iS2) {
                boolean z2 = false;
                while (true) {
                    if (z2) {
                        SN sn4 = (SN) c8565tm0H2.q()[iS2];
                        if (AbstractC5099hO.g(sn4) && b(sn4, nq)) {
                            return true;
                        }
                    }
                    if (G10.c(c8565tm0H2.q()[iS2], sn2)) {
                        z2 = true;
                    }
                    if (iS2 == iP2) {
                        break;
                    }
                    iS2--;
                }
            }
        }
        if (HN.l(i, HN.b.d()) || sn.l() == EnumC4252eO.DeactivatedParent || e(sn)) {
            return false;
        }
        return ((Boolean) nq.invoke(sn)).booleanValue();
    }

    public static final void j(C8565tm0 c8565tm0) {
        c8565tm0.E(new c());
    }
}
