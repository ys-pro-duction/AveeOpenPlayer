package com.daaw;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: com.daaw.ws0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9439ws0 {
    public static final void a(Rect rect, Rect rect2) {
        rect.right += rect2.width();
        rect.top = Math.min(rect.top, rect2.top);
        rect.bottom = Math.max(rect.bottom, rect2.bottom);
    }

    public static final void b(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        if (Build.VERSION.SDK_INT >= 29) {
            C8316ss0.a(paint, charSequence, i, i2, rect);
        } else {
            paint.getTextBounds(charSequence.toString(), i, i2, rect);
        }
    }

    public static final Rect c(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        G10.g(textPaint, "<this>");
        G10.g(charSequence, "text");
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (AbstractC3446bV0.b(spanned, MetricAffectingSpan.class, i, i2)) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    G10.f(metricAffectingSpanArr, "spans");
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    b(textPaint2, charSequence, i, iNextSpanTransition, rect2);
                    a(rect, rect2);
                    i = iNextSpanTransition;
                }
                return rect;
            }
        }
        return d(textPaint, charSequence, i, i2);
    }

    public static final Rect d(Paint paint, CharSequence charSequence, int i, int i2) {
        G10.g(paint, "<this>");
        G10.g(charSequence, "text");
        Rect rect = new Rect();
        b(paint, charSequence, i, i2, rect);
        return rect;
    }
}
