package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.daaw.AbstractC4163e31;
import com.daaw.C8674u9;
import com.daaw.G9;
import com.daaw.InterfaceC3054a41;
import com.daaw.InterfaceC3333b41;
import com.daaw.KC0;
import com.daaw.M9;
import com.daaw.R8;
import com.daaw.W31;
import com.daaw.W8;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements InterfaceC3054a41, InterfaceC3333b41 {
    public final W8 B;
    public final R8 C;
    public final M9 D;
    public C8674u9 E;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, KC0.o);
    }

    private C8674u9 getEmojiTextViewHelper() {
        if (this.E == null) {
            this.E = new C8674u9(this);
        }
        return this.E;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        R8 r8 = this.C;
        if (r8 != null) {
            r8.b();
        }
        M9 m9 = this.D;
        if (m9 != null) {
            m9.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        R8 r8 = this.C;
        if (r8 != null) {
            return r8.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        R8 r8 = this.C;
        if (r8 != null) {
            return r8.d();
        }
        return null;
    }

    @Override // com.daaw.InterfaceC3054a41
    public ColorStateList getSupportButtonTintList() {
        W8 w8 = this.B;
        if (w8 != null) {
            return w8.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        W8 w8 = this.B;
        if (w8 != null) {
            return w8.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.D.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.D.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        R8 r8 = this.C;
        if (r8 != null) {
            r8.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        R8 r8 = this.C;
        if (r8 != null) {
            r8.g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        W8 w8 = this.B;
        if (w8 != null) {
            w8.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        M9 m9 = this.D;
        if (m9 != null) {
            m9.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        M9 m9 = this.D;
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
        R8 r8 = this.C;
        if (r8 != null) {
            r8.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        R8 r8 = this.C;
        if (r8 != null) {
            r8.j(mode);
        }
    }

    @Override // com.daaw.InterfaceC3054a41
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        W8 w8 = this.B;
        if (w8 != null) {
            w8.f(colorStateList);
        }
    }

    @Override // com.daaw.InterfaceC3054a41
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        W8 w8 = this.B;
        if (w8 != null) {
            w8.g(mode);
        }
    }

    @Override // com.daaw.InterfaceC3333b41
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.D.w(colorStateList);
        this.D.b();
    }

    @Override // com.daaw.InterfaceC3333b41
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.D.x(mode);
        this.D.b();
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(W31.b(context), attributeSet, i);
        AbstractC4163e31.a(this, getContext());
        W8 w8 = new W8(this);
        this.B = w8;
        w8.d(attributeSet, i);
        R8 r8 = new R8(this);
        this.C = r8;
        r8.e(attributeSet, i);
        M9 m9 = new M9(this);
        this.D = m9;
        m9.m(attributeSet, i);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(G9.b(getContext(), i));
    }
}
