package com.daaw;

import android.content.Context;
import android.graphics.Color;

/* JADX INFO: loaded from: classes3.dex */
public class RF {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public RF(Context context) {
        this(AbstractC2744Xg0.b(context, JC0.o, false), AbstractC3779ch0.b(context, JC0.n, 0), AbstractC3779ch0.b(context, JC0.m, 0), AbstractC3779ch0.b(context, JC0.k, 0), context.getResources().getDisplayMetrics().density);
    }

    public float a(float f2) {
        if (this.e <= 0.0f || f2 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f2 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i, float f2) {
        int i2;
        float fA = a(f2);
        int iAlpha = Color.alpha(i);
        int iJ = AbstractC3779ch0.j(AbstractC6338ln.o(i, 255), this.b, fA);
        if (fA > 0.0f && (i2 = this.c) != 0) {
            iJ = AbstractC3779ch0.i(iJ, AbstractC6338ln.o(i2, f));
        }
        return AbstractC6338ln.o(iJ, iAlpha);
    }

    public int c(int i, float f2) {
        return (this.a && e(i)) ? b(i, f2) : i;
    }

    public boolean d() {
        return this.a;
    }

    public final boolean e(int i) {
        return AbstractC6338ln.o(i, 255) == this.d;
    }

    public RF(boolean z, int i, int i2, int i3, float f2) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f2;
    }
}
