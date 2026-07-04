package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class HD implements FD {
    public final C7708qi B;
    public final NQ C;

    public HD(C7708qi c7708qi, NQ nq) {
        G10.g(c7708qi, "cacheDrawScope");
        G10.g(nq, "onBuildDrawCache");
        this.B = c7708qi;
        this.C = nq;
    }

    @Override // com.daaw.KD
    public void G(InterfaceC2995Zr interfaceC2995Zr) {
        G10.g(interfaceC2995Zr, "<this>");
        MD mdB = this.B.b();
        G10.d(mdB);
        mdB.a().invoke(interfaceC2995Zr);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    @Override // com.daaw.FD
    public void K(InterfaceC7981rh interfaceC7981rh) {
        G10.g(interfaceC7981rh, "params");
        C7708qi c7708qi = this.B;
        c7708qi.f(interfaceC7981rh);
        c7708qi.g(null);
        this.C.invoke(c7708qi);
        if (c7708qi.b() == null) {
            throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HD)) {
            return false;
        }
        HD hd = (HD) obj;
        return G10.c(this.B, hd.B) && G10.c(this.C, hd.C);
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
        return (this.B.hashCode() * 31) + this.C.hashCode();
    }

    public String toString() {
        return "DrawContentCacheModifier(cacheDrawScope=" + this.B + ", onBuildDrawCache=" + this.C + ')';
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }
}
