package com.daaw;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: com.daaw.wb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9354wb0 extends MetricAffectingSpan {
    public final float a;

    public C9354wb0(float f) {
        this.a = f;
    }

    public final void a(TextPaint textPaint) {
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.a / textSize);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        G10.g(textPaint, "textPaint");
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        G10.g(textPaint, "textPaint");
        a(textPaint);
    }
}
