package com.daaw;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: loaded from: classes.dex */
public class S9 extends ToggleButton implements InterfaceC3333b41 {
    public final R8 B;
    public final M9 C;
    public C8674u9 D;

    public S9(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    private C8674u9 getEmojiTextViewHelper() {
        if (this.D == null) {
            this.D = new C8674u9(this);
        }
        return this.D;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        R8 r8 = this.B;
        if (r8 != null) {
            r8.b();
        }
        M9 m9 = this.C;
        if (m9 != null) {
            m9.b();
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.C.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.C.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
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

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        M9 m9 = this.C;
        if (m9 != null) {
            m9.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        M9 m9 = this.C;
        if (m9 != null) {
            m9.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
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

    @Override // com.daaw.InterfaceC3333b41
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.C.w(colorStateList);
        this.C.b();
    }

    @Override // com.daaw.InterfaceC3333b41
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.C.x(mode);
        this.C.b();
    }

    public S9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC4163e31.a(this, getContext());
        R8 r8 = new R8(this);
        this.B = r8;
        r8.e(attributeSet, i);
        M9 m9 = new M9(this);
        this.C = m9;
        m9.m(attributeSet, i);
        getEmojiTextViewHelper().c(attributeSet, i);
    }
}
