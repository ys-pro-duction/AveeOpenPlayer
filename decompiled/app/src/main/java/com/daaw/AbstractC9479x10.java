package com.daaw;

/* JADX INFO: renamed from: com.daaw.x10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9479x10 {
    public static float a(float f, float f2, double d) {
        return f + ((f2 - f) * ((float) d));
    }

    public static void b(C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, C1458Lc1 c1458Lc13, double d) {
        float f = c1458Lc12.a;
        float f2 = (float) d;
        c1458Lc1.a = f + ((c1458Lc13.a - f) * f2);
        float f3 = c1458Lc12.b;
        c1458Lc1.b = f3 + ((c1458Lc13.b - f3) * f2);
    }
}
