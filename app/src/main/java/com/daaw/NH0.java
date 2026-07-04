package com.daaw;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class NH0 implements InterfaceC1205Ir0 {
    public static final b N = new b(null);
    public static final InterfaceC3429bR O = a.B;
    public final C6423m5 B;
    public NQ C;
    public LQ D;
    public boolean E;
    public final C9434wr0 F;
    public boolean G;
    public boolean H;
    public InterfaceC8595ts0 I;
    public final C5877k90 J;
    public final C7434pj K;
    public long L;
    public final IB M;

    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final a B = new a();

        public a() {
            super(2);
        }

        public final void a(IB ib, Matrix matrix) {
            G10.g(ib, "rn");
            G10.g(matrix, "matrix");
            ib.L(matrix);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((IB) obj, (Matrix) obj2);
            return G91.a;
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public b() {
        }
    }

    public NH0(C6423m5 c6423m5, NQ nq, LQ lq) {
        G10.g(c6423m5, "ownerView");
        G10.g(nq, "drawBlock");
        G10.g(lq, "invalidateParentLayer");
        this.B = c6423m5;
        this.C = nq;
        this.D = lq;
        this.F = new C9434wr0(c6423m5.getDensity());
        this.J = new C5877k90(O);
        this.K = new C7434pj();
        this.L = AbstractC6425m51.a.a();
        IB kh0 = Build.VERSION.SDK_INT >= 29 ? new KH0(c6423m5) : new XG0(c6423m5);
        kh0.J(true);
        this.M = kh0;
    }

    @Override // com.daaw.InterfaceC1205Ir0
    public void a(C6892nm0 c6892nm0, boolean z) {
        G10.g(c6892nm0, "rect");
        if (!z) {
            C9384wh0.g(this.J.b(this.M), c6892nm0);
            return;
        }
        float[] fArrA = this.J.a(this.M);
        if (fArrA == null) {
            c6892nm0.g(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            C9384wh0.g(fArrA, c6892nm0);
        }
    }

    @Override // com.daaw.InterfaceC1205Ir0
    public void b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC5391iR0 interfaceC5391iR0, boolean z, UG0 ug0, long j2, long j3, EnumC7560q90 enumC7560q90, InterfaceC4988gz interfaceC4988gz) {
        LQ lq;
        G10.g(interfaceC5391iR0, "shape");
        G10.g(enumC7560q90, "layoutDirection");
        G10.g(interfaceC4988gz, "density");
        this.L = j;
        boolean z2 = false;
        boolean z3 = this.M.H() && !this.F.d();
        this.M.m(f);
        this.M.k(f2);
        this.M.c(f3);
        this.M.n(f4);
        this.M.j(f5);
        this.M.z(f6);
        this.M.G(AbstractC3530bn.i(j2));
        this.M.K(AbstractC3530bn.i(j3));
        this.M.i(f9);
        this.M.q(f7);
        this.M.h(f8);
        this.M.p(f10);
        this.M.u(AbstractC6425m51.d(j) * this.M.getWidth());
        this.M.y(AbstractC6425m51.e(j) * this.M.getHeight());
        this.M.I(z && interfaceC5391iR0 != AbstractC4785gF0.a());
        this.M.v(z && interfaceC5391iR0 == AbstractC4785gF0.a());
        this.M.l(ug0);
        boolean zG = this.F.g(interfaceC5391iR0, this.M.o(), this.M.H(), this.M.M(), enumC7560q90, interfaceC4988gz);
        this.M.C(this.F.c());
        if (this.M.H() && !this.F.d()) {
            z2 = true;
        }
        if (z3 != z2 || (z2 && zG)) {
            invalidate();
        } else {
            l();
        }
        if (!this.H && this.M.M() > 0.0f && (lq = this.D) != null) {
            lq.invoke();
        }
        this.J.c();
    }

    @Override // com.daaw.InterfaceC1205Ir0
    public boolean c(long j) {
        float fL = C9982yp0.l(j);
        float fM = C9982yp0.m(j);
        if (this.M.E()) {
            return 0.0f <= fL && fL < ((float) this.M.getWidth()) && 0.0f <= fM && fM < ((float) this.M.getHeight());
        }
        if (this.M.H()) {
            return this.F.e(j);
        }
        return true;
    }

    @Override // com.daaw.InterfaceC1205Ir0
    public long d(long j, boolean z) {
        if (!z) {
            return C9384wh0.f(this.J.b(this.M), j);
        }
        float[] fArrA = this.J.a(this.M);
        return fArrA != null ? C9384wh0.f(fArrA, j) : C9982yp0.b.a();
    }

    @Override // com.daaw.InterfaceC1205Ir0
    public void destroy() {
        if (this.M.B()) {
            this.M.x();
        }
        this.C = null;
        this.D = null;
        this.G = true;
        k(false);
        this.B.c0();
        this.B.b0(this);
    }

    @Override // com.daaw.InterfaceC1205Ir0
    public void e(InterfaceC6318lj interfaceC6318lj) {
        G10.g(interfaceC6318lj, "canvas");
        Canvas canvasC = AbstractC3614c5.c(interfaceC6318lj);
        if (canvasC.isHardwareAccelerated()) {
            i();
            boolean z = this.M.M() > 0.0f;
            this.H = z;
            if (z) {
                interfaceC6318lj.q();
            }
            this.M.t(canvasC);
            if (this.H) {
                interfaceC6318lj.j();
                return;
            }
            return;
        }
        float fA = this.M.a();
        float F = this.M.F();
        float fD = this.M.d();
        float fS = this.M.s();
        if (this.M.o() < 1.0f) {
            InterfaceC8595ts0 interfaceC8595ts0A = this.I;
            if (interfaceC8595ts0A == null) {
                interfaceC8595ts0A = AbstractC3898d6.a();
                this.I = interfaceC8595ts0A;
            }
            interfaceC8595ts0A.c(this.M.o());
            canvasC.saveLayer(fA, F, fD, fS, interfaceC8595ts0A.h());
        } else {
            interfaceC6318lj.i();
        }
        interfaceC6318lj.c(fA, F);
        interfaceC6318lj.k(this.J.b(this.M));
        j(interfaceC6318lj);
        NQ nq = this.C;
        if (nq != null) {
            nq.invoke(interfaceC6318lj);
        }
        interfaceC6318lj.o();
        k(false);
    }

    @Override // com.daaw.InterfaceC1205Ir0
    public void f(long j) {
        int iG = I00.g(j);
        int iF = I00.f(j);
        float f = iG;
        this.M.u(AbstractC6425m51.d(this.L) * f);
        float f2 = iF;
        this.M.y(AbstractC6425m51.e(this.L) * f2);
        IB ib = this.M;
        if (ib.w(ib.a(), this.M.F(), this.M.a() + iG, this.M.F() + iF)) {
            this.F.h(BT0.a(f, f2));
            this.M.C(this.F.c());
            invalidate();
            this.J.c();
        }
    }

    @Override // com.daaw.InterfaceC1205Ir0
    public void g(NQ nq, LQ lq) {
        G10.g(nq, "drawBlock");
        G10.g(lq, "invalidateParentLayer");
        k(false);
        this.G = false;
        this.H = false;
        this.L = AbstractC6425m51.a.a();
        this.C = nq;
        this.D = lq;
    }

    @Override // com.daaw.InterfaceC1205Ir0
    public void h(long j) {
        int iA = this.M.a();
        int iF = this.M.F();
        int iF2 = D00.f(j);
        int iG = D00.g(j);
        if (iA == iF2 && iF == iG) {
            return;
        }
        this.M.r(iF2 - iA);
        this.M.A(iG - iF);
        l();
        this.J.c();
    }

    @Override // com.daaw.InterfaceC1205Ir0
    public void i() {
        if (this.E || !this.M.B()) {
            k(false);
            InterfaceC6090kt0 interfaceC6090kt0B = (!this.M.H() || this.F.d()) ? null : this.F.b();
            NQ nq = this.C;
            if (nq != null) {
                this.M.D(this.K, interfaceC6090kt0B, nq);
            }
        }
    }

    @Override // com.daaw.InterfaceC1205Ir0
    public void invalidate() {
        if (this.E || this.G) {
            return;
        }
        this.B.invalidate();
        k(true);
    }

    public final void j(InterfaceC6318lj interfaceC6318lj) {
        if (this.M.H() || this.M.E()) {
            this.F.a(interfaceC6318lj);
        }
    }

    public final void k(boolean z) {
        if (z != this.E) {
            this.E = z;
            this.B.X(this, z);
        }
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 26) {
            C5194hj1.a.a(this.B);
        } else {
            this.B.invalidate();
        }
    }
}
