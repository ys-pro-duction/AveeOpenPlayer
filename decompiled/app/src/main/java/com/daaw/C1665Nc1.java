package com.daaw;

/* JADX INFO: renamed from: com.daaw.Nc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1665Nc1 {
    public float a;
    public float b;
    public float c;

    public C1665Nc1(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public float a() {
        float fB = b();
        if (fB == 0.0f) {
            fB = 1.1920929E-7f;
        }
        float f = this.a / fB;
        float f2 = (float) (-Math.atan2(this.b / fB == 0.0f ? 1.1920928955078125E-7d : -r3, f != 0.0f ? f : 1.1920928955078125E-7d));
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }

    public float b() {
        float f = this.a;
        float f2 = this.b;
        float f3 = (f * f) + (f2 * f2);
        float f4 = this.c;
        return (float) Math.sqrt(f3 + (f4 * f4));
    }

    public void c() {
        float fB = b();
        this.a /= fB;
        this.b /= fB;
        this.c /= fB;
    }
}
