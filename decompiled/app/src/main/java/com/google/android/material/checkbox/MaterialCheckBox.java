package com.google.android.material.checkbox;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.daaw.AbstractC2467Up;
import com.daaw.AbstractC2633We1;
import com.daaw.AbstractC3779ch0;
import com.daaw.AbstractC3885d31;
import com.daaw.AbstractC3931dD0;
import com.daaw.AbstractC4336eh0;
import com.daaw.AbstractC5338iE;
import com.daaw.AbstractC5894kD0;
import com.daaw.AbstractC6314li0;
import com.daaw.AbstractC6867nh0;
import com.daaw.AbstractC7255p4;
import com.daaw.AbstractC7812r4;
import com.daaw.C4181e7;
import com.daaw.G6;
import com.daaw.G9;
import com.daaw.JC0;
import com.daaw.ND0;
import com.daaw.SD;
import com.daaw.SD0;
import com.daaw.WD0;
import com.daaw.Z31;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    public static final int c0 = SD0.l;
    public static final int[] d0 = {JC0.J};
    public static final int[] e0;
    public static final int[][] f0;
    public static final int g0;
    public final LinkedHashSet F;
    public final LinkedHashSet G;
    public ColorStateList H;
    public boolean I;
    public boolean J;
    public boolean K;
    public CharSequence L;
    public Drawable M;
    public Drawable N;
    public boolean O;
    public ColorStateList P;
    public ColorStateList Q;
    public PorterDuff.Mode R;
    public int S;
    public int[] T;
    public boolean U;
    public CharSequence V;
    public CompoundButton.OnCheckedChangeListener W;
    public final C4181e7 a0;
    public final G6 b0;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int B;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        public final String a() {
            int i = this.B;
            return i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.B));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.B = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    public class a extends G6 {
        public a() {
        }

        @Override // com.daaw.G6
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.P;
            if (colorStateList != null) {
                SD.o(drawable, colorStateList);
            }
        }

        @Override // com.daaw.G6
        public void c(Drawable drawable) {
            super.c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.P;
            if (colorStateList != null) {
                SD.n(drawable, colorStateList.getColorForState(materialCheckBox.T, MaterialCheckBox.this.P.getDefaultColor()));
            }
        }
    }

    static {
        int i = JC0.I;
        e0 = new int[]{i};
        f0 = new int[][]{new int[]{R.attr.state_enabled, i}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        g0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, JC0.c);
    }

    private String getButtonStateDescription() {
        int i = this.S;
        return i == 1 ? getResources().getString(ND0.h) : i == 0 ? getResources().getString(ND0.j) : getResources().getString(ND0.i);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.H == null) {
            int[][] iArr = f0;
            int[] iArr2 = new int[iArr.length];
            int iD = AbstractC3779ch0.d(this, JC0.e);
            int iD2 = AbstractC3779ch0.d(this, JC0.g);
            int iD3 = AbstractC3779ch0.d(this, JC0.k);
            int iD4 = AbstractC3779ch0.d(this, JC0.h);
            iArr2[0] = AbstractC3779ch0.j(iD3, iD2, 1.0f);
            iArr2[1] = AbstractC3779ch0.j(iD3, iD, 1.0f);
            iArr2[2] = AbstractC3779ch0.j(iD3, iD4, 0.54f);
            iArr2[3] = AbstractC3779ch0.j(iD3, iD4, 0.38f);
            iArr2[4] = AbstractC3779ch0.j(iD3, iD4, 0.38f);
            this.H = new ColorStateList(iArr, iArr2);
        }
        return this.H;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.P;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final boolean c(Z31 z31) {
        return z31.n(WD0.U2, 0) == g0 && z31.n(WD0.V2, 0) == 0;
    }

    public boolean d() {
        return this.K;
    }

    public final void e() {
        this.M = AbstractC5338iE.b(this.M, this.P, AbstractC2467Up.c(this));
        this.N = AbstractC5338iE.b(this.N, this.Q, this.R);
        g();
        h();
        super.setButtonDrawable(AbstractC5338iE.a(this.M, this.N));
        refreshDrawableState();
    }

    public final void f() {
        if (Build.VERSION.SDK_INT < 30 || this.V != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    public final void g() {
        C4181e7 c4181e7;
        if (this.O) {
            C4181e7 c4181e72 = this.a0;
            if (c4181e72 != null) {
                c4181e72.g(this.b0);
                this.a0.c(this.b0);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable = this.M;
                if (!(drawable instanceof AnimatedStateListDrawable) || (c4181e7 = this.a0) == null) {
                    return;
                }
                ((AnimatedStateListDrawable) drawable).addTransition(AbstractC5894kD0.b, AbstractC5894kD0.P, c4181e7, false);
                ((AnimatedStateListDrawable) this.M).addTransition(AbstractC5894kD0.h, AbstractC5894kD0.P, this.a0, false);
            }
        }
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.M;
    }

    public Drawable getButtonIconDrawable() {
        return this.N;
    }

    public ColorStateList getButtonIconTintList() {
        return this.Q;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.R;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.P;
    }

    public int getCheckedState() {
        return this.S;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.L;
    }

    public final void h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.M;
        if (drawable != null && (colorStateList2 = this.P) != null) {
            SD.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.N;
        if (drawable2 == null || (colorStateList = this.Q) == null) {
            return;
        }
        SD.o(drawable2, colorStateList);
    }

    public final void i() {
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.S == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.I && this.P == null && this.Q == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, d0);
        }
        if (d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, e0);
        }
        this.T = AbstractC5338iE.d(iArrOnCreateDrawableState);
        i();
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.J || !TextUtils.isEmpty(getText()) || (drawableA = AbstractC2467Up.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (AbstractC2633We1.e(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            SD.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.L));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.B);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.B = getCheckedState();
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(G9.b(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.N = drawable;
        e();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(G9.b(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.Q == colorStateList) {
            return;
        }
        this.Q = colorStateList;
        e();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.R == mode) {
            return;
        }
        this.R = mode;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.P == colorStateList) {
            return;
        }
        this.P = colorStateList;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.J = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManagerA;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.S != i) {
            this.S = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            f();
            if (this.U) {
                return;
            }
            this.U = true;
            LinkedHashSet linkedHashSet = this.G;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    AbstractC6314li0.a(it.next());
                    throw null;
                }
            }
            if (this.S != 2 && (onCheckedChangeListener = this.W) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManagerA = AbstractC7812r4.a(getContext().getSystemService(AbstractC7255p4.a()))) != null) {
                autofillManagerA.notifyValueChanged(this);
            }
            this.U = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        i();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.L = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.K == z) {
            return;
        }
        this.K = z;
        refreshDrawableState();
        Iterator it = this.F.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.W = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.V = charSequence;
        if (charSequence == null) {
            f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.I = z;
        if (z) {
            AbstractC2467Up.d(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC2467Up.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i) {
        int i2 = c0;
        super(AbstractC6867nh0.c(context, attributeSet, i, i2), attributeSet, i);
        this.F = new LinkedHashSet();
        this.G = new LinkedHashSet();
        this.a0 = C4181e7.a(getContext(), AbstractC3931dD0.e);
        this.b0 = new a();
        Context context2 = getContext();
        this.M = AbstractC2467Up.a(this);
        this.P = getSuperButtonTintList();
        setSupportButtonTintList(null);
        Z31 z31J = AbstractC3885d31.j(context2, attributeSet, WD0.T2, i, i2, new int[0]);
        this.N = z31J.g(WD0.W2);
        if (this.M != null && AbstractC3885d31.g(context2) && c(z31J)) {
            super.setButtonDrawable((Drawable) null);
            this.M = G9.b(context2, AbstractC3931dD0.d);
            this.O = true;
            if (this.N == null) {
                this.N = G9.b(context2, AbstractC3931dD0.f);
            }
        }
        this.Q = AbstractC4336eh0.b(context2, z31J, WD0.X2);
        this.R = AbstractC2633We1.f(z31J.k(WD0.Y2, -1), PorterDuff.Mode.SRC_IN);
        this.I = z31J.a(WD0.d3, false);
        this.J = z31J.a(WD0.Z2, true);
        this.K = z31J.a(WD0.c3, false);
        this.L = z31J.p(WD0.b3);
        if (z31J.s(WD0.a3)) {
            setCheckedState(z31J.k(WD0.a3, 0));
        }
        z31J.x();
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.M = drawable;
        this.O = false;
        e();
    }
}
