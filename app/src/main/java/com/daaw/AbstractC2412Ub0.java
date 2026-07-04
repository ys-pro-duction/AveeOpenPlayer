package com.daaw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.Ub0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2412Ub0 extends AbstractC4424f {
    public int L;
    public Paint M;
    public Paint N;
    public Paint O;
    public AbstractC4654fn P;

    public AbstractC2412Ub0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = AbstractC8874us0.c().a();
        this.N = AbstractC8874us0.c().a();
        this.O = AbstractC8874us0.c().b(-1).f(PorterDuff.Mode.CLEAR).a();
    }

    @Override // com.daaw.AbstractC4424f
    public void b(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        float[] fArr = new float[3];
        Color.colorToHSV(this.L, fArr);
        int iMax = Math.max(2, width / PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        int i = 0;
        while (i <= width) {
            float f = i;
            fArr[2] = f / (width - 1);
            this.M.setColor(Color.HSVToColor(fArr));
            i += iMax;
            canvas.drawRect(f, 0.0f, i, height, this.M);
        }
    }

    @Override // com.daaw.AbstractC4424f
    public void c(Canvas canvas, float f, float f2) {
        this.N.setColor(AbstractC0509Cb1.c(this.L, this.I));
        if (this.J) {
            canvas.drawCircle(f, f2, this.G, this.O);
        }
        canvas.drawCircle(f, f2, this.G * 0.75f, this.N);
    }

    @Override // com.daaw.AbstractC4424f
    public void f(float f) {
        AbstractC4654fn abstractC4654fn = this.P;
        if (abstractC4654fn != null) {
            abstractC4654fn.setLightness(f);
        }
    }

    public void setColor(int i) {
        this.L = i;
        this.I = AbstractC0509Cb1.f(i);
        if (this.D != null) {
            g();
            invalidate();
        }
    }

    public void setColorPicker(AbstractC4654fn abstractC4654fn) {
        this.P = abstractC4654fn;
    }
}
