package com.daaw;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.daaw.Kd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1357Kd0 {
    public static final double a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j) {
        return (b() - j) * a;
    }

    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
