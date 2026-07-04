package com.daaw;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.daaw.bj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3512bj1 extends Drawable implements Drawable.Callback, InterfaceC3233aj1, V31 {
    public static final PorterDuff.Mode H = PorterDuff.Mode.SRC_IN;
    public int B;
    public PorterDuff.Mode C;
    public boolean D;
    public C4069dj1 E;
    public boolean F;
    public Drawable G;

    public AbstractC3512bj1(C4069dj1 c4069dj1, Resources resources) {
        this.E = c4069dj1;
        e(resources);
    }

    @Override // com.daaw.InterfaceC3233aj1
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.G;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.G = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C4069dj1 c4069dj1 = this.E;
            if (c4069dj1 != null) {
                c4069dj1.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // com.daaw.InterfaceC3233aj1
    public final Drawable b() {
        return this.G;
    }

    public abstract boolean c();

    public final C4069dj1 d() {
        return new C4069dj1(this.E);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.G.draw(canvas);
    }

    public final void e(Resources resources) {
        Drawable.ConstantState constantState;
        C4069dj1 c4069dj1 = this.E;
        if (c4069dj1 == null || (constantState = c4069dj1.b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }

    public final boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        C4069dj1 c4069dj1 = this.E;
        ColorStateList colorStateList = c4069dj1.c;
        PorterDuff.Mode mode = c4069dj1.d;
        if (colorStateList == null || mode == null) {
            this.D = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.D || colorForState != this.B || mode != this.C) {
                setColorFilter(colorForState, mode);
                this.B = colorForState;
                this.C = mode;
                this.D = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C4069dj1 c4069dj1 = this.E;
        return changingConfigurations | (c4069dj1 != null ? c4069dj1.getChangingConfigurations() : 0) | this.G.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        C4069dj1 c4069dj1 = this.E;
        if (c4069dj1 == null || !c4069dj1.a()) {
            return null;
        }
        this.E.a = getChangingConfigurations();
        return this.E;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.G.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.G.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.G.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return SD.f(this.G);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.G.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.G.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.G.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.G.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.G.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.G.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return SD.h(this.G);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C4069dj1 c4069dj1;
        ColorStateList colorStateList = (!c() || (c4069dj1 = this.E) == null) ? null : c4069dj1.c;
        return (colorStateList != null && colorStateList.isStateful()) || this.G.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.G.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.F && super.mutate() == this) {
            this.E = d();
            Drawable drawable = this.G;
            if (drawable != null) {
                drawable.mutate();
            }
            C4069dj1 c4069dj1 = this.E;
            if (c4069dj1 != null) {
                Drawable drawable2 = this.G;
                c4069dj1.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.F = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return SD.m(this.G, i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.G.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.G.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        SD.j(this.G, z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.G.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.G.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.G.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.G.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return f(iArr) || this.G.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.E.c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.E.d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.G.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public AbstractC3512bj1(Drawable drawable) {
        this.E = d();
        a(drawable);
    }
}
