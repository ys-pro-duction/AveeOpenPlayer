package com.daaw;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public class FT0 extends MetricAffectingSpan {
    public final float a;

    public FT0(float f) {
        this.a = f;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        G10.g(textPaint, "textPaint");
        textPaint.setTextSkewX(this.a + textPaint.getTextSkewX());
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        G10.g(textPaint, "textPaint");
        textPaint.setTextSkewX(this.a + textPaint.getTextSkewX());
    }
}
