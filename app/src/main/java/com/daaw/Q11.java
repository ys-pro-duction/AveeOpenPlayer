package com.daaw;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class Q11 extends CharacterStyle {
    public final boolean a;
    public final boolean b;

    public Q11(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        G10.g(textPaint, "textPaint");
        textPaint.setUnderlineText(this.a);
        textPaint.setStrikeThruText(this.b);
    }
}
