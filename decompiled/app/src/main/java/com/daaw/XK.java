package com.daaw;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.daaw.AbstractC9089ve;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class XK implements InterfaceC7301pE, AbstractC9089ve.b, U70 {
    public final Path a;
    public final Paint b;
    public final AbstractC9647xe c;
    public final String d;
    public final boolean e;
    public final List f;
    public final AbstractC9089ve g;
    public final AbstractC9089ve h;
    public AbstractC9089ve i;
    public final C4615ff0 j;
    public AbstractC9089ve k;
    public float l;
    public C8981vE m;

    public XK(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe, C7354pR0 c7354pR0) {
        Path path = new Path();
        this.a = path;
        this.b = new C3078a90(1);
        this.f = new ArrayList();
        this.c = abstractC9647xe;
        this.d = c7354pR0.d();
        this.e = c7354pR0.f();
        this.j = c4615ff0;
        if (abstractC9647xe.w() != null) {
            AbstractC9089ve abstractC9089veH = abstractC9647xe.w().a().h();
            this.k = abstractC9089veH;
            abstractC9089veH.a(this);
            abstractC9647xe.j(this.k);
        }
        if (abstractC9647xe.y() != null) {
            this.m = new C8981vE(this, abstractC9647xe, abstractC9647xe.y());
        }
        if (c7354pR0.b() == null || c7354pR0.e() == null) {
            this.g = null;
            this.h = null;
            return;
        }
        path.setFillType(c7354pR0.c());
        AbstractC9089ve abstractC9089veH2 = c7354pR0.b().h();
        this.g = abstractC9089veH2;
        abstractC9089veH2.a(this);
        abstractC9647xe.j(abstractC9089veH2);
        AbstractC9089ve abstractC9089veH3 = c7354pR0.e().h();
        this.h = abstractC9089veH3;
        abstractC9089veH3.a(this);
        abstractC9647xe.j(abstractC9089veH3);
    }

    @Override // com.daaw.AbstractC9089ve.b
    public void a() {
        this.j.invalidateSelf();
    }

    @Override // com.daaw.InterfaceC2371Tr
    public void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC2371Tr interfaceC2371Tr = (InterfaceC2371Tr) list2.get(i);
            if (interfaceC2371Tr instanceof InterfaceC6648mt0) {
                this.f.add((InterfaceC6648mt0) interfaceC2371Tr);
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
        if (obj == InterfaceC7136of0.a) {
            this.g.n(c8530tf0);
            return;
        }
        if (obj == InterfaceC7136of0.d) {
            this.h.n(c8530tf0);
            return;
        }
        if (obj == InterfaceC7136of0.K) {
            AbstractC9089ve abstractC9089ve = this.i;
            if (abstractC9089ve != null) {
                this.c.G(abstractC9089ve);
            }
            if (c8530tf0 == null) {
                this.i = null;
                return;
            }
            C6843nc1 c6843nc1 = new C6843nc1(c8530tf0);
            this.i = c6843nc1;
            c6843nc1.a(this);
            this.c.j(this.i);
            return;
        }
        if (obj == InterfaceC7136of0.j) {
            AbstractC9089ve abstractC9089ve2 = this.k;
            if (abstractC9089ve2 != null) {
                abstractC9089ve2.n(c8530tf0);
                return;
            }
            C6843nc1 c6843nc12 = new C6843nc1(c8530tf0);
            this.k = c6843nc12;
            c6843nc12.a(this);
            this.c.j(this.k);
            return;
        }
        if (obj == InterfaceC7136of0.e && (c8981vE5 = this.m) != null) {
            c8981vE5.c(c8530tf0);
            return;
        }
        if (obj == InterfaceC7136of0.G && (c8981vE4 = this.m) != null) {
            c8981vE4.f(c8530tf0);
            return;
        }
        if (obj == InterfaceC7136of0.H && (c8981vE3 = this.m) != null) {
            c8981vE3.d(c8530tf0);
            return;
        }
        if (obj == InterfaceC7136of0.I && (c8981vE2 = this.m) != null) {
            c8981vE2.e(c8530tf0);
        } else {
            if (obj != InterfaceC7136of0.J || (c8981vE = this.m) == null) {
                return;
            }
            c8981vE.g(c8530tf0);
        }
    }

    @Override // com.daaw.InterfaceC7301pE
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.a.reset();
        for (int i = 0; i < this.f.size(); i++) {
            this.a.addPath(((InterfaceC6648mt0) this.f.get(i)).i(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.daaw.InterfaceC7301pE
    public void g(Canvas canvas, Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        U80.a("FillContent#draw");
        this.b.setColor((AbstractC9678xk0.c((int) ((((i / 255.0f) * ((Integer) this.h.h()).intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((C3251an) this.g).p() & 16777215));
        AbstractC9089ve abstractC9089ve = this.i;
        if (abstractC9089ve != null) {
            this.b.setColorFilter((ColorFilter) abstractC9089ve.h());
        }
        AbstractC9089ve abstractC9089ve2 = this.k;
        if (abstractC9089ve2 != null) {
            float fFloatValue = ((Float) abstractC9089ve2.h()).floatValue();
            if (fFloatValue == 0.0f) {
                this.b.setMaskFilter(null);
            } else if (fFloatValue != this.l) {
                this.b.setMaskFilter(this.c.x(fFloatValue));
            }
            this.l = fFloatValue;
        }
        C8981vE c8981vE = this.m;
        if (c8981vE != null) {
            c8981vE.b(this.b);
        }
        this.a.reset();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            this.a.addPath(((InterfaceC6648mt0) this.f.get(i2)).i(), matrix);
        }
        canvas.drawPath(this.a, this.b);
        U80.b("FillContent#draw");
    }

    @Override // com.daaw.InterfaceC2371Tr
    public String getName() {
        return this.d;
    }

    @Override // com.daaw.T70
    public void h(S70 s70, int i, List list, S70 s702) {
        AbstractC9678xk0.k(s70, i, list, s702, this);
    }
}
