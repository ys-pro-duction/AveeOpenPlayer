package com.daaw;

/* JADX INFO: renamed from: com.daaw.uC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8687uC implements AG0 {
    public final NQ a;
    public InterfaceC8973vC b;

    public C8687uC(NQ nq) {
        G10.g(nq, "effect");
        this.a = nq;
    }

    @Override // com.daaw.AG0
    public void c() {
        InterfaceC8973vC interfaceC8973vC = this.b;
        if (interfaceC8973vC != null) {
            interfaceC8973vC.a();
        }
        this.b = null;
    }

    @Override // com.daaw.AG0
    public void d() {
        this.b = (InterfaceC8973vC) this.a.invoke(AbstractC8420tF.a);
    }

    @Override // com.daaw.AG0
    public void b() {
    }
}
