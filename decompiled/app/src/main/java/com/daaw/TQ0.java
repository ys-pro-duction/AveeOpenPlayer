package com.daaw;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: loaded from: classes.dex */
public final class TQ0 extends CharacterStyle implements UpdateAppearance {
    public final SQ0 a;
    public C9879yT0 b;

    public TQ0(SQ0 sq0) {
        G10.g(sq0, "shaderBrush");
        this.a = sq0;
    }

    public final void a(C9879yT0 c9879yT0) {
        this.b = c9879yT0;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        C9879yT0 c9879yT0;
        if (textPaint == null || (c9879yT0 = this.b) == null) {
            return;
        }
        textPaint.setShader(this.a.b(c9879yT0.l()));
    }
}
