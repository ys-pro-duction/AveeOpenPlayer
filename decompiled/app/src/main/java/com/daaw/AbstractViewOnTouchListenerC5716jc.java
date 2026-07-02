package com.daaw;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: com.daaw.jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC5716jc implements View.OnTouchListener {
    public static final int S = ViewConfiguration.getTapTimeout();
    public final View D;
    public Runnable E;
    public int H;
    public int I;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final a B = new a();
    public final Interpolator C = new AccelerateInterpolator();
    public float[] F = {0.0f, 0.0f};
    public float[] G = {Float.MAX_VALUE, Float.MAX_VALUE};
    public float[] J = {0.0f, 0.0f};
    public float[] K = {0.0f, 0.0f};
    public float[] L = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: com.daaw.jc$a */
    public static class a {
        public int a;
        public int b;
        public float c;
        public float d;
        public float j;
        public int k;
        public long e = Long.MIN_VALUE;
        public long i = -1;
        public long f = 0;
        public int g = 0;
        public int h = 0;

        public void a() {
            if (this.f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j = jCurrentAnimationTimeMillis - this.f;
            this.f = jCurrentAnimationTimeMillis;
            float f = j * fG;
            this.g = (int) (this.c * f);
            this.h = (int) (f * this.d);
        }

        public int b() {
            return this.g;
        }

        public int c() {
            return this.h;
        }

        public int d() {
            float f = this.c;
            return (int) (f / Math.abs(f));
        }

        public final float e(long j) {
            if (j < this.e) {
                return 0.0f;
            }
            long j2 = this.i;
            if (j2 < 0 || j < j2) {
                return AbstractViewOnTouchListenerC5716jc.e((j - r0) / this.a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.j;
            return (1.0f - f) + (f * AbstractViewOnTouchListenerC5716jc.e((j - j2) / this.k, 0.0f, 1.0f));
        }

        public int f() {
            float f = this.d;
            return (int) (f / Math.abs(f));
        }

        public final float g(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        public boolean h() {
            return this.i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.i + ((long) this.k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.k = AbstractViewOnTouchListenerC5716jc.f((int) (jCurrentAnimationTimeMillis - this.e), 0, this.b);
            this.j = e(jCurrentAnimationTimeMillis);
            this.i = jCurrentAnimationTimeMillis;
        }

        public void j(int i) {
            this.b = i;
        }

        public void k(int i) {
            this.a = i;
        }

        public void l(float f, float f2) {
            this.c = f;
            this.d = f2;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.e = jCurrentAnimationTimeMillis;
            this.i = -1L;
            this.f = jCurrentAnimationTimeMillis;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }
    }

    /* JADX INFO: renamed from: com.daaw.jc$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC5716jc abstractViewOnTouchListenerC5716jc = AbstractViewOnTouchListenerC5716jc.this;
            if (abstractViewOnTouchListenerC5716jc.P) {
                if (abstractViewOnTouchListenerC5716jc.N) {
                    abstractViewOnTouchListenerC5716jc.N = false;
                    abstractViewOnTouchListenerC5716jc.B.m();
                }
                a aVar = AbstractViewOnTouchListenerC5716jc.this.B;
                if (aVar.h() || !AbstractViewOnTouchListenerC5716jc.this.v()) {
                    AbstractViewOnTouchListenerC5716jc.this.P = false;
                    return;
                }
                AbstractViewOnTouchListenerC5716jc abstractViewOnTouchListenerC5716jc2 = AbstractViewOnTouchListenerC5716jc.this;
                if (abstractViewOnTouchListenerC5716jc2.O) {
                    abstractViewOnTouchListenerC5716jc2.O = false;
                    abstractViewOnTouchListenerC5716jc2.c();
                }
                aVar.a();
                AbstractViewOnTouchListenerC5716jc.this.j(aVar.b(), aVar.c());
                AbstractC2317Td1.h0(AbstractViewOnTouchListenerC5716jc.this.D, this);
            }
        }
    }

    public AbstractViewOnTouchListenerC5716jc(View view) {
        this.D = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        o(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        p(f3, f3);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        u(1.0f, 1.0f);
        k(S);
        r(500);
        q(500);
    }

    public static float e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    public static int f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    public abstract boolean a(int i);

    public abstract boolean b(int i);

    public void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.D.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final float d(int i, float f, float f2, float f3) {
        float fH = h(this.F[i], f2, this.G[i], f);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f4 = this.J[i];
        float f5 = this.K[i];
        float f6 = this.L[i];
        float f7 = f4 * f3;
        return fH > 0.0f ? e(fH * f7, f5, f6) : -e((-fH) * f7, f5, f6);
    }

    public final float g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.H;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.P && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    public final float h(float f, float f2, float f3, float f4) {
        float interpolation;
        float fE = e(f * f2, 0.0f, f3);
        float fG = g(f2 - f4, fE) - g(f4, fE);
        if (fG < 0.0f) {
            interpolation = -this.C.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.C.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    public final void i() {
        if (this.N) {
            this.P = false;
        } else {
            this.B.i();
        }
    }

    public abstract void j(int i, int i2);

    public AbstractViewOnTouchListenerC5716jc k(int i) {
        this.I = i;
        return this;
    }

    public AbstractViewOnTouchListenerC5716jc l(int i) {
        this.H = i;
        return this;
    }

    public AbstractViewOnTouchListenerC5716jc m(boolean z) {
        if (this.Q && !z) {
            i();
        }
        this.Q = z;
        return this;
    }

    public AbstractViewOnTouchListenerC5716jc n(float f, float f2) {
        float[] fArr = this.G;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public AbstractViewOnTouchListenerC5716jc o(float f, float f2) {
        float[] fArr = this.L;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.Q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.O = r2
            r5.M = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.D
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.D
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            com.daaw.jc$a r7 = r5.B
            r7.l(r0, r6)
            boolean r6 = r5.P
            if (r6 != 0) goto L58
            boolean r6 = r5.v()
            if (r6 == 0) goto L58
            r5.w()
        L58:
            boolean r6 = r5.R
            if (r6 == 0) goto L61
            boolean r6 = r5.P
            if (r6 == 0) goto L61
            return r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractViewOnTouchListenerC5716jc.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public AbstractViewOnTouchListenerC5716jc p(float f, float f2) {
        float[] fArr = this.K;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public AbstractViewOnTouchListenerC5716jc q(int i) {
        this.B.j(i);
        return this;
    }

    public AbstractViewOnTouchListenerC5716jc r(int i) {
        this.B.k(i);
        return this;
    }

    public AbstractViewOnTouchListenerC5716jc s(float f, float f2) {
        float[] fArr = this.F;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public AbstractViewOnTouchListenerC5716jc u(float f, float f2) {
        float[] fArr = this.J;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public boolean v() {
        a aVar = this.B;
        int iF = aVar.f();
        int iD = aVar.d();
        if (iF == 0 || !b(iF)) {
            return iD != 0 && a(iD);
        }
        return true;
    }

    public final void w() {
        int i;
        if (this.E == null) {
            this.E = new b();
        }
        this.P = true;
        this.N = true;
        if (this.M || (i = this.I) <= 0) {
            this.E.run();
        } else {
            AbstractC2317Td1.i0(this.D, this.E, i);
        }
        this.M = true;
    }
}
