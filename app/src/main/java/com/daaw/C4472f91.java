package com.daaw;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: com.daaw.f91, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4472f91 extends MetricAffectingSpan {
    public final Typeface a;

    public C4472f91(Typeface typeface) {
        G10.g(typeface, "typeface");
        this.a = typeface;
    }

    public final void a(Paint paint) {
        paint.setTypeface(this.a);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        G10.g(textPaint, "ds");
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        G10.g(textPaint, "paint");
        a(textPaint);
    }
}
