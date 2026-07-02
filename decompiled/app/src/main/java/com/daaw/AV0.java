package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class AV0 {
    public static final float a = Float.MAX_VALUE;

    public static final long a(float f, float f2) {
        return AbstractC6887nl0.a((((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    public static final float b() {
        return a;
    }
}
