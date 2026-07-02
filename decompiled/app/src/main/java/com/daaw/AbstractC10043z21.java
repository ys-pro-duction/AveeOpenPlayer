package com.daaw;

import android.graphics.Rect;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;

/* JADX INFO: renamed from: com.daaw.z21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10043z21 {
    public static final C0576Cs0 a = new C0576Cs0(0, 0);

    public static final C0576Cs0 c(C9206w21 c9206w21) {
        int iMax = 0;
        int iMax2 = 0;
        for (C3476bc0 c3476bc0 : d(c9206w21)) {
            if (c3476bc0.b() < 0) {
                iMax = Math.max(iMax, Math.abs(c3476bc0.b()));
            }
            if (c3476bc0.c() < 0) {
                iMax2 = Math.max(iMax, Math.abs(c3476bc0.c()));
            }
        }
        return (iMax == 0 && iMax2 == 0) ? a : new C0576Cs0(Integer.valueOf(iMax), Integer.valueOf(iMax2));
    }

    public static final C3476bc0[] d(C9206w21 c9206w21) {
        if (!(c9206w21.w() instanceof Spanned)) {
            return new C3476bc0[0];
        }
        C3476bc0[] c3476bc0Arr = (C3476bc0[]) ((Spanned) c9206w21.w()).getSpans(0, c9206w21.w().length(), C3476bc0.class);
        G10.f(c3476bc0Arr, "lineHeightStyleSpans");
        return c3476bc0Arr.length == 0 ? new C3476bc0[0] : c3476bc0Arr;
    }

    public static final TextDirectionHeuristic e(int i) {
        if (i == 0) {
            TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.LTR;
            G10.f(textDirectionHeuristic, "LTR");
            return textDirectionHeuristic;
        }
        if (i == 1) {
            TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
            G10.f(textDirectionHeuristic2, "RTL");
            return textDirectionHeuristic2;
        }
        if (i == 2) {
            TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            G10.f(textDirectionHeuristic3, "FIRSTSTRONG_LTR");
            return textDirectionHeuristic3;
        }
        if (i == 3) {
            TextDirectionHeuristic textDirectionHeuristic4 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
            G10.f(textDirectionHeuristic4, "FIRSTSTRONG_RTL");
            return textDirectionHeuristic4;
        }
        if (i == 4) {
            TextDirectionHeuristic textDirectionHeuristic5 = TextDirectionHeuristics.ANYRTL_LTR;
            G10.f(textDirectionHeuristic5, "ANYRTL_LTR");
            return textDirectionHeuristic5;
        }
        if (i != 5) {
            TextDirectionHeuristic textDirectionHeuristic6 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            G10.f(textDirectionHeuristic6, "FIRSTSTRONG_LTR");
            return textDirectionHeuristic6;
        }
        TextDirectionHeuristic textDirectionHeuristic7 = TextDirectionHeuristics.LOCALE;
        G10.f(textDirectionHeuristic7, "LOCALE");
        return textDirectionHeuristic7;
    }

    public static final C0576Cs0 f(C9206w21 c9206w21) {
        if (c9206w21.c() || c9206w21.x()) {
            return new C0576Cs0(0, 0);
        }
        TextPaint paint = c9206w21.d().getPaint();
        CharSequence text = c9206w21.d().getText();
        G10.f(paint, "paint");
        G10.f(text, "text");
        Rect rectC = AbstractC9439ws0.c(paint, text, c9206w21.d().getLineStart(0), c9206w21.d().getLineEnd(0));
        int lineAscent = c9206w21.d().getLineAscent(0);
        int i = rectC.top;
        int topPadding = i < lineAscent ? lineAscent - i : c9206w21.d().getTopPadding();
        if (c9206w21.h() != 1) {
            int lineCount = c9206w21.d().getLineCount() - 1;
            rectC = AbstractC9439ws0.c(paint, text, c9206w21.d().getLineStart(lineCount), c9206w21.d().getLineEnd(lineCount));
        }
        int lineDescent = c9206w21.d().getLineDescent(c9206w21.d().getLineCount() - 1);
        int i2 = rectC.bottom;
        int bottomPadding = i2 > lineDescent ? i2 - lineDescent : c9206w21.d().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? a : new C0576Cs0(Integer.valueOf(topPadding), Integer.valueOf(bottomPadding));
    }
}
