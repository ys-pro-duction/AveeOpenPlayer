package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC2737Xe1;
import com.daaw.AbstractC5060hE0;
import com.daaw.AbstractC6687n2;
import com.daaw.AbstractC6978o41;
import com.daaw.C10231zj0;
import com.daaw.C7605qK0;
import com.daaw.C9239w9;
import com.daaw.C9797y9;
import com.daaw.G9;
import com.daaw.GZ0;
import com.daaw.InterfaceC0551Cm;
import com.daaw.InterfaceC0861Fj0;
import com.daaw.InterfaceC1432Kw;
import com.daaw.InterfaceC9952yj0;
import com.daaw.KC0;
import com.daaw.N9;
import com.daaw.WT;
import com.daaw.Z31;
import com.revenuecat.purchases.common.UtilsKt;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC9952yj0 {
    public ActionMenuView B;
    public TextView C;
    public TextView D;
    public ImageButton E;
    public ImageView F;
    public Drawable G;
    public CharSequence H;
    public ImageButton I;
    public View J;
    public Context K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public C7605qK0 U;
    public int V;
    public int W;
    public int a0;
    public CharSequence b0;
    public CharSequence c0;
    public ColorStateList d0;
    public ColorStateList e0;
    public boolean f0;
    public boolean g0;
    public final ArrayList h0;
    public final ArrayList i0;
    public final int[] j0;
    public final C10231zj0 k0;
    public ArrayList l0;
    public h m0;
    public final ActionMenuView.e n0;
    public androidx.appcompat.widget.c o0;
    public ActionMenuPresenter p0;
    public f q0;
    public i.a r0;
    public e.a s0;
    public boolean t0;
    public OnBackInvokedCallback u0;
    public OnBackInvokedDispatcher v0;
    public boolean w0;
    public final Runnable x0;

    public class a implements ActionMenuView.e {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.k0.d(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.m0;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.S();
        }
    }

    public class c implements e.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e.a aVar = Toolbar.this.s0;
            return aVar != null && aVar.a(eVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.B.J()) {
                Toolbar.this.k0.e(eVar);
            }
            e.a aVar = Toolbar.this.s0;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.f();
        }
    }

    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: com.daaw.l41
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(UtilsKt.MICROS_MULTIPLIER, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class f implements i {
        public androidx.appcompat.view.menu.e B;
        public androidx.appcompat.view.menu.g C;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.i
        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.i
        public void c(boolean z) {
            if (this.C != null) {
                androidx.appcompat.view.menu.e eVar = this.B;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i = 0; i < size; i++) {
                        if (this.B.getItem(i) == this.C) {
                            return;
                        }
                    }
                }
                e(this.B, this.C);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean d() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean e(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.J;
            if (callback instanceof InterfaceC0551Cm) {
                ((InterfaceC0551Cm) callback).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.J);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.I);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.J = null;
            toolbar3.a();
            this.C = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.T();
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean f(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.h();
            ViewParent parent = Toolbar.this.I.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.I);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.I);
            }
            Toolbar.this.J = gVar.getActionView();
            this.C = gVar;
            ViewParent parent2 = Toolbar.this.J.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.J);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.a = (toolbar4.O & 112) | 8388611;
                gVarGenerateDefaultLayoutParams.b = 2;
                toolbar4.J.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.J);
            }
            Toolbar.this.K();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.J;
            if (callback instanceof InterfaceC0551Cm) {
                ((InterfaceC0551Cm) callback).c();
            }
            Toolbar.this.T();
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.i
        public void i(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.B;
            if (eVar2 != null && (gVar = this.C) != null) {
                eVar2.f(gVar);
            }
            this.B = eVar;
        }

        @Override // androidx.appcompat.view.menu.i
        public void j(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean l(l lVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public Parcelable m() {
            return null;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, KC0.L);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new GZ0(getContext());
    }

    public void A() {
        Iterator it = this.l0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        I();
    }

    public final boolean B(View view) {
        return view.getParent() == this || this.i0.contains(view);
    }

    public boolean C() {
        ActionMenuView actionMenuView = this.B;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean D() {
        ActionMenuView actionMenuView = this.B;
        return actionMenuView != null && actionMenuView.J();
    }

    public final int E(View view, int i, int[] iArr, int i2) {
        g gVar = (g) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int iR = r(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iR, iMax + measuredWidth, view.getMeasuredHeight() + iR);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    public final int F(View view, int i, int[] iArr, int i2) {
        g gVar = (g) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iR = r(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iR, iMax, view.getMeasuredHeight() + iR);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    public final int G(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void H(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void I() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.k0.b(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.l0 = currentMenuItems2;
    }

    public final void J() {
        removeCallbacks(this.x0);
        post(this.x0);
    }

    public void K() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).b != 2 && childAt != this.B) {
                removeViewAt(childCount);
                this.i0.add(childAt);
            }
        }
    }

    public void L(int i, int i2) {
        i();
        this.U.g(i, i2);
    }

    public void M(androidx.appcompat.view.menu.e eVar, ActionMenuPresenter actionMenuPresenter) {
        if (eVar == null && this.B == null) {
            return;
        }
        l();
        androidx.appcompat.view.menu.e eVarN = this.B.N();
        if (eVarN == eVar) {
            return;
        }
        if (eVarN != null) {
            eVarN.R(this.p0);
            eVarN.R(this.q0);
        }
        if (this.q0 == null) {
            this.q0 = new f();
        }
        actionMenuPresenter.I(true);
        if (eVar != null) {
            eVar.c(actionMenuPresenter, this.K);
            eVar.c(this.q0, this.K);
        } else {
            actionMenuPresenter.i(this.K, null);
            this.q0.i(this.K, null);
            actionMenuPresenter.c(true);
            this.q0.c(true);
        }
        this.B.setPopupTheme(this.L);
        this.B.setPresenter(actionMenuPresenter);
        this.p0 = actionMenuPresenter;
        T();
    }

    public void N(i.a aVar, e.a aVar2) {
        this.r0 = aVar;
        this.s0 = aVar2;
        ActionMenuView actionMenuView = this.B;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void O(Context context, int i) {
        this.N = i;
        TextView textView = this.D;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void P(Context context, int i) {
        this.M = i;
        TextView textView = this.C;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public final boolean Q() {
        if (!this.t0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (R(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean R(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean S() {
        ActionMenuView actionMenuView = this.B;
        return actionMenuView != null && actionMenuView.P();
    }

    public void T() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z = x() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.w0;
            if (z && this.v0 == null) {
                if (this.u0 == null) {
                    this.u0 = e.b(new Runnable() { // from class: com.daaw.j41
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.B.f();
                        }
                    });
                }
                e.c(onBackInvokedDispatcherA, this.u0);
                this.v0 = onBackInvokedDispatcherA;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.v0) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.u0);
            this.v0 = null;
        }
    }

    public void a() {
        for (int size = this.i0.size() - 1; size >= 0; size--) {
            addView((View) this.i0.get(size));
        }
        this.i0.clear();
    }

    public final void b(List list, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iB = WT.b(i, getLayoutDirection());
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.b == 0 && R(childAt) && q(gVar.a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.b == 0 && R(childAt2) && q(gVar2.a) == iB) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g gVarGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        gVarGenerateDefaultLayoutParams.b = 1;
        if (!z || this.J == null) {
            addView(view, gVarGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.i0.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.B) != null && actionMenuView.K();
    }

    @Override // com.daaw.InterfaceC9952yj0
    public void e(InterfaceC0861Fj0 interfaceC0861Fj0) {
        this.k0.f(interfaceC0861Fj0);
    }

    public void f() {
        f fVar = this.q0;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.C;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void g() {
        ActionMenuView actionMenuView = this.B;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.I;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.I;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C7605qK0 c7605qK0 = this.U;
        if (c7605qK0 != null) {
            return c7605qK0.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.W;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C7605qK0 c7605qK0 = this.U;
        if (c7605qK0 != null) {
            return c7605qK0.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C7605qK0 c7605qK0 = this.U;
        if (c7605qK0 != null) {
            return c7605qK0.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C7605qK0 c7605qK0 = this.U;
        if (c7605qK0 != null) {
            return c7605qK0.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.V;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarN;
        ActionMenuView actionMenuView = this.B;
        return (actionMenuView == null || (eVarN = actionMenuView.N()) == null || !eVarN.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.W, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.V, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.F;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.F;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        k();
        return this.B.getMenu();
    }

    public View getNavButtonView() {
        return this.E;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.E;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.E;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.p0;
    }

    public Drawable getOverflowIcon() {
        k();
        return this.B.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.K;
    }

    public int getPopupTheme() {
        return this.L;
    }

    public CharSequence getSubtitle() {
        return this.c0;
    }

    public final TextView getSubtitleTextView() {
        return this.D;
    }

    public CharSequence getTitle() {
        return this.b0;
    }

    public int getTitleMarginBottom() {
        return this.T;
    }

    public int getTitleMarginEnd() {
        return this.R;
    }

    public int getTitleMarginStart() {
        return this.Q;
    }

    public int getTitleMarginTop() {
        return this.S;
    }

    public final TextView getTitleTextView() {
        return this.C;
    }

    public InterfaceC1432Kw getWrapper() {
        if (this.o0 == null) {
            this.o0 = new androidx.appcompat.widget.c(this, true);
        }
        return this.o0;
    }

    public void h() {
        if (this.I == null) {
            C9239w9 c9239w9 = new C9239w9(getContext(), null, KC0.K);
            this.I = c9239w9;
            c9239w9.setImageDrawable(this.G);
            this.I.setContentDescription(this.H);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.a = (this.O & 112) | 8388611;
            gVarGenerateDefaultLayoutParams.b = 2;
            this.I.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.I.setOnClickListener(new d());
        }
    }

    public final void i() {
        if (this.U == null) {
            this.U = new C7605qK0();
        }
    }

    public final void j() {
        if (this.F == null) {
            this.F = new C9797y9(getContext());
        }
    }

    public final void k() {
        l();
        if (this.B.N() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.B.getMenu();
            if (this.q0 == null) {
                this.q0 = new f();
            }
            this.B.setExpandedActionViewsExclusive(true);
            eVar.c(this.q0, this.K);
            T();
        }
    }

    public final void l() {
        if (this.B == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.B = actionMenuView;
            actionMenuView.setPopupTheme(this.L);
            this.B.setOnMenuItemClickListener(this.n0);
            this.B.O(this.r0, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.a = (this.O & 112) | 8388613;
            this.B.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.B, false);
        }
    }

    public final void m() {
        if (this.E == null) {
            this.E = new C9239w9(getContext(), null, KC0.K);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.a = (this.O & 112) | 8388611;
            this.E.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        T();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.x0);
        T();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.g0 = false;
        }
        if (!this.g0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.g0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.g0 = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0298 A[LOOP:0: B:104:0x0296->B:105:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b6 A[LOOP:1: B:107:0x02b4->B:108:0x02b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ec A[LOOP:2: B:116:0x02ea->B:117:0x02ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int[] iArr;
        int iCombineMeasuredStates2;
        int iMax2;
        int measuredHeight;
        int[] iArr2 = this.j0;
        boolean zB = AbstractC2737Xe1.b(this);
        int i3 = !zB ? 1 : 0;
        if (R(this.E)) {
            H(this.E, i, 0, i2, 0, this.P);
            measuredWidth = this.E.getMeasuredWidth() + t(this.E);
            iMax = Math.max(0, this.E.getMeasuredHeight() + v(this.E));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.E.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (R(this.I)) {
            H(this.I, i, 0, i2, 0, this.P);
            measuredWidth = this.I.getMeasuredWidth() + t(this.I);
            iMax = Math.max(iMax, this.I.getMeasuredHeight() + v(this.I));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.I.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (R(this.B)) {
            H(this.B, i, iMax3, i2, 0, this.P);
            measuredWidth2 = this.B.getMeasuredWidth() + t(this.B);
            iMax = Math.max(iMax, this.B.getMeasuredHeight() + v(this.B));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.B.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[i3] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (R(this.J)) {
            iArr = iArr2;
            iMax4 += G(this.J, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.J.getMeasuredHeight() + v(this.J));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.J.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (R(this.F)) {
            iMax4 += G(this.F, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.F.getMeasuredHeight() + v(this.F));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.F.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((g) childAt.getLayoutParams()).b == 0 && R(childAt)) {
                iMax4 += G(childAt, i, iMax4, i2, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + v(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i5 = iMax4;
        int i6 = this.S + this.T;
        int i7 = this.Q + this.R;
        if (R(this.C)) {
            G(this.C, i, i5 + i7, i2, i6, iArr);
            int measuredWidth3 = this.C.getMeasuredWidth() + t(this.C);
            int measuredHeight2 = this.C.getMeasuredHeight() + v(this.C);
            iMax2 = measuredWidth3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.C.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            measuredHeight = 0;
        }
        if (R(this.D)) {
            iMax2 = Math.max(iMax2, G(this.D, i, i5 + i7, i2, i6 + measuredHeight, iArr));
            measuredHeight += this.D.getMeasuredHeight() + v(this.D);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.D.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, measuredHeight);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i5 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), Q() ? 0 : View.resolveSizeAndState(Math.max(iMax6 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        ActionMenuView actionMenuView = this.B;
        androidx.appcompat.view.menu.e eVarN = actionMenuView != null ? actionMenuView.N() : null;
        int i = savedState.D;
        if (i != 0 && this.q0 != null && eVarN != null && (menuItemFindItem = eVarN.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.E) {
            J();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        i();
        this.U.f(i == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.q0;
        if (fVar != null && (gVar = fVar.C) != null) {
            savedState.D = gVar.getItemId();
        }
        savedState.E = D();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f0 = false;
        }
        if (!this.f0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f0 = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof AbstractC6687n2.a ? new g((AbstractC6687n2.a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    public final int q(int i) {
        int layoutDirection = getLayoutDirection();
        int iB = WT.b(i, layoutDirection) & 7;
        return (iB == 1 || iB == 3 || iB == 5) ? iB : layoutDirection == 1 ? 5 : 3;
    }

    public final int r(View view, int i) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int iS = s(gVar.a);
        if (iS == 48) {
            return getPaddingTop() - i2;
        }
        if (iS == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i3 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i3) {
            iMax = i3;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i5 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i4 < i5) {
                iMax = Math.max(0, iMax - (i5 - i4));
            }
        }
        return paddingTop + iMax;
    }

    public final int s(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.a0 & 112;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.w0 != z) {
            this.w0 = z;
            T();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(G9.b(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.t0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.W) {
            this.W = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.V) {
            this.V = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(G9.b(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(G9.b(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m();
        this.E.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.m0 = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        k();
        this.B.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.L != i) {
            this.L = i;
            if (i == 0) {
                this.K = getContext();
            } else {
                this.K = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.T = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.R = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.Q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.S = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    @Override // com.daaw.InterfaceC9952yj0
    public void u(InterfaceC0861Fj0 interfaceC0861Fj0) {
        this.k0.a(interfaceC0861Fj0);
    }

    public final int v(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int w(List list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int measuredWidth = 0;
        while (i3 < size) {
            View view = (View) list.get(i3);
            g gVar = (g) view.getLayoutParams();
            int i4 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i;
            int i5 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i2;
            int iMax = Math.max(0, i4);
            int iMax2 = Math.max(0, i5);
            int iMax3 = Math.max(0, -i4);
            int iMax4 = Math.max(0, -i5);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i3++;
            i2 = iMax4;
            i = iMax3;
        }
        return measuredWidth;
    }

    public boolean x() {
        f fVar = this.q0;
        return (fVar == null || fVar.C == null) ? false : true;
    }

    public boolean y() {
        ActionMenuView actionMenuView = this.B;
        return actionMenuView != null && actionMenuView.H();
    }

    public void z(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public static class g extends AbstractC6687n2.a {
        public int b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0;
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i, int i2) {
            super(i, i2);
            this.b = 0;
            this.a = 8388627;
        }

        public g(g gVar) {
            super((AbstractC6687n2.a) gVar);
            this.b = 0;
            this.b = gVar.b;
        }

        public g(AbstractC6687n2.a aVar) {
            super(aVar);
            this.b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a0 = 8388627;
        this.h0 = new ArrayList();
        this.i0 = new ArrayList();
        this.j0 = new int[2];
        this.k0 = new C10231zj0(new Runnable() { // from class: com.daaw.k41
            @Override // java.lang.Runnable
            public final void run() {
                this.B.A();
            }
        });
        this.l0 = new ArrayList();
        this.n0 = new a();
        this.x0 = new b();
        Z31 z31V = Z31.v(getContext(), attributeSet, AbstractC5060hE0.O2, i, 0);
        AbstractC2317Td1.n0(this, context, AbstractC5060hE0.O2, attributeSet, z31V.r(), i, 0);
        this.M = z31V.n(AbstractC5060hE0.q3, 0);
        this.N = z31V.n(AbstractC5060hE0.h3, 0);
        this.a0 = z31V.l(AbstractC5060hE0.P2, this.a0);
        this.O = z31V.l(AbstractC5060hE0.Q2, 48);
        int iE = z31V.e(AbstractC5060hE0.k3, 0);
        iE = z31V.s(AbstractC5060hE0.p3) ? z31V.e(AbstractC5060hE0.p3, iE) : iE;
        this.T = iE;
        this.S = iE;
        this.R = iE;
        this.Q = iE;
        int iE2 = z31V.e(AbstractC5060hE0.n3, -1);
        if (iE2 >= 0) {
            this.Q = iE2;
        }
        int iE3 = z31V.e(AbstractC5060hE0.m3, -1);
        if (iE3 >= 0) {
            this.R = iE3;
        }
        int iE4 = z31V.e(AbstractC5060hE0.o3, -1);
        if (iE4 >= 0) {
            this.S = iE4;
        }
        int iE5 = z31V.e(AbstractC5060hE0.l3, -1);
        if (iE5 >= 0) {
            this.T = iE5;
        }
        this.P = z31V.f(AbstractC5060hE0.b3, -1);
        int iE6 = z31V.e(AbstractC5060hE0.X2, Integer.MIN_VALUE);
        int iE7 = z31V.e(AbstractC5060hE0.T2, Integer.MIN_VALUE);
        int iF = z31V.f(AbstractC5060hE0.V2, 0);
        int iF2 = z31V.f(AbstractC5060hE0.W2, 0);
        i();
        this.U.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.U.g(iE6, iE7);
        }
        this.V = z31V.e(AbstractC5060hE0.Y2, Integer.MIN_VALUE);
        this.W = z31V.e(AbstractC5060hE0.U2, Integer.MIN_VALUE);
        this.G = z31V.g(AbstractC5060hE0.S2);
        this.H = z31V.p(AbstractC5060hE0.R2);
        CharSequence charSequenceP = z31V.p(AbstractC5060hE0.j3);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = z31V.p(AbstractC5060hE0.g3);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.K = getContext();
        setPopupTheme(z31V.n(AbstractC5060hE0.f3, 0));
        Drawable drawableG = z31V.g(AbstractC5060hE0.e3);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = z31V.p(AbstractC5060hE0.d3);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = z31V.g(AbstractC5060hE0.Z2);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = z31V.p(AbstractC5060hE0.a3);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        if (z31V.s(AbstractC5060hE0.r3)) {
            setTitleTextColor(z31V.c(AbstractC5060hE0.r3));
        }
        if (z31V.s(AbstractC5060hE0.i3)) {
            setSubtitleTextColor(z31V.c(AbstractC5060hE0.i3));
        }
        if (z31V.s(AbstractC5060hE0.c3)) {
            z(z31V.n(AbstractC5060hE0.c3, 0));
        }
        z31V.x();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            h();
        }
        ImageButton imageButton = this.I;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            h();
            this.I.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.I;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.G);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            j();
            if (!B(this.F)) {
                c(this.F, true);
            }
        } else {
            ImageView imageView = this.F;
            if (imageView != null && B(imageView)) {
                removeView(this.F);
                this.i0.remove(this.F);
            }
        }
        ImageView imageView2 = this.F;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            j();
        }
        ImageView imageView = this.F;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m();
        }
        ImageButton imageButton = this.E;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            AbstractC6978o41.a(this.E, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m();
            if (!B(this.E)) {
                c(this.E, true);
            }
        } else {
            ImageButton imageButton = this.E;
            if (imageButton != null && B(imageButton)) {
                removeView(this.E);
                this.i0.remove(this.E);
            }
        }
        ImageButton imageButton2 = this.E;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.D;
            if (textView != null && B(textView)) {
                removeView(this.D);
                this.i0.remove(this.D);
            }
        } else {
            if (this.D == null) {
                Context context = getContext();
                N9 n9 = new N9(context);
                this.D = n9;
                n9.setSingleLine();
                this.D.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.N;
                if (i != 0) {
                    this.D.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.e0;
                if (colorStateList != null) {
                    this.D.setTextColor(colorStateList);
                }
            }
            if (!B(this.D)) {
                c(this.D, true);
            }
        }
        TextView textView2 = this.D;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.c0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.e0 = colorStateList;
        TextView textView = this.D;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.C;
            if (textView != null && B(textView)) {
                removeView(this.C);
                this.i0.remove(this.C);
            }
        } else {
            if (this.C == null) {
                Context context = getContext();
                N9 n9 = new N9(context);
                this.C = n9;
                n9.setSingleLine();
                this.C.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.M;
                if (i != 0) {
                    this.C.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.d0;
                if (colorStateList != null) {
                    this.C.setTextColor(colorStateList);
                }
            }
            if (!B(this.C)) {
                c(this.C, true);
            }
        }
        TextView textView2 = this.C;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.b0 = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.d0 = colorStateList;
        TextView textView = this.C;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int D;
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.D = parcel.readInt();
            this.E = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.D);
            parcel.writeInt(this.E ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
