package com.daaw;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class XS0 {
    public static ThreadLocal a = new ThreadLocal();

    public static Bitmap a(int i, int i2, int i3, int i4, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap;
        int i5 = !AbstractC0405Bb1.b(i) ? i + 1 : i;
        int i6 = !AbstractC0405Bb1.b(i2) ? i2 + 1 : i2;
        if (bitmap != null && bitmap.getWidth() == i5 && bitmap.getHeight() == i6) {
            bitmapCreateBitmap = bitmap;
        } else {
            if (bitmap != null) {
                bitmap.recycle();
            }
            bitmapCreateBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
        }
        byte[] bArr = new byte[i5 * i6 * 4];
        float fL = C1458Lc1.l(i5 / 2, i6 / 2);
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        VT.q(fArr, i3);
        VT.q(fArr2, i4);
        float[] fArr3 = {0.0f, fArr[1], fArr[2], fArr[3]};
        for (int i7 = 0; i7 < i6; i7++) {
            for (int i8 = 0; i8 < i5; i8++) {
                float fMin = Math.min(1.0f, C1458Lc1.l(r3 - i8, r5 - i7) / fL);
                float f = fMin * fMin;
                float f2 = 1.0f - f;
                if (Math.abs(fArr[0] - fArr2[0]) > 180.0f) {
                    float f3 = fArr[0];
                    if (f3 < 180.0f) {
                        fArr[0] = f3 + 360.0f;
                    }
                    fArr2[0] = fArr2[0] + 360.0f;
                }
                fArr3[0] = (fArr[0] * f2) + (fArr2[0] * f);
                bitmapCreateBitmap.setPixel(i8, i7, VT.m(fArr3));
            }
        }
        return bitmapCreateBitmap;
    }

    public static void b(Paint paint, float f, float f2, String str, int i) {
        paint.setTextSize(48.0f);
        paint.getTextBounds(str, 0, str.length(), new Rect());
        paint.setTextSize(Math.min((f * 48.0f) / r1.width(), (f2 * 48.0f) / (r1.height() * i)));
    }

    public static Bitmap c(int i, int i2, String str, int i3, int i4, int i5, Drawable drawable) {
        return d(Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888), i, i2, str, i3, i4, i5, drawable, null);
    }

    public static Bitmap d(Bitmap bitmap, int i, int i2, String str, int i3, int i4, int i5, Drawable drawable, Bitmap bitmap2) {
        ArrayList<String> arrayList = new ArrayList();
        String[] strArrSplit = str.split("\\s+");
        int i6 = 0;
        int i7 = 0;
        while (i6 < strArrSplit.length) {
            int length = strArrSplit[i6].length();
            String str2 = strArrSplit[i6];
            i6++;
            if (i6 < strArrSplit.length && strArrSplit[i6].length() == 1) {
                length += 2;
                String str3 = strArrSplit[i6];
            }
            if (length > i7) {
                i7 = length;
            }
        }
        String str4 = "";
        arrayList.add("");
        int i8 = 0;
        for (String str5 : strArrSplit) {
            int length2 = str5.length();
            if (length2 > 0) {
                int i9 = i8 + length2;
                if (i9 > i7) {
                    arrayList.add(str5);
                    i8 = length2;
                } else if (i8 > 0) {
                    arrayList.set(arrayList.size() - 1, ((String) arrayList.get(arrayList.size() - 1)) + " " + str5);
                    i8 += length2 + 1;
                } else {
                    arrayList.set(arrayList.size() - 1, str5);
                    i8 = i9;
                }
            }
        }
        int i10 = 0;
        for (String str6 : arrayList) {
            int length3 = str6.length();
            if (length3 > i10) {
                str4 = str6;
                i10 = length3;
            }
        }
        Paint paint = new Paint();
        paint.setColor(i3);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        int iMin = Math.min(i, i2);
        float f = iMin - (iMin / 11);
        b(paint, (1.0f - Math.max(0.0f, Math.min((arrayList.size() - 1) * 0.04f, 0.4f))) * f, f * 0.9f, str4, arrayList.size());
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Bitmap bitmapA = a(i / 8, i2 / 8, i4, i5, (Bitmap) a.get());
        if (bitmapA != null) {
            Paint paint2 = new Paint();
            paint2.setAlpha(Color.alpha(i4));
            paint2.setAntiAlias(true);
            paint2.setFilterBitmap(true);
            canvas.drawBitmap(bitmapA, (Rect) null, new RectF(0.0f, 0.0f, i, i2), paint2);
        }
        a.set(bitmapA);
        float f2 = paint.getFontMetrics().leading;
        float f3 = -(paint.descent() + paint.ascent());
        float f4 = i * 0.5f;
        float f5 = (i2 * 0.5f) + ((-((arrayList.size() * f3) + (arrayList.size() - (f2 * 1.0f)))) * 0.5f) + (1.0f * f3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            canvas.drawText((String) it.next(), f4, f5, paint);
            f5 += f3 + f2;
        }
        return bitmap;
    }

    public static float e(char c) {
        char upperCase = Character.toUpperCase(c);
        if ((upperCase <= 'Z') && (upperCase >= 'A')) {
            return (upperCase - 'A') / 26.0f;
        }
        return 0.5f;
    }
}
