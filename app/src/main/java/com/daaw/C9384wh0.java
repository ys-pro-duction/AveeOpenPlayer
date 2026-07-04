package com.daaw;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.wh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9384wh0 {
    public static final a b = new a(null);
    public final float[] a;

    /* JADX INFO: renamed from: com.daaw.wh0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C9384wh0(float[] fArr) {
        this.a = fArr;
    }

    public static final /* synthetic */ C9384wh0 a(float[] fArr) {
        return new C9384wh0(fArr);
    }

    public static float[] b(float[] fArr) {
        G10.g(fArr, DiagnosticsEntry.Histogram.VALUES_KEY);
        return fArr;
    }

    public static /* synthetic */ float[] c(float[] fArr, int i, AbstractC2911Yw abstractC2911Yw) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return b(fArr);
    }

    public static boolean d(float[] fArr, Object obj) {
        return (obj instanceof C9384wh0) && G10.c(fArr, ((C9384wh0) obj).n());
    }

    public static int e(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final long f(float[] fArr, long j) {
        float fL = C9982yp0.l(j);
        float fM = C9982yp0.m(j);
        float f = 1 / (((fArr[3] * fL) + (fArr[7] * fM)) + fArr[15]);
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            f = 0.0f;
        }
        return AbstractC0460Bp0.a(((fArr[0] * fL) + (fArr[4] * fM) + fArr[12]) * f, f * ((fArr[1] * fL) + (fArr[5] * fM) + fArr[13]));
    }

    public static final void g(float[] fArr, C6892nm0 c6892nm0) {
        G10.g(c6892nm0, "rect");
        long jF = f(fArr, AbstractC0460Bp0.a(c6892nm0.b(), c6892nm0.d()));
        long jF2 = f(fArr, AbstractC0460Bp0.a(c6892nm0.b(), c6892nm0.a()));
        long jF3 = f(fArr, AbstractC0460Bp0.a(c6892nm0.c(), c6892nm0.d()));
        long jF4 = f(fArr, AbstractC0460Bp0.a(c6892nm0.c(), c6892nm0.a()));
        c6892nm0.i(Math.min(Math.min(C9982yp0.l(jF), C9982yp0.l(jF2)), Math.min(C9982yp0.l(jF3), C9982yp0.l(jF4))));
        c6892nm0.k(Math.min(Math.min(C9982yp0.m(jF), C9982yp0.m(jF2)), Math.min(C9982yp0.m(jF3), C9982yp0.m(jF4))));
        c6892nm0.j(Math.max(Math.max(C9982yp0.l(jF), C9982yp0.l(jF2)), Math.max(C9982yp0.l(jF3), C9982yp0.l(jF4))));
        c6892nm0.h(Math.max(Math.max(C9982yp0.m(jF), C9982yp0.m(jF2)), Math.max(C9982yp0.m(jF3), C9982yp0.m(jF4))));
    }

    public static final void h(float[] fArr) {
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                fArr[(i2 * 4) + i] = i == i2 ? 1.0f : 0.0f;
                i2++;
            }
            i++;
        }
    }

    public static final void i(float[] fArr, float f) {
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f2 = fArr[0];
        float f3 = fArr[4];
        float f4 = (fCos * f2) + (fSin * f3);
        float f5 = -fSin;
        float f6 = fArr[1];
        float f7 = fArr[5];
        float f8 = (fCos * f6) + (fSin * f7);
        float f9 = fArr[2];
        float f10 = fArr[6];
        float f11 = (fCos * f9) + (fSin * f10);
        float f12 = fArr[3];
        float f13 = fArr[7];
        fArr[0] = f4;
        fArr[1] = f8;
        fArr[2] = f11;
        fArr[3] = (fCos * f12) + (fSin * f13);
        fArr[4] = (f2 * f5) + (f3 * fCos);
        fArr[5] = (f6 * f5) + (f7 * fCos);
        fArr[6] = (f9 * f5) + (f10 * fCos);
        fArr[7] = (f5 * f12) + (fCos * f13);
    }

    public static final void j(float[] fArr, float f, float f2, float f3) {
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
        fArr[8] = fArr[8] * f3;
        fArr[9] = fArr[9] * f3;
        fArr[10] = fArr[10] * f3;
        fArr[11] = fArr[11] * f3;
    }

    public static String k(float[] fArr) {
        return AbstractC8497tY0.e("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static final void l(float[] fArr, float f, float f2, float f3) {
        float f4 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * f3) + fArr[12];
        float f5 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * f3) + fArr[13];
        float f6 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * f3) + fArr[14];
        float f7 = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * f3) + fArr[15];
        fArr[12] = f4;
        fArr[13] = f5;
        fArr[14] = f6;
        fArr[15] = f7;
    }

    public static /* synthetic */ void m(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        l(fArr, f, f2, f3);
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public int hashCode() {
        return e(this.a);
    }

    public final /* synthetic */ float[] n() {
        return this.a;
    }

    public String toString() {
        return k(this.a);
    }
}
