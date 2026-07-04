package com.daaw;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: renamed from: com.daaw.z9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C10076z9 extends MultiAutoCompleteTextView implements InterfaceC3333b41 {
    public static final int[] E = {R.attr.popupBackground};
    public final R8 B;
    public final M9 C;
    public final C8395t9 D;

    public C10076z9(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, KC0.m);
    }

    public void a(C8395t9 c8395t9) {
        KeyListener keyListener = getKeyListener();
        if (c8395t9.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = c8395t9.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.D.d(AbstractC8960v9.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(G9.b(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.D.e(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.D.a(keyListener));
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        M9 m9 = this.C;
        if (m9 != null) {
            m9.q(context, i);
        }
    }

    public C10076z9(Context context, AttributeSet attributeSet, int i) {
        super(W31.b(context), attributeSet, i);
        AbstractC4163e31.a(this, getContext());
        Z31 z31V = Z31.v(getContext(), attributeSet, E, i, 0);
        if (z31V.s(0)) {
            setDropDownBackgroundDrawable(z31V.g(0));
        }
        z31V.x();
        R8 r8 = new R8(this);
        this.B = r8;
        r8.e(attributeSet, i);
        M9 m9 = new M9(this);
        this.C = m9;
        m9.m(attributeSet, i);
        m9.b();
        C8395t9 c8395t9 = new C8395t9(this);
        this.D = c8395t9;
        c8395t9.c(attributeSet, i);
        a(c8395t9);
    }
}
