package com.daaw;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.daaw.C5595j90;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Pp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1923Pp extends AbstractC9647xe {
    public AbstractC9089ve D;
    public final List E;
    public final RectF F;
    public final RectF G;
    public final Paint H;
    public boolean I;

    /* JADX INFO: renamed from: com.daaw.Pp$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C5595j90.b.values().length];
            a = iArr;
            try {
                iArr[C5595j90.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C5595j90.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C1923Pp(C4615ff0 c4615ff0, C5595j90 c5595j90, List list, C0737Ee0 c0737Ee0) {
        int i;
        AbstractC9647xe abstractC9647xe;
        super(c4615ff0, c5595j90);
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Paint();
        this.I = true;
        I6 i6U = c5595j90.u();
        if (i6U != null) {
            AbstractC9089ve abstractC9089veH = i6U.h();
            this.D = abstractC9089veH;
            j(abstractC9089veH);
            this.D.a(this);
        } else {
            this.D = null;
        }
        C7131oe0 c7131oe0 = new C7131oe0(c0737Ee0.k().size());
        int size = list.size() - 1;
        AbstractC9647xe abstractC9647xe2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C5595j90 c5595j902 = (C5595j90) list.get(size);
            AbstractC9647xe abstractC9647xeV = AbstractC9647xe.v(this, c5595j902, c4615ff0, c0737Ee0);
            if (abstractC9647xeV != null) {
                c7131oe0.k(abstractC9647xeV.z().d(), abstractC9647xeV);
                if (abstractC9647xe2 != null) {
                    abstractC9647xe2.I(abstractC9647xeV);
                    abstractC9647xe2 = null;
                } else {
                    this.E.add(0, abstractC9647xeV);
                    int i2 = a.a[c5595j902.h().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        abstractC9647xe2 = abstractC9647xeV;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < c7131oe0.n(); i++) {
            AbstractC9647xe abstractC9647xe3 = (AbstractC9647xe) c7131oe0.g(c7131oe0.j(i));
            if (abstractC9647xe3 != null && (abstractC9647xe = (AbstractC9647xe) c7131oe0.g(abstractC9647xe3.z().j())) != null) {
                abstractC9647xe3.K(abstractC9647xe);
            }
        }
    }

    @Override // com.daaw.AbstractC9647xe
    public void H(S70 s70, int i, List list, S70 s702) {
        for (int i2 = 0; i2 < this.E.size(); i2++) {
            ((AbstractC9647xe) this.E.get(i2)).h(s70, i, list, s702);
        }
    }

    @Override // com.daaw.AbstractC9647xe
    public void J(boolean z) {
        super.J(z);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((AbstractC9647xe) it.next()).J(z);
        }
    }

    @Override // com.daaw.AbstractC9647xe
    public void L(float f) {
        super.L(f);
        if (this.D != null) {
            f = ((((Float) this.D.h()).floatValue() * this.q.b().i()) - this.q.b().p()) / (this.p.F().e() + 0.01f);
        }
        if (this.D == null) {
            f -= this.q.r();
        }
        if (this.q.v() != 0.0f && !"__container".equals(this.q.i())) {
            f /= this.q.v();
        }
        for (int size = this.E.size() - 1; size >= 0; size--) {
            ((AbstractC9647xe) this.E.get(size)).L(f);
        }
    }

    public void O(boolean z) {
        this.I = z;
    }

    @Override // com.daaw.AbstractC9647xe, com.daaw.T70
    public void c(Object obj, C8530tf0 c8530tf0) {
        super.c(obj, c8530tf0);
        if (obj == InterfaceC7136of0.E) {
            if (c8530tf0 == null) {
                AbstractC9089ve abstractC9089ve = this.D;
                if (abstractC9089ve != null) {
                    abstractC9089ve.n(null);
                    return;
                }
                return;
            }
            C6843nc1 c6843nc1 = new C6843nc1(c8530tf0);
            this.D = c6843nc1;
            c6843nc1.a(this);
            j(this.D);
        }
    }

    @Override // com.daaw.AbstractC9647xe, com.daaw.InterfaceC7301pE
    public void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        for (int size = this.E.size() - 1; size >= 0; size--) {
            this.F.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((AbstractC9647xe) this.E.get(size)).e(this.F, this.o, true);
            rectF.union(this.F);
        }
    }

    @Override // com.daaw.AbstractC9647xe
    public void u(Canvas canvas, Matrix matrix, int i) {
        U80.a("CompositionLayer#draw");
        this.G.set(0.0f, 0.0f, this.q.l(), this.q.k());
        matrix.mapRect(this.G);
        boolean z = this.p.a0() && this.E.size() > 1 && i != 255;
        if (z) {
            this.H.setAlpha(i);
            AbstractC0301Ab1.m(canvas, this.G, this.H);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.E.size() - 1; size >= 0; size--) {
            if (((this.I || !"__container".equals(this.q.i())) && !this.G.isEmpty()) ? canvas.clipRect(this.G) : true) {
                ((AbstractC9647xe) this.E.get(size)).g(canvas, matrix, i);
            }
        }
        canvas.restore();
        U80.b("CompositionLayer#draw");
    }
}
