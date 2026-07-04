package com.daaw;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;

/* JADX INFO: renamed from: com.daaw.us0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8874us0 {

    /* JADX INFO: renamed from: com.daaw.us0$b */
    public static class b {
        public Paint a;

        public Paint a() {
            return this.a;
        }

        public b b(int i) {
            this.a.setColor(i);
            return this;
        }

        public b c(Shader shader) {
            this.a.setShader(shader);
            return this;
        }

        public b d(float f) {
            this.a.setStrokeWidth(f);
            return this;
        }

        public b e(Paint.Style style) {
            this.a.setStyle(style);
            return this;
        }

        public b f(PorterDuff.Mode mode) {
            this.a.setXfermode(new PorterDuffXfermode(mode));
            return this;
        }

        public b() {
            this.a = new Paint(1);
        }
    }

    public static Bitmap a(int i) {
        Paint paintA = c().a();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int iRound = Math.round(i / 2.0f);
        for (int i2 = 0; i2 < 2; i2++) {
            for (int i3 = 0; i3 < 2; i3++) {
                if ((i2 + i3) % 2 == 0) {
                    paintA.setColor(-1);
                } else {
                    paintA.setColor(-3092272);
                }
                canvas.drawRect(i2 * iRound, i3 * iRound, (i2 + 1) * iRound, r10 * iRound, paintA);
            }
        }
        return bitmapCreateBitmap;
    }

    public static Shader b(int i) {
        Bitmap bitmapA = a(Math.max(8, (i / 2) * 2));
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        return new BitmapShader(bitmapA, tileMode, tileMode);
    }

    public static b c() {
        return new b();
    }
}
