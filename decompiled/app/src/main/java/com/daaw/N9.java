package com.daaw;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.daaw.AbstractC6111ky0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class N9 extends TextView implements InterfaceC3333b41 {
    public final R8 B;
    public final M9 C;
    public final L9 D;
    public C8674u9 E;
    public boolean F;
    public a G;
    public Future H;

    public interface a {
        void a(int[] iArr, int i);

        int[] b();

        TextClassifier c();

        int d();

        void e(TextClassifier textClassifier);

        void f(int i);

        void g(int i, int i2, int i3, int i4);

        int h();

        int i();

        void j(int i);

        int k();

        void l(int i);

        void m(int i, float f);
    }

    public class c extends b {
        public c() {
            super();
        }

        @Override // com.daaw.N9.b, com.daaw.N9.a
        public void f(int i) {
            N9.super.setLastBaselineToBottomHeight(i);
        }

        @Override // com.daaw.N9.b, com.daaw.N9.a
        public void j(int i) {
            N9.super.setFirstBaselineToTopHeight(i);
        }
    }

    public class d extends c {
        public d() {
            super();
        }

        @Override // com.daaw.N9.b, com.daaw.N9.a
        public void m(int i, float f) {
            N9.super.setLineHeight(i, f);
        }
    }

    public N9(Context context) {
        this(context, null);
    }

    private C8674u9 getEmojiTextViewHelper() {
        if (this.E == null) {
            this.E = new C8674u9(this);
        }
        return this.E;
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
            return getSuperCaller().d();
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
            return getSuperCaller().i();
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
            return getSuperCaller().k();
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
            return getSuperCaller().b();
        }
        M9 m9 = this.C;
        return m9 != null ? m9.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (AbstractC2737Xe1.c) {
            return getSuperCaller().h() == 1 ? 1 : 0;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return X21.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return X21.c(this);
    }

    public a getSuperCaller() {
        if (this.G == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.G = new d();
            } else if (i >= 28) {
                this.G = new c();
            } else if (i >= 26) {
                this.G = new b();
            }
        }
        return this.G;
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
    public CharSequence getText() {
        r();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        L9 l9;
        return (Build.VERSION.SDK_INT >= 28 || (l9 = this.D) == null) ? getSuperCaller().c() : l9.a();
    }

    public AbstractC6111ky0.a getTextMetricsParamsCompat() {
        return X21.f(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.C.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return AbstractC8960v9.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        M9 m9 = this.C;
        if (m9 != null) {
            m9.o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        r();
        super.onMeasure(i, i2);
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

    public final void r() {
        Future future = this.H;
        if (future != null) {
            try {
                this.H = null;
                AbstractC6314li0.a(future.get());
                X21.n(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC2737Xe1.c) {
            getSuperCaller().g(i, i2, i3, i4);
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
            getSuperCaller().a(iArr, i);
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
            getSuperCaller().l(i);
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

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        M9 m9 = this.C;
        if (m9 != null) {
            m9.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        M9 m9 = this.C;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i);
        } else {
            X21.j(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i);
        } else {
            X21.k(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        X21.l(this, i);
    }

    public void setPrecomputedText(AbstractC6111ky0 abstractC6111ky0) {
        X21.n(this, abstractC6111ky0);
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
    public void setTextClassifier(TextClassifier textClassifier) {
        L9 l9;
        if (Build.VERSION.SDK_INT >= 28 || (l9 = this.D) == null) {
            getSuperCaller().e(textClassifier);
        } else {
            l9.b(textClassifier);
        }
    }

    public void setTextFuture(Future<AbstractC6111ky0> future) {
        this.H = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(AbstractC6111ky0.a aVar) {
        X21.p(this, aVar);
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

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        if (this.F) {
            return;
        }
        Typeface typefaceA = (typeface == null || i <= 0) ? null : Q81.a(getContext(), typeface, i);
        this.F = true;
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.F = false;
        }
    }

    public N9(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().m(i, f);
        } else {
            X21.m(this, i, f);
        }
    }

    public N9(Context context, AttributeSet attributeSet, int i) {
        super(W31.b(context), attributeSet, i);
        this.F = false;
        this.G = null;
        AbstractC4163e31.a(this, getContext());
        R8 r8 = new R8(this);
        this.B = r8;
        r8.e(attributeSet, i);
        M9 m9 = new M9(this);
        this.C = m9;
        m9.m(attributeSet, i);
        m9.b();
        this.D = new L9(this);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? G9.b(context, i) : null, i2 != 0 ? G9.b(context, i2) : null, i3 != 0 ? G9.b(context, i3) : null, i4 != 0 ? G9.b(context, i4) : null);
        M9 m9 = this.C;
        if (m9 != null) {
            m9.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? G9.b(context, i) : null, i2 != 0 ? G9.b(context, i2) : null, i3 != 0 ? G9.b(context, i3) : null, i4 != 0 ? G9.b(context, i4) : null);
        M9 m9 = this.C;
        if (m9 != null) {
            m9.p();
        }
    }

    public class b implements a {
        public b() {
        }

        @Override // com.daaw.N9.a
        public void a(int[] iArr, int i) {
            N9.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @Override // com.daaw.N9.a
        public int[] b() {
            return N9.super.getAutoSizeTextAvailableSizes();
        }

        @Override // com.daaw.N9.a
        public TextClassifier c() {
            return N9.super.getTextClassifier();
        }

        @Override // com.daaw.N9.a
        public int d() {
            return N9.super.getAutoSizeMaxTextSize();
        }

        @Override // com.daaw.N9.a
        public void e(TextClassifier textClassifier) {
            N9.super.setTextClassifier(textClassifier);
        }

        @Override // com.daaw.N9.a
        public void g(int i, int i2, int i3, int i4) {
            N9.super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @Override // com.daaw.N9.a
        public int h() {
            return N9.super.getAutoSizeTextType();
        }

        @Override // com.daaw.N9.a
        public int i() {
            return N9.super.getAutoSizeMinTextSize();
        }

        @Override // com.daaw.N9.a
        public int k() {
            return N9.super.getAutoSizeStepGranularity();
        }

        @Override // com.daaw.N9.a
        public void l(int i) {
            N9.super.setAutoSizeTextTypeWithDefaults(i);
        }

        @Override // com.daaw.N9.a
        public void f(int i) {
        }

        @Override // com.daaw.N9.a
        public void j(int i) {
        }

        @Override // com.daaw.N9.a
        public void m(int i, float f) {
        }
    }
}
