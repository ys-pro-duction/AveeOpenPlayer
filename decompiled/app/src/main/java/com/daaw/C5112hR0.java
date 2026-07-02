package com.daaw;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: com.daaw.hR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5112hR0 extends CharacterStyle {
    public final int a;
    public final float b;
    public final float c;
    public final float d;

    public C5112hR0(int i, float f, float f2, float f3) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        G10.g(textPaint, "tp");
        textPaint.setShadowLayer(this.d, this.b, this.c, this.a);
    }
}
