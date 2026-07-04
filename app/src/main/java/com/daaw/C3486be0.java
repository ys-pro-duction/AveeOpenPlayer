package com.daaw;

import android.graphics.RectF;
import android.net.Uri;
import com.daaw.C9264wF;

/* JADX INFO: renamed from: com.daaw.be0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3486be0 extends C3044a21 {
    public static C0850Fg1 Y = new C0850Fg1();
    public C9264wF R;
    public G3 Q = new G3(Uri.EMPTY, "internalres:anim128_g_m10_15", "");
    public int S = 0;
    public float T = 0.0f;
    public float[] U = new float[4];
    public float V = 0.0f;
    public final float W = 2.4f;
    public final int X = 26;

    /* JADX INFO: renamed from: com.daaw.be0$a */
    public class a implements C9264wF.b {
        public a() {
        }

        @Override // com.daaw.C9264wF.b
        public void a() {
            C3486be0.this.m();
        }
    }

    /* JADX INFO: renamed from: com.daaw.be0$b */
    public class b implements FQ {
        public b() {
        }

        @Override // com.daaw.FQ
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public G3 a(InterfaceC9336wX interfaceC9336wX) {
            return C3486be0.this.Q;
        }
    }

    public C3486be0() {
        C9264wF c9264wF = new C9264wF(new a(), new b(), null, null);
        this.R = c9264wF;
        c9264wF.z(true);
        f0(-1869574000);
        J(4);
        h0(26);
        g0("internal_3");
        i0("{MarkedArtistAndTitle}");
        N(0.0f, 1.0f);
        L(0.0f, 1.2f);
        P(true, false);
    }

    @Override // com.daaw.C3044a21, com.daaw.AbstractC8699uF
    public void B(TH0 th0, AbstractC7070oQ abstractC7070oQ) {
        super.B(th0, abstractC7070oQ);
        this.R.u(th0, abstractC7070oQ);
    }

    @Override // com.daaw.AbstractC8699uF
    public void M(C1458Lc1 c1458Lc1) {
        super.M(c1458Lc1);
    }

    @Override // com.daaw.AbstractC8699uF
    public void O(C1458Lc1 c1458Lc1) {
        super.O(c1458Lc1);
    }

    @Override // com.daaw.AbstractC8699uF
    public boolean W() {
        return super.W();
    }

    @Override // com.daaw.C3044a21
    public C1458Lc1 Z(RectF rectF) {
        float fA = AbstractC3938dF.a(0.0f, this.T, 0.0f, 1.0f, 1.0f);
        float fHeight = rectF.height() * 0.0f;
        return new C1458Lc1((-fHeight) + (((rectF.height() * 1.05f * 2.4f) + (rectF.height() * 0.15f * 2.4f) + fHeight) * ((fA * 0.5f) + 0.5f)), rectF.height() * (-0.16f) * 2.4f);
    }

    @Override // com.daaw.C3044a21
    public void e0(TH0 th0, RectF rectF) {
        super.e0(th0, rectF);
        if (th0.J() == 1) {
            l0();
        } else if (th0.J() == 2) {
            k0();
        }
        if (this.V > 3.5f) {
            k0();
        }
        int i = this.S;
        if (i == 0) {
            n0(0);
            this.T = 0.0f;
            this.V = 0.0f;
            return;
        }
        if (i == 1) {
            float fD = this.T + (th0.d() * 1.25f);
            this.T = fD;
            if (fD >= 0.999f) {
                this.T = 0.999f;
                this.S = 2;
            }
            Math.max(0.0f, (this.T - 0.5f) * 2.0f);
            float fA = AbstractC3938dF.a(0.0f, this.T, 0.0f, 1.0f, 1.0f);
            float[] fArr = this.U;
            n0(VT.f(new float[]{fArr[0] * fA, fArr[1] * fA, fArr[2] * fA, fArr[3] * fA}));
        } else if (i == 2) {
            this.V += th0.d();
            float[] fArr2 = this.U;
            n0(VT.f(new float[]{fArr2[0], fArr2[1], fArr2[2], fArr2[3]}));
            this.T = 0.999f;
        } else if (i == 3) {
            float fD2 = this.T - (th0.d() * 1.25f);
            this.T = fD2;
            if (fD2 <= 0.0f) {
                this.T = 0.0f;
                this.S = 0;
            }
            float fA2 = AbstractC3938dF.a(0.0f, Math.max(0.0f, (this.T - 0.25f) * 1.3333334f), 0.0f, 1.0f, 1.0f);
            float[] fArr3 = this.U;
            n0(VT.f(new float[]{fArr3[0] * fA2, fArr3[1] * fA2, fArr3[2] * fA2, fArr3[3] * fA2}));
        }
        IW iwM = this.R.m(th0);
        if (iwM == null) {
            return;
        }
        IW iwC = iwM.c(this.T);
        float fHeight = rectF.height() * 2.4f;
        th0.u.p().o(th0, rectF.left + (rectF.height() * 0.15f * 2.4f), rectF.bottom - fHeight, 0.0f, fHeight, fHeight, -1, C1458Lc1.s(), C1458Lc1.q(), new RH0(f(), iwC, (C4312ec1) null, (InterfaceC6129l2) null), false);
    }

    @Override // com.daaw.C3044a21
    public void f0(int i) {
        super.f0(i);
        VT.n(this.U, i);
    }

    @Override // com.daaw.C3044a21, com.daaw.AbstractC8699uF
    public String h() {
        return "AppLogo";
    }

    @Override // com.daaw.C3044a21
    public void h0(int i) {
        super.h0(i);
    }

    public void k0() {
        if (this.S == 0) {
            return;
        }
        this.S = 3;
    }

    @Override // com.daaw.AbstractC8699uF
    public void l() {
        super.l();
        C9264wF c9264wF = this.R;
        if (c9264wF != null) {
            c9264wF.p();
        }
    }

    public void l0() {
        if (this.S == 2) {
            return;
        }
        this.S = 1;
    }

    public void n0(int i) {
        super.f0(i);
    }

    @Override // com.daaw.C3044a21, com.daaw.AbstractC8699uF
    public void t(C2591Vu c2591Vu) {
        super.c0(c2591Vu);
        V(c2591Vu.o("visible", true));
        f0(c2591Vu.s("color", -1869574000));
        P(true, false);
        if (((Boolean) Y.a(this, Boolean.FALSE)).booleanValue()) {
            return;
        }
        a0(0.56f, 0.56f);
        b0(26);
        N(0.0f, 1.0f);
        L(0.0f, 1.2f);
    }

    @Override // com.daaw.C3044a21, com.daaw.AbstractC8699uF
    public boolean v(TH0 th0) {
        super.v(th0);
        this.R.q(th0, q(th0.u.b), 0);
        return false;
    }

    @Override // com.daaw.AbstractC8699uF
    public void w(TH0 th0, int i) {
        this.R.r(th0, i);
    }

    @Override // com.daaw.C3044a21, com.daaw.AbstractC8699uF
    public void x(TH0 th0) {
        super.x(th0);
        C9264wF c9264wF = this.R;
        if (c9264wF != null) {
            c9264wF.s(th0);
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public void y(InterfaceC9336wX interfaceC9336wX, AbstractC7070oQ abstractC7070oQ, MW mw) {
        super.y(interfaceC9336wX, abstractC7070oQ, mw);
        this.R.t(interfaceC9336wX, abstractC7070oQ, mw);
    }

    @Override // com.daaw.C3044a21, com.daaw.AbstractC8699uF
    public void z(C2591Vu c2591Vu, InterfaceC4577fX interfaceC4577fX) {
        super.d0(c2591Vu);
        c2591Vu.s0(j(JD0.x6));
        c2591Vu.N("visible", this.k, "0_general");
        c2591Vu.v0("visible", "pb", "AppLogo");
        c2591Vu.V("color", VT.f(this.U), "0_general");
        if (((Boolean) Y.a(this, Boolean.FALSE)).booleanValue()) {
            return;
        }
        c2591Vu.q0("position");
    }
}
