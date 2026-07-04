package com.daaw;

/* JADX INFO: renamed from: com.daaw.kO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5937kO implements InterfaceC1385Kk0, InterfaceC8027rq0 {
    public NQ B;
    public InterfaceC7002o90 C;

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    public final void a() {
        NQ nq;
        InterfaceC7002o90 interfaceC7002o90 = this.C;
        if (interfaceC7002o90 != null) {
            G10.d(interfaceC7002o90);
            if (!interfaceC7002o90.C() || (nq = this.B) == null) {
                return;
            }
            nq.invoke(this.C);
        }
    }

    @Override // com.daaw.InterfaceC1385Kk0
    public void e(InterfaceC1904Pk0 interfaceC1904Pk0) {
        NQ nq;
        G10.g(interfaceC1904Pk0, "scope");
        NQ nq2 = (NQ) interfaceC1904Pk0.a(AbstractC5658jO.a());
        if (nq2 == null && (nq = this.B) != null) {
            nq.invoke(null);
        }
        this.B = nq2;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object f(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.c(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0) {
        return AbstractC0969Gk0.a(this, interfaceC1073Hk0);
    }

    @Override // com.daaw.InterfaceC8027rq0
    public void r(InterfaceC7002o90 interfaceC7002o90) {
        G10.g(interfaceC7002o90, "coordinates");
        this.C = interfaceC7002o90;
        if (interfaceC7002o90.C()) {
            a();
            return;
        }
        NQ nq = this.B;
        if (nq != null) {
            nq.invoke(null);
        }
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }
}
