package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Qp3 extends AbstractC6920nr3 {
    public final boolean l;
    public final Q42 m;
    public final H32 n;
    public Op3 o;
    public Np3 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public Qp3(Xp3 xp3, boolean z) {
        boolean z2;
        super(xp3);
        if (z) {
            xp3.zzv();
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new Q42();
        this.n = new H32();
        xp3.k();
        this.o = Op3.q(xp3.g());
    }

    @Override // com.daaw.AbstractC6920nr3
    public final Vp3 E(Vp3 vp3) {
        Object obj = this.o.h;
        Object obj2 = vp3.a;
        if (obj != null && this.o.h.equals(obj2)) {
            obj2 = Op3.i;
        }
        return vp3.a(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    @Override // com.daaw.AbstractC6920nr3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(com.daaw.AbstractC8657u52 r15) {
        /*
            r14 = this;
            boolean r0 = r14.r
            r1 = 0
            if (r0 == 0) goto L1a
            com.daaw.Op3 r0 = r14.o
            com.daaw.Op3 r15 = r0.p(r15)
            r14.o = r15
            com.daaw.Np3 r15 = r14.p
            if (r15 == 0) goto L9b
            long r2 = r15.c()
            r14.K(r2)
            goto L9b
        L1a:
            boolean r0 = r15.o()
            if (r0 == 0) goto L36
            boolean r0 = r14.s
            if (r0 == 0) goto L2b
            com.daaw.Op3 r0 = r14.o
            com.daaw.Op3 r15 = r0.p(r15)
            goto L33
        L2b:
            java.lang.Object r0 = com.daaw.Q42.p
            java.lang.Object r2 = com.daaw.Op3.i
            com.daaw.Op3 r15 = com.daaw.Op3.r(r15, r0, r2)
        L33:
            r14.o = r15
            goto L9b
        L36:
            com.daaw.Q42 r0 = r14.m
            r2 = 0
            r3 = 0
            r15.e(r2, r0, r3)
            com.daaw.Q42 r0 = r14.m
            java.lang.Object r0 = r0.a
            com.daaw.Np3 r5 = r14.p
            if (r5 == 0) goto L62
            long r6 = r5.j()
            com.daaw.Op3 r8 = r14.o
            com.daaw.H32 r9 = r14.n
            com.daaw.Vp3 r5 = r5.B
            java.lang.Object r5 = r5.a
            r8.n(r5, r9)
            com.daaw.Op3 r5 = r14.o
            com.daaw.Q42 r8 = r14.m
            r5.e(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L62
            r12 = r6
            goto L63
        L62:
            r12 = r3
        L63:
            com.daaw.Q42 r9 = r14.m
            com.daaw.H32 r10 = r14.n
            r11 = 0
            r8 = r15
            android.util.Pair r15 = r8.l(r9, r10, r11, r12)
            java.lang.Object r2 = r15.first
            java.lang.Object r15 = r15.second
            java.lang.Long r15 = (java.lang.Long) r15
            long r3 = r15.longValue()
            boolean r15 = r14.s
            if (r15 == 0) goto L82
            com.daaw.Op3 r15 = r14.o
            com.daaw.Op3 r15 = r15.p(r8)
            goto L86
        L82:
            com.daaw.Op3 r15 = com.daaw.Op3.r(r8, r0, r2)
        L86:
            r14.o = r15
            com.daaw.Np3 r15 = r14.p
            if (r15 == 0) goto L9b
            r14.K(r3)
            com.daaw.Vp3 r15 = r15.B
            java.lang.Object r0 = r15.a
            java.lang.Object r0 = r14.J(r0)
            com.daaw.Vp3 r1 = r15.a(r0)
        L9b:
            r15 = 1
            r14.s = r15
            r14.r = r15
            com.daaw.Op3 r15 = r14.o
            r14.w(r15)
            if (r1 == 0) goto Laf
            com.daaw.Np3 r15 = r14.p
            r15.getClass()
            r15.l(r1)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Qp3.F(com.daaw.u52):void");
    }

    @Override // com.daaw.AbstractC6920nr3
    public final void G() {
        if (this.l) {
            return;
        }
        this.q = true;
        A(null, this.k);
    }

    public final AbstractC8657u52 H() {
        return this.o;
    }

    @Override // com.daaw.Xp3
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final Np3 h(Vp3 vp3, Ls3 ls3, long j) {
        Np3 np3 = new Np3(vp3, ls3, j);
        np3.o(this.k);
        if (this.r) {
            np3.l(vp3.a(J(vp3.a)));
            return np3;
        }
        this.p = np3;
        if (!this.q) {
            this.q = true;
            A(null, this.k);
        }
        return np3;
    }

    public final Object J(Object obj) {
        return (this.o.h == null || !obj.equals(Op3.i)) ? obj : this.o.h;
    }

    public final void K(long j) {
        Np3 np3 = this.p;
        int iA = this.o.a(np3.B.a);
        if (iA == -1) {
            return;
        }
        Op3 op3 = this.o;
        H32 h32 = this.n;
        op3.d(iA, h32, false);
        long j2 = h32.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        np3.m(j);
    }

    @Override // com.daaw.AbstractC6920nr3, com.daaw.Xp3
    public final void a(Tp3 tp3) {
        ((Np3) tp3).n();
        if (tp3 == this.p) {
            this.p = null;
        }
    }

    @Override // com.daaw.AbstractC7468pp3, com.daaw.Xp3
    public final void i(YL1 yl1) {
        if (this.s) {
            this.o = this.o.p(new C5795jr3(this.o.f, yl1));
        } else {
            this.o = Op3.q(yl1);
        }
        this.k.i(yl1);
    }

    @Override // com.daaw.Ep3, com.daaw.AbstractC7468pp3
    public final void x() {
        this.r = false;
        this.q = false;
        super.x();
    }

    @Override // com.daaw.Ep3, com.daaw.Xp3
    public final void zzz() {
    }
}
