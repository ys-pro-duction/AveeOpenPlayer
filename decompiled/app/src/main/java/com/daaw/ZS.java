package com.daaw;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;

/* JADX INFO: loaded from: classes.dex */
public class ZS extends AbstractC3994dT {
    public final Rect B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public a G;

    public static class a extends Drawable.ConstantState {
        public static final Paint d = new Paint(6);
        public final Bitmap a;
        public int b;
        public Paint c;

        public a(Bitmap bitmap) {
            this.c = d;
            this.a = bitmap;
        }

        public void a() {
            if (d == this.c) {
                this.c = new Paint(6);
            }
        }

        public void b(int i) {
            a();
            this.c.setAlpha(i);
        }

        public void c(ColorFilter colorFilter) {
            a();
            this.c.setColorFilter(colorFilter);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new ZS((Resources) null, this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new ZS(resources, this);
        }

        public a(a aVar) {
            this(aVar.a);
            this.b = aVar.b;
        }
    }

    public ZS(Resources resources, Bitmap bitmap) {
        this(resources, new a(bitmap));
    }

    @Override // com.daaw.AbstractC3994dT
    public boolean b() {
        return false;
    }

    public Bitmap d() {
        return this.G.a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.E) {
            Gravity.apply(119, this.C, this.D, getBounds(), this.B);
            this.E = false;
        }
        a aVar = this.G;
        canvas.drawBitmap(aVar.a, (Rect) null, this.B, aVar.c);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.G;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.D;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.C;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap = this.G.a;
        return (bitmap == null || bitmap.hasAlpha() || this.G.c.getAlpha() < 255) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.F && super.mutate() == this) {
            this.G = new a(this.G);
            this.F = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.E = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.G.c.getAlpha() != i) {
            this.G.b(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.G.c(colorFilter);
        invalidateSelf();
    }

    public ZS(Resources resources, a aVar) {
        int i;
        this.B = new Rect();
        if (aVar == null) {
            throw new NullPointerException("BitmapState must not be null");
        }
        this.G = aVar;
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
            i = i == 0 ? 160 : i;
            aVar.b = i;
        } else {
            i = aVar.b;
        }
        this.C = aVar.a.getScaledWidth(i);
        this.D = aVar.a.getScaledHeight(i);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }

    @Override // com.daaw.AbstractC3994dT
    public void c(int i) {
    }
}
