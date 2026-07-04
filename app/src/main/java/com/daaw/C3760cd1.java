package com.daaw;

/* JADX INFO: renamed from: com.daaw.cd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3760cd1 extends AbstractC9718xs0 {
    public final InterfaceC8007rm0 g = AbstractC9046vU0.d(C9879yT0.c(C9879yT0.b.b()), null, 2, null);
    public final InterfaceC8007rm0 h = AbstractC9046vU0.d(Boolean.FALSE, null, 2, null);
    public final C2103Rc1 i;
    public InterfaceC1196Ip j;
    public final InterfaceC8007rm0 k;
    public float l;
    public C2871Ym m;

    /* JADX INFO: renamed from: com.daaw.cd1$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ InterfaceC1196Ip B;

        /* JADX INFO: renamed from: com.daaw.cd1$a$a, reason: collision with other inner class name */
        public static final class C0161a implements InterfaceC8973vC {
            public final /* synthetic */ InterfaceC1196Ip a;

            public C0161a(InterfaceC1196Ip interfaceC1196Ip) {
                this.a = interfaceC1196Ip;
            }

            @Override // com.daaw.InterfaceC8973vC
            public void a() {
                this.a.a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1196Ip interfaceC1196Ip) {
            super(1);
            this.B = interfaceC1196Ip;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC8973vC invoke(C9252wC c9252wC) {
            G10.g(c9252wC, "$this$DisposableEffect");
            return new C0161a(this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.cd1$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ String C;
        public final /* synthetic */ float D;
        public final /* synthetic */ float E;
        public final /* synthetic */ InterfaceC4553fR F;
        public final /* synthetic */ int G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, float f, float f2, InterfaceC4553fR interfaceC4553fR, int i) {
            super(2);
            this.C = str;
            this.D = f;
            this.E = f2;
            this.F = interfaceC4553fR;
            this.G = i;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            C3760cd1.this.k(this.C, this.D, this.E, this.F, interfaceC5781jp, this.G | 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.cd1$c */
    public static final class c extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ InterfaceC4553fR B;
        public final /* synthetic */ C3760cd1 C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC4553fR interfaceC4553fR, C3760cd1 c3760cd1) {
            super(2);
            this.B = interfaceC4553fR;
            this.C = c3760cd1;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) == 2 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
            } else {
                this.B.b(Float.valueOf(this.C.i.l()), Float.valueOf(this.C.i.k()), interfaceC5781jp, 0);
            }
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.cd1$d */
    public static final class d extends AbstractC4192e90 implements LQ {
        public d() {
            super(0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m48invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m48invoke() {
            C3760cd1.this.s(true);
        }
    }

    public C3760cd1() {
        C2103Rc1 c2103Rc1 = new C2103Rc1();
        c2103Rc1.n(new d());
        this.i = c2103Rc1;
        this.k = AbstractC9046vU0.d(Boolean.TRUE, null, 2, null);
        this.l = 1.0f;
    }

    @Override // com.daaw.AbstractC9718xs0
    public boolean a(float f) {
        this.l = f;
        return true;
    }

    @Override // com.daaw.AbstractC9718xs0
    public boolean b(C2871Ym c2871Ym) {
        this.m = c2871Ym;
        return true;
    }

    @Override // com.daaw.AbstractC9718xs0
    public long h() {
        return p();
    }

    @Override // com.daaw.AbstractC9718xs0
    public void j(OD od) {
        G10.g(od, "<this>");
        C2103Rc1 c2103Rc1 = this.i;
        C2871Ym c2871YmH = this.m;
        if (c2871YmH == null) {
            c2871YmH = c2103Rc1.h();
        }
        if (o() && od.getLayoutDirection() == EnumC7560q90.Rtl) {
            long jB0 = od.b0();
            ID idR = od.R();
            long jA = idR.a();
            idR.d().i();
            idR.b().e(-1.0f, 1.0f, jB0);
            c2103Rc1.g(od, this.l, c2871YmH);
            idR.d().o();
            idR.c(jA);
        } else {
            c2103Rc1.g(od, this.l, c2871YmH);
        }
        if (q()) {
            s(false);
        }
    }

    public final void k(String str, float f, float f2, InterfaceC4553fR interfaceC4553fR, InterfaceC5781jp interfaceC5781jp, int i) {
        G10.g(str, "name");
        G10.g(interfaceC4553fR, "content");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(1264894527);
        C2103Rc1 c2103Rc1 = this.i;
        c2103Rc1.o(str);
        c2103Rc1.q(f);
        c2103Rc1.p(f2);
        InterfaceC1196Ip interfaceC1196IpN = n(AbstractC3540bp.d(interfaceC5781jpQ, 0), interfaceC4553fR);
        AbstractC8420tF.a(interfaceC1196IpN, new a(interfaceC1196IpN), interfaceC5781jpQ, 8);
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z == null) {
            return;
        }
        qn0Z.a(new b(str, f, f2, interfaceC4553fR, i));
    }

    public final InterfaceC1196Ip n(AbstractC1300Jp abstractC1300Jp, InterfaceC4553fR interfaceC4553fR) {
        InterfaceC1196Ip interfaceC1196IpA = this.j;
        if (interfaceC1196IpA == null || interfaceC1196IpA.f()) {
            interfaceC1196IpA = AbstractC1819Op.a(new C1977Qc1(this.i.j()), abstractC1300Jp);
        }
        this.j = interfaceC1196IpA;
        interfaceC1196IpA.o(AbstractC1815Oo.c(-1916507005, true, new c(interfaceC4553fR, this)));
        return interfaceC1196IpA;
    }

    public final boolean o() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    public final long p() {
        return ((C9879yT0) this.g.getValue()).l();
    }

    public final boolean q() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final void r(boolean z) {
        this.h.setValue(Boolean.valueOf(z));
    }

    public final void s(boolean z) {
        this.k.setValue(Boolean.valueOf(z));
    }

    public final void t(C2871Ym c2871Ym) {
        this.i.m(c2871Ym);
    }

    public final void u(long j) {
        this.g.setValue(C9879yT0.c(j));
    }
}
