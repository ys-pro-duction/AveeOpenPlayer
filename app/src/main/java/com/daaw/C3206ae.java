package com.daaw;

/* JADX INFO: renamed from: com.daaw.ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3206ae extends AbstractC6399m00 implements KD {
    public final C2559Vm C;
    public final AbstractC2117Rg D;
    public final float E;
    public final InterfaceC5391iR0 F;
    public C9879yT0 G;
    public EnumC7560q90 H;
    public AbstractC8869ur0 I;

    public /* synthetic */ C3206ae(C2559Vm c2559Vm, AbstractC2117Rg abstractC2117Rg, float f, InterfaceC5391iR0 interfaceC5391iR0, NQ nq, AbstractC2911Yw abstractC2911Yw) {
        this(c2559Vm, abstractC2117Rg, f, interfaceC5391iR0, nq);
    }

    @Override // com.daaw.KD
    public void G(InterfaceC2995Zr interfaceC2995Zr) {
        G10.g(interfaceC2995Zr, "<this>");
        if (this.F == AbstractC4785gF0.a()) {
            d(interfaceC2995Zr);
        } else {
            c(interfaceC2995Zr);
        }
        interfaceC2995Zr.g0();
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    public final void c(InterfaceC2995Zr interfaceC2995Zr) {
        AbstractC8869ur0 abstractC8869ur0A;
        InterfaceC2995Zr interfaceC2995Zr2;
        if (C9879yT0.e(interfaceC2995Zr.a(), this.G) && interfaceC2995Zr.getLayoutDirection() == this.H) {
            abstractC8869ur0A = this.I;
            G10.d(abstractC8869ur0A);
        } else {
            abstractC8869ur0A = this.F.a(interfaceC2995Zr.a(), interfaceC2995Zr.getLayoutDirection(), interfaceC2995Zr);
        }
        AbstractC8869ur0 abstractC8869ur0 = abstractC8869ur0A;
        C2559Vm c2559Vm = this.C;
        if (c2559Vm != null) {
            c2559Vm.w();
            interfaceC2995Zr2 = interfaceC2995Zr;
            AbstractC9155vr0.e(interfaceC2995Zr2, abstractC8869ur0, this.C.w(), 0.0f, null, null, 0, 60, null);
        } else {
            interfaceC2995Zr2 = interfaceC2995Zr;
        }
        AbstractC2117Rg abstractC2117Rg = this.D;
        if (abstractC2117Rg != null) {
            AbstractC9155vr0.c(interfaceC2995Zr2, abstractC8869ur0, abstractC2117Rg, this.E, null, null, 0, 56, null);
        }
        this.I = abstractC8869ur0;
        this.G = C9879yT0.c(interfaceC2995Zr2.a());
    }

    public final void d(InterfaceC2995Zr interfaceC2995Zr) {
        C2559Vm c2559Vm = this.C;
        if (c2559Vm != null) {
            ND.h(interfaceC2995Zr, c2559Vm.w(), 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        AbstractC2117Rg abstractC2117Rg = this.D;
        if (abstractC2117Rg != null) {
            ND.g(interfaceC2995Zr, abstractC2117Rg, 0L, 0L, this.E, null, null, 0, 118, null);
        }
    }

    public boolean equals(Object obj) {
        C3206ae c3206ae = obj instanceof C3206ae ? (C3206ae) obj : null;
        return c3206ae != null && G10.c(this.C, c3206ae.C) && G10.c(this.D, c3206ae.D) && this.E == c3206ae.E && G10.c(this.F, c3206ae.F);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object f(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.c(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0) {
        return AbstractC0969Gk0.a(this, interfaceC1073Hk0);
    }

    public int hashCode() {
        C2559Vm c2559Vm = this.C;
        int iU = (c2559Vm != null ? C2559Vm.u(c2559Vm.w()) : 0) * 31;
        AbstractC2117Rg abstractC2117Rg = this.D;
        return ((((iU + (abstractC2117Rg != null ? abstractC2117Rg.hashCode() : 0)) * 31) + Float.floatToIntBits(this.E)) * 31) + this.F.hashCode();
    }

    public String toString() {
        return "Background(color=" + this.C + ", brush=" + this.D + ", alpha = " + this.E + ", shape=" + this.F + ')';
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }

    public /* synthetic */ C3206ae(C2559Vm c2559Vm, AbstractC2117Rg abstractC2117Rg, float f, InterfaceC5391iR0 interfaceC5391iR0, NQ nq, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? null : c2559Vm, (i & 2) != 0 ? null : abstractC2117Rg, (i & 4) != 0 ? 1.0f : f, interfaceC5391iR0, nq, null);
    }

    public C3206ae(C2559Vm c2559Vm, AbstractC2117Rg abstractC2117Rg, float f, InterfaceC5391iR0 interfaceC5391iR0, NQ nq) {
        super(nq);
        this.C = c2559Vm;
        this.D = abstractC2117Rg;
        this.E = f;
        this.F = interfaceC5391iR0;
    }
}
