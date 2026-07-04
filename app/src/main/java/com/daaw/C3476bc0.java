package com.daaw;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: renamed from: com.daaw.bc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3476bc0 implements LineHeightSpan {
    public final float a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;

    public C3476bc0(float f, int i, int i2, boolean z, boolean z2, int i3) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
        this.f = i3;
        if ((i3 < 0 || i3 >= 101) && i3 != -1) {
            throw new IllegalStateException("topRatio should be in [0..100] range or -1");
        }
    }

    public final void a(Paint.FontMetricsInt fontMetricsInt) {
        int iCeil = (int) Math.ceil(this.a);
        int iA = iCeil - AbstractC3754cc0.a(fontMetricsInt);
        int iAbs = this.f;
        if (iAbs == -1) {
            iAbs = (int) ((Math.abs(fontMetricsInt.ascent) / AbstractC3754cc0.a(fontMetricsInt)) * 100.0f);
        }
        int iCeil2 = (int) (iA <= 0 ? Math.ceil((iA * iAbs) / 100.0f) : Math.ceil((iA * (100 - iAbs)) / 100.0f));
        int i = fontMetricsInt.descent;
        int i2 = iCeil2 + i;
        this.i = i2;
        int i3 = i2 - iCeil;
        this.h = i3;
        if (this.d) {
            i3 = fontMetricsInt.ascent;
        }
        this.g = i3;
        if (this.e) {
            i2 = i;
        }
        this.j = i2;
        this.k = fontMetricsInt.ascent - i3;
        this.l = i2 - i;
    }

    public final int b() {
        return this.k;
    }

    public final int c() {
        return this.l;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        G10.g(charSequence, "text");
        G10.g(fontMetricsInt, "fontMetricsInt");
        if (AbstractC3754cc0.a(fontMetricsInt) <= 0) {
            return;
        }
        boolean z = i == this.b;
        boolean z2 = i2 == this.c;
        if (z && z2 && this.d && this.e) {
            return;
        }
        if (z) {
            a(fontMetricsInt);
        }
        fontMetricsInt.ascent = z ? this.g : this.h;
        fontMetricsInt.descent = z2 ? this.j : this.i;
    }
}
