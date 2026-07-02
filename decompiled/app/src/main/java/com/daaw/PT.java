package com.daaw;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public class PT extends AbstractC1152Ie {
    public final AbstractC9089ve A;
    public C6843nc1 B;
    public final String r;
    public final boolean s;
    public final C7131oe0 t;
    public final C7131oe0 u;
    public final RectF v;
    public final RT w;
    public final int x;
    public final AbstractC9089ve y;
    public final AbstractC9089ve z;

    public PT(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe, OT ot) {
        super(c4615ff0, abstractC9647xe, ot.b().a(), ot.g().a(), ot.i(), ot.k(), ot.m(), ot.h(), ot.c());
        this.t = new C7131oe0();
        this.u = new C7131oe0();
        this.v = new RectF();
        this.r = ot.j();
        this.w = ot.f();
        this.s = ot.n();
        this.x = (int) (c4615ff0.F().d() / 32.0f);
        AbstractC9089ve abstractC9089veH = ot.e().h();
        this.y = abstractC9089veH;
        abstractC9089veH.a(this);
        abstractC9647xe.j(abstractC9089veH);
        AbstractC9089ve abstractC9089veH2 = ot.l().h();
        this.z = abstractC9089veH2;
        abstractC9089veH2.a(this);
        abstractC9647xe.j(abstractC9089veH2);
        AbstractC9089ve abstractC9089veH3 = ot.d().h();
        this.A = abstractC9089veH3;
        abstractC9089veH3.a(this);
        abstractC9647xe.j(abstractC9089veH3);
    }

    @Override // com.daaw.AbstractC1152Ie, com.daaw.T70
    public void c(Object obj, C8530tf0 c8530tf0) {
        super.c(obj, c8530tf0);
        if (obj == InterfaceC7136of0.L) {
            C6843nc1 c6843nc1 = this.B;
            if (c6843nc1 != null) {
                this.f.G(c6843nc1);
            }
            if (c8530tf0 == null) {
                this.B = null;
                return;
            }
            C6843nc1 c6843nc12 = new C6843nc1(c8530tf0);
            this.B = c6843nc12;
            c6843nc12.a(this);
            this.f.j(this.B);
        }
    }

    @Override // com.daaw.AbstractC1152Ie, com.daaw.InterfaceC7301pE
    public void g(Canvas canvas, Matrix matrix, int i) {
        if (this.s) {
            return;
        }
        e(this.v, matrix, false);
        Shader shaderM = this.w == RT.LINEAR ? m() : n();
        shaderM.setLocalMatrix(matrix);
        this.i.setShader(shaderM);
        super.g(canvas, matrix, i);
    }

    @Override // com.daaw.InterfaceC2371Tr
    public String getName() {
        return this.r;
    }

    public final int[] k(int[] iArr) {
        C6843nc1 c6843nc1 = this.B;
        if (c6843nc1 != null) {
            Integer[] numArr = (Integer[]) c6843nc1.h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    public final int l() {
        int iRound = Math.round(this.z.f() * this.x);
        int iRound2 = Math.round(this.A.f() * this.x);
        int iRound3 = Math.round(this.y.f() * this.x);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    public final LinearGradient m() {
        long jL = l();
        LinearGradient linearGradient = (LinearGradient) this.t.g(jL);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.z.h();
        PointF pointF2 = (PointF) this.A.h();
        HT ht = (HT) this.y.h();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, k(ht.a()), ht.b(), Shader.TileMode.CLAMP);
        this.t.k(jL, linearGradient2);
        return linearGradient2;
    }

    public final RadialGradient n() {
        long jL = l();
        RadialGradient radialGradient = (RadialGradient) this.u.g(jL);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.z.h();
        PointF pointF2 = (PointF) this.A.h();
        HT ht = (HT) this.y.h();
        int[] iArrK = k(ht.a());
        float[] fArrB = ht.b();
        RadialGradient radialGradient2 = new RadialGradient(pointF.x, pointF.y, (float) Math.hypot(pointF2.x - r7, pointF2.y - r8), iArrK, fArrB, Shader.TileMode.CLAMP);
        this.u.k(jL, radialGradient2);
        return radialGradient2;
    }
}
