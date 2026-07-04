package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: com.daaw.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4424f extends View {
    public Bitmap B;
    public Canvas C;
    public Bitmap D;
    public Canvas E;
    public int F;
    public int G;
    public int H;
    public float I;
    public boolean J;
    public boolean K;

    public AbstractC4424f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = 20;
        this.H = 5;
        this.I = 1.0f;
        this.J = false;
        this.K = false;
        e(context, attributeSet);
    }

    public void a() {
        int width;
        int height;
        if (this.K) {
            width = getHeight();
            height = getWidth();
        } else {
            width = getWidth();
            height = getHeight();
        }
        int iMax = Math.max(width - (this.F * 2), 1);
        int i = this.H;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.D = Bitmap.createBitmap(iMax, i, config);
        this.E = new Canvas(this.D);
        Bitmap bitmap = this.B;
        if (bitmap != null && bitmap.getWidth() == width && this.B.getHeight() == height) {
            return;
        }
        Bitmap bitmap2 = this.B;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.B = Bitmap.createBitmap(width, height, config);
        this.C = new Canvas(this.B);
    }

    public abstract void b(Canvas canvas);

    public abstract void c(Canvas canvas, float f, float f2);

    public int d(int i) {
        return getResources().getDimensionPixelSize(i);
    }

    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, UD0.a, 0, 0);
        try {
            this.K = typedArrayObtainStyledAttributes.getBoolean(UD0.b, this.K);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public abstract void f(float f);

    public void g() {
        this.G = d(XC0.b);
        this.H = d(XC0.a);
        this.F = this.G;
        if (this.D == null) {
            a();
        }
        b(this.E);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int height;
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.K) {
            width = getHeight();
            height = getWidth();
            canvas.rotate(-90.0f);
            canvas.translate(-width, 0.0f);
        } else {
            width = getWidth();
            height = getHeight();
        }
        if (this.D == null || (canvas2 = this.C) == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        this.C.drawBitmap(this.D, this.F, (height - r4.getHeight()) / 2, (Paint) null);
        c(this.C, this.G + (this.I * (width - (r3 * 2))), height / 2.0f);
        canvas.drawBitmap(this.B, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        if (mode != 0) {
            i = (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.getSize(i) : 0;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 != 0) {
            i2 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? View.MeasureSpec.getSize(i2) : 0;
        }
        setMeasuredDimension(i, i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == 0) goto L16
            if (r0 == r1) goto Ld
            r2 = 2
            if (r0 == r2) goto L16
            goto L5a
        Ld:
            float r4 = r3.I
            r3.f(r4)
            r3.invalidate()
            goto L5a
        L16:
            android.graphics.Bitmap r0 = r3.D
            if (r0 == 0) goto L5a
            boolean r0 = r3.K
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L35
            float r4 = r4.getY()
            int r0 = r3.F
            float r0 = (float) r0
            float r4 = r4 - r0
            android.graphics.Bitmap r0 = r3.D
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r4 = r4 / r0
            float r4 = r2 - r4
            r3.I = r4
            goto L47
        L35:
            float r4 = r4.getX()
            int r0 = r3.F
            float r0 = (float) r0
            float r4 = r4 - r0
            android.graphics.Bitmap r0 = r3.D
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r4 = r4 / r0
            r3.I = r4
        L47:
            float r4 = r3.I
            float r4 = java.lang.Math.min(r4, r2)
            r0 = 0
            float r4 = java.lang.Math.max(r0, r4)
            r3.I = r4
            r3.f(r4)
            r3.invalidate()
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC4424f.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setShowBorder(boolean z) {
        this.J = z;
    }

    public void setOnValueChangedListener(InterfaceC0889Fq0 interfaceC0889Fq0) {
    }
}
