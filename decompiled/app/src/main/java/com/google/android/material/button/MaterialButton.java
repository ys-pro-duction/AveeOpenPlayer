package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.customview.view.AbsSavedState;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC2633We1;
import com.daaw.AbstractC3885d31;
import com.daaw.AbstractC4336eh0;
import com.daaw.AbstractC5183hh0;
import com.daaw.AbstractC6314li0;
import com.daaw.AbstractC6867nh0;
import com.daaw.C2952Zg0;
import com.daaw.C5671jR0;
import com.daaw.DR0;
import com.daaw.G9;
import com.daaw.JC0;
import com.daaw.S8;
import com.daaw.SD;
import com.daaw.SD0;
import com.daaw.WD0;
import com.daaw.X21;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialButton extends S8 implements Checkable, DR0 {
    public static final int[] S = {R.attr.state_checkable};
    public static final int[] T = {R.attr.state_checked};
    public static final int U = SD0.j;
    public final C2952Zg0 E;
    public final LinkedHashSet F;
    public a G;
    public PorterDuff.Mode H;
    public ColorStateList I;
    public Drawable J;
    public String K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public int R;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean D;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void b(Parcel parcel) {
            this.D = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.D ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, JC0.r);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    public boolean a() {
        C2952Zg0 c2952Zg0 = this.E;
        return c2952Zg0 != null && c2952Zg0.p();
    }

    public final boolean b() {
        int i = this.R;
        return i == 3 || i == 4;
    }

    public final boolean c() {
        int i = this.R;
        return i == 1 || i == 2;
    }

    public final boolean d() {
        int i = this.R;
        return i == 16 || i == 32;
    }

    public final boolean e() {
        return AbstractC2317Td1.D(this) == 1;
    }

    public final boolean f() {
        C2952Zg0 c2952Zg0 = this.E;
        return (c2952Zg0 == null || c2952Zg0.o()) ? false : true;
    }

    public final void g() {
        if (c()) {
            X21.i(this, this.J, null, null, null);
        } else if (b()) {
            X21.i(this, null, null, this.J, null);
        } else if (d()) {
            X21.i(this, null, this.J, null, null);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.K)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.K;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.E.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.J;
    }

    public int getIconGravity() {
        return this.R;
    }

    public int getIconPadding() {
        return this.O;
    }

    public int getIconSize() {
        return this.L;
    }

    public ColorStateList getIconTint() {
        return this.I;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.H;
    }

    public int getInsetBottom() {
        return this.E.c();
    }

    public int getInsetTop() {
        return this.E.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.E.h();
        }
        return null;
    }

    public C5671jR0 getShapeAppearanceModel() {
        if (f()) {
            return this.E.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.E.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.E.k();
        }
        return 0;
    }

    @Override // com.daaw.S8
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.E.l() : super.getSupportBackgroundTintList();
    }

    @Override // com.daaw.S8
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.E.m() : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z) {
        Drawable drawable = this.J;
        if (drawable != null) {
            Drawable drawableMutate = SD.r(drawable).mutate();
            this.J = drawableMutate;
            SD.o(drawableMutate, this.I);
            PorterDuff.Mode mode = this.H;
            if (mode != null) {
                SD.p(this.J, mode);
            }
            int intrinsicWidth = this.L;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.J.getIntrinsicWidth();
            }
            int intrinsicHeight = this.L;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.J.getIntrinsicHeight();
            }
            Drawable drawable2 = this.J;
            int i = this.M;
            int i2 = this.N;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.J.setVisible(true, z);
        }
        if (z) {
            g();
            return;
        }
        Drawable[] drawableArrA = X21.a(this);
        Drawable drawable3 = drawableArrA[0];
        Drawable drawable4 = drawableArrA[1];
        Drawable drawable5 = drawableArrA[2];
        if ((!c() || drawable3 == this.J) && ((!b() || drawable5 == this.J) && (!d() || drawable4 == this.J))) {
            return;
        }
        g();
    }

    public final void i(int i, int i2) {
        if (this.J == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.M = 0;
                if (this.R == 16) {
                    this.N = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.L;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.J.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.O) - getPaddingBottom()) / 2);
                if (this.N != iMax) {
                    this.N = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.N = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i3 = this.R;
        if (i3 == 1 || i3 == 3 || ((i3 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i3 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.M = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.L;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.J.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - AbstractC2317Td1.H(this)) - intrinsicWidth) - this.O) - AbstractC2317Td1.I(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (e() != (this.R == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.M != textLayoutWidth) {
            this.M = textLayoutWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.P;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            AbstractC5183hh0.f(this, this.E.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, S);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, T);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // com.daaw.S8, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // com.daaw.S8, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // com.daaw.S8, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C2952Zg0 c2952Zg0;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (c2952Zg0 = this.E) != null) {
            c2952Zg0.J(i4 - i2, i3 - i);
        }
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.D);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.D = this.P;
        return savedState;
    }

    @Override // com.daaw.S8, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.E.q()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.J != null) {
            if (this.J.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.K = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (f()) {
            this.E.s(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // com.daaw.S8, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!f()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
        } else {
            this.E.t();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // com.daaw.S8, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? G9.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (f()) {
            this.E.u(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (a() && isEnabled() && this.P != z) {
            this.P = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.P);
            }
            if (this.Q) {
                return;
            }
            this.Q = true;
            Iterator it = this.F.iterator();
            if (it.hasNext()) {
                AbstractC6314li0.a(it.next());
                throw null;
            }
            this.Q = false;
        }
    }

    public void setCornerRadius(int i) {
        if (f()) {
            this.E.v(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (f()) {
            this.E.f().R(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.J != drawable) {
            this.J = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.R != i) {
            this.R = i;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.O != i) {
            this.O = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? G9.b(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.L != i) {
            this.L = i;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.H != mode) {
            this.H = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(G9.a(getContext(), i));
    }

    public void setInsetBottom(int i) {
        this.E.w(i);
    }

    public void setInsetTop(int i) {
        this.E.x(i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.G = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        a aVar = this.G;
        if (aVar != null) {
            aVar.a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.E.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (f()) {
            setRippleColor(G9.a(getContext(), i));
        }
    }

    @Override // com.daaw.DR0
    public void setShapeAppearanceModel(C5671jR0 c5671jR0) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.E.z(c5671jR0);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (f()) {
            this.E.A(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.E.B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (f()) {
            setStrokeColor(G9.a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (f()) {
            this.E.C(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // com.daaw.S8
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.E.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // com.daaw.S8
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.E.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.E.F(z);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.P);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = U;
        super(AbstractC6867nh0.c(context, attributeSet, i, i2), attributeSet, i);
        this.F = new LinkedHashSet();
        this.P = false;
        this.Q = false;
        Context context2 = getContext();
        TypedArray typedArrayI = AbstractC3885d31.i(context2, attributeSet, WD0.Y1, i, i2, new int[0]);
        this.O = typedArrayI.getDimensionPixelSize(WD0.l2, 0);
        this.H = AbstractC2633We1.f(typedArrayI.getInt(WD0.o2, -1), PorterDuff.Mode.SRC_IN);
        this.I = AbstractC4336eh0.a(getContext(), typedArrayI, WD0.n2);
        this.J = AbstractC4336eh0.d(getContext(), typedArrayI, WD0.j2);
        this.R = typedArrayI.getInteger(WD0.k2, 1);
        this.L = typedArrayI.getDimensionPixelSize(WD0.m2, 0);
        C2952Zg0 c2952Zg0 = new C2952Zg0(this, C5671jR0.e(context2, attributeSet, i, i2).m());
        this.E = c2952Zg0;
        c2952Zg0.r(typedArrayI);
        typedArrayI.recycle();
        setCompoundDrawablePadding(this.O);
        h(this.J != null);
    }
}
