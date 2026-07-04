package com.daaw;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class WW0 {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final TextPaint d;
    public final int e;
    public final TextDirectionHeuristic f;
    public final Layout.Alignment g;
    public final int h;
    public final TextUtils.TruncateAt i;
    public final int j;
    public final float k;
    public final float l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final int q;
    public final int[] r;
    public final int[] s;

    public WW0(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int[] iArr, int[] iArr2) {
        G10.g(charSequence, "text");
        G10.g(textPaint, "paint");
        G10.g(textDirectionHeuristic, "textDir");
        G10.g(alignment, "alignment");
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = textPaint;
        this.e = i3;
        this.f = textDirectionHeuristic;
        this.g = alignment;
        this.h = i4;
        this.i = truncateAt;
        this.j = i5;
        this.k = f;
        this.l = f2;
        this.m = i6;
        this.n = z;
        this.o = z2;
        this.p = i7;
        this.q = i8;
        this.r = iArr;
        this.s = iArr2;
        if (i < 0 || i > i2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (f < 0.0f) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final Layout.Alignment a() {
        return this.g;
    }

    public final int b() {
        return this.p;
    }

    public final TextUtils.TruncateAt c() {
        return this.i;
    }

    public final int d() {
        return this.j;
    }

    public final int e() {
        return this.c;
    }

    public final int f() {
        return this.q;
    }

    public final boolean g() {
        return this.n;
    }

    public final int h() {
        return this.m;
    }

    public final int[] i() {
        return this.r;
    }

    public final float j() {
        return this.l;
    }

    public final float k() {
        return this.k;
    }

    public final int l() {
        return this.h;
    }

    public final TextPaint m() {
        return this.d;
    }

    public final int[] n() {
        return this.s;
    }

    public final int o() {
        return this.b;
    }

    public final CharSequence p() {
        return this.a;
    }

    public final TextDirectionHeuristic q() {
        return this.f;
    }

    public final boolean r() {
        return this.o;
    }

    public final int s() {
        return this.e;
    }
}
