package com.daaw;

/* JADX INFO: renamed from: com.daaw.Qc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1977Qc1 extends AbstractC5830k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1977Qc1(AbstractC4034dc1 abstractC4034dc1) {
        super(abstractC4034dc1);
        G10.g(abstractC4034dc1, "root");
    }

    @Override // com.daaw.InterfaceC8783ua
    public void e(int i, int i2, int i3) {
        m((AbstractC4034dc1) a()).i(i, i2, i3);
    }

    @Override // com.daaw.InterfaceC8783ua
    public void f(int i, int i2) {
        m((AbstractC4034dc1) a()).j(i, i2);
    }

    @Override // com.daaw.AbstractC5830k
    public void k() {
        ZT ztM = m((AbstractC4034dc1) j());
        ztM.j(0, ztM.f());
    }

    public final ZT m(AbstractC4034dc1 abstractC4034dc1) {
        if (abstractC4034dc1 instanceof ZT) {
            return (ZT) abstractC4034dc1;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group");
    }

    @Override // com.daaw.InterfaceC8783ua
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void b(int i, AbstractC4034dc1 abstractC4034dc1) {
        G10.g(abstractC4034dc1, "instance");
    }

    @Override // com.daaw.InterfaceC8783ua
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void h(int i, AbstractC4034dc1 abstractC4034dc1) {
        G10.g(abstractC4034dc1, "instance");
        m((AbstractC4034dc1) a()).h(i, abstractC4034dc1);
    }
}
