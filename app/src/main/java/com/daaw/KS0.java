package com.daaw;

import com.daaw.AbstractC0584Cu0;

/* JADX INFO: loaded from: classes.dex */
public final class KS0 extends AbstractC6399m00 implements C90 {
    public final float C;
    public final float D;
    public final float E;
    public final float F;
    public final float G;
    public final float H;
    public final float I;
    public final float J;
    public final float K;
    public final float L;
    public final long M;
    public final InterfaceC5391iR0 N;
    public final boolean O;
    public final long P;
    public final long Q;
    public final NQ R;

    public static final class a extends AbstractC4192e90 implements NQ {
        public a() {
            super(1);
        }

        public final void a(TT tt) {
            G10.g(tt, "$this$null");
            tt.m(KS0.this.C);
            tt.k(KS0.this.D);
            tt.c(KS0.this.E);
            tt.n(KS0.this.F);
            tt.j(KS0.this.G);
            tt.t(KS0.this.H);
            tt.q(KS0.this.I);
            tt.h(KS0.this.J);
            tt.i(KS0.this.K);
            tt.p(KS0.this.L);
            tt.W(KS0.this.M);
            tt.w(KS0.this.N);
            tt.U(KS0.this.O);
            KS0.k(KS0.this);
            tt.l(null);
            tt.P(KS0.this.P);
            tt.Y(KS0.this.Q);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((TT) obj);
            return G91.a;
        }
    }

    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ AbstractC0584Cu0 B;
        public final /* synthetic */ KS0 C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC0584Cu0 abstractC0584Cu0, KS0 ks0) {
            super(1);
            this.B = abstractC0584Cu0;
            this.C = ks0;
        }

        public final void a(AbstractC0584Cu0.a aVar) {
            G10.g(aVar, "$this$layout");
            AbstractC0584Cu0.a.r(aVar, this.B, 0, 0, 0.0f, this.C.R, 4, null);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC0584Cu0.a) obj);
            return G91.a;
        }
    }

    public /* synthetic */ KS0(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC5391iR0 interfaceC5391iR0, boolean z, UG0 ug0, long j2, long j3, NQ nq, AbstractC2911Yw abstractC2911Yw) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, interfaceC5391iR0, z, ug0, j2, j3, nq);
    }

    public static final /* synthetic */ UG0 k(KS0 ks0) {
        ks0.getClass();
        return null;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    @Override // com.daaw.C90
    public InterfaceC1061Hh0 b(InterfaceC1269Jh0 interfaceC1269Jh0, InterfaceC0645Dh0 interfaceC0645Dh0, long j) {
        G10.g(interfaceC1269Jh0, "$this$measure");
        G10.g(interfaceC0645Dh0, "measurable");
        AbstractC0584Cu0 abstractC0584Cu0G = interfaceC0645Dh0.G(j);
        return AbstractC1165Ih0.b(interfaceC1269Jh0, abstractC0584Cu0G.q0(), abstractC0584Cu0G.l0(), null, new b(abstractC0584Cu0G, this), 4, null);
    }

    public boolean equals(Object obj) {
        KS0 ks0 = obj instanceof KS0 ? (KS0) obj : null;
        return ks0 != null && this.C == ks0.C && this.D == ks0.D && this.E == ks0.E && this.F == ks0.F && this.G == ks0.G && this.H == ks0.H && this.I == ks0.I && this.J == ks0.J && this.K == ks0.K && this.L == ks0.L && AbstractC6425m51.c(this.M, ks0.M) && G10.c(this.N, ks0.N) && this.O == ks0.O && G10.c(null, null) && C2559Vm.o(this.P, ks0.P) && C2559Vm.o(this.Q, ks0.Q);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object f(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.c(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0) {
        return AbstractC0969Gk0.a(this, interfaceC1073Hk0);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((Float.floatToIntBits(this.C) * 31) + Float.floatToIntBits(this.D)) * 31) + Float.floatToIntBits(this.E)) * 31) + Float.floatToIntBits(this.F)) * 31) + Float.floatToIntBits(this.G)) * 31) + Float.floatToIntBits(this.H)) * 31) + Float.floatToIntBits(this.I)) * 31) + Float.floatToIntBits(this.J)) * 31) + Float.floatToIntBits(this.K)) * 31) + Float.floatToIntBits(this.L)) * 31) + AbstractC6425m51.f(this.M)) * 31) + this.N.hashCode()) * 31) + AbstractC8813ug.a(this.O)) * 961) + C2559Vm.u(this.P)) * 31) + C2559Vm.u(this.Q);
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.C + ", scaleY=" + this.D + ", alpha = " + this.E + ", translationX=" + this.F + ", translationY=" + this.G + ", shadowElevation=" + this.H + ", rotationX=" + this.I + ", rotationY=" + this.J + ", rotationZ=" + this.K + ", cameraDistance=" + this.L + ", transformOrigin=" + ((Object) AbstractC6425m51.g(this.M)) + ", shape=" + this.N + ", clip=" + this.O + ", renderEffect=" + ((Object) null) + ", ambientShadowColor=" + ((Object) C2559Vm.v(this.P)) + ", spotShadowColor=" + ((Object) C2559Vm.v(this.Q)) + ')';
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }

    public KS0(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC5391iR0 interfaceC5391iR0, boolean z, UG0 ug0, long j2, long j3, NQ nq) {
        super(nq);
        this.C = f;
        this.D = f2;
        this.E = f3;
        this.F = f4;
        this.G = f5;
        this.H = f6;
        this.I = f7;
        this.J = f8;
        this.K = f9;
        this.L = f10;
        this.M = j;
        this.N = interfaceC5391iR0;
        this.O = z;
        this.P = j2;
        this.Q = j3;
        this.R = new a();
    }
}
