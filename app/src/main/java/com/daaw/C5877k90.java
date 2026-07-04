package com.daaw;

import android.graphics.Matrix;

/* JADX INFO: renamed from: com.daaw.k90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5877k90 {
    public final InterfaceC3429bR a;
    public Matrix b;
    public Matrix c;
    public float[] d;
    public float[] e;
    public boolean f;
    public boolean g;
    public boolean h;

    public C5877k90(InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC3429bR, "getMatrix");
        this.a = interfaceC3429bR;
        this.f = true;
        this.g = true;
        this.h = true;
    }

    public final float[] a(Object obj) {
        float[] fArrC = this.e;
        if (fArrC == null) {
            fArrC = C9384wh0.c(null, 1, null);
            this.e = fArrC;
        }
        if (this.g) {
            this.h = V10.a(b(obj), fArrC);
            this.g = false;
        }
        if (this.h) {
            return fArrC;
        }
        return null;
    }

    public final float[] b(Object obj) {
        float[] fArrC = this.d;
        if (fArrC == null) {
            fArrC = C9384wh0.c(null, 1, null);
            this.d = fArrC;
        }
        if (!this.f) {
            return fArrC;
        }
        Matrix matrix = this.b;
        if (matrix == null) {
            matrix = new Matrix();
            this.b = matrix;
        }
        this.a.invoke(obj, matrix);
        Matrix matrix2 = this.c;
        if (matrix2 == null || !G10.c(matrix, matrix2)) {
            AbstractC3062a6.b(fArrC, matrix);
            this.b = matrix2;
            this.c = matrix;
        }
        this.f = false;
        return fArrC;
    }

    public final void c() {
        this.f = true;
        this.g = true;
    }
}
