package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class VE0 implements QN0, UE0 {
    public int a;
    public C1715Np b;
    public C4445f4 c;
    public InterfaceC3429bR d;
    public int e;
    public UX f;
    public VX g;

    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ int C;
        public final /* synthetic */ UX D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, UX ux) {
            super(1);
            this.C = i;
            this.D = ux;
        }

        public final void a(InterfaceC1196Ip interfaceC1196Ip) {
            G10.g(interfaceC1196Ip, "composition");
            if (VE0.this.e == this.C && G10.c(this.D, VE0.this.f) && (interfaceC1196Ip instanceof C1715Np)) {
                UX ux = this.D;
                int i = this.C;
                VE0 ve0 = VE0.this;
                int iE = ux.e();
                int i2 = 0;
                for (int i3 = 0; i3 < iE; i3++) {
                    Object obj = ux.d()[i3];
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                    }
                    int i4 = ux.f()[i3];
                    boolean z = i4 != i;
                    if (z) {
                        C1715Np c1715Np = (C1715Np) interfaceC1196Ip;
                        c1715Np.E(obj, ve0);
                        InterfaceC10305zz interfaceC10305zz = obj instanceof InterfaceC10305zz ? (InterfaceC10305zz) obj : null;
                        if (interfaceC10305zz != null) {
                            c1715Np.D(interfaceC10305zz);
                            VX vx = ve0.g;
                            if (vx != null) {
                                vx.i(interfaceC10305zz);
                                if (vx.f() == 0) {
                                    ve0.g = null;
                                }
                            }
                        }
                    }
                    if (!z) {
                        if (i2 != i3) {
                            ux.d()[i2] = obj;
                            ux.f()[i2] = i4;
                        }
                        i2++;
                    }
                }
                int iE2 = ux.e();
                for (int i5 = i2; i5 < iE2; i5++) {
                    ux.d()[i5] = null;
                }
                ux.g(i2);
                if (this.D.e() == 0) {
                    VE0.this.f = null;
                }
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC1196Ip) obj);
            return G91.a;
        }
    }

    public VE0(C1715Np c1715Np) {
        this.b = c1715Np;
    }

    public final void A(C4445f4 c4445f4) {
        this.c = c4445f4;
    }

    public final void B(boolean z) {
        if (z) {
            this.a |= 2;
        } else {
            this.a &= -3;
        }
    }

    public final void C(boolean z) {
        if (z) {
            this.a |= 4;
        } else {
            this.a &= -5;
        }
    }

    public final void D(boolean z) {
        if (z) {
            this.a |= 8;
        } else {
            this.a &= -9;
        }
    }

    public final void E(boolean z) {
        if (z) {
            this.a |= 32;
        } else {
            this.a &= -33;
        }
    }

    public final void F(boolean z) {
        if (z) {
            this.a |= 16;
        } else {
            this.a &= -17;
        }
    }

    public final void G(boolean z) {
        if (z) {
            this.a |= 1;
        } else {
            this.a &= -2;
        }
    }

    public final void H(int i) {
        this.e = i;
        F(false);
    }

    @Override // com.daaw.QN0
    public void a(InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC3429bR, "block");
        this.d = interfaceC3429bR;
    }

    public final void g(C1715Np c1715Np) {
        G10.g(c1715Np, "composition");
        this.b = c1715Np;
    }

    public final void h(InterfaceC5781jp interfaceC5781jp) {
        G91 g91;
        G10.g(interfaceC5781jp, "composer");
        InterfaceC3429bR interfaceC3429bR = this.d;
        if (interfaceC3429bR != null) {
            interfaceC3429bR.invoke(interfaceC5781jp, 1);
            g91 = G91.a;
        } else {
            g91 = null;
        }
        if (g91 == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
    }

    public final NQ i(int i) {
        UX ux = this.f;
        if (ux != null && !q()) {
            int iE = ux.e();
            for (int i2 = 0; i2 < iE; i2++) {
                if (ux.d()[i2] == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                }
                if (ux.f()[i2] != i) {
                    return new a(i, ux);
                }
            }
        }
        return null;
    }

    @Override // com.daaw.UE0
    public void invalidate() {
        C1715Np c1715Np = this.b;
        if (c1715Np != null) {
            c1715Np.A(this, null);
        }
    }

    public final C4445f4 j() {
        return this.c;
    }

    public final boolean k() {
        return this.d != null;
    }

    public final C1715Np l() {
        return this.b;
    }

    public final boolean m() {
        return (this.a & 2) != 0;
    }

    public final boolean n() {
        return (this.a & 4) != 0;
    }

    public final boolean o() {
        return (this.a & 8) != 0;
    }

    public final boolean p() {
        return (this.a & 32) != 0;
    }

    public final boolean q() {
        return (this.a & 16) != 0;
    }

    public final boolean r() {
        return (this.a & 1) != 0;
    }

    public final boolean s() {
        if (this.b != null) {
            C4445f4 c4445f4 = this.c;
            if (c4445f4 != null ? c4445f4.b() : false) {
                return true;
            }
        }
        return false;
    }

    public final U10 t(Object obj) {
        U10 u10A;
        C1715Np c1715Np = this.b;
        return (c1715Np == null || (u10A = c1715Np.A(this, obj)) == null) ? U10.IGNORED : u10A;
    }

    public final boolean u() {
        return this.g != null;
    }

    public final boolean v(WX wx) {
        VX vx;
        if (wx != null && (vx = this.g) != null && wx.v()) {
            if (wx.isEmpty()) {
                return false;
            }
            for (Object obj : wx) {
                if (!(obj instanceof InterfaceC10305zz) || !G10.c(vx.d(obj), ((InterfaceC10305zz) obj).f())) {
                }
            }
            return false;
        }
        return true;
    }

    public final void w(Object obj) {
        G10.g(obj, "instance");
        if (p()) {
            return;
        }
        UX ux = this.f;
        if (ux == null) {
            ux = new UX();
            this.f = ux;
        }
        ux.a(obj, this.e);
        if (obj instanceof InterfaceC10305zz) {
            VX vx = this.g;
            if (vx == null) {
                vx = new VX(0, 1, null);
                this.g = vx;
            }
            vx.j(obj, ((InterfaceC10305zz) obj).f());
        }
    }

    public final void x() {
        this.b = null;
        this.f = null;
        this.g = null;
    }

    public final void y() {
        UX ux;
        C1715Np c1715Np = this.b;
        if (c1715Np == null || (ux = this.f) == null) {
            return;
        }
        E(true);
        try {
            int iE = ux.e();
            for (int i = 0; i < iE; i++) {
                Object obj = ux.d()[i];
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                }
                int i2 = ux.f()[i];
                c1715Np.e(obj);
            }
            E(false);
        } catch (Throwable th) {
            E(false);
            throw th;
        }
    }

    public final void z() {
        F(true);
    }
}
