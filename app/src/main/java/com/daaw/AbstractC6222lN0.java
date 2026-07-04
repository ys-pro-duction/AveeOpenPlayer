package com.daaw;

/* JADX INFO: renamed from: com.daaw.lN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6222lN0 {
    public static final long a(float f, float f2) {
        return AbstractC5934kN0.a((((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    public static final long b(long j, long j2) {
        return BT0.a(C9879yT0.i(j) * AbstractC5934kN0.b(j2), C9879yT0.g(j) * AbstractC5934kN0.c(j2));
    }
}
