package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: classes.dex */
public class U8 extends CheckedTextView implements InterfaceC3333b41 {
    public final V8 B;
    public final R8 C;
    public final M9 D;
    public C8674u9 E;

    public U8(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, KC0.p);
    }

    private C8674u9 getEmojiTextViewHelper() {
        if (this.E == null) {
            this.E = new C8674u9(this);
        }
        return this.E;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        M9 m9 = this.D;
        if (m9 != null) {
            m9.b();
        }
        R8 r8 = this.C;
        if (r8 != null) {
            r8.b();
        }
        V8 v8 = this.B;
        if (v8 != null) {
            v8.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return X21.q(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        V8 v8 = this.B;
        if (v8 != null) {
            return v8.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        V8 v8 = this.B;
        if (v8 != null) {
            return v8.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.D.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.D.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC8960v9.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        V8 v8 = this.B;
        if (v8 != null) {
            v8.e();
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(X21.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        V8 v8 = this.B;
        if (v8 != null) {
            v8.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        V8 v8 = this.B;
        if (v8 != null) {
            v8.g(mode);
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        M9 m9 = this.D;
        if (m9 != null) {
            m9.q(context, i);
        }
    }

    public U8(Context context, AttributeSet attributeSet, int i) {
        super(W31.b(context), attributeSet, i);
        AbstractC4163e31.a(this, getContext());
        M9 m9 = new M9(this);
        this.D = m9;
        m9.m(attributeSet, i);
        m9.b();
        R8 r8 = new R8(this);
        this.C = r8;
        r8.e(attributeSet, i);
        V8 v8 = new V8(this);
        this.B = v8;
        v8.d(attributeSet, i);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(G9.b(getContext(), i));
    }
}
