package com.daaw;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.daaw.AbstractC9089ve;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MT implements InterfaceC7301pE, AbstractC9089ve.b, U70 {
    public final String a;
    public final boolean b;
    public final AbstractC9647xe c;
    public final C7131oe0 d = new C7131oe0();
    public final C7131oe0 e = new C7131oe0();
    public final Path f;
    public final Paint g;
    public final RectF h;
    public final List i;
    public final RT j;
    public final AbstractC9089ve k;
    public final AbstractC9089ve l;
    public final AbstractC9089ve m;
    public final AbstractC9089ve n;
    public AbstractC9089ve o;
    public C6843nc1 p;
    public final C4615ff0 q;
    public final int r;
    public AbstractC9089ve s;
    public float t;
    public C8981vE u;

    public MT(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe, LT lt) {
        Path path = new Path();
        this.f = path;
        this.g = new C3078a90(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.t = 0.0f;
        this.c = abstractC9647xe;
        this.a = lt.f();
        this.b = lt.i();
        this.q = c4615ff0;
        this.j = lt.e();
        path.setFillType(lt.c());
        this.r = (int) (c4615ff0.F().d() / 32.0f);
        AbstractC9089ve abstractC9089veH = lt.d().h();
        this.k = abstractC9089veH;
        abstractC9089veH.a(this);
        abstractC9647xe.j(abstractC9089veH);
        AbstractC9089ve abstractC9089veH2 = lt.g().h();
        this.l = abstractC9089veH2;
        abstractC9089veH2.a(this);
        abstractC9647xe.j(abstractC9089veH2);
        AbstractC9089ve abstractC9089veH3 = lt.h().h();
        this.m = abstractC9089veH3;
        abstractC9089veH3.a(this);
        abstractC9647xe.j(abstractC9089veH3);
        AbstractC9089ve abstractC9089veH4 = lt.b().h();
        this.n = abstractC9089veH4;
        abstractC9089veH4.a(this);
        abstractC9647xe.j(abstractC9089veH4);
        if (abstractC9647xe.w() != null) {
            AbstractC9089ve abstractC9089veH5 = abstractC9647xe.w().a().h();
            this.s = abstractC9089veH5;
            abstractC9089veH5.a(this);
            abstractC9647xe.j(this.s);
        }
        if (abstractC9647xe.y() != null) {
            this.u = new C8981vE(this, abstractC9647xe, abstractC9647xe.y());
        }
    }

    private int[] f(int[] iArr) {
        C6843nc1 c6843nc1 = this.p;
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

    private int j() {
        int iRound = Math.round(this.m.f() * this.r);
        int iRound2 = Math.round(this.n.f() * this.r);
        int iRound3 = Math.round(this.k.f() * this.r);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private LinearGradient k() {
        long j = j();
        LinearGradient linearGradient = (LinearGradient) this.d.g(j);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.m.h();
        PointF pointF2 = (PointF) this.n.h();
        HT ht = (HT) this.k.h();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, f(ht.a()), ht.b(), Shader.TileMode.CLAMP);
        this.d.k(j, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient l() {
        long j = j();
        RadialGradient radialGradient = (RadialGradient) this.e.g(j);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.m.h();
        PointF pointF2 = (PointF) this.n.h();
        HT ht = (HT) this.k.h();
        int[] iArrF = f(ht.a());
        float[] fArrB = ht.b();
        float f = pointF.x;
        float f2 = pointF.y;
        float fHypot = (float) Math.hypot(pointF2.x - f, pointF2.y - f2);
        RadialGradient radialGradient2 = new RadialGradient(f, f2, fHypot <= 0.0f ? 0.001f : fHypot, iArrF, fArrB, Shader.TileMode.CLAMP);
        this.e.k(j, radialGradient2);
        return radialGradient2;
    }

    @Override // com.daaw.AbstractC9089ve.b
    public void a() {
        this.q.invalidateSelf();
    }

    @Override // com.daaw.InterfaceC2371Tr
    public void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC2371Tr interfaceC2371Tr = (InterfaceC2371Tr) list2.get(i);
            if (interfaceC2371Tr instanceof InterfaceC6648mt0) {
                this.i.add((InterfaceC6648mt0) interfaceC2371Tr);
            }
        }
    }

    @Override // com.daaw.T70
    public void c(Object obj, C8530tf0 c8530tf0) {
        C8981vE c8981vE;
        C8981vE c8981vE2;
        C8981vE c8981vE3;
        C8981vE c8981vE4;
        C8981vE c8981vE5;
        if (obj == InterfaceC7136of0.d) {
            this.l.n(c8530tf0);
            return;
        }
        if (obj == InterfaceC7136of0.K) {
            AbstractC9089ve abstractC9089ve = this.o;
            if (abstractC9089ve != null) {
                this.c.G(abstractC9089ve);
            }
            if (c8530tf0 == null) {
                this.o = null;
                return;
            }
            C6843nc1 c6843nc1 = new C6843nc1(c8530tf0);
            this.o = c6843nc1;
            c6843nc1.a(this);
            this.c.j(this.o);
            return;
        }
        if (obj == InterfaceC7136of0.L) {
            C6843nc1 c6843nc12 = this.p;
            if (c6843nc12 != null) {
                this.c.G(c6843nc12);
            }
            if (c8530tf0 == null) {
                this.p = null;
                return;
            }
            this.d.c();
            this.e.c();
            C6843nc1 c6843nc13 = new C6843nc1(c8530tf0);
            this.p = c6843nc13;
            c6843nc13.a(this);
            this.c.j(this.p);
            return;
        }
        if (obj == InterfaceC7136of0.j) {
            AbstractC9089ve abstractC9089ve2 = this.s;
            if (abstractC9089ve2 != null) {
                abstractC9089ve2.n(c8530tf0);
                return;
            }
            C6843nc1 c6843nc14 = new C6843nc1(c8530tf0);
            this.s = c6843nc14;
            c6843nc14.a(this);
            this.c.j(this.s);
            return;
        }
        if (obj == InterfaceC7136of0.e && (c8981vE5 = this.u) != null) {
            c8981vE5.c(c8530tf0);
            return;
        }
        if (obj == InterfaceC7136of0.G && (c8981vE4 = this.u) != null) {
            c8981vE4.f(c8530tf0);
            return;
        }
        if (obj == InterfaceC7136of0.H && (c8981vE3 = this.u) != null) {
            c8981vE3.d(c8530tf0);
            return;
        }
        if (obj == InterfaceC7136of0.I && (c8981vE2 = this.u) != null) {
            c8981vE2.e(c8530tf0);
        } else {
            if (obj != InterfaceC7136of0.J || (c8981vE = this.u) == null) {
                return;
            }
            c8981vE.g(c8530tf0);
        }
    }

    @Override // com.daaw.InterfaceC7301pE
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.f.reset();
        for (int i = 0; i < this.i.size(); i++) {
            this.f.addPath(((InterfaceC6648mt0) this.i.get(i)).i(), matrix);
        }
        this.f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.daaw.InterfaceC7301pE
    public void g(Canvas canvas, Matrix matrix, int i) {
        if (this.b) {
            return;
        }
        U80.a("GradientFillContent#draw");
        this.f.reset();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            this.f.addPath(((InterfaceC6648mt0) this.i.get(i2)).i(), matrix);
        }
        this.f.computeBounds(this.h, false);
        Shader shaderK = this.j == RT.LINEAR ? k() : l();
        shaderK.setLocalMatrix(matrix);
        this.g.setShader(shaderK);
        AbstractC9089ve abstractC9089ve = this.o;
        if (abstractC9089ve != null) {
            this.g.setColorFilter((ColorFilter) abstractC9089ve.h());
        }
        AbstractC9089ve abstractC9089ve2 = this.s;
        if (abstractC9089ve2 != null) {
            float fFloatValue = ((Float) abstractC9089ve2.h()).floatValue();
            if (fFloatValue == 0.0f) {
                this.g.setMaskFilter(null);
            } else if (fFloatValue != this.t) {
                this.g.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.t = fFloatValue;
        }
        C8981vE c8981vE = this.u;
        if (c8981vE != null) {
            c8981vE.b(this.g);
        }
        this.g.setAlpha(AbstractC9678xk0.c((int) ((((i / 255.0f) * ((Integer) this.l.h()).intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f, this.g);
        U80.b("GradientFillContent#draw");
    }

    @Override // com.daaw.InterfaceC2371Tr
    public String getName() {
        return this.a;
    }

    @Override // com.daaw.T70
    public void h(S70 s70, int i, List list, S70 s702) {
        AbstractC9678xk0.k(s70, i, list, s702, this);
    }
}
