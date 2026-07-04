package com.daaw;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: com.daaw.x9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9518x9 {
    public final ImageView a;
    public X31 b;
    public X31 c;
    public X31 d;
    public int e = 0;

    public C9518x9(ImageView imageView) {
        this.a = imageView;
    }

    public final boolean a(Drawable drawable) {
        if (this.d == null) {
            this.d = new X31();
        }
        X31 x31 = this.d;
        x31.a();
        ColorStateList colorStateListA = CY.a(this.a);
        if (colorStateListA != null) {
            x31.d = true;
            x31.a = colorStateListA;
        }
        PorterDuff.Mode modeB = CY.b(this.a);
        if (modeB != null) {
            x31.c = true;
            x31.b = modeB;
        }
        if (!x31.d && !x31.c) {
            return false;
        }
        C8116s9.i(drawable, x31, this.a.getDrawableState());
        return true;
    }

    public void b() {
        if (this.a.getDrawable() != null) {
            this.a.getDrawable().setLevel(this.e);
        }
    }

    public void c() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            AbstractC5059hE.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            X31 x31 = this.c;
            if (x31 != null) {
                C8116s9.i(drawable, x31, this.a.getDrawableState());
                return;
            }
            X31 x312 = this.b;
            if (x312 != null) {
                C8116s9.i(drawable, x312, this.a.getDrawableState());
            }
        }
    }

    public ColorStateList d() {
        X31 x31 = this.c;
        if (x31 != null) {
            return x31.a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        X31 x31 = this.c;
        if (x31 != null) {
            return x31.b;
        }
        return null;
    }

    public boolean f() {
        return !(this.a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i) {
        int iN;
        Z31 z31V = Z31.v(this.a.getContext(), attributeSet, AbstractC5060hE0.P, i, 0);
        ImageView imageView = this.a;
        AbstractC2317Td1.n0(imageView, imageView.getContext(), AbstractC5060hE0.P, attributeSet, z31V.r(), i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null && (iN = z31V.n(AbstractC5060hE0.Q, -1)) != -1 && (drawable = G9.b(this.a.getContext(), iN)) != null) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC5059hE.b(drawable);
            }
            if (z31V.s(AbstractC5060hE0.R)) {
                CY.c(this.a, z31V.c(AbstractC5060hE0.R));
            }
            if (z31V.s(AbstractC5060hE0.S)) {
                CY.d(this.a, AbstractC5059hE.e(z31V.k(AbstractC5060hE0.S, -1), null));
            }
            z31V.x();
        } catch (Throwable th) {
            z31V.x();
            throw th;
        }
    }

    public void h(Drawable drawable) {
        this.e = drawable.getLevel();
    }

    public void i(int i) {
        if (i != 0) {
            Drawable drawableB = G9.b(this.a.getContext(), i);
            if (drawableB != null) {
                AbstractC5059hE.b(drawableB);
            }
            this.a.setImageDrawable(drawableB);
        } else {
            this.a.setImageDrawable(null);
        }
        c();
    }

    public void j(ColorStateList colorStateList) {
        if (this.c == null) {
            this.c = new X31();
        }
        X31 x31 = this.c;
        x31.a = colorStateList;
        x31.d = true;
        c();
    }

    public void k(PorterDuff.Mode mode) {
        if (this.c == null) {
            this.c = new X31();
        }
        X31 x31 = this.c;
        x31.b = mode;
        x31.c = true;
        c();
    }

    public final boolean l() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.b != null : i == 21;
    }
}
