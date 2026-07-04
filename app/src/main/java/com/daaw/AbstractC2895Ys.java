package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2895Ys {
    public static final long a(float f, float f2) {
        return AbstractC2791Xs.b((((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    public static /* synthetic */ long b(float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        return a(f, f2);
    }
}
