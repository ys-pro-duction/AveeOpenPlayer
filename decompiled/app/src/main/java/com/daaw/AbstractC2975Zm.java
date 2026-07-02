package com.daaw;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.daaw.Zm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2975Zm {
    public static int a(int i, int i2, int i3) {
        return i + (i2 * i3);
    }

    public static int b(int[] iArr, int[] iArr2) {
        return Math.max(Math.max(Math.abs(iArr[0] - iArr2[0]), Math.abs(iArr[1] - iArr2[1])), Math.abs(iArr[2] - iArr2[2]));
    }

    public static int c(int[] iArr) {
        int[] iArr2 = new int[4];
        int[] iArr3 = {0, 0, 0, 0};
        for (int i : iArr) {
            VT.r(iArr2, 0, i);
            iArr3[0] = iArr3[0] + iArr2[0];
            iArr3[1] = iArr3[1] + iArr2[1];
            iArr3[2] = iArr3[2] + iArr2[2];
            iArr3[3] = iArr3[3] + iArr2[3];
        }
        iArr3[0] = iArr3[0] / iArr.length;
        iArr3[1] = iArr3[1] / iArr.length;
        iArr3[2] = iArr3[2] / iArr.length;
        iArr3[3] = iArr3[3] / iArr.length;
        int i2 = -16711936;
        int i3 = 999999;
        for (int i4 : iArr) {
            VT.r(iArr2, 0, i4);
            int iB = b(iArr2, iArr3);
            if (iB < i3) {
                i2 = i4;
                i3 = iB;
            }
        }
        return i2;
    }

    public static Bitmap d(Bitmap bitmap, C6265lY c6265lY, C7027oF0 c7027oF0, C7027oF0 c7027oF02) {
        Bitmap bitmap2;
        char c;
        char c2;
        if (c6265lY == null) {
            return bitmap;
        }
        int width = bitmap.getWidth() * bitmap.getHeight();
        Object obj = c7027oF02.a;
        if (obj == null || ((int[]) obj).length < width) {
            try {
                c7027oF02.a = new int[width];
            } catch (Exception unused) {
                return bitmap;
            }
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config == config2) {
            Object obj2 = c7027oF0.a;
            if (obj2 == null || ((Bitmap) obj2).getWidth() != bitmap.getWidth() || ((Bitmap) c7027oF0.a).getHeight() != bitmap.getHeight()) {
                Object obj3 = c7027oF0.a;
                if (obj3 != null) {
                    ((Bitmap) obj3).recycle();
                }
                c7027oF0.a = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config2);
            }
            bitmap.getPixels((int[]) c7027oF02.a, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
            bitmap2 = bitmap;
        } else {
            bitmap2 = bitmap;
            try {
                c7027oF0.a = bitmap2.copy(config2, true);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                ((Bitmap) c7027oF0.a).getPixels((int[]) c7027oF02.a, 0, bitmap2.getWidth(), 0, 0, bitmap2.getWidth(), bitmap2.getHeight());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        int iC = c6265lY.a;
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int i = 0;
        if (c6265lY.b) {
            int width2 = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int i2 = width2 - 1;
            c = 2;
            int i3 = height - 1;
            c2 = 1;
            int i4 = width2 / 2;
            int i5 = height / 2;
            iC = c(new int[]{((int[]) c7027oF02.a)[a(0, 0, width2)], ((int[]) c7027oF02.a)[a(i2, 0, width2)], ((int[]) c7027oF02.a)[a(i2, i3, width2)], ((int[]) c7027oF02.a)[a(0, i3, width2)], ((int[]) c7027oF02.a)[a(i4, 0, width2)], ((int[]) c7027oF02.a)[a(i2, i5, width2)], ((int[]) c7027oF02.a)[a(i4, i3, width2)], ((int[]) c7027oF02.a)[a(0, i5, width2)]});
        } else {
            c = 2;
            c2 = 1;
        }
        VT.p(fArr, iC);
        VT.r(iArr, 0, iC);
        int[] iArr3 = {128 - iArr[0], 128 - iArr[c2], 128 - iArr[c], 255 - iArr[3]};
        int i6 = 0;
        while (i6 < width) {
            int i7 = ((int[]) c7027oF02.a)[i6];
            VT.r(iArr2, i, i7);
            VT.p(fArr2, i7);
            float fMin = Math.min(Math.abs(fArr2[i] - fArr[i]) * 5.0f, 1.0f);
            Math.min(Math.abs(fArr2[c2] - fArr[c2]) * 1.0f, 1.0f);
            float fMin2 = 1.0f - Math.min(1.0f, (((int) (Math.max(Math.min(Math.abs(fArr2[c] - fArr[c]) * 2.0f, 1.0f), fMin) * 255.0f)) / 255.0f) * 1.0f);
            float fPow = 1.0f - ((float) Math.pow(1.0f - ((float) Math.pow(r6, c6265lY.c * 2.0f)), c6265lY.d * 2.0f));
            int i8 = iArr2[0] + ((int) (iArr3[0] * fMin2));
            iArr2[0] = i8;
            int i9 = iArr2[c2] + ((int) (iArr3[c2] * fMin2));
            iArr2[c2] = i9;
            int i10 = iArr2[c] + ((int) (iArr3[c] * fMin2));
            iArr2[c] = i10;
            int i11 = (int) (255.0f * fPow);
            iArr2[3] = i11;
            int i12 = (int) (i8 * fPow);
            iArr2[0] = i12;
            int i13 = (int) (i9 * fPow);
            iArr2[c2] = i13;
            int i14 = (int) (i10 * fPow);
            iArr2[c] = i14;
            if (i12 < 0) {
                iArr2[0] = 0;
            }
            if (i13 < 0) {
                iArr2[c2] = 0;
            }
            if (i14 < 0) {
                iArr2[c] = 0;
            }
            if (i11 < 0) {
                iArr2[3] = 0;
            }
            if (iArr2[0] > 255) {
                iArr2[0] = 255;
            }
            if (iArr2[c2] > 255) {
                iArr2[c2] = 255;
            }
            if (iArr2[c] > 255) {
                iArr2[c] = 255;
            }
            if (iArr2[3] > 255) {
                iArr2[3] = 255;
            }
            ((int[]) c7027oF02.a)[i6] = VT.a(iArr2);
            i6++;
            i = 0;
        }
        ((Bitmap) c7027oF0.a).setPixels((int[]) c7027oF02.a, 0, bitmap2.getWidth(), 0, 0, bitmap2.getWidth(), bitmap2.getHeight());
        return (Bitmap) c7027oF0.a;
    }
}
