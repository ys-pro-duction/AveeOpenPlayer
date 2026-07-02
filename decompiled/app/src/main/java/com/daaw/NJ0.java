package com.daaw;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NJ0 {
    public static final boolean a = true;
    public static final int[] b = {R.attr.state_pressed};
    public static final int[] c = {R.attr.state_hovered, R.attr.state_focused};
    public static final int[] d = {R.attr.state_focused};
    public static final int[] e = {R.attr.state_hovered};
    public static final int[] f = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};
    public static final int[] h = {R.attr.state_selected, R.attr.state_focused};
    public static final int[] i = {R.attr.state_selected, R.attr.state_hovered};
    public static final int[] j = {R.attr.state_selected};
    public static final int[] k = {R.attr.state_enabled, R.attr.state_pressed};
    public static final String l = NJ0.class.getSimpleName();

    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static Drawable b(Context context, int i) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            return new RippleDrawable(AbstractC3779ch0.f(context, JC0.f, ColorStateList.valueOf(0)), null, new InsetDrawable((Drawable) gradientDrawable, i, i, i, i));
        }
    }

    public static Drawable a(Context context, int i2) {
        return a.b(context, i2);
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 22 && i2 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(k, 0));
        }
        return colorStateList;
    }

    public static boolean c(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
