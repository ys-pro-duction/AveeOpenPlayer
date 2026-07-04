package com.daaw;

import android.opengl.GLES20;
import com.daaw.C9264wF;

/* JADX INFO: renamed from: com.daaw.jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5736jg extends AbstractC8699uF {
    public boolean G;
    public float H;
    public float I;
    public C3477bc1[] J;
    public int K;
    public C1458Lc1[] L;
    public int[] M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public final C3755cc1 R;
    public int S;
    public int T;
    public C9264wF U;
    public boolean V;
    public AbstractC3328b31 W;
    public InterfaceC6129l2 X;
    public InterfaceC6129l2 Y;
    public InterfaceC6129l2 Z;
    public InterfaceC6129l2 a0;

    /* JADX INFO: renamed from: com.daaw.jg$a */
    public class a implements C9264wF.b {
        public a() {
        }

        @Override // com.daaw.C9264wF.b
        public void a() {
            C5736jg.this.m();
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg$b */
    public class b implements InterfaceC6129l2 {
        public b() {
        }

        @Override // com.daaw.InterfaceC6129l2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(TH0 th0, C4880gc1 c4880gc1, RH0 rh0) {
            c4880gc1.E("u_projView", false, C5736jg.this.R.a());
            c4880gc1.v("Color2", 0.0f, 0.0f, 0.0f, 1.0f);
            c4880gc1.s("saturation", 1.0f);
            c4880gc1.s("maskadd", 1.0f);
            c4880gc1.s("maskmul", -1.0f);
            c4880gc1.s("mask_l_add", 1.0f);
            c4880gc1.s("mask_l_mul", 0.0f);
            if (rh0.e(0) == rh0.e(1)) {
                c4880gc1.s("tex2_y_add", 0.0f);
                c4880gc1.s("tex2_y_mul", 1.0f);
            } else {
                c4880gc1.s("tex2_y_add", 1.0f);
                c4880gc1.s("tex2_y_mul", -1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg$c */
    public class c implements InterfaceC6129l2 {
        public c() {
        }

        @Override // com.daaw.InterfaceC6129l2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(TH0 th0, C4880gc1 c4880gc1, RH0 rh0) {
            c4880gc1.E("u_projView", false, C5736jg.this.R.a());
            c4880gc1.v("Color2", 0.0f, 0.0f, 0.0f, 1.0f);
            c4880gc1.s("saturation", 1.0f);
            c4880gc1.s("maskadd", 0.0f);
            c4880gc1.s("maskmul", 1.0f);
            c4880gc1.s("mask_l_add", 1.0f);
            c4880gc1.s("mask_l_mul", 0.0f);
            if (rh0.e(0) == rh0.e(1)) {
                c4880gc1.s("tex2_y_add", 0.0f);
                c4880gc1.s("tex2_y_mul", 1.0f);
            } else {
                c4880gc1.s("tex2_y_add", 1.0f);
                c4880gc1.s("tex2_y_mul", -1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg$d */
    public class d implements InterfaceC6129l2 {
        public d() {
        }

        @Override // com.daaw.InterfaceC6129l2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(TH0 th0, C4880gc1 c4880gc1, RH0 rh0) {
            c4880gc1.E("u_projView", false, C5736jg.this.R.a());
            float[] fArr = new float[4];
            VT.n(fArr, C5736jg.this.K);
            c4880gc1.v("Color2", fArr[0], fArr[1], fArr[2], fArr[3]);
            c4880gc1.s("saturation", 1.0f);
            c4880gc1.s("maskadd", 0.0f);
            c4880gc1.s("maskmul", 1.0f);
            c4880gc1.s("mask_l_add", 1.0f);
            c4880gc1.s("mask_l_mul", 0.0f);
            if (rh0.e(0) == rh0.e(1)) {
                c4880gc1.s("tex2_y_add", 0.0f);
                c4880gc1.s("tex2_y_mul", 1.0f);
            } else {
                c4880gc1.s("tex2_y_add", 1.0f);
                c4880gc1.s("tex2_y_mul", -1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg$e */
    public class e implements InterfaceC6129l2 {
        public e() {
        }

        @Override // com.daaw.InterfaceC6129l2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(TH0 th0, C4880gc1 c4880gc1, RH0 rh0) {
            c4880gc1.E("u_projView", false, th0.K());
            IW iwF = rh0.f();
            c4880gc1.t("resolution", 1.0f / iwF.getWidth(), 1.0f / iwF.getHeight());
            c4880gc1.s("blurWH", C5736jg.this.H * 2.0f);
        }
    }

    public C5736jg() {
        super(2, 1.0f, 1.0f);
        this.G = false;
        this.H = 1.0f;
        this.I = 4.1f;
        this.J = new C3477bc1[0];
        this.K = -16777216;
        this.L = new C1458Lc1[3];
        this.M = new int[3];
        this.N = false;
        this.O = false;
        this.P = 2;
        int i = 1;
        this.Q = 1;
        this.R = new C3755cc1();
        this.S = 100;
        this.T = 100;
        this.V = true;
        this.X = new b();
        this.Y = new c();
        this.Z = new d();
        this.a0 = new e();
        R(1.0f, 1.0f);
        this.L[0] = new C1458Lc1(1.0f, 1.0f);
        while (true) {
            C1458Lc1[] c1458Lc1Arr = this.L;
            if (i >= c1458Lc1Arr.length) {
                break;
            }
            c1458Lc1Arr[i] = new C1458Lc1(0.0f, 0.0f);
            i++;
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.M;
            if (i2 >= iArr.length) {
                this.U = new C9264wF(new a(), null, null, null);
                j0(C9264wF.t[0]);
                return;
            } else {
                iArr[i2] = -1;
                i2++;
            }
        }
    }

    private void o0(TH0 th0) {
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        th0.T(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00f4  */
    @Override // com.daaw.AbstractC8699uF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void B(com.daaw.TH0 r19, com.daaw.AbstractC7070oQ r20) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5736jg.B(com.daaw.TH0, com.daaw.oQ):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    @Override // com.daaw.AbstractC8699uF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F(com.daaw.TH0 r6) {
        /*
            r5 = this;
            super.F(r6)
            r0 = 0
            r5.W = r0
            boolean r0 = r5.V
            if (r0 == 0) goto L5d
            int r0 = r5.Q
            com.daaw.bc1 r0 = r6.B(r0)
            com.daaw.TH0$c r1 = r6.u
            com.daaw.u10 r1 = r1.a
            boolean r1 = r1.e()
            r5.n0(r1)
            r5.C(r6)
            if (r0 != 0) goto L21
            goto L5d
        L21:
            float r1 = r5.H
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L57
            com.daaw.bc1[] r1 = r5.J
            int r2 = r1.length
            if (r2 <= 0) goto L57
            r2 = 0
            r1 = r1[r2]
            com.daaw.b31 r0 = r0.b()
            r5.p0(r6, r1, r0)
            r0 = 1
            r1 = 1
        L39:
            com.daaw.bc1[] r2 = r5.J
            int r3 = r2.length
            if (r1 >= r3) goto L4e
            r3 = r2[r1]
            int r4 = r1 + (-1)
            r2 = r2[r4]
            com.daaw.b31 r2 = r2.b()
            r5.p0(r6, r3, r2)
            int r1 = r1 + 1
            goto L39
        L4e:
            int r6 = r2.length
            int r6 = r6 - r0
            r6 = r2[r6]
            com.daaw.b31 r6 = r6.b()
            goto L5b
        L57:
            com.daaw.b31 r6 = r0.b()
        L5b:
            r5.W = r6
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5736jg.F(com.daaw.TH0):void");
    }

    public int c0() {
        return this.P;
    }

    public boolean d0() {
        return this.N;
    }

    public boolean e0() {
        return this.O;
    }

    public void f0(int i) {
        this.P = i;
    }

    public void g0(float f) {
        if (this.I == f) {
            return;
        }
        this.I = f;
        l();
    }

    @Override // com.daaw.AbstractC8699uF
    public String h() {
        return "BlurEffect";
    }

    public void h0(float f) {
        this.H = f;
    }

    public void i0(int i) {
        this.K = i;
    }

    public void j0(String str) {
        this.U.C(str);
    }

    public void k0(int i) {
        this.Q = i;
    }

    @Override // com.daaw.AbstractC8699uF
    public void l() {
        super.l();
        C9264wF c9264wF = this.U;
        if (c9264wF != null) {
            c9264wF.p();
        }
    }

    public void l0(boolean z) {
        this.N = z;
    }

    public void m0(boolean z) {
        this.O = z;
    }

    public void n0(boolean z) {
        if (this.G == z) {
            return;
        }
        this.G = z;
        l();
    }

    public final void p0(TH0 th0, AbstractC7070oQ abstractC7070oQ, AbstractC3328b31 abstractC3328b31) {
        th0.i(abstractC7070oQ);
        th0.y(-1, C1458Lc1.s(), C1458Lc1.q(), new RH0(3, new C1036Hb(abstractC3328b31, false), th0.u.v(), this.a0, 2));
    }

    @Override // com.daaw.AbstractC8699uF
    public void t(C2591Vu c2591Vu) {
        super.t(c2591Vu);
        super.u(c2591Vu);
        R(1.0f, 1.0f);
        f0(AbstractC2427Uf.a(c2591Vu.h("blendModeContent").C(), 2));
        i0(c2591Vu.s("color", -16777216));
        k0(c2591Vu.s("sourceCompositionIndex", 1));
        this.U.C(c2591Vu.x("MaskImage", C9264wF.t[0]));
        h0(c2591Vu.p("blurRadius", 2.0f));
        g0(c2591Vu.p("blurMultiplier", 4.1f));
        l0(c2591Vu.o("showUnblurredContent", false));
        m0(c2591Vu.o("showUnblurredContentUnder", false));
        this.L[0] = c2591Vu.A("1layerScale", new C1458Lc1(1.0f, 1.0f));
        this.L[1] = c2591Vu.A("2layerScale", new C1458Lc1(0.0f, 0.0f));
        this.L[2] = c2591Vu.A("3layerScale", new C1458Lc1(0.0f, 0.0f));
        this.M[0] = c2591Vu.s("1layerColor", -1);
        this.M[1] = c2591Vu.s("2layerColor", -1);
        this.M[2] = c2591Vu.s("3layerColor", -1);
    }

    @Override // com.daaw.AbstractC8699uF
    public boolean v(TH0 th0) {
        C1561Mc1 c1561Mc1I;
        int i;
        C3477bc1[] c3477bc1Arr;
        this.G = th0.u.a.e();
        this.U.q(th0, q(th0.u.b), 0);
        int iRound = Math.round(this.I);
        try {
            c1561Mc1I = th0.I();
            i = 0;
        } catch (Exception e2) {
            AbstractC0441Bk1.c(e2.getMessage());
        }
        while (true) {
            c3477bc1Arr = this.J;
            if (i >= c3477bc1Arr.length) {
                break;
            }
            C3477bc1 c3477bc1 = c3477bc1Arr[i];
            if (c3477bc1 != null) {
                c3477bc1.a();
            }
            i++;
            return super.v(th0);
        }
        if (c3477bc1Arr.length != iRound) {
            this.J = new C3477bc1[iRound];
        }
        int iMax = c1561Mc1I.a;
        int iMax2 = c1561Mc1I.b;
        for (int i2 = 0; i2 < this.J.length; i2++) {
            iMax = Math.max(2, iMax / 2);
            iMax2 = Math.max(2, iMax2 / 2);
            this.J[i2] = C3477bc1.g(iMax, iMax2, 9729, 10497, false);
            C3477bc1[] c3477bc1Arr2 = this.J;
            C3477bc1 c3477bc12 = c3477bc1Arr2[i2];
            if (c3477bc12 != null) {
                c3477bc1Arr2[i2] = c3477bc12.f();
            }
        }
        return super.v(th0);
    }

    @Override // com.daaw.AbstractC8699uF
    public void w(TH0 th0, int i) {
        super.w(th0, i);
        this.U.r(th0, i);
    }

    @Override // com.daaw.AbstractC8699uF
    public void x(TH0 th0) {
        super.x(th0);
        C9264wF c9264wF = this.U;
        if (c9264wF != null) {
            c9264wF.s(th0);
        }
        int i = 0;
        while (true) {
            C3477bc1[] c3477bc1Arr = this.J;
            if (i >= c3477bc1Arr.length) {
                return;
            }
            C3477bc1 c3477bc1 = c3477bc1Arr[i];
            if (c3477bc1 != null) {
                c3477bc1.a();
            }
            this.J[i] = null;
            i++;
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public void y(InterfaceC9336wX interfaceC9336wX, AbstractC7070oQ abstractC7070oQ, MW mw) {
        super.y(interfaceC9336wX, abstractC7070oQ, mw);
        mw.a(this.Q);
        this.U.t(interfaceC9336wX, abstractC7070oQ, mw);
    }

    @Override // com.daaw.AbstractC8699uF
    public void z(C2591Vu c2591Vu, InterfaceC4577fX interfaceC4577fX) {
        super.z(c2591Vu, interfaceC4577fX);
        super.A(c2591Vu);
        c2591Vu.s0(j(JD0.z6));
        c2591Vu.G("blendModeContent", AbstractC2427Uf.b(this.P), "1_appearance", AbstractC2427Uf.c);
        c2591Vu.V("color", this.K, "1_appearance");
        c2591Vu.Y("sourceCompositionIndex", this.Q, "1_appearance", 1, 5);
        interfaceC4577fX.a(this.U.j());
        c2591Vu.h0("MaskImage", this.U.j(), "1_appearance", C9264wF.t);
        c2591Vu.Q("blurRadius", this.H, "2_blur", 0.0f, 3.0f);
        c2591Vu.Q("blurMultiplier", this.I, "2_blur", 1.0f, 6.0f);
        c2591Vu.N("showUnblurredContent", d0(), "1_appearance");
        c2591Vu.N("showUnblurredContentUnder", e0(), "1_appearance");
        c2591Vu.n0("1layerScale", this.L[0], "2_blur", 0.0f, 10.0f);
        c2591Vu.n0("2layerScale", this.L[1], "2_blur", 0.0f, 10.0f);
        c2591Vu.n0("3layerScale", this.L[2], "2_blur", 0.0f, 10.0f);
        c2591Vu.V("1layerColor", this.M[0], "2_blur");
        c2591Vu.V("2layerColor", this.M[1], "2_blur");
        c2591Vu.V("3layerColor", this.M[2], "2_blur");
    }
}
