package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class E51 extends AbstractC3720cU0 {
    public final AbstractC3720cU0 g;
    public final boolean h;
    public final NQ i;
    public final NQ j;
    public final AbstractC3720cU0 k;

    public E51(AbstractC3720cU0 abstractC3720cU0, NQ nq, boolean z) {
        NQ nqH;
        super(0, C4566fU0.F.a(), null);
        this.g = abstractC3720cU0;
        this.h = z;
        this.i = AbstractC5124hU0.E(nq, (abstractC3720cU0 == null || (nqH = abstractC3720cU0.h()) == null) ? ((C7082oT) AbstractC5124hU0.i.get()).h() : nqH, z);
        this.k = this;
    }

    @Override // com.daaw.AbstractC3720cU0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Void m(AbstractC3720cU0 abstractC3720cU0) {
        G10.g(abstractC3720cU0, "snapshot");
        AbstractC10162zU0.b();
        throw new D80();
    }

    @Override // com.daaw.AbstractC3720cU0
    public void d() {
        s(true);
    }

    @Override // com.daaw.AbstractC3720cU0
    public int f() {
        return y().f();
    }

    @Override // com.daaw.AbstractC3720cU0
    public C4566fU0 g() {
        return y().g();
    }

    @Override // com.daaw.AbstractC3720cU0
    public NQ h() {
        return this.i;
    }

    @Override // com.daaw.AbstractC3720cU0
    public boolean i() {
        return y().i();
    }

    @Override // com.daaw.AbstractC3720cU0
    public NQ j() {
        return this.j;
    }

    @Override // com.daaw.AbstractC3720cU0
    public void n() {
        y().n();
    }

    @Override // com.daaw.AbstractC3720cU0
    public void o(InterfaceC10170zW0 interfaceC10170zW0) {
        G10.g(interfaceC10170zW0, "state");
        y().o(interfaceC10170zW0);
    }

    @Override // com.daaw.AbstractC3720cU0
    public AbstractC3720cU0 v(NQ nq) {
        return !this.h ? AbstractC5124hU0.y(y().v(null), nq) : y().v(AbstractC5124hU0.F(nq, h(), false, 4, null));
    }

    public final AbstractC3720cU0 y() {
        AbstractC3720cU0 abstractC3720cU0 = this.g;
        if (abstractC3720cU0 != null) {
            return abstractC3720cU0;
        }
        Object obj = AbstractC5124hU0.i.get();
        G10.f(obj, "currentGlobalSnapshot.get()");
        return (AbstractC3720cU0) obj;
    }

    @Override // com.daaw.AbstractC3720cU0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Void l(AbstractC3720cU0 abstractC3720cU0) {
        G10.g(abstractC3720cU0, "snapshot");
        AbstractC10162zU0.b();
        throw new D80();
    }
}
