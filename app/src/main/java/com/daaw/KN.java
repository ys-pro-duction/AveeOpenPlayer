package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class KN implements InterfaceC1696Nk0, InterfaceC1385Kk0 {
    public final NQ B;
    public KN C;
    public final C8565tm0 D;
    public final C8565tm0 E;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4252eO.values().length];
            iArr[EnumC4252eO.Active.ordinal()] = 1;
            iArr[EnumC4252eO.ActiveParent.ordinal()] = 2;
            iArr[EnumC4252eO.Captured.ordinal()] = 3;
            iArr[EnumC4252eO.DeactivatedParent.ordinal()] = 4;
            iArr[EnumC4252eO.Deactivated.ordinal()] = 5;
            iArr[EnumC4252eO.Inactive.ordinal()] = 6;
            a = iArr;
        }
    }

    public KN(NQ nq) {
        G10.g(nq, "onFocusEvent");
        this.B = nq;
        this.D = new C8565tm0(new KN[16], 0);
        this.E = new C8565tm0(new SN[16], 0);
    }

    private final void c(C8565tm0 c8565tm0) {
        C8565tm0 c8565tm02 = this.E;
        c8565tm02.e(c8565tm02.r(), c8565tm0);
        KN kn = this.C;
        if (kn != null) {
            kn.c(c8565tm0);
        }
    }

    private final void k(C8565tm0 c8565tm0) {
        this.E.x(c8565tm0);
        KN kn = this.C;
        if (kn != null) {
            kn.k(c8565tm0);
        }
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    public final void a(SN sn) {
        G10.g(sn, "focusModifier");
        this.E.d(sn);
        KN kn = this.C;
        if (kn != null) {
            kn.a(sn);
        }
    }

    @Override // com.daaw.InterfaceC1385Kk0
    public void e(InterfaceC1904Pk0 interfaceC1904Pk0) {
        G10.g(interfaceC1904Pk0, "scope");
        KN kn = (KN) interfaceC1904Pk0.a(JN.a());
        if (!G10.c(kn, this.C)) {
            KN kn2 = this.C;
            if (kn2 != null) {
                kn2.D.w(this);
                kn2.k(this.E);
            }
            this.C = kn;
            if (kn != null) {
                kn.D.d(this);
                kn.c(this.E);
            }
        }
        this.C = (KN) interfaceC1904Pk0.a(JN.a());
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object f(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.c(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0) {
        return AbstractC0969Gk0.a(this, interfaceC1073Hk0);
    }

    @Override // com.daaw.InterfaceC1696Nk0
    public C6732nB0 getKey() {
        return JN.a();
    }

    public final void h() {
        if (this.E.t()) {
            this.B.invoke(EnumC4252eO.Inactive);
        }
    }

    public final void i() {
        EnumC4252eO enumC4252eOL;
        Boolean bool;
        int iR = this.E.r();
        if (iR != 0) {
            int i = 0;
            if (iR != 1) {
                C8565tm0 c8565tm0 = this.E;
                int iR2 = c8565tm0.r();
                SN sn = null;
                Boolean bool2 = null;
                if (iR2 > 0) {
                    Object[] objArrQ = c8565tm0.q();
                    SN sn2 = null;
                    do {
                        SN sn3 = (SN) objArrQ[i];
                        switch (a.a[sn3.l().ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                bool2 = Boolean.FALSE;
                                sn2 = sn3;
                                break;
                            case 5:
                                if (bool2 == null) {
                                    bool2 = Boolean.TRUE;
                                }
                                break;
                            case 6:
                                bool2 = Boolean.FALSE;
                                break;
                        }
                        i++;
                    } while (i < iR2);
                    bool = bool2;
                    sn = sn2;
                } else {
                    bool = null;
                }
                if (sn == null || (enumC4252eOL = sn.l()) == null) {
                    enumC4252eOL = G10.c(bool, Boolean.TRUE) ? EnumC4252eO.Deactivated : EnumC4252eO.Inactive;
                }
            } else {
                enumC4252eOL = ((SN) this.E.q()[0]).l();
            }
        } else {
            enumC4252eOL = EnumC4252eO.Inactive;
        }
        this.B.invoke(enumC4252eOL);
        KN kn = this.C;
        if (kn != null) {
            kn.i();
        }
    }

    public final void j(SN sn) {
        G10.g(sn, "focusModifier");
        this.E.w(sn);
        KN kn = this.C;
        if (kn != null) {
            kn.j(sn);
        }
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC1696Nk0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public KN getValue() {
        return this;
    }
}
