package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC2737Xe1;
import com.daaw.AbstractC3867d;
import com.daaw.AbstractC5060hE0;
import com.daaw.AbstractC6461mD0;
import com.daaw.AbstractC8081s2;
import com.daaw.C1154Ie1;
import com.daaw.DD0;
import com.daaw.KC0;
import com.daaw.Z31;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbstractC3867d {
    public CharSequence J;
    public CharSequence K;
    public View L;
    public View M;
    public View N;
    public LinearLayout O;
    public TextView P;
    public TextView Q;
    public int R;
    public int S;
    public boolean T;
    public int U;

    public class a implements View.OnClickListener {
        public final /* synthetic */ AbstractC8081s2 B;

        public a(AbstractC8081s2 abstractC8081s2) {
            this.B = abstractC8081s2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.B.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    @Override // com.daaw.AbstractC3867d
    public /* bridge */ /* synthetic */ C1154Ie1 f(int i, long j) {
        return super.f(i, j);
    }

    public void g() {
        if (this.L == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // com.daaw.AbstractC3867d
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // com.daaw.AbstractC3867d
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.K;
    }

    public CharSequence getTitle() {
        return this.J;
    }

    public void h(AbstractC8081s2 abstractC8081s2) {
        View view = this.L;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.U, (ViewGroup) this, false);
            this.L = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.L);
        }
        View viewFindViewById = this.L.findViewById(AbstractC6461mD0.i);
        this.M = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(abstractC8081s2));
        e eVar = (e) abstractC8081s2.e();
        ActionMenuPresenter actionMenuPresenter = this.E;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.A();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.E = actionMenuPresenter2;
        actionMenuPresenter2.L(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.E, this.C);
        ActionMenuView actionMenuView = (ActionMenuView) this.E.q(this);
        this.D = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.D, layoutParams);
    }

    public final void i() {
        if (this.O == null) {
            LayoutInflater.from(getContext()).inflate(DD0.a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.O = linearLayout;
            this.P = (TextView) linearLayout.findViewById(AbstractC6461mD0.e);
            this.Q = (TextView) this.O.findViewById(AbstractC6461mD0.d);
            if (this.R != 0) {
                this.P.setTextAppearance(getContext(), this.R);
            }
            if (this.S != 0) {
                this.Q.setTextAppearance(getContext(), this.S);
            }
        }
        this.P.setText(this.J);
        this.Q.setText(this.K);
        boolean zIsEmpty = TextUtils.isEmpty(this.J);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.K);
        this.Q.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.O.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.O.getParent() == null) {
            addView(this.O);
        }
    }

    public boolean j() {
        return this.T;
    }

    public void k() {
        removeAllViews();
        this.N = null;
        this.D = null;
        this.E = null;
        View view = this.M;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        ActionMenuPresenter actionMenuPresenter = this.E;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.M();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.E;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.D();
            this.E.E();
        }
    }

    @Override // com.daaw.AbstractC3867d, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zB = AbstractC2737Xe1.b(this);
        int paddingRight = zB ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.L;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.L.getLayoutParams();
            int i5 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = AbstractC3867d.d(paddingRight, i5, zB);
            paddingRight = AbstractC3867d.d(iD + e(this.L, iD, paddingTop, paddingTop2, zB), i6, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.O;
        if (linearLayout != null && this.N == null && linearLayout.getVisibility() != 8) {
            iE += e(this.O, iE, paddingTop, paddingTop2, zB);
        }
        View view2 = this.N;
        if (view2 != null) {
            e(view2, iE, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.D;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.F;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.L;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.L.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.D;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.D, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.O;
        if (linearLayout != null && this.N == null) {
            if (this.T) {
                this.O.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.O.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.O.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.N;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.N.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.F > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // com.daaw.AbstractC3867d, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.daaw.AbstractC3867d
    public void setContentHeight(int i) {
        this.F = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.N;
        if (view2 != null) {
            removeView(view2);
        }
        this.N = view;
        if (view != null && (linearLayout = this.O) != null) {
            removeView(linearLayout);
            this.O = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.K = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.J = charSequence;
        i();
        AbstractC2317Td1.s0(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.T) {
            requestLayout();
        }
        this.T = z;
    }

    @Override // com.daaw.AbstractC3867d, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, KC0.g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Z31 z31V = Z31.v(context, attributeSet, AbstractC5060hE0.y, i, 0);
        setBackground(z31V.g(AbstractC5060hE0.z));
        this.R = z31V.n(AbstractC5060hE0.D, 0);
        this.S = z31V.n(AbstractC5060hE0.C, 0);
        this.F = z31V.m(AbstractC5060hE0.B, 0);
        this.U = z31V.n(AbstractC5060hE0.A, DD0.d);
        z31V.x();
    }
}
