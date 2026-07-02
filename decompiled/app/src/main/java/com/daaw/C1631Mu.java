package com.daaw;

import android.graphics.Bitmap;
import android.text.Layout;

/* JADX INFO: renamed from: com.daaw.Mu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1631Mu {
    public final CharSequence B;
    public final Layout.Alignment C;
    public final Bitmap D;
    public final float E;
    public final int F;
    public final int G;
    public final float H;
    public final int I;
    public final float J;
    public final float K;
    public final boolean L;
    public final int M;
    public final int N;
    public final float O;

    public C1631Mu(Bitmap bitmap, float f, int i, float f2, int i2, float f3, float f4) {
        this(null, null, bitmap, f2, 0, i2, f, i, Integer.MIN_VALUE, Float.MIN_VALUE, f3, f4, false, -16777216);
    }

    public C1631Mu(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public C1631Mu(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        this(charSequence, alignment, f, i, i2, f2, i3, f3, false, -16777216);
    }

    public C1631Mu(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, int i4, float f4) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, i4, f4, f3, Float.MIN_VALUE, false, -16777216);
    }

    public C1631Mu(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, Integer.MIN_VALUE, Float.MIN_VALUE, f3, Float.MIN_VALUE, z, i4);
    }

    public C1631Mu(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5) {
        this.B = charSequence;
        this.C = alignment;
        this.D = bitmap;
        this.E = f;
        this.F = i;
        this.G = i2;
        this.H = f2;
        this.I = i3;
        this.J = f4;
        this.K = f5;
        this.L = z;
        this.M = i5;
        this.N = i4;
        this.O = f3;
    }
}
