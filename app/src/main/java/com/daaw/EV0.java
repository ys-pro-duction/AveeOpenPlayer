package com.daaw;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class EV0 extends AbstractC3994dT {
    public AbstractC3994dT B;
    public a C;
    public boolean D;

    public static class a extends Drawable.ConstantState {
        public final Drawable.ConstantState a;
        public final int b;

        public a(a aVar) {
            this(aVar.a, aVar.b);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return newDrawable(null);
        }

        public a(Drawable.ConstantState constantState, int i) {
            this.a = constantState;
            this.b = i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new EV0(this, null, resources);
        }
    }

    public EV0(AbstractC3994dT abstractC3994dT, int i) {
        this(new a(abstractC3994dT.getConstantState(), i), abstractC3994dT, null);
    }

    @Override // com.daaw.AbstractC3994dT
    public boolean b() {
        return this.B.b();
    }

    @Override // com.daaw.AbstractC3994dT
    public void c(int i) {
        this.B.c(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.B.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.B.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.B.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
        return this.B.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.B.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.C;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.B.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.C.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.C.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.B.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.B.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.B.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.B.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        this.B.invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.B.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.D && super.mutate() == this) {
            this.B = (AbstractC3994dT) this.B.mutate();
            this.C = new a(this.C);
            this.D = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        super.scheduleSelf(runnable, j);
        this.B.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.B.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.B.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.B.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        this.B.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.B.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.B.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return this.B.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.B.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.B.stop();
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.B.unscheduleSelf(runnable);
    }

    public EV0(a aVar, AbstractC3994dT abstractC3994dT, Resources resources) {
        this.C = aVar;
        if (abstractC3994dT != null) {
            this.B = abstractC3994dT;
        } else if (resources != null) {
            this.B = (AbstractC3994dT) aVar.a.newDrawable(resources);
        } else {
            this.B = (AbstractC3994dT) aVar.a.newDrawable();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.B.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        super.setBounds(rect);
        this.B.setBounds(rect);
    }
}
