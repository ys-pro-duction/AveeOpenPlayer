package com.daaw;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: com.daaw.Oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1775Oe extends MetricAffectingSpan {
    public final float a;

    public C1775Oe(float f) {
        this.a = f;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        G10.g(textPaint, "textPaint");
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        G10.g(textPaint, "textPaint");
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.a);
    }
}
