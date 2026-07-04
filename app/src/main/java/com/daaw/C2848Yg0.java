package com.daaw;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: com.daaw.Yg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2848Yg0 extends Q8 {
    public final C6563mc0 F;
    public final AccessibilityManager G;
    public final Rect H;
    public final int I;
    public final float J;
    public int K;
    public ColorStateList L;

    /* JADX INFO: renamed from: com.daaw.Yg0$a */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            C2848Yg0 c2848Yg0 = C2848Yg0.this;
            C2848Yg0.this.j(i < 0 ? c2848Yg0.F.v() : c2848Yg0.getAdapter().getItem(i));
            AdapterView.OnItemClickListener onItemClickListener = C2848Yg0.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = C2848Yg0.this.F.y();
                    i = C2848Yg0.this.F.x();
                    j = C2848Yg0.this.F.w();
                }
                onItemClickListener.onItemClick(C2848Yg0.this.F.k(), view, i, j);
            }
            C2848Yg0.this.F.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Yg0$b */
    public class b extends ArrayAdapter {
        public ColorStateList a;
        public ColorStateList b;

        public b(Context context, int i, String[] strArr) {
            super(context, i, strArr);
            f();
        }

        public final ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{AbstractC3779ch0.i(C2848Yg0.this.K, C2848Yg0.this.L.getColorForState(iArr2, 0)), AbstractC3779ch0.i(C2848Yg0.this.K, C2848Yg0.this.L.getColorForState(iArr, 0)), C2848Yg0.this.K});
        }

        public final Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(C2848Yg0.this.K);
            if (this.b == null) {
                return colorDrawable;
            }
            SD.o(colorDrawable, this.a);
            return new RippleDrawable(this.b, colorDrawable, null);
        }

        public final boolean c() {
            return C2848Yg0.this.K != 0;
        }

        public final boolean d() {
            return C2848Yg0.this.L != null;
        }

        public final ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{C2848Yg0.this.L.getColorForState(iArr, 0), 0});
        }

        public void f() {
            this.b = e();
            this.a = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                AbstractC2317Td1.t0(textView, C2848Yg0.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public C2848Yg0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, JC0.a);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (g()) {
            this.F.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public final TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean g() {
        AccessibilityManager accessibilityManager = this.G;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutF = f();
        return (textInputLayoutF == null || !textInputLayoutF.P()) ? super.getHint() : textInputLayoutF.getHint();
    }

    public float getPopupElevation() {
        return this.J;
    }

    public int getSimpleItemSelectedColor() {
        return this.K;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.L;
    }

    public final int h() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutF = f();
        int i = 0;
        if (adapter == null || textInputLayoutF == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.F.x()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutF);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableG = this.F.g();
        if (drawableG != null) {
            drawableG.getPadding(this.H);
            Rect rect = this.H;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutF.getEndIconView().getMeasuredWidth();
    }

    public final void i() {
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null) {
            textInputLayoutF.m0();
        }
    }

    public final void j(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null && textInputLayoutF.P() && super.getHint() == null && AbstractC8256sg0.a()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), h()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (g()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.F.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C6563mc0 c6563mc0 = this.F;
        if (c6563mc0 != null) {
            c6563mc0.j(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.F.M(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        i();
    }

    public void setSimpleItemSelectedColor(int i) {
        this.K = i;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.L = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (g()) {
            this.F.h();
        } else {
            super.showDropDown();
        }
    }

    public C2848Yg0(Context context, AttributeSet attributeSet, int i) {
        super(AbstractC6867nh0.c(context, attributeSet, i, 0), attributeSet, i);
        this.H = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = AbstractC3885d31.i(context2, attributeSet, WD0.R1, i, SD0.b, new int[0]);
        if (typedArrayI.hasValue(WD0.S1) && typedArrayI.getInt(WD0.S1, 0) == 0) {
            setKeyListener(null);
        }
        this.I = typedArrayI.getResourceId(WD0.U1, BD0.o);
        this.J = typedArrayI.getDimensionPixelOffset(WD0.T1, YC0.M);
        this.K = typedArrayI.getColor(WD0.V1, 0);
        this.L = AbstractC4336eh0.a(context2, typedArrayI, WD0.W1);
        this.G = (AccessibilityManager) context2.getSystemService("accessibility");
        C6563mc0 c6563mc0 = new C6563mc0(context2);
        this.F = c6563mc0;
        c6563mc0.J(true);
        c6563mc0.D(this);
        c6563mc0.I(2);
        c6563mc0.p(getAdapter());
        c6563mc0.L(new a());
        if (typedArrayI.hasValue(WD0.X1)) {
            setSimpleItems(typedArrayI.getResourceId(WD0.X1, 0));
        }
        typedArrayI.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.I, strArr));
    }
}
