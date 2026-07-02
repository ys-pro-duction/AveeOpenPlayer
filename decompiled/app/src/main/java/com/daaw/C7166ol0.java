package com.daaw;

import android.graphics.RectF;
import android.opengl.GLES20;
import com.daaw.C9264wF;

/* JADX INFO: renamed from: com.daaw.ol0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7166ol0 extends AbstractC8699uF {
    public static final String[] d0 = {"composition:0"};
    public static final String[] e0 = {"EffectTransform", "Manual"};
    public String G;
    public int H;
    public int I;
    public C9264wF J;
    public boolean K;
    public boolean L;
    public boolean M;
    public C1469Lf0 N;
    public C1469Lf0 O;
    public C1469Lf0 P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public float X;
    public final C3755cc1 Y;
    public InterfaceC6129l2 Z;
    public InterfaceC5841k2 a0;
    public InterfaceC6129l2 b0;
    public InterfaceC6129l2 c0;

    /* JADX INFO: renamed from: com.daaw.ol0$a */
    public class a implements C9264wF.b {
        public a() {
        }

        @Override // com.daaw.C9264wF.b
        public void a() {
            C7166ol0.this.m();
        }
    }

    /* JADX INFO: renamed from: com.daaw.ol0$d */
    public class d implements InterfaceC6129l2 {
        public d() {
        }

        @Override // com.daaw.InterfaceC6129l2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(TH0 th0, C4880gc1 c4880gc1, RH0 rh0) {
            c4880gc1.E("u_projView", false, C7166ol0.this.Y.a());
        }
    }

    /* JADX INFO: renamed from: com.daaw.ol0$e */
    public class e implements InterfaceC6129l2 {
        public e() {
        }

        @Override // com.daaw.InterfaceC6129l2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(TH0 th0, C4880gc1 c4880gc1, RH0 rh0) {
            IW iwF = rh0.f();
            float width = 1.0f / iwF.getWidth();
            float height = 1.0f / iwF.getHeight();
            c4880gc1.E("u_projView", false, C7166ol0.this.Y.a());
            float fI = C7166ol0.this.N.i(th0.b().a());
            C1458Lc1 c1458Lc1 = new C1458Lc1(C7166ol0.this.S, C7166ol0.this.T);
            c1458Lc1.a = c1458Lc1.a * fI * width;
            c1458Lc1.b = c1458Lc1.b * fI * height;
            if (c1458Lc1.k() > 4.0f) {
                c1458Lc1.o();
                c1458Lc1.a *= 4.0f;
                c1458Lc1.b *= 4.0f;
            }
            c4880gc1.t("posAmount", (-c1458Lc1.a) * 2.0f, c1458Lc1.b * 2.0f);
            C1458Lc1 c1458Lc12 = new C1458Lc1(C7166ol0.this.W, C7166ol0.this.X);
            float f = c1458Lc12.a * fI * width;
            c1458Lc12.a = f;
            float f2 = c1458Lc12.b * fI * height;
            c1458Lc12.b = f2;
            c4880gc1.t("scaleAmount", (-f) * 2.0f, f2 * 2.0f);
        }
    }

    public C7166ol0() {
        super(4, 1.0f, 1.0f);
        this.G = "";
        this.H = -1;
        this.I = 2;
        this.K = false;
        this.L = false;
        this.M = true;
        this.N = C1469Lf0.a(1.0f);
        this.O = C1469Lf0.b(0.5f, 0.5f);
        this.P = C1469Lf0.b(0.0f, 0.0f);
        this.Q = 0.0f;
        this.R = 0.0f;
        this.S = 0.0f;
        this.T = 0.0f;
        this.U = 0.0f;
        this.V = 0.0f;
        this.W = 0.0f;
        this.X = 0.0f;
        this.Y = new C3755cc1();
        this.Z = new b();
        this.a0 = new c();
        this.b0 = new d();
        this.c0 = new e();
        this.d = "BeatCamShakeMore";
        J(4);
        R(1.0f, 1.0f);
        this.J = new C9264wF(new a(), null, null, null);
        r0("composition:1");
    }

    private void s0(TH0 th0) {
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        th0.T(1);
    }

    @Override // com.daaw.AbstractC8699uF
    public void B(TH0 th0, AbstractC7070oQ abstractC7070oQ) {
        RectF rectFR;
        this.J.u(th0, abstractC7070oQ);
        IW iwM = this.J.m(th0);
        C(th0);
        if (iwM == null) {
            super.B(th0, abstractC7070oQ);
            return;
        }
        boolean z = this.M;
        RectF rectFN = n(th0.b().a());
        b(th0, this.Y, rectFN.centerX(), rectFN.centerY(), s(th0.b().a()));
        if (e0[1].equals(this.G)) {
            rectFR = AbstractC8699uF.r(th0.b().a(), this.O, this.P);
        } else {
            rectFR = rectFN;
            z = true;
        }
        if (z) {
            this.S = this.Q - rectFR.centerX();
            this.T = this.R - rectFR.centerY();
            this.Q = rectFR.centerX();
            this.R = rectFR.centerY();
            this.W = this.U - rectFR.width();
            this.X = this.V - rectFR.height();
            this.U = rectFR.width();
            this.V = rectFR.height();
        } else {
            this.S = rectFR.centerX();
            this.T = rectFR.centerY();
            this.Q = rectFR.centerX();
            this.R = rectFR.centerY();
            this.W = rectFR.width();
            this.X = rectFR.height();
            this.U = rectFR.width();
            this.V = rectFR.height();
        }
        s0(th0);
        super.B(th0, abstractC7070oQ);
        if (this.L) {
            C4312ec1 c4312ec1U = th0.u.u();
            th0.j().o(th0, rectFN.left, rectFN.top, 0.0f, rectFN.width(), rectFN.height(), -1, C1458Lc1.s(), C1458Lc1.q(), new RH0(e0(), this.J.m(th0), c4312ec1U, this.b0), true);
        }
        VT.n(new float[4], this.H);
        th0.j().o(th0, rectFN.left, rectFN.top, 0.0f, rectFN.width(), rectFN.height(), -1, C1458Lc1.s(), C1458Lc1.q(), new RH0(f(), iwM, th0.u.q(), this.c0), true);
        if (this.K) {
            th0.j().o(th0, rectFN.left, rectFN.top, 0.0f, rectFN.width(), rectFN.height(), -1, C1458Lc1.s(), C1458Lc1.q(), new RH0(e0(), iwM, (C4312ec1) null, (InterfaceC6129l2) null), true);
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public void F(TH0 th0) {
        super.F(th0);
    }

    public int e0() {
        return this.I;
    }

    public boolean f0() {
        return this.M;
    }

    public boolean g0() {
        return this.K;
    }

    @Override // com.daaw.AbstractC8699uF
    public String h() {
        return "MotionBlurEffect";
    }

    public boolean h0() {
        return this.L;
    }

    public String i0() {
        return this.J.j();
    }

    public void j0(int i) {
        this.I = i;
    }

    public void k0(int i) {
        this.H = i;
    }

    @Override // com.daaw.AbstractC8699uF
    public void l() {
        super.l();
        C9264wF c9264wF = this.J;
        if (c9264wF != null) {
            c9264wF.p();
        }
    }

    public void l0(boolean z) {
        this.M = z;
    }

    public void m0(boolean z) {
        this.K = z;
    }

    public void n0(boolean z) {
        this.L = z;
    }

    public void o0(C1469Lf0 c1469Lf0) {
        this.P = c1469Lf0;
    }

    public void p0(C1469Lf0 c1469Lf0) {
        this.O = c1469Lf0;
    }

    public void q0(C1469Lf0 c1469Lf0) {
        this.N = c1469Lf0;
    }

    public void r0(String str) {
        this.J.C(str);
    }

    @Override // com.daaw.AbstractC8699uF
    public void t(C2591Vu c2591Vu) {
        super.t(c2591Vu);
        super.u(c2591Vu);
        j0(AbstractC2427Uf.a(c2591Vu.h("blendModeContent").C(), 2));
        k0(c2591Vu.s("color", -1));
        r0(c2591Vu.x("TargetImage", "composition:1"));
        m0(c2591Vu.o("showUnblurredContent", false));
        n0(c2591Vu.o("showUnblurredContentUnder", false));
        q0(c2591Vu.t("blurAmountMultiplier", C1469Lf0.a(1.0f)));
        C2591Vu c2591VuH = c2591Vu.h("motionSource");
        this.G = c2591VuH.D(e0[0]);
        p0(c2591VuH.t("posBlurAmount", C1469Lf0.b(0.5f, 0.5f)));
        o0(c2591VuH.t("scaleBlurAmount", C1469Lf0.b(0.0f, 0.0f)));
        l0(c2591Vu.o("relativeMotionMode", true));
    }

    @Override // com.daaw.AbstractC8699uF
    public boolean v(TH0 th0) {
        this.J.q(th0, q(th0.u.b), 0);
        return super.v(th0);
    }

    @Override // com.daaw.AbstractC8699uF
    public void w(TH0 th0, int i) {
        this.J.r(th0, i);
        super.w(th0, i);
    }

    @Override // com.daaw.AbstractC8699uF
    public void x(TH0 th0) {
        super.x(th0);
        C9264wF c9264wF = this.J;
        if (c9264wF != null) {
            c9264wF.s(th0);
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public void y(InterfaceC9336wX interfaceC9336wX, AbstractC7070oQ abstractC7070oQ, MW mw) {
        super.y(interfaceC9336wX, abstractC7070oQ, mw);
        this.J.t(interfaceC9336wX, abstractC7070oQ, mw);
    }

    @Override // com.daaw.AbstractC8699uF
    public void z(C2591Vu c2591Vu, InterfaceC4577fX interfaceC4577fX) {
        super.z(c2591Vu, interfaceC4577fX);
        super.A(c2591Vu);
        c2591Vu.s0(j(JD0.D6));
        c2591Vu.G("blendModeContent", AbstractC2427Uf.b(this.I), "1_appearance", AbstractC2427Uf.c);
        c2591Vu.U("color", this.H, "1_appearance");
        interfaceC4577fX.a(i0());
        c2591Vu.h0("TargetImage", i0(), "1_appearance", d0);
        c2591Vu.N("showUnblurredContent", g0(), "1_appearance");
        c2591Vu.N("showUnblurredContentUnder", h0(), "1_appearance");
        c2591Vu.b0("blurAmountMultiplier", this.N, "2_motionBlur", 0.0f, 2.0f);
        String str = this.G;
        String[] strArr = e0;
        C2591Vu c2591VuG = c2591Vu.G("motionSource", str, "2_motionBlur", strArr);
        if (strArr[1].equals(this.G)) {
            c2591VuG.d0("posBlurAmount", this.O, "2_motionBlur", 0.0f, 2.0f);
            c2591VuG.d0("scaleBlurAmount", this.P, "2_motionBlur", -1.0f, 1.0f);
        }
        c2591Vu.N("relativeMotionMode", f0(), "2_motionBlur");
    }

    /* JADX INFO: renamed from: com.daaw.ol0$c */
    public class c implements InterfaceC5841k2 {
        public c() {
        }

        @Override // com.daaw.InterfaceC5841k2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(TH0 th0, C4880gc1 c4880gc1) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.ol0$b */
    public class b implements InterfaceC6129l2 {
        public b() {
        }

        @Override // com.daaw.InterfaceC6129l2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(TH0 th0, C4880gc1 c4880gc1, RH0 rh0) {
        }
    }
}
