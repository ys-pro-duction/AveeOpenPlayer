package com.daaw;

import android.graphics.RectF;
import com.daaw.C9264wF;

/* JADX INFO: renamed from: com.daaw.ft0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4685ft0 extends AbstractC8699uF {
    public static final String[] r0 = {"internalres:particle_blur01", "internalres:particle_circle_blur4", "internalres:particle_circle_w_a_64", "internalres:particle_sharp", "composition:0"};
    public static final String[] s0 = {"internalres:particle_blur01", "internalres:particle_circle_blur4", "internalres:particle_circle_w_a_64", "internalres:particle_sharp", "internalres:snowflake", "internalres:year2018", "composition:0"};
    public int G;
    public InterfaceC8213sX[] H;
    public float I;
    public HW J;
    public float K;
    public InterfaceC8492tX L;
    public int M;
    public float N;
    public float O;
    public C1477Lh0 P;
    public C1477Lh0 Q;
    public boolean R;
    public boolean S;
    public InterfaceC5135hX T;
    public float U;
    public float V;
    public C1036Hb W;
    public C1665Nc1 X;
    public C1665Nc1 Y;
    public C1458Lc1 Z;
    public C1458Lc1 a0;
    public C1458Lc1 b0;
    public C1458Lc1 c0;
    public C1458Lc1 d0;
    public float[] e0;
    public final float[] f0;
    public float g0;
    public float h0;
    public final float i0;
    public C9264wF j0;
    public final C3755cc1 k0;
    public float l0;
    public InterfaceC6129l2 m0;
    public HQ n0;
    public HQ o0;
    public HQ p0;
    public HQ q0;

    /* JADX INFO: renamed from: com.daaw.ft0$a */
    public class a implements C9264wF.b {
        public a() {
        }

        @Override // com.daaw.C9264wF.b
        public void a() {
            C4685ft0.this.m();
        }
    }

    /* JADX INFO: renamed from: com.daaw.ft0$b */
    public class b implements InterfaceC6129l2 {
        public b() {
        }

        @Override // com.daaw.InterfaceC6129l2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(TH0 th0, C4880gc1 c4880gc1, RH0 rh0) {
            c4880gc1.E("u_projView", false, C4685ft0.this.k0.a());
        }
    }

    /* JADX INFO: renamed from: com.daaw.ft0$c */
    public class c implements HQ {
        public final /* synthetic */ RectF a;
        public final /* synthetic */ TH0 b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;
        public final /* synthetic */ float f;
        public final /* synthetic */ C1458Lc1 g;
        public final /* synthetic */ float h;

        public c(RectF rectF, TH0 th0, float f, float f2, float f3, float f4, C1458Lc1 c1458Lc1, float f5) {
            this.a = rectF;
            this.b = th0;
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
            this.g = c1458Lc1;
            this.h = f5;
        }

        @Override // com.daaw.HQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean j(Integer num, float[] fArr, int[] iArr) {
            float fR;
            if (!C4685ft0.this.H[num.intValue()].e()) {
                return Boolean.FALSE;
            }
            if (C4685ft0.this.T != null) {
                C1665Nc1 position = C4685ft0.this.H[num.intValue()].getPosition();
                fR = C4685ft0.this.T.r(position.a - this.a.centerX(), position.b - this.a.centerY(), C4685ft0.this.b0);
            } else {
                fR = 0.0f;
            }
            if (!C4685ft0.this.H[num.intValue()].d(this.b.E(), this.c, C4685ft0.this.Z, C4685ft0.this.a0, this.d, this.e, C4685ft0.this.b0, fR, this.f, this.g, C4685ft0.this.k0, this.h)) {
                return Boolean.FALSE;
            }
            if (!this.b.L(C4685ft0.this.Z, Math.max(C4685ft0.this.a0.a, C4685ft0.this.a0.b))) {
                C4685ft0.this.H[num.intValue()].setVisible(false);
                return Boolean.FALSE;
            }
            C4685ft0.this.H[num.intValue()].setVisible(true);
            C4685ft0.this.H[num.intValue()].f(this.b.E());
            VT.d(C4685ft0.this.e0, C4685ft0.this.H[num.intValue()].a(), C4685ft0.this.f0);
            iArr[0] = VT.g(C4685ft0.this.e0, 0);
            C1665Nc1 position2 = C4685ft0.this.H[num.intValue()].getPosition();
            C4685ft0 c4685ft0 = C4685ft0.this;
            c4685ft0.k0(c4685ft0.H[num.intValue()], position2.a, position2.b, position2.c, C4685ft0.this.H[num.intValue()].g(), fArr);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.daaw.ft0$d */
    public class d implements HQ {
        public d() {
        }

        @Override // com.daaw.HQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean j(Integer num, float[] fArr, float[] fArr2) {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: com.daaw.ft0$e */
    public class e implements HQ {
        public e() {
        }

        @Override // com.daaw.HQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean j(Integer num, float[] fArr, int[] iArr) {
            C1665Nc1 position = C4685ft0.this.H[num.intValue()].getPosition();
            C4685ft0 c4685ft0 = C4685ft0.this;
            InterfaceC8213sX interfaceC8213sX = c4685ft0.H[num.intValue()];
            C4685ft0 c4685ft02 = C4685ft0.this;
            float f = c4685ft02.g0;
            c4685ft0.k0(interfaceC8213sX, f + (f - position.a), position.b, position.c, -c4685ft02.H[num.intValue()].g(), fArr);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.daaw.ft0$f */
    public class f implements HQ {
        public f() {
        }

        @Override // com.daaw.HQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean j(Integer num, float[] fArr, int[] iArr) {
            C1665Nc1 position = C4685ft0.this.H[num.intValue()].getPosition();
            C4685ft0 c4685ft0 = C4685ft0.this;
            InterfaceC8213sX interfaceC8213sX = c4685ft0.H[num.intValue()];
            float f = position.a;
            C4685ft0 c4685ft02 = C4685ft0.this;
            float f2 = c4685ft02.h0;
            c4685ft0.k0(interfaceC8213sX, f, f2 + (f2 - position.b), position.c, -c4685ft02.H[num.intValue()].g(), fArr);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.daaw.ft0$g */
    public class g implements HQ {
        public g() {
        }

        @Override // com.daaw.HQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean j(Integer num, float[] fArr, int[] iArr) {
            C1665Nc1 position = C4685ft0.this.H[num.intValue()].getPosition();
            C4685ft0 c4685ft0 = C4685ft0.this;
            InterfaceC8213sX interfaceC8213sX = c4685ft0.H[num.intValue()];
            C4685ft0 c4685ft02 = C4685ft0.this;
            float f = c4685ft02.g0;
            float f2 = f + (f - position.a);
            float f3 = c4685ft02.h0;
            c4685ft0.k0(interfaceC8213sX, f2, f3 + (f3 - position.b), position.c, -c4685ft02.H[num.intValue()].g(), fArr);
            return Boolean.TRUE;
        }
    }

    public C4685ft0() {
        super(2, 0.5f, 0.5f);
        this.G = 0;
        this.H = new InterfaceC8213sX[0];
        this.I = 0.0f;
        this.J = null;
        this.K = 0.03f;
        this.L = null;
        this.M = -1;
        this.N = 1.0f;
        this.O = 1.0f;
        this.P = C1477Lh0.a();
        this.Q = C1477Lh0.a();
        this.R = false;
        this.S = false;
        this.T = null;
        this.U = 0.0f;
        this.V = 90.0f;
        this.W = null;
        this.X = new C1665Nc1(0.0f, 0.0f, 0.0f);
        this.Y = new C1665Nc1(0.0f, 0.0f, 0.0f);
        this.Z = new C1458Lc1(0.0f, 0.0f);
        this.a0 = new C1458Lc1(0.0f, 0.0f);
        this.b0 = new C1458Lc1(0.0f, 0.0f);
        this.c0 = new C1458Lc1(0.0f, 0.0f);
        this.d0 = new C1458Lc1(0.0f, 0.0f);
        this.e0 = new float[4];
        this.f0 = new float[4];
        this.i0 = 6.2831855f;
        this.k0 = new C3755cc1();
        this.l0 = 40.0f;
        this.m0 = new b();
        this.n0 = new d();
        this.o0 = new e();
        this.p0 = new f();
        this.q0 = new g();
        this.j0 = new C9264wF(new a(), null, null, null);
        String[] strArr = r0;
        m0(strArr[0]);
        e0(new C2215Se());
        J(2);
        R(0.5f, 0.5f);
        r0(1500);
        t0(0.02f);
        l0(new C0607Da().t(1.0f));
        J(2);
        n0(new C1477Lh0("Beat", 1.5f));
        s0(2.0f);
        m0(strArr[1]);
        u0(900.0f);
        v0(150.0f);
        C2215Se c2215SeJ0 = j0();
        c2215SeJ0.A(0.5f);
        c2215SeJ0.B(0.25f);
        c2215SeJ0.t(-1);
        c2215SeJ0.u(-2139062144);
        c2215SeJ0.z(8.0f);
        c2215SeJ0.x(0.1f);
        c2215SeJ0.C(0.0f);
        c2215SeJ0.y(4.0f);
        c2215SeJ0.v(4.0f);
        c2215SeJ0.w(10.0f);
        c2215SeJ0.c(100.0f);
        c2215SeJ0.j(60.0f);
        c2215SeJ0.s(0.0f);
    }

    @Override // com.daaw.AbstractC8699uF
    public void B(TH0 th0, AbstractC7070oQ abstractC7070oQ) {
        C1458Lc1 c1458Lc1;
        InterfaceC6129l2 interfaceC6129l2;
        float f2;
        float fWidth;
        float fHeight;
        C1458Lc1 c1458Lc12;
        TH0 th02;
        super.B(th0, abstractC7070oQ);
        this.j0.u(th0, abstractC7070oQ);
        if (this.H.length != this.G) {
            return;
        }
        RectF rectFN = n(th0.u.b);
        C1458Lc1 c1458Lc13 = new C1458Lc1(0.0f, 0.0f);
        C1458Lc1 c1458Lc14 = new C1458Lc1(0.0f, 0.0f);
        float f3 = this.U;
        if (f3 > 1.0f) {
            InterfaceC6129l2 interfaceC6129l22 = this.m0;
            th0.s(this.k0, c1458Lc13, abstractC7070oQ, this.V, 0.01f, f3 - (-20.0f), -0.5f, -0.5f, -10.0f);
            c1458Lc1 = c1458Lc13;
            fWidth = rectFN.width() / c1458Lc1.a;
            fHeight = rectFN.height() / c1458Lc1.b;
            interfaceC6129l2 = interfaceC6129l22;
            f2 = -f3;
        } else {
            c1458Lc1 = c1458Lc13;
            interfaceC6129l2 = null;
            f2 = 0.0f;
            fWidth = 1.0f;
            fHeight = 1.0f;
        }
        this.I += th0.E();
        if (this.L == null || this.J == null) {
            return;
        }
        float fMax = Math.max(0.01f, this.K);
        this.K = fMax;
        float f4 = this.I;
        this.I = Math.min(fMax * f4 * 100.0f, f4);
        while (true) {
            float f5 = this.I;
            float f6 = this.K;
            if (f5 <= f6) {
                break;
            }
            this.I = f5 - f6;
            int iG0 = g0();
            if (iG0 < 0 || iG0 >= this.H.length) {
                c1458Lc12 = c1458Lc14;
            } else {
                this.J.l(rectFN, this.X, this.Y, this.U > 1.0f);
                if (this.U > 1.0f) {
                    th02 = th0;
                    c1458Lc12 = c1458Lc14;
                    th02.t(c1458Lc12, f2, abstractC7070oQ, c1458Lc1.a / c1458Lc1.b, this.V);
                    float fWidth2 = (c1458Lc12.a * 2.0f) / rectFN.width();
                    float fHeight2 = (c1458Lc12.b * 2.0f) / rectFN.height();
                    C1665Nc1 c1665Nc1 = this.X;
                    c1665Nc1.a = ((c1665Nc1.a - rectFN.centerX()) * fWidth2 * fWidth) + rectFN.centerX();
                    C1665Nc1 c1665Nc12 = this.X;
                    c1665Nc12.b = ((c1665Nc12.b - rectFN.centerY()) * fHeight2 * fHeight) + rectFN.centerY();
                } else {
                    th02 = th0;
                    c1458Lc12 = c1458Lc14;
                    this.Y.c = 0.0f;
                }
                InterfaceC8492tX interfaceC8492tX = this.L;
                InterfaceC8213sX interfaceC8213sX = this.H[iG0];
                C1665Nc1 c1665Nc13 = this.X;
                interfaceC8492tX.g(th02, interfaceC8213sX, new C1665Nc1(c1665Nc13.a, c1665Nc13.b, f2), this.Y);
            }
            c1458Lc14 = c1458Lc12;
        }
        IW iwM = this.j0.m(th0);
        if (iwM == null) {
            iwM = th0.u.c();
        }
        RH0 rh0 = new RH0(f(), iwM, th0.u.u(), interfaceC6129l2);
        if (this.U > 1.0f) {
            w0(th0, abstractC7070oQ, rectFN, this.L.b(), rh0, new C1458Lc1(c1458Lc1.a * 0.5f, c1458Lc1.b * 0.5f));
        } else {
            w0(th0, abstractC7070oQ, rectFN, this.L.b(), rh0, null);
        }
    }

    public void e0(InterfaceC8492tX interfaceC8492tX) {
        this.L = interfaceC8492tX;
        l();
    }

    public int g0() {
        int i = 0;
        while (true) {
            InterfaceC8213sX[] interfaceC8213sXArr = this.H;
            if (i >= interfaceC8213sXArr.length || !interfaceC8213sXArr[i].e()) {
                break;
            }
            i++;
        }
        if (i < this.H.length) {
            return i;
        }
        return -1;
    }

    @Override // com.daaw.AbstractC8699uF
    public String h() {
        return "Particles";
    }

    public float h0() {
        return this.l0;
    }

    public int i0() {
        return this.G;
    }

    public C2215Se j0() {
        return (C2215Se) this.L;
    }

    public void k0(InterfaceC8213sX interfaceC8213sX, float f2, float f3, float f4, float f5, float[] fArr) {
        this.c0.a = -interfaceC8213sX.b();
        this.c0.b = -interfaceC8213sX.c();
        this.c0.r(f5);
        this.d0.a = interfaceC8213sX.b();
        this.d0.b = -interfaceC8213sX.c();
        this.d0.r(f5);
        C1458Lc1 c1458Lc1 = this.c0;
        float f6 = c1458Lc1.a;
        fArr[0] = f2 + f6;
        float f7 = c1458Lc1.b;
        fArr[1] = f3 + f7;
        C1458Lc1 c1458Lc12 = this.d0;
        float f8 = c1458Lc12.a;
        fArr[2] = f2 + f8;
        float f9 = c1458Lc12.b;
        fArr[3] = f3 + f9;
        fArr[4] = f2 - f8;
        fArr[5] = f3 - f9;
        fArr[6] = f2 - f6;
        fArr[7] = f3 - f7;
        fArr[8] = f4;
    }

    @Override // com.daaw.AbstractC8699uF
    public void l() {
        super.l();
        C9264wF c9264wF = this.j0;
        if (c9264wF != null) {
            c9264wF.p();
        }
    }

    public void l0(HW hw) {
        this.J = hw;
    }

    public void m0(String str) {
        this.j0.C(str);
    }

    public void n0(C1477Lh0 c1477Lh0) {
        this.Q = c1477Lh0;
    }

    public void o0(boolean z) {
        this.S = z;
    }

    public void p0(boolean z) {
        this.R = z;
    }

    public void q0(float f2) {
        this.l0 = f2;
    }

    public void r0(int i) {
        if (this.G == i) {
            return;
        }
        this.G = i;
        l();
    }

    public void s0(float f2) {
        this.N = f2;
    }

    @Override // com.daaw.AbstractC8699uF
    public void t(C2591Vu c2591Vu) {
        super.t(c2591Vu);
        m0(c2591Vu.x("customImage", r0[0]));
        this.M = c2591Vu.s("color", -1);
        r0(c2591Vu.s("CountLimit", 1500));
        this.N = c2591Vu.p("particleScale", 2.0f);
        this.K = c2591Vu.p("spawnTime", 0.02f);
        o0(c2591Vu.o("mirrorX", false));
        p0(c2591Vu.o("mirrorY", false));
        u0(c2591Vu.p("perspectiveDepth", 900.0f));
        v0(c2591Vu.p("perspectiveFov", 150.0f));
        C2591Vu c2591VuH = c2591Vu.h("SpawnArea");
        l0(AbstractC10185za.a(c2591VuH.D("Rectangle"), this.J));
        HW hw = this.J;
        if (hw != null) {
            hw.a(c2591VuH);
        }
        this.Q.m(c2591Vu.h("MeasureOverallSpeed"), "Beat", 1.5f);
        InterfaceC8492tX interfaceC8492tX = this.L;
        if (interfaceC8492tX != null) {
            interfaceC8492tX.a(c2591Vu);
        }
        C2591Vu c2591VuH2 = c2591Vu.h("ForceField");
        InterfaceC5135hX interfaceC5135hXA = XO.a(c2591VuH2.D("None"), this.T);
        this.T = interfaceC5135hXA;
        if (interfaceC5135hXA != null) {
            interfaceC5135hXA.a(c2591VuH2);
        }
        q0(c2591Vu.p("nearCameraFadeOutDistance", h0()));
    }

    public void t0(float f2) {
        this.K = f2;
    }

    public void u0(float f2) {
        this.U = f2;
    }

    @Override // com.daaw.AbstractC8699uF
    public boolean v(TH0 th0) {
        super.v(th0);
        int length = this.H.length;
        int i = this.G;
        if (length != i) {
            if (this.L != null) {
                this.H = new InterfaceC8213sX[i];
                int i2 = 0;
                while (true) {
                    InterfaceC8213sX[] interfaceC8213sXArr = this.H;
                    if (i2 >= interfaceC8213sXArr.length) {
                        break;
                    }
                    interfaceC8213sXArr[i2] = this.L.h();
                    i2++;
                }
            } else {
                this.H = new InterfaceC8213sX[0];
            }
        }
        this.j0.q(th0, new RectF(0.0f, 0.0f, 256.0f, 256.0f), 0);
        return true;
    }

    public void v0(float f2) {
        this.V = f2;
    }

    @Override // com.daaw.AbstractC8699uF
    public void w(TH0 th0, int i) {
        super.w(th0, i);
        this.j0.r(th0, i);
    }

    public final void w0(TH0 th0, AbstractC7070oQ abstractC7070oQ, RectF rectF, float f2, RH0 rh0, C1458Lc1 c1458Lc1) {
        float fI = this.N + this.P.i(th0.u.b);
        float fI2 = this.O + (this.Q.i(th0.u.b) * 5.0f);
        float fE = th0.b().a().e(fI) * 0.001f;
        float fE2 = th0.b().a().e(f2) * 0.0013888889f;
        float fE3 = th0.b().a().e(0.0013888889f);
        rectF.centerX();
        rectF.centerY();
        this.g0 = rectF.centerX();
        this.h0 = rectF.centerY();
        VT.n(this.f0, this.M);
        float fMax = Math.max(1.0E-6f, this.l0);
        AbstractC5460ih abstractC5460ihP = th0.u.p();
        c cVar = new c(rectF, th0, fE3, fE, fI2, fE2, c1458Lc1, fMax);
        boolean z = this.S;
        HQ hq = null;
        HQ hq2 = z ? this.o0 : null;
        boolean z2 = this.R;
        HQ hq3 = z2 ? this.p0 : null;
        if (z && z2) {
            hq = this.q0;
        }
        abstractC5460ihP.j(th0, cVar, hq2, hq3, hq, this.G, 0.0f, new C1458Lc1(0.0f, 1.0f), new C1458Lc1(1.0f, 0.0f), rh0);
    }

    @Override // com.daaw.AbstractC8699uF
    public void x(TH0 th0) {
        super.x(th0);
        C9264wF c9264wF = this.j0;
        if (c9264wF != null) {
            c9264wF.s(th0);
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public void y(InterfaceC9336wX interfaceC9336wX, AbstractC7070oQ abstractC7070oQ, MW mw) {
        super.y(interfaceC9336wX, abstractC7070oQ, mw);
        this.j0.t(interfaceC9336wX, abstractC7070oQ, mw);
    }

    @Override // com.daaw.AbstractC8699uF
    public void z(C2591Vu c2591Vu, InterfaceC4577fX interfaceC4577fX) {
        super.z(c2591Vu, interfaceC4577fX);
        c2591Vu.s0(j(JD0.E6));
        interfaceC4577fX.a(this.j0.j());
        c2591Vu.i0("customImage", this.j0.j(), "appearance", C4268eS.o ? s0 : r0);
        c2591Vu.V("color", this.M, "1_overall");
        c2591Vu.Y("CountLimit", i0(), "1_overall", 1, 5000);
        c2591Vu.Q("particleScale", this.N, "appearance", 0.25f, 8.0f);
        c2591Vu.Q("spawnTime", this.K, "behaviour", 0.005f, 0.05f);
        c2591Vu.N("mirrorX", this.S, "1_overall");
        c2591Vu.N("mirrorY", this.R, "1_overall");
        c2591Vu.Q("perspectiveDepth", this.U, "1_overall", 0.0f, 1000.0f);
        c2591Vu.Q("perspectiveFov", this.V, "1_overall", 30.0f, 180.0f);
        C2591Vu c2591VuG = c2591Vu.G("SpawnArea", AbstractC10185za.b(this.J), "1_overall", AbstractC10185za.a);
        HW hw = this.J;
        if (hw != null) {
            hw.q(c2591VuG);
        }
        C2591Vu c2591VuG2 = c2591Vu.G("MeasureOverallSpeed", "", "behaviour", new String[0]);
        C1477Lh0 c1477Lh0 = this.Q;
        if (c1477Lh0 != null) {
            c1477Lh0.r(c2591VuG2);
        }
        InterfaceC8492tX interfaceC8492tX = this.L;
        if (interfaceC8492tX != null) {
            interfaceC8492tX.q(c2591Vu);
        }
        C2591Vu c2591VuG3 = c2591Vu.G("ForceField", XO.b(this.T), "1_overall", XO.a);
        InterfaceC5135hX interfaceC5135hX = this.T;
        if (interfaceC5135hX != null) {
            interfaceC5135hX.q(c2591VuG3);
        }
        c2591Vu.Q("nearCameraFadeOutDistance", h0(), "appearance", 0.0f, 500.0f);
    }
}
