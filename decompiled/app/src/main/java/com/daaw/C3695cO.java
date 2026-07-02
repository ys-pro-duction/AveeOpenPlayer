package com.daaw;

/* JADX INFO: renamed from: com.daaw.cO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3695cO implements InterfaceC1385Kk0, InterfaceC1696Nk0 {
    public final ZN B;
    public C3695cO C;
    public final C8565tm0 D;

    public C3695cO(ZN zn) {
        G10.g(zn, "focusRequester");
        this.B = zn;
        this.D = new C8565tm0(new SN[16], 0);
        zn.b().d(this);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    public final void a(SN sn) {
        G10.g(sn, "focusModifier");
        this.D.d(sn);
        C3695cO c3695cO = this.C;
        if (c3695cO != null) {
            c3695cO.a(sn);
        }
    }

    public final void c(C8565tm0 c8565tm0) {
        G10.g(c8565tm0, "newModifiers");
        C8565tm0 c8565tm02 = this.D;
        c8565tm02.e(c8565tm02.r(), c8565tm0);
        C3695cO c3695cO = this.C;
        if (c3695cO != null) {
            c3695cO.c(c8565tm0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.SN d() {
        /*
            r9 = this;
            com.daaw.tm0 r0 = r9.D
            int r1 = r0.r()
            r2 = 0
            if (r1 <= 0) goto L8a
            java.lang.Object[] r0 = r0.q()
            r3 = 0
        Le:
            r4 = r0[r3]
            com.daaw.SN r4 = (com.daaw.SN) r4
            if (r2 == 0) goto L85
            com.daaw.K90 r5 = r2.q()
            if (r5 == 0) goto L85
            com.daaw.E90 r5 = r5.X0()
            if (r5 != 0) goto L21
            goto L85
        L21:
            com.daaw.K90 r6 = r4.q()
            if (r6 == 0) goto L86
            com.daaw.E90 r6 = r6.X0()
            if (r6 != 0) goto L2e
            goto L86
        L2e:
            int r7 = r5.R()
            int r8 = r6.R()
            if (r7 <= r8) goto L40
            com.daaw.E90 r5 = r5.l0()
            com.daaw.G10.d(r5)
            goto L2e
        L40:
            int r7 = r6.R()
            int r8 = r5.R()
            if (r7 <= r8) goto L52
            com.daaw.E90 r6 = r6.l0()
            com.daaw.G10.d(r6)
            goto L40
        L52:
            com.daaw.E90 r7 = r5.l0()
            com.daaw.E90 r8 = r6.l0()
            boolean r7 = com.daaw.G10.c(r7, r8)
            if (r7 != 0) goto L6f
            com.daaw.E90 r5 = r5.l0()
            com.daaw.G10.d(r5)
            com.daaw.E90 r6 = r6.l0()
            com.daaw.G10.d(r6)
            goto L52
        L6f:
            com.daaw.E90 r7 = r5.l0()
            com.daaw.G10.d(r7)
            com.daaw.tm0 r7 = r7.r0()
            int r5 = r7.s(r5)
            int r6 = r7.s(r6)
            if (r5 >= r6) goto L85
            goto L86
        L85:
            r2 = r4
        L86:
            int r3 = r3 + 1
            if (r3 < r1) goto Le
        L8a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C3695cO.d():com.daaw.SN");
    }

    @Override // com.daaw.InterfaceC1385Kk0
    public void e(InterfaceC1904Pk0 interfaceC1904Pk0) {
        G10.g(interfaceC1904Pk0, "scope");
        C3695cO c3695cO = (C3695cO) interfaceC1904Pk0.a(AbstractC3417bO.b());
        if (G10.c(c3695cO, this.C)) {
            return;
        }
        C3695cO c3695cO2 = this.C;
        if (c3695cO2 != null) {
            c3695cO2.j(this.D);
        }
        if (c3695cO != null) {
            c3695cO.c(this.D);
        }
        this.C = c3695cO;
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
        return AbstractC3417bO.b();
    }

    public final void i(SN sn) {
        G10.g(sn, "focusModifier");
        this.D.w(sn);
        C3695cO c3695cO = this.C;
        if (c3695cO != null) {
            c3695cO.i(sn);
        }
    }

    public final void j(C8565tm0 c8565tm0) {
        G10.g(c8565tm0, "removedModifiers");
        this.D.x(c8565tm0);
        C3695cO c3695cO = this.C;
        if (c3695cO != null) {
            c3695cO.j(c8565tm0);
        }
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC1696Nk0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C3695cO getValue() {
        return this;
    }
}
