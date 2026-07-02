package com.daaw;

import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.Lc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1458Lc1 {
    public float a;
    public float b;

    public C1458Lc1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static C1458Lc1 a(String str, C1458Lc1 c1458Lc1) {
        if (str != null) {
            try {
                int iIndexOf = str.indexOf(" ");
                if (iIndexOf >= 0) {
                    return new C1458Lc1(Float.parseFloat(str.substring(0, iIndexOf)), Float.parseFloat(str.substring(iIndexOf + 1)));
                }
            } catch (NumberFormatException unused) {
            }
        }
        return c1458Lc1;
    }

    public static float b(float f, float f2) {
        return -f2;
    }

    public static float e(float f, float f2) {
        return -f;
    }

    public static float g(float f, float f2, float f3, float f4) {
        return (f * f3) + (f2 * f4);
    }

    public static C1458Lc1 h(float f) {
        double radians = (float) Math.toRadians(f);
        return new C1458Lc1((float) Math.cos(radians), (float) Math.sin(radians));
    }

    public static void i(C1665Nc1 c1665Nc1, float f) {
        double d = f;
        c1665Nc1.a = (float) Math.cos(d);
        c1665Nc1.b = (float) Math.sin(d);
    }

    public static float j(float f, float f2) {
        float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        if (fSqrt == 0.0f) {
            fSqrt = 1.1920929E-7f;
        }
        float f3 = f / fSqrt;
        float f4 = (float) (-Math.atan2(f2 / fSqrt == 0.0f ? 1.1920928955078125E-7d : -r7, f3 != 0.0f ? f3 : 1.1920928955078125E-7d));
        return f4 < 0.0f ? f4 + 6.2831855f : f4;
    }

    public static float l(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public static C1458Lc1 q() {
        return new C1458Lc1(1.0f, 1.0f);
    }

    public static C1458Lc1 s() {
        return new C1458Lc1(0.0f, 0.0f);
    }

    public float f(C1458Lc1 c1458Lc1) {
        float f = this.a - c1458Lc1.a;
        float f2 = this.b - c1458Lc1.b;
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public float k() {
        float f = this.a;
        float f2 = this.b;
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public void m(float f, float f2, float f3) {
        float fMax = f3 / Math.max((this.a * f) + (this.b * f2), 0.25f);
        this.a *= fMax;
        this.b *= fMax;
    }

    public void n(C1458Lc1 c1458Lc1, float f) {
        float fMax = f / Math.max((this.a * c1458Lc1.a) + (this.b * c1458Lc1.b), 0.25f);
        this.a *= fMax;
        this.b *= fMax;
    }

    public C1458Lc1 o() {
        float f = this.a;
        float f2 = this.b;
        float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        this.a /= fSqrt;
        this.b /= fSqrt;
        return this;
    }

    public C1458Lc1 p() {
        float f = this.a;
        float f2 = this.b;
        float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        if (fSqrt == 0.0f) {
            fSqrt = 1.1920929E-7f;
        }
        this.a /= fSqrt;
        this.b /= fSqrt;
        return this;
    }

    public void r(float f) {
        double d = f;
        float fCos = (((float) Math.cos(d)) * this.a) - (((float) Math.sin(d)) * this.b);
        this.b = (((float) Math.sin(d)) * this.a) + (((float) Math.cos(d)) * this.b);
        this.a = fCos;
    }

    public String toString() {
        return String.format(Locale.US, "%f %f", Float.valueOf(this.a), Float.valueOf(this.b));
    }

    public static float c(float f, float f2) {
        return f;
    }

    public static float d(float f, float f2) {
        return f2;
    }
}
