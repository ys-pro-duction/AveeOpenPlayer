package com.daaw;

import android.opengl.Matrix;

/* JADX INFO: renamed from: com.daaw.cc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3755cc1 {
    public float[] a = new float[16];

    public float[] a() {
        return this.a;
    }

    public void b(C3755cc1 c3755cc1, C3755cc1 c3755cc12) {
        Matrix.multiplyMM(a(), 0, c3755cc1.a(), 0, c3755cc12.a(), 0);
    }

    public void c(float f) {
        Matrix.rotateM(this.a, 0, f, 0.0f, 0.0f, 1.0f);
    }

    public void d() {
        Matrix.setIdentityM(this.a, 0);
    }

    public void e(float f, float f2, float f3) {
        Matrix.translateM(this.a, 0, f, f2, f3);
    }
}
