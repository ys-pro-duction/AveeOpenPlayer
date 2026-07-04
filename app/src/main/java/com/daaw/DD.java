package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class DD extends AbstractC6399m00 implements KD {
    public final NQ C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DD(NQ nq, NQ nq2) {
        super(nq2);
        G10.g(nq, "onDraw");
        G10.g(nq2, "inspectorInfo");
        this.C = nq;
    }

    @Override // com.daaw.KD
    public void G(InterfaceC2995Zr interfaceC2995Zr) {
        G10.g(interfaceC2995Zr, "<this>");
        this.C.invoke(interfaceC2995Zr);
        interfaceC2995Zr.g0();
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DD) {
            return G10.c(this.C, ((DD) obj).C);
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

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }
}
