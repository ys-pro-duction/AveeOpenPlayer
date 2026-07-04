package com.daaw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class P3 extends AbstractC4424f {
    public int L;
    public Paint M;
    public Paint N;
    public Paint O;
    public Paint P;
    public Paint Q;
    public Bitmap R;
    public Canvas S;
    public AbstractC4654fn T;

    public P3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = AbstractC8874us0.c().a();
        this.N = AbstractC8874us0.c().a();
        this.O = AbstractC8874us0.c().a();
        this.P = AbstractC8874us0.c().b(-1).f(PorterDuff.Mode.CLEAR).a();
        this.Q = AbstractC8874us0.c().a();
    }

    @Override // com.daaw.AbstractC4424f
    public void a() {
        super.a();
        this.M.setShader(AbstractC8874us0.b(this.H * 2));
        this.R = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        this.S = new Canvas(this.R);
    }

    @Override // com.daaw.AbstractC4424f
    public void b(Canvas canvas) {
        int width = canvas.getWidth();
        float height = canvas.getHeight();
        canvas.drawRect(0.0f, 0.0f, width, height, this.M);
        int iMax = Math.max(2, width / PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        int i = 0;
        while (i <= width) {
            float f = i;
            this.N.setColor(this.L);
            this.N.setAlpha(Math.round((f / (width - 1)) * 255.0f));
            i += iMax;
            float f2 = height;
            canvas.drawRect(f, 0.0f, i, f2, this.N);
            height = f2;
        }
    }

    @Override // com.daaw.AbstractC4424f
    public void c(Canvas canvas, float f, float f2) {
        this.O.setColor(this.L);
        this.O.setAlpha(Math.round(this.I * 255.0f));
        if (this.J) {
            canvas.drawCircle(f, f2, this.G, this.P);
        }
        if (this.I >= 1.0f) {
            canvas.drawCircle(f, f2, this.G * 0.75f, this.O);
            return;
        }
        Canvas canvas2 = this.S;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas2.drawColor(0, mode);
        this.S.drawCircle(f, f2, (this.G * 0.75f) + 4.0f, this.M);
        this.S.drawCircle(f, f2, (this.G * 0.75f) + 4.0f, this.O);
        Paint paintA = AbstractC8874us0.c().b(-1).e(Paint.Style.STROKE).d(6.0f).f(mode).a();
        this.Q = paintA;
        this.S.drawCircle(f, f2, (this.G * 0.75f) + (paintA.getStrokeWidth() / 2.0f), this.Q);
        canvas.drawBitmap(this.R, 0.0f, 0.0f, (Paint) null);
    }

    @Override // com.daaw.AbstractC4424f
    public void f(float f) {
        AbstractC4654fn abstractC4654fn = this.T;
        if (abstractC4654fn != null) {
            abstractC4654fn.setAlphaValue(f);
        }
    }

    public void setColor(int i) {
        this.L = i;
        this.I = AbstractC0509Cb1.d(i);
        if (this.D != null) {
            g();
            invalidate();
        }
    }

    public void setColorPicker(AbstractC4654fn abstractC4654fn) {
        this.T = abstractC4654fn;
    }
}
