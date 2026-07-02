package com.daaw;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.gV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4848gV extends AbstractC0521Ce1 {
    public final Rect d;
    public final Rect e;
    public int f;
    public int g;

    public AbstractC4848gV() {
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }

    public static int L(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    @Override // com.daaw.AbstractC0521Ce1
    public void F(CoordinatorLayout coordinatorLayout, View view, int i) {
        View viewG = G(coordinatorLayout.q(view));
        if (viewG == null) {
            super.F(coordinatorLayout, view, i);
            this.f = 0;
            return;
        }
        CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
        Rect rect = this.d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, viewG.getBottom() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((coordinatorLayout.getHeight() + viewG.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        C8820uh1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && AbstractC2317Td1.A(coordinatorLayout) && !AbstractC2317Td1.A(view)) {
            rect.left += lastWindowInsets.k();
            rect.right -= lastWindowInsets.l();
        }
        Rect rect2 = this.e;
        WT.a(L(eVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int iH = H(viewG);
        view.layout(rect2.left, rect2.top - iH, rect2.right, rect2.bottom - iH);
        this.f = rect2.top - viewG.getBottom();
    }

    public abstract View G(List list);

    public final int H(View view) {
        if (this.g == 0) {
            return 0;
        }
        float fI = I(view);
        int i = this.g;
        return AbstractC9105vh0.b((int) (fI * i), 0, i);
    }

    public abstract float I(View view);

    public int J(View view) {
        return view.getMeasuredHeight();
    }

    public final int K() {
        return this.f;
    }

    public final void M(int i) {
        this.g = i;
    }

    public boolean N() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View viewG;
        C8820uh1 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (viewG = G(coordinatorLayout.q(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (AbstractC2317Td1.A(viewG) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.m() + lastWindowInsets.j();
        }
        int iJ = size + J(viewG);
        int measuredHeight = viewG.getMeasuredHeight();
        if (N()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iJ -= measuredHeight;
        }
        coordinatorLayout.H(view, i, i2, View.MeasureSpec.makeMeasureSpec(iJ, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    public AbstractC4848gV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }
}
