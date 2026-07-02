package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class SN extends AbstractC6399m00 implements InterfaceC1385Kk0, InterfaceC1696Nk0, InterfaceC1516Lr0, InterfaceC9429wq0 {
    public static final b Q = new b(null);
    public static final NQ R = a.B;
    public SN C;
    public final C8565tm0 D;
    public EnumC4252eO E;
    public SN F;
    public KN G;
    public FN H;
    public InterfaceC1904Pk0 I;
    public YN J;
    public final VN K;
    public C3695cO L;
    public K90 M;
    public boolean N;
    public Q70 O;
    public final C8565tm0 P;

    public static final class a extends AbstractC4192e90 implements NQ {
        public static final a B = new a();

        public a() {
            super(1);
        }

        public final void a(SN sn) {
            G10.g(sn, "focusModifier");
            XN.d(sn);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SN) obj);
            return G91.a;
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final NQ a() {
            return SN.R;
        }

        public b() {
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4252eO.values().length];
            iArr[EnumC4252eO.Active.ordinal()] = 1;
            iArr[EnumC4252eO.Captured.ordinal()] = 2;
            iArr[EnumC4252eO.ActiveParent.ordinal()] = 3;
            iArr[EnumC4252eO.DeactivatedParent.ordinal()] = 4;
            iArr[EnumC4252eO.Deactivated.ordinal()] = 5;
            iArr[EnumC4252eO.Inactive.ordinal()] = 6;
            a = iArr;
        }
    }

    public /* synthetic */ SN(EnumC4252eO enumC4252eO, NQ nq, int i, AbstractC2911Yw abstractC2911Yw) {
        this(enumC4252eO, (i & 2) != 0 ? AbstractC5550j00.a() : nq);
    }

    public final void A(InterfaceC1904Pk0 interfaceC1904Pk0) {
        G10.g(interfaceC1904Pk0, "<set-?>");
        this.I = interfaceC1904Pk0;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    public final Cif d() {
        return null;
    }

    @Override // com.daaw.InterfaceC1385Kk0
    public void e(InterfaceC1904Pk0 interfaceC1904Pk0) {
        C8565tm0 c8565tm0;
        C8565tm0 c8565tm02;
        K90 k90;
        E90 e90X0;
        InterfaceC1413Kr0 interfaceC1413Kr0K0;
        PN focusManager;
        G10.g(interfaceC1904Pk0, "scope");
        A(interfaceC1904Pk0);
        SN sn = (SN) interfaceC1904Pk0.a(TN.c());
        if (!G10.c(sn, this.C)) {
            if (sn == null) {
                int i = c.a[this.E.ordinal()];
                if ((i == 1 || i == 2) && (k90 = this.M) != null && (e90X0 = k90.X0()) != null && (interfaceC1413Kr0K0 = e90X0.k0()) != null && (focusManager = interfaceC1413Kr0K0.getFocusManager()) != null) {
                    focusManager.b(true);
                }
            }
            SN sn2 = this.C;
            if (sn2 != null && (c8565tm02 = sn2.D) != null) {
                c8565tm02.w(this);
            }
            if (sn != null && (c8565tm0 = sn.D) != null) {
                c8565tm0.d(this);
            }
        }
        this.C = sn;
        KN kn = (KN) interfaceC1904Pk0.a(JN.a());
        if (!G10.c(kn, this.G)) {
            KN kn2 = this.G;
            if (kn2 != null) {
                kn2.j(this);
            }
            if (kn != null) {
                kn.a(this);
            }
        }
        this.G = kn;
        C3695cO c3695cO = (C3695cO) interfaceC1904Pk0.a(AbstractC3417bO.b());
        if (!G10.c(c3695cO, this.L)) {
            C3695cO c3695cO2 = this.L;
            if (c3695cO2 != null) {
                c3695cO2.i(this);
            }
            if (c3695cO != null) {
                c3695cO.a(this);
            }
        }
        this.L = c3695cO;
        this.H = (FN) interfaceC1904Pk0.a(AbstractC3123aK0.b());
        AbstractC6314li0.a(interfaceC1904Pk0.a(AbstractC5731jf.a()));
        this.O = (Q70) interfaceC1904Pk0.a(R70.a());
        this.J = (YN) interfaceC1904Pk0.a(XN.c());
        XN.d(this);
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
        return TN.c();
    }

    public final C8565tm0 h() {
        return this.D;
    }

    public final KN i() {
        return this.G;
    }

    @Override // com.daaw.InterfaceC1516Lr0
    public boolean isValid() {
        return this.C != null;
    }

    public final VN j() {
        return this.K;
    }

    public final YN k() {
        return this.J;
    }

    public final EnumC4252eO l() {
        return this.E;
    }

    public final SN m() {
        return this.F;
    }

    public final C8565tm0 n() {
        return this.P;
    }

    @Override // com.daaw.InterfaceC9429wq0
    public void o(InterfaceC7002o90 interfaceC7002o90) {
        G10.g(interfaceC7002o90, "coordinates");
        boolean z = this.M == null;
        this.M = (K90) interfaceC7002o90;
        if (z) {
            XN.d(this);
        }
        if (this.N) {
            this.N = false;
            AbstractC4820gO.h(this);
        }
    }

    public final Q70 p() {
        return this.O;
    }

    public final K90 q() {
        return this.M;
    }

    public final SN s() {
        return this.C;
    }

    public final boolean u(C3402bK0 c3402bK0) {
        G10.g(c3402bK0, "event");
        FN fn = this.H;
        if (fn != null) {
            return fn.d(c3402bK0);
        }
        return false;
    }

    public final void v(boolean z) {
        this.N = z;
    }

    public final void w(EnumC4252eO enumC4252eO) {
        G10.g(enumC4252eO, "value");
        this.E = enumC4252eO;
        AbstractC4820gO.k(this);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }

    public final void z(SN sn) {
        this.F = sn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SN(EnumC4252eO enumC4252eO, NQ nq) {
        super(nq);
        G10.g(enumC4252eO, "initialFocus");
        G10.g(nq, "inspectorInfo");
        this.D = new C8565tm0(new SN[16], 0);
        this.E = enumC4252eO;
        this.K = new WN();
        this.P = new C8565tm0(new Q70[16], 0);
    }

    @Override // com.daaw.InterfaceC1696Nk0
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public SN getValue() {
        return this;
    }
}
