package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.daaw.AbstractC0792Es;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC3885d31;
import com.daaw.AbstractC4336eh0;
import com.daaw.AbstractC5183hh0;
import com.daaw.AbstractC5189hi1;
import com.daaw.AbstractC6867nh0;
import com.daaw.AbstractC9438ws;
import com.daaw.C4904gh0;
import com.daaw.C5671jR0;
import com.daaw.C5950kR0;
import com.daaw.C6618mn0;
import com.daaw.C6897nn0;
import com.daaw.C8820uh1;
import com.daaw.G9;
import com.daaw.GZ0;
import com.daaw.JC0;
import com.daaw.KC0;
import com.daaw.NJ0;
import com.daaw.SD0;
import com.daaw.WD0;
import com.daaw.WN0;
import com.daaw.WT;
import com.daaw.Z31;

/* JADX INFO: loaded from: classes3.dex */
public class NavigationView extends WN0 {
    public static final int[] V = {R.attr.state_checked};
    public static final int[] W = {-16842910};
    public static final int a0 = SD0.d;
    public final C6618mn0 I;
    public final C6897nn0 J;
    public c K;
    public final int L;
    public final int[] M;
    public MenuInflater N;
    public ViewTreeObserver.OnGlobalLayoutListener O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public Path T;
    public final RectF U;

    public class a implements e.a {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(e eVar, MenuItem menuItem) {
            c cVar = NavigationView.this.K;
            return cVar != null && cVar.a(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(e eVar) {
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.M);
            boolean z = true;
            boolean z2 = NavigationView.this.M[1] == 0;
            NavigationView.this.J.D(z2);
            NavigationView navigationView2 = NavigationView.this;
            navigationView2.setDrawTopInsetForeground(z2 && navigationView2.l());
            NavigationView.this.setDrawLeftInsetForeground(NavigationView.this.M[0] == 0 || NavigationView.this.M[0] + NavigationView.this.getWidth() == 0);
            Activity activityA = AbstractC0792Es.a(NavigationView.this.getContext());
            if (activityA != null) {
                Rect rectA = AbstractC5189hi1.a(activityA);
                boolean z3 = rectA.height() - NavigationView.this.getHeight() == NavigationView.this.M[1];
                boolean z4 = Color.alpha(activityA.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView3 = NavigationView.this;
                navigationView3.setDrawBottomInsetForeground(z3 && z4 && navigationView3.k());
                if (rectA.width() != NavigationView.this.M[0] && rectA.width() - NavigationView.this.getWidth() != NavigationView.this.M[0]) {
                    z = false;
                }
                NavigationView.this.setDrawRightInsetForeground(z);
            }
        }
    }

    public interface c {
        boolean a(MenuItem menuItem);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, JC0.E);
    }

    private MenuInflater getMenuInflater() {
        if (this.N == null) {
            this.N = new GZ0(getContext());
        }
        return this.N;
    }

    @Override // com.daaw.WN0
    public void a(C8820uh1 c8820uh1) {
        this.J.k(c8820uh1);
    }

    public final ColorStateList d(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListA = G9.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(KC0.v, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListA.getDefaultColor();
        int[] iArr = W;
        return new ColorStateList(new int[][]{iArr, V, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListA.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.T == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.T);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public final Drawable e(Z31 z31) {
        return f(z31, AbstractC4336eh0.b(getContext(), z31, WD0.i4));
    }

    public final Drawable f(Z31 z31, ColorStateList colorStateList) {
        C4904gh0 c4904gh0 = new C4904gh0(C5671jR0.b(getContext(), z31.n(WD0.g4, 0), z31.n(WD0.h4, 0)).m());
        c4904gh0.S(colorStateList);
        return new InsetDrawable((Drawable) c4904gh0, z31.f(WD0.l4, 0), z31.f(WD0.m4, 0), z31.f(WD0.k4, 0), z31.f(WD0.j4, 0));
    }

    public View g(int i) {
        return this.J.r(i);
    }

    public MenuItem getCheckedItem() {
        return this.J.n();
    }

    public int getDividerInsetEnd() {
        return this.J.o();
    }

    public int getDividerInsetStart() {
        return this.J.p();
    }

    public int getHeaderCount() {
        return this.J.q();
    }

    public Drawable getItemBackground() {
        return this.J.s();
    }

    public int getItemHorizontalPadding() {
        return this.J.t();
    }

    public int getItemIconPadding() {
        return this.J.u();
    }

    public ColorStateList getItemIconTintList() {
        return this.J.x();
    }

    public int getItemMaxLines() {
        return this.J.v();
    }

    public ColorStateList getItemTextColor() {
        return this.J.w();
    }

    public int getItemVerticalPadding() {
        return this.J.y();
    }

    public Menu getMenu() {
        return this.I;
    }

    public int getSubheaderInsetEnd() {
        return this.J.A();
    }

    public int getSubheaderInsetStart() {
        return this.J.B();
    }

    public final boolean h(Z31 z31) {
        return z31.s(WD0.g4) || z31.s(WD0.h4);
    }

    public View i(int i) {
        return this.J.C(i);
    }

    public void j(int i) {
        this.J.X(true);
        getMenuInflater().inflate(i, this.I);
        this.J.X(false);
        this.J.c(false);
    }

    public boolean k() {
        return this.Q;
    }

    public boolean l() {
        return this.P;
    }

    public final void m(int i, int i2) {
        if (!(getParent() instanceof DrawerLayout) || this.S <= 0 || !(getBackground() instanceof C4904gh0)) {
            this.T = null;
            this.U.setEmpty();
            return;
        }
        C4904gh0 c4904gh0 = (C4904gh0) getBackground();
        C5671jR0.b bVarV = c4904gh0.A().v();
        if (WT.b(this.R, AbstractC2317Td1.D(this)) == 3) {
            bVarV.E(this.S);
            bVarV.w(this.S);
        } else {
            bVarV.A(this.S);
            bVarV.s(this.S);
        }
        c4904gh0.setShapeAppearanceModel(bVarV.m());
        if (this.T == null) {
            this.T = new Path();
        }
        this.T.reset();
        this.U.set(0.0f, 0.0f, i, i2);
        C5950kR0.k().d(c4904gh0.A(), c4904gh0.w(), this.U, this.T);
        invalidate();
    }

    public final void n() {
        this.O = new b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.O);
    }

    @Override // com.daaw.WN0, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC5183hh0.e(this);
    }

    @Override // com.daaw.WN0, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.O);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.L), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.L, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.I.T(savedState.D);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.D = bundle;
        this.I.V(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m(i, i2);
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.Q = z;
    }

    public void setCheckedItem(int i) {
        MenuItem menuItemFindItem = this.I.findItem(i);
        if (menuItemFindItem != null) {
            this.J.E((g) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(int i) {
        this.J.F(i);
    }

    public void setDividerInsetStart(int i) {
        this.J.G(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        AbstractC5183hh0.d(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.J.I(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(AbstractC9438ws.e(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        this.J.K(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.J.K(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        this.J.L(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.J.L(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(int i) {
        this.J.M(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.J.N(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.J.O(i);
    }

    public void setItemTextAppearance(int i) {
        this.J.P(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.J.Q(colorStateList);
    }

    public void setItemVerticalPadding(int i) {
        this.J.R(i);
    }

    public void setItemVerticalPaddingResource(int i) {
        this.J.R(getResources().getDimensionPixelSize(i));
    }

    public void setNavigationItemSelectedListener(c cVar) {
        this.K = cVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        C6897nn0 c6897nn0 = this.J;
        if (c6897nn0 != null) {
            c6897nn0.S(i);
        }
    }

    public void setSubheaderInsetEnd(int i) {
        this.J.U(i);
    }

    public void setSubheaderInsetStart(int i) {
        this.J.V(i);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.P = z;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public Bundle D;

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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.D = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.D);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        int i2 = a0;
        super(AbstractC6867nh0.c(context, attributeSet, i, i2), attributeSet, i);
        C6897nn0 c6897nn0 = new C6897nn0();
        this.J = c6897nn0;
        this.M = new int[2];
        this.P = true;
        this.Q = true;
        this.R = 0;
        this.S = 0;
        this.U = new RectF();
        Context context2 = getContext();
        C6618mn0 c6618mn0 = new C6618mn0(context2);
        this.I = c6618mn0;
        Z31 z31J = AbstractC3885d31.j(context2, attributeSet, WD0.O3, i, i2, new int[0]);
        if (z31J.s(WD0.Q3)) {
            AbstractC2317Td1.t0(this, z31J.g(WD0.Q3));
        }
        this.S = z31J.f(WD0.W3, 0);
        this.R = z31J.k(WD0.P3, 0);
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C5671jR0 c5671jR0M = C5671jR0.e(context2, attributeSet, i, i2).m();
            Drawable background = getBackground();
            C4904gh0 c4904gh0 = new C4904gh0(c5671jR0M);
            if (background instanceof ColorDrawable) {
                c4904gh0.S(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            c4904gh0.I(context2);
            AbstractC2317Td1.t0(this, c4904gh0);
        }
        if (z31J.s(WD0.X3)) {
            setElevation(z31J.f(WD0.X3, 0));
        }
        setFitsSystemWindows(z31J.a(WD0.R3, false));
        this.L = z31J.f(WD0.S3, 0);
        ColorStateList colorStateListC = z31J.s(WD0.r4) ? z31J.c(WD0.r4) : null;
        int iN = z31J.s(WD0.u4) ? z31J.n(WD0.u4, 0) : 0;
        if (iN == 0 && colorStateListC == null) {
            colorStateListC = d(R.attr.textColorSecondary);
        }
        ColorStateList colorStateListC2 = z31J.s(WD0.d4) ? z31J.c(WD0.d4) : d(R.attr.textColorSecondary);
        int iN2 = z31J.s(WD0.n4) ? z31J.n(WD0.n4, 0) : 0;
        if (z31J.s(WD0.c4)) {
            setItemIconSize(z31J.f(WD0.c4, 0));
        }
        ColorStateList colorStateListC3 = z31J.s(WD0.o4) ? z31J.c(WD0.o4) : null;
        if (iN2 == 0 && colorStateListC3 == null) {
            colorStateListC3 = d(R.attr.textColorPrimary);
        }
        Drawable drawableG = z31J.g(WD0.Z3);
        if (drawableG == null && h(z31J)) {
            drawableG = e(z31J);
            ColorStateList colorStateListB = AbstractC4336eh0.b(context2, z31J, WD0.f4);
            if (colorStateListB != null) {
                c6897nn0.J(new RippleDrawable(NJ0.b(colorStateListB), null, f(z31J, null)));
            }
        }
        if (z31J.s(WD0.a4)) {
            setItemHorizontalPadding(z31J.f(WD0.a4, 0));
        }
        if (z31J.s(WD0.p4)) {
            setItemVerticalPadding(z31J.f(WD0.p4, 0));
        }
        setDividerInsetStart(z31J.f(WD0.V3, 0));
        setDividerInsetEnd(z31J.f(WD0.U3, 0));
        setSubheaderInsetStart(z31J.f(WD0.t4, 0));
        setSubheaderInsetEnd(z31J.f(WD0.s4, 0));
        setTopInsetScrimEnabled(z31J.a(WD0.v4, this.P));
        setBottomInsetScrimEnabled(z31J.a(WD0.T3, this.Q));
        int iF = z31J.f(WD0.b4, 0);
        setItemMaxLines(z31J.k(WD0.e4, 1));
        c6618mn0.W(new a());
        c6897nn0.H(1);
        c6897nn0.i(context2, c6618mn0);
        if (iN != 0) {
            c6897nn0.W(iN);
        }
        c6897nn0.T(colorStateListC);
        c6897nn0.N(colorStateListC2);
        c6897nn0.S(getOverScrollMode());
        if (iN2 != 0) {
            c6897nn0.P(iN2);
        }
        c6897nn0.Q(colorStateListC3);
        c6897nn0.I(drawableG);
        c6897nn0.L(iF);
        c6618mn0.b(c6897nn0);
        addView((View) c6897nn0.z(this));
        if (z31J.s(WD0.q4)) {
            j(z31J.n(WD0.q4, 0));
        }
        if (z31J.s(WD0.Y3)) {
            i(z31J.n(WD0.Y3, 0));
        }
        z31J.x();
        n();
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.I.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.J.E((g) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
