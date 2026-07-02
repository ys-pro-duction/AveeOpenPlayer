package com.daaw;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: renamed from: com.daaw.Zb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2932Zb0 implements LineHeightSpan {
    public final float a;

    public C2932Zb0(float f) {
        this.a = f;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        G10.g(charSequence, "text");
        G10.g(fontMetricsInt, "fontMetricsInt");
        int iA = AbstractC3754cc0.a(fontMetricsInt);
        if (iA <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(this.a);
        int iCeil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((iCeil * 1.0f) / iA)));
        fontMetricsInt.descent = iCeil2;
        fontMetricsInt.ascent = iCeil2 - iCeil;
    }
}
