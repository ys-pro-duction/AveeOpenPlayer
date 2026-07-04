package com.daaw;

/* JADX INFO: renamed from: com.daaw.dF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3938dF {
    public static float a(float f, float f2, float f3, float f4, float f5) {
        if (f2 == 0.0f) {
            return f3;
        }
        if (f2 == f5) {
            return f3 + f4;
        }
        return (f2 / (f5 / 2.0f) < 1.0f ? (f4 / 2.0f) * ((float) Math.pow(2.0d, (r5 - 1.0f) * 10.0f)) : (f4 / 2.0f) * (((float) (-Math.pow(2.0d, (r5 - 1.0f) * (-10.0f)))) + 2.0f)) + f3;
    }
}
