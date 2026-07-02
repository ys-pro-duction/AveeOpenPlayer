package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.i;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC6461mD0;
import com.daaw.C3590c00;
import com.daaw.C8820uh1;
import com.daaw.C9414wn0;
import com.daaw.InterfaceC1328Jw;
import com.daaw.InterfaceC1432Kw;
import com.daaw.InterfaceC8849un0;
import com.daaw.InterfaceC9135vn0;
import com.daaw.KC0;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC1328Jw, InterfaceC8849un0, InterfaceC9135vn0 {
    public static final int[] k0 = {KC0.b, R.attr.windowContentOverlay};
    public static final C8820uh1 l0 = new C8820uh1.b().d(C3590c00.b(0, 1, 0, 1)).a();
    public static final Rect m0 = new Rect();
    public int B;
    public int C;
    public ContentFrameLayout D;
    public ActionBarContainer E;
    public InterfaceC1432Kw F;
    public Drawable G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public final Rect N;
    public final Rect O;
    public final Rect P;
    public final Rect Q;
    public final Rect R;
    public final Rect S;
    public final Rect T;
    public final Rect U;
    public C8820uh1 V;
    public C8820uh1 W;
    public C8820uh1 a0;
    public C8820uh1 b0;
    public d c0;
    public OverScroller d0;
    public ViewPropertyAnimator e0;
    public final AnimatorListenerAdapter f0;
    public final Runnable g0;
    public final Runnable h0;
    public final C9414wn0 i0;
    public final f j0;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.e0 = null;
            actionBarOverlayLayout.K = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.e0 = null;
            actionBarOverlayLayout.K = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.e0 = actionBarOverlayLayout.E.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f0);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.e0 = actionBarOverlayLayout.E.animate().translationY(-ActionBarOverlayLayout.this.E.getHeight()).setListener(ActionBarOverlayLayout.this.f0);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z);

        void d();

        void e();

        void onWindowVisibilityChanged(int i);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i, int i2) {
            super(i, i2);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static final class f extends View {
        public f(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = 0;
        this.N = new Rect();
        this.O = new Rect();
        this.P = new Rect();
        this.Q = new Rect();
        this.R = new Rect();
        this.S = new Rect();
        this.T = new Rect();
        this.U = new Rect();
        C8820uh1 c8820uh1 = C8820uh1.b;
        this.V = c8820uh1;
        this.W = c8820uh1;
        this.a0 = c8820uh1;
        this.b0 = c8820uh1;
        this.f0 = new a();
        this.g0 = new b();
        this.h0 = new c();
        w(context);
        this.i0 = new C9414wn0(this);
        f fVar = new f(context);
        this.j0 = fVar;
        addView(fVar);
    }

    public void A() {
        if (this.D == null) {
            this.D = (ContentFrameLayout) findViewById(AbstractC6461mD0.b);
            this.E = (ActionBarContainer) findViewById(AbstractC6461mD0.c);
            this.F = u(findViewById(AbstractC6461mD0.a));
        }
    }

    public final void B() {
        v();
        this.g0.run();
    }

    public final boolean C(float f2) {
        this.d0.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.d0.getFinalY() > this.E.getHeight();
    }

    @Override // com.daaw.InterfaceC1328Jw
    public void a(Menu menu, i.a aVar) {
        A();
        this.F.a(menu, aVar);
    }

    @Override // com.daaw.InterfaceC1328Jw
    public boolean b() {
        A();
        return this.F.b();
    }

    @Override // com.daaw.InterfaceC1328Jw
    public void c() {
        A();
        this.F.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // com.daaw.InterfaceC1328Jw
    public boolean d() {
        A();
        return this.F.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.G != null) {
            int bottom = this.E.getVisibility() == 0 ? (int) (this.E.getBottom() + this.E.getTranslationY() + 0.5f) : 0;
            this.G.setBounds(0, bottom, getWidth(), this.G.getIntrinsicHeight() + bottom);
            this.G.draw(canvas);
        }
    }

    @Override // com.daaw.InterfaceC1328Jw
    public boolean e() {
        A();
        return this.F.e();
    }

    @Override // com.daaw.InterfaceC1328Jw
    public boolean f() {
        A();
        return this.F.f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // com.daaw.InterfaceC1328Jw
    public boolean g() {
        A();
        return this.F.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.E;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.i0.a();
    }

    public CharSequence getTitle() {
        A();
        return this.F.getTitle();
    }

    @Override // com.daaw.InterfaceC1328Jw
    public void h(int i) {
        A();
        if (i == 2) {
            this.F.v();
        } else if (i == 5) {
            this.F.w();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // com.daaw.InterfaceC1328Jw
    public void i() {
        A();
        this.F.h();
    }

    @Override // com.daaw.InterfaceC9135vn0
    public void j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        k(view, i, i2, i3, i4, i5);
    }

    @Override // com.daaw.InterfaceC8849un0
    public void k(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // com.daaw.InterfaceC8849un0
    public boolean l(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // com.daaw.InterfaceC8849un0
    public void m(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // com.daaw.InterfaceC8849un0
    public void n(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // com.daaw.InterfaceC8849un0
    public void o(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        A();
        C8820uh1 c8820uh1Z = C8820uh1.z(windowInsets, this);
        boolean zQ = q(this.E, new Rect(c8820uh1Z.k(), c8820uh1Z.m(), c8820uh1Z.l(), c8820uh1Z.j()), true, true, false, true);
        AbstractC2317Td1.h(this, c8820uh1Z, this.N);
        Rect rect = this.N;
        C8820uh1 c8820uh1O = c8820uh1Z.o(rect.left, rect.top, rect.right, rect.bottom);
        this.V = c8820uh1O;
        boolean z = true;
        if (!this.W.equals(c8820uh1O)) {
            this.W = this.V;
            zQ = true;
        }
        if (this.O.equals(this.N)) {
            z = zQ;
        } else {
            this.O.set(this.N);
        }
        if (z) {
            requestLayout();
        }
        return c8820uh1Z.a().c().b().x();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w(getContext());
        AbstractC2317Td1.m0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        A();
        measureChildWithMargins(this.E, i, 0, i2, 0);
        e eVar = (e) this.E.getLayoutParams();
        int iMax = Math.max(0, this.E.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.E.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.E.getMeasuredState());
        boolean z = (AbstractC2317Td1.N(this) & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        if (z) {
            measuredHeight = this.B;
            if (this.I && this.E.getTabContainer() != null) {
                measuredHeight += this.B;
            }
        } else {
            measuredHeight = this.E.getVisibility() != 8 ? this.E.getMeasuredHeight() : 0;
        }
        this.P.set(this.N);
        this.a0 = this.V;
        if (this.H || z || !r()) {
            this.a0 = new C8820uh1.b(this.a0).d(C3590c00.b(this.a0.k(), this.a0.m() + measuredHeight, this.a0.l(), this.a0.j())).a();
        } else {
            Rect rect = this.P;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.a0 = this.a0.o(0, measuredHeight, 0, 0);
        }
        q(this.D, this.P, true, true, true, true);
        if (!this.b0.equals(this.a0)) {
            C8820uh1 c8820uh1 = this.a0;
            this.b0 = c8820uh1;
            AbstractC2317Td1.i(this.D, c8820uh1);
        }
        measureChildWithMargins(this.D, i, 0, i2, 0);
        e eVar2 = (e) this.D.getLayoutParams();
        int iMax3 = Math.max(iMax, this.D.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.D.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.D.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!this.J || !z) {
            return false;
        }
        if (C(f3)) {
            p();
        } else {
            B();
        }
        this.K = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.L + i2;
        this.L = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.i0.b(view, view2, i);
        this.L = getActionBarHideOffset();
        v();
        d dVar = this.c0;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.E.getVisibility() != 0) {
            return false;
        }
        return this.J;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.J && !this.K) {
            if (this.L <= this.E.getHeight()) {
                z();
            } else {
                y();
            }
        }
        d dVar = this.c0;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        A();
        int i2 = this.M ^ i;
        this.M = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        d dVar = this.c0;
        if (dVar != null) {
            dVar.c(!z2);
            if (z || !z2) {
                this.c0.a();
            } else {
                this.c0.d();
            }
        }
        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || this.c0 == null) {
            return;
        }
        AbstractC2317Td1.m0(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.C = i;
        d dVar = this.c0;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i);
        }
    }

    public final void p() {
        v();
        this.h0.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            return r0
        L35:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    public final boolean r() {
        AbstractC2317Td1.h(this.j0, l0, this.Q);
        return !this.Q.equals(m0);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public void setActionBarHideOffset(int i) {
        v();
        this.E.setTranslationY(-Math.max(0, Math.min(i, this.E.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.c0 = dVar;
        if (getWindowToken() != null) {
            this.c0.onWindowVisibilityChanged(this.C);
            int i = this.M;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                AbstractC2317Td1.m0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.I = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.J) {
            this.J = z;
            if (z) {
                return;
            }
            v();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        A();
        this.F.setIcon(i);
    }

    public void setLogo(int i) {
        A();
        this.F.n(i);
    }

    public void setOverlayMode(boolean z) {
        this.H = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // com.daaw.InterfaceC1328Jw
    public void setWindowCallback(Window.Callback callback) {
        A();
        this.F.setWindowCallback(callback);
    }

    @Override // com.daaw.InterfaceC1328Jw
    public void setWindowTitle(CharSequence charSequence) {
        A();
        this.F.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC1432Kw u(View view) {
        if (view instanceof InterfaceC1432Kw) {
            return (InterfaceC1432Kw) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void v() {
        removeCallbacks(this.g0);
        removeCallbacks(this.h0);
        ViewPropertyAnimator viewPropertyAnimator = this.e0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void w(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(k0);
        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.G = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.d0 = new OverScroller(context);
    }

    public boolean x() {
        return this.H;
    }

    public final void y() {
        v();
        postDelayed(this.h0, 600L);
    }

    public final void z() {
        v();
        postDelayed(this.g0, 600L);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        A();
        this.F.setIcon(drawable);
    }
}
