package com.daaw;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.daaw.jW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5691jW0 {
    public static AbstractC5691jW0 a(long j, long j2, long j3) {
        return new C6288ld(j, j2, j3);
    }

    public static AbstractC5691jW0 e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
