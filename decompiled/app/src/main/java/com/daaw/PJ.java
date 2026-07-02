package com.daaw;

import android.graphics.Bitmap;
import java.lang.reflect.Array;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PJ {
    public static Bitmap a(Bitmap bitmap, int i) {
        int i2;
        int i3 = i;
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), true);
        if (i3 < 1) {
            return null;
        }
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i4 = width * height;
        int[] iArr = new int[i4];
        bitmapCopy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i5 = width - 1;
        int i6 = height - 1;
        int i7 = i3 + i3;
        int i8 = i7 + 1;
        int[] iArr2 = new int[i4];
        int[] iArr3 = new int[i4];
        int[] iArr4 = new int[i4];
        int[] iArr5 = new int[Math.max(width, height)];
        int i9 = (i7 + 2) >> 1;
        int i10 = i9 * i9;
        int i11 = i10 * PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        int[] iArr6 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr6[i12] = i12 / i10;
        }
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i8, 3);
        int i13 = i3 + 1;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < height) {
            int[] iArr8 = iArr4;
            int i17 = -i3;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i17 <= i3) {
                int[] iArr9 = iArr6;
                Bitmap bitmap2 = bitmapCopy;
                int i27 = iArr[i15 + Math.min(i5, Math.max(i17, 0))];
                int[] iArr10 = iArr7[i17 + i3];
                iArr10[0] = (i27 & 16711680) >> 16;
                iArr10[1] = (i27 & 65280) >> 8;
                iArr10[2] = i27 & 255;
                int iAbs = i13 - Math.abs(i17);
                int i28 = iArr10[0];
                i18 += i28 * iAbs;
                int i29 = iArr10[1];
                i19 += i29 * iAbs;
                int i30 = iArr10[2];
                i20 += iAbs * i30;
                if (i17 > 0) {
                    i24 += i28;
                    i25 += i29;
                    i26 += i30;
                } else {
                    i21 += i28;
                    i22 += i29;
                    i23 += i30;
                }
                i17++;
                iArr6 = iArr9;
                bitmapCopy = bitmap2;
            }
            int[] iArr11 = iArr6;
            Bitmap bitmap3 = bitmapCopy;
            int i31 = i3;
            int i32 = 0;
            while (i32 < width) {
                iArr2[i15] = iArr11[i18];
                iArr3[i15] = iArr11[i19];
                iArr8[i15] = iArr11[i20];
                int i33 = i18 - i21;
                int i34 = i19 - i22;
                int i35 = i20 - i23;
                int[] iArr12 = iArr7[((i31 - i3) + i8) % i8];
                int i36 = i21 - iArr12[0];
                int i37 = i22 - iArr12[1];
                int i38 = i23 - iArr12[2];
                if (i14 == 0) {
                    i2 = i32;
                    iArr5[i2] = Math.min(i32 + i3 + 1, i5);
                } else {
                    i2 = i32;
                }
                int i39 = iArr[i16 + iArr5[i2]];
                int i40 = (i39 & 16711680) >> 16;
                iArr12[0] = i40;
                int i41 = (i39 & 65280) >> 8;
                iArr12[1] = i41;
                int i42 = i39 & 255;
                iArr12[2] = i42;
                int i43 = i24 + i40;
                int i44 = i25 + i41;
                int i45 = i26 + i42;
                i18 = i33 + i43;
                i19 = i34 + i44;
                i20 = i35 + i45;
                i31 = (i31 + 1) % i8;
                int[] iArr13 = iArr7[i31 % i8];
                int i46 = iArr13[0];
                i21 = i36 + i46;
                int i47 = iArr13[1];
                i22 = i37 + i47;
                int i48 = iArr13[2];
                i23 = i38 + i48;
                i24 = i43 - i46;
                i25 = i44 - i47;
                i26 = i45 - i48;
                i15++;
                i32 = i2 + 1;
            }
            i16 += width;
            i14++;
            iArr4 = iArr8;
            iArr6 = iArr11;
            bitmapCopy = bitmap3;
        }
        int[] iArr14 = iArr4;
        int[] iArr15 = iArr6;
        Bitmap bitmap4 = bitmapCopy;
        int i49 = 0;
        while (i49 < width) {
            int i50 = -i3;
            int i51 = i50 * width;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            while (i50 <= i3) {
                int iMax = Math.max(0, i51) + i49;
                int[] iArr16 = iArr7[i50 + i];
                iArr16[0] = iArr2[iMax];
                iArr16[1] = iArr3[iMax];
                iArr16[2] = iArr14[iMax];
                int iAbs2 = i13 - Math.abs(i50);
                i52 += iArr2[iMax] * iAbs2;
                i53 += iArr3[iMax] * iAbs2;
                i54 += iArr14[iMax] * iAbs2;
                if (i50 > 0) {
                    i58 += iArr16[0];
                    i59 += iArr16[1];
                    i60 += iArr16[2];
                } else {
                    i55 += iArr16[0];
                    i56 += iArr16[1];
                    i57 += iArr16[2];
                }
                if (i50 < i6) {
                    i51 += width;
                }
                i50++;
                i3 = i;
            }
            int i61 = i;
            int i62 = i49;
            int i63 = 0;
            while (i63 < height) {
                iArr[i62] = (iArr[i62] & (-16777216)) | (iArr15[i52] << 16) | (iArr15[i53] << 8) | iArr15[i54];
                int i64 = i52 - i55;
                int i65 = i53 - i56;
                int i66 = i54 - i57;
                int[] iArr17 = iArr7[((i61 - i) + i8) % i8];
                int i67 = i55 - iArr17[0];
                int i68 = i56 - iArr17[1];
                int i69 = i57 - iArr17[2];
                int i70 = i63;
                if (i49 == 0) {
                    iArr5[i70] = Math.min(i70 + i13, i6) * width;
                }
                int i71 = iArr5[i70] + i49;
                int i72 = iArr2[i71];
                iArr17[0] = i72;
                int i73 = iArr3[i71];
                iArr17[1] = i73;
                int i74 = iArr14[i71];
                iArr17[2] = i74;
                int i75 = i58 + i72;
                int i76 = i59 + i73;
                int i77 = i60 + i74;
                i52 = i64 + i75;
                i53 = i65 + i76;
                i54 = i66 + i77;
                i61 = (i61 + 1) % i8;
                int[] iArr18 = iArr7[i61];
                int i78 = iArr18[0];
                i55 = i67 + i78;
                int i79 = iArr18[1];
                i56 = i68 + i79;
                int i80 = iArr18[2];
                i57 = i69 + i80;
                i58 = i75 - i78;
                i59 = i76 - i79;
                i60 = i77 - i80;
                i62 += width;
                i63 = i70 + 1;
            }
            i49++;
            i3 = i;
        }
        bitmap4.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmap4;
    }
}
