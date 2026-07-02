package com.daaw;

/* JADX INFO: renamed from: com.daaw.Pc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1873Pc1 {
    public final int a;
    public final Float[] b;

    public C1873Pc1(int i) {
        this.a = i;
        Float[] fArr = new Float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.valueOf(0.0f);
        }
        this.b = fArr;
    }

    public final float a(int i) {
        return this.b[i].floatValue();
    }

    public final float b() {
        return (float) Math.sqrt(d(this));
    }

    public final void c(int i, float f) {
        this.b[i] = Float.valueOf(f);
    }

    public final float d(C1873Pc1 c1873Pc1) {
        G10.g(c1873Pc1, "a");
        int i = this.a;
        float fA = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            fA += a(i2) * c1873Pc1.a(i2);
        }
        return fA;
    }
}
