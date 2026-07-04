package com.daaw;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public class CV0 {
    public static Bitmap i = Bitmap.createBitmap(1024, 1024, Bitmap.Config.ARGB_8888);
    public static final char[] j = {61451, 7838};
    public final C9398wk[] a;
    public C5718jc1 b;
    public C1036Hb c;
    public SparseArray d;
    public C1458Lc1 e;
    public int f;
    public int g;
    public boolean h;

    public class a {
        public float a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;

        public a() {
        }
    }

    public CV0(Typeface typeface, int i2, C9398wk... c9398wkArr) {
        this.h = true;
        this.a = c9398wkArr;
        try {
            e(typeface, i2);
        } catch (Exception e) {
            AbstractC0441Bk1.b(e, "failed to create SpriteFont");
            this.h = false;
        }
        if (f()) {
            return;
        }
        try {
            e(typeface, i2 / 2);
        } catch (Exception e2) {
            AbstractC0441Bk1.b(e2, "failed to create SpriteFont");
            this.h = false;
        }
        if (f()) {
            return;
        }
        AbstractC0441Bk1.c("failed to create SpriteFont");
    }

    public static int g(int i2) {
        return AbstractC0405Bb1.s(i2, 4096);
    }

    public void a() {
        this.c.a();
    }

    public float b() {
        return this.f;
    }

    public IW c() {
        return this.c;
    }

    public a d(char c) {
        SparseArray sparseArray = this.d;
        return (a) sparseArray.get(c, (a) sparseArray.valueAt(0));
    }

    public final void e(Typeface typeface, int i2) {
        int i3;
        int i4 = 1;
        int i5 = 0;
        int length = j.length;
        for (C9398wk c9398wk : this.a) {
            length += c9398wk.a();
        }
        char[] cArr = new char[length];
        int i6 = 0;
        for (C9398wk c9398wk2 : this.a) {
            for (int i7 = 0; i7 < c9398wk2.c; i7++) {
                cArr[i6] = c9398wk2.m(i7);
                i6++;
            }
        }
        for (char c : j) {
            cArr[i6] = c;
            i6++;
        }
        this.h = true;
        Paint paint = new Paint();
        paint.setTypeface(typeface);
        paint.setTextSize(i2);
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setTextAlign(Paint.Align.LEFT);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i8 = fontMetricsInt.top;
        int i9 = fontMetricsInt.ascent;
        int i10 = fontMetricsInt.descent;
        int i11 = fontMetricsInt.bottom;
        this.g = i11 - i8;
        this.f = i10 - i9;
        this.d = new SparseArray(length);
        int iCeil = ((int) Math.ceil(Math.sqrt(length))) * (this.g + 1);
        int iG = g(iCeil);
        int iG2 = g(iCeil);
        Bitmap bitmapCreateBitmap = null;
        try {
            int iG3 = g(iG);
            int iG4 = g(iG2);
            AbstractC0441Bk1.c("Creating bitmap atlas for fonts, W:" + iG3 + " H: " + iG4);
            if (iG4 > 1024 || iG3 > 1024) {
                bitmapCreateBitmap = Bitmap.createBitmap(iG3, iG4, Bitmap.Config.ARGB_8888);
            } else {
                bitmapCreateBitmap = i;
                bitmapCreateBitmap.eraseColor(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
        Bitmap bitmap = bitmapCreateBitmap;
        if (bitmap == null) {
            this.h = false;
            AbstractC0441Bk1.c("failed to create bitmap W:" + g(iG) + " H: " + g(iG2));
            return;
        }
        Canvas canvas = new Canvas(bitmap);
        float[] fArr = new float[length];
        if (paint.getTextWidths(cArr, 0, length, fArr) < length) {
            AbstractC0441Bk1.c("widthsReturned < charWidths.length");
        }
        int iAbs = Math.abs(i8);
        canvas.drawColor(0);
        int i12 = 0;
        int width = 0;
        while (i12 < length) {
            a aVar = new a();
            int i13 = i11;
            char[] cArr2 = new char[i4];
            cArr2[i5] = cArr[i12];
            float f = fArr[i12];
            int i14 = i12;
            Rect rect = new Rect();
            paint.getTextBounds(cArr2, i5, i4, rect);
            if (width + rect.width() >= bitmap.getWidth()) {
                iAbs += this.g;
                i3 = 0;
            } else {
                i3 = width;
            }
            char[] cArr3 = cArr;
            Paint paint2 = paint;
            canvas.drawText(cArr2, 0, 1, i3 - rect.left, iAbs, paint2);
            aVar.a = i3;
            aVar.b = iAbs - Math.abs(i8);
            aVar.c = rect.width();
            aVar.d = this.g;
            aVar.e = rect.left;
            aVar.f = i13;
            aVar.g = f;
            aVar.h = this.f;
            this.d.append(cArr3[i14], aVar);
            width = i3 + rect.width() + 2;
            i12 = i14 + 1;
            i11 = i13;
            paint = paint2;
            fArr = fArr;
            cArr = cArr3;
            i4 = 1;
            i5 = 0;
        }
        int i15 = i11;
        if (iAbs != 0) {
            width = bitmap.getWidth();
        }
        int iAbs2 = iAbs + Math.abs(i15) + 1;
        int iG5 = g(width);
        int iG6 = g(iAbs2);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap, 0, 0, iG5, iG6);
        this.e = new C1458Lc1(iG5, iG6);
        this.b = new C5718jc1(bitmapCreateBitmap2, 9729, 9729, 10497, false);
        this.c = new C1036Hb(this.b, true);
        if (bitmapCreateBitmap2 != bitmap) {
            bitmapCreateBitmap2.recycle();
        }
        if (i != bitmap) {
            bitmap.recycle();
        }
    }

    public boolean f() {
        return this.h;
    }

    public C1458Lc1 h() {
        return this.e;
    }
}
