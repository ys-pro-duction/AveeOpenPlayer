package com.daaw;

/* JADX INFO: renamed from: com.daaw.sq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8306sq0 extends AbstractC6399m00 implements InterfaceC8027rq0 {
    public final NQ C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8306sq0(NQ nq, NQ nq2) {
        super(nq2);
        G10.g(nq, "callback");
        G10.g(nq2, "inspectorInfo");
        this.C = nq;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8306sq0) {
            return G10.c(this.C, ((C8306sq0) obj).C);
        }
        return false;
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
        return this.C.hashCode();
    }

    @Override // com.daaw.InterfaceC8027rq0
    public void r(InterfaceC7002o90 interfaceC7002o90) {
        G10.g(interfaceC7002o90, "coordinates");
        this.C.invoke(interfaceC7002o90);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }
}
