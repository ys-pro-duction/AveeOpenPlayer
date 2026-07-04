package com.daaw;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public class Y70 {
    public final C0737Ee0 a;
    public final Object b;
    public Object c;
    public final Interpolator d;
    public final Interpolator e;
    public final Interpolator f;
    public final float g;
    public Float h;
    public float i;
    public float j;
    public int k;
    public int l;
    public float m;
    public float n;
    public PointF o;
    public PointF p;

    public Y70(C0737Ee0 c0737Ee0, Object obj, Object obj2, Interpolator interpolator, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = c0737Ee0;
        this.b = obj;
        this.c = obj2;
        this.d = interpolator;
        this.e = null;
        this.f = null;
        this.g = f;
        this.h = f2;
    }

    public boolean a(float f) {
        return f >= e() && f < b();
    }

    public float b() {
        if (this.a == null) {
            return 1.0f;
        }
        if (this.n == Float.MIN_VALUE) {
            if (this.h == null) {
                this.n = 1.0f;
            } else {
                this.n = e() + ((this.h.floatValue() - this.g) / this.a.e());
            }
        }
        return this.n;
    }

    public float c() {
        if (this.j == -3987645.8f) {
            this.j = ((Float) this.c).floatValue();
        }
        return this.j;
    }

    public int d() {
        if (this.l == 784923401) {
            this.l = ((Integer) this.c).intValue();
        }
        return this.l;
    }

    public float e() {
        C0737Ee0 c0737Ee0 = this.a;
        if (c0737Ee0 == null) {
            return 0.0f;
        }
        if (this.m == Float.MIN_VALUE) {
            this.m = (this.g - c0737Ee0.p()) / this.a.e();
        }
        return this.m;
    }

    public float f() {
        if (this.i == -3987645.8f) {
            this.i = ((Float) this.b).floatValue();
        }
        return this.i;
    }

    public int g() {
        if (this.k == 784923401) {
            this.k = ((Integer) this.b).intValue();
        }
        return this.k;
    }

    public boolean h() {
        return this.d == null && this.e == null && this.f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.b + ", endValue=" + this.c + ", startFrame=" + this.g + ", endFrame=" + this.h + ", interpolator=" + this.d + '}';
    }

    public Y70(C0737Ee0 c0737Ee0, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = c0737Ee0;
        this.b = obj;
        this.c = obj2;
        this.d = null;
        this.e = interpolator;
        this.f = interpolator2;
        this.g = f;
        this.h = f2;
    }

    public Y70(C0737Ee0 c0737Ee0, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = c0737Ee0;
        this.b = obj;
        this.c = obj2;
        this.d = interpolator;
        this.e = interpolator2;
        this.f = interpolator3;
        this.g = f;
        this.h = f2;
    }

    public Y70(Object obj) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = null;
        this.b = obj;
        this.c = obj;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }
}
