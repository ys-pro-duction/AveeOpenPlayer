package com.daaw;

/* JADX INFO: renamed from: com.daaw.yh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9942yh0 {
    public static final boolean a(float[] fArr) {
        G10.g(fArr, "$this$isIdentity");
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                if (fArr[(i * 4) + i2] != (i == i2 ? 1.0f : 0.0f)) {
                    return false;
                }
                i2++;
            }
            i++;
        }
        return true;
    }
}
