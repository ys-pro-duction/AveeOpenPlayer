package com.daaw;

/* JADX INFO: renamed from: com.daaw.tS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8472tS {
    public static final String a(float f, int i) {
        int iMax = Math.max(i, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f2 = f * fPow;
        int i2 = (int) f2;
        if (f2 - i2 >= 0.5f) {
            i2++;
        }
        float f3 = i2 / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }
}
