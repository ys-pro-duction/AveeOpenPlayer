package com.daaw;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes3.dex */
public final class BW0 {
    public static final int n;
    public static boolean o;
    public static Constructor p;
    public static Object q;
    public CharSequence a;
    public final TextPaint b;
    public final int c;
    public int e;
    public boolean l;
    public int d = 0;
    public Layout.Alignment f = Layout.Alignment.ALIGN_NORMAL;
    public int g = Integer.MAX_VALUE;
    public float h = 0.0f;
    public float i = 1.0f;
    public int j = n;
    public boolean k = true;
    public TextUtils.TruncateAt m = null;

    public static class a extends Exception {
        public a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    static {
        n = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public BW0(CharSequence charSequence, TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i;
        this.e = charSequence.length();
    }

    public static BW0 c(CharSequence charSequence, TextPaint textPaint, int i) {
        return new BW0(charSequence, textPaint, i);
    }

    public StaticLayout a() throws a {
        if (this.a == null) {
            this.a = "";
        }
        int iMax = Math.max(0, this.c);
        CharSequence charSequenceEllipsize = this.a;
        if (this.g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.b, iMax, this.m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.e);
        this.e = iMin;
        if (Build.VERSION.SDK_INT < 23) {
            b();
            try {
                return (StaticLayout) ((Constructor) AbstractC8621ty0.g(p)).newInstance(charSequenceEllipsize, Integer.valueOf(this.d), Integer.valueOf(this.e), this.b, Integer.valueOf(iMax), this.f, AbstractC8621ty0.g(q), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.k), null, Integer.valueOf(iMax), Integer.valueOf(this.g));
            } catch (Exception e) {
                throw new a(e);
            }
        }
        if (this.l && this.g == 1) {
            this.f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.d, iMin, this.b, iMax);
        builderObtain.setAlignment(this.f);
        builderObtain.setIncludePad(this.k);
        builderObtain.setTextDirection(this.l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.g);
        float f = this.h;
        if (f != 0.0f || this.i != 1.0f) {
            builderObtain.setLineSpacing(f, this.i);
        }
        if (this.g > 1) {
            builderObtain.setHyphenationFrequency(this.j);
        }
        return builderObtain.build();
    }

    public final void b() throws a {
        if (o) {
            return;
        }
        try {
            q = this.l && Build.VERSION.SDK_INT >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            p = declaredConstructor;
            declaredConstructor.setAccessible(true);
            o = true;
        } catch (Exception e) {
            throw new a(e);
        }
    }

    public BW0 d(Layout.Alignment alignment) {
        this.f = alignment;
        return this;
    }

    public BW0 e(TextUtils.TruncateAt truncateAt) {
        this.m = truncateAt;
        return this;
    }

    public BW0 f(int i) {
        this.j = i;
        return this;
    }

    public BW0 g(boolean z) {
        this.k = z;
        return this;
    }

    public BW0 h(boolean z) {
        this.l = z;
        return this;
    }

    public BW0 i(float f, float f2) {
        this.h = f;
        this.i = f2;
        return this;
    }

    public BW0 j(int i) {
        this.g = i;
        return this;
    }

    public BW0 k(CW0 cw0) {
        return this;
    }
}
