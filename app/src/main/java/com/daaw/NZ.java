package com.daaw;

import com.daaw.E90;

/* JADX INFO: loaded from: classes.dex */
public final class NZ extends K90 implements InterfaceC4988gz {
    public static final a e0 = new a(null);
    public static final InterfaceC8595ts0 f0;
    public final /* synthetic */ InterfaceC1269Jh0 d0;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    static {
        InterfaceC8595ts0 interfaceC8595ts0A = AbstractC3898d6.a();
        interfaceC8595ts0A.t(C2559Vm.b.e());
        interfaceC8595ts0A.v(1.0f);
        interfaceC8595ts0A.s(AbstractC0472Bs0.a.b());
        f0 = interfaceC8595ts0A;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NZ(E90 e90) {
        super(e90);
        G10.g(e90, "layoutNode");
        this.d0 = e90.c0();
    }

    @Override // com.daaw.InterfaceC0645Dh0
    public AbstractC0584Cu0 G(long j) {
        u0(j);
        C8565tm0 c8565tm0R0 = X0().r0();
        int iR = c8565tm0R0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0R0.q();
            int i = 0;
            do {
                ((E90) objArrQ[i]).h1(E90.i.NotUsed);
                i++;
            } while (i < iR);
        }
        X0().s0(X0().b0().a(X0().c0(), X0().P(), j));
        v1();
        return this;
    }

    @Override // com.daaw.InterfaceC4988gz
    public float H(int i) {
        return this.d0.H(i);
    }

    @Override // com.daaw.K90
    public int I0(I3 i3) {
        G10.g(i3, "alignmentLine");
        Integer num = (Integer) X0().C().get(i3);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // com.daaw.InterfaceC4988gz
    public float J() {
        return this.d0.J();
    }

    @Override // com.daaw.InterfaceC4988gz
    public float O(float f) {
        return this.d0.O(f);
    }

    @Override // com.daaw.InterfaceC4988gz
    public int V(float f) {
        return this.d0.V(f);
    }

    @Override // com.daaw.K90
    public InterfaceC1269Jh0 Z0() {
        return X0().c0();
    }

    @Override // com.daaw.InterfaceC4988gz
    public long d0(long j) {
        return this.d0.d0(j);
    }

    @Override // com.daaw.InterfaceC4988gz
    public float e0(long j) {
        return this.d0.e0(j);
    }

    @Override // com.daaw.InterfaceC4988gz
    public float getDensity() {
        return this.d0.getDensity();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    @Override // com.daaw.K90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l1(com.daaw.K90.f r11, long r12, com.daaw.VV r14, boolean r15, boolean r16) {
        /*
            r10 = this;
            java.lang.String r0 = "hitTestSource"
            com.daaw.G10.g(r11, r0)
            java.lang.String r0 = "hitTestResult"
            com.daaw.G10.g(r14, r0)
            com.daaw.E90 r0 = r10.X0()
            boolean r0 = r11.d(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L39
            boolean r0 = r10.J1(r12)
            if (r0 == 0) goto L20
            r9 = r16
            r2 = 1
            goto L3b
        L20:
            if (r15 == 0) goto L39
            long r3 = r10.a1()
            float r0 = r10.L0(r12, r3)
            boolean r3 = java.lang.Float.isInfinite(r0)
            if (r3 != 0) goto L39
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L39
            r2 = 1
            r9 = 0
            goto L3b
        L39:
            r9 = r16
        L3b:
            if (r2 == 0) goto L82
            int r0 = com.daaw.VV.m(r14)
            com.daaw.E90 r2 = r10.X0()
            com.daaw.tm0 r2 = r2.q0()
            int r3 = r2.r()
            if (r3 <= 0) goto L7f
            int r3 = r3 - r1
            java.lang.Object[] r1 = r2.q()
            r2 = r3
        L55:
            r3 = r1[r2]
            r4 = r3
            com.daaw.E90 r4 = (com.daaw.E90) r4
            boolean r3 = r4.g()
            if (r3 == 0) goto L7b
            r3 = r11
            r5 = r12
            r7 = r14
            r8 = r15
            r3.a(r4, r5, r7, r8, r9)
            boolean r3 = r14.D()
            if (r3 != 0) goto L6e
            goto L7b
        L6e:
            com.daaw.K90 r3 = r4.j0()
            boolean r3 = r3.E1()
            if (r3 == 0) goto L7f
            r14.e()
        L7b:
            int r2 = r2 + (-1)
            if (r2 >= 0) goto L55
        L7f:
            com.daaw.VV.s(r14, r0)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.NZ.l1(com.daaw.K90$f, long, com.daaw.VV, boolean, boolean):void");
    }

    @Override // com.daaw.K90, com.daaw.AbstractC0584Cu0
    public void r0(long j, float f, NQ nq) {
        super.r0(j, f, nq);
        K90 k90G1 = g1();
        if (k90G1 == null || !k90G1.p1()) {
            x1();
            X0().O0();
        }
    }

    @Override // com.daaw.K90
    public void y1(InterfaceC6318lj interfaceC6318lj) {
        G10.g(interfaceC6318lj, "canvas");
        InterfaceC1413Kr0 interfaceC1413Kr0A = I90.a(X0());
        C8565tm0 c8565tm0Q0 = X0().q0();
        int iR = c8565tm0Q0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0Q0.q();
            int i = 0;
            do {
                E90 e90 = (E90) objArrQ[i];
                if (e90.g()) {
                    e90.M(interfaceC6318lj);
                }
                i++;
            } while (i < iR);
        }
        if (interfaceC1413Kr0A.getShowLayoutBounds()) {
            N0(interfaceC6318lj, f0);
        }
    }
}
