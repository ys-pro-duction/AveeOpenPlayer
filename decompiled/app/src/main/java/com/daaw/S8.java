package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: loaded from: classes.dex */
public class S8 extends Button implements InterfaceC3333b41 {
    public final R8 B;
    public final M9 C;
    public C8674u9 D;

    public S8(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, KC0.n);
    }

    private C8674u9 getEmojiTextViewHelper() {
        if (this.D == null) {
            this.D = new C8674u9(this);
        }
        return this.D;
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

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC2737Xe1.c) {
            return super.getAutoSizeMaxTextSize();
        }
        M9 m9 = this.C;
        if (m9 != null) {
            return m9.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC2737Xe1.c) {
            return super.getAutoSizeMinTextSize();
        }
        M9 m9 = this.C;
        if (m9 != null) {
            return m9.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC2737Xe1.c) {
            return super.getAutoSizeStepGranularity();
        }
        M9 m9 = this.C;
        if (m9 != null) {
            return m9.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC2737Xe1.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        M9 m9 = this.C;
        return m9 != null ? m9.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (AbstractC2737Xe1.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        M9 m9 = this.C;
        if (m9 != null) {
            return m9.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return X21.q(super.getCustomSelectionActionModeCallback());
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        M9 m9 = this.C;
        if (m9 != null) {
            m9.o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        M9 m9 = this.C;
        if (m9 == null || AbstractC2737Xe1.c || !m9.l()) {
            return;
        }
        this.C.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC2737Xe1.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        M9 m9 = this.C;
        if (m9 != null) {
            m9.t(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC2737Xe1.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        M9 m9 = this.C;
        if (m9 != null) {
            m9.u(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC2737Xe1.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        M9 m9 = this.C;
        if (m9 != null) {
            m9.v(i);
        }
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(X21.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        M9 m9 = this.C;
        if (m9 != null) {
            m9.s(z);
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

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (AbstractC2737Xe1.c) {
            super.setTextSize(i, f);
            return;
        }
        M9 m9 = this.C;
        if (m9 != null) {
            m9.A(i, f);
        }
    }

    public S8(Context context, AttributeSet attributeSet, int i) {
        super(W31.b(context), attributeSet, i);
        AbstractC4163e31.a(this, getContext());
        R8 r8 = new R8(this);
        this.B = r8;
        r8.e(attributeSet, i);
        M9 m9 = new M9(this);
        this.C = m9;
        m9.m(attributeSet, i);
        m9.b();
        getEmojiTextViewHelper().c(attributeSet, i);
    }
}
