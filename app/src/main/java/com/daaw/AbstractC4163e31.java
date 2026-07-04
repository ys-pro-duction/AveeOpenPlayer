package com.daaw;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: renamed from: com.daaw.e31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4163e31 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final int[] b = {-16842910};
    public static final int[] c = {R.attr.state_focused};
    public static final int[] d = {R.attr.state_activated};
    public static final int[] e = {R.attr.state_pressed};
    public static final int[] f = {R.attr.state_checked};
    public static final int[] g = {R.attr.state_selected};
    public static final int[] h = {-16842919, -16842908};
    public static final int[] i = new int[0];
    public static final int[] j = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC5060hE0.y0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(AbstractC5060hE0.D0)) {
                view.getClass().toString();
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i2) {
        ColorStateList colorStateListE = e(context, i2);
        if (colorStateListE != null && colorStateListE.isStateful()) {
            return colorStateListE.getColorForState(b, colorStateListE.getDefaultColor());
        }
        TypedValue typedValueF = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueF, true);
        return d(context, i2, typedValueF.getFloat());
    }

    public static int c(Context context, int i2) {
        int[] iArr = j;
        iArr[0] = i2;
        Z31 z31U = Z31.u(context, null, iArr);
        try {
            return z31U.b(0, 0);
        } finally {
            z31U.x();
        }
    }

    public static int d(Context context, int i2, float f2) {
        return AbstractC6338ln.o(c(context, i2), Math.round(Color.alpha(r0) * f2));
    }

    public static ColorStateList e(Context context, int i2) {
        int[] iArr = j;
        iArr[0] = i2;
        Z31 z31U = Z31.u(context, null, iArr);
        try {
            return z31U.c(0);
        } finally {
            z31U.x();
        }
    }

    public static TypedValue f() {
        ThreadLocal threadLocal = a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
