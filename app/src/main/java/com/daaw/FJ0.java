package com.daaw;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public class FJ0 extends Drawable implements DR0, V31 {
    public b B;

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public FJ0 mutate() {
        this.B = new b(this.B);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.B;
        if (bVar.b) {
            bVar.a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.B.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.B.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.B.a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zC = NJ0.c(iArr);
        b bVar = this.B;
        if (bVar.b == zC) {
            return zOnStateChange;
        }
        bVar.b = zC;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.B.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.B.a.setColorFilter(colorFilter);
    }

    @Override // com.daaw.DR0
    public void setShapeAppearanceModel(C5671jR0 c5671jR0) {
        this.B.a.setShapeAppearanceModel(c5671jR0);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        this.B.a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.B.a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.B.a.setTintMode(mode);
    }

    public FJ0(C5671jR0 c5671jR0) {
        this(new b(new C4904gh0(c5671jR0)));
    }

    public static final class b extends Drawable.ConstantState {
        public C4904gh0 a;
        public boolean b;

        public b(C4904gh0 c4904gh0) {
            this.a = c4904gh0;
            this.b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FJ0 newDrawable() {
            return new FJ0(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.a = (C4904gh0) bVar.a.getConstantState().newDrawable();
            this.b = bVar.b;
        }
    }

    public FJ0(b bVar) {
        this.B = bVar;
    }
}
