package com.daaw;

/* JADX INFO: renamed from: com.daaw.nj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6876nj implements OD {
    public final a B = new a(null, null, null, 0, 15, null);
    public final ID C = new b();
    public InterfaceC8595ts0 D;
    public InterfaceC8595ts0 E;

    /* JADX INFO: renamed from: com.daaw.nj$a */
    public static final class a {
        public InterfaceC4988gz a;
        public EnumC7560q90 b;
        public InterfaceC6318lj c;
        public long d;

        public /* synthetic */ a(InterfaceC4988gz interfaceC4988gz, EnumC7560q90 enumC7560q90, InterfaceC6318lj interfaceC6318lj, long j, AbstractC2911Yw abstractC2911Yw) {
            this(interfaceC4988gz, enumC7560q90, interfaceC6318lj, j);
        }

        public final InterfaceC4988gz a() {
            return this.a;
        }

        public final EnumC7560q90 b() {
            return this.b;
        }

        public final InterfaceC6318lj c() {
            return this.c;
        }

        public final long d() {
            return this.d;
        }

        public final InterfaceC6318lj e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return G10.c(this.a, aVar.a) && this.b == aVar.b && G10.c(this.c, aVar.c) && C9879yT0.f(this.d, aVar.d);
        }

        public final InterfaceC4988gz f() {
            return this.a;
        }

        public final EnumC7560q90 g() {
            return this.b;
        }

        public final long h() {
            return this.d;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + C9879yT0.j(this.d);
        }

        public final void i(InterfaceC6318lj interfaceC6318lj) {
            G10.g(interfaceC6318lj, "<set-?>");
            this.c = interfaceC6318lj;
        }

        public final void j(InterfaceC4988gz interfaceC4988gz) {
            G10.g(interfaceC4988gz, "<set-?>");
            this.a = interfaceC4988gz;
        }

        public final void k(EnumC7560q90 enumC7560q90) {
            G10.g(enumC7560q90, "<set-?>");
            this.b = enumC7560q90;
        }

        public final void l(long j) {
            this.d = j;
        }

        public String toString() {
            return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) C9879yT0.k(this.d)) + ')';
        }

        public a(InterfaceC4988gz interfaceC4988gz, EnumC7560q90 enumC7560q90, InterfaceC6318lj interfaceC6318lj, long j) {
            this.a = interfaceC4988gz;
            this.b = enumC7560q90;
            this.c = interfaceC6318lj;
            this.d = j;
        }

        public /* synthetic */ a(InterfaceC4988gz interfaceC4988gz, EnumC7560q90 enumC7560q90, InterfaceC6318lj interfaceC6318lj, long j, int i, AbstractC2911Yw abstractC2911Yw) {
            this((i & 1) != 0 ? AbstractC7155oj.a : interfaceC4988gz, (i & 2) != 0 ? EnumC7560q90.Ltr : enumC7560q90, (i & 4) != 0 ? new C5346iG() : interfaceC6318lj, (i & 8) != 0 ? C9879yT0.b.b() : j, null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.nj$b */
    public static final class b implements ID {
        public final RD a = AbstractC7155oj.c(this);

        public b() {
        }

        @Override // com.daaw.ID
        public long a() {
            return C6876nj.this.o().h();
        }

        @Override // com.daaw.ID
        public RD b() {
            return this.a;
        }

        @Override // com.daaw.ID
        public void c(long j) {
            C6876nj.this.o().l(j);
        }

        @Override // com.daaw.ID
        public InterfaceC6318lj d() {
            return C6876nj.this.o().e();
        }
    }

    public static /* synthetic */ InterfaceC8595ts0 e(C6876nj c6876nj, long j, PD pd, float f, C2871Ym c2871Ym, int i, int i2, int i3, Object obj) {
        return c6876nj.b(j, pd, f, c2871Ym, i, (i3 & 32) != 0 ? OD.g.b() : i2);
    }

    public static /* synthetic */ InterfaceC8595ts0 g(C6876nj c6876nj, AbstractC2117Rg abstractC2117Rg, PD pd, float f, C2871Ym c2871Ym, int i, int i2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i2 = OD.g.b();
        }
        return c6876nj.f(abstractC2117Rg, pd, f, c2871Ym, i, i2);
    }

    @Override // com.daaw.OD
    public void B(long j, long j2, long j3, float f, PD pd, C2871Ym c2871Ym, int i) {
        G10.g(pd, "style");
        this.B.e().m(C9982yp0.l(j2), C9982yp0.m(j2), C9982yp0.l(j2) + C9879yT0.i(j3), C9982yp0.m(j2) + C9879yT0.g(j3), e(this, j, pd, f, c2871Ym, i, 0, 32, null));
    }

    public final InterfaceC8595ts0 C(PD pd) {
        if (G10.c(pd, WK.a)) {
            return x();
        }
        if (!(pd instanceof FY0)) {
            throw new C6902no0();
        }
        InterfaceC8595ts0 interfaceC8595ts0Y = y();
        FY0 fy0 = (FY0) pd;
        if (interfaceC8595ts0Y.w() != fy0.e()) {
            interfaceC8595ts0Y.v(fy0.e());
        }
        if (!GY0.g(interfaceC8595ts0Y.q(), fy0.a())) {
            interfaceC8595ts0Y.d(fy0.a());
        }
        if (interfaceC8595ts0Y.f() != fy0.c()) {
            interfaceC8595ts0Y.k(fy0.c());
        }
        if (!IY0.g(interfaceC8595ts0Y.b(), fy0.b())) {
            interfaceC8595ts0Y.r(fy0.b());
        }
        interfaceC8595ts0Y.u();
        fy0.d();
        if (!G10.c(null, null)) {
            fy0.d();
            interfaceC8595ts0Y.n(null);
        }
        return interfaceC8595ts0Y;
    }

    @Override // com.daaw.OD
    public void D(AbstractC2117Rg abstractC2117Rg, long j, long j2, long j3, float f, PD pd, C2871Ym c2871Ym, int i) {
        G10.g(abstractC2117Rg, "brush");
        G10.g(pd, "style");
        this.B.e().l(C9982yp0.l(j), C9982yp0.m(j), C9982yp0.l(j) + C9879yT0.i(j2), C9982yp0.m(j) + C9879yT0.g(j2), AbstractC2791Xs.d(j3), AbstractC2791Xs.e(j3), g(this, abstractC2117Rg, pd, f, c2871Ym, i, 0, 32, null));
    }

    @Override // com.daaw.OD
    public void E(InterfaceC6090kt0 interfaceC6090kt0, long j, float f, PD pd, C2871Ym c2871Ym, int i) {
        G10.g(interfaceC6090kt0, "path");
        G10.g(pd, "style");
        this.B.e().d(interfaceC6090kt0, e(this, j, pd, f, c2871Ym, i, 0, 32, null));
    }

    @Override // com.daaw.OD
    public void F(InterfaceC5418iY interfaceC5418iY, long j, long j2, long j3, long j4, float f, PD pd, C2871Ym c2871Ym, int i, int i2) {
        G10.g(interfaceC5418iY, "image");
        G10.g(pd, "style");
        this.B.e().p(interfaceC5418iY, j, j2, j3, j4, f(null, pd, f, c2871Ym, i, i2));
    }

    @Override // com.daaw.InterfaceC4988gz
    public /* synthetic */ float H(int i) {
        return AbstractC4709fz.b(this, i);
    }

    @Override // com.daaw.InterfaceC4988gz
    public float J() {
        return this.B.f().J();
    }

    @Override // com.daaw.OD
    public void N(InterfaceC6090kt0 interfaceC6090kt0, AbstractC2117Rg abstractC2117Rg, float f, PD pd, C2871Ym c2871Ym, int i) {
        G10.g(interfaceC6090kt0, "path");
        G10.g(abstractC2117Rg, "brush");
        G10.g(pd, "style");
        this.B.e().d(interfaceC6090kt0, g(this, abstractC2117Rg, pd, f, c2871Ym, i, 0, 32, null));
    }

    @Override // com.daaw.InterfaceC4988gz
    public /* synthetic */ float O(float f) {
        return AbstractC4709fz.d(this, f);
    }

    @Override // com.daaw.OD
    public ID R() {
        return this.C;
    }

    @Override // com.daaw.OD
    public void T(long j, float f, long j2, float f2, PD pd, C2871Ym c2871Ym, int i) {
        G10.g(pd, "style");
        this.B.e().h(j2, f, e(this, j, pd, f2, c2871Ym, i, 0, 32, null));
    }

    @Override // com.daaw.InterfaceC4988gz
    public /* synthetic */ int V(float f) {
        return AbstractC4709fz.a(this, f);
    }

    @Override // com.daaw.OD
    public /* synthetic */ long a() {
        return ND.b(this);
    }

    @Override // com.daaw.OD
    public void a0(AbstractC2117Rg abstractC2117Rg, long j, long j2, float f, PD pd, C2871Ym c2871Ym, int i) {
        G10.g(abstractC2117Rg, "brush");
        G10.g(pd, "style");
        this.B.e().m(C9982yp0.l(j), C9982yp0.m(j), C9982yp0.l(j) + C9879yT0.i(j2), C9982yp0.m(j) + C9879yT0.g(j2), g(this, abstractC2117Rg, pd, f, c2871Ym, i, 0, 32, null));
    }

    public final InterfaceC8595ts0 b(long j, PD pd, float f, C2871Ym c2871Ym, int i, int i2) {
        InterfaceC8595ts0 interfaceC8595ts0C = C(pd);
        long jR = r(j, f);
        if (!C2559Vm.o(interfaceC8595ts0C.a(), jR)) {
            interfaceC8595ts0C.t(jR);
        }
        if (interfaceC8595ts0C.j() != null) {
            interfaceC8595ts0C.i(null);
        }
        if (!G10.c(interfaceC8595ts0C.g(), c2871Ym)) {
            interfaceC8595ts0C.l(c2871Ym);
        }
        if (!C2323Tf.G(interfaceC8595ts0C.x(), i)) {
            interfaceC8595ts0C.e(i);
        }
        if (!AbstractC3405bL.d(interfaceC8595ts0C.p(), i2)) {
            interfaceC8595ts0C.m(i2);
        }
        return interfaceC8595ts0C;
    }

    @Override // com.daaw.OD
    public /* synthetic */ long b0() {
        return ND.a(this);
    }

    @Override // com.daaw.InterfaceC4988gz
    public /* synthetic */ long d0(long j) {
        return AbstractC4709fz.e(this, j);
    }

    @Override // com.daaw.InterfaceC4988gz
    public /* synthetic */ float e0(long j) {
        return AbstractC4709fz.c(this, j);
    }

    public final InterfaceC8595ts0 f(AbstractC2117Rg abstractC2117Rg, PD pd, float f, C2871Ym c2871Ym, int i, int i2) {
        InterfaceC8595ts0 interfaceC8595ts0C = C(pd);
        if (abstractC2117Rg != null) {
            abstractC2117Rg.a(a(), interfaceC8595ts0C, f);
        } else if (interfaceC8595ts0C.o() != f) {
            interfaceC8595ts0C.c(f);
        }
        if (!G10.c(interfaceC8595ts0C.g(), c2871Ym)) {
            interfaceC8595ts0C.l(c2871Ym);
        }
        if (!C2323Tf.G(interfaceC8595ts0C.x(), i)) {
            interfaceC8595ts0C.e(i);
        }
        if (!AbstractC3405bL.d(interfaceC8595ts0C.p(), i2)) {
            interfaceC8595ts0C.m(i2);
        }
        return interfaceC8595ts0C;
    }

    @Override // com.daaw.InterfaceC4988gz
    public float getDensity() {
        return this.B.f().getDensity();
    }

    @Override // com.daaw.OD
    public EnumC7560q90 getLayoutDirection() {
        return this.B.g();
    }

    public final a o() {
        return this.B;
    }

    public final long r(long j, float f) {
        return f == 1.0f ? j : C2559Vm.m(j, C2559Vm.p(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Override // com.daaw.OD
    public void u(long j, long j2, long j3, long j4, PD pd, float f, C2871Ym c2871Ym, int i) {
        G10.g(pd, "style");
        this.B.e().l(C9982yp0.l(j2), C9982yp0.m(j2), C9982yp0.l(j2) + C9879yT0.i(j3), C9982yp0.m(j2) + C9879yT0.g(j3), AbstractC2791Xs.d(j4), AbstractC2791Xs.e(j4), e(this, j, pd, f, c2871Ym, i, 0, 32, null));
    }

    public final InterfaceC8595ts0 x() {
        InterfaceC8595ts0 interfaceC8595ts0 = this.D;
        if (interfaceC8595ts0 != null) {
            return interfaceC8595ts0;
        }
        InterfaceC8595ts0 interfaceC8595ts0A = AbstractC3898d6.a();
        interfaceC8595ts0A.s(AbstractC0472Bs0.a.a());
        this.D = interfaceC8595ts0A;
        return interfaceC8595ts0A;
    }

    public final InterfaceC8595ts0 y() {
        InterfaceC8595ts0 interfaceC8595ts0 = this.E;
        if (interfaceC8595ts0 != null) {
            return interfaceC8595ts0;
        }
        InterfaceC8595ts0 interfaceC8595ts0A = AbstractC3898d6.a();
        interfaceC8595ts0A.s(AbstractC0472Bs0.a.b());
        this.E = interfaceC8595ts0A;
        return interfaceC8595ts0A;
    }
}
