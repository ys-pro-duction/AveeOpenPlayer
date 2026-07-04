package com.daaw;

/* JADX INFO: renamed from: com.daaw.r91, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7839r91 extends AbstractC5830k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7839r91(E90 e90) {
        super(e90);
        G10.g(e90, "root");
    }

    @Override // com.daaw.InterfaceC8783ua
    public void e(int i, int i2, int i3) {
        ((E90) a()).J0(i, i2, i3);
    }

    @Override // com.daaw.InterfaceC8783ua
    public void f(int i, int i2) {
        ((E90) a()).W0(i, i2);
    }

    @Override // com.daaw.AbstractC5830k, com.daaw.InterfaceC8783ua
    public void i() {
        super.i();
        InterfaceC1413Kr0 interfaceC1413Kr0K0 = ((E90) j()).k0();
        if (interfaceC1413Kr0K0 != null) {
            interfaceC1413Kr0K0.k();
        }
    }

    @Override // com.daaw.AbstractC5830k
    public void k() {
        ((E90) j()).V0();
    }

    @Override // com.daaw.InterfaceC8783ua
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void b(int i, E90 e90) {
        G10.g(e90, "instance");
        ((E90) a()).y0(i, e90);
    }

    @Override // com.daaw.InterfaceC8783ua
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void h(int i, E90 e90) {
        G10.g(e90, "instance");
    }
}
