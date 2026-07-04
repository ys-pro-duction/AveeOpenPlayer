package com.astuetz;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.daaw.AbstractC3374bD0;
import com.daaw.AbstractC5056hD0;
import com.daaw.AbstractC9815yD0;
import com.daaw.AsyncTaskC2517Vb1;
import com.daaw.C0689Ds0;
import com.daaw.HX;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class PagerSlidingTabStrip extends HorizontalScrollView {
    public static final int[] r0 = {R.attr.textColorPrimary, R.attr.textSize, R.attr.textColor, R.attr.padding, R.attr.paddingLeft, R.attr.paddingRight};
    public final h B;
    public LinearLayout.LayoutParams C;
    public LinearLayout.LayoutParams D;
    public final g E;
    public ViewPager.i F;
    public LinearLayout G;
    public ViewPager H;
    public int I;
    public int J;
    public float K;
    public Paint L;
    public Paint M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public ColorStateList W;
    public ColorStateList a0;
    public int b0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public Typeface h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public Locale n0;
    public int o0;
    public View.OnClickListener p0;
    public ViewTreeObserver.OnGlobalLayoutListener q0;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int B;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.B);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.B = parcel.readInt();
        }
    }

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public class b implements AsyncTaskC2517Vb1.b {
        public final /* synthetic */ TextView a;

        public b(TextView textView) {
            this.a = textView;
        }

        @Override // com.daaw.AsyncTaskC2517Vb1.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(String str, boolean z) {
            if (z || str == null) {
                return;
            }
            this.a.setText(str);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PagerSlidingTabStrip.this.p0.onClick(view);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PagerSlidingTabStrip.this.p0.onClick(view);
        }
    }

    public class e implements ViewTreeObserver.OnGlobalLayoutListener {
        public e() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View childAt = PagerSlidingTabStrip.this.G.getChildAt(0);
            PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (PagerSlidingTabStrip.this.g0) {
                int width = childAt.getWidth() / 2;
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                int width2 = (pagerSlidingTabStrip.getWidth() / 2) - width;
                pagerSlidingTabStrip.d0 = width2;
                pagerSlidingTabStrip.c0 = width2;
            }
            PagerSlidingTabStrip pagerSlidingTabStrip2 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip2.setPadding(pagerSlidingTabStrip2.c0, PagerSlidingTabStrip.this.getPaddingTop(), PagerSlidingTabStrip.this.d0, PagerSlidingTabStrip.this.getPaddingBottom());
            if (PagerSlidingTabStrip.this.k0 == 0) {
                PagerSlidingTabStrip pagerSlidingTabStrip3 = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip3.k0 = (pagerSlidingTabStrip3.getWidth() / 2) - PagerSlidingTabStrip.this.c0;
            }
            PagerSlidingTabStrip pagerSlidingTabStrip4 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip4.J = pagerSlidingTabStrip4.o0;
            PagerSlidingTabStrip.this.K = 0.0f;
            PagerSlidingTabStrip pagerSlidingTabStrip5 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip5.y(pagerSlidingTabStrip5.J, 0);
            PagerSlidingTabStrip pagerSlidingTabStrip6 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip6.B(pagerSlidingTabStrip6.J);
        }
    }

    public interface f {
    }

    public class g implements ViewPager.i {
        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(int i, float f, int i2) {
            PagerSlidingTabStrip.this.J = i;
            PagerSlidingTabStrip.this.K = f;
            PagerSlidingTabStrip.this.y(i, PagerSlidingTabStrip.this.I > 0 ? (int) (PagerSlidingTabStrip.this.G.getChildAt(i).getWidth() * f) : 0);
            PagerSlidingTabStrip.this.invalidate();
            ViewPager.i iVar = PagerSlidingTabStrip.this.F;
            if (iVar != null) {
                iVar.a(i, f, i2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void b(int i) {
            if (i == 0) {
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip.y(pagerSlidingTabStrip.H.getCurrentItem(), 0);
            }
            PagerSlidingTabStrip.this.z(PagerSlidingTabStrip.this.G.getChildAt(PagerSlidingTabStrip.this.H.getCurrentItem()));
            if (PagerSlidingTabStrip.this.H.getCurrentItem() - 1 >= 0) {
                PagerSlidingTabStrip.this.w(PagerSlidingTabStrip.this.G.getChildAt(PagerSlidingTabStrip.this.H.getCurrentItem() - 1));
            }
            if (PagerSlidingTabStrip.this.H.getCurrentItem() + 1 <= PagerSlidingTabStrip.this.H.getAdapter().c() - 1) {
                PagerSlidingTabStrip.this.w(PagerSlidingTabStrip.this.G.getChildAt(PagerSlidingTabStrip.this.H.getCurrentItem() + 1));
            }
            ViewPager.i iVar = PagerSlidingTabStrip.this.F;
            if (iVar != null) {
                iVar.b(i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void c(int i) {
            PagerSlidingTabStrip.this.B(i);
            ViewPager.i iVar = PagerSlidingTabStrip.this.F;
            if (iVar != null) {
                iVar.c(i);
            }
        }

        public g() {
        }
    }

    public class h extends DataSetObserver {
        public boolean a;

        public boolean a() {
            return this.a;
        }

        public void b(boolean z) {
            this.a = z;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerSlidingTabStrip.this.x();
        }

        public h() {
            this.a = false;
        }
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private C0689Ds0 getIndicatorCoordinates() {
        int i;
        View childAt = this.G.getChildAt(this.J);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.K > 0.0f && (i = this.J) < this.I - 1) {
            View childAt2 = this.G.getChildAt(i + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f2 = this.K;
            left = (left2 * f2) + ((1.0f - f2) * left);
            right = (right2 * f2) + ((1.0f - f2) * right);
        }
        return new C0689Ds0(Float.valueOf(left), Float.valueOf(right));
    }

    public final void A() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.G.getLayoutParams();
        int i = this.O;
        int i2 = this.P;
        if (i < i2) {
            i = i2;
        }
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i);
        this.G.setLayoutParams(marginLayoutParams);
    }

    public final void B(int i) {
        int i2 = 0;
        while (i2 < this.I) {
            View childAt = this.G.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                z(childAt);
            } else {
                w(childAt);
            }
            i2++;
        }
    }

    public final void C() {
        for (int i = 0; i < this.I; i++) {
            View childAt = this.G.getChildAt(i);
            childAt.setBackgroundResource(this.m0);
            childAt.setPadding(this.U, childAt.getPaddingTop(), this.U, childAt.getPaddingBottom());
            TextView textView = (TextView) childAt.findViewById(AbstractC5056hD0.v2);
            if (textView != null && this.f0) {
                textView.setAllCaps(true);
            }
        }
    }

    public int getDividerColor() {
        return this.T;
    }

    public int getDividerPadding() {
        return this.S;
    }

    public int getDividerWidth() {
        return this.R;
    }

    public int getIndicatorColor() {
        return this.N;
    }

    public int getIndicatorHeight() {
        return this.O;
    }

    public int getScrollOffset() {
        return this.k0;
    }

    public boolean getShouldExpand() {
        return this.e0;
    }

    public int getTabBackground() {
        return this.m0;
    }

    public int getTabPaddingLeftRight() {
        return this.U;
    }

    public ColorStateList getTextColor() {
        return this.W;
    }

    public int getTextSize() {
        return this.V;
    }

    public int getUnderlineColor() {
        return this.Q;
    }

    public int getUnderlineHeight() {
        return this.P;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.H == null || this.B.a()) {
            return;
        }
        this.H.getAdapter().i(this.B);
        this.B.b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.H == null || !this.B.a()) {
            return;
        }
        this.H.getAdapter().o(this.B);
        this.B.b(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.I == 0) {
            return;
        }
        int height = getHeight();
        this.L.setColor(this.N);
        C0689Ds0 indicatorCoordinates = getIndicatorCoordinates();
        float f2 = height;
        canvas.drawRect(((Float) indicatorCoordinates.a).floatValue() + this.c0, height - this.O, ((Float) indicatorCoordinates.b).floatValue() + this.c0, f2, this.L);
        this.L.setColor(this.Q);
        canvas.drawRect(this.c0, height - this.P, this.G.getWidth() + this.d0, f2, this.L);
        int i = this.R;
        if (i != 0) {
            this.M.setStrokeWidth(i);
            this.M.setColor(this.T);
            for (int i2 = 0; i2 < this.I - 1; i2++) {
                View childAt = this.G.getChildAt(i2);
                canvas.drawLine(childAt.getRight(), this.S, childAt.getRight(), height - this.S, this.M);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.g0 || this.c0 > 0 || this.d0 > 0) {
            this.G.setMinimumWidth(getWidth());
            setClipToPadding(false);
        }
        if (this.G.getChildCount() > 0) {
            this.G.getChildAt(0).getViewTreeObserver().addOnGlobalLayoutListener(this.q0);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.B;
        this.J = i;
        if (i != 0 && this.G.getChildCount() > 0) {
            w(this.G.getChildAt(0));
            z(this.G.getChildAt(this.J));
        }
        requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.B = this.J;
        return savedState;
    }

    public final void r(int i, HX hx, View view, Object obj) {
        TextView textView = (TextView) view.findViewById(AbstractC5056hD0.v2);
        if (textView != null && hx != null) {
            hx.a(new b(textView));
        }
        view.setTag(obj);
        view.setFocusable(true);
        view.setOnClickListener(new c());
        this.G.addView(view, i, this.e0 ? this.D : this.C);
    }

    public final void s(int i, CharSequence charSequence, View view, Object obj) {
        TextView textView = (TextView) view.findViewById(AbstractC5056hD0.v2);
        if (textView != null && charSequence != null) {
            textView.setText(charSequence);
        }
        view.setTag(obj);
        view.setFocusable(true);
        view.setOnClickListener(new d());
        this.G.addView(view, i, this.e0 ? this.D : this.C);
    }

    public void setAllCaps(boolean z) {
        this.f0 = z;
    }

    public void setDividerColor(int i) {
        this.T = i;
        invalidate();
    }

    public void setDividerColorResource(int i) {
        this.T = getResources().getColor(i);
        invalidate();
    }

    public void setDividerPadding(int i) {
        this.S = i;
        invalidate();
    }

    public void setDividerWidth(int i) {
        this.R = i;
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.N = i;
        invalidate();
    }

    public void setIndicatorColorResource(int i) {
        this.N = getResources().getColor(i);
        invalidate();
    }

    public void setIndicatorHeight(int i) {
        this.O = i;
        invalidate();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.p0 = onClickListener;
    }

    public void setOnPageChangeListener(ViewPager.i iVar) {
        this.F = iVar;
    }

    public void setOnTabReselectedListener(f fVar) {
    }

    public void setScrollOffset(int i) {
        this.k0 = i;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        this.e0 = z;
        if (this.H != null) {
            requestLayout();
        }
    }

    public void setTabBackground(int i) {
        this.m0 = i;
    }

    public void setTabPaddingLeftRight(int i) {
        this.U = i;
        C();
    }

    public void setTextColor(int i) {
        setTextColor(t(i));
    }

    public void setTextColorResource(int i) {
        setTextColor(getResources().getColor(i));
    }

    public void setTextColorSelected(int i) {
        setTextColorSelected(t(i));
    }

    public void setTextColorStateListResource(int i) {
        setTextColor(getResources().getColorStateList(i));
    }

    public void setTextSize(int i) {
        this.V = i;
        C();
    }

    public void setUnderlineColor(int i) {
        this.Q = i;
        invalidate();
    }

    public void setUnderlineColorResource(int i) {
        this.Q = getResources().getColor(i);
        invalidate();
    }

    public void setUnderlineHeight(int i) {
        this.P = i;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.H = viewPager;
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        viewPager.setOnPageChangeListener(this.E);
        viewPager.getAdapter().i(this.B);
        this.B.b(true);
        x();
    }

    public final ColorStateList t(int i) {
        return new ColorStateList(new int[][]{new int[0]}, new int[]{i});
    }

    public void u(HX hx, int i, Object obj) {
        r(this.I, hx, LayoutInflater.from(getContext()).inflate(AbstractC9815yD0.A0, (ViewGroup) this, false), obj);
        int i2 = this.I;
        this.o0 = i2;
        this.I = i2 + 1;
        C();
    }

    public void v() {
        this.G.removeAllViews();
        this.I = 0;
        this.o0 = -1;
    }

    public final void w(View view) {
        TextView textView;
        if (view == null || (textView = (TextView) view.findViewById(AbstractC5056hD0.v2)) == null) {
            return;
        }
        textView.setTextColor(this.W);
    }

    public void x() {
        this.G.removeAllViews();
        this.I = this.H.getAdapter().c();
        for (int i = 0; i < this.I; i++) {
            this.H.getAdapter();
            s(i, this.H.getAdapter().e(i), LayoutInflater.from(getContext()).inflate(AbstractC9815yD0.A0, (ViewGroup) this, false), null);
        }
        C();
        getViewTreeObserver().addOnGlobalLayoutListener(new a());
    }

    public final void y(int i, int i2) {
        if (this.I == 0) {
            return;
        }
        int left = this.G.getChildAt(i).getLeft() + i2;
        if (i > 0 || i2 > 0) {
            int i3 = left - this.k0;
            C0689Ds0 indicatorCoordinates = getIndicatorCoordinates();
            left = (int) (i3 + ((((Float) indicatorCoordinates.b).floatValue() - ((Float) indicatorCoordinates.a).floatValue()) / 2.0f));
        }
        if (left != this.l0) {
            this.l0 = left;
            scrollTo(left, 0);
        }
    }

    public final void z(View view) {
        TextView textView;
        if (view == null || (textView = (TextView) view.findViewById(AbstractC5056hD0.v2)) == null) {
            return;
        }
        textView.setTextColor(this.a0);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.B = new h();
        this.E = new g();
        this.J = 0;
        this.K = 0.0f;
        this.O = 2;
        this.P = 0;
        this.R = 0;
        this.S = 0;
        this.U = 12;
        this.V = 14;
        this.W = null;
        this.a0 = null;
        this.b0 = 150;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = false;
        this.f0 = false;
        this.g0 = false;
        this.h0 = Typeface.DEFAULT;
        this.i0 = 0;
        this.j0 = 0;
        this.l0 = 0;
        this.m0 = AbstractC3374bD0.s0;
        this.o0 = 0;
        this.q0 = new e();
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.G = linearLayout;
        linearLayout.setOrientation(0);
        this.G.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.G);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.k0 = (int) TypedValue.applyDimension(1, this.k0, displayMetrics);
        this.O = (int) TypedValue.applyDimension(1, this.O, displayMetrics);
        this.P = (int) TypedValue.applyDimension(1, this.P, displayMetrics);
        this.S = (int) TypedValue.applyDimension(1, this.S, displayMetrics);
        this.U = (int) TypedValue.applyDimension(1, this.U, displayMetrics);
        this.R = (int) TypedValue.applyDimension(1, this.R, displayMetrics);
        this.V = (int) TypedValue.applyDimension(2, this.V, displayMetrics);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r0);
        this.V = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, this.V);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(2);
        int color = typedArrayObtainStyledAttributes.getColor(0, -1);
        this.Q = color;
        this.T = color;
        this.N = color;
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.c0 = dimensionPixelSize > 0 ? dimensionPixelSize : typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.d0 = dimensionPixelSize <= 0 ? typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0) : dimensionPixelSize;
        typedArrayObtainStyledAttributes.recycle();
        this.W = colorStateList == null ? t(Color.argb(this.b0, Color.red(color), Color.green(color), Color.blue(color))) : colorStateList;
        ColorStateList colorStateList2 = this.a0;
        this.a0 = colorStateList2 == null ? t(color) : colorStateList2;
        A();
        Paint paint = new Paint();
        this.L = paint;
        paint.setAntiAlias(true);
        this.L.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.M = paint2;
        paint2.setAntiAlias(true);
        this.M.setStrokeWidth(this.R);
        this.C = new LinearLayout.LayoutParams(-2, -1);
        this.D = new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.n0 == null) {
            this.n0 = getResources().getConfiguration().locale;
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.W = colorStateList;
        C();
    }

    public void setTextColorSelected(ColorStateList colorStateList) {
        this.a0 = colorStateList;
        C();
    }
}
