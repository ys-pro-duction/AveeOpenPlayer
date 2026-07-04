package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC2633We1;
import com.daaw.AbstractC3885d31;
import com.daaw.AbstractC4232eJ;
import com.daaw.AbstractC4336eh0;
import com.daaw.AbstractC5183hh0;
import com.daaw.AbstractC6867nh0;
import com.daaw.C5671jR0;
import com.daaw.C9683xl0;
import com.daaw.DR0;
import com.daaw.InterfaceC3501bh0;
import com.daaw.JC0;
import com.daaw.L11;
import com.daaw.N11;
import com.daaw.ND0;
import com.daaw.NJ0;
import com.daaw.SD0;
import com.daaw.WD0;
import com.daaw.Z1;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class Chip extends AppCompatCheckBox implements a.InterfaceC0264a, DR0, Checkable {
    public static final int a0 = SD0.k;
    public static final Rect b0 = new Rect();
    public static final int[] c0 = {R.attr.state_selected};
    public static final int[] d0 = {R.attr.state_checkable};
    public com.google.android.material.chip.a F;
    public InsetDrawable G;
    public RippleDrawable H;
    public View.OnClickListener I;
    public CompoundButton.OnCheckedChangeListener J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public CharSequence R;
    public final c S;
    public boolean T;
    public final Rect U;
    public final RectF V;
    public final N11 W;

    public class a extends N11 {
        public a() {
        }

        @Override // com.daaw.N11
        public void a(int i) {
        }

        @Override // com.daaw.N11
        public void b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.F.F2() ? Chip.this.F.a1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.F != null) {
                Chip.this.F.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    public class c extends AbstractC4232eJ {
        public c(Chip chip) {
            super(chip);
        }

        @Override // com.daaw.AbstractC4232eJ
        public int B(float f, float f2) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }

        @Override // com.daaw.AbstractC4232eJ
        public void C(List list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.I != null) {
                list.add(1);
            }
        }

        @Override // com.daaw.AbstractC4232eJ
        public boolean J(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.t();
            }
            return false;
        }

        @Override // com.daaw.AbstractC4232eJ
        public void M(Z1 z1) {
            z1.l0(Chip.this.r());
            z1.o0(Chip.this.isClickable());
            z1.n0(Chip.this.getAccessibilityClassName());
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                z1.T0(text);
            } else {
                z1.r0(text);
            }
        }

        @Override // com.daaw.AbstractC4232eJ
        public void N(int i, Z1 z1) {
            if (i != 1) {
                z1.r0("");
                z1.j0(Chip.b0);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                z1.r0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                z1.r0(Chip.this.getContext().getString(ND0.k, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            z1.j0(Chip.this.getCloseIconTouchBoundsInt());
            z1.b(Z1.a.i);
            z1.u0(Chip.this.isEnabled());
        }

        @Override // com.daaw.AbstractC4232eJ
        public void O(int i, boolean z) {
            if (i == 1) {
                Chip.this.N = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, JC0.d);
    }

    public static /* synthetic */ void b(Chip chip, CompoundButton compoundButton, boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.J;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.V.setEmpty();
        if (n() && this.I != null) {
            this.F.R0(this.V);
        }
        return this.V;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.U.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.U;
    }

    private L11 getTextAppearance() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.b1();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.M != z) {
            this.M = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.L != z) {
            this.L = z;
            refreshDrawableState();
        }
    }

    public final void A() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.F) == null) {
            return;
        }
        int iC0 = (int) (aVar.C0() + this.F.c1() + this.F.j0());
        int iH0 = (int) (this.F.H0() + this.F.d1() + this.F.f0());
        if (this.G != null) {
            Rect rect = new Rect();
            this.G.getPadding(rect);
            iH0 += rect.left;
            iC0 += rect.right;
        }
        AbstractC2317Td1.E0(this, iH0, getPaddingTop(), iC0, getPaddingBottom());
    }

    public final void B() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        L11 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.W);
        }
    }

    public final void C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
    }

    @Override // com.google.android.material.chip.a.InterfaceC0264a
    public void a() {
        l(this.Q);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.T ? super.dispatchHoverEvent(motionEvent) : this.S.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.T) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.S.w(keyEvent) || this.S.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.F;
        if ((aVar == null || !aVar.i1()) ? false : this.F.e2(k())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.R)) {
            return this.R;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.G;
        return insetDrawable == null ? this.F : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.y0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.z0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.A0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return Math.max(0.0f, aVar.B0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.F;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.C0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.D0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.E0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.F0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.G0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.H0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.I0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.J0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.K0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.L0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.M0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.N0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.O0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.Q0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.U0();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.T && (this.S.A() == 1 || this.S.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C9683xl0 getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.V0();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.W0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.X0();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.Y0();
        }
        return null;
    }

    public C5671jR0 getShapeAppearanceModel() {
        return this.F.A();
    }

    public C9683xl0 getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.Z0();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.c1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            return aVar.d1();
        }
        return 0.0f;
    }

    public final void j(com.google.android.material.chip.a aVar) {
        aVar.i2(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int[] k() {
        ?? IsEnabled = isEnabled();
        int i = IsEnabled;
        if (this.N) {
            i = IsEnabled + 1;
        }
        int i2 = i;
        if (this.M) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (this.L) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (isChecked()) {
            i4 = i3 + 1;
        }
        int[] iArr = new int[i4];
        int i5 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i5 = 1;
        }
        if (this.N) {
            iArr[i5] = 16842908;
            i5++;
        }
        if (this.M) {
            iArr[i5] = 16843623;
            i5++;
        }
        if (this.L) {
            iArr[i5] = 16842919;
            i5++;
        }
        if (isChecked()) {
            iArr[i5] = 16842913;
        }
        return iArr;
    }

    public boolean l(int i) {
        this.Q = i;
        if (!v()) {
            if (this.G != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int iMax = Math.max(0, i - this.F.getIntrinsicHeight());
        int iMax2 = Math.max(0, i - this.F.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.G != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.G != null) {
            Rect rect = new Rect();
            this.G.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                y();
                return true;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        q(i2, i3, i2, i3);
        y();
        return true;
    }

    public final void m() {
        if (getBackgroundDrawable() == this.G && this.F.getCallback() == null) {
            this.F.setCallback(this.G);
        }
    }

    public final boolean n() {
        com.google.android.material.chip.a aVar = this.F;
        return (aVar == null || aVar.K0() == null) ? false : true;
    }

    public final void o(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayI = AbstractC3885d31.i(context, attributeSet, WD0.Z, i, a0, new int[0]);
        this.O = typedArrayI.getBoolean(WD0.G0, false);
        this.Q = (int) Math.ceil(typedArrayI.getDimension(WD0.u0, (float) Math.ceil(AbstractC2633We1.b(getContext(), 48))));
        typedArrayI.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC5183hh0.f(this, this.F);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, c0);
        }
        if (r()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, d0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.T) {
            this.S.I(z, i, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.P != i) {
            this.P = i;
            A();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L35
            goto L40
        L21:
            boolean r0 = r5.L
            if (r0 == 0) goto L40
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = 1
            goto L41
        L2c:
            boolean r0 = r5.L
            if (r0 == 0) goto L35
            r5.t()
            r0 = 1
            goto L36
        L35:
            r0 = 0
        L36:
            r5.setCloseIconPressed(r3)
            goto L41
        L3a:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
            goto L2a
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            return r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        setOutlineProvider(new b());
    }

    public final void q(int i, int i2, int i3, int i4) {
        this.G = new InsetDrawable((Drawable) this.F, i, i2, i3, i4);
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.F;
        return aVar != null && aVar.h1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.F;
        return aVar != null && aVar.j1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.R = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.H) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.H) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.q1(z);
        }
    }

    public void setCheckableResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.r1(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar == null) {
            this.K = z;
        } else if (aVar.h1()) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.s1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.t1(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.u1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.v1(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.w1(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.y1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.z1(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.A1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.B1(i);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.F;
        if (aVar2 != aVar) {
            w(aVar2);
            this.F = aVar;
            aVar.t2(false);
            j(this.F);
            l(this.Q);
        }
    }

    public void setChipEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.C1(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.D1(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.E1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.F1(i);
        }
    }

    public void setChipIconSize(float f) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.G1(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.H1(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.I1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.J1(i);
        }
    }

    public void setChipIconVisible(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.K1(i);
        }
    }

    public void setChipMinHeight(float f) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.M1(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.N1(i);
        }
    }

    public void setChipStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.O1(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.P1(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.Q1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.R1(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.S1(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.T1(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.V1(drawable);
        }
        x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.W1(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.X1(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.Y1(i);
        }
    }

    public void setCloseIconResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.Z1(i);
        }
        x();
    }

    public void setCloseIconSize(float f) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.a2(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.b2(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.c2(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.d2(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.f2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.g2(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.R(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.F == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.j2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.O = z;
        l(this.Q);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    public void setHideMotionSpec(C9683xl0 c9683xl0) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.k2(c9683xl0);
        }
    }

    public void setHideMotionSpecResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.l2(i);
        }
    }

    public void setIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.m2(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.n2(i);
        }
    }

    public void setIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.o2(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.p2(i);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.F == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.q2(i);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.J = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.I = onClickListener;
        x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.r2(colorStateList);
        }
        if (this.F.f1()) {
            return;
        }
        z();
    }

    public void setRippleColorResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.s2(i);
            if (this.F.f1()) {
                return;
            }
            z();
        }
    }

    @Override // com.daaw.DR0
    public void setShapeAppearanceModel(C5671jR0 c5671jR0) {
        this.F.setShapeAppearanceModel(c5671jR0);
    }

    public void setShowMotionSpec(C9683xl0 c9683xl0) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.u2(c9683xl0);
        }
    }

    public void setShowMotionSpecResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.v2(i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.F2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.F;
        if (aVar2 != null) {
            aVar2.w2(charSequence);
        }
    }

    public void setTextAppearance(L11 l11) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.x2(l11);
        }
        B();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.z2(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.A2(i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.B2(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics()));
        }
        B();
    }

    public void setTextStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.C2(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.D2(i);
        }
    }

    public boolean t() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.I;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.T) {
            this.S.U(1, 1);
        }
        return z;
    }

    public final void u() {
        if (this.G != null) {
            this.G = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            y();
        }
    }

    public boolean v() {
        return this.O;
    }

    public final void w(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.i2(null);
        }
    }

    public final void x() {
        if (n() && s() && this.I != null) {
            AbstractC2317Td1.p0(this, this.S);
            this.T = true;
        } else {
            AbstractC2317Td1.p0(this, null);
            this.T = false;
        }
    }

    public final void y() {
        if (NJ0.a) {
            z();
            return;
        }
        this.F.E2(true);
        AbstractC2317Td1.t0(this, getBackgroundDrawable());
        A();
        m();
    }

    public final void z() {
        this.H = new RippleDrawable(NJ0.b(this.F.Y0()), getBackgroundDrawable(), null);
        this.F.E2(false);
        AbstractC2317Td1.t0(this, this.H);
        A();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        int i2 = a0;
        super(AbstractC6867nh0.c(context, attributeSet, i, i2), attributeSet, i);
        this.U = new Rect();
        this.V = new RectF();
        this.W = new a();
        Context context2 = getContext();
        C(attributeSet);
        com.google.android.material.chip.a aVarO0 = com.google.android.material.chip.a.o0(context2, attributeSet, i, i2);
        o(context2, attributeSet, i);
        setChipDrawable(aVarO0);
        aVarO0.R(AbstractC2317Td1.x(this));
        TypedArray typedArrayI = AbstractC3885d31.i(context2, attributeSet, WD0.Z, i, i2, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(AbstractC4336eh0.a(context2, typedArrayI, WD0.c0));
        }
        boolean zHasValue = typedArrayI.hasValue(WD0.L0);
        typedArrayI.recycle();
        this.S = new c(this);
        x();
        if (!zHasValue) {
            p();
        }
        setChecked(this.K);
        setText(aVarO0.a1());
        setEllipsize(aVarO0.U0());
        B();
        if (!this.F.F2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        A();
        if (v()) {
            setMinHeight(this.Q);
        }
        this.P = AbstractC2317Td1.D(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.daaw.Mk
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Chip.b(this.a, compoundButton, z);
            }
        });
    }

    public void setCloseIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.h2(z);
        }
        x();
    }

    public void setCheckedIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.x1(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.L1(z);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.y2(i);
        }
        B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        com.google.android.material.chip.a aVar = this.F;
        if (aVar != null) {
            aVar.y2(i);
        }
        B();
    }

    public void setInternalOnCheckedChangeListener(InterfaceC3501bh0 interfaceC3501bh0) {
    }
}
