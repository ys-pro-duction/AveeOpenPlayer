package com.daaw;

import com.daaw.C3381bF;

/* JADX INFO: renamed from: com.daaw.eH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4224eH {
    public static double a = 20.0d;
    public static double b = 22050.0d;

    public static void a(C3381bF c3381bF, C2808Xw0 c2808Xw0) {
        c2808Xw0.a();
        if (c3381bF.b.length <= 0) {
            return;
        }
        float fLog10 = (float) Math.log10(a);
        float fLog102 = ((float) Math.log10(b)) - fLog10;
        int i = 0;
        while (true) {
            if (i >= c3381bF.b.length) {
                return;
            }
            float fLog103 = (float) Math.log10(r3[i].a);
            if (fLog103 >= fLog10) {
                float f = (fLog103 - fLog10) / fLog102;
                if (f > 1.0f) {
                    c2808Xw0.d(f, c3381bF.b[i].b);
                    return;
                }
                c2808Xw0.d(f, c3381bF.b[i].b);
            } else {
                c2808Xw0.d(0.0f, c3381bF.b[i].b);
            }
            i++;
        }
    }

    public static void b(C3381bF c3381bF, C3381bF c3381bF2, C3381bF c3381bF3, float f, float f2, float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[fArr.length];
        float[] fArr4 = new float[fArr.length];
        float[] fArr5 = new float[fArr.length];
        C2808Xw0 c2808Xw0 = new C2808Xw0();
        a(c3381bF, c2808Xw0);
        d(c2808Xw0, fArr3, fArr2);
        a(c3381bF2, c2808Xw0);
        d(c2808Xw0, fArr4, fArr2);
        a(c3381bF3, c2808Xw0);
        d(c2808Xw0, fArr5, fArr2);
        for (int i = 0; i < fArr.length; i++) {
            float f3 = fArr3[i] + (fArr4[i] * f) + (fArr5[i] * f2);
            fArr[i] = f3;
            fArr[i] = AbstractC0405Bb1.j(f3, -1.0f, 1.0f);
        }
    }

    public static void c(C3381bF c3381bF, C3381bF c3381bF2) {
        C3381bF.a[] aVarArr = c3381bF2.b;
        int length = aVarArr.length;
        float[] fArr = new float[length];
        int length2 = aVarArr.length;
        float[] fArr2 = new float[length2];
        for (int i = 0; i < length2; i++) {
            fArr2[i] = c3381bF2.b[i].a;
        }
        C2808Xw0 c2808Xw0 = new C2808Xw0();
        a(c3381bF, c2808Xw0);
        d(c2808Xw0, fArr, fArr2);
        for (int i2 = 0; i2 < length; i2++) {
            c3381bF2.b[i2].b = fArr[i2];
        }
    }

    public static void d(C2808Xw0 c2808Xw0, float[] fArr, float[] fArr2) {
        float fLog10 = (float) Math.log10(a);
        float fLog102 = ((float) Math.log10(b)) - fLog10;
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr2[i];
            fArr[i] = c2808Xw0.b(((double) f) == a ? 0.0f : (((float) Math.log10(f)) - fLog10) / fLog102);
        }
    }
}
