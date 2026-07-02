package com.daaw;

/* JADX INFO: renamed from: com.daaw.Hx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1124Hx implements InterfaceC3784ci0 {
    public final VV0 B;
    public final a C;
    public VH0 D;
    public InterfaceC3784ci0 E;

    /* JADX INFO: renamed from: com.daaw.Hx$a */
    public interface a {
        void c(C9457ww0 c9457ww0);
    }

    public C1124Hx(a aVar, InterfaceC5207hm interfaceC5207hm) {
        this.C = aVar;
        this.B = new VV0(interfaceC5207hm);
    }

    public final void a() {
        this.B.a(this.E.n());
        C9457ww0 c9457ww0G = this.E.g();
        if (c9457ww0G.equals(this.B.g())) {
            return;
        }
        this.B.d(c9457ww0G);
        this.C.c(c9457ww0G);
    }

    public final boolean b() {
        VH0 vh0 = this.D;
        if (vh0 == null || vh0.c()) {
            return false;
        }
        return this.D.a() || !this.D.i();
    }

    public void c(VH0 vh0) {
        if (vh0 == this.D) {
            this.E = null;
            this.D = null;
        }
    }

    @Override // com.daaw.InterfaceC3784ci0
    public C9457ww0 d(C9457ww0 c9457ww0) {
        InterfaceC3784ci0 interfaceC3784ci0 = this.E;
        if (interfaceC3784ci0 != null) {
            c9457ww0 = interfaceC3784ci0.d(c9457ww0);
        }
        this.B.d(c9457ww0);
        this.C.c(c9457ww0);
        return c9457ww0;
    }

    public void e(VH0 vh0) throws VI {
        InterfaceC3784ci0 interfaceC3784ci0;
        InterfaceC3784ci0 interfaceC3784ci0U = vh0.u();
        if (interfaceC3784ci0U == null || interfaceC3784ci0U == (interfaceC3784ci0 = this.E)) {
            return;
        }
        if (interfaceC3784ci0 != null) {
            throw VI.c(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.E = interfaceC3784ci0U;
        this.D = vh0;
        interfaceC3784ci0U.d(this.B.g());
        a();
    }

    public void f(long j) {
        this.B.a(j);
    }

    @Override // com.daaw.InterfaceC3784ci0
    public C9457ww0 g() {
        InterfaceC3784ci0 interfaceC3784ci0 = this.E;
        return interfaceC3784ci0 != null ? interfaceC3784ci0.g() : this.B.g();
    }

    public void h() {
        this.B.b();
    }

    public void i() {
        this.B.c();
    }

    public long j() {
        if (!b()) {
            return this.B.n();
        }
        a();
        return this.E.n();
    }

    @Override // com.daaw.InterfaceC3784ci0
    public long n() {
        return b() ? this.E.n() : this.B.n();
    }
}
