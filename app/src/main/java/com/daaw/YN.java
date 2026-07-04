package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class YN extends AbstractC6399m00 implements InterfaceC1385Kk0, InterfaceC1696Nk0 {
    public final NQ C;
    public final InterfaceC8007rm0 D;
    public final C6732nB0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YN(NQ nq, NQ nq2) {
        super(nq2);
        G10.g(nq, "focusPropertiesScope");
        G10.g(nq2, "inspectorInfo");
        this.C = nq;
        this.D = AbstractC9046vU0.d(null, null, 2, null);
        this.E = XN.c();
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    public final void c(VN vn) {
        G10.g(vn, "focusProperties");
        this.C.invoke(vn);
        YN ynD = d();
        if (ynD != null) {
            ynD.c(vn);
        }
    }

    public final YN d() {
        return (YN) this.D.getValue();
    }

    @Override // com.daaw.InterfaceC1385Kk0
    public void e(InterfaceC1904Pk0 interfaceC1904Pk0) {
        G10.g(interfaceC1904Pk0, "scope");
        i((YN) interfaceC1904Pk0.a(XN.c()));
    }

    public boolean equals(Object obj) {
        return (obj instanceof YN) && G10.c(this.C, ((YN) obj).C);
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
        return this.E;
    }

    public int hashCode() {
        return this.C.hashCode();
    }

    public final void i(YN yn) {
        this.D.setValue(yn);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC1696Nk0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public YN getValue() {
        return this;
    }
}
