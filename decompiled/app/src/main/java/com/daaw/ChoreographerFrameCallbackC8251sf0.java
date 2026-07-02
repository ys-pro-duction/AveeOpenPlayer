package com.daaw;

import android.view.Choreographer;

/* JADX INFO: renamed from: com.daaw.sf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ChoreographerFrameCallbackC8251sf0 extends AbstractC0311Ae implements Choreographer.FrameCallback {
    public C0737Ee0 K;
    public float D = 1.0f;
    public boolean E = false;
    public long F = 0;
    public float G = 0.0f;
    public int H = 0;
    public float I = -2.1474836E9f;
    public float J = 2.1474836E9f;
    public boolean L = false;

    public void A(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        C0737Ee0 c0737Ee0 = this.K;
        float fP = c0737Ee0 == null ? -3.4028235E38f : c0737Ee0.p();
        C0737Ee0 c0737Ee02 = this.K;
        float f3 = c0737Ee02 == null ? Float.MAX_VALUE : c0737Ee02.f();
        float fB = AbstractC9678xk0.b(f, fP, f3);
        float fB2 = AbstractC9678xk0.b(f2, fP, f3);
        if (fB == this.I && fB2 == this.J) {
            return;
        }
        this.I = fB;
        this.J = fB2;
        y((int) AbstractC9678xk0.b(this.G, fB, fB2));
    }

    public void B(int i) {
        A(i, (int) this.J);
    }

    public void C(float f) {
        this.D = f;
    }

    public final void D() {
        if (this.K == null) {
            return;
        }
        float f = this.G;
        if (f < this.I || f > this.J) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.I), Float.valueOf(this.J), Float.valueOf(this.G)));
        }
    }

    @Override // com.daaw.AbstractC0311Ae
    public void b() {
        super.b();
        c(o());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        b();
        t();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        r();
        if (this.K == null || !isRunning()) {
            return;
        }
        U80.a("LottieValueAnimator#doFrame");
        float fK = (this.F != 0 ? j - r1 : 0L) / k();
        float f = this.G;
        if (o()) {
            fK = -fK;
        }
        float f2 = f + fK;
        this.G = f2;
        boolean zD = AbstractC9678xk0.d(f2, m(), l());
        this.G = AbstractC9678xk0.b(this.G, m(), l());
        this.F = j;
        f();
        if (!zD) {
            if (getRepeatCount() == -1 || this.H < getRepeatCount()) {
                d();
                this.H++;
                if (getRepeatMode() == 2) {
                    this.E = !this.E;
                    w();
                } else {
                    this.G = o() ? l() : m();
                }
                this.F = j;
            } else {
                this.G = this.D < 0.0f ? m() : l();
                t();
                c(o());
            }
        }
        D();
        U80.b("LottieValueAnimator#doFrame");
    }

    public void g() {
        this.K = null;
        this.I = -2.1474836E9f;
        this.J = 2.1474836E9f;
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fM;
        float fL;
        float fM2;
        if (this.K == null) {
            return 0.0f;
        }
        if (o()) {
            fM = l() - this.G;
            fL = l();
            fM2 = m();
        } else {
            fM = this.G - m();
            fL = l();
            fM2 = m();
        }
        return fM / (fL - fM2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(i());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        C0737Ee0 c0737Ee0 = this.K;
        if (c0737Ee0 == null) {
            return 0L;
        }
        return (long) c0737Ee0.d();
    }

    public void h() {
        t();
        c(o());
    }

    public float i() {
        C0737Ee0 c0737Ee0 = this.K;
        if (c0737Ee0 == null) {
            return 0.0f;
        }
        return (this.G - c0737Ee0.p()) / (this.K.f() - this.K.p());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.L;
    }

    public float j() {
        return this.G;
    }

    public final float k() {
        C0737Ee0 c0737Ee0 = this.K;
        if (c0737Ee0 == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / c0737Ee0.i()) / Math.abs(this.D);
    }

    public float l() {
        C0737Ee0 c0737Ee0 = this.K;
        if (c0737Ee0 == null) {
            return 0.0f;
        }
        float f = this.J;
        return f == 2.1474836E9f ? c0737Ee0.f() : f;
    }

    public float m() {
        C0737Ee0 c0737Ee0 = this.K;
        if (c0737Ee0 == null) {
            return 0.0f;
        }
        float f = this.I;
        return f == -2.1474836E9f ? c0737Ee0.p() : f;
    }

    public float n() {
        return this.D;
    }

    public final boolean o() {
        return n() < 0.0f;
    }

    public void p() {
        t();
    }

    public void q() {
        this.L = true;
        e(o());
        y((int) (o() ? l() : m()));
        this.F = 0L;
        this.H = 0;
        r();
    }

    public void r() {
        if (isRunning()) {
            u(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.E) {
            return;
        }
        this.E = false;
        w();
    }

    public void t() {
        u(true);
    }

    public void u(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.L = false;
        }
    }

    public void v() {
        this.L = true;
        r();
        this.F = 0L;
        if (o() && j() == m()) {
            this.G = l();
        } else {
            if (o() || j() != l()) {
                return;
            }
            this.G = m();
        }
    }

    public void w() {
        C(-n());
    }

    public void x(C0737Ee0 c0737Ee0) {
        boolean z = this.K == null;
        this.K = c0737Ee0;
        if (z) {
            A(Math.max(this.I, c0737Ee0.p()), Math.min(this.J, c0737Ee0.f()));
        } else {
            A((int) c0737Ee0.p(), (int) c0737Ee0.f());
        }
        float f = this.G;
        this.G = 0.0f;
        y((int) f);
        f();
    }

    public void y(float f) {
        if (this.G == f) {
            return;
        }
        this.G = AbstractC9678xk0.b(f, m(), l());
        this.F = 0L;
        f();
    }

    public void z(float f) {
        A(this.I, f);
    }
}
