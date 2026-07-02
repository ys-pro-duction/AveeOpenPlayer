package com.daaw;

import android.graphics.RectF;
import android.opengl.GLES20;
import com.daaw.C9264wF;

/* JADX INFO: renamed from: com.daaw.wJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9281wJ0 extends AbstractC8699uF {
    public static final String[] Y = {"composition:0"};
    public int G;
    public int H;
    public C9264wF I;
    public boolean J;
    public boolean K;
    public C1469Lf0 L;
    public C1469Lf0 M;
    public float[] N;
    public float[] O;
    public float[] P;
    public C1458Lc1[] Q;
    public G3 R;
    public boolean S;
    public final C3755cc1 T;
    public InterfaceC6129l2 U;
    public InterfaceC5841k2 V;
    public InterfaceC6129l2 W;
    public InterfaceC6129l2 X;

    /* JADX INFO: renamed from: com.daaw.wJ0$a */
    public class a implements C9264wF.b {
        public a() {
        }

        @Override // com.daaw.C9264wF.b
        public void a() {
            C9281wJ0.this.m();
        }
    }

    /* JADX INFO: renamed from: com.daaw.wJ0$b */
    public class b implements FQ {
        public b() {
        }

        @Override // com.daaw.FQ
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public G3 a(InterfaceC9336wX interfaceC9336wX) {
            if (interfaceC9336wX != null) {
                C9281wJ0.this.R = interfaceC9336wX.b().b().k();
            }
            return C9281wJ0.this.R;
        }
    }

    /* JADX INFO: renamed from: com.daaw.wJ0$e */
    public class e implements InterfaceC6129l2 {
        public e() {
        }

        @Override // com.daaw.InterfaceC6129l2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(TH0 th0, C4880gc1 c4880gc1, RH0 rh0) {
            c4880gc1.E("u_projView", false, C9281wJ0.this.T.a());
        }
    }

    /* JADX INFO: renamed from: com.daaw.wJ0$f */
    public class f implements InterfaceC6129l2 {
        public f() {
        }

        @Override // com.daaw.InterfaceC6129l2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(TH0 th0, C4880gc1 c4880gc1, RH0 rh0) {
            c4880gc1.E("u_projView", false, C9281wJ0.this.T.a());
            float fI = C9281wJ0.this.L.i(th0.b().a());
            C1458Lc1 c1458Lc1 = new C1458Lc1(0.0f, 0.0f);
            C9281wJ0.this.M.j(th0.b().a(), c1458Lc1);
            c4880gc1.t("dirAmount", c1458Lc1.a * fI, c1458Lc1.b * fI);
            c4880gc1.u("splitColor0", C9281wJ0.this.N[0], C9281wJ0.this.N[1], C9281wJ0.this.N[2]);
            c4880gc1.u("splitColor1", C9281wJ0.this.O[0], C9281wJ0.this.O[1], C9281wJ0.this.O[2]);
            c4880gc1.u("splitColor2", C9281wJ0.this.P[0], C9281wJ0.this.P[1], C9281wJ0.this.P[2]);
        }
    }

    public C9281wJ0() {
        super(4, 1.0f, 1.0f);
        this.G = -1;
        this.H = 2;
        this.J = false;
        this.K = false;
        this.L = C1469Lf0.a(6.0f);
        this.M = new C1469Lf0(new C1477Lh0("BeatRandomShake", 0.5f, 0.5f));
        this.N = new float[]{1.0f, 0.0f, 0.0f, 1.0f};
        this.O = new float[]{0.0f, 1.0f, 0.0f, 1.0f};
        this.P = new float[]{0.0f, 0.0f, 1.0f, 1.0f};
        this.Q = new C1458Lc1[3];
        this.R = null;
        this.S = true;
        this.T = new C3755cc1();
        this.U = new c();
        this.V = new d();
        this.W = new e();
        this.X = new f();
        R(1.0f, 1.0f);
        J(4);
        this.Q[0] = new C1458Lc1(1.0f, 1.0f);
        int i = 1;
        while (true) {
            C1458Lc1[] c1458Lc1Arr = this.Q;
            if (i >= c1458Lc1Arr.length) {
                this.I = new C9264wF(new a(), new b(), null, null);
                u0("composition:1");
                return;
            } else {
                c1458Lc1Arr[i] = new C1458Lc1(0.0f, 0.0f);
                i++;
            }
        }
    }

    private void v0(TH0 th0) {
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        th0.T(1);
    }

    @Override // com.daaw.AbstractC8699uF
    public void B(TH0 th0, AbstractC7070oQ abstractC7070oQ) {
        this.I.u(th0, abstractC7070oQ);
        IW iwM = this.I.m(th0);
        if (iwM == null) {
            super.B(th0, abstractC7070oQ);
            return;
        }
        C(th0);
        RectF rectFN = n(th0.b().a());
        b(th0, this.T, rectFN.centerX(), rectFN.centerY(), s(th0.b().a()));
        v0(th0);
        super.B(th0, abstractC7070oQ);
        if (this.K) {
            th0.u(rectFN.left, rectFN.top, -1, new RH0(e0(), iwM, th0.u.u(), this.W));
        }
        for (int length = this.Q.length - 1; length >= 0; length--) {
            C1458Lc1 c1458Lc1 = this.Q[length];
            float f2 = c1458Lc1.a;
            if (f2 != 0.0f) {
                float f3 = c1458Lc1.b;
                if (f3 != 0.0f) {
                    float f4 = (1.0f / f2) * 0.5f;
                    float f5 = (1.0f / f3) * 0.5f;
                    th0.v(rectFN.left, rectFN.top, this.G, new C1458Lc1(0.5f - f4, 0.5f - f5), new C1458Lc1(f4 + 0.5f, f5 + 0.5f), new RH0(f(), iwM, th0.u.r(), this.X));
                }
            }
        }
        if (this.J) {
            th0.u(rectFN.left, rectFN.top, -1, new RH0(e0(), iwM, (C4312ec1) null, (InterfaceC6129l2) null));
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public void F(TH0 th0) {
        super.F(th0);
    }

    public int e0() {
        return this.H;
    }

    public boolean f0() {
        return this.J;
    }

    public boolean g0() {
        return this.K;
    }

    @Override // com.daaw.AbstractC8699uF
    public String h() {
        return "RgbSplitEffect";
    }

    public int h0() {
        return VT.f(this.N);
    }

    public int i0() {
        return VT.f(this.O);
    }

    public int j0() {
        return VT.f(this.P);
    }

    public String k0() {
        return this.I.j();
    }

    @Override // com.daaw.AbstractC8699uF
    public void l() {
        super.l();
        C9264wF c9264wF = this.I;
        if (c9264wF != null) {
            c9264wF.p();
        }
    }

    public void l0(int i) {
        this.H = i;
    }

    public void m0(int i) {
        this.G = i;
    }

    public void n0(boolean z) {
        this.J = z;
    }

    public void o0(boolean z) {
        this.K = z;
    }

    public void p0(C1469Lf0 c1469Lf0) {
        this.M = c1469Lf0;
    }

    public void q0(int i) {
        VT.n(this.N, i);
    }

    public void r0(int i) {
        VT.n(this.O, i);
    }

    public void s0(int i) {
        VT.n(this.P, i);
    }

    @Override // com.daaw.AbstractC8699uF
    public void t(C2591Vu c2591Vu) {
        super.t(c2591Vu);
        super.u(c2591Vu);
        l0(AbstractC2427Uf.a(c2591Vu.h("blendModeContent").C(), this.H));
        m0(c2591Vu.s("color", -1));
        u0(c2591Vu.x("targetImage", "composition:1"));
        n0(c2591Vu.o("showUnblurredContent", false));
        o0(c2591Vu.o("showUnblurredContentUnder", false));
        t0(c2591Vu.t("splitMultiplier", C1469Lf0.a(6.0f)));
        p0(c2591Vu.t("splitAmount", new C1469Lf0(new C1477Lh0("BeatRandomShake", 0.5f, 0.5f))));
        q0(c2591Vu.s("splitColor0", -65536));
        r0(c2591Vu.s("splitColor1", -16711936));
        s0(c2591Vu.s("splitColor2", -16776961));
        this.Q[0] = new C1458Lc1(1.0f, 1.0f);
    }

    public void t0(C1469Lf0 c1469Lf0) {
        this.L = c1469Lf0;
    }

    public void u0(String str) {
        this.I.C(str);
    }

    @Override // com.daaw.AbstractC8699uF
    public boolean v(TH0 th0) {
        this.I.q(th0, q(th0.u.b), 0);
        return super.v(th0);
    }

    @Override // com.daaw.AbstractC8699uF
    public void w(TH0 th0, int i) {
        this.I.r(th0, i);
        super.w(th0, i);
    }

    @Override // com.daaw.AbstractC8699uF
    public void x(TH0 th0) {
        super.x(th0);
        C9264wF c9264wF = this.I;
        if (c9264wF != null) {
            c9264wF.s(th0);
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public void y(InterfaceC9336wX interfaceC9336wX, AbstractC7070oQ abstractC7070oQ, MW mw) {
        super.y(interfaceC9336wX, abstractC7070oQ, mw);
        this.I.t(interfaceC9336wX, abstractC7070oQ, mw);
    }

    @Override // com.daaw.AbstractC8699uF
    public void z(C2591Vu c2591Vu, InterfaceC4577fX interfaceC4577fX) {
        super.z(c2591Vu, interfaceC4577fX);
        super.A(c2591Vu);
        c2591Vu.s0(j(JD0.F6));
        c2591Vu.G("blendModeContent", AbstractC2427Uf.b(this.H), "1_appearance", AbstractC2427Uf.c);
        c2591Vu.U("color", this.G, "1_appearance");
        interfaceC4577fX.a(k0());
        c2591Vu.h0("targetImage", k0(), "1_appearance", Y);
        c2591Vu.N("showUnblurredContent", f0(), "1_appearance");
        c2591Vu.N("showUnblurredContentUnder", g0(), "1_appearance");
        c2591Vu.b0("splitMultiplier", this.L, "2_splitEffect", 0.0f, 6.0f);
        c2591Vu.d0("splitAmount", this.M, "2_splitEffect", -0.5f, 0.5f);
        c2591Vu.U("splitColor0", h0(), "2_splitEffect");
        c2591Vu.U("splitColor1", i0(), "2_splitEffect");
        c2591Vu.U("splitColor2", j0(), "2_splitEffect");
    }

    /* JADX INFO: renamed from: com.daaw.wJ0$d */
    public class d implements InterfaceC5841k2 {
        public d() {
        }

        @Override // com.daaw.InterfaceC5841k2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(TH0 th0, C4880gc1 c4880gc1) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.wJ0$c */
    public class c implements InterfaceC6129l2 {
        public c() {
        }

        @Override // com.daaw.InterfaceC6129l2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(TH0 th0, C4880gc1 c4880gc1, RH0 rh0) {
        }
    }
}
