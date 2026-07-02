package com.daaw;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: com.daaw.xO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9579xO extends MetricAffectingSpan {
    public final String a;

    public C9579xO(String str) {
        G10.g(str, "fontFeatureSettings");
        this.a = str;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        G10.g(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        G10.g(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.a);
    }
}
