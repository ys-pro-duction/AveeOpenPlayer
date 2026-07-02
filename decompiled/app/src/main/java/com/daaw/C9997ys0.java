package com.daaw;

import com.daaw.AbstractC0584Cu0;

/* JADX INFO: renamed from: com.daaw.ys0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9997ys0 extends AbstractC6399m00 implements C90, KD {
    public final AbstractC9718xs0 C;
    public final boolean D;
    public final H3 E;
    public final InterfaceC7479ps F;
    public final float G;
    public final C2871Ym H;

    /* JADX INFO: renamed from: com.daaw.ys0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ AbstractC0584Cu0 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC0584Cu0 abstractC0584Cu0) {
            super(1);
            this.B = abstractC0584Cu0;
        }

        public final void a(AbstractC0584Cu0.a aVar) {
            G10.g(aVar, "$this$layout");
            AbstractC0584Cu0.a.n(aVar, this.B, 0, 0, 0.0f, 4, null);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC0584Cu0.a) obj);
            return G91.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9997ys0(AbstractC9718xs0 abstractC9718xs0, boolean z, H3 h3, InterfaceC7479ps interfaceC7479ps, float f, C2871Ym c2871Ym, NQ nq) {
        super(nq);
        G10.g(abstractC9718xs0, "painter");
        G10.g(h3, "alignment");
        G10.g(interfaceC7479ps, "contentScale");
        G10.g(nq, "inspectorInfo");
        this.C = abstractC9718xs0;
        this.D = z;
        this.E = h3;
        this.F = interfaceC7479ps;
        this.G = f;
        this.H = c2871Ym;
    }

    @Override // com.daaw.KD
    public void G(InterfaceC2995Zr interfaceC2995Zr) {
        G10.g(interfaceC2995Zr, "<this>");
        long jH = this.C.h();
        long jA = BT0.a(i(jH) ? C9879yT0.i(jH) : C9879yT0.i(interfaceC2995Zr.a()), h(jH) ? C9879yT0.g(jH) : C9879yT0.g(interfaceC2995Zr.a()));
        long jB = (C9879yT0.i(interfaceC2995Zr.a()) == 0.0f || C9879yT0.g(interfaceC2995Zr.a()) == 0.0f) ? C9879yT0.b.b() : AbstractC6222lN0.b(jA, this.F.a(jA, interfaceC2995Zr.a()));
        long jA2 = this.E.a(J00.a(AbstractC8261sh0.b(C9879yT0.i(jB)), AbstractC8261sh0.b(C9879yT0.g(jB))), J00.a(AbstractC8261sh0.b(C9879yT0.i(interfaceC2995Zr.a())), AbstractC8261sh0.b(C9879yT0.g(interfaceC2995Zr.a()))), interfaceC2995Zr.getLayoutDirection());
        float f = D00.f(jA2);
        float fG = D00.g(jA2);
        interfaceC2995Zr.R().b().c(f, fG);
        this.C.g(interfaceC2995Zr, jB, this.G, this.H);
        interfaceC2995Zr.R().b().c(-f, -fG);
        interfaceC2995Zr.g0();
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    @Override // com.daaw.C90
    public InterfaceC1061Hh0 b(InterfaceC1269Jh0 interfaceC1269Jh0, InterfaceC0645Dh0 interfaceC0645Dh0, long j) {
        G10.g(interfaceC1269Jh0, "$this$measure");
        G10.g(interfaceC0645Dh0, "measurable");
        AbstractC0584Cu0 abstractC0584Cu0G = interfaceC0645Dh0.G(j(j));
        return AbstractC1165Ih0.b(interfaceC1269Jh0, abstractC0584Cu0G.q0(), abstractC0584Cu0G.l0(), null, new a(abstractC0584Cu0G), 4, null);
    }

    public final long c(long j) {
        if (!d()) {
            return j;
        }
        long jA = BT0.a(!i(this.C.h()) ? C9879yT0.i(j) : C9879yT0.i(this.C.h()), !h(this.C.h()) ? C9879yT0.g(j) : C9879yT0.g(this.C.h()));
        return (C9879yT0.i(j) == 0.0f || C9879yT0.g(j) == 0.0f) ? C9879yT0.b.b() : AbstractC6222lN0.b(jA, this.F.a(jA, j));
    }

    public final boolean d() {
        return this.D && this.C.h() != C9879yT0.b.a();
    }

    public boolean equals(Object obj) {
        C9997ys0 c9997ys0 = obj instanceof C9997ys0 ? (C9997ys0) obj : null;
        return c9997ys0 != null && G10.c(this.C, c9997ys0.C) && this.D == c9997ys0.D && G10.c(this.E, c9997ys0.E) && G10.c(this.F, c9997ys0.F) && this.G == c9997ys0.G && G10.c(this.H, c9997ys0.H);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object f(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.c(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0) {
        return AbstractC0969Gk0.a(this, interfaceC1073Hk0);
    }

    public final boolean h(long j) {
        if (C9879yT0.f(j, C9879yT0.b.a())) {
            return false;
        }
        float fG = C9879yT0.g(j);
        return (Float.isInfinite(fG) || Float.isNaN(fG)) ? false : true;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.C.hashCode() * 31) + AbstractC8813ug.a(this.D)) * 31) + this.E.hashCode()) * 31) + this.F.hashCode()) * 31) + Float.floatToIntBits(this.G)) * 31;
        C2871Ym c2871Ym = this.H;
        return iHashCode + (c2871Ym != null ? c2871Ym.hashCode() : 0);
    }

    public final boolean i(long j) {
        if (C9879yT0.f(j, C9879yT0.b.a())) {
            return false;
        }
        float fI = C9879yT0.i(j);
        return (Float.isInfinite(fI) || Float.isNaN(fI)) ? false : true;
    }

    public final long j(long j) {
        boolean z = false;
        boolean z2 = C6079kr.j(j) && C6079kr.i(j);
        if (C6079kr.l(j) && C6079kr.k(j)) {
            z = true;
        }
        if ((!d() && z2) || z) {
            return C6079kr.e(j, C6079kr.n(j), 0, C6079kr.m(j), 0, 10, null);
        }
        long jH = this.C.h();
        long jC = c(BT0.a(AbstractC6916nr.g(j, i(jH) ? AbstractC8261sh0.b(C9879yT0.i(jH)) : C6079kr.p(j)), AbstractC6916nr.f(j, h(jH) ? AbstractC8261sh0.b(C9879yT0.g(jH)) : C6079kr.o(j))));
        return C6079kr.e(j, AbstractC6916nr.g(j, AbstractC8261sh0.b(C9879yT0.i(jC))), 0, AbstractC6916nr.f(j, AbstractC8261sh0.b(C9879yT0.g(jC))), 0, 10, null);
    }

    public String toString() {
        return "PainterModifier(painter=" + this.C + ", sizeToIntrinsics=" + this.D + ", alignment=" + this.E + ", alpha=" + this.G + ", colorFilter=" + this.H + ')';
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }
}
