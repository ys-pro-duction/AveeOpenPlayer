package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class LE0 extends AbstractC3720cU0 {
    public final NQ g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LE0(int i, C4566fU0 c4566fU0, NQ nq) {
        super(i, c4566fU0, null);
        G10.g(c4566fU0, "invalid");
        this.g = nq;
        this.h = 1;
    }

    @Override // com.daaw.AbstractC3720cU0
    public void d() {
        if (e()) {
            return;
        }
        m(this);
        super.d();
    }

    @Override // com.daaw.AbstractC3720cU0
    public NQ h() {
        return this.g;
    }

    @Override // com.daaw.AbstractC3720cU0
    public boolean i() {
        return true;
    }

    @Override // com.daaw.AbstractC3720cU0
    public NQ j() {
        return null;
    }

    @Override // com.daaw.AbstractC3720cU0
    public void l(AbstractC3720cU0 abstractC3720cU0) {
        G10.g(abstractC3720cU0, "snapshot");
        this.h++;
    }

    @Override // com.daaw.AbstractC3720cU0
    public void m(AbstractC3720cU0 abstractC3720cU0) {
        G10.g(abstractC3720cU0, "snapshot");
        int i = this.h - 1;
        this.h = i;
        if (i == 0) {
            b();
        }
    }

    @Override // com.daaw.AbstractC3720cU0
    public void o(InterfaceC10170zW0 interfaceC10170zW0) {
        G10.g(interfaceC10170zW0, "state");
        AbstractC5124hU0.R();
        throw new D80();
    }

    @Override // com.daaw.AbstractC3720cU0
    public AbstractC3720cU0 v(NQ nq) {
        AbstractC5124hU0.Y(this);
        return new C8291sn0(f(), g(), nq, this);
    }

    @Override // com.daaw.AbstractC3720cU0
    public void n() {
    }
}
