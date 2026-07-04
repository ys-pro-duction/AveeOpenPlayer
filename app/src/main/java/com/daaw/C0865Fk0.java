package com.daaw;

import com.daaw.AbstractC0584Cu0;

/* JADX INFO: renamed from: com.daaw.Fk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0865Fk0 extends K90 {
    public static final a h0 = new a(null);
    public static final InterfaceC8595ts0 i0;
    public K90 d0;
    public C90 e0;
    public boolean f0;
    public InterfaceC8007rm0 g0;

    /* JADX INFO: renamed from: com.daaw.Fk0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    static {
        InterfaceC8595ts0 interfaceC8595ts0A = AbstractC3898d6.a();
        interfaceC8595ts0A.t(C2559Vm.b.b());
        interfaceC8595ts0A.v(1.0f);
        interfaceC8595ts0A.s(AbstractC0472Bs0.a.b());
        i0 = interfaceC8595ts0A;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0865Fk0(K90 k90, C90 c90) {
        super(k90.X0());
        G10.g(k90, "wrapped");
        G10.g(c90, "modifier");
        this.d0 = k90;
        this.e0 = c90;
    }

    @Override // com.daaw.InterfaceC0645Dh0
    public AbstractC0584Cu0 G(long j) {
        u0(j);
        B1(this.e0.b(Z0(), f1(), j));
        InterfaceC1205Ir0 interfaceC1205Ir0V0 = V0();
        if (interfaceC1205Ir0V0 != null) {
            interfaceC1205Ir0V0.f(n0());
        }
        v1();
        return this;
    }

    @Override // com.daaw.K90
    public int I0(I3 i3) {
        G10.g(i3, "alignmentLine");
        if (Y0().b().containsKey(i3)) {
            Integer num = (Integer) Y0().b().get(i3);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iR = f1().r(i3);
        if (iR == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        C1(true);
        r0(c1(), h1(), W0());
        C1(false);
        return iR + (i3 instanceof C6536mW ? D00.g(f1().c1()) : D00.f(f1().c1()));
    }

    public final C90 K1() {
        return this.e0;
    }

    public final boolean L1() {
        return this.f0;
    }

    public final void M1(C90 c90) {
        G10.g(c90, "<set-?>");
        this.e0 = c90;
    }

    public final void N1(boolean z) {
        this.f0 = z;
    }

    public void O1(K90 k90) {
        G10.g(k90, "<set-?>");
        this.d0 = k90;
    }

    @Override // com.daaw.K90
    public InterfaceC1269Jh0 Z0() {
        return f1().Z0();
    }

    @Override // com.daaw.K90
    public K90 f1() {
        return this.d0;
    }

    @Override // com.daaw.K90, com.daaw.AbstractC0584Cu0
    public void r0(long j, float f, NQ nq) {
        super.r0(j, f, nq);
        K90 k90G1 = g1();
        if (k90G1 == null || !k90G1.p1()) {
            x1();
            AbstractC0584Cu0.a.C0054a c0054a = AbstractC0584Cu0.a.a;
            int iG = I00.g(n0());
            EnumC7560q90 layoutDirection = Z0().getLayoutDirection();
            int iH = c0054a.h();
            EnumC7560q90 enumC7560q90G = c0054a.g();
            AbstractC0584Cu0.a.c = iG;
            AbstractC0584Cu0.a.b = layoutDirection;
            Y0().a();
            AbstractC0584Cu0.a.c = iH;
            AbstractC0584Cu0.a.b = enumC7560q90G;
        }
    }

    @Override // com.daaw.K90
    public void s1() {
        super.s1();
        f1().D1(this);
    }

    @Override // com.daaw.K90
    public void w1() {
        super.w1();
        InterfaceC8007rm0 interfaceC8007rm0 = this.g0;
        if (interfaceC8007rm0 == null) {
            return;
        }
        interfaceC8007rm0.setValue(this.e0);
    }

    @Override // com.daaw.K90
    public void y1(InterfaceC6318lj interfaceC6318lj) {
        G10.g(interfaceC6318lj, "canvas");
        f1().M0(interfaceC6318lj);
        if (I90.a(X0()).getShowLayoutBounds()) {
            N0(interfaceC6318lj, i0);
        }
    }
}
