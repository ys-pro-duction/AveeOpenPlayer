package com.daaw;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: renamed from: com.daaw.uF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8699uF {
    public static String C = "10";
    public static final String[] D = {"Na", "Start", "Center", "End"};
    public static AX E = new SO0();
    public static C3700cP0 F = (C3700cP0) new C3700cP0().u(-1, -1, -1);
    public int a;
    public float b;
    public float c;
    public int e;
    public AbstractC8985vF g;
    public boolean u;
    public String d = "Nothing";
    public String f = "";
    public boolean h = false;
    public int i = 0;
    public int j = 0;
    public boolean k = true;
    public C1477Lh0 l = C1477Lh0.a();
    public float m = 0.0f;
    public C1477Lh0 n = C1477Lh0.a();
    public int o = 0;
    public int p = 0;
    public float q = 0.5f;
    public float r = 0.5f;
    public float s = 0.5f;
    public float t = 0.5f;
    public boolean v = false;
    public boolean w = false;
    public float x = 0.5f;
    public float y = 0.5f;
    public C1477Lh0 z = C1477Lh0.a();
    public boolean A = false;
    public float B = Float.MAX_VALUE;

    /* JADX INFO: renamed from: com.daaw.uF$a */
    public static class a {
        public static int a = 1;

        public static int a() {
            int i = a;
            a = i + 1;
            return i;
        }
    }

    public AbstractC8699uF(int i, float f, float f2) {
        this.e = -1;
        this.e = a.a();
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    public static void H(PointF pointF, float f, float f2, PointF pointF2, float f3) {
        double d = f3;
        pointF.x = (float) ((((double) f) + (((double) (pointF2.x - f)) * Math.cos(d))) - (((double) (pointF2.y - f2)) * Math.sin(d)));
        pointF.y = (float) (((double) f2) + (((double) (pointF2.x - f)) * Math.sin(d)) + (((double) (pointF2.y - f2)) * Math.cos(d)));
    }

    public static void I(PointF pointF, PointF pointF2, float f) {
        double d = f;
        pointF.x = (float) ((((double) pointF2.x) * Math.cos(d)) - (((double) pointF2.y) * Math.sin(d)));
        pointF.y = (float) ((((double) pointF2.x) * Math.sin(d)) + (((double) pointF2.y) * Math.cos(d)));
    }

    public static RectF r(C6036kk0 c6036kk0, C1469Lf0 c1469Lf0, C1469Lf0 c1469Lf02) {
        C1458Lc1 c1458Lc1 = new C1458Lc1(0.0f, 0.0f);
        c1469Lf0.j(c6036kk0, c1458Lc1);
        float fK = c6036kk0.k(0.5f, true) - c6036kk0.k(c1458Lc1.a, true);
        float fL = c6036kk0.l(0.5f, true) - c6036kk0.l(c1458Lc1.b, true);
        c1469Lf02.j(c6036kk0, c1458Lc1);
        float f = c6036kk0.f(c1458Lc1.a, false);
        float fG = c6036kk0.g(c1458Lc1.b, false);
        float fC = fK - c6036kk0.c(0.5f, false, f, fG);
        float fD = fL - c6036kk0.d(0.5f, false, f, fG);
        return new RectF(fC, fD, f + fC, fG + fD);
    }

    public void A(C2591Vu c2591Vu) {
        c2591Vu.Q("rotation", this.m * 360.0f, "0_general", 0.0f, 300.0f);
        this.l.o(c2591Vu.G("measureRot", "", "0_general", new String[0]));
    }

    public void B(TH0 th0, AbstractC7070oQ abstractC7070oQ) {
        C(th0);
        th0.i(abstractC7070oQ);
        th0.e(this.i);
    }

    public void C(TH0 th0) {
        if (!this.h) {
            v(th0);
            th0.n();
        }
        this.h = true;
        if (this.j == 0) {
            th0.l();
        }
        w(th0, this.j);
        this.j++;
    }

    public void D(TH0 th0) {
        float f = this.B / 1.0f;
        if (f > 1.0f) {
            return;
        }
        RectF rectFN = n(th0.u.b);
        this.B += th0.d();
        float f2 = 1.0f - f;
        F.t(VT.e(f2, f2, f2, f2));
        OO0.Z(th0, 0, rectFN, 8, 2.5f, F, E);
    }

    public void E(TH0 th0, AbstractC7070oQ abstractC7070oQ) {
        C(th0);
    }

    public void F(TH0 th0) {
        C(th0);
    }

    public void G(InterfaceC9336wX interfaceC9336wX, AbstractC7070oQ abstractC7070oQ) {
        interfaceC9336wX.i(abstractC7070oQ);
        interfaceC9336wX.e(this.i);
    }

    public void J(int i) {
        this.i = i;
    }

    public boolean K(C2591Vu c2591Vu, int i) {
        if (c2591Vu == null) {
            return false;
        }
        t(c2591Vu);
        return true;
    }

    public void L(float f, float f2) {
        this.s = f;
        this.t = f2;
    }

    public void M(C1458Lc1 c1458Lc1) {
        this.s = c1458Lc1.a;
        this.t = c1458Lc1.b;
    }

    public void N(float f, float f2) {
        this.q = f;
        this.r = f2;
    }

    public void O(C1458Lc1 c1458Lc1) {
        this.q = c1458Lc1.a;
        this.r = c1458Lc1.b;
    }

    public void P(boolean z, boolean z2) {
        this.u = z;
        this.v = z2;
    }

    public void Q(float f) {
        this.m = f;
    }

    public void R(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public void S(C1458Lc1 c1458Lc1) {
        this.x = c1458Lc1.a;
        this.y = c1458Lc1.b;
    }

    public void T(boolean z) {
        this.A = z;
    }

    public void U(int i) {
        X();
    }

    public void V(boolean z) {
        this.k = z;
    }

    public boolean W() {
        return this.k;
    }

    public void X() {
        this.B = 0.0f;
    }

    public void b(TH0 th0, C3755cc1 c3755cc1, float f, float f2, float f3) {
        c(th0, c3755cc1, f, f2, f3, -10.0f);
    }

    public void c(TH0 th0, C3755cc1 c3755cc1, float f, float f2, float f3, float f4) {
        C3755cc1 c3755cc12 = th0.A;
        c3755cc12.d();
        c3755cc12.c(f3 * 360.0f);
        th0.C.d();
        th0.C.e(-f, -f2, f4);
        th0.B.b(c3755cc12, th0.C);
        c3755cc12.d();
        c3755cc12.e(f, f2, 0.0f);
        th0.C.b(c3755cc12, th0.B);
        th0.r(c3755cc1, th0.C);
    }

    public void d() {
        k(null);
    }

    public AbstractC8699uF e(int i) {
        if (this.e == i) {
            return this;
        }
        return null;
    }

    public int f() {
        return this.i;
    }

    public boolean g(C2591Vu c2591Vu, int i, InterfaceC4577fX interfaceC4577fX) {
        if (c2591Vu == null) {
            return false;
        }
        c2591Vu.F(h());
        c2591Vu.u0(i());
        z(c2591Vu, interfaceC4577fX);
        return true;
    }

    public abstract String h();

    public String i() {
        return C;
    }

    public String j(int i) {
        Context contextI = com.daaw.avee.a.i();
        return contextI == null ? "" : contextI.getString(i);
    }

    public void k(TH0 th0) {
        x(th0);
        m();
    }

    public void l() {
        this.h = false;
        this.j = 0;
    }

    public void m() {
        this.h = false;
        this.j = 0;
    }

    public RectF n(C6036kk0 c6036kk0) {
        C1458Lc1 c1458Lc1L = this.n.l(c6036kk0);
        float fI = c6036kk0.i(this.o) + c6036kk0.k(this.q, this.o != 0 || this.u) + c6036kk0.k(c1458Lc1L.a, true);
        float fJ = c6036kk0.j(this.p) + c6036kk0.l(this.r, this.p != 0 || this.v) + c6036kk0.l(c1458Lc1L.b, true);
        C1458Lc1 c1458Lc1L2 = this.z.l(c6036kk0);
        float f = c6036kk0.f(this.x + c1458Lc1L2.a, this.A);
        float fG = c6036kk0.g(this.y + c1458Lc1L2.b, this.A);
        float fC = fI - c6036kk0.c(this.s, false, f, fG);
        float fD = fJ - c6036kk0.d(this.t, false, f, fG);
        return new RectF(fC, fD, f + fC, fG + fD);
    }

    public RectF o(C6036kk0 c6036kk0, C1561Mc1 c1561Mc1) {
        C1458Lc1 c1458Lc1L = this.n.l(c6036kk0);
        float fI = c6036kk0.i(this.o) + c6036kk0.k(this.q, this.o != 0 || this.u) + c6036kk0.k(c1458Lc1L.a, true);
        float fJ = c6036kk0.j(this.p) + c6036kk0.l(this.r, this.p != 0 || this.v) + c6036kk0.l(c1458Lc1L.b, true);
        this.z.l(c6036kk0);
        float f = c1561Mc1.a;
        float f2 = c1561Mc1.b;
        float fC = fI - c6036kk0.c(this.s, this.w, f, f2);
        float fD = fJ - c6036kk0.d(this.t, this.w, f, f2);
        return new RectF(fC, fD, f + fC, f2 + fD);
    }

    public RectF p(C6036kk0 c6036kk0) {
        C1458Lc1 c1458Lc1L = this.n.l(c6036kk0);
        float fI = c6036kk0.i(this.o) + c6036kk0.k(this.q, this.o != 0 || this.u) + c6036kk0.k(c1458Lc1L.a, true);
        float fJ = c6036kk0.j(this.p) + c6036kk0.l(this.r, this.p != 0 || this.v) + c6036kk0.l(c1458Lc1L.b, true);
        C1458Lc1 c1458Lc1L2 = this.z.l(c6036kk0);
        float f = c6036kk0.f(this.x + c1458Lc1L2.a, this.A);
        float fG = c6036kk0.g(this.y + c1458Lc1L2.b, this.A);
        float fC = fI - c6036kk0.c(0.5f, false, f, fG);
        float fD = fJ - c6036kk0.d(0.5f, false, f, fG);
        return new RectF(fC, fD, f + fC, fG + fD);
    }

    public RectF q(C6036kk0 c6036kk0) {
        return n(c6036kk0);
    }

    public float s(C6036kk0 c6036kk0) {
        return (this.m + this.l.i(c6036kk0)) % 1.0f;
    }

    public void t(C2591Vu c2591Vu) {
        this.f = c2591Vu.B();
        V(c2591Vu.o("visible", true));
        J(AbstractC2427Uf.a(c2591Vu.h("blendMode").D(AbstractC2427Uf.b(this.a)), this.a));
        O(c2591Vu.A("position", new C1458Lc1(0.5f, 0.5f)));
        String[] strArr = AbstractC4734g4.a;
        this.o = c2591Vu.w("anchorX", strArr, 0);
        this.p = c2591Vu.w("anchorY", strArr, 0);
        this.n.n(c2591Vu.h("MeasurePos"), this.d, 0.5f, 0.5f);
        M(c2591Vu.A("alignmentPosition", new C1458Lc1(0.5f, 0.5f)));
        T(c2591Vu.o("scaleIsUniform", false));
        S(c2591Vu.A("scale", new C1458Lc1(this.b, this.c)));
        this.z.n(c2591Vu.h("measureScale"), "Nothing", 0.5f, 0.5f);
    }

    public void u(C2591Vu c2591Vu) {
        Q(c2591Vu.p("rotation", 0.0f) / 360.0f);
        this.l.n(c2591Vu.h("measureRot"), "Nothing", 0.5f, 0.5f);
    }

    public boolean v(TH0 th0) {
        return true;
    }

    public void z(C2591Vu c2591Vu, InterfaceC4577fX interfaceC4577fX) {
        c2591Vu.X("_id", this.e, "");
        c2591Vu.t0(this.f);
        c2591Vu.N("visible", this.k, "0_general");
        c2591Vu.G("blendMode", AbstractC2427Uf.b(this.i), "0_general", AbstractC2427Uf.c);
        c2591Vu.n0("position", new C1458Lc1(this.q, this.r), "0_general", -1.0f, 1.0f);
        String strA = AbstractC4734g4.a(this.o, 0);
        String[] strArr = AbstractC4734g4.a;
        c2591Vu.p0("anchorX", strA, "0_general", strArr);
        c2591Vu.p0("anchorY", AbstractC4734g4.a(this.p, 0), "0_general", strArr);
        this.n.p(c2591Vu.G("MeasurePos", "", "0_general", new String[0]));
        c2591Vu.n0("alignmentPosition", new C1458Lc1(this.s, this.t), "0_general", 0.0f, 1.0f);
        c2591Vu.N("scaleIsUniform", this.A, "0_general");
        c2591Vu.n0("scale", new C1458Lc1(this.x, this.y), "0_general", 0.0f, 2.0f);
        this.z.q(c2591Vu.G("measureScale", "", "0_general", new String[0]));
    }

    public void x(TH0 th0) {
    }

    public void w(TH0 th0, int i) {
    }

    public void y(InterfaceC9336wX interfaceC9336wX, AbstractC7070oQ abstractC7070oQ, MW mw) {
    }
}
