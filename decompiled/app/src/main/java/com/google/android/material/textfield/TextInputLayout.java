package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.daaw.AZ;
import com.daaw.AbstractC0395Az;
import com.daaw.AbstractC10010yv;
import com.daaw.AbstractC10241zl0;
import com.daaw.AbstractC1576Mg0;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC2633We1;
import com.daaw.AbstractC3779ch0;
import com.daaw.AbstractC3885d31;
import com.daaw.AbstractC4336eh0;
import com.daaw.AbstractC5059hE;
import com.daaw.AbstractC5894kD0;
import com.daaw.AbstractC6867nh0;
import com.daaw.AbstractC6991o7;
import com.daaw.AbstractC7305pF;
import com.daaw.AbstractC9221w51;
import com.daaw.AbstractC9438ws;
import com.daaw.C0664Dm;
import com.daaw.C2848Yg0;
import com.daaw.C4007dW0;
import com.daaw.C4904gh0;
import com.daaw.C5554j1;
import com.daaw.C5671jR0;
import com.daaw.C6856nf;
import com.daaw.C8116s9;
import com.daaw.G9;
import com.daaw.HJ;
import com.daaw.JC0;
import com.daaw.N9;
import com.daaw.ND0;
import com.daaw.RC0;
import com.daaw.SD;
import com.daaw.SD0;
import com.daaw.WD0;
import com.daaw.X21;
import com.daaw.YC0;
import com.daaw.Z1;
import com.daaw.Z31;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout {
    public static final int Z0 = SD0.g;
    public static final int[][] a1 = {new int[]{R.attr.state_pressed}, new int[0]};
    public Typeface A0;
    public final FrameLayout B;
    public Drawable B0;
    public final C4007dW0 C;
    public int C0;
    public final com.google.android.material.textfield.a D;
    public final LinkedHashSet D0;
    public EditText E;
    public Drawable E0;
    public CharSequence F;
    public int F0;
    public int G;
    public Drawable G0;
    public int H;
    public ColorStateList H0;
    public int I;
    public ColorStateList I0;
    public int J;
    public int J0;
    public final AZ K;
    public int K0;
    public boolean L;
    public int L0;
    public int M;
    public ColorStateList M0;
    public boolean N;
    public int N0;
    public f O;
    public int O0;
    public TextView P;
    public int P0;
    public int Q;
    public int Q0;
    public int R;
    public int R0;
    public CharSequence S;
    public boolean S0;
    public boolean T;
    public final C0664Dm T0;
    public TextView U;
    public boolean U0;
    public ColorStateList V;
    public boolean V0;
    public int W;
    public ValueAnimator W0;
    public boolean X0;
    public boolean Y0;
    public HJ a0;
    public HJ b0;
    public ColorStateList c0;
    public ColorStateList d0;
    public boolean e0;
    public CharSequence f0;
    public boolean g0;
    public C4904gh0 h0;
    public C4904gh0 i0;
    public StateListDrawable j0;
    public boolean k0;
    public C4904gh0 l0;
    public C4904gh0 m0;
    public C5671jR0 n0;
    public boolean o0;
    public final int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public final Rect x0;
    public final Rect y0;
    public final RectF z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public CharSequence D;
        public boolean E;

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

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.D) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.D, parcel, i);
            parcel.writeInt(this.E ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.D = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.E = parcel.readInt() == 1;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.p0(!r0.Y0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.L) {
                textInputLayout.g0(editable);
            }
            if (TextInputLayout.this.T) {
                TextInputLayout.this.t0(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.D.h();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.E.requestLayout();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.T0.c0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends C5554j1 {
        public final TextInputLayout d;

        public e(TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        @Override // com.daaw.C5554j1
        public void g(View view, Z1 z1) {
            super.g(view, z1);
            EditText editText = this.d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.d.getHint();
            CharSequence error = this.d.getError();
            CharSequence placeholderText = this.d.getPlaceholderText();
            int counterMaxLength = this.d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zO = this.d.O();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            this.d.C.z(z1);
            if (!zIsEmpty) {
                z1.T0(text);
            } else if (!TextUtils.isEmpty(string)) {
                z1.T0(string);
                if (!zO && placeholderText != null) {
                    z1.T0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                z1.T0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    z1.z0(string);
                } else {
                    if (!zIsEmpty) {
                        string = ((Object) text) + ", " + string;
                    }
                    z1.T0(string);
                }
                z1.P0(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            z1.D0(counterMaxLength);
            if (z) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                z1.v0(error);
            }
            View viewT = this.d.K.t();
            if (viewT != null) {
                z1.A0(viewT);
            }
            this.d.D.m().o(view, z1);
        }

        @Override // com.daaw.C5554j1
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.d.D.m().p(view, accessibilityEvent);
        }
    }

    public interface f {
        int a(Editable editable);
    }

    public interface g {
        void a(TextInputLayout textInputLayout);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, JC0.L);
    }

    public static Drawable G(C4904gh0 c4904gh0, int i, int i2, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC3779ch0.j(i2, i, 0.1f), i}), c4904gh0, c4904gh0);
    }

    public static Drawable J(Context context, C4904gh0 c4904gh0, int i, int[][] iArr) {
        int iC = AbstractC3779ch0.c(context, JC0.k, "TextInputLayout");
        C4904gh0 c4904gh02 = new C4904gh0(c4904gh0.A());
        int iJ = AbstractC3779ch0.j(i, iC, 0.1f);
        c4904gh02.S(new ColorStateList(iArr, new int[]{iJ, 0}));
        c4904gh02.setTint(iC);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iJ, iC});
        C4904gh0 c4904gh03 = new C4904gh0(c4904gh0.A());
        c4904gh03.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c4904gh02, c4904gh03), c4904gh0});
    }

    public static void U(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                U((ViewGroup) childAt, z);
            }
        }
    }

    public static /* synthetic */ int a(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.E;
        if (!(editText instanceof AutoCompleteTextView) || AbstractC7305pF.a(editText)) {
            return this.h0;
        }
        int iD = AbstractC3779ch0.d(this.E, JC0.f);
        int i = this.q0;
        if (i == 2) {
            return J(getContext(), this.h0, iD, a1);
        }
        if (i == 1) {
            return G(this.h0, this.w0, iD, a1);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.j0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.j0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.j0.addState(new int[0], F(false));
        }
        return this.j0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.i0 == null) {
            this.i0 = F(true);
        }
        return this.i0;
    }

    public static void h0(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? ND0.c : ND0.b, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private void setEditText(EditText editText) {
        if (this.E != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3) {
            boolean z = editText instanceof TextInputEditText;
        }
        this.E = editText;
        int i = this.G;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.I);
        }
        int i2 = this.H;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.J);
        }
        this.k0 = false;
        R();
        setTextInputAccessibilityDelegate(new e(this));
        this.T0.i0(this.E.getTypeface());
        this.T0.a0(this.E.getTextSize());
        this.T0.X(this.E.getLetterSpacing());
        int gravity = this.E.getGravity();
        this.T0.S((gravity & (-113)) | 48);
        this.T0.Z(gravity);
        this.E.addTextChangedListener(new a());
        if (this.H0 == null) {
            this.H0 = this.E.getHintTextColors();
        }
        if (this.e0) {
            if (TextUtils.isEmpty(this.f0)) {
                CharSequence hint = this.E.getHint();
                this.F = hint;
                setHint(hint);
                this.E.setHint((CharSequence) null);
            }
            this.g0 = true;
        }
        if (this.P != null) {
            g0(this.E.getText());
        }
        l0();
        this.K.f();
        this.C.bringToFront();
        this.D.bringToFront();
        B();
        this.D.w0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        q0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f0)) {
            return;
        }
        this.f0 = charSequence;
        this.T0.g0(charSequence);
        if (this.S0) {
            return;
        }
        S();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.T == z) {
            return;
        }
        if (z) {
            i();
        } else {
            W();
            this.U = null;
        }
        this.T = z;
    }

    public final boolean A() {
        return this.e0 && !TextUtils.isEmpty(this.f0) && (this.h0 instanceof AbstractC10010yv);
    }

    public final void B() {
        Iterator it = this.D0.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this);
        }
    }

    public final void C(Canvas canvas) {
        C4904gh0 c4904gh0;
        if (this.m0 == null || (c4904gh0 = this.l0) == null) {
            return;
        }
        c4904gh0.draw(canvas);
        if (this.E.isFocused()) {
            Rect bounds = this.m0.getBounds();
            Rect bounds2 = this.l0.getBounds();
            float fX = this.T0.x();
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC6991o7.c(iCenterX, bounds2.left, fX);
            bounds.right = AbstractC6991o7.c(iCenterX, bounds2.right, fX);
            this.m0.draw(canvas);
        }
    }

    public final void D(Canvas canvas) {
        if (this.e0) {
            this.T0.l(canvas);
        }
    }

    public final void E(boolean z) {
        ValueAnimator valueAnimator = this.W0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.W0.cancel();
        }
        if (z && this.V0) {
            k(0.0f);
        } else {
            this.T0.c0(0.0f);
        }
        if (A() && ((AbstractC10010yv) this.h0).g0()) {
            x();
        }
        this.S0 = true;
        K();
        this.C.k(true);
        this.D.G(true);
    }

    public final C4904gh0 F(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(YC0.P);
        float f2 = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.E;
        float popupElevation = editText instanceof C2848Yg0 ? ((C2848Yg0) editText).getPopupElevation() : getResources().getDimensionPixelOffset(YC0.k);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(YC0.N);
        C5671jR0 c5671jR0M = C5671jR0.a().A(f2).E(f2).s(dimensionPixelOffset).w(dimensionPixelOffset).m();
        C4904gh0 c4904gh0M = C4904gh0.m(getContext(), popupElevation);
        c4904gh0M.setShapeAppearanceModel(c5671jR0M);
        c4904gh0M.U(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return c4904gh0M;
    }

    public final int H(int i, boolean z) {
        int compoundPaddingLeft = i + this.E.getCompoundPaddingLeft();
        return (getPrefixText() == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    public final int I(int i, boolean z) {
        int compoundPaddingRight = i - this.E.getCompoundPaddingRight();
        return (getPrefixText() == null || !z) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    public final void K() {
        TextView textView = this.U;
        if (textView == null || !this.T) {
            return;
        }
        textView.setText((CharSequence) null);
        AbstractC9221w51.a(this.B, this.b0);
        this.U.setVisibility(4);
    }

    public boolean L() {
        return this.D.E();
    }

    public boolean M() {
        return this.K.A();
    }

    public boolean N() {
        return this.K.B();
    }

    public final boolean O() {
        return this.S0;
    }

    public boolean P() {
        return this.g0;
    }

    public final boolean Q() {
        return this.q0 == 1 && this.E.getMinLines() <= 1;
    }

    public final void R() {
        o();
        m0();
        v0();
        d0();
        j();
        if (this.q0 != 0) {
            o0();
        }
        X();
    }

    public final void S() {
        if (A()) {
            RectF rectF = this.z0;
            this.T0.o(rectF, this.E.getWidth(), this.E.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            n(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.s0);
            ((AbstractC10010yv) this.h0).j0(rectF);
        }
    }

    public final void T() {
        if (!A() || this.S0) {
            return;
        }
        x();
        S();
    }

    public void V() {
        this.C.l();
    }

    public final void W() {
        TextView textView = this.U;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public final void X() {
        EditText editText = this.E;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i = this.q0;
                if (i == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public void Y(TextView textView, int i) {
        try {
            X21.o(textView, i);
            if (Build.VERSION.SDK_INT < 23) {
                return;
            }
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        X21.o(textView, SD0.a);
        textView.setTextColor(AbstractC9438ws.c(getContext(), RC0.a));
    }

    public boolean Z() {
        return this.K.l();
    }

    public final boolean a0() {
        return (this.D.F() || ((this.D.z() && L()) || this.D.w() != null)) && this.D.getMeasuredWidth() > 0;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.B.addView(view, layoutParams2);
        this.B.setLayoutParams(layoutParams);
        o0();
        setEditText((EditText) view);
    }

    public final boolean b0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.C.getMeasuredWidth() > 0;
    }

    public final void c0() {
        if (this.U == null || !this.T || TextUtils.isEmpty(this.S)) {
            return;
        }
        this.U.setText(this.S);
        AbstractC9221w51.a(this.B, this.a0);
        this.U.setVisibility(0);
        this.U.bringToFront();
        announceForAccessibility(this.S);
    }

    public final void d0() {
        if (this.q0 == 1) {
            if (AbstractC4336eh0.h(getContext())) {
                this.r0 = getResources().getDimensionPixelSize(YC0.u);
            } else if (AbstractC4336eh0.g(getContext())) {
                this.r0 = getResources().getDimensionPixelSize(YC0.t);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.E;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.F != null) {
            boolean z = this.g0;
            this.g0 = false;
            CharSequence hint = editText.getHint();
            this.E.setHint(this.F);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.E.setHint(hint);
                this.g0 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.B.getChildCount());
        for (int i2 = 0; i2 < this.B.getChildCount(); i2++) {
            View childAt = this.B.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.E) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.Y0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.Y0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        D(canvas);
        C(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.X0) {
            return;
        }
        this.X0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C0664Dm c0664Dm = this.T0;
        boolean zF0 = c0664Dm != null ? c0664Dm.f0(drawableState) : false;
        if (this.E != null) {
            p0(AbstractC2317Td1.U(this) && isEnabled());
        }
        l0();
        v0();
        if (zF0) {
            invalidate();
        }
        this.X0 = false;
    }

    public final void e0(Rect rect) {
        C4904gh0 c4904gh0 = this.l0;
        if (c4904gh0 != null) {
            int i = rect.bottom;
            c4904gh0.setBounds(rect.left, i - this.t0, rect.right, i);
        }
        C4904gh0 c4904gh02 = this.m0;
        if (c4904gh02 != null) {
            int i2 = rect.bottom;
            c4904gh02.setBounds(rect.left, i2 - this.u0, rect.right, i2);
        }
    }

    public final void f0() {
        if (this.P != null) {
            EditText editText = this.E;
            g0(editText == null ? null : editText.getText());
        }
    }

    public void g0(Editable editable) {
        int iA = this.O.a(editable);
        boolean z = this.N;
        int i = this.M;
        if (i == -1) {
            this.P.setText(String.valueOf(iA));
            this.P.setContentDescription(null);
            this.N = false;
        } else {
            this.N = iA > i;
            h0(getContext(), this.P, iA, this.M, this.N);
            if (z != this.N) {
                i0();
            }
            this.P.setText(C6856nf.c().j(getContext().getString(ND0.d, Integer.valueOf(iA), Integer.valueOf(this.M))));
        }
        if (this.E == null || z == this.N) {
            return;
        }
        p0(false);
        v0();
        l0();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.E;
        return editText != null ? editText.getBaseline() + getPaddingTop() + u() : super.getBaseline();
    }

    public C4904gh0 getBoxBackground() {
        int i = this.q0;
        if (i == 1 || i == 2) {
            return this.h0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.w0;
    }

    public int getBoxBackgroundMode() {
        return this.q0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.r0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return AbstractC2633We1.e(this) ? this.n0.j().a(this.z0) : this.n0.l().a(this.z0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return AbstractC2633We1.e(this) ? this.n0.l().a(this.z0) : this.n0.j().a(this.z0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return AbstractC2633We1.e(this) ? this.n0.r().a(this.z0) : this.n0.t().a(this.z0);
    }

    public float getBoxCornerRadiusTopStart() {
        return AbstractC2633We1.e(this) ? this.n0.t().a(this.z0) : this.n0.r().a(this.z0);
    }

    public int getBoxStrokeColor() {
        return this.L0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.M0;
    }

    public int getBoxStrokeWidth() {
        return this.t0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.u0;
    }

    public int getCounterMaxLength() {
        return this.M;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.L && this.N && (textView = this.P) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.d0;
    }

    public ColorStateList getCounterTextColor() {
        return this.c0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.H0;
    }

    public EditText getEditText() {
        return this.E;
    }

    public CharSequence getEndIconContentDescription() {
        return this.D.l();
    }

    public Drawable getEndIconDrawable() {
        return this.D.n();
    }

    public int getEndIconMinSize() {
        return this.D.o();
    }

    public int getEndIconMode() {
        return this.D.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.D.q();
    }

    public CheckableImageButton getEndIconView() {
        return this.D.r();
    }

    public CharSequence getError() {
        if (this.K.A()) {
            return this.K.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.K.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.K.o();
    }

    public int getErrorCurrentTextColors() {
        return this.K.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.D.s();
    }

    public CharSequence getHelperText() {
        if (this.K.B()) {
            return this.K.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.K.u();
    }

    public CharSequence getHint() {
        if (this.e0) {
            return this.f0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.T0.q();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.T0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.I0;
    }

    public f getLengthCounter() {
        return this.O;
    }

    public int getMaxEms() {
        return this.H;
    }

    public int getMaxWidth() {
        return this.J;
    }

    public int getMinEms() {
        return this.G;
    }

    public int getMinWidth() {
        return this.I;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.D.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.D.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.T) {
            return this.S;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.W;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.V;
    }

    public CharSequence getPrefixText() {
        return this.C.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.C.b();
    }

    public TextView getPrefixTextView() {
        return this.C.c();
    }

    public C5671jR0 getShapeAppearanceModel() {
        return this.n0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.C.d();
    }

    public Drawable getStartIconDrawable() {
        return this.C.e();
    }

    public int getStartIconMinSize() {
        return this.C.f();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.C.g();
    }

    public CharSequence getSuffixText() {
        return this.D.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.D.x();
    }

    public TextView getSuffixTextView() {
        return this.D.y();
    }

    public Typeface getTypeface() {
        return this.A0;
    }

    public void h(g gVar) {
        this.D0.add(gVar);
        if (this.E != null) {
            gVar.a(this);
        }
    }

    public final void i() {
        TextView textView = this.U;
        if (textView != null) {
            this.B.addView(textView);
            this.U.setVisibility(0);
        }
    }

    public final void i0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.P;
        if (textView != null) {
            Y(textView, this.N ? this.Q : this.R);
            if (!this.N && (colorStateList2 = this.c0) != null) {
                this.P.setTextColor(colorStateList2);
            }
            if (!this.N || (colorStateList = this.d0) == null) {
                return;
            }
            this.P.setTextColor(colorStateList);
        }
    }

    public final void j() {
        if (this.E == null || this.q0 != 1) {
            return;
        }
        if (AbstractC4336eh0.h(getContext())) {
            EditText editText = this.E;
            AbstractC2317Td1.E0(editText, AbstractC2317Td1.I(editText), getResources().getDimensionPixelSize(YC0.s), AbstractC2317Td1.H(this.E), getResources().getDimensionPixelSize(YC0.r));
        } else if (AbstractC4336eh0.g(getContext())) {
            EditText editText2 = this.E;
            AbstractC2317Td1.E0(editText2, AbstractC2317Td1.I(editText2), getResources().getDimensionPixelSize(YC0.q), AbstractC2317Td1.H(this.E), getResources().getDimensionPixelSize(YC0.p));
        }
    }

    public final void j0(boolean z) {
        ColorStateList colorStateListG = AbstractC3779ch0.g(getContext(), JC0.e);
        EditText editText = this.E;
        if (editText == null || editText.getTextCursorDrawable() == null || colorStateListG == null) {
            return;
        }
        Drawable textCursorDrawable = this.E.getTextCursorDrawable();
        if (z) {
            ColorStateList colorStateListValueOf = this.M0;
            if (colorStateListValueOf == null) {
                colorStateListValueOf = ColorStateList.valueOf(this.v0);
            }
            colorStateListG = colorStateListValueOf;
        }
        SD.o(textCursorDrawable, colorStateListG);
    }

    public void k(float f2) {
        if (this.T0.x() == f2) {
            return;
        }
        if (this.W0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.W0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC10241zl0.g(getContext(), JC0.C, AbstractC6991o7.b));
            this.W0.setDuration(AbstractC10241zl0.f(getContext(), JC0.x, 167));
            this.W0.addUpdateListener(new d());
        }
        this.W0.setFloatValues(this.T0.x(), f2);
        this.W0.start();
    }

    public boolean k0() {
        boolean z;
        if (this.E == null) {
            return false;
        }
        boolean z2 = true;
        if (b0()) {
            int measuredWidth = this.C.getMeasuredWidth() - this.E.getPaddingLeft();
            if (this.B0 == null || this.C0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.B0 = colorDrawable;
                this.C0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrA = X21.a(this.E);
            Drawable drawable = drawableArrA[0];
            Drawable drawable2 = this.B0;
            if (drawable != drawable2) {
                X21.i(this.E, drawable2, drawableArrA[1], drawableArrA[2], drawableArrA[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.B0 != null) {
                Drawable[] drawableArrA2 = X21.a(this.E);
                X21.i(this.E, null, drawableArrA2[1], drawableArrA2[2], drawableArrA2[3]);
                this.B0 = null;
                z = true;
            }
            z = false;
        }
        if (a0()) {
            int measuredWidth2 = this.D.y().getMeasuredWidth() - this.E.getPaddingRight();
            CheckableImageButton checkableImageButtonK = this.D.k();
            if (checkableImageButtonK != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonK.getMeasuredWidth() + AbstractC1576Mg0.a((ViewGroup.MarginLayoutParams) checkableImageButtonK.getLayoutParams());
            }
            Drawable[] drawableArrA3 = X21.a(this.E);
            Drawable drawable3 = this.E0;
            if (drawable3 != null && this.F0 != measuredWidth2) {
                this.F0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                X21.i(this.E, drawableArrA3[0], drawableArrA3[1], this.E0, drawableArrA3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.E0 = colorDrawable2;
                this.F0 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = drawableArrA3[2];
            Drawable drawable5 = this.E0;
            if (drawable4 != drawable5) {
                this.G0 = drawable4;
                X21.i(this.E, drawableArrA3[0], drawableArrA3[1], drawable5, drawableArrA3[3]);
                return true;
            }
        } else if (this.E0 != null) {
            Drawable[] drawableArrA4 = X21.a(this.E);
            if (drawableArrA4[2] == this.E0) {
                X21.i(this.E, drawableArrA4[0], drawableArrA4[1], this.G0, drawableArrA4[3]);
            } else {
                z2 = z;
            }
            this.E0 = null;
            return z2;
        }
        return z;
    }

    public final void l() {
        C4904gh0 c4904gh0 = this.h0;
        if (c4904gh0 == null) {
            return;
        }
        C5671jR0 c5671jR0A = c4904gh0.A();
        C5671jR0 c5671jR0 = this.n0;
        if (c5671jR0A != c5671jR0) {
            this.h0.setShapeAppearanceModel(c5671jR0);
        }
        if (v()) {
            this.h0.W(this.s0, this.v0);
        }
        int iP = p();
        this.w0 = iP;
        this.h0.S(ColorStateList.valueOf(iP));
        m();
        m0();
    }

    public void l0() {
        Drawable background;
        TextView textView;
        EditText editText = this.E;
        if (editText == null || this.q0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (AbstractC5059hE.a(background)) {
            background = background.mutate();
        }
        if (Z()) {
            background.setColorFilter(C8116s9.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.N && (textView = this.P) != null) {
            background.setColorFilter(C8116s9.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            SD.c(background);
            this.E.refreshDrawableState();
        }
    }

    public final void m() {
        if (this.l0 == null || this.m0 == null) {
            return;
        }
        if (w()) {
            this.l0.S(this.E.isFocused() ? ColorStateList.valueOf(this.J0) : ColorStateList.valueOf(this.v0));
            this.m0.S(ColorStateList.valueOf(this.v0));
        }
        invalidate();
    }

    public void m0() {
        EditText editText = this.E;
        if (editText == null || this.h0 == null) {
            return;
        }
        if ((this.k0 || editText.getBackground() == null) && this.q0 != 0) {
            AbstractC2317Td1.t0(this.E, getEditTextBoxBackground());
            this.k0 = true;
        }
    }

    public final void n(RectF rectF) {
        float f2 = rectF.left;
        int i = this.p0;
        rectF.left = f2 - i;
        rectF.right += i;
    }

    public final boolean n0() {
        int iMax;
        if (this.E == null || this.E.getMeasuredHeight() >= (iMax = Math.max(this.D.getMeasuredHeight(), this.C.getMeasuredHeight()))) {
            return false;
        }
        this.E.setMinimumHeight(iMax);
        return true;
    }

    public final void o() {
        int i = this.q0;
        if (i == 0) {
            this.h0 = null;
            this.l0 = null;
            this.m0 = null;
            return;
        }
        if (i == 1) {
            this.h0 = new C4904gh0(this.n0);
            this.l0 = new C4904gh0();
            this.m0 = new C4904gh0();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.q0 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.e0 || (this.h0 instanceof AbstractC10010yv)) {
                this.h0 = new C4904gh0(this.n0);
            } else {
                this.h0 = AbstractC10010yv.f0(this.n0);
            }
            this.l0 = null;
            this.m0 = null;
        }
    }

    public final void o0() {
        if (this.q0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.B.getLayoutParams();
            int iU = u();
            if (iU != layoutParams.topMargin) {
                layoutParams.topMargin = iU;
                this.B.requestLayout();
            }
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.T0.H(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.E;
        if (editText != null) {
            Rect rect = this.x0;
            AbstractC0395Az.a(this, editText, rect);
            e0(rect);
            if (this.e0) {
                this.T0.a0(this.E.getTextSize());
                int gravity = this.E.getGravity();
                this.T0.S((gravity & (-113)) | 48);
                this.T0.Z(gravity);
                this.T0.O(q(rect));
                this.T0.W(t(rect));
                this.T0.J();
                if (!A() || this.S0) {
                    return;
                }
                S();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean zN0 = n0();
        boolean zK0 = k0();
        if (zN0 || zK0) {
            this.E.post(new c());
        }
        r0();
        this.D.w0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setError(savedState.D);
        if (savedState.E) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.o0) {
            float fA = this.n0.r().a(this.z0);
            float fA2 = this.n0.t().a(this.z0);
            C5671jR0 c5671jR0M = C5671jR0.a().z(this.n0.s()).D(this.n0.q()).r(this.n0.k()).v(this.n0.i()).A(fA2).E(fA).s(this.n0.l().a(this.z0)).w(this.n0.j().a(this.z0)).m();
            this.o0 = z;
            setShapeAppearanceModel(c5671jR0M);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (Z()) {
            savedState.D = getError();
        }
        savedState.E = this.D.D();
        return savedState;
    }

    public final int p() {
        return this.q0 == 1 ? AbstractC3779ch0.i(AbstractC3779ch0.e(this, JC0.k, 0), this.w0) : this.w0;
    }

    public void p0(boolean z) {
        q0(z, false);
    }

    public final Rect q(Rect rect) {
        if (this.E == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.y0;
        boolean zE = AbstractC2633We1.e(this);
        rect2.bottom = rect.bottom;
        int i = this.q0;
        if (i == 1) {
            rect2.left = H(rect.left, zE);
            rect2.top = rect.top + this.r0;
            rect2.right = I(rect.right, zE);
            return rect2;
        }
        if (i != 2) {
            rect2.left = H(rect.left, zE);
            rect2.top = getPaddingTop();
            rect2.right = I(rect.right, zE);
            return rect2;
        }
        rect2.left = rect.left + this.E.getPaddingLeft();
        rect2.top = rect.top - u();
        rect2.right = rect.right - this.E.getPaddingRight();
        return rect2;
    }

    public final void q0(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.E;
        boolean z3 = false;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.E;
        if (editText2 != null && editText2.hasFocus()) {
            z3 = true;
        }
        ColorStateList colorStateList2 = this.H0;
        if (colorStateList2 != null) {
            this.T0.M(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.H0;
            this.T0.M(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.R0) : this.R0));
        } else if (Z()) {
            this.T0.M(this.K.r());
        } else if (this.N && (textView = this.P) != null) {
            this.T0.M(textView.getTextColors());
        } else if (z3 && (colorStateList = this.I0) != null) {
            this.T0.R(colorStateList);
        }
        if (z4 || !this.U0 || (isEnabled() && z3)) {
            if (z2 || this.S0) {
                y(z);
                return;
            }
            return;
        }
        if (z2 || !this.S0) {
            E(z);
        }
    }

    public final int r(Rect rect, Rect rect2, float f2) {
        return Q() ? (int) (rect2.top + f2) : rect.bottom - this.E.getCompoundPaddingBottom();
    }

    public final void r0() {
        EditText editText;
        if (this.U == null || (editText = this.E) == null) {
            return;
        }
        this.U.setGravity(editText.getGravity());
        this.U.setPadding(this.E.getCompoundPaddingLeft(), this.E.getCompoundPaddingTop(), this.E.getCompoundPaddingRight(), this.E.getCompoundPaddingBottom());
    }

    public final int s(Rect rect, float f2) {
        return Q() ? (int) (rect.centerY() - (f2 / 2.0f)) : rect.top + this.E.getCompoundPaddingTop();
    }

    public final void s0() {
        EditText editText = this.E;
        t0(editText == null ? null : editText.getText());
    }

    public void setBoxBackgroundColor(int i) {
        if (this.w0 != i) {
            this.w0 = i;
            this.N0 = i;
            this.P0 = i;
            this.Q0 = i;
            l();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(AbstractC9438ws.c(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.N0 = defaultColor;
        this.w0 = defaultColor;
        this.O0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.P0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.Q0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        l();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.q0) {
            return;
        }
        this.q0 = i;
        if (this.E != null) {
            R();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.r0 = i;
    }

    public void setBoxCornerFamily(int i) {
        this.n0 = this.n0.v().y(i, this.n0.r()).C(i, this.n0.t()).q(i, this.n0.j()).u(i, this.n0.l()).m();
        l();
    }

    public void setBoxStrokeColor(int i) {
        if (this.L0 != i) {
            this.L0 = i;
            v0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.J0 = colorStateList.getDefaultColor();
            this.R0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.K0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.L0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.L0 != colorStateList.getDefaultColor()) {
            this.L0 = colorStateList.getDefaultColor();
        }
        v0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.M0 != colorStateList) {
            this.M0 = colorStateList;
            v0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.t0 = i;
        v0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.u0 = i;
        v0();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.L != z) {
            if (z) {
                N9 n9 = new N9(getContext());
                this.P = n9;
                n9.setId(AbstractC5894kD0.J);
                Typeface typeface = this.A0;
                if (typeface != null) {
                    this.P.setTypeface(typeface);
                }
                this.P.setMaxLines(1);
                this.K.e(this.P, 2);
                AbstractC1576Mg0.c((ViewGroup.MarginLayoutParams) this.P.getLayoutParams(), getResources().getDimensionPixelOffset(YC0.U));
                i0();
                f0();
            } else {
                this.K.C(this.P, 2);
                this.P = null;
            }
            this.L = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.M != i) {
            if (i > 0) {
                this.M = i;
            } else {
                this.M = -1;
            }
            if (this.L) {
                f0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.Q != i) {
            this.Q = i;
            i0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.d0 != colorStateList) {
            this.d0 = colorStateList;
            i0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.R != i) {
            this.R = i;
            i0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.c0 != colorStateList) {
            this.c0 = colorStateList;
            i0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.H0 = colorStateList;
        this.I0 = colorStateList;
        if (this.E != null) {
            p0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        U(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.D.M(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.D.N(z);
    }

    public void setEndIconContentDescription(int i) {
        this.D.O(i);
    }

    public void setEndIconDrawable(int i) {
        this.D.Q(i);
    }

    public void setEndIconMinSize(int i) {
        this.D.S(i);
    }

    public void setEndIconMode(int i) {
        this.D.T(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.D.U(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.D.V(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.D.W(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.D.X(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.D.Y(mode);
    }

    public void setEndIconVisible(boolean z) {
        this.D.Z(z);
    }

    public void setError(CharSequence charSequence) {
        if (!this.K.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.K.w();
        } else {
            this.K.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        this.K.E(i);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.K.F(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.K.G(z);
    }

    public void setErrorIconDrawable(int i) {
        this.D.a0(i);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.D.c0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.D.d0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.D.e0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.D.f0(mode);
    }

    public void setErrorTextAppearance(int i) {
        this.K.H(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.K.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.U0 != z) {
            this.U0 = z;
            p0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (N()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!N()) {
                setHelperTextEnabled(true);
            }
            this.K.R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.K.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.K.K(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.K.J(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.e0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.V0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.e0) {
            this.e0 = z;
            if (z) {
                CharSequence hint = this.E.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f0)) {
                        setHint(hint);
                    }
                    this.E.setHint((CharSequence) null);
                }
                this.g0 = true;
            } else {
                this.g0 = false;
                if (!TextUtils.isEmpty(this.f0) && TextUtils.isEmpty(this.E.getHint())) {
                    this.E.setHint(this.f0);
                }
                setHintInternal(null);
            }
            if (this.E != null) {
                o0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.T0.P(i);
        this.I0 = this.T0.p();
        if (this.E != null) {
            p0(false);
            o0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.I0 != colorStateList) {
            if (this.H0 == null) {
                this.T0.R(colorStateList);
            }
            this.I0 = colorStateList;
            if (this.E != null) {
                p0(false);
            }
        }
    }

    public void setLengthCounter(f fVar) {
        this.O = fVar;
    }

    public void setMaxEms(int i) {
        this.H = i;
        EditText editText = this.E;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.J = i;
        EditText editText = this.E;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.G = i;
        EditText editText = this.E;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.I = i;
        EditText editText = this.E;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        this.D.h0(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        this.D.j0(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        this.D.l0(z);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.D.m0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.D.n0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.U == null) {
            N9 n9 = new N9(getContext());
            this.U = n9;
            n9.setId(AbstractC5894kD0.M);
            AbstractC2317Td1.z0(this.U, 2);
            HJ hjZ = z();
            this.a0 = hjZ;
            hjZ.g0(67L);
            this.b0 = z();
            setPlaceholderTextAppearance(this.W);
            setPlaceholderTextColor(this.V);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.T) {
                setPlaceholderTextEnabled(true);
            }
            this.S = charSequence;
        }
        s0();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.W = i;
        TextView textView = this.U;
        if (textView != null) {
            X21.o(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            TextView textView = this.U;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.C.m(charSequence);
    }

    public void setPrefixTextAppearance(int i) {
        this.C.n(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.C.o(colorStateList);
    }

    public void setShapeAppearanceModel(C5671jR0 c5671jR0) {
        C4904gh0 c4904gh0 = this.h0;
        if (c4904gh0 == null || c4904gh0.A() == c5671jR0) {
            return;
        }
        this.n0 = c5671jR0;
        l();
    }

    public void setStartIconCheckable(boolean z) {
        this.C.p(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? G9.b(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        this.C.s(i);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.C.t(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.C.u(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.C.v(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.C.w(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.C.x(mode);
    }

    public void setStartIconVisible(boolean z) {
        this.C.y(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.D.o0(charSequence);
    }

    public void setSuffixTextAppearance(int i) {
        this.D.p0(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.D.q0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.E;
        if (editText != null) {
            AbstractC2317Td1.p0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.A0) {
            this.A0 = typeface;
            this.T0.i0(typeface);
            this.K.N(typeface);
            TextView textView = this.P;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public final Rect t(Rect rect) {
        if (this.E == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.y0;
        float fW = this.T0.w();
        rect2.left = rect.left + this.E.getCompoundPaddingLeft();
        rect2.top = s(rect, fW);
        rect2.right = rect.right - this.E.getCompoundPaddingRight();
        rect2.bottom = r(rect, rect2, fW);
        return rect2;
    }

    public final void t0(Editable editable) {
        if (this.O.a(editable) != 0 || this.S0) {
            K();
        } else {
            c0();
        }
    }

    public final int u() {
        float fQ;
        if (!this.e0) {
            return 0;
        }
        int i = this.q0;
        if (i == 0) {
            fQ = this.T0.q();
        } else {
            if (i != 2) {
                return 0;
            }
            fQ = this.T0.q() / 2.0f;
        }
        return (int) fQ;
    }

    public final void u0(boolean z, boolean z2) {
        int defaultColor = this.M0.getDefaultColor();
        int colorForState = this.M0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.M0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.v0 = colorForState2;
        } else if (z2) {
            this.v0 = colorForState;
        } else {
            this.v0 = defaultColor;
        }
    }

    public final boolean v() {
        return this.q0 == 2 && w();
    }

    public void v0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.h0 == null || this.q0 == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.E) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.E) != null && editText.isHovered());
        if (Z() || (this.P != null && this.N)) {
            z = true;
        }
        if (!isEnabled()) {
            this.v0 = this.R0;
        } else if (Z()) {
            if (this.M0 != null) {
                u0(z2, z3);
            } else {
                this.v0 = getErrorCurrentTextColors();
            }
        } else if (!this.N || (textView = this.P) == null) {
            if (z2) {
                this.v0 = this.L0;
            } else if (z3) {
                this.v0 = this.K0;
            } else {
                this.v0 = this.J0;
            }
        } else if (this.M0 != null) {
            u0(z2, z3);
        } else {
            this.v0 = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            j0(z);
        }
        this.D.H();
        V();
        if (this.q0 == 2) {
            int i = this.s0;
            if (z2 && isEnabled()) {
                this.s0 = this.u0;
            } else {
                this.s0 = this.t0;
            }
            if (this.s0 != i) {
                T();
            }
        }
        if (this.q0 == 1) {
            if (!isEnabled()) {
                this.w0 = this.O0;
            } else if (z3 && !z2) {
                this.w0 = this.Q0;
            } else if (z2) {
                this.w0 = this.P0;
            } else {
                this.w0 = this.N0;
            }
        }
        l();
    }

    public final boolean w() {
        return this.s0 > -1 && this.v0 != 0;
    }

    public final void x() {
        if (A()) {
            ((AbstractC10010yv) this.h0).h0();
        }
    }

    public final void y(boolean z) {
        ValueAnimator valueAnimator = this.W0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.W0.cancel();
        }
        if (z && this.V0) {
            k(1.0f);
        } else {
            this.T0.c0(1.0f);
        }
        this.S0 = false;
        if (A()) {
            S();
        }
        s0();
        this.C.k(false);
        this.D.G(false);
    }

    public final HJ z() {
        HJ hj = new HJ();
        hj.b0(AbstractC10241zl0.f(getContext(), JC0.y, 87));
        hj.d0(AbstractC10241zl0.g(getContext(), JC0.D, AbstractC6991o7.a));
        return hj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = Z0;
        super(AbstractC6867nh0.c(context, attributeSet, i, i2), attributeSet, i);
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = new AZ(this);
        this.O = new f() { // from class: com.daaw.p21
            @Override // com.google.android.material.textfield.TextInputLayout.f
            public final int a(Editable editable) {
                return TextInputLayout.a(editable);
            }
        };
        this.x0 = new Rect();
        this.y0 = new Rect();
        this.z0 = new RectF();
        this.D0 = new LinkedHashSet();
        C0664Dm c0664Dm = new C0664Dm(this);
        this.T0 = c0664Dm;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.B = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = AbstractC6991o7.a;
        c0664Dm.h0(timeInterpolator);
        c0664Dm.e0(timeInterpolator);
        c0664Dm.S(8388659);
        Z31 z31J = AbstractC3885d31.j(context2, attributeSet, WD0.Q5, i, i2, WD0.n6, WD0.l6, WD0.D6, WD0.I6, WD0.M6);
        C4007dW0 c4007dW0 = new C4007dW0(this, z31J);
        this.C = c4007dW0;
        this.e0 = z31J.a(WD0.L6, true);
        setHint(z31J.p(WD0.V5));
        this.V0 = z31J.a(WD0.K6, true);
        this.U0 = z31J.a(WD0.F6, true);
        if (z31J.s(WD0.X5)) {
            setMinEms(z31J.k(WD0.X5, -1));
        } else if (z31J.s(WD0.U5)) {
            setMinWidth(z31J.f(WD0.U5, -1));
        }
        if (z31J.s(WD0.W5)) {
            setMaxEms(z31J.k(WD0.W5, -1));
        } else if (z31J.s(WD0.T5)) {
            setMaxWidth(z31J.f(WD0.T5, -1));
        }
        this.n0 = C5671jR0.e(context2, attributeSet, i, i2).m();
        this.p0 = context2.getResources().getDimensionPixelOffset(YC0.R);
        this.r0 = z31J.e(WD0.a6, 0);
        this.t0 = z31J.f(WD0.h6, context2.getResources().getDimensionPixelSize(YC0.S));
        this.u0 = z31J.f(WD0.i6, context2.getResources().getDimensionPixelSize(YC0.T));
        this.s0 = this.t0;
        float fD = z31J.d(WD0.e6, -1.0f);
        float fD2 = z31J.d(WD0.d6, -1.0f);
        float fD3 = z31J.d(WD0.b6, -1.0f);
        float fD4 = z31J.d(WD0.c6, -1.0f);
        C5671jR0.b bVarV = this.n0.v();
        if (fD >= 0.0f) {
            bVarV.A(fD);
        }
        if (fD2 >= 0.0f) {
            bVarV.E(fD2);
        }
        if (fD3 >= 0.0f) {
            bVarV.w(fD3);
        }
        if (fD4 >= 0.0f) {
            bVarV.s(fD4);
        }
        this.n0 = bVarV.m();
        ColorStateList colorStateListB = AbstractC4336eh0.b(context2, z31J, WD0.Y5);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.N0 = defaultColor;
            this.w0 = defaultColor;
            if (colorStateListB.isStateful()) {
                this.O0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.P0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.Q0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.P0 = this.N0;
                ColorStateList colorStateListA = G9.a(context2, RC0.c);
                this.O0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.Q0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.w0 = 0;
            this.N0 = 0;
            this.O0 = 0;
            this.P0 = 0;
            this.Q0 = 0;
        }
        if (z31J.s(WD0.S5)) {
            ColorStateList colorStateListC = z31J.c(WD0.S5);
            this.I0 = colorStateListC;
            this.H0 = colorStateListC;
        }
        ColorStateList colorStateListB2 = AbstractC4336eh0.b(context2, z31J, WD0.f6);
        this.L0 = z31J.b(WD0.f6, 0);
        this.J0 = AbstractC9438ws.c(context2, RC0.d);
        this.R0 = AbstractC9438ws.c(context2, RC0.e);
        this.K0 = AbstractC9438ws.c(context2, RC0.f);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        if (z31J.s(WD0.g6)) {
            setBoxStrokeErrorColor(AbstractC4336eh0.b(context2, z31J, WD0.g6));
        }
        if (z31J.n(WD0.M6, -1) != -1) {
            setHintTextAppearance(z31J.n(WD0.M6, 0));
        }
        int iN = z31J.n(WD0.D6, 0);
        CharSequence charSequenceP = z31J.p(WD0.y6);
        int iK = z31J.k(WD0.x6, 1);
        boolean zA = z31J.a(WD0.z6, false);
        int iN2 = z31J.n(WD0.I6, 0);
        boolean zA2 = z31J.a(WD0.H6, false);
        CharSequence charSequenceP2 = z31J.p(WD0.G6);
        int iN3 = z31J.n(WD0.U6, 0);
        CharSequence charSequenceP3 = z31J.p(WD0.T6);
        boolean zA3 = z31J.a(WD0.j6, false);
        setCounterMaxLength(z31J.k(WD0.k6, -1));
        this.R = z31J.n(WD0.n6, 0);
        this.Q = z31J.n(WD0.l6, 0);
        setBoxBackgroundMode(z31J.k(WD0.Z5, 0));
        setErrorContentDescription(charSequenceP);
        setErrorAccessibilityLiveRegion(iK);
        setCounterOverflowTextAppearance(this.Q);
        setHelperTextTextAppearance(iN2);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.R);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        if (z31J.s(WD0.E6)) {
            setErrorTextColor(z31J.c(WD0.E6));
        }
        if (z31J.s(WD0.J6)) {
            setHelperTextColor(z31J.c(WD0.J6));
        }
        if (z31J.s(WD0.N6)) {
            setHintTextColor(z31J.c(WD0.N6));
        }
        if (z31J.s(WD0.o6)) {
            setCounterTextColor(z31J.c(WD0.o6));
        }
        if (z31J.s(WD0.m6)) {
            setCounterOverflowTextColor(z31J.c(WD0.m6));
        }
        if (z31J.s(WD0.V6)) {
            setPlaceholderTextColor(z31J.c(WD0.V6));
        }
        com.google.android.material.textfield.a aVar = new com.google.android.material.textfield.a(this, z31J);
        this.D = aVar;
        boolean zA4 = z31J.a(WD0.R5, true);
        z31J.x();
        AbstractC2317Td1.z0(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC2317Td1.B0(this, 1);
        }
        frameLayout.addView(c4007dW0);
        frameLayout.addView(aVar);
        addView(frameLayout);
        setEnabled(zA4);
        setHelperTextEnabled(zA2);
        setErrorEnabled(zA);
        setCounterEnabled(zA3);
        setHelperText(charSequenceP2);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.D.P(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.D.R(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.D.b0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.D.i0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.D.k0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.C.q(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.C.r(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
