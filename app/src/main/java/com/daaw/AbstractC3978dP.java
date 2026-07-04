package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* JADX INFO: renamed from: com.daaw.dP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3978dP extends androidx.appcompat.widget.a {
    public Drawable Q;
    public final Rect R;
    public final Rect S;
    public int T;
    public boolean U;
    public boolean V;

    public AbstractC3978dP(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.R = new Rect();
        this.S = new Rect();
        this.T = 119;
        this.U = true;
        this.V = false;
        TypedArray typedArrayI = AbstractC3885d31.i(context, attributeSet, WD0.v1, i, 0, new int[0]);
        this.T = typedArrayI.getInt(WD0.x1, this.T);
        Drawable drawable = typedArrayI.getDrawable(WD0.w1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.U = typedArrayI.getBoolean(WD0.y1, true);
        typedArrayI.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.Q;
        if (drawable != null) {
            if (this.V) {
                this.V = false;
                Rect rect = this.R;
                Rect rect2 = this.S;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.U) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.T, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.Q;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.Q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.Q.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.Q;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.T;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.Q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.V = z | this.V;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.V = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.Q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.Q);
            }
            this.Q = drawable;
            this.V = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.T == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.T != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.T = i;
            if (i == 119 && this.Q != null) {
                this.Q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.Q;
    }
}
