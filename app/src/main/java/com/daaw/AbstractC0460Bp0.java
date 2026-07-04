package com.daaw;

/* JADX INFO: renamed from: com.daaw.Bp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0460Bp0 {
    public static final long a(float f, float f2) {
        return C9982yp0.g((((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    public static final boolean b(long j) {
        float fL = C9982yp0.l(j);
        if (Float.isInfinite(fL) || Float.isNaN(fL)) {
            return false;
        }
        float fM = C9982yp0.m(j);
        return (Float.isInfinite(fM) || Float.isNaN(fM)) ? false : true;
    }

    public static final boolean c(long j) {
        return j != C9982yp0.b.b();
    }
}
