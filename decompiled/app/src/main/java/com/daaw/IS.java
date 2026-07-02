package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.daaw.HS;
import com.daaw.NS;

/* JADX INFO: loaded from: classes.dex */
public class IS extends AbstractC3994dT implements NS.c {
    public final Paint B;
    public final Rect C;
    public final a D;
    public final HS E;
    public final NS F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public boolean M;

    public static class a extends Drawable.ConstantState {
        public QS a;
        public byte[] b;
        public Context c;
        public InterfaceC6983o51 d;
        public int e;
        public int f;
        public HS.a g;
        public InterfaceC1883Pf h;
        public Bitmap i;

        public a(QS qs, byte[] bArr, Context context, InterfaceC6983o51 interfaceC6983o51, int i, int i2, HS.a aVar, InterfaceC1883Pf interfaceC1883Pf, Bitmap bitmap) {
            if (bitmap == null) {
                throw new NullPointerException("The first frame of the GIF must not be null");
            }
            this.a = qs;
            this.b = bArr;
            this.h = interfaceC1883Pf;
            this.i = bitmap;
            this.c = context.getApplicationContext();
            this.d = interfaceC6983o51;
            this.e = i;
            this.f = i2;
            this.g = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new IS(this);
        }
    }

    public IS(Context context, HS.a aVar, InterfaceC1883Pf interfaceC1883Pf, InterfaceC6983o51 interfaceC6983o51, int i, int i2, QS qs, byte[] bArr, Bitmap bitmap) {
        this(new a(qs, bArr, context, interfaceC6983o51, i, i2, aVar, interfaceC1883Pf, bitmap));
    }

    @Override // com.daaw.NS.c
    public void a(int i) {
        if (getCallback() == null) {
            stop();
            j();
            return;
        }
        invalidateSelf();
        if (i == this.E.f() - 1) {
            this.K++;
        }
        int i2 = this.L;
        if (i2 == -1 || this.K < i2) {
            return;
        }
        stop();
    }

    @Override // com.daaw.AbstractC3994dT
    public boolean b() {
        return true;
    }

    @Override // com.daaw.AbstractC3994dT
    public void c(int i) {
        if (i <= 0 && i != -1 && i != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i != 0) {
            this.L = i;
        } else {
            int iJ = this.E.j();
            this.L = iJ != 0 ? iJ : -1;
        }
    }

    public byte[] d() {
        return this.D.b;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.I) {
            return;
        }
        if (this.M) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), this.C);
            this.M = false;
        }
        Bitmap bitmapB = this.F.b();
        if (bitmapB == null) {
            bitmapB = this.D.i;
        }
        canvas.drawBitmap(bitmapB, (Rect) null, this.C, this.B);
    }

    public HS e() {
        return this.E;
    }

    public Bitmap f() {
        return this.D.i;
    }

    public int g() {
        return this.E.f();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.D;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.D.i.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.D.i.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public InterfaceC6983o51 h() {
        return this.D.d;
    }

    public void i() {
        this.I = true;
        a aVar = this.D;
        aVar.h.a(aVar.i);
        this.F.a();
        this.F.h();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.G;
    }

    public final void j() {
        this.F.a();
        invalidateSelf();
    }

    public final void k() {
        this.K = 0;
    }

    public final void l() {
        if (this.E.f() == 1) {
            invalidateSelf();
        } else {
            if (this.G) {
                return;
            }
            this.G = true;
            this.F.g();
            invalidateSelf();
        }
    }

    public final void m() {
        this.G = false;
        this.F.h();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.M = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.B.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.B.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        this.J = z;
        if (!z) {
            m();
        } else if (this.H) {
            l();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.H = true;
        k();
        if (this.J) {
            l();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.H = false;
        m();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IS(IS is, Bitmap bitmap, InterfaceC6983o51 interfaceC6983o51) {
        a aVar = is.D;
        this(new a(aVar.a, aVar.b, aVar.c, interfaceC6983o51, aVar.e, aVar.f, aVar.g, aVar.h, bitmap));
    }

    public IS(a aVar) {
        this.C = new Rect();
        this.J = true;
        this.L = -1;
        if (aVar != null) {
            this.D = aVar;
            HS hs = new HS(aVar.g);
            this.E = hs;
            this.B = new Paint();
            hs.o(aVar.a, aVar.b);
            NS ns = new NS(aVar.c, this, hs, aVar.e, aVar.f);
            this.F = ns;
            ns.f(aVar.d);
            return;
        }
        throw new NullPointerException("GifState must not be null");
    }
}
