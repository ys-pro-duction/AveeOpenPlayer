package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: renamed from: com.daaw.w9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9239w9 extends ImageButton {
    public final R8 B;
    public final C9518x9 C;
    public boolean D;

    public C9239w9(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, KC0.A);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        R8 r8 = this.B;
        if (r8 != null) {
            r8.b();
        }
        C9518x9 c9518x9 = this.C;
        if (c9518x9 != null) {
            c9518x9.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        R8 r8 = this.B;
        if (r8 != null) {
            return r8.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        R8 r8 = this.B;
        if (r8 != null) {
            return r8.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C9518x9 c9518x9 = this.C;
        if (c9518x9 != null) {
            return c9518x9.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C9518x9 c9518x9 = this.C;
        if (c9518x9 != null) {
            return c9518x9.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.C.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        R8 r8 = this.B;
        if (r8 != null) {
            r8.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        R8 r8 = this.B;
        if (r8 != null) {
            r8.g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C9518x9 c9518x9 = this.C;
        if (c9518x9 != null) {
            c9518x9.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C9518x9 c9518x9 = this.C;
        if (c9518x9 != null && drawable != null && !this.D) {
            c9518x9.h(drawable);
        }
        super.setImageDrawable(drawable);
        C9518x9 c9518x92 = this.C;
        if (c9518x92 != null) {
            c9518x92.c();
            if (this.D) {
                return;
            }
            this.C.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.D = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.C.i(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C9518x9 c9518x9 = this.C;
        if (c9518x9 != null) {
            c9518x9.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        R8 r8 = this.B;
        if (r8 != null) {
            r8.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        R8 r8 = this.B;
        if (r8 != null) {
            r8.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C9518x9 c9518x9 = this.C;
        if (c9518x9 != null) {
            c9518x9.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C9518x9 c9518x9 = this.C;
        if (c9518x9 != null) {
            c9518x9.k(mode);
        }
    }

    public C9239w9(Context context, AttributeSet attributeSet, int i) {
        super(W31.b(context), attributeSet, i);
        this.D = false;
        AbstractC4163e31.a(this, getContext());
        R8 r8 = new R8(this);
        this.B = r8;
        r8.e(attributeSet, i);
        C9518x9 c9518x9 = new C9518x9(this);
        this.C = c9518x9;
        c9518x9.g(attributeSet, i);
    }
}
