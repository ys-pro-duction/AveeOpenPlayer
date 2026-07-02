package com.daaw;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: renamed from: com.daaw.vs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9160vs0 {
    public static final ThreadLocal a = new ThreadLocal();

    /* JADX INFO: renamed from: com.daaw.vs0$a */
    public static class a {
        public static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static boolean a(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.a(paint, str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float fMeasureText = paint.measureText("\udfffd");
        float fMeasureText2 = paint.measureText("m");
        float fMeasureText3 = paint.measureText(str);
        float fMeasureText4 = 0.0f;
        if (fMeasureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (fMeasureText3 > fMeasureText2 * 2.0f) {
                return false;
            }
            int i = 0;
            while (i < length) {
                int iCharCount = Character.charCount(str.codePointAt(i)) + i;
                fMeasureText4 += paint.measureText(str, i, iCharCount);
                i = iCharCount;
            }
            if (fMeasureText3 >= fMeasureText4) {
                return false;
            }
        }
        if (fMeasureText3 != fMeasureText) {
            return true;
        }
        C0689Ds0 c0689Ds0B = b();
        paint.getTextBounds("\udfffd", 0, 2, (Rect) c0689Ds0B.a);
        paint.getTextBounds(str, 0, length, (Rect) c0689Ds0B.b);
        return !((Rect) c0689Ds0B.a).equals(c0689Ds0B.b);
    }

    public static C0689Ds0 b() {
        ThreadLocal threadLocal = a;
        C0689Ds0 c0689Ds0 = (C0689Ds0) threadLocal.get();
        if (c0689Ds0 == null) {
            C0689Ds0 c0689Ds02 = new C0689Ds0(new Rect(), new Rect());
            threadLocal.set(c0689Ds02);
            return c0689Ds02;
        }
        ((Rect) c0689Ds0.a).setEmpty();
        ((Rect) c0689Ds0.b).setEmpty();
        return c0689Ds0;
    }
}
