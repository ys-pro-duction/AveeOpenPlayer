package com.daaw;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.iE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5338iE {
    public static Drawable a(Drawable drawable, Drawable drawable2) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        if (drawable2.getIntrinsicWidth() == -1 || drawable2.getIntrinsicHeight() == -1) {
            intrinsicWidth = drawable.getIntrinsicWidth();
            intrinsicHeight = drawable.getIntrinsicHeight();
        } else if (drawable2.getIntrinsicWidth() > drawable.getIntrinsicWidth() || drawable2.getIntrinsicHeight() > drawable.getIntrinsicHeight()) {
            float intrinsicWidth2 = drawable2.getIntrinsicWidth() / drawable2.getIntrinsicHeight();
            if (intrinsicWidth2 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth3 = drawable.getIntrinsicWidth();
                int i = (int) (intrinsicWidth3 / intrinsicWidth2);
                intrinsicWidth = intrinsicWidth3;
                intrinsicHeight = i;
            } else {
                intrinsicHeight = drawable.getIntrinsicHeight();
                intrinsicWidth = (int) (intrinsicWidth2 * intrinsicHeight);
            }
        } else {
            intrinsicWidth = drawable2.getIntrinsicWidth();
            intrinsicHeight = drawable2.getIntrinsicHeight();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            return layerDrawable;
        }
        int intrinsicWidth4 = (drawable.getIntrinsicWidth() - intrinsicWidth) / 2;
        int intrinsicHeight2 = (drawable.getIntrinsicHeight() - intrinsicHeight) / 2;
        layerDrawable.setLayerInset(1, intrinsicWidth4, intrinsicHeight2, intrinsicWidth4, intrinsicHeight2);
        return layerDrawable;
    }

    public static Drawable b(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return c(drawable, colorStateList, mode, Build.VERSION.SDK_INT < 23);
    }

    public static Drawable c(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList == null) {
            if (z) {
                drawable.mutate();
            }
            return drawable;
        }
        Drawable drawableMutate = SD.r(drawable).mutate();
        if (mode != null) {
            SD.p(drawableMutate, mode);
        }
        return drawableMutate;
    }

    public static int[] d(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    public static void e(Outline outline, Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            outline.setPath(path);
            return;
        }
        if (i >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    public static PorterDuffColorFilter f(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
