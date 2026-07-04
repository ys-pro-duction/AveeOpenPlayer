package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.a;
import com.daaw.AbstractC2737Xe1;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends androidx.appcompat.widget.a implements e.b, j {
    public androidx.appcompat.view.menu.e Q;
    public Context R;
    public int S;
    public boolean T;
    public ActionMenuPresenter U;
    public i.a V;
    public e.a W;
    public boolean a0;
    public int b0;
    public int c0;
    public int d0;
    public e e0;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements i.a {
        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends a.C0005a {
        public boolean a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;
        public boolean f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.a = cVar.a;
        }

        public c(int i, int i2) {
            super(i, i2);
            this.a = false;
        }
    }

    public class d implements e.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.e0;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.W;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int L(android.view.View r5, int r6, int r7, int r8, int r9) {
        /*
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r0 = (androidx.appcompat.widget.ActionMenuView.c) r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = r1 - r9
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            boolean r9 = r5 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r9 == 0) goto L1b
            r9 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            goto L1c
        L1b:
            r9 = 0
        L1c:
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L28
            boolean r9 = r9.s()
            if (r9 == 0) goto L28
            r9 = 1
            goto L29
        L28:
            r9 = 0
        L29:
            if (r7 <= 0) goto L4d
            r3 = 2
            if (r9 == 0) goto L30
            if (r7 < r3) goto L4d
        L30:
            int r7 = r7 * r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r5.measure(r7, r8)
            int r7 = r5.getMeasuredWidth()
            int r4 = r7 / r6
            int r7 = r7 % r6
            if (r7 == 0) goto L46
            int r4 = r4 + 1
        L46:
            if (r9 == 0) goto L4b
            if (r4 >= r3) goto L4b
            goto L4e
        L4b:
            r3 = r4
            goto L4e
        L4d:
            r3 = 0
        L4e:
            boolean r7 = r0.a
            if (r7 != 0) goto L55
            if (r9 == 0) goto L55
            r1 = 1
        L55:
            r0.d = r1
            r0.b = r3
            int r6 = r6 * r3
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r5.measure(r6, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.L(android.view.View, int, int, int, int):int");
    }

    public void B() {
        ActionMenuPresenter actionMenuPresenter = this.U;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.A();
        }
    }

    @Override // androidx.appcompat.widget.a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c F() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.a = true;
        return cVarGenerateDefaultLayoutParams;
    }

    public boolean G(int i) {
        boolean zA = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            zA = ((a) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof a)) ? zA : ((a) childAt2).b() | zA;
    }

    public boolean H() {
        ActionMenuPresenter actionMenuPresenter = this.U;
        return actionMenuPresenter != null && actionMenuPresenter.D();
    }

    public boolean I() {
        ActionMenuPresenter actionMenuPresenter = this.U;
        return actionMenuPresenter != null && actionMenuPresenter.F();
    }

    public boolean J() {
        ActionMenuPresenter actionMenuPresenter = this.U;
        return actionMenuPresenter != null && actionMenuPresenter.G();
    }

    public boolean K() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v47 */
    public final void M(int i, int i2) {
        long j;
        int i3;
        int i4;
        boolean z;
        ?? r3;
        int i5;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i6 = size - paddingLeft;
        int i7 = this.c0;
        int i8 = i6 / i7;
        int i9 = i6 % i7;
        if (i8 == 0) {
            setMeasuredDimension(i6, 0);
            return;
        }
        int i10 = i7 + (i9 / i8);
        int childCount = getChildCount();
        int iMax = 0;
        int i11 = 0;
        boolean z2 = false;
        int i12 = 0;
        int iMax2 = 0;
        int i13 = 0;
        long j2 = 0;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            int i14 = size2;
            if (childAt.getVisibility() == 8) {
                i5 = i10;
            } else {
                boolean z3 = childAt instanceof ActionMenuItemView;
                i12++;
                if (z3) {
                    int i15 = this.d0;
                    z = z3;
                    r3 = 0;
                    childAt.setPadding(i15, 0, i15, 0);
                } else {
                    z = z3;
                    r3 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f = r3;
                cVar.c = r3;
                cVar.b = r3;
                cVar.d = r3;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r3;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r3;
                cVar.e = z && ((ActionMenuItemView) childAt).s();
                int iL = L(childAt, i10, cVar.a ? 1 : i8, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iL);
                i5 = i10;
                if (cVar.d) {
                    i13++;
                }
                if (cVar.a) {
                    z2 = true;
                }
                i8 -= iL;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iL == 1) {
                    j2 |= (long) (1 << i11);
                }
            }
            i11++;
            size2 = i14;
            i10 = i5;
        }
        int i16 = size2;
        int i17 = i10;
        boolean z4 = z2 && i12 == 2;
        boolean z5 = false;
        while (i13 > 0 && i8 > 0) {
            int i18 = Integer.MAX_VALUE;
            long j3 = 0;
            int i19 = 0;
            int i20 = 0;
            j = 1;
            while (i20 < childCount) {
                c cVar2 = (c) getChildAt(i20).getLayoutParams();
                boolean z6 = z4;
                if (cVar2.d) {
                    int i21 = cVar2.b;
                    if (i21 < i18) {
                        j3 = 1 << i20;
                        i18 = i21;
                        i19 = 1;
                    } else if (i21 == i18) {
                        j3 |= 1 << i20;
                        i19++;
                    }
                }
                i20++;
                z4 = z6;
            }
            boolean z7 = z4;
            j2 |= j3;
            if (i19 > i8) {
                break;
            }
            int i22 = i18 + 1;
            int i23 = 0;
            while (i23 < childCount) {
                View childAt2 = getChildAt(i23);
                c cVar3 = (c) childAt2.getLayoutParams();
                long j4 = 1 << i23;
                if ((j3 & j4) == 0) {
                    if (cVar3.b == i22) {
                        j2 |= j4;
                    }
                    i4 = i23;
                } else {
                    if (z7 && cVar3.e && i8 == 1) {
                        int i24 = this.d0;
                        i4 = i23;
                        childAt2.setPadding(i24 + i17, 0, i24, 0);
                    } else {
                        i4 = i23;
                    }
                    cVar3.b++;
                    cVar3.f = true;
                    i8--;
                }
                i23 = i4 + 1;
            }
            z4 = z7;
            z5 = true;
        }
        j = 1;
        boolean z8 = !z2 && i12 == 1;
        if (i8 <= 0 || j2 == 0 || (i8 >= i12 - 1 && !z8 && iMax2 <= 1)) {
            i3 = 0;
        } else {
            float fBitCount = Long.bitCount(j2);
            if (z8) {
                i3 = 0;
            } else {
                if ((j2 & j) != 0) {
                    i3 = 0;
                    if (!((c) getChildAt(0).getLayoutParams()).e) {
                        fBitCount -= 0.5f;
                    }
                } else {
                    i3 = 0;
                }
                int i25 = childCount - 1;
                if ((j2 & ((long) (1 << i25))) != 0 && !((c) getChildAt(i25).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i26 = fBitCount > 0.0f ? (int) ((i8 * i17) / fBitCount) : 0;
            for (int i27 = 0; i27 < childCount; i27++) {
                if ((j2 & ((long) (1 << i27))) != 0) {
                    View childAt3 = getChildAt(i27);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.c = i26;
                        cVar4.f = true;
                        if (i27 == 0 && !cVar4.e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i26) / 2;
                        }
                        z5 = true;
                    } else if (cVar4.a) {
                        cVar4.c = i26;
                        cVar4.f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i26) / 2;
                        z5 = true;
                    } else {
                        if (i27 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i26 / 2;
                        }
                        if (i27 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i26 / 2;
                        }
                    }
                }
            }
        }
        if (z5) {
            while (i3 < childCount) {
                View childAt4 = getChildAt(i3);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.b * i17) + cVar5.c, 1073741824), childMeasureSpec);
                }
                i3++;
            }
        }
        setMeasuredDimension(i6, mode != 1073741824 ? iMax : i16);
    }

    public androidx.appcompat.view.menu.e N() {
        return this.Q;
    }

    public void O(i.a aVar, e.a aVar2) {
        this.V = aVar;
        this.W = aVar2;
    }

    public boolean P() {
        ActionMenuPresenter actionMenuPresenter = this.U;
        return actionMenuPresenter != null && actionMenuPresenter.M();
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean a(g gVar) {
        return this.Q.O(gVar, 0);
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(androidx.appcompat.view.menu.e eVar) {
        this.Q = eVar;
    }

    @Override // androidx.appcompat.widget.a, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.Q == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.Q = eVar;
            eVar.W(new d());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.U = actionMenuPresenter;
            actionMenuPresenter.L(true);
            ActionMenuPresenter actionMenuPresenter2 = this.U;
            i.a bVar = this.V;
            if (bVar == null) {
                bVar = new b();
            }
            actionMenuPresenter2.g(bVar);
            this.Q.c(this.U, this.R);
            this.U.J(this);
        }
        return this.Q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.U.C();
    }

    public int getPopupTheme() {
        return this.S;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.U;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.c(false);
            if (this.U.G()) {
                this.U.D();
                this.U.M();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    @Override // androidx.appcompat.widget.a, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.a0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean zB = AbstractC2737Xe1.b(this);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    G(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = i18 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public void onMeasure(int i, int i2) {
        androidx.appcompat.view.menu.e eVar;
        boolean z = this.a0;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.a0 = z2;
        if (z != z2) {
            this.b0 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.a0 && (eVar = this.Q) != null && size != this.b0) {
            this.b0 = size;
            eVar.N(true);
        }
        int childCount = getChildCount();
        if (this.a0 && childCount > 0) {
            M(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            c cVar = (c) getChildAt(i3).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.U.I(z);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.e0 = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.U.K(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.T = z;
    }

    public void setPopupTheme(int i) {
        if (this.S != i) {
            this.S = i;
            if (i == 0) {
                this.R = getContext();
            } else {
                this.R = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.U = actionMenuPresenter;
        actionMenuPresenter.J(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.c0 = (int) (56.0f * f);
        this.d0 = (int) (f * 4.0f);
        this.R = context;
        this.S = 0;
    }
}
