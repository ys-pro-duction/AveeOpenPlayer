package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class L6 {
    public static final F6 a(float f, float f2) {
        return new F6(Float.valueOf(f), AbstractC2521Vc1.c(C3970dN.a), Float.valueOf(f2));
    }

    public static /* synthetic */ F6 b(float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.01f;
        }
        return a(f, f2);
    }
}
