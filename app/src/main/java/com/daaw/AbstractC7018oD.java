package com.daaw;

/* JADX INFO: renamed from: com.daaw.oD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7018oD {
    public static final long a(float f, float f2) {
        return C7297pD.c((((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    public static final long b(float f, float f2) {
        return AbstractC7576qD.c((((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }
}
