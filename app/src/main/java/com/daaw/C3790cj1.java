package com.daaw;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.daaw.cj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3790cj1 extends AbstractC3512bj1 {
    public static Method I;

    public C3790cj1(Drawable drawable) {
        super(drawable);
        g();
    }

    @Override // com.daaw.AbstractC3512bj1
    public boolean c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.G;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public final void g() {
        if (I == null) {
            try {
                I = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.G.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.G.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.G;
        if (drawable == null || (method = I) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.G.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.G.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // com.daaw.AbstractC3512bj1, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // com.daaw.AbstractC3512bj1, android.graphics.drawable.Drawable
    public void setTint(int i) {
        if (c()) {
            super.setTint(i);
        } else {
            this.G.setTint(i);
        }
    }

    @Override // com.daaw.AbstractC3512bj1, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.G.setTintList(colorStateList);
        }
    }

    @Override // com.daaw.AbstractC3512bj1, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.G.setTintMode(mode);
        }
    }

    public C3790cj1(C4069dj1 c4069dj1, Resources resources) {
        super(c4069dj1, resources);
        g();
    }
}
