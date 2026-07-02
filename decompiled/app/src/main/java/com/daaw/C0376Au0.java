package com.daaw;

/* JADX INFO: renamed from: com.daaw.Au0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0376Au0 implements InterfaceC1385Kk0 {
    public final NQ B;

    public C0376Au0(NQ nq) {
        G10.g(nq, "onPinnableParentAvailable");
        this.B = nq;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    @Override // com.daaw.InterfaceC1385Kk0
    public void e(InterfaceC1904Pk0 interfaceC1904Pk0) {
        G10.g(interfaceC1904Pk0, "scope");
        this.B.invoke(interfaceC1904Pk0.a(AbstractC0480Bu0.a()));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0376Au0) && G10.c(((C0376Au0) obj).B, this.B);
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
        return this.B.hashCode();
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }
}
