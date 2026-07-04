package com.daaw;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: renamed from: com.daaw.gR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4833gR0 {
    public static final int[] i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};
    public static final int[] k = new int[4];
    public static final float[] l = {0.0f, 0.0f, 0.5f, 1.0f};
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public int d;
    public int e;
    public int f;
    public final Path g;
    public final Paint h;

    public C4833gR0() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i2, float f, float f2) {
        float f3;
        boolean z = f2 < 0.0f;
        Path path = this.g;
        if (z) {
            int[] iArr = k;
            iArr[0] = 0;
            iArr[1] = this.f;
            iArr[2] = this.e;
            iArr[3] = this.d;
            f3 = f;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f3 = f;
            path.arcTo(rectF, f3, f2);
            path.close();
            float f4 = -i2;
            rectF.inset(f4, f4);
            int[] iArr2 = k;
            iArr2[0] = 0;
            iArr2[1] = this.d;
            iArr2[2] = this.e;
            iArr2[3] = this.f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f5 = 1.0f - (i2 / fWidth);
        float[] fArr = l;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        this.b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.h);
        }
        canvas.drawArc(rectF, f3, f2, true, this.b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i2) {
        rectF.bottom += i2;
        rectF.offset(0.0f, -i2);
        int[] iArr = i;
        iArr[0] = this.f;
        iArr[1] = this.e;
        iArr[2] = this.d;
        Paint paint = this.c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.c);
        canvas.restore();
    }

    public Paint c() {
        return this.a;
    }

    public void d(int i2) {
        this.d = AbstractC6338ln.o(i2, 68);
        this.e = AbstractC6338ln.o(i2, 20);
        this.f = AbstractC6338ln.o(i2, 0);
        this.a.setColor(this.d);
    }

    public C4833gR0(int i2) {
        this.g = new Path();
        Paint paint = new Paint();
        this.h = paint;
        this.a = new Paint();
        d(i2);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint2);
    }
}
