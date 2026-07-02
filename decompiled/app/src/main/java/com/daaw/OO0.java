package com.daaw;

import android.graphics.PointF;
import android.graphics.RectF;
import com.daaw.BX;

/* JADX INFO: loaded from: classes.dex */
public class OO0 extends AbstractC8699uF {
    public BX G;
    public BX H;
    public AX I;
    public boolean J;
    public float K;
    public float L;
    public float M;
    public PointF N;
    public PointF O;
    public PointF P;
    public PointF Q;
    public EX R;
    public BX.a[] S;
    public int T;
    public int U;
    public int V;
    public int W;
    public C1469Lf0 X;

    public OO0() {
        super(2, 0.5f, 0.5f);
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = false;
        this.K = 3.0f;
        this.L = 0.009f;
        this.M = 1.0f;
        this.N = new PointF();
        this.O = new PointF();
        this.P = new PointF();
        this.Q = new PointF();
        this.R = null;
        this.S = new BX.a[0];
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 1;
        this.X = C1469Lf0.a(0.0f);
        h0(new QO0());
        i0(new ZO0());
        j0(2);
    }

    public static void Z(InterfaceC9336wX interfaceC9336wX, int i, RectF rectF, int i2, float f, BX bx, AX ax) {
        AX ax2 = ax;
        BX.a[] aVarArr = new BX.a[0];
        PointF pointF = new PointF();
        PointF pointF2 = new PointF();
        PointF pointF3 = new PointF();
        PointF pointF4 = new PointF();
        ax2.d(interfaceC9336wX);
        if (i2 != 0) {
            aVarArr = new BX.a[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                BX.a aVar = new BX.a();
                aVarArr[i3] = aVar;
                aVar.c = -1;
            }
        }
        BX.a[] aVarArr2 = aVarArr;
        if (i2 < 1) {
            return;
        }
        RectF rectF2 = rectF;
        float fK = ax2.k(rectF2, i2);
        int i4 = 0;
        while (i4 < i2) {
            int iE = ax2.e(false, i4, i2, rectF2, 0.0f, pointF3, pointF4);
            if (Float.isNaN(pointF4.x)) {
                pointF4.x = 1.0f;
                pointF4.y = 0.0f;
            }
            float f2 = (float) (((double) 0.0f) * 3.141592653589793d * 2.0d);
            AbstractC8699uF.H(pointF, rectF.centerX(), rectF.centerY(), pointF3, f2);
            AbstractC8699uF.I(pointF2, pointF4, f2);
            if (iE >= 0) {
                aVarArr2[iE].c = i4;
            }
            BX.a aVar2 = aVarArr2[i4];
            aVar2.a = iE;
            aVar2.d = f;
            aVar2.e = pointF.x;
            aVar2.f = pointF.y;
            aVar2.g = pointF2.x;
            aVar2.h = pointF2.y;
            i4++;
            rectF2 = rectF;
            ax2 = ax;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            BX.a aVar3 = aVarArr2[i5];
            aVar3.b = aVar3.c;
            aVar3.c = -1;
        }
        if (bx != null) {
            bx.m(interfaceC9336wX, aVarArr2, fK, 0.5f, i, 0.0f);
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public void B(TH0 th0, AbstractC7070oQ abstractC7070oQ) {
        super.B(th0, abstractC7070oQ);
        Y(th0);
    }

    @Override // com.daaw.AbstractC8699uF
    public void G(InterfaceC9336wX interfaceC9336wX, AbstractC7070oQ abstractC7070oQ) {
        super.G(interfaceC9336wX, abstractC7070oQ);
        Y(interfaceC9336wX);
    }

    public final void Y(InterfaceC9336wX interfaceC9336wX) {
        InterfaceC10173zX interfaceC10173zXB = interfaceC9336wX.b().a().b(this.W - 1);
        if (interfaceC10173zXB != null) {
            if ((this.G == null && this.H == null) || this.I == null) {
                return;
            }
            RectF rectFN = n(interfaceC9336wX.b().a());
            float fS = s(interfaceC9336wX.b().a());
            RectF rectFP = p(interfaceC9336wX.b().a());
            float fCenterX = rectFP.centerX();
            float fCenterY = rectFP.centerY();
            float fMax = Math.max(0.0f, Math.min(1.0f, this.X.i(interfaceC9336wX.b().a())));
            this.I.d(interfaceC9336wX);
            EX exF = interfaceC10173zXB.f(this.U, this.V, this.T, this.R);
            this.R = exF;
            int size = exF.size();
            if (size != this.S.length) {
                this.S = new BX.a[size];
                for (int i = 0; i < size; i++) {
                    this.S[i] = new BX.a();
                    this.S[i].c = -1;
                }
            }
            if (size < 1) {
                return;
            }
            float fE = interfaceC9336wX.b().a().e(this.L);
            float fE2 = interfaceC9336wX.b().a().e(this.M);
            float fE3 = interfaceC9336wX.b().a().e(this.K) * 0.002f;
            float fK = this.I.k(rectFN, size);
            float fSignum = Math.signum(fE3);
            float fAbs = Math.abs(fE3);
            if (this.G == null && this.H == null) {
                return;
            }
            for (int i2 = 0; i2 < size; i2++) {
                int iE = this.I.e(this.J, i2, size, rectFN, 0.0f, this.P, this.Q);
                if (Float.isNaN(this.Q.x)) {
                    PointF pointF = this.Q;
                    pointF.x = 1.0f;
                    pointF.y = 0.0f;
                }
                float f = (float) (((double) fS) * 3.141592653589793d * 2.0d);
                AbstractC8699uF.H(this.N, fCenterX, fCenterY, this.P, f);
                AbstractC8699uF.I(this.O, this.Q, f);
                if (iE >= 0) {
                    this.S[iE].c = i2;
                }
                BX.a aVar = this.S[i2];
                aVar.a = iE;
                aVar.d = (Math.min(this.R.get(i2) * fAbs, fE2) * fSignum) + fE;
                PointF pointF2 = this.N;
                aVar.e = pointF2.x;
                aVar.f = pointF2.y;
                PointF pointF3 = this.O;
                aVar.g = pointF3.x;
                aVar.h = pointF3.y;
            }
            for (int i3 = 0; i3 < size; i3++) {
                BX.a aVar2 = this.S[i3];
                aVar2.b = aVar2.c;
                aVar2.c = -1;
            }
            BX bx = this.G;
            if (bx != null) {
                bx.m(interfaceC9336wX, this.S, fK, 0.5f, f(), fMax);
            }
            BX bx2 = this.H;
            if (bx2 != null) {
                bx2.m(interfaceC9336wX, this.S, fK, 0.5f, f(), fMax);
            }
        }
    }

    public void a0(int i) {
        this.W = i;
    }

    public void b0(float f) {
        this.K = f;
    }

    public void c0(C1469Lf0 c1469Lf0) {
        this.X = c1469Lf0;
    }

    public void d0(float f) {
        this.M = f;
    }

    public void e0(float f) {
        this.L = f;
    }

    public void f0(int i) {
        this.V = i;
    }

    public void g0(int i) {
        this.U = i;
    }

    @Override // com.daaw.AbstractC8699uF
    public String h() {
        return "Bars";
    }

    public void h0(AX ax) {
        this.I = ax;
    }

    public void i0(BX bx) {
        this.G = bx;
    }

    public void j0(int i) {
        this.T = i;
    }

    @Override // com.daaw.AbstractC8699uF
    public void t(C2591Vu c2591Vu) {
        super.t(c2591Vu);
        super.u(c2591Vu);
        this.J = c2591Vu.o("flipInput", false);
        b0(c2591Vu.p("heightScale", 3.0f));
        e0(c2591Vu.p("minHeightScale", 0.009f));
        d0(c2591Vu.p("maxHeightScale", 1.0f));
        C2591Vu c2591VuH = c2591Vu.h("ShapePath");
        AX axA = RO0.a(c2591VuH.D("Circle"), this.I);
        this.I = axA;
        if (axA != null) {
            axA.a(c2591VuH);
        }
        c0(c2591Vu.t("colorBlendOffset", C1469Lf0.a(0.0f)));
        j0(c2591Vu.s("softness", 2));
        g0(c2591Vu.s("reactionDelay", 0));
        f0(c2591Vu.s("reactionAccumulatedDelay", 0));
        a0(c2591Vu.s("audioProviderIndex", 1));
        C2591Vu c2591VuH2 = c2591Vu.h("Segment1");
        BX bxA = AbstractC3422bP0.a(c2591VuH2.D("Bars"), this.G);
        this.G = bxA;
        if (bxA != null) {
            bxA.a(c2591VuH2);
        }
        C2591Vu c2591VuH3 = c2591Vu.h("Segment2");
        BX bxA2 = AbstractC3422bP0.a(c2591VuH3.D("None"), this.H);
        this.H = bxA2;
        if (bxA2 != null) {
            bxA2.a(c2591VuH3);
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public boolean v(TH0 th0) {
        return super.v(th0);
    }

    @Override // com.daaw.AbstractC8699uF
    public void x(TH0 th0) {
        super.x(th0);
    }

    @Override // com.daaw.AbstractC8699uF
    public void z(C2591Vu c2591Vu, InterfaceC4577fX interfaceC4577fX) {
        super.z(c2591Vu, interfaceC4577fX);
        super.A(c2591Vu);
        c2591Vu.s0(j(JD0.G6));
        c2591Vu.N("flipInput", this.J, "1_bars");
        c2591Vu.Q("heightScale", this.K, "1_bars", -10.0f, 10.0f);
        c2591Vu.Q("minHeightScale", this.L, "1_bars", -0.03f, 0.03f);
        c2591Vu.Q("maxHeightScale", this.M, "1_bars", 0.1f, 1.0f);
        C2591Vu c2591VuG = c2591Vu.G("ShapePath", RO0.b(this.I), "1_bars", C4268eS.o ? RO0.b : RO0.a);
        AX ax = this.I;
        if (ax != null) {
            ax.q(c2591VuG);
        }
        c2591Vu.b0("colorBlendOffset", this.X, "1_bars", 0.0f, 1.0f);
        c2591Vu.Y("softness", this.T, "2_Behavior", 0, 20);
        c2591Vu.Y("reactionDelay", this.U, "2_Behavior", 0, 9);
        c2591Vu.Y("reactionAccumulatedDelay", this.V, "2_Behavior", 0, 9);
        c2591Vu.Y("audioProviderIndex", this.W, "2_Behavior", 1, 4);
        String strB = AbstractC3422bP0.b(this.G);
        String[] strArr = AbstractC3422bP0.a;
        C2591Vu c2591VuG2 = c2591Vu.G("Segment1", strB, "1_bars", strArr);
        BX bx = this.G;
        if (bx != null) {
            bx.q(c2591VuG2);
        }
        C2591Vu c2591VuG3 = c2591Vu.G("Segment2", AbstractC3422bP0.b(this.H), "1_bars", strArr);
        BX bx2 = this.H;
        if (bx2 != null) {
            bx2.q(c2591VuG3);
        }
    }
}
