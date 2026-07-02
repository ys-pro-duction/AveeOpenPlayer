package com.daaw;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.daaw.AbstractC9089ve;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1152Ie implements AbstractC9089ve.b, U70, InterfaceC7301pE {
    public final C4615ff0 e;
    public final AbstractC9647xe f;
    public final float[] h;
    public final Paint i;
    public final AbstractC9089ve j;
    public final AbstractC9089ve k;
    public final List l;
    public final AbstractC9089ve m;
    public AbstractC9089ve n;
    public AbstractC9089ve o;
    public float p;
    public C8981vE q;
    public final PathMeasure a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final List g = new ArrayList();

    /* JADX INFO: renamed from: com.daaw.Ie$b */
    public static final class b {
        public final List a;
        public final C4178e61 b;

        public b(C4178e61 c4178e61) {
            this.a = new ArrayList();
            this.b = c4178e61;
        }
    }

    public AbstractC1152Ie(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe, Paint.Cap cap, Paint.Join join, float f, K6 k6, I6 i6, List list, I6 i62) {
        C3078a90 c3078a90 = new C3078a90(1);
        this.i = c3078a90;
        this.p = 0.0f;
        this.e = c4615ff0;
        this.f = abstractC9647xe;
        c3078a90.setStyle(Paint.Style.STROKE);
        c3078a90.setStrokeCap(cap);
        c3078a90.setStrokeJoin(join);
        c3078a90.setStrokeMiter(f);
        this.k = k6.h();
        this.j = i6.h();
        if (i62 == null) {
            this.m = null;
        } else {
            this.m = i62.h();
        }
        this.l = new ArrayList(list.size());
        this.h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.l.add(((I6) list.get(i)).h());
        }
        abstractC9647xe.j(this.k);
        abstractC9647xe.j(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            abstractC9647xe.j((AbstractC9089ve) this.l.get(i2));
        }
        AbstractC9089ve abstractC9089ve = this.m;
        if (abstractC9089ve != null) {
            abstractC9647xe.j(abstractC9089ve);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((AbstractC9089ve) this.l.get(i3)).a(this);
        }
        AbstractC9089ve abstractC9089ve2 = this.m;
        if (abstractC9089ve2 != null) {
            abstractC9089ve2.a(this);
        }
        if (abstractC9647xe.w() != null) {
            AbstractC9089ve abstractC9089veH = abstractC9647xe.w().a().h();
            this.o = abstractC9089veH;
            abstractC9089veH.a(this);
            abstractC9647xe.j(this.o);
        }
        if (abstractC9647xe.y() != null) {
            this.q = new C8981vE(this, abstractC9647xe, abstractC9647xe.y());
        }
    }

    @Override // com.daaw.AbstractC9089ve.b
    public void a() {
        this.e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // com.daaw.InterfaceC2371Tr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.util.List r8, java.util.List r9) {
        /*
            r7 = this;
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        L8:
            if (r0 < 0) goto L22
            java.lang.Object r3 = r8.get(r0)
            com.daaw.Tr r3 = (com.daaw.InterfaceC2371Tr) r3
            boolean r4 = r3 instanceof com.daaw.C4178e61
            if (r4 == 0) goto L1f
            com.daaw.e61 r3 = (com.daaw.C4178e61) r3
            com.daaw.BR0$a r4 = r3.k()
            com.daaw.BR0$a r5 = com.daaw.BR0.a.INDIVIDUALLY
            if (r4 != r5) goto L1f
            r2 = r3
        L1f:
            int r0 = r0 + (-1)
            goto L8
        L22:
            if (r2 == 0) goto L27
            r2.c(r7)
        L27:
            int r8 = r9.size()
            int r8 = r8 + (-1)
            r0 = r1
        L2e:
            if (r8 < 0) goto L6c
            java.lang.Object r3 = r9.get(r8)
            com.daaw.Tr r3 = (com.daaw.InterfaceC2371Tr) r3
            boolean r4 = r3 instanceof com.daaw.C4178e61
            if (r4 == 0) goto L55
            r4 = r3
            com.daaw.e61 r4 = (com.daaw.C4178e61) r4
            com.daaw.BR0$a r5 = r4.k()
            com.daaw.BR0$a r6 = com.daaw.BR0.a.INDIVIDUALLY
            if (r5 != r6) goto L55
            if (r0 == 0) goto L4c
            java.util.List r3 = r7.g
            r3.add(r0)
        L4c:
            com.daaw.Ie$b r0 = new com.daaw.Ie$b
            r0.<init>(r4)
            r4.c(r7)
            goto L69
        L55:
            boolean r4 = r3 instanceof com.daaw.InterfaceC6648mt0
            if (r4 == 0) goto L69
            if (r0 != 0) goto L60
            com.daaw.Ie$b r0 = new com.daaw.Ie$b
            r0.<init>(r2)
        L60:
            java.util.List r4 = com.daaw.AbstractC1152Ie.b.a(r0)
            com.daaw.mt0 r3 = (com.daaw.InterfaceC6648mt0) r3
            r4.add(r3)
        L69:
            int r8 = r8 + (-1)
            goto L2e
        L6c:
            if (r0 == 0) goto L73
            java.util.List r8 = r7.g
            r8.add(r0)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC1152Ie.b(java.util.List, java.util.List):void");
    }

    public void c(Object obj, C8530tf0 c8530tf0) {
        C8981vE c8981vE;
        C8981vE c8981vE2;
        C8981vE c8981vE3;
        C8981vE c8981vE4;
        C8981vE c8981vE5;
        if (obj == InterfaceC7136of0.d) {
            this.k.n(c8530tf0);
            return;
        }
        if (obj == InterfaceC7136of0.s) {
            this.j.n(c8530tf0);
            return;
        }
        if (obj == InterfaceC7136of0.K) {
            AbstractC9089ve abstractC9089ve = this.n;
            if (abstractC9089ve != null) {
                this.f.G(abstractC9089ve);
            }
            if (c8530tf0 == null) {
                this.n = null;
                return;
            }
            C6843nc1 c6843nc1 = new C6843nc1(c8530tf0);
            this.n = c6843nc1;
            c6843nc1.a(this);
            this.f.j(this.n);
            return;
        }
        if (obj == InterfaceC7136of0.j) {
            AbstractC9089ve abstractC9089ve2 = this.o;
            if (abstractC9089ve2 != null) {
                abstractC9089ve2.n(c8530tf0);
                return;
            }
            C6843nc1 c6843nc12 = new C6843nc1(c8530tf0);
            this.o = c6843nc12;
            c6843nc12.a(this);
            this.f.j(this.o);
            return;
        }
        if (obj == InterfaceC7136of0.e && (c8981vE5 = this.q) != null) {
            c8981vE5.c(c8530tf0);
            return;
        }
        if (obj == InterfaceC7136of0.G && (c8981vE4 = this.q) != null) {
            c8981vE4.f(c8530tf0);
            return;
        }
        if (obj == InterfaceC7136of0.H && (c8981vE3 = this.q) != null) {
            c8981vE3.d(c8530tf0);
            return;
        }
        if (obj == InterfaceC7136of0.I && (c8981vE2 = this.q) != null) {
            c8981vE2.e(c8530tf0);
        } else {
            if (obj != InterfaceC7136of0.J || (c8981vE = this.q) == null) {
                return;
            }
            c8981vE.g(c8530tf0);
        }
    }

    @Override // com.daaw.InterfaceC7301pE
    public void e(RectF rectF, Matrix matrix, boolean z) {
        U80.a("StrokeContent#getBounds");
        this.b.reset();
        for (int i = 0; i < this.g.size(); i++) {
            b bVar = (b) this.g.get(i);
            for (int i2 = 0; i2 < bVar.a.size(); i2++) {
                this.b.addPath(((InterfaceC6648mt0) bVar.a.get(i2)).i(), matrix);
            }
        }
        this.b.computeBounds(this.d, false);
        float fP = ((C4248eN) this.j).p();
        RectF rectF2 = this.d;
        float f = fP / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        U80.b("StrokeContent#getBounds");
    }

    public final void f(Matrix matrix) {
        U80.a("StrokeContent#applyDashPattern");
        if (this.l.isEmpty()) {
            U80.b("StrokeContent#applyDashPattern");
            return;
        }
        float fG = AbstractC0301Ab1.g(matrix);
        for (int i = 0; i < this.l.size(); i++) {
            this.h[i] = ((Float) ((AbstractC9089ve) this.l.get(i)).h()).floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.h;
            fArr3[i] = fArr3[i] * fG;
        }
        AbstractC9089ve abstractC9089ve = this.m;
        this.i.setPathEffect(new DashPathEffect(this.h, abstractC9089ve == null ? 0.0f : fG * ((Float) abstractC9089ve.h()).floatValue()));
        U80.b("StrokeContent#applyDashPattern");
    }

    public void g(Canvas canvas, Matrix matrix, int i) {
        U80.a("StrokeContent#draw");
        if (AbstractC0301Ab1.h(matrix)) {
            U80.b("StrokeContent#draw");
            return;
        }
        this.i.setAlpha(AbstractC9678xk0.c((int) ((((i / 255.0f) * ((N00) this.k).p()) / 100.0f) * 255.0f), 0, 255));
        this.i.setStrokeWidth(((C4248eN) this.j).p() * AbstractC0301Ab1.g(matrix));
        if (this.i.getStrokeWidth() <= 0.0f) {
            U80.b("StrokeContent#draw");
            return;
        }
        f(matrix);
        AbstractC9089ve abstractC9089ve = this.n;
        if (abstractC9089ve != null) {
            this.i.setColorFilter((ColorFilter) abstractC9089ve.h());
        }
        AbstractC9089ve abstractC9089ve2 = this.o;
        if (abstractC9089ve2 != null) {
            float fFloatValue = ((Float) abstractC9089ve2.h()).floatValue();
            if (fFloatValue == 0.0f) {
                this.i.setMaskFilter(null);
            } else if (fFloatValue != this.p) {
                this.i.setMaskFilter(this.f.x(fFloatValue));
            }
            this.p = fFloatValue;
        }
        C8981vE c8981vE = this.q;
        if (c8981vE != null) {
            c8981vE.b(this.i);
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            b bVar = (b) this.g.get(i2);
            if (bVar.b != null) {
                j(canvas, bVar, matrix);
            } else {
                U80.a("StrokeContent#buildPath");
                this.b.reset();
                for (int size = bVar.a.size() - 1; size >= 0; size--) {
                    this.b.addPath(((InterfaceC6648mt0) bVar.a.get(size)).i(), matrix);
                }
                U80.b("StrokeContent#buildPath");
                U80.a("StrokeContent#drawPath");
                canvas.drawPath(this.b, this.i);
                U80.b("StrokeContent#drawPath");
            }
        }
        U80.b("StrokeContent#draw");
    }

    @Override // com.daaw.T70
    public void h(S70 s70, int i, List list, S70 s702) {
        AbstractC9678xk0.k(s70, i, list, s702, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.graphics.Canvas r17, com.daaw.AbstractC1152Ie.b r18, android.graphics.Matrix r19) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC1152Ie.j(android.graphics.Canvas, com.daaw.Ie$b, android.graphics.Matrix):void");
    }
}
