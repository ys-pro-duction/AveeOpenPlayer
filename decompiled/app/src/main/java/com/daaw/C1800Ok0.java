package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ok0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1800Ok0 implements LQ {
    public final E90 B;
    public final InterfaceC1696Nk0 C;
    public C1800Ok0 D;
    public C1800Ok0 E;
    public boolean F;
    public final C8565tm0 G;

    public C1800Ok0(E90 e90, InterfaceC1696Nk0 interfaceC1696Nk0) {
        G10.g(e90, "layoutNode");
        G10.g(interfaceC1696Nk0, "modifier");
        this.B = e90;
        this.C = interfaceC1696Nk0;
        this.G = new C8565tm0(new C1489Lk0[16], 0);
    }

    public final void a() {
        this.F = true;
        int i = 0;
        n(this.C.getKey(), false);
        C8565tm0 c8565tm0 = this.G;
        int iR = c8565tm0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0.q();
            do {
                ((C1489Lk0) objArrQ[i]).c();
                i++;
            } while (i < iR);
        }
    }

    public final void c() {
        this.F = true;
        InterfaceC1413Kr0 interfaceC1413Kr0K0 = this.B.k0();
        if (interfaceC1413Kr0K0 != null) {
            interfaceC1413Kr0K0.f(this);
        }
        C8565tm0 c8565tm0 = this.G;
        int iR = c8565tm0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0.q();
            int i = 0;
            do {
                ((C1489Lk0) objArrQ[i]).d();
                i++;
            } while (i < iR);
        }
    }

    public final void d() {
        this.F = false;
        C8565tm0 c8565tm0 = this.G;
        int iR = c8565tm0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0.q();
            int i = 0;
            do {
                ((C1489Lk0) objArrQ[i]).h();
                i++;
            } while (i < iR);
        }
        n(this.C.getKey(), false);
    }

    public final InterfaceC1696Nk0 h(AbstractC1281Jk0 abstractC1281Jk0) {
        C1800Ok0 c1800Ok0G0;
        InterfaceC1696Nk0 interfaceC1696Nk0H;
        G10.g(abstractC1281Jk0, "local");
        if (G10.c(this.C.getKey(), abstractC1281Jk0)) {
            return this.C;
        }
        C1800Ok0 c1800Ok0 = this.E;
        if (c1800Ok0 != null && (interfaceC1696Nk0H = c1800Ok0.h(abstractC1281Jk0)) != null) {
            return interfaceC1696Nk0H;
        }
        E90 e90L0 = this.B.l0();
        if (e90L0 == null || (c1800Ok0G0 = e90L0.g0()) == null) {
            return null;
        }
        return c1800Ok0G0.h(abstractC1281Jk0);
    }

    public final C8565tm0 i() {
        return this.G;
    }

    @Override // com.daaw.LQ
    public /* bridge */ /* synthetic */ Object invoke() {
        o();
        return G91.a;
    }

    public final E90 j() {
        return this.B;
    }

    public final InterfaceC1696Nk0 k() {
        return this.C;
    }

    public final C1800Ok0 l() {
        return this.D;
    }

    public final C1800Ok0 m() {
        return this.E;
    }

    public final void n(AbstractC1281Jk0 abstractC1281Jk0, boolean z) {
        G91 g91;
        C8565tm0 c8565tm0R0;
        int iR;
        if (z && G10.c(this.C.getKey(), abstractC1281Jk0)) {
            return;
        }
        C8565tm0 c8565tm0 = this.G;
        int iR2 = c8565tm0.r();
        int i = 0;
        if (iR2 > 0) {
            Object[] objArrQ = c8565tm0.q();
            int i2 = 0;
            do {
                ((C1489Lk0) objArrQ[i2]).k(abstractC1281Jk0);
                i2++;
            } while (i2 < iR2);
        }
        C1800Ok0 c1800Ok0 = this.D;
        if (c1800Ok0 != null) {
            c1800Ok0.n(abstractC1281Jk0, true);
            g91 = G91.a;
        } else {
            g91 = null;
        }
        if (g91 != null || (iR = (c8565tm0R0 = this.B.r0()).r()) <= 0) {
            return;
        }
        Object[] objArrQ2 = c8565tm0R0.q();
        do {
            ((E90) objArrQ2[i]).f0().n(abstractC1281Jk0, true);
            i++;
        } while (i < iR);
    }

    public void o() {
        if (this.F) {
            n(this.C.getKey(), false);
        }
    }

    public final void p(C1800Ok0 c1800Ok0) {
        this.D = c1800Ok0;
    }

    public final void q(C1800Ok0 c1800Ok0) {
        this.E = c1800Ok0;
    }
}
