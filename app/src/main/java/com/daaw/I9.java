package com.daaw;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes.dex */
public class I9 extends C9 {
    public final SeekBar d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public I9(SeekBar seekBar) {
        super(seekBar);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = seekBar;
    }

    @Override // com.daaw.C9
    public void c(AttributeSet attributeSet, int i) {
        super.c(attributeSet, i);
        Z31 z31V = Z31.v(this.d.getContext(), attributeSet, AbstractC5060hE0.T, i, 0);
        SeekBar seekBar = this.d;
        AbstractC2317Td1.n0(seekBar, seekBar.getContext(), AbstractC5060hE0.T, attributeSet, z31V.r(), i, 0);
        Drawable drawableH = z31V.h(AbstractC5060hE0.U);
        if (drawableH != null) {
            this.d.setThumb(drawableH);
        }
        j(z31V.g(AbstractC5060hE0.V));
        if (z31V.s(AbstractC5060hE0.X)) {
            this.g = AbstractC5059hE.e(z31V.k(AbstractC5060hE0.X, -1), this.g);
            this.i = true;
        }
        if (z31V.s(AbstractC5060hE0.W)) {
            this.f = z31V.c(AbstractC5060hE0.W);
            this.h = true;
        }
        z31V.x();
        f();
    }

    public final void f() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.i) {
                Drawable drawableR = SD.r(drawable.mutate());
                this.e = drawableR;
                if (this.h) {
                    SD.o(drawableR, this.f);
                }
                if (this.i) {
                    SD.p(this.e, this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    public void g(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((this.d.getWidth() - this.d.getPaddingLeft()) - this.d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.d.getPaddingLeft(), this.d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void h() {
        Drawable drawable = this.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.d.getDrawableState())) {
            this.d.invalidateDrawable(drawable);
        }
    }

    public void i() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void j(Drawable drawable) {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.d);
            SD.m(drawable, this.d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.d.getDrawableState());
            }
            f();
        }
        this.d.invalidate();
    }
}
