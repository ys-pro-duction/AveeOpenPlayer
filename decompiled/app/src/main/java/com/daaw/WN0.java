package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WN0 extends FrameLayout {
    public Drawable B;
    public Rect C;
    public Rect D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;

    public class a implements InterfaceC2780Xp0 {
        public a() {
        }

        @Override // com.daaw.InterfaceC2780Xp0
        public C8820uh1 a(View view, C8820uh1 c8820uh1) {
            WN0 wn0 = WN0.this;
            if (wn0.C == null) {
                wn0.C = new Rect();
            }
            WN0.this.C.set(c8820uh1.k(), c8820uh1.m(), c8820uh1.l(), c8820uh1.j());
            WN0.this.a(c8820uh1);
            WN0.this.setWillNotDraw(!c8820uh1.n() || WN0.this.B == null);
            AbstractC2317Td1.g0(WN0.this);
            return c8820uh1.c();
        }
    }

    public WN0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.D = new Rect();
        this.E = true;
        this.F = true;
        this.G = true;
        this.H = true;
        TypedArray typedArrayI = AbstractC3885d31.i(context, attributeSet, WD0.G4, i, SD0.e, new int[0]);
        this.B = typedArrayI.getDrawable(WD0.H4);
        typedArrayI.recycle();
        setWillNotDraw(true);
        AbstractC2317Td1.D0(this, new a());
    }

    public abstract void a(C8820uh1 c8820uh1);

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.C == null || this.B == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.E) {
            this.D.set(0, 0, width, this.C.top);
            this.B.setBounds(this.D);
            this.B.draw(canvas);
        }
        if (this.F) {
            this.D.set(0, height - this.C.bottom, width, height);
            this.B.setBounds(this.D);
            this.B.draw(canvas);
        }
        if (this.G) {
            Rect rect = this.D;
            Rect rect2 = this.C;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.B.setBounds(this.D);
            this.B.draw(canvas);
        }
        if (this.H) {
            Rect rect3 = this.D;
            Rect rect4 = this.C;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.B.setBounds(this.D);
            this.B.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.B;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.B;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.F = z;
    }

    public void setDrawLeftInsetForeground(boolean z) {
        this.G = z;
    }

    public void setDrawRightInsetForeground(boolean z) {
        this.H = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.E = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.B = drawable;
    }
}
