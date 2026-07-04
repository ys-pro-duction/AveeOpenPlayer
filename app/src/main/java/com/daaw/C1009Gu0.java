package com.daaw;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: com.daaw.Gu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1009Gu0 extends ReplacementSpan {
    public static final a k = new a(null);
    public final float a;
    public final int b;
    public final float c;
    public final int d;
    public final float e;
    public final int f;
    public Paint.FontMetricsInt g;
    public int h;
    public int i;
    public boolean j;

    /* JADX INFO: renamed from: com.daaw.Gu0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        G10.u("fontMetrics");
        return null;
    }

    public final int b() {
        if (this.j) {
            return this.i;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    public final int c() {
        return this.f;
    }

    public final int d() {
        if (this.j) {
            return this.h;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        G10.g(canvas, "canvas");
        G10.g(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        int iA;
        G10.g(paint, "paint");
        this.j = true;
        float textSize = paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        G10.f(fontMetricsInt2, "paint.fontMetricsInt");
        this.g = fontMetricsInt2;
        if (a().descent <= a().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        int i3 = this.b;
        if (i3 == 0) {
            f = this.a * this.e;
        } else {
            if (i3 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            f = this.a * textSize;
        }
        this.h = AbstractC1113Hu0.a(f);
        int i4 = this.d;
        if (i4 == 0) {
            iA = AbstractC1113Hu0.a(this.c * this.e);
        } else {
            if (i4 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            iA = AbstractC1113Hu0.a(this.c * textSize);
        }
        this.i = iA;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.f) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                    }
                    break;
                case 1:
                case 4:
                    if (fontMetricsInt.ascent + b() > fontMetricsInt.descent) {
                        fontMetricsInt.descent = fontMetricsInt.ascent + b();
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int iB = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iB;
                        fontMetricsInt.descent = iB + b();
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Unknown verticalAlign.");
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return d();
    }
}
