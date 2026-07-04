package com.daaw;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.zM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10130zM0 {
    public static final Pattern a = Pattern.compile("[\\s,]*");
    public static final RectF b = new RectF();
    public static final Matrix c = new Matrix();
    public static final Matrix d = new Matrix();

    public static float a(float f, float f2, float f3, float f4) {
        return ((float) Math.toDegrees(Math.atan2(f, f2) - Math.atan2(f3, f4))) % 360.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Path b(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC10130zM0.b(java.lang.String):android.graphics.Path");
    }

    public static void c(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2) {
        if (f5 == 0.0f || f6 == 0.0f) {
            path.lineTo(f3, f4);
            return;
        }
        if (f3 == f && f4 == f2) {
            return;
        }
        float fAbs = Math.abs(f5);
        float fAbs2 = Math.abs(f6);
        double d2 = (3.1415927f * f7) / 180.0f;
        float fSin = (float) Math.sin(d2);
        float fCos = (float) Math.cos(d2);
        float f8 = (f - f3) / 2.0f;
        float f9 = (f2 - f4) / 2.0f;
        float f10 = (fCos * f8) + (fSin * f9);
        float f11 = ((-fSin) * f8) + (f9 * fCos);
        float f12 = f10 * f10;
        float f13 = f11 * f11;
        float f14 = fAbs * fAbs;
        float f15 = fAbs2 * fAbs2;
        float f16 = ((f12 / f14) + (f13 / f15)) * 1.001f;
        if (f16 > 1.0f) {
            float fSqrt = (float) Math.sqrt(f16);
            fAbs *= fSqrt;
            fAbs2 *= fSqrt;
            f14 = fAbs * fAbs;
            f15 = fAbs2 * fAbs2;
        }
        float f17 = f14 * f15;
        float f18 = f14 * f13;
        float f19 = f15 * f12;
        float fSqrt2 = ((float) Math.sqrt(((f17 - f18) - f19) / (f18 + f19))) * (i == i2 ? -1 : 1);
        float f20 = ((fSqrt2 * fAbs) * f11) / fAbs2;
        float f21 = (((-fSqrt2) * fAbs2) * f10) / fAbs;
        float f22 = ((fCos * f20) - (fSin * f21)) + ((f + f3) / 2.0f);
        float f23 = (fSin * f20) + (fCos * f21) + ((f2 + f4) / 2.0f);
        float f24 = (f10 - f20) / fAbs;
        float f25 = (f11 - f21) / fAbs2;
        float fA = a(1.0f, 0.0f, f24, f25);
        float fA2 = a(f24, f25, ((-f10) - f20) / fAbs, ((-f11) - f21) / fAbs2);
        if (i2 == 0 && fA2 > 0.0f) {
            fA2 -= 360.0f;
        } else if (i2 != 0 && fA2 < 0.0f) {
            fA2 += 360.0f;
        }
        if (f7 % 360.0f == 0.0f) {
            RectF rectF = b;
            rectF.set(f22 - fAbs, f23 - fAbs2, f22 + fAbs, f23 + fAbs2);
            path.arcTo(rectF, fA, fA2);
            return;
        }
        RectF rectF2 = b;
        rectF2.set(-fAbs, -fAbs2, fAbs, fAbs2);
        Matrix matrix = c;
        matrix.reset();
        matrix.postRotate(f7);
        matrix.postTranslate(f22, f23);
        Matrix matrix2 = d;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.arcTo(rectF2, fA, fA2);
        path.transform(matrix);
    }

    public static Path d(String str) {
        return b(str);
    }
}
