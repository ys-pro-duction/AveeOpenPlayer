package com.daaw;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.daaw.AbstractC9089ve;
import com.daaw.C2014Qg0;
import com.daaw.C5595j90;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9647xe implements InterfaceC7301pE, AbstractC9089ve.b, T70 {
    public Paint A;
    public float B;
    public BlurMaskFilter C;
    public final Path a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final Paint d = new C3078a90(1);
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final String n;
    public final Matrix o;
    public final C4615ff0 p;
    public final C5595j90 q;
    public C2118Rg0 r;
    public C4248eN s;
    public AbstractC9647xe t;
    public AbstractC9647xe u;
    public List v;
    public final List w;
    public final C5858k51 x;
    public boolean y;
    public boolean z;

    /* JADX INFO: renamed from: com.daaw.xe$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[C2014Qg0.a.values().length];
            b = iArr;
            try {
                iArr[C2014Qg0.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[C2014Qg0.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[C2014Qg0.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[C2014Qg0.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C5595j90.a.values().length];
            a = iArr2;
            try {
                iArr2[C5595j90.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[C5595j90.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[C5595j90.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[C5595j90.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[C5595j90.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[C5595j90.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[C5595j90.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public AbstractC9647xe(C4615ff0 c4615ff0, C5595j90 c5595j90) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new C3078a90(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new C3078a90(1, mode2);
        C3078a90 c3078a90 = new C3078a90(1);
        this.g = c3078a90;
        this.h = new C3078a90(PorterDuff.Mode.CLEAR);
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.o = new Matrix();
        this.w = new ArrayList();
        this.y = true;
        this.B = 0.0f;
        this.p = c4615ff0;
        this.q = c5595j90;
        this.n = c5595j90.i() + "#draw";
        if (c5595j90.h() == C5595j90.b.INVERT) {
            c3078a90.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            c3078a90.setXfermode(new PorterDuffXfermode(mode));
        }
        C5858k51 c5858k51B = c5595j90.w().b();
        this.x = c5858k51B;
        c5858k51B.b(this);
        if (c5595j90.g() != null && !c5595j90.g().isEmpty()) {
            C2118Rg0 c2118Rg0 = new C2118Rg0(c5595j90.g());
            this.r = c2118Rg0;
            Iterator it = c2118Rg0.a().iterator();
            while (it.hasNext()) {
                ((AbstractC9089ve) it.next()).a(this);
            }
            for (AbstractC9089ve abstractC9089ve : this.r.c()) {
                j(abstractC9089ve);
                abstractC9089ve.a(this);
            }
        }
        N();
    }

    public static AbstractC9647xe v(C1923Pp c1923Pp, C5595j90 c5595j90, C4615ff0 c4615ff0, C0737Ee0 c0737Ee0) {
        switch (a.a[c5595j90.f().ordinal()]) {
            case 1:
                return new C8748uR0(c4615ff0, c5595j90, c1923Pp);
            case 2:
                return new C1923Pp(c4615ff0, c5595j90, c0737Ee0.o(c5595j90.m()), c0737Ee0);
            case 3:
                return new HU0(c4615ff0, c5595j90);
            case 4:
                return new C7102oY(c4615ff0, c5595j90);
            case 5:
                return new C2150Ro0(c4615ff0, c5595j90);
            case 6:
                return new C8927v21(c4615ff0, c5595j90);
            default:
                AbstractC1876Pd0.c("Unknown layer type " + c5595j90.f());
                return null;
        }
    }

    public boolean A() {
        C2118Rg0 c2118Rg0 = this.r;
        return (c2118Rg0 == null || c2118Rg0.a().isEmpty()) ? false : true;
    }

    public boolean B() {
        return this.t != null;
    }

    public final void C(RectF rectF, Matrix matrix) {
        this.k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (A()) {
            int size = this.r.b().size();
            for (int i = 0; i < size; i++) {
                C2014Qg0 c2014Qg0 = (C2014Qg0) this.r.b().get(i);
                Path path = (Path) ((AbstractC9089ve) this.r.a().get(i)).h();
                if (path != null) {
                    this.a.set(path);
                    this.a.transform(matrix);
                    int i2 = a.b[c2014Qg0.a().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        return;
                    }
                    if ((i2 == 3 || i2 == 4) && c2014Qg0.d()) {
                        return;
                    }
                    this.a.computeBounds(this.m, false);
                    if (i == 0) {
                        this.k.set(this.m);
                    } else {
                        RectF rectF2 = this.k;
                        rectF2.set(Math.min(rectF2.left, this.m.left), Math.min(this.k.top, this.m.top), Math.max(this.k.right, this.m.right), Math.max(this.k.bottom, this.m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void D(RectF rectF, Matrix matrix) {
        if (B() && this.q.h() != C5595j90.b.INVERT) {
            this.l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.t.e(this.l, matrix, true);
            if (rectF.intersect(this.l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void E() {
        this.p.invalidateSelf();
    }

    public final void F(float f) {
        this.p.F().n().a(this.q.i(), f);
    }

    public void G(AbstractC9089ve abstractC9089ve) {
        this.w.remove(abstractC9089ve);
    }

    public void I(AbstractC9647xe abstractC9647xe) {
        this.t = abstractC9647xe;
    }

    public void J(boolean z) {
        if (z && this.A == null) {
            this.A = new C3078a90();
        }
        this.z = z;
    }

    public void K(AbstractC9647xe abstractC9647xe) {
        this.u = abstractC9647xe;
    }

    public void L(float f) {
        this.x.j(f);
        if (this.r != null) {
            for (int i = 0; i < this.r.a().size(); i++) {
                ((AbstractC9089ve) this.r.a().get(i)).m(f);
            }
        }
        C4248eN c4248eN = this.s;
        if (c4248eN != null) {
            c4248eN.m(f);
        }
        AbstractC9647xe abstractC9647xe = this.t;
        if (abstractC9647xe != null) {
            abstractC9647xe.L(f);
        }
        for (int i2 = 0; i2 < this.w.size(); i2++) {
            ((AbstractC9089ve) this.w.get(i2)).m(f);
        }
    }

    public final void M(boolean z) {
        if (z != this.y) {
            this.y = z;
            E();
        }
    }

    public final void N() {
        if (this.q.e().isEmpty()) {
            M(true);
            return;
        }
        C4248eN c4248eN = new C4248eN(this.q.e());
        this.s = c4248eN;
        c4248eN.l();
        this.s.a(new AbstractC9089ve.b() { // from class: com.daaw.we
            @Override // com.daaw.AbstractC9089ve.b
            public final void a() {
                AbstractC9647xe abstractC9647xe = this.a;
                abstractC9647xe.M(abstractC9647xe.s.p() == 1.0f);
            }
        });
        M(((Float) this.s.h()).floatValue() == 1.0f);
        j(this.s);
    }

    @Override // com.daaw.AbstractC9089ve.b
    public void a() {
        E();
    }

    public void c(Object obj, C8530tf0 c8530tf0) {
        this.x.c(obj, c8530tf0);
    }

    @Override // com.daaw.InterfaceC7301pE
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        this.o.set(matrix);
        if (z) {
            List list = this.v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.o.preConcat(((AbstractC9647xe) this.v.get(size)).x.f());
                }
            } else {
                AbstractC9647xe abstractC9647xe = this.u;
                if (abstractC9647xe != null) {
                    this.o.preConcat(abstractC9647xe.x.f());
                }
            }
        }
        this.o.preConcat(this.x.f());
    }

    @Override // com.daaw.InterfaceC7301pE
    public void g(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        U80.a(this.n);
        if (!this.y || this.q.x()) {
            U80.b(this.n);
            return;
        }
        s();
        U80.a("Layer#parentMatrix");
        this.b.reset();
        this.b.set(matrix);
        for (int size = this.v.size() - 1; size >= 0; size--) {
            this.b.preConcat(((AbstractC9647xe) this.v.get(size)).x.f());
        }
        U80.b("Layer#parentMatrix");
        int iIntValue = (int) ((((i / 255.0f) * (this.x.h() == null ? 100 : ((Integer) this.x.h().h()).intValue())) / 100.0f) * 255.0f);
        if (!B() && !A()) {
            this.b.preConcat(this.x.f());
            U80.a("Layer#drawLayer");
            u(canvas, this.b, iIntValue);
            U80.b("Layer#drawLayer");
            F(U80.b(this.n));
            return;
        }
        U80.a("Layer#computeBounds");
        e(this.i, this.b, false);
        D(this.i, matrix);
        this.b.preConcat(this.x.f());
        C(this.i, this.b);
        this.j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.c);
        if (!this.c.isIdentity()) {
            Matrix matrix2 = this.c;
            matrix2.invert(matrix2);
            this.c.mapRect(this.j);
        }
        if (!this.i.intersect(this.j)) {
            this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        U80.b("Layer#computeBounds");
        if (this.i.width() >= 1.0f && this.i.height() >= 1.0f) {
            U80.a("Layer#saveLayer");
            this.d.setAlpha(255);
            AbstractC0301Ab1.m(canvas, this.i, this.d);
            U80.b("Layer#saveLayer");
            t(canvas);
            U80.a("Layer#drawLayer");
            u(canvas, this.b, iIntValue);
            U80.b("Layer#drawLayer");
            if (A()) {
                p(canvas, this.b);
            }
            if (B()) {
                U80.a("Layer#drawMatte");
                U80.a("Layer#saveLayer");
                AbstractC0301Ab1.n(canvas, this.i, this.g, 19);
                U80.b("Layer#saveLayer");
                t(canvas);
                this.t.g(canvas, matrix, iIntValue);
                U80.a("Layer#restoreLayer");
                canvas.restore();
                U80.b("Layer#restoreLayer");
                U80.b("Layer#drawMatte");
            }
            U80.a("Layer#restoreLayer");
            canvas.restore();
            U80.b("Layer#restoreLayer");
        }
        if (this.z && (paint = this.A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.A.setColor(-251901);
            this.A.setStrokeWidth(4.0f);
            canvas.drawRect(this.i, this.A);
            this.A.setStyle(Paint.Style.FILL);
            this.A.setColor(1357638635);
            canvas.drawRect(this.i, this.A);
        }
        F(U80.b(this.n));
    }

    @Override // com.daaw.InterfaceC2371Tr
    public String getName() {
        return this.q.i();
    }

    @Override // com.daaw.T70
    public void h(S70 s70, int i, List list, S70 s702) {
        AbstractC9647xe abstractC9647xe = this.t;
        if (abstractC9647xe != null) {
            S70 s70A = s702.a(abstractC9647xe.getName());
            if (s70.c(this.t.getName(), i)) {
                list.add(s70A.i(this.t));
            }
            if (s70.h(getName(), i)) {
                this.t.H(s70, s70.e(this.t.getName(), i) + i, list, s70A);
            }
        }
        if (s70.g(getName(), i)) {
            if (!"__container".equals(getName())) {
                s702 = s702.a(getName());
                if (s70.c(getName(), i)) {
                    list.add(s702.i(this));
                }
            }
            if (s70.h(getName(), i)) {
                H(s70, i + s70.e(getName(), i), list, s702);
            }
        }
    }

    public void j(AbstractC9089ve abstractC9089ve) {
        if (abstractC9089ve == null) {
            return;
        }
        this.w.add(abstractC9089ve);
    }

    public final void k(Canvas canvas, Matrix matrix, AbstractC9089ve abstractC9089ve, AbstractC9089ve abstractC9089ve2) {
        this.a.set((Path) abstractC9089ve.h());
        this.a.transform(matrix);
        this.d.setAlpha((int) (((Integer) abstractC9089ve2.h()).intValue() * 2.55f));
        canvas.drawPath(this.a, this.d);
    }

    public final void l(Canvas canvas, Matrix matrix, AbstractC9089ve abstractC9089ve, AbstractC9089ve abstractC9089ve2) {
        AbstractC0301Ab1.m(canvas, this.i, this.e);
        this.a.set((Path) abstractC9089ve.h());
        this.a.transform(matrix);
        this.d.setAlpha((int) (((Integer) abstractC9089ve2.h()).intValue() * 2.55f));
        canvas.drawPath(this.a, this.d);
        canvas.restore();
    }

    public final void m(Canvas canvas, Matrix matrix, AbstractC9089ve abstractC9089ve, AbstractC9089ve abstractC9089ve2) {
        AbstractC0301Ab1.m(canvas, this.i, this.d);
        canvas.drawRect(this.i, this.d);
        this.a.set((Path) abstractC9089ve.h());
        this.a.transform(matrix);
        this.d.setAlpha((int) (((Integer) abstractC9089ve2.h()).intValue() * 2.55f));
        canvas.drawPath(this.a, this.f);
        canvas.restore();
    }

    public final void n(Canvas canvas, Matrix matrix, AbstractC9089ve abstractC9089ve, AbstractC9089ve abstractC9089ve2) {
        AbstractC0301Ab1.m(canvas, this.i, this.e);
        canvas.drawRect(this.i, this.d);
        this.f.setAlpha((int) (((Integer) abstractC9089ve2.h()).intValue() * 2.55f));
        this.a.set((Path) abstractC9089ve.h());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.f);
        canvas.restore();
    }

    public final void o(Canvas canvas, Matrix matrix, AbstractC9089ve abstractC9089ve, AbstractC9089ve abstractC9089ve2) {
        AbstractC0301Ab1.m(canvas, this.i, this.f);
        canvas.drawRect(this.i, this.d);
        this.f.setAlpha((int) (((Integer) abstractC9089ve2.h()).intValue() * 2.55f));
        this.a.set((Path) abstractC9089ve.h());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.f);
        canvas.restore();
    }

    public final void p(Canvas canvas, Matrix matrix) {
        U80.a("Layer#saveLayer");
        AbstractC0301Ab1.n(canvas, this.i, this.e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            t(canvas);
        }
        U80.b("Layer#saveLayer");
        for (int i = 0; i < this.r.b().size(); i++) {
            C2014Qg0 c2014Qg0 = (C2014Qg0) this.r.b().get(i);
            AbstractC9089ve abstractC9089ve = (AbstractC9089ve) this.r.a().get(i);
            AbstractC9089ve abstractC9089ve2 = (AbstractC9089ve) this.r.c().get(i);
            int i2 = a.b[c2014Qg0.a().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.d.setColor(-16777216);
                        this.d.setAlpha(255);
                        canvas.drawRect(this.i, this.d);
                    }
                    if (c2014Qg0.d()) {
                        o(canvas, matrix, abstractC9089ve, abstractC9089ve2);
                    } else {
                        q(canvas, matrix, abstractC9089ve);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (c2014Qg0.d()) {
                            m(canvas, matrix, abstractC9089ve, abstractC9089ve2);
                        } else {
                            k(canvas, matrix, abstractC9089ve, abstractC9089ve2);
                        }
                    }
                } else if (c2014Qg0.d()) {
                    n(canvas, matrix, abstractC9089ve, abstractC9089ve2);
                } else {
                    l(canvas, matrix, abstractC9089ve, abstractC9089ve2);
                }
            } else if (r()) {
                this.d.setAlpha(255);
                canvas.drawRect(this.i, this.d);
            }
        }
        U80.a("Layer#restoreLayer");
        canvas.restore();
        U80.b("Layer#restoreLayer");
    }

    public final void q(Canvas canvas, Matrix matrix, AbstractC9089ve abstractC9089ve) {
        this.a.set((Path) abstractC9089ve.h());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.f);
    }

    public final boolean r() {
        if (this.r.a().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.r.b().size(); i++) {
            if (((C2014Qg0) this.r.b().get(i)).a() != C2014Qg0.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    public final void s() {
        if (this.v != null) {
            return;
        }
        if (this.u == null) {
            this.v = Collections.EMPTY_LIST;
            return;
        }
        this.v = new ArrayList();
        for (AbstractC9647xe abstractC9647xe = this.u; abstractC9647xe != null; abstractC9647xe = abstractC9647xe.u) {
            this.v.add(abstractC9647xe);
        }
    }

    public final void t(Canvas canvas) {
        U80.a("Layer#clearLayer");
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
        U80.b("Layer#clearLayer");
    }

    public abstract void u(Canvas canvas, Matrix matrix, int i);

    public C5177hg w() {
        return this.q.a();
    }

    public BlurMaskFilter x(float f) {
        if (this.B == f) {
            return this.C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.C = blurMaskFilter;
        this.B = f;
        return blurMaskFilter;
    }

    public C8416tE y() {
        return this.q.c();
    }

    public C5595j90 z() {
        return this.q;
    }

    @Override // com.daaw.InterfaceC2371Tr
    public void b(List list, List list2) {
    }

    public void H(S70 s70, int i, List list, S70 s702) {
    }
}
