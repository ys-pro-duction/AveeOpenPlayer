package com.daaw;

import com.daaw.AbstractC8869ur0;

/* JADX INFO: renamed from: com.daaw.og, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7140og {

    /* JADX INFO: renamed from: com.daaw.og$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ float B;
        public final /* synthetic */ InterfaceC5391iR0 C;
        public final /* synthetic */ AbstractC2117Rg D;

        /* JADX INFO: renamed from: com.daaw.og$a$a, reason: collision with other inner class name */
        public static final class C0220a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ float B;
            public final /* synthetic */ InterfaceC5391iR0 C;
            public final /* synthetic */ C7306pF0 D;
            public final /* synthetic */ AbstractC2117Rg E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0220a(float f, InterfaceC5391iR0 interfaceC5391iR0, C7306pF0 c7306pF0, AbstractC2117Rg abstractC2117Rg) {
                super(1);
                this.B = f;
                this.C = interfaceC5391iR0;
                this.D = c7306pF0;
                this.E = abstractC2117Rg;
            }

            @Override // com.daaw.NQ
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MD invoke(C7708qi c7708qi) {
                G10.g(c7708qi, "$this$drawWithCache");
                if (c7708qi.O(this.B) < 0.0f || C9879yT0.h(c7708qi.a()) <= 0.0f) {
                    return AbstractC7140og.i(c7708qi);
                }
                float f = 2;
                float fMin = Math.min(C6460mD.n(this.B, C6460mD.C.a()) ? 1.0f : (float) Math.ceil(c7708qi.O(this.B)), (float) Math.ceil(C9879yT0.h(c7708qi.a()) / f));
                float f2 = fMin / f;
                long jA = AbstractC0460Bp0.a(f2, f2);
                long jA2 = BT0.a(C9879yT0.i(c7708qi.a()) - fMin, C9879yT0.g(c7708qi.a()) - fMin);
                boolean z = f * fMin > C9879yT0.h(c7708qi.a());
                AbstractC8869ur0 abstractC8869ur0A = this.C.a(c7708qi.a(), c7708qi.getLayoutDirection(), c7708qi);
                if (abstractC8869ur0A instanceof AbstractC8869ur0.b) {
                    return AbstractC7140og.k(c7708qi, this.D, this.E, (AbstractC8869ur0.b) abstractC8869ur0A, jA, jA2, z, fMin);
                }
                boolean z2 = z;
                if (abstractC8869ur0A instanceof AbstractC8869ur0.a) {
                    return AbstractC7140og.j(c7708qi, this.E, jA, jA2, z2, fMin);
                }
                throw new C6902no0();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, InterfaceC5391iR0 interfaceC5391iR0, AbstractC2117Rg abstractC2117Rg) {
            super(3);
            this.B = f;
            this.C = interfaceC5391iR0;
            this.D = abstractC2117Rg;
        }

        public final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC1073Hk0, "$this$composed");
            interfaceC5781jp.e(-1498088849);
            interfaceC5781jp.e(-492369756);
            Object objF = interfaceC5781jp.f();
            if (objF == InterfaceC5781jp.a.a()) {
                objF = new C7306pF0();
                interfaceC5781jp.H(objF);
            }
            interfaceC5781jp.L();
            InterfaceC1073Hk0 interfaceC1073Hk0G = interfaceC1073Hk0.g(LD.b(InterfaceC1073Hk0.m, new C0220a(this.B, this.C, (C7306pF0) objF, this.D)));
            interfaceC5781jp.L();
            return interfaceC1073Hk0G;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC1073Hk0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.og$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ float B;
        public final /* synthetic */ AbstractC2117Rg C;
        public final /* synthetic */ InterfaceC5391iR0 D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, AbstractC2117Rg abstractC2117Rg, InterfaceC5391iR0 interfaceC5391iR0) {
            super(1);
            this.B = f;
            this.C = abstractC2117Rg;
            this.D = interfaceC5391iR0;
        }

        public final void a(AbstractC6120l00 abstractC6120l00) {
            G10.g(abstractC6120l00, "$this$null");
            throw null;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC6314li0.a(obj);
            a(null);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.og$c */
    public static final class c extends AbstractC4192e90 implements NQ {
        public static final c B = new c();

        public c() {
            super(1);
        }

        public final void a(InterfaceC2995Zr interfaceC2995Zr) {
            G10.g(interfaceC2995Zr, "$this$onDrawWithContent");
            interfaceC2995Zr.g0();
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC2995Zr) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.og$d */
    public static final class d extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ AbstractC2117Rg B;
        public final /* synthetic */ long C;
        public final /* synthetic */ long D;
        public final /* synthetic */ PD E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC2117Rg abstractC2117Rg, long j, long j2, PD pd) {
            super(1);
            this.B = abstractC2117Rg;
            this.C = j;
            this.D = j2;
            this.E = pd;
        }

        public final void a(InterfaceC2995Zr interfaceC2995Zr) {
            G10.g(interfaceC2995Zr, "$this$onDrawWithContent");
            interfaceC2995Zr.g0();
            ND.g(interfaceC2995Zr, this.B, this.C, this.D, 0.0f, this.E, null, 0, 104, null);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC2995Zr) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.og$e */
    public static final class e extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ boolean B;
        public final /* synthetic */ AbstractC2117Rg C;
        public final /* synthetic */ long D;
        public final /* synthetic */ float E;
        public final /* synthetic */ float F;
        public final /* synthetic */ long G;
        public final /* synthetic */ long H;
        public final /* synthetic */ FY0 I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z, AbstractC2117Rg abstractC2117Rg, long j, float f, float f2, long j2, long j3, FY0 fy0) {
            super(1);
            this.B = z;
            this.C = abstractC2117Rg;
            this.D = j;
            this.E = f;
            this.F = f2;
            this.G = j2;
            this.H = j3;
            this.I = fy0;
        }

        public final void a(InterfaceC2995Zr interfaceC2995Zr) {
            G10.g(interfaceC2995Zr, "$this$onDrawWithContent");
            interfaceC2995Zr.g0();
            if (this.B) {
                ND.i(interfaceC2995Zr, this.C, 0L, 0L, this.D, 0.0f, null, null, 0, 246, null);
                return;
            }
            float fD = AbstractC2791Xs.d(this.D);
            float f = this.E;
            if (fD >= f) {
                ND.i(interfaceC2995Zr, this.C, this.G, this.H, AbstractC7140og.m(this.D, f), 0.0f, this.I, null, 0, 208, null);
                return;
            }
            float f2 = this.F;
            float fI = C9879yT0.i(interfaceC2995Zr.a()) - this.F;
            float fG = C9879yT0.g(interfaceC2995Zr.a()) - this.F;
            int iA = AbstractC4360em.a.a();
            AbstractC2117Rg abstractC2117Rg = this.C;
            long j = this.D;
            ID idR = interfaceC2995Zr.R();
            long jA = idR.a();
            idR.d().i();
            idR.b().b(f2, f2, fI, fG, iA);
            ND.i(interfaceC2995Zr, abstractC2117Rg, 0L, 0L, j, 0.0f, null, null, 0, 246, null);
            idR.d().o();
            idR.c(jA);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC2995Zr) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.og$f */
    public static final class f extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ InterfaceC6090kt0 B;
        public final /* synthetic */ AbstractC2117Rg C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC6090kt0 interfaceC6090kt0, AbstractC2117Rg abstractC2117Rg) {
            super(1);
            this.B = interfaceC6090kt0;
            this.C = abstractC2117Rg;
        }

        public final void a(InterfaceC2995Zr interfaceC2995Zr) {
            G10.g(interfaceC2995Zr, "$this$onDrawWithContent");
            interfaceC2995Zr.g0();
            ND.f(interfaceC2995Zr, this.B, this.C, 0.0f, null, null, 0, 60, null);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC2995Zr) obj);
            return G91.a;
        }
    }

    public static final InterfaceC1073Hk0 e(InterfaceC1073Hk0 interfaceC1073Hk0, float f2, long j, InterfaceC5391iR0 interfaceC5391iR0) {
        G10.g(interfaceC1073Hk0, "$this$border");
        G10.g(interfaceC5391iR0, "shape");
        return f(interfaceC1073Hk0, f2, new GU0(j, null), interfaceC5391iR0);
    }

    public static final InterfaceC1073Hk0 f(InterfaceC1073Hk0 interfaceC1073Hk0, float f2, AbstractC2117Rg abstractC2117Rg, InterfaceC5391iR0 interfaceC5391iR0) {
        G10.g(interfaceC1073Hk0, "$this$border");
        G10.g(abstractC2117Rg, "brush");
        G10.g(interfaceC5391iR0, "shape");
        return AbstractC5500ip.a(interfaceC1073Hk0, AbstractC5550j00.c() ? new b(f2, abstractC2117Rg, interfaceC5391iR0) : AbstractC5550j00.a(), new a(f2, interfaceC5391iR0, abstractC2117Rg));
    }

    public static final C3680cK0 g(float f2, C3680cK0 c3680cK0) {
        return new C3680cK0(f2, f2, c3680cK0.j() - f2, c3680cK0.d() - f2, m(c3680cK0.h(), f2), m(c3680cK0.i(), f2), m(c3680cK0.c(), f2), m(c3680cK0.b(), f2), null);
    }

    public static final InterfaceC6090kt0 h(InterfaceC6090kt0 interfaceC6090kt0, C3680cK0 c3680cK0, float f2, boolean z) {
        interfaceC6090kt0.reset();
        interfaceC6090kt0.l(c3680cK0);
        if (!z) {
            InterfaceC6090kt0 interfaceC6090kt0A = AbstractC6428m6.a();
            interfaceC6090kt0A.l(g(f2, c3680cK0));
            interfaceC6090kt0.m(interfaceC6090kt0, interfaceC6090kt0A, AbstractC9723xt0.a.a());
        }
        return interfaceC6090kt0;
    }

    public static final MD i(C7708qi c7708qi) {
        return c7708qi.e(c.B);
    }

    public static final MD j(C7708qi c7708qi, AbstractC2117Rg abstractC2117Rg, long j, long j2, boolean z, float f2) {
        return c7708qi.e(new d(abstractC2117Rg, z ? C9982yp0.b.c() : j, z ? c7708qi.a() : j2, z ? WK.a : new FY0(f2, 0.0f, 0, 0, null, 30, null)));
    }

    public static final MD k(C7708qi c7708qi, C7306pF0 c7306pF0, AbstractC2117Rg abstractC2117Rg, AbstractC8869ur0.b bVar, long j, long j2, boolean z, float f2) {
        return AbstractC3959dK0.d(bVar.a()) ? c7708qi.e(new e(z, abstractC2117Rg, bVar.a().h(), f2 / 2, f2, j, j2, new FY0(f2, 0.0f, 0, 0, null, 30, null))) : c7708qi.e(new f(h(l(c7306pF0).a(), bVar.a(), f2, z), abstractC2117Rg));
    }

    public static final C6861ng l(C7306pF0 c7306pF0) {
        C6861ng c6861ng = (C6861ng) c7306pF0.a();
        if (c6861ng != null) {
            return c6861ng;
        }
        C6861ng c6861ng2 = new C6861ng(null, null, null, null, 15, null);
        c7306pF0.b(c6861ng2);
        return c6861ng2;
    }

    public static final long m(long j, float f2) {
        return AbstractC2895Ys.a(Math.max(0.0f, AbstractC2791Xs.d(j) - f2), Math.max(0.0f, AbstractC2791Xs.e(j) - f2));
    }
}
