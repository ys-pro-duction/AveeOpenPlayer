package com.daaw;

import android.graphics.RectF;
import com.daaw.C9264wF;

/* JADX INFO: renamed from: com.daaw.wk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9399wk0 extends AbstractC8699uF {
    public static final String[] M = {"composition:0"};
    public static final String[] N = {"Horizontal", "Vertical", "HorizontalAndVertical"};
    public int G;
    public C9264wF H;
    public int I;
    public boolean J;
    public final C3755cc1 K;
    public InterfaceC6129l2 L;

    /* JADX INFO: renamed from: com.daaw.wk0$a */
    public class a implements C9264wF.b {
        public a() {
        }

        @Override // com.daaw.C9264wF.b
        public void a() {
            C9399wk0.this.m();
        }
    }

    /* JADX INFO: renamed from: com.daaw.wk0$b */
    public class b implements InterfaceC6129l2 {
        public b() {
        }

        @Override // com.daaw.InterfaceC6129l2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(TH0 th0, C4880gc1 c4880gc1, RH0 rh0) {
            c4880gc1.E("u_projView", false, C9399wk0.this.K.a());
        }
    }

    public C9399wk0() {
        super(4, 1.0f, 1.0f);
        this.G = -1;
        this.I = 0;
        this.J = false;
        this.K = new C3755cc1();
        this.L = new b();
        J(4);
        R(1.0f, 1.0f);
        this.H = new C9264wF(new a(), null, null, null);
        f0("composition:1");
    }

    @Override // com.daaw.AbstractC8699uF
    public void B(TH0 th0, AbstractC7070oQ abstractC7070oQ) {
        this.H.u(th0, abstractC7070oQ);
        super.B(th0, abstractC7070oQ);
        RectF rectFN = n(th0.b().a());
        b(th0, this.K, rectFN.centerX(), rectFN.centerY(), s(th0.b().a()));
        C1458Lc1 c1458Lc1 = new C1458Lc1(0.0f, 0.0f);
        C1458Lc1 c1458Lc12 = new C1458Lc1(1.0f, 0.0f);
        C4312ec1 c4312ec1U = th0.u.u();
        RH0 rh0 = new RH0(f(), this.H.m(th0), c4312ec1U, this.L);
        int i = this.I;
        if (i == 0) {
            float fCenterX = rectFN.centerX();
            if (this.J) {
                c1458Lc1.a = 0.0f;
                c1458Lc1.b = 1.0f;
                c1458Lc12.a = 0.5f;
                c1458Lc12.b = 0.0f;
            } else {
                c1458Lc1.a = 1.0f;
                c1458Lc1.b = 1.0f;
                c1458Lc12.a = 0.5f;
                c1458Lc12.b = 0.0f;
            }
            AbstractC5460ih abstractC5460ihJ = th0.j();
            float f = rectFN.left;
            float f2 = rectFN.top;
            float f3 = rectFN.bottom;
            abstractC5460ihJ.l(th0, f, f2, fCenterX, f2, fCenterX, f3, f, f3, 0.0f, this.G, c1458Lc1, c1458Lc12, rh0);
            if (this.J) {
                c1458Lc1.a = 0.5f;
                c1458Lc1.b = 1.0f;
                c1458Lc12.a = 0.0f;
                c1458Lc12.b = 0.0f;
            } else {
                c1458Lc1.a = 0.5f;
                c1458Lc1.b = 1.0f;
                c1458Lc12.a = 1.0f;
                c1458Lc12.b = 0.0f;
            }
            AbstractC5460ih abstractC5460ihJ2 = th0.j();
            float f4 = rectFN.top;
            float f5 = rectFN.right;
            float f6 = rectFN.bottom;
            abstractC5460ihJ2.l(th0, fCenterX, f4, f5, f4, f5, f6, fCenterX, f6, 0.0f, this.G, c1458Lc1, c1458Lc12, rh0);
            return;
        }
        if (i == 1) {
            if (this.J) {
                c1458Lc1.a = 0.0f;
                c1458Lc1.b = 0.0f;
                c1458Lc12.a = 1.0f;
                c1458Lc12.b = 0.5f;
            } else {
                c1458Lc1.a = 0.0f;
                c1458Lc1.b = 1.0f;
                c1458Lc12.a = 1.0f;
                c1458Lc12.b = 0.5f;
            }
            AbstractC5460ih abstractC5460ihJ3 = th0.j();
            float f7 = rectFN.left;
            float f8 = rectFN.top;
            float f9 = rectFN.right;
            abstractC5460ihJ3.l(th0, f7, f8, f9, f8, f9, rectFN.centerY(), rectFN.left, rectFN.centerY(), 0.0f, this.G, c1458Lc1, c1458Lc12, rh0);
            if (this.J) {
                c1458Lc1.a = 0.0f;
                c1458Lc1.b = 0.5f;
                c1458Lc12.a = 1.0f;
                c1458Lc12.b = 0.0f;
            } else {
                c1458Lc1.a = 0.0f;
                c1458Lc1.b = 0.5f;
                c1458Lc12.a = 1.0f;
                c1458Lc12.b = 1.0f;
            }
            AbstractC5460ih abstractC5460ihJ4 = th0.j();
            float f10 = rectFN.left;
            float fCenterY = rectFN.centerY();
            float f11 = rectFN.right;
            float fCenterY2 = rectFN.centerY();
            float f12 = rectFN.right;
            float f13 = rectFN.bottom;
            abstractC5460ihJ4.l(th0, f10, fCenterY, f11, fCenterY2, f12, f13, rectFN.left, f13, 0.0f, this.G, c1458Lc1, c1458Lc12, rh0);
            return;
        }
        if (i == 2) {
            if (this.J) {
                c1458Lc1.a = 0.0f;
                c1458Lc1.b = 1.0f;
                c1458Lc12.a = 0.5f;
                c1458Lc12.b = 0.5f;
            } else {
                c1458Lc1.a = 1.0f;
                c1458Lc1.b = 1.0f;
                c1458Lc12.a = 0.5f;
                c1458Lc12.b = 0.5f;
            }
            th0.j().l(th0, rectFN.left, rectFN.top, rectFN.centerX(), rectFN.top, rectFN.centerX(), rectFN.centerY(), rectFN.left, rectFN.centerY(), 0.0f, this.G, c1458Lc1, c1458Lc12, rh0);
            if (this.J) {
                c1458Lc1.a = 0.5f;
                c1458Lc1.b = 1.0f;
                c1458Lc12.a = 0.0f;
                c1458Lc12.b = 0.5f;
            } else {
                c1458Lc1.a = 0.5f;
                c1458Lc1.b = 1.0f;
                c1458Lc12.a = 1.0f;
                c1458Lc12.b = 0.5f;
            }
            AbstractC5460ih abstractC5460ihJ5 = th0.j();
            float fCenterX2 = rectFN.centerX();
            float f14 = rectFN.top;
            float f15 = rectFN.right;
            abstractC5460ihJ5.l(th0, fCenterX2, f14, f15, f14, f15, rectFN.centerY(), rectFN.centerX(), rectFN.centerY(), 0.0f, this.G, c1458Lc1, c1458Lc12, rh0);
            if (this.J) {
                c1458Lc1.a = 0.0f;
                c1458Lc1.b = 0.5f;
                c1458Lc12.a = 0.5f;
                c1458Lc12.b = 1.0f;
            } else {
                c1458Lc1.a = 1.0f;
                c1458Lc1.b = 0.5f;
                c1458Lc12.a = 0.5f;
                c1458Lc12.b = 1.0f;
            }
            AbstractC5460ih abstractC5460ihJ6 = th0.j();
            float f16 = rectFN.left;
            float fCenterY3 = rectFN.centerY();
            float fCenterX3 = rectFN.centerX();
            float fCenterY4 = rectFN.centerY();
            float fCenterX4 = rectFN.centerX();
            float f17 = rectFN.bottom;
            abstractC5460ihJ6.l(th0, f16, fCenterY3, fCenterX3, fCenterY4, fCenterX4, f17, rectFN.left, f17, 0.0f, this.G, c1458Lc1, c1458Lc12, rh0);
            if (this.J) {
                c1458Lc1.a = 0.5f;
                c1458Lc1.b = 0.5f;
                c1458Lc12.a = 0.0f;
                c1458Lc12.b = 1.0f;
            } else {
                c1458Lc1.a = 0.5f;
                c1458Lc1.b = 0.5f;
                c1458Lc12.a = 1.0f;
                c1458Lc12.b = 1.0f;
            }
            th0.j().l(th0, rectFN.centerX(), rectFN.centerY(), rectFN.right, rectFN.centerY(), rectFN.right, rectFN.bottom, rectFN.centerX(), rectFN.bottom, 0.0f, this.G, c1458Lc1, c1458Lc12, rh0);
        }
    }

    public boolean Z() {
        return this.J;
    }

    public int a0() {
        return this.I;
    }

    public String b0() {
        return this.H.j();
    }

    public void c0(int i) {
        this.G = i;
    }

    public void d0(boolean z) {
        this.J = z;
    }

    public void e0(int i) {
        this.I = i;
    }

    public void f0(String str) {
        this.H.C(str);
    }

    @Override // com.daaw.AbstractC8699uF
    public String h() {
        return "MirrorEffect";
    }

    @Override // com.daaw.AbstractC8699uF
    public void l() {
        super.l();
        C9264wF c9264wF = this.H;
        if (c9264wF != null) {
            c9264wF.p();
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public void t(C2591Vu c2591Vu) {
        super.t(c2591Vu);
        super.u(c2591Vu);
        f0(c2591Vu.x("TargetImage", "composition:1"));
        String[] strArr = N;
        e0(AbstractC0405Bb1.e(strArr, c2591Vu.v("mirrorMode", strArr[0])));
        d0(c2591Vu.o("flipMirror", false));
        c0(c2591Vu.s("color", -1));
    }

    @Override // com.daaw.AbstractC8699uF
    public boolean v(TH0 th0) {
        this.H.q(th0, q(th0.u.b), 0);
        return super.v(th0);
    }

    @Override // com.daaw.AbstractC8699uF
    public void w(TH0 th0, int i) {
        this.H.r(th0, i);
        super.w(th0, i);
    }

    @Override // com.daaw.AbstractC8699uF
    public void x(TH0 th0) {
        super.x(th0);
        C9264wF c9264wF = this.H;
        if (c9264wF != null) {
            c9264wF.s(th0);
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public void y(InterfaceC9336wX interfaceC9336wX, AbstractC7070oQ abstractC7070oQ, MW mw) {
        super.y(interfaceC9336wX, abstractC7070oQ, mw);
        this.H.t(interfaceC9336wX, abstractC7070oQ, mw);
    }

    @Override // com.daaw.AbstractC8699uF
    public void z(C2591Vu c2591Vu, InterfaceC4577fX interfaceC4577fX) {
        super.z(c2591Vu, interfaceC4577fX);
        super.A(c2591Vu);
        c2591Vu.s0(j(JD0.C6));
        interfaceC4577fX.a(b0());
        c2591Vu.h0("TargetImage", b0(), "1_appearance", M);
        String[] strArr = N;
        c2591Vu.p0("mirrorMode", AbstractC0405Bb1.a(strArr, a0(), strArr[0]), "1_appearance", strArr);
        c2591Vu.N("flipMirror", Z(), "1_appearance");
        c2591Vu.V("color", this.G, "1_appearance");
    }
}
