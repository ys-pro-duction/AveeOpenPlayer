package com.daaw;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.daaw.AbstractC9089ve;
import java.util.Collections;

/* JADX INFO: renamed from: com.daaw.k51, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5858k51 {
    public final Matrix a = new Matrix();
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public AbstractC9089ve f;
    public AbstractC9089ve g;
    public AbstractC9089ve h;
    public AbstractC9089ve i;
    public AbstractC9089ve j;
    public C4248eN k;
    public C4248eN l;
    public AbstractC9089ve m;
    public AbstractC9089ve n;

    public C5858k51(V6 v6) {
        this.f = v6.c() == null ? null : v6.c().h();
        this.g = v6.f() == null ? null : v6.f().h();
        this.h = v6.h() == null ? null : v6.h().h();
        this.i = v6.g() == null ? null : v6.g().h();
        C4248eN c4248eN = v6.i() == null ? null : (C4248eN) v6.i().h();
        this.k = c4248eN;
        if (c4248eN != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        this.l = v6.j() == null ? null : (C4248eN) v6.j().h();
        if (v6.e() != null) {
            this.j = v6.e().h();
        }
        if (v6.k() != null) {
            this.m = v6.k().h();
        } else {
            this.m = null;
        }
        if (v6.d() != null) {
            this.n = v6.d().h();
        } else {
            this.n = null;
        }
    }

    public void a(AbstractC9647xe abstractC9647xe) {
        abstractC9647xe.j(this.j);
        abstractC9647xe.j(this.m);
        abstractC9647xe.j(this.n);
        abstractC9647xe.j(this.f);
        abstractC9647xe.j(this.g);
        abstractC9647xe.j(this.h);
        abstractC9647xe.j(this.i);
        abstractC9647xe.j(this.k);
        abstractC9647xe.j(this.l);
    }

    public void b(AbstractC9089ve.b bVar) {
        AbstractC9089ve abstractC9089ve = this.j;
        if (abstractC9089ve != null) {
            abstractC9089ve.a(bVar);
        }
        AbstractC9089ve abstractC9089ve2 = this.m;
        if (abstractC9089ve2 != null) {
            abstractC9089ve2.a(bVar);
        }
        AbstractC9089ve abstractC9089ve3 = this.n;
        if (abstractC9089ve3 != null) {
            abstractC9089ve3.a(bVar);
        }
        AbstractC9089ve abstractC9089ve4 = this.f;
        if (abstractC9089ve4 != null) {
            abstractC9089ve4.a(bVar);
        }
        AbstractC9089ve abstractC9089ve5 = this.g;
        if (abstractC9089ve5 != null) {
            abstractC9089ve5.a(bVar);
        }
        AbstractC9089ve abstractC9089ve6 = this.h;
        if (abstractC9089ve6 != null) {
            abstractC9089ve6.a(bVar);
        }
        AbstractC9089ve abstractC9089ve7 = this.i;
        if (abstractC9089ve7 != null) {
            abstractC9089ve7.a(bVar);
        }
        C4248eN c4248eN = this.k;
        if (c4248eN != null) {
            c4248eN.a(bVar);
        }
        C4248eN c4248eN2 = this.l;
        if (c4248eN2 != null) {
            c4248eN2.a(bVar);
        }
    }

    public boolean c(Object obj, C8530tf0 c8530tf0) {
        if (obj == InterfaceC7136of0.f) {
            AbstractC9089ve abstractC9089ve = this.f;
            if (abstractC9089ve == null) {
                this.f = new C6843nc1(c8530tf0, new PointF());
                return true;
            }
            abstractC9089ve.n(c8530tf0);
            return true;
        }
        if (obj == InterfaceC7136of0.g) {
            AbstractC9089ve abstractC9089ve2 = this.g;
            if (abstractC9089ve2 == null) {
                this.g = new C6843nc1(c8530tf0, new PointF());
                return true;
            }
            abstractC9089ve2.n(c8530tf0);
            return true;
        }
        if (obj == InterfaceC7136of0.h) {
            AbstractC9089ve abstractC9089ve3 = this.g;
            if (abstractC9089ve3 instanceof C9050vV0) {
                ((C9050vV0) abstractC9089ve3).r(c8530tf0);
                return true;
            }
        }
        if (obj == InterfaceC7136of0.i) {
            AbstractC9089ve abstractC9089ve4 = this.g;
            if (abstractC9089ve4 instanceof C9050vV0) {
                ((C9050vV0) abstractC9089ve4).s(c8530tf0);
                return true;
            }
        }
        if (obj == InterfaceC7136of0.o) {
            AbstractC9089ve abstractC9089ve5 = this.h;
            if (abstractC9089ve5 == null) {
                this.h = new C6843nc1(c8530tf0, new C6780nN0());
                return true;
            }
            abstractC9089ve5.n(c8530tf0);
            return true;
        }
        if (obj == InterfaceC7136of0.p) {
            AbstractC9089ve abstractC9089ve6 = this.i;
            if (abstractC9089ve6 == null) {
                this.i = new C6843nc1(c8530tf0, Float.valueOf(0.0f));
                return true;
            }
            abstractC9089ve6.n(c8530tf0);
            return true;
        }
        if (obj == InterfaceC7136of0.c) {
            AbstractC9089ve abstractC9089ve7 = this.j;
            if (abstractC9089ve7 == null) {
                this.j = new C6843nc1(c8530tf0, 100);
                return true;
            }
            abstractC9089ve7.n(c8530tf0);
            return true;
        }
        if (obj == InterfaceC7136of0.C) {
            AbstractC9089ve abstractC9089ve8 = this.m;
            if (abstractC9089ve8 == null) {
                this.m = new C6843nc1(c8530tf0, Float.valueOf(100.0f));
                return true;
            }
            abstractC9089ve8.n(c8530tf0);
            return true;
        }
        if (obj == InterfaceC7136of0.D) {
            AbstractC9089ve abstractC9089ve9 = this.n;
            if (abstractC9089ve9 == null) {
                this.n = new C6843nc1(c8530tf0, Float.valueOf(100.0f));
                return true;
            }
            abstractC9089ve9.n(c8530tf0);
            return true;
        }
        if (obj == InterfaceC7136of0.q) {
            if (this.k == null) {
                this.k = new C4248eN(Collections.singletonList(new Y70(Float.valueOf(0.0f))));
            }
            this.k.n(c8530tf0);
            return true;
        }
        if (obj != InterfaceC7136of0.r) {
            return false;
        }
        if (this.l == null) {
            this.l = new C4248eN(Collections.singletonList(new Y70(Float.valueOf(0.0f))));
        }
        this.l.n(c8530tf0);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public AbstractC9089ve e() {
        return this.n;
    }

    public Matrix f() {
        PointF pointF;
        this.a.reset();
        AbstractC9089ve abstractC9089ve = this.g;
        if (abstractC9089ve != null && (pointF = (PointF) abstractC9089ve.h()) != null) {
            float f = pointF.x;
            if (f != 0.0f || pointF.y != 0.0f) {
                this.a.preTranslate(f, pointF.y);
            }
        }
        AbstractC9089ve abstractC9089ve2 = this.i;
        if (abstractC9089ve2 != null) {
            float fFloatValue = abstractC9089ve2 instanceof C6843nc1 ? ((Float) abstractC9089ve2.h()).floatValue() : ((C4248eN) abstractC9089ve2).p();
            if (fFloatValue != 0.0f) {
                this.a.preRotate(fFloatValue);
            }
        }
        if (this.k != null) {
            float fCos = this.l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.p()) + 90.0f));
            float fSin = this.l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.p()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r0.p()));
            d();
            float[] fArr = this.e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f2 = -fSin;
            fArr[3] = f2;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.b.setValues(fArr);
            d();
            float[] fArr2 = this.e;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.c.setValues(fArr2);
            d();
            float[] fArr3 = this.e;
            fArr3[0] = fCos;
            fArr3[1] = f2;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.d.setValues(fArr3);
            this.c.preConcat(this.b);
            this.d.preConcat(this.c);
            this.a.preConcat(this.d);
        }
        AbstractC9089ve abstractC9089ve3 = this.h;
        if (abstractC9089ve3 != null) {
            C6780nN0 c6780nN0 = (C6780nN0) abstractC9089ve3.h();
            if (c6780nN0.b() != 1.0f || c6780nN0.c() != 1.0f) {
                this.a.preScale(c6780nN0.b(), c6780nN0.c());
            }
        }
        AbstractC9089ve abstractC9089ve4 = this.f;
        if (abstractC9089ve4 != null) {
            PointF pointF2 = (PointF) abstractC9089ve4.h();
            float f3 = pointF2.x;
            if (f3 != 0.0f || pointF2.y != 0.0f) {
                this.a.preTranslate(-f3, -pointF2.y);
            }
        }
        return this.a;
    }

    public Matrix g(float f) {
        AbstractC9089ve abstractC9089ve = this.g;
        PointF pointF = abstractC9089ve == null ? null : (PointF) abstractC9089ve.h();
        AbstractC9089ve abstractC9089ve2 = this.h;
        C6780nN0 c6780nN0 = abstractC9089ve2 == null ? null : (C6780nN0) abstractC9089ve2.h();
        this.a.reset();
        if (pointF != null) {
            this.a.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (c6780nN0 != null) {
            double d = f;
            this.a.preScale((float) Math.pow(c6780nN0.b(), d), (float) Math.pow(c6780nN0.c(), d));
        }
        AbstractC9089ve abstractC9089ve3 = this.i;
        if (abstractC9089ve3 != null) {
            float fFloatValue = ((Float) abstractC9089ve3.h()).floatValue();
            AbstractC9089ve abstractC9089ve4 = this.f;
            PointF pointF2 = abstractC9089ve4 != null ? (PointF) abstractC9089ve4.h() : null;
            this.a.preRotate(fFloatValue * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return this.a;
    }

    public AbstractC9089ve h() {
        return this.j;
    }

    public AbstractC9089ve i() {
        return this.m;
    }

    public void j(float f) {
        AbstractC9089ve abstractC9089ve = this.j;
        if (abstractC9089ve != null) {
            abstractC9089ve.m(f);
        }
        AbstractC9089ve abstractC9089ve2 = this.m;
        if (abstractC9089ve2 != null) {
            abstractC9089ve2.m(f);
        }
        AbstractC9089ve abstractC9089ve3 = this.n;
        if (abstractC9089ve3 != null) {
            abstractC9089ve3.m(f);
        }
        AbstractC9089ve abstractC9089ve4 = this.f;
        if (abstractC9089ve4 != null) {
            abstractC9089ve4.m(f);
        }
        AbstractC9089ve abstractC9089ve5 = this.g;
        if (abstractC9089ve5 != null) {
            abstractC9089ve5.m(f);
        }
        AbstractC9089ve abstractC9089ve6 = this.h;
        if (abstractC9089ve6 != null) {
            abstractC9089ve6.m(f);
        }
        AbstractC9089ve abstractC9089ve7 = this.i;
        if (abstractC9089ve7 != null) {
            abstractC9089ve7.m(f);
        }
        C4248eN c4248eN = this.k;
        if (c4248eN != null) {
            c4248eN.m(f);
        }
        C4248eN c4248eN2 = this.l;
        if (c4248eN2 != null) {
            c4248eN2.m(f);
        }
    }
}
