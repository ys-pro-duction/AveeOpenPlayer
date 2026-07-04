package com.daaw;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: com.daaw.cO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3696cO0 {
    public static float A = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final float[] B = new float[101];
    public static final float[] C = new float[101];
    public final Interpolator a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;
    public int n;
    public float o;
    public float p;
    public float q;
    public boolean r;
    public boolean s;
    public float t;
    public float u;
    public int v;
    public float w;
    public float x;
    public final float y;
    public float z;

    /* JADX INFO: renamed from: com.daaw.cO0$a */
    public static class a implements Interpolator {
        public static final float a;
        public static final float b;

        static {
            float fA = 1.0f / a(1.0f);
            a = fA;
            b = 1.0f - (fA * a(1.0f));
        }

        public static float a(float f) {
            float f2 = f * 8.0f;
            return f2 < 1.0f ? f2 - (1.0f - ((float) Math.exp(-f2))) : ((1.0f - ((float) Math.exp(1.0f - f2))) * 0.63212055f) + 0.36787945f;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float fA = a * a(f);
            return fA > 0.0f ? fA + b : fA;
        }
    }

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10 = 0.0f;
        float f11 = 0.0f;
        int i = 0;
        while (true) {
            float f12 = 1.0f;
            if (i >= 100) {
                float[] fArr = B;
                C[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f13 = i / 100.0f;
            float f14 = 1.0f;
            while (true) {
                f = ((f14 - f10) / 2.0f) + f10;
                f2 = f12 - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float f15 = (((f2 * 0.175f) + (f * 0.35000002f)) * f3) + f4;
                f5 = f13;
                if (Math.abs(f15 - f13) < 1.0E-5d) {
                    break;
                }
                if (f15 > f5) {
                    f14 = f;
                } else {
                    f10 = f;
                }
                f13 = f5;
                f12 = 1.0f;
            }
            B[i] = (f3 * ((f2 * 0.5f) + f)) + f4;
            float f16 = 1.0f;
            while (true) {
                f6 = ((f16 - f11) / 2.0f) + f11;
                f7 = 1.0f - f6;
                f8 = f6 * 3.0f * f7;
                f9 = f6 * f6 * f6;
                float f17 = (((f7 * 0.5f) + f6) * f8) + f9;
                if (Math.abs(f17 - f5) < 1.0E-5d) {
                    break;
                } else if (f17 > f5) {
                    f16 = f6;
                } else {
                    f11 = f6;
                }
            }
            C[i] = (f8 * ((f7 * 0.175f) + (f6 * 0.35000002f))) + f9;
            i++;
        }
    }

    public C3696cO0(Context context, Interpolator interpolator) {
        this(context, interpolator, context.getApplicationInfo().targetSdkVersion >= 11);
    }

    public final float a(float f) {
        return this.y * 386.0878f * f;
    }

    public boolean b() {
        float f;
        float f2;
        if (this.r) {
            return false;
        }
        int iCurrentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.m);
        int i = this.n;
        if (iCurrentAnimationTimeMillis < i) {
            int i2 = this.b;
            if (i2 == 0) {
                float interpolation = this.a.getInterpolation(iCurrentAnimationTimeMillis * this.o);
                this.k = this.c + Math.round(this.p * interpolation);
                this.l = this.d + Math.round(interpolation * this.q);
            } else if (i2 == 1) {
                float f3 = iCurrentAnimationTimeMillis / i;
                int i3 = (int) (f3 * 100.0f);
                if (i3 < 100) {
                    float f4 = i3 / 100.0f;
                    int i4 = i3 + 1;
                    float[] fArr = B;
                    float f5 = fArr[i3];
                    f2 = (fArr[i4] - f5) / ((i4 / 100.0f) - f4);
                    f = f5 + ((f3 - f4) * f2);
                } else {
                    f = 1.0f;
                    f2 = 0.0f;
                }
                this.u = ((f2 * this.v) / i) * 1000.0f;
                int iRound = this.c + Math.round((this.e - r0) * f);
                this.k = iRound;
                int iMin = Math.min(iRound, this.h);
                this.k = iMin;
                this.k = Math.max(iMin, this.g);
                int iRound2 = this.d + Math.round(f * (this.f - r0));
                this.l = iRound2;
                int iMin2 = Math.min(iRound2, this.j);
                this.l = iMin2;
                int iMax = Math.max(iMin2, this.i);
                this.l = iMax;
                if (this.k == this.e && iMax == this.f) {
                    this.r = true;
                }
            }
        } else {
            this.k = this.e;
            this.l = this.f;
            this.r = true;
        }
        return true;
    }

    public void c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.s && !this.r) {
            float fE = e();
            float f = this.e - this.c;
            float f2 = this.f - this.d;
            float fHypot = (float) Math.hypot(f, f2);
            float f3 = (f / fHypot) * fE;
            float f4 = (f2 / fHypot) * fE;
            float f5 = i3;
            if (Math.signum(f5) == Math.signum(f3)) {
                float f6 = i4;
                if (Math.signum(f6) == Math.signum(f4)) {
                    i3 = (int) (f5 + f3);
                    i4 = (int) (f6 + f4);
                }
            }
        }
        this.b = 1;
        this.r = false;
        float fHypot2 = (float) Math.hypot(i3, i4);
        this.t = fHypot2;
        this.n = l(fHypot2);
        this.m = AnimationUtils.currentAnimationTimeMillis();
        this.c = i;
        this.d = i2;
        float f7 = fHypot2 == 0.0f ? 1.0f : i3 / fHypot2;
        float f8 = fHypot2 != 0.0f ? i4 / fHypot2 : 1.0f;
        double dK = k(fHypot2);
        this.v = (int) (((double) Math.signum(fHypot2)) * dK);
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = i8;
        int iRound = i + ((int) Math.round(((double) f7) * dK));
        this.e = iRound;
        int iMin = Math.min(iRound, this.h);
        this.e = iMin;
        this.e = Math.max(iMin, this.g);
        int iRound2 = i2 + ((int) Math.round(dK * ((double) f8)));
        this.f = iRound2;
        int iMin2 = Math.min(iRound2, this.j);
        this.f = iMin2;
        this.f = Math.max(iMin2, this.i);
    }

    public final void d(boolean z) {
        this.r = z;
    }

    public float e() {
        return this.b == 1 ? this.u : this.t - ((this.x * q()) / 2000.0f);
    }

    public final int f() {
        return this.k;
    }

    public final int g() {
        return this.l;
    }

    public final int h() {
        return this.e;
    }

    public final int i() {
        return this.f;
    }

    public final double j(float f) {
        return Math.log((Math.abs(f) * 0.35f) / (this.w * this.z));
    }

    public final double k(float f) {
        double dJ = j(f);
        float f2 = A;
        return ((double) (this.w * this.z)) * Math.exp((((double) f2) / (((double) f2) - 1.0d)) * dJ);
    }

    public final int l(float f) {
        return (int) (Math.exp(j(f) / (((double) A) - 1.0d)) * 1000.0d);
    }

    public final int m() {
        return this.c;
    }

    public final int n() {
        return this.d;
    }

    public final boolean o() {
        return this.r;
    }

    public void p(int i, int i2, int i3, int i4, int i5) {
        this.b = 0;
        this.r = false;
        this.n = i5;
        this.m = AnimationUtils.currentAnimationTimeMillis();
        this.c = i;
        this.d = i2;
        this.e = i + i3;
        this.f = i2 + i4;
        this.p = i3;
        this.q = i4;
        this.o = 1.0f / this.n;
    }

    public int q() {
        return (int) (AnimationUtils.currentAnimationTimeMillis() - this.m);
    }

    public C3696cO0(Context context, Interpolator interpolator, boolean z) {
        this.w = ViewConfiguration.getScrollFriction();
        this.r = true;
        if (interpolator == null) {
            this.a = new a();
        } else {
            this.a = interpolator;
        }
        this.y = context.getResources().getDisplayMetrics().density * 160.0f;
        this.x = a(ViewConfiguration.getScrollFriction());
        this.s = z;
        this.z = a(0.84f);
    }
}
