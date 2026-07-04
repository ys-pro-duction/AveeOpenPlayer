package com.daaw;

import android.graphics.Color;
import android.opengl.GLES20;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class VT {
    public static int a(int[] iArr) {
        return (iArr[2] & 255) | ((iArr[3] & 255) << 24) | ((iArr[0] & 255) << 16) | ((iArr[1] & 255) << 8);
    }

    public static void b(float[] fArr, float[] fArr2, float[] fArr3, float f) {
        float fMax = Math.max(fArr2[0], Math.max(fArr2[1], fArr2[2]));
        float fMax2 = fMax + ((Math.max(fArr3[0], Math.max(fArr3[1], fArr3[2])) - fMax) * f);
        float f2 = fArr2[0];
        fArr[0] = f2 + ((fArr3[0] - f2) * f);
        float f3 = fArr2[1];
        fArr[1] = f3 + ((fArr3[1] - f3) * f);
        float f4 = fArr2[2];
        fArr[2] = f4 + ((fArr3[2] - f4) * f);
        float f5 = fArr2[3];
        fArr[3] = f5 + ((fArr3[3] - f5) * f);
        float fSqrt = (float) Math.sqrt((r3 * r3) + (r5 * r5) + (r6 * r6));
        float f6 = fArr[0] / fSqrt;
        fArr[0] = f6;
        float f7 = fArr[1] / fSqrt;
        fArr[1] = f7;
        float f8 = fArr[2] / fSqrt;
        fArr[2] = f8;
        fArr[0] = f6 * fMax2;
        fArr[1] = f7 * fMax2;
        fArr[2] = f8 * fMax2;
    }

    public static int c(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static void d(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = fArr2[0] * fArr3[0];
        fArr[1] = fArr2[1] * fArr3[1];
        fArr[2] = fArr2[2] * fArr3[2];
        fArr[3] = fArr2[3] * fArr3[3];
    }

    public static int e(float f, float f2, float f3, float f4) {
        return (((int) (f * 255.0f)) << 24) | (((int) (f2 * 255.0f)) << 16) | (((int) (f3 * 255.0f)) << 8) | ((int) (f4 * 255.0f));
    }

    public static int f(float[] fArr) {
        return ((int) (fArr[2] * 255.0f)) | (((int) (fArr[3] * 255.0f)) << 24) | (((int) (fArr[0] * 255.0f)) << 16) | (((int) (fArr[1] * 255.0f)) << 8);
    }

    public static int g(float[] fArr, int i) {
        return ((int) (fArr[i] * 255.0f)) | (((((((int) (fArr[i + 3] * 255.0f)) << 8) | ((int) (fArr[i + 2] * 255.0f))) << 8) | ((int) (fArr[i + 1] * 255.0f))) << 8);
    }

    public static float h(int i) {
        return ((i >> 24) & 255) / 255.0f;
    }

    public static int[] i(int i, int i2, int i3, int i4, int[][] iArr) {
        if (iArr == null) {
            iArr = new int[1][];
        }
        int[] iArr2 = iArr[0];
        if (iArr2 == null || iArr2.length != (i2 + i4) * i3) {
            AbstractC0441Bk1.a("## allocating buffer 0");
            iArr[0] = new int[(i2 + i4) * i3];
        }
        int[] iArr3 = iArr[0];
        IntBuffer intBufferWrap = IntBuffer.wrap(iArr3);
        intBufferWrap.position(0);
        GLES20.glReadPixels(i, 0, i3, i2 + i4, 6408, 5121, intBufferWrap);
        return iArr3;
    }

    public static void j(float[] fArr, float[] fArr2) {
        l(fArr, fArr2, 360.0f);
    }

    public static int k(float[] fArr) {
        int iRound;
        int iRound2;
        int iRound3;
        float f = fArr[0] * 360.0f;
        float f2 = fArr[1];
        float f3 = fArr[2];
        float fAbs = (1.0f - Math.abs((f3 * 2.0f) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * fAbs);
        float fAbs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        switch (((int) f) / 60) {
            case 0:
                iRound = Math.round((fAbs + f4) * 255.0f);
                iRound2 = Math.round((fAbs2 + f4) * 255.0f);
                iRound3 = Math.round(f4 * 255.0f);
                break;
            case 1:
                iRound = Math.round((fAbs2 + f4) * 255.0f);
                iRound2 = Math.round((fAbs + f4) * 255.0f);
                iRound3 = Math.round(f4 * 255.0f);
                break;
            case 2:
                iRound = Math.round(f4 * 255.0f);
                iRound2 = Math.round((fAbs + f4) * 255.0f);
                iRound3 = Math.round((fAbs2 + f4) * 255.0f);
                break;
            case 3:
                iRound = Math.round(f4 * 255.0f);
                iRound2 = Math.round((fAbs2 + f4) * 255.0f);
                iRound3 = Math.round((fAbs + f4) * 255.0f);
                break;
            case 4:
                iRound = Math.round((fAbs2 + f4) * 255.0f);
                iRound2 = Math.round(f4 * 255.0f);
                iRound3 = Math.round((fAbs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                iRound = Math.round((fAbs + f4) * 255.0f);
                iRound2 = Math.round(f4 * 255.0f);
                iRound3 = Math.round((fAbs2 + f4) * 255.0f);
                break;
            default:
                iRound = 0;
                iRound3 = 0;
                iRound2 = 0;
                break;
        }
        return (((int) (fArr[3] * 255.0f)) << 24) | (Color.rgb(c(iRound, 0, 255), c(iRound2, 0, 255), c(iRound3, 0, 255)) & 16777215);
    }

    public static void l(float[] fArr, float[] fArr2, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6 = fArr[0] * f;
        float f7 = fArr[1];
        float f8 = fArr[2];
        float fAbs = (1.0f - Math.abs((f8 * 2.0f) - 1.0f)) * f7;
        float f9 = f8 - (0.5f * fAbs);
        float fAbs2 = (1.0f - Math.abs(((f6 / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        switch (((int) f6) / 60) {
            case 0:
                f2 = fAbs2 + f9;
                f3 = f9;
                f9 = fAbs + f9;
                f4 = f2;
                break;
            case 1:
                f4 = fAbs + f9;
                f5 = fAbs2 + f9;
                f3 = f9;
                f9 = f5;
                break;
            case 2:
                f4 = fAbs + f9;
                f3 = fAbs2 + f9;
                break;
            case 3:
                f2 = fAbs2 + f9;
                f3 = fAbs + f9;
                f4 = f2;
                break;
            case 4:
                float f10 = fAbs + f9;
                f4 = f9;
                f9 = fAbs2 + f9;
                f3 = f10;
                break;
            case 5:
            case 6:
                f3 = fAbs2 + f9;
                f5 = fAbs + f9;
                f4 = f9;
                f9 = f5;
                break;
            default:
                f9 = 0.0f;
                f4 = 0.0f;
                f3 = 0.0f;
                break;
        }
        fArr2[0] = f9;
        fArr2[1] = f4;
        fArr2[2] = f3;
        fArr2[3] = fArr[3];
    }

    public static int m(float[] fArr) {
        return (((int) (fArr[3] * 255.0f)) << 24) | (AbstractC6338ln.a(fArr) & 16777215);
    }

    public static void n(float[] fArr, int i) {
        o(fArr, 0, i);
    }

    public static void o(float[] fArr, int i, int i2) {
        fArr[i + 3] = ((i2 >> 24) & 255) / 255.0f;
        fArr[i] = ((i2 >> 16) & 255) / 255.0f;
        fArr[i + 1] = ((i2 >> 8) & 255) / 255.0f;
        fArr[i + 2] = (i2 & 255) / 255.0f;
    }

    public static void p(float[] fArr, int i) {
        AbstractC6338ln.b((i >> 16) & 255, (i >> 8) & 255, i & 255, fArr);
        fArr[0] = fArr[0] * 0.0027777778f;
        fArr[3] = ((i >> 24) & 255) / 255.0f;
    }

    public static void q(float[] fArr, int i) {
        AbstractC6338ln.b((i >> 16) & 255, (i >> 8) & 255, i & 255, fArr);
        fArr[3] = ((i >> 24) & 255) / 255.0f;
    }

    public static void r(int[] iArr, int i, int i2) {
        iArr[i + 3] = (i2 >> 24) & 255;
        iArr[i] = (i2 >> 16) & 255;
        iArr[i + 1] = (i2 >> 8) & 255;
        iArr[i + 2] = i2 & 255;
    }

    public static int s(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        return iGlCreateShader;
    }

    public static int t(int i, int i2) {
        return (i & 16777215) | (i2 << 24);
    }
}
