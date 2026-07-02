package com.daaw;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: com.daaw.vb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9075vb0 extends MetricAffectingSpan {
    public final float a;

    public C9075vb0(float f) {
        this.a = f;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        G10.g(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        G10.g(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.a);
    }
}
