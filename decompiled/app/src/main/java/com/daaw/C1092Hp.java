package com.daaw;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Hp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1092Hp extends AbstractC8985vF implements MW {
    public static C0850Fg1 U = new C0850Fg1();
    public boolean H;
    public C3477bc1 I;
    public final boolean J;
    public boolean K;
    public List L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public int R;
    public Boolean S;
    public C10141zP T;

    public C1092Hp(boolean z) {
        this.H = false;
        this.L = new ArrayList();
        this.M = 0.0f;
        this.N = 0.0f;
        this.O = 0.0f;
        this.P = 0.0f;
        this.Q = -553648128;
        this.R = 0;
        this.S = Boolean.FALSE;
        this.J = z;
        if (z) {
            this.O = 0.0f;
            this.P = 0.0f;
        }
    }

    public static int i0(String str) {
        String[] strArr = new String[2];
        AbstractC0405Bb1.B(str, 58, strArr);
        if ("composition".equals(strArr[0])) {
            return AbstractC0405Bb1.x(strArr[1], -1);
        }
        return -1;
    }

    public static String o0(int i) {
        return "composition:" + i;
    }

    @Override // com.daaw.AbstractC8699uF
    public void B(TH0 th0, AbstractC7070oQ abstractC7070oQ) {
        C10141zP c10141zP;
        v0(th0.u.a.e());
        C(th0);
        this.K = true;
        V41 v41I = th0.u.b().i();
        if (this.J) {
            super.B(th0, abstractC7070oQ);
            d0(th0, abstractC7070oQ);
            if (abstractC7070oQ == null && (c10141zP = this.T) != null) {
                c10141zP.B(th0, abstractC7070oQ);
            }
            q0(th0, v41I);
            return;
        }
        C3477bc1 c3477bc1 = this.I;
        if (c3477bc1 == null) {
            return;
        }
        th0.i(c3477bc1);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        w0(th0);
        d0(th0, this.I);
        q0(th0, v41I);
    }

    @Override // com.daaw.AbstractC8699uF
    public void F(TH0 th0) {
        if (this.J) {
            super.F(th0);
            e0(th0);
        } else {
            super.F(th0);
            e0(th0);
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public boolean K(C2591Vu c2591Vu, int i) {
        AbstractC8699uF c3486be0;
        super.K(c2591Vu, i);
        if (c2591Vu instanceof C2279Su) {
            f0((C2279Su) c2591Vu);
        }
        if (this.J && !((Boolean) U.a(this, Boolean.FALSE)).booleanValue()) {
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.G.size()) {
                    c3486be0 = null;
                    break;
                }
                c3486be0 = (AbstractC8699uF) this.G.get(i2);
                if (!(c3486be0 instanceof C3486be0)) {
                    i2++;
                } else if (i2 != this.G.size() - 1) {
                    c0(i2);
                } else {
                    z = true;
                }
            }
            if (!z) {
                if (c3486be0 == null) {
                    c3486be0 = new C3486be0();
                }
                Z(c3486be0);
            }
        }
        return true;
    }

    @Override // com.daaw.AbstractC8699uF
    public boolean W() {
        if (super.W()) {
            return !this.K;
        }
        return false;
    }

    @Override // com.daaw.AbstractC8985vF
    public AbstractC8699uF Y(int i, String str, String str2) {
        return MF.a(str, str2, null);
    }

    @Override // com.daaw.MW
    public void a(int i) {
        this.L.add(Integer.valueOf(i));
    }

    @Override // com.daaw.AbstractC8699uF
    public boolean g(C2591Vu c2591Vu, int i, InterfaceC4577fX interfaceC4577fX) {
        super.g(c2591Vu, i, interfaceC4577fX);
        if (!(c2591Vu instanceof C2279Su)) {
            return true;
        }
        b0((C2279Su) c2591Vu, interfaceC4577fX);
        return true;
    }

    public List g0() {
        return this.L;
    }

    @Override // com.daaw.AbstractC8699uF
    public String h() {
        return "Composition";
    }

    public C3477bc1 h0() {
        return this.I;
    }

    public final int j0() {
        return this.Q;
    }

    public final float k0() {
        return this.O;
    }

    public final float l0() {
        return this.P;
    }

    public boolean m0() {
        return this.S.booleanValue();
    }

    public boolean n0() {
        return this.J;
    }

    public void p0() {
        this.K = true;
    }

    public final void q0(TH0 th0, V41 v41) {
        if (v41 == null) {
            return;
        }
        int i = this.Q;
        if (v41.b > 14000.0f) {
            float f = this.O;
            float fMin = f > 0.01f ? Math.min(1.0f, (v41.a / 1000.0f) / f) : 1.0f;
            float f2 = this.P;
            float fMax = f2 > 0.01f ? Math.max(0.0f, Math.min(1.0f, ((v41.b - v41.a) / 1000.0f) / f2)) : 1.0f;
            if (fMin < 1.0f) {
                i = this.Q;
                this.N = 1.0f - fMin;
            } else if (fMax < 1.0f) {
                i = this.Q;
                this.N = 1.0f - fMax;
            } else {
                this.N = 0.0f;
            }
        }
        float f3 = (this.M * 0.9f) + (this.N * 0.100000024f);
        this.M = f3;
        if (f3 > 0.01f) {
            th0.x(VT.t(i, (int) (VT.h(i) * this.M)), new RH0(this.R, th0.u.c(), (C4312ec1) null, (InterfaceC6129l2) null));
        }
    }

    public final void r0(int i) {
        this.Q = i;
    }

    public final void s0(float f) {
        this.O = f;
    }

    @Override // com.daaw.AbstractC8985vF, com.daaw.AbstractC8699uF
    public void t(C2591Vu c2591Vu) {
        super.t(c2591Vu);
        this.R = AbstractC2427Uf.a(c2591Vu.x("introBlendMode", AbstractC2427Uf.b(0)), 0);
        s0(c2591Vu.p("introFadeDuration", 0.0f));
        t0(c2591Vu.p("outroFadeDuration", 0.0f));
        r0(c2591Vu.s("introFadeColor", -553648128));
        u0(c2591Vu.o("allowRecursion", false));
    }

    public final void t0(float f) {
        this.P = f;
    }

    public final void u0(boolean z) {
        this.S = Boolean.valueOf(z);
    }

    @Override // com.daaw.AbstractC8699uF
    public boolean v(TH0 th0) {
        if (!this.J) {
            this.H = th0.u.a.e();
            try {
                C1561Mc1 c1561Mc1I = th0.I();
                C3477bc1 c3477bc1 = this.I;
                if (c3477bc1 != null) {
                    c3477bc1.a();
                }
                C3477bc1 c3477bc1G = C3477bc1.g(c1561Mc1I.a, c1561Mc1I.b, 9729, 10497, this.H);
                this.I = c3477bc1G;
                if (c3477bc1G != null) {
                    this.I = c3477bc1G.f();
                }
            } catch (Exception e) {
                AbstractC0441Bk1.c(e.getMessage());
            }
        }
        return super.v(th0);
    }

    public void v0(boolean z) {
        if (this.H == z) {
            return;
        }
        this.H = z;
        l();
    }

    public final void w0(TH0 th0) {
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        th0.T(1);
    }

    @Override // com.daaw.AbstractC8699uF
    public void x(TH0 th0) {
        super.x(th0);
        C3477bc1 c3477bc1 = this.I;
        if (c3477bc1 != null) {
            c3477bc1.a();
        }
        this.I = null;
    }

    @Override // com.daaw.AbstractC8985vF, com.daaw.AbstractC8699uF
    public void y(InterfaceC9336wX interfaceC9336wX, AbstractC7070oQ abstractC7070oQ, MW mw) {
        this.L.clear();
        super.y(interfaceC9336wX, abstractC7070oQ, this);
        this.K = false;
    }

    @Override // com.daaw.AbstractC8985vF, com.daaw.AbstractC8699uF
    public void z(C2591Vu c2591Vu, InterfaceC4577fX interfaceC4577fX) {
        super.z(c2591Vu, interfaceC4577fX);
        c2591Vu.s0(j(JD0.A6));
        c2591Vu.p0("introBlendMode", AbstractC2427Uf.b(this.R), "2_introOutro", AbstractC2427Uf.c(AbstractC2427Uf.b));
        c2591Vu.Q("introFadeDuration", k0(), "2_introOutro", 0.0f, 10.0f);
        c2591Vu.Q("outroFadeDuration", l0(), "2_introOutro", 0.0f, 10.0f);
        c2591Vu.V("introFadeColor", j0(), "2_introOutro");
        c2591Vu.N("allowRecursion", this.S.booleanValue(), "misc");
    }

    public C1092Hp() {
        this.H = false;
        this.L = new ArrayList();
        this.M = 0.0f;
        this.N = 0.0f;
        this.O = 0.0f;
        this.P = 0.0f;
        this.Q = -553648128;
        this.R = 0;
        this.S = Boolean.FALSE;
        this.J = false;
    }
}
