package com.daaw;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public class HY0 extends AbstractC1152Ie {
    public final AbstractC9647xe r;
    public final String s;
    public final boolean t;
    public final AbstractC9089ve u;
    public AbstractC9089ve v;

    public HY0(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe, C10150zR0 c10150zR0) {
        super(c4615ff0, abstractC9647xe, c10150zR0.b().a(), c10150zR0.e().a(), c10150zR0.g(), c10150zR0.i(), c10150zR0.j(), c10150zR0.f(), c10150zR0.d());
        this.r = abstractC9647xe;
        this.s = c10150zR0.h();
        this.t = c10150zR0.k();
        AbstractC9089ve abstractC9089veH = c10150zR0.c().h();
        this.u = abstractC9089veH;
        abstractC9089veH.a(this);
        abstractC9647xe.j(abstractC9089veH);
    }

    @Override // com.daaw.AbstractC1152Ie, com.daaw.T70
    public void c(Object obj, C8530tf0 c8530tf0) {
        super.c(obj, c8530tf0);
        if (obj == InterfaceC7136of0.b) {
            this.u.n(c8530tf0);
            return;
        }
        if (obj == InterfaceC7136of0.K) {
            AbstractC9089ve abstractC9089ve = this.v;
            if (abstractC9089ve != null) {
                this.r.G(abstractC9089ve);
            }
            if (c8530tf0 == null) {
                this.v = null;
                return;
            }
            C6843nc1 c6843nc1 = new C6843nc1(c8530tf0);
            this.v = c6843nc1;
            c6843nc1.a(this);
            this.r.j(this.u);
        }
    }

    @Override // com.daaw.AbstractC1152Ie, com.daaw.InterfaceC7301pE
    public void g(Canvas canvas, Matrix matrix, int i) {
        if (this.t) {
            return;
        }
        this.i.setColor(((C3251an) this.u).p());
        AbstractC9089ve abstractC9089ve = this.v;
        if (abstractC9089ve != null) {
            this.i.setColorFilter((ColorFilter) abstractC9089ve.h());
        }
        super.g(canvas, matrix, i);
    }

    @Override // com.daaw.InterfaceC2371Tr
    public String getName() {
        return this.s;
    }
}
