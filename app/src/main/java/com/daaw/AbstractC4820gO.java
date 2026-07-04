package com.daaw;

/* JADX INFO: renamed from: com.daaw.gO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4820gO {

    /* JADX INFO: renamed from: com.daaw.gO$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4252eO.values().length];
            iArr[EnumC4252eO.Active.ordinal()] = 1;
            iArr[EnumC4252eO.Captured.ordinal()] = 2;
            iArr[EnumC4252eO.Deactivated.ordinal()] = 3;
            iArr[EnumC4252eO.DeactivatedParent.ordinal()] = 4;
            iArr[EnumC4252eO.ActiveParent.ordinal()] = 5;
            iArr[EnumC4252eO.Inactive.ordinal()] = 6;
            a = iArr;
        }
    }

    public static final void a(SN sn) {
        G10.g(sn, "<this>");
        int i = a.a[sn.l().ordinal()];
        if (i == 3) {
            sn.w(EnumC4252eO.Inactive);
        } else {
            if (i != 4) {
                return;
            }
            sn.w(EnumC4252eO.ActiveParent);
        }
    }

    public static final boolean b(SN sn) {
        SN snM = sn.m();
        if (snM == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (!d(snM, false, 1, null)) {
            return false;
        }
        sn.z(null);
        return true;
    }

    public static final boolean c(SN sn, boolean z) {
        G10.g(sn, "<this>");
        switch (a.a[sn.l().ordinal()]) {
            case 1:
                sn.w(EnumC4252eO.Inactive);
                return true;
            case 2:
                if (z) {
                    sn.w(EnumC4252eO.Inactive);
                }
                return z;
            case 3:
            case 6:
                return true;
            case 4:
                if (!b(sn)) {
                    return false;
                }
                sn.w(EnumC4252eO.Deactivated);
                return true;
            case 5:
                if (!b(sn)) {
                    return false;
                }
                sn.w(EnumC4252eO.Inactive);
                return true;
            default:
                throw new C6902no0();
        }
    }

    public static /* synthetic */ boolean d(SN sn, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c(sn, z);
    }

    public static final void e(SN sn) {
        E90 e90X0;
        InterfaceC1413Kr0 interfaceC1413Kr0K0;
        PN focusManager;
        G10.g(sn, "<this>");
        int i = a.a[sn.l().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 5) {
                sn.w(EnumC4252eO.DeactivatedParent);
                return;
            } else {
                if (i != 6) {
                    return;
                }
                sn.w(EnumC4252eO.Deactivated);
                return;
            }
        }
        K90 k90Q = sn.q();
        if (k90Q != null && (e90X0 = k90Q.X0()) != null && (interfaceC1413Kr0K0 = e90X0.k0()) != null && (focusManager = interfaceC1413Kr0K0.getFocusManager()) != null) {
            focusManager.b(true);
        }
        sn.w(EnumC4252eO.Deactivated);
    }

    public static final void f(SN sn) {
        EnumC4252eO enumC4252eO;
        switch (a.a[sn.l().ordinal()]) {
            case 1:
            case 5:
            case 6:
                enumC4252eO = EnumC4252eO.Active;
                break;
            case 2:
                enumC4252eO = EnumC4252eO.Captured;
                break;
            case 3:
            case 4:
                throw new IllegalStateException("Granting focus to a deactivated node.");
            default:
                throw new C6902no0();
        }
        sn.w(enumC4252eO);
    }

    public static final boolean g(SN sn, SN sn2) {
        sn.z(sn2);
        f(sn2);
        return true;
    }

    public static final void h(SN sn) {
        E90 e90X0;
        G10.g(sn, "<this>");
        K90 k90Q = sn.q();
        if (((k90Q == null || (e90X0 = k90Q.X0()) == null) ? null : e90X0.k0()) == null) {
            sn.v(true);
        }
        switch (a.a[sn.l().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                k(sn);
                break;
            case 5:
                if (b(sn)) {
                    f(sn);
                }
                break;
            case 6:
                SN snS = sn.s();
                if (snS != null) {
                    i(snS, sn);
                } else if (j(sn)) {
                    f(sn);
                }
                break;
        }
    }

    public static final boolean i(SN sn, SN sn2) {
        if (!sn.h().m(sn2)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        switch (a.a[sn.l().ordinal()]) {
            case 1:
                sn.w(EnumC4252eO.ActiveParent);
                return g(sn, sn2);
            case 2:
                return false;
            case 3:
                a(sn);
                boolean zI = i(sn, sn2);
                e(sn);
                return zI;
            case 4:
                if (sn.m() == null) {
                    return g(sn, sn2);
                }
                if (b(sn)) {
                    return g(sn, sn2);
                }
                return false;
            case 5:
                if (b(sn)) {
                    return g(sn, sn2);
                }
                return false;
            case 6:
                SN snS = sn.s();
                if (snS == null && j(sn)) {
                    sn.w(EnumC4252eO.Active);
                    return i(sn, sn2);
                }
                if (snS == null || !i(snS, sn)) {
                    return false;
                }
                return i(sn, sn2);
            default:
                throw new C6902no0();
        }
    }

    public static final boolean j(SN sn) {
        E90 e90X0;
        InterfaceC1413Kr0 interfaceC1413Kr0K0;
        K90 k90Q = sn.q();
        if (k90Q == null || (e90X0 = k90Q.X0()) == null || (interfaceC1413Kr0K0 = e90X0.k0()) == null) {
            throw new IllegalStateException("Owner not initialized.");
        }
        return interfaceC1413Kr0K0.requestFocus();
    }

    public static final void k(SN sn) {
        G10.g(sn, "<this>");
        KN knI = sn.i();
        if (knI != null) {
            knI.i();
        }
    }
}
