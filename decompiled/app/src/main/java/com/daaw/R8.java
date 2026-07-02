package com.daaw;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class R8 {
    public final View a;
    public X31 d;
    public X31 e;
    public X31 f;
    public int c = -1;
    public final C8116s9 b = C8116s9.b();

    public R8(View view) {
        this.a = view;
    }

    public final boolean a(Drawable drawable) {
        if (this.f == null) {
            this.f = new X31();
        }
        X31 x31 = this.f;
        x31.a();
        ColorStateList colorStateListT = AbstractC2317Td1.t(this.a);
        if (colorStateListT != null) {
            x31.d = true;
            x31.a = colorStateListT;
        }
        PorterDuff.Mode modeU = AbstractC2317Td1.u(this.a);
        if (modeU != null) {
            x31.c = true;
            x31.b = modeU;
        }
        if (!x31.d && !x31.c) {
            return false;
        }
        C8116s9.i(drawable, x31, this.a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            X31 x31 = this.e;
            if (x31 != null) {
                C8116s9.i(background, x31, this.a.getDrawableState());
                return;
            }
            X31 x312 = this.d;
            if (x312 != null) {
                C8116s9.i(background, x312, this.a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        X31 x31 = this.e;
        if (x31 != null) {
            return x31.a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        X31 x31 = this.e;
        if (x31 != null) {
            return x31.b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i) {
        Z31 z31V = Z31.v(this.a.getContext(), attributeSet, AbstractC5060hE0.v3, i, 0);
        View view = this.a;
        AbstractC2317Td1.n0(view, view.getContext(), AbstractC5060hE0.v3, attributeSet, z31V.r(), i, 0);
        try {
            if (z31V.s(AbstractC5060hE0.w3)) {
                this.c = z31V.n(AbstractC5060hE0.w3, -1);
                ColorStateList colorStateListF = this.b.f(this.a.getContext(), this.c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            if (z31V.s(AbstractC5060hE0.x3)) {
                AbstractC2317Td1.u0(this.a, z31V.c(AbstractC5060hE0.x3));
            }
            if (z31V.s(AbstractC5060hE0.y3)) {
                AbstractC2317Td1.v0(this.a, AbstractC5059hE.e(z31V.k(AbstractC5060hE0.y3, -1), null));
            }
            z31V.x();
        } catch (Throwable th) {
            z31V.x();
            throw th;
        }
    }

    public void f(Drawable drawable) {
        this.c = -1;
        h(null);
        b();
    }

    public void g(int i) {
        this.c = i;
        C8116s9 c8116s9 = this.b;
        h(c8116s9 != null ? c8116s9.f(this.a.getContext(), i) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new X31();
            }
            X31 x31 = this.d;
            x31.a = colorStateList;
            x31.d = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new X31();
        }
        X31 x31 = this.e;
        x31.a = colorStateList;
        x31.d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new X31();
        }
        X31 x31 = this.e;
        x31.b = mode;
        x31.c = true;
        b();
    }

    public final boolean k() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.d != null : i == 21;
    }
}
