package com.daaw;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class D51 extends C7729qm0 {
    public final C7729qm0 n;
    public final NQ o;
    public final NQ p;
    public final boolean q;

    public D51(C7729qm0 c7729qm0, NQ nq, NQ nq2, boolean z) {
        NQ nqJ;
        NQ nqH;
        super(0, C4566fU0.F.a(), AbstractC5124hU0.E(nq, (c7729qm0 == null || (nqH = c7729qm0.h()) == null) ? ((C7082oT) AbstractC5124hU0.i.get()).h() : nqH, z), AbstractC5124hU0.G(nq2, (c7729qm0 == null || (nqJ = c7729qm0.j()) == null) ? ((C7082oT) AbstractC5124hU0.i.get()).j() : nqJ));
        this.n = c7729qm0;
        this.o = nq;
        this.p = nq2;
        this.q = z;
    }

    @Override // com.daaw.C7729qm0
    public AbstractC3999dU0 A() {
        return Q().A();
    }

    @Override // com.daaw.C7729qm0
    public Set C() {
        return Q().C();
    }

    @Override // com.daaw.C7729qm0
    public void M(Set set) {
        AbstractC10162zU0.b();
        throw new D80();
    }

    @Override // com.daaw.C7729qm0
    public C7729qm0 N(NQ nq, NQ nq2) {
        NQ nqF = AbstractC5124hU0.F(nq, h(), false, 4, null);
        NQ nqG = AbstractC5124hU0.G(nq2, j());
        return !this.q ? new D51(Q().N(null, nqG), nqF, nqG, false) : Q().N(nqF, nqG);
    }

    public final C7729qm0 Q() {
        C7729qm0 c7729qm0 = this.n;
        if (c7729qm0 != null) {
            return c7729qm0;
        }
        Object obj = AbstractC5124hU0.i.get();
        G10.f(obj, "currentGlobalSnapshot.get()");
        return (C7729qm0) obj;
    }

    @Override // com.daaw.C7729qm0, com.daaw.AbstractC3720cU0
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public Void l(AbstractC3720cU0 abstractC3720cU0) {
        G10.g(abstractC3720cU0, "snapshot");
        AbstractC10162zU0.b();
        throw new D80();
    }

    @Override // com.daaw.C7729qm0, com.daaw.AbstractC3720cU0
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public Void m(AbstractC3720cU0 abstractC3720cU0) {
        G10.g(abstractC3720cU0, "snapshot");
        AbstractC10162zU0.b();
        throw new D80();
    }

    @Override // com.daaw.C7729qm0, com.daaw.AbstractC3720cU0
    public void d() {
        s(true);
    }

    @Override // com.daaw.AbstractC3720cU0
    public int f() {
        return Q().f();
    }

    @Override // com.daaw.AbstractC3720cU0
    public C4566fU0 g() {
        return Q().g();
    }

    @Override // com.daaw.C7729qm0, com.daaw.AbstractC3720cU0
    public boolean i() {
        return Q().i();
    }

    @Override // com.daaw.C7729qm0, com.daaw.AbstractC3720cU0
    public void n() {
        Q().n();
    }

    @Override // com.daaw.C7729qm0, com.daaw.AbstractC3720cU0
    public void o(InterfaceC10170zW0 interfaceC10170zW0) {
        G10.g(interfaceC10170zW0, "state");
        Q().o(interfaceC10170zW0);
    }

    @Override // com.daaw.AbstractC3720cU0
    public void t(int i) {
        AbstractC10162zU0.b();
        throw new D80();
    }

    @Override // com.daaw.AbstractC3720cU0
    public void u(C4566fU0 c4566fU0) {
        G10.g(c4566fU0, "value");
        AbstractC10162zU0.b();
        throw new D80();
    }

    @Override // com.daaw.C7729qm0, com.daaw.AbstractC3720cU0
    public AbstractC3720cU0 v(NQ nq) {
        return !this.q ? AbstractC5124hU0.y(Q().v(null), nq) : Q().v(AbstractC5124hU0.F(nq, h(), false, 4, null));
    }
}
