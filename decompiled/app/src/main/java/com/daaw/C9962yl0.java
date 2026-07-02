package com.daaw;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: renamed from: com.daaw.yl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C9962yl0 {
    public long a;
    public long b;
    public TimeInterpolator c;
    public int d;
    public int e;

    public C9962yl0(long j, long j2) {
        this.c = null;
        this.d = 0;
        this.e = 1;
        this.a = j;
        this.b = j2;
    }

    public static C9962yl0 a(ValueAnimator valueAnimator) {
        C9962yl0 c9962yl0 = new C9962yl0(valueAnimator.getStartDelay(), valueAnimator.getDuration(), e(valueAnimator));
        c9962yl0.d = valueAnimator.getRepeatCount();
        c9962yl0.e = valueAnimator.getRepeatMode();
        return c9962yl0;
    }

    public static TimeInterpolator e(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? AbstractC6991o7.b : interpolator instanceof AccelerateInterpolator ? AbstractC6991o7.c : interpolator instanceof DecelerateInterpolator ? AbstractC6991o7.d : interpolator;
    }

    public long b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public TimeInterpolator d() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : AbstractC6991o7.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9962yl0)) {
            return false;
        }
        C9962yl0 c9962yl0 = (C9962yl0) obj;
        if (b() == c9962yl0.b() && c() == c9962yl0.c() && f() == c9962yl0.f() && g() == c9962yl0.g()) {
            return d().getClass().equals(c9962yl0.d().getClass());
        }
        return false;
    }

    public int f() {
        return this.d;
    }

    public int g() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((int) (b() ^ (b() >>> 32))) * 31) + ((int) (c() ^ (c() >>> 32)))) * 31) + d().getClass().hashCode()) * 31) + f()) * 31) + g();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + b() + " duration: " + c() + " interpolator: " + d().getClass() + " repeatCount: " + f() + " repeatMode: " + g() + "}\n";
    }

    public C9962yl0(long j, long j2, TimeInterpolator timeInterpolator) {
        this.d = 0;
        this.e = 1;
        this.a = j;
        this.b = j2;
        this.c = timeInterpolator;
    }
}
