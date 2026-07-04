package com.daaw;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: com.daaw.aG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3106aG extends ReplacementSpan {
    public final Z81 b;
    public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();
    public short c = -1;
    public short d = -1;
    public float e = 1.0f;

    public AbstractC3106aG(Z81 z81) {
        AbstractC8621ty0.h(z81, "rasterizer cannot be null");
        this.b = z81;
    }

    public final Z81 a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.a);
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        this.e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.b.e();
        this.d = (short) (this.b.e() * this.e);
        short sI = (short) (this.b.i() * this.e);
        this.c = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
