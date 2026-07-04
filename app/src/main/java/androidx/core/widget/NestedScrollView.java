package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC4435f2;
import com.daaw.AbstractC6189lF;
import com.daaw.AbstractC8560tl0;
import com.daaw.C5554j1;
import com.daaw.C8570tn0;
import com.daaw.C9414wn0;
import com.daaw.EC0;
import com.daaw.InterfaceC9135vn0;
import com.daaw.TB;
import com.daaw.UB;
import com.daaw.Z1;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC9135vn0 {
    public static final float h0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final a i0 = new a();
    public static final int[] j0 = {R.attr.fillViewport};
    public final float B;
    public long C;
    public final Rect D;
    public OverScroller E;
    public EdgeEffect F;
    public EdgeEffect G;
    public int H;
    public boolean I;
    public boolean J;
    public View K;
    public boolean L;
    public VelocityTracker M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public final int[] T;
    public final int[] U;
    public int V;
    public int W;
    public SavedState a0;
    public final C9414wn0 b0;
    public final C8570tn0 c0;
    public float d0;
    public d e0;
    public final c f0;
    public TB g0;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.B + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.B);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.B = parcel.readInt();
        }
    }

    public static class a extends C5554j1 {
        @Override // com.daaw.C5554j1
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            AbstractC4435f2.a(accessibilityEvent, nestedScrollView.getScrollX());
            AbstractC4435f2.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // com.daaw.C5554j1
        public void g(View view, Z1 z1) {
            int scrollRange;
            super.g(view, z1);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            z1.n0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            z1.N0(true);
            if (nestedScrollView.getScrollY() > 0) {
                z1.b(Z1.a.r);
                z1.b(Z1.a.C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                z1.b(Z1.a.q);
                z1.b(Z1.a.E);
            }
        }

        @Override // com.daaw.C5554j1
        public boolean j(View view, int i, Bundle bundle) {
            if (super.j(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.W(0, iMax, true);
                    return true;
                }
                if (i != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.W(0, iMin, true);
            return true;
        }
    }

    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public class c implements UB {
        public c() {
        }

        @Override // com.daaw.UB
        public boolean a(float f) {
            if (f == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.v((int) f);
            return true;
        }

        @Override // com.daaw.UB
        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // com.daaw.UB
        public void c() {
            NestedScrollView.this.E.abortAnimation();
        }
    }

    public interface d {
        void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, EC0.c);
    }

    public static boolean F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && F((View) parent, view2);
    }

    public static int f(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    public final void A() {
        VelocityTracker velocityTracker = this.M;
        if (velocityTracker == null) {
            this.M = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final void B() {
        this.E = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.P = viewConfiguration.getScaledTouchSlop();
        this.Q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.R = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final void C() {
        if (this.M == null) {
            this.M = VelocityTracker.obtain();
        }
    }

    public final void D(int i, int i2) {
        this.H = i;
        this.S = i2;
        X(2, 0);
    }

    public final boolean E(View view) {
        return !G(view, 0, getHeight());
    }

    public final boolean G(View view, int i, int i2) {
        view.getDrawingRect(this.D);
        offsetDescendantRectToMyCoords(view, this.D);
        return this.D.bottom + i >= getScrollY() && this.D.top - i <= getScrollY() + i2;
    }

    public final void H(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.c0.e(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    public final void I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.S) {
            int i = actionIndex == 0 ? 1 : 0;
            this.H = (int) motionEvent.getY(i);
            this.S = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.M;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean J(int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, boolean r20) {
        /*
            r11 = this;
            int r0 = r11.getOverScrollMode()
            int r1 = r11.computeHorizontalScrollRange()
            int r2 = r11.computeHorizontalScrollExtent()
            r3 = 0
            r4 = 1
            if (r1 <= r2) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            int r2 = r11.computeVerticalScrollRange()
            int r5 = r11.computeVerticalScrollExtent()
            if (r2 <= r5) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            if (r0 == 0) goto L29
            if (r0 != r4) goto L27
            if (r1 == 0) goto L27
            goto L29
        L27:
            r1 = 0
            goto L2a
        L29:
            r1 = 1
        L2a:
            if (r0 == 0) goto L33
            if (r0 != r4) goto L31
            if (r2 == 0) goto L31
            goto L33
        L31:
            r0 = 0
            goto L34
        L33:
            r0 = 1
        L34:
            int r2 = r14 + r12
            if (r1 != 0) goto L3a
            r1 = 0
            goto L3c
        L3a:
            r1 = r18
        L3c:
            int r5 = r15 + r13
            if (r0 != 0) goto L42
            r0 = 0
            goto L44
        L42:
            r0 = r19
        L44:
            int r6 = -r1
            int r1 = r1 + r16
            int r7 = -r0
            int r0 = r0 + r17
            if (r2 <= r1) goto L4f
            r2 = r1
        L4d:
            r1 = 1
            goto L54
        L4f:
            if (r2 >= r6) goto L53
            r2 = r6
            goto L4d
        L53:
            r1 = 0
        L54:
            if (r5 <= r0) goto L59
            r5 = r0
        L57:
            r0 = 1
            goto L5e
        L59:
            if (r5 >= r7) goto L5d
            r5 = r7
            goto L57
        L5d:
            r0 = 0
        L5e:
            if (r0 == 0) goto L7e
            boolean r6 = r11.y(r4)
            if (r6 != 0) goto L7e
            android.widget.OverScroller r6 = r11.E
            r7 = 0
            int r8 = r11.getScrollRange()
            r9 = 0
            r10 = 0
            r13 = r2
            r14 = r5
            r12 = r6
            r18 = r8
            r15 = 0
            r16 = 0
            r17 = 0
            r12.springBack(r13, r14, r15, r16, r17, r18)
            r6 = r13
            goto L7f
        L7e:
            r6 = r2
        L7f:
            r11.onOverScrolled(r6, r5, r1, r0)
            if (r1 != 0) goto L88
            if (r0 == 0) goto L87
            goto L88
        L87:
            return r3
        L88:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.J(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    public boolean K(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.D.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.D;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.D.top = getScrollY() - height;
            Rect rect2 = this.D;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.D;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return O(i, i2, i3);
    }

    public final void L() {
        VelocityTracker velocityTracker = this.M;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.M = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int M(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.F
            float r0 = com.daaw.AbstractC6189lF.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.F
            float r4 = -r4
            float r4 = com.daaw.AbstractC6189lF.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.F
            float r5 = com.daaw.AbstractC6189lF.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.F
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.G
            float r0 = com.daaw.AbstractC6189lF.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.G
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = com.daaw.AbstractC6189lF.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.G
            float r5 = com.daaw.AbstractC6189lF.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.G
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L64
            r3.invalidate()
        L64:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.M(int, float):int");
    }

    public final void N(boolean z) {
        if (z) {
            X(2, 1);
        } else {
            Z(1);
        }
        this.W = getScrollY();
        postInvalidateOnAnimation();
    }

    public final boolean O(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View viewU = u(z2, i2, i3);
        if (viewU == null) {
            viewU = this;
        }
        if (i2 < scrollY || i3 > i4) {
            P(z2 ? i2 - scrollY : i3 - i4, 0, 1, true);
            z = true;
        }
        if (viewU != findFocus()) {
            viewU.requestFocus(i);
        }
        return z;
    }

    public final int P(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        VelocityTracker velocityTracker;
        if (i3 == 1) {
            X(2, i3);
        }
        boolean z2 = false;
        if (i(0, i, this.U, this.T, i3)) {
            int i6 = i - this.U[1];
            i5 = this.T[1];
            i4 = i6;
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z3 = d() && !z;
        int i7 = i4;
        boolean z4 = J(0, i4, 0, scrollY, 0, scrollRange, 0, 0, true) && !y(i3);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.U;
        iArr[1] = 0;
        p(0, scrollY2, 0, i7 - scrollY2, this.T, i3, iArr);
        int i8 = i5 + this.T[1];
        int i9 = i7 - this.U[1];
        int i10 = scrollY + i9;
        if (i10 < 0) {
            if (z3) {
                AbstractC6189lF.d(this.F, (-i9) / getHeight(), i2 / getWidth());
                if (!this.G.isFinished()) {
                    this.G.onRelease();
                }
            }
        } else if (i10 > scrollRange && z3) {
            AbstractC6189lF.d(this.G, i9 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!this.F.isFinished()) {
                this.F.onRelease();
            }
        }
        if (this.F.isFinished() && this.G.isFinished()) {
            z2 = z4;
        } else {
            postInvalidateOnAnimation();
        }
        if (z2 && i3 == 0 && (velocityTracker = this.M) != null) {
            velocityTracker.clear();
        }
        if (i3 == 1) {
            Z(i3);
            this.F.onRelease();
            this.G.onRelease();
        }
        return i8;
    }

    public final void Q(View view) {
        view.getDrawingRect(this.D);
        offsetDescendantRectToMyCoords(view, this.D);
        int iG = g(this.D);
        if (iG != 0) {
            scrollBy(0, iG);
        }
    }

    public final boolean R(Rect rect, boolean z) {
        int iG = g(rect);
        boolean z2 = iG != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iG);
                return z2;
            }
            T(0, iG);
        }
        return z2;
    }

    public final boolean S(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        return x(-i) < AbstractC6189lF.b(edgeEffect) * ((float) getHeight());
    }

    public final void T(int i, int i2) {
        U(i, i2, 250, false);
    }

    public final void U(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.C > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.E.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, i3);
            N(z);
        } else {
            if (!this.E.isFinished()) {
                a();
            }
            scrollBy(i, i2);
        }
        this.C = AnimationUtils.currentAnimationTimeMillis();
    }

    public void V(int i, int i2, int i3, boolean z) {
        U(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    public void W(int i, int i2, boolean z) {
        V(i, i2, 250, z);
    }

    public boolean X(int i, int i2) {
        return this.c0.p(i, i2);
    }

    public final boolean Y(MotionEvent motionEvent) {
        boolean z;
        if (AbstractC6189lF.b(this.F) != 0.0f) {
            AbstractC6189lF.d(this.F, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (AbstractC6189lF.b(this.G) == 0.0f) {
            return z;
        }
        AbstractC6189lF.d(this.G, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public void Z(int i) {
        this.c0.r(i);
    }

    public final void a() {
        this.E.abortAnimation();
        Z(1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public boolean c(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !G(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            P(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.D);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.D);
            P(g(this.D), 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && E(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        int i;
        if (this.E.isFinished()) {
            return;
        }
        this.E.computeScrollOffset();
        int currY = this.E.getCurrY();
        int iH = h(currY - this.W);
        this.W = currY;
        int[] iArr = this.U;
        iArr[1] = 0;
        i(0, iH, iArr, null, 1);
        int i2 = iH - this.U[1];
        int scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY = getScrollY();
            J(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            i = scrollRange;
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            int[] iArr2 = this.U;
            iArr2[1] = 0;
            p(0, scrollY2, 0, i3, this.T, 1, iArr2);
            i2 = i3 - this.U[1];
        } else {
            i = scrollRange;
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && i > 0)) {
                if (i2 < 0) {
                    if (this.F.isFinished()) {
                        this.F.onAbsorb((int) this.E.getCurrVelocity());
                    }
                } else if (this.G.isFinished()) {
                    this.G.onAbsorb((int) this.E.getCurrVelocity());
                }
            }
            a();
        }
        if (this.E.isFinished()) {
            Z(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    public final boolean d() {
        int overScrollMode = getOverScrollMode();
        return overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || t(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.c0.a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.c0.b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return i(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.c0.f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.F.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.F.setSize(width, height);
            if (this.F.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.G.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.G.setSize(width2, height2);
        if (this.G.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    public final boolean e() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    public int g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.b0.a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.d0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.d0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.d0;
    }

    public int h(int i) {
        int height = getHeight();
        if (i > 0 && AbstractC6189lF.b(this.F) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * AbstractC6189lF.d(this.F, ((-i) * 4.0f) / height, 0.5f));
            if (iRound != i) {
                this.F.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || AbstractC6189lF.b(this.G) == 0.0f) {
            return i;
        }
        float f = height;
        int iRound2 = Math.round((f / 4.0f) * AbstractC6189lF.d(this.G, (i * 4.0f) / f, 0.5f));
        if (iRound2 != i) {
            this.G.finish();
        }
        return i - iRound2;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return y(0);
    }

    public boolean i(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.c0.d(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.c0.l();
    }

    @Override // com.daaw.InterfaceC9135vn0
    public void j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        H(i4, i5, iArr);
    }

    @Override // com.daaw.InterfaceC8849un0
    public void k(View view, int i, int i2, int i3, int i4, int i5) {
        H(i4, i5, null);
    }

    @Override // com.daaw.InterfaceC8849un0
    public boolean l(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // com.daaw.InterfaceC8849un0
    public void m(View view, View view2, int i, int i2) {
        this.b0.c(view, view2, i, i2);
        X(2, i2);
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // com.daaw.InterfaceC8849un0
    public void n(View view, int i) {
        this.b0.d(view, i);
        Z(i);
    }

    @Override // com.daaw.InterfaceC8849un0
    public void o(View view, int i, int i2, int[] iArr, int i3) {
        i(i, i2, iArr, null, i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        float axisValue;
        int width;
        if (motionEvent.getAction() == 8 && !this.L) {
            if (AbstractC8560tl0.a(motionEvent, 2)) {
                i = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if (AbstractC8560tl0.a(motionEvent, 4194304)) {
                axisValue = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i = 26;
            } else {
                i = 0;
                axisValue = 0.0f;
                width = 0;
            }
            if (axisValue != 0.0f) {
                P(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, AbstractC8560tl0.a(motionEvent, 8194));
                if (i != 0) {
                    this.g0.g(motionEvent, i);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = 0;
        this.I = false;
        View view = this.K;
        if (view != null && F(view, this)) {
            Q(this.K);
        }
        this.K = null;
        if (!this.J) {
            if (this.a0 != null) {
                scrollTo(getScrollX(), this.a0.B);
                this.a0 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iF = f(scrollY, paddingTop, measuredHeight);
            if (iF != scrollY) {
                scrollTo(getScrollX(), iF);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.J = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.N && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        v((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        o(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        H(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        m(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || E(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.a0 = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.B = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        d dVar = this.e0;
        if (dVar != null) {
            dVar.a(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !G(viewFindFocus, 0, i4)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.D);
        offsetDescendantRectToMyCoords(viewFindFocus, this.D);
        q(g(this.D));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return l(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        C();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.V = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.V);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.M;
                velocityTracker.computeCurrentVelocity(1000, this.R);
                int yVelocity = (int) velocityTracker.getYVelocity(this.S);
                if (Math.abs(yVelocity) >= this.Q) {
                    if (!r(yVelocity)) {
                        int i = -yVelocity;
                        float f = i;
                        if (!dispatchNestedPreFling(0.0f, f)) {
                            dispatchNestedFling(0.0f, f, true);
                            v(i);
                        }
                    }
                } else if (this.E.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.S);
                if (iFindPointerIndex != -1) {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i2 = this.H - y;
                    int iM = i2 - M(i2, motionEvent.getX(iFindPointerIndex));
                    if (!this.L && Math.abs(iM) > this.P) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.L = true;
                        iM = iM > 0 ? iM - this.P : iM + this.P;
                    }
                    if (this.L) {
                        int iP = P(iM, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.H = y - iP;
                        this.V += iP;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.L && getChildCount() > 0 && this.E.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.H = (int) motionEvent.getY(actionIndex);
                this.S = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                I(motionEvent);
                this.H = (int) motionEvent.getY(motionEvent.findPointerIndex(this.S));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.L && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.E.isFinished()) {
                a();
            }
            D((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.M;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public void p(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.c0.e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void q(int i) {
        if (i != 0) {
            if (this.O) {
                T(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    public final boolean r(int i) {
        if (AbstractC6189lF.b(this.F) != 0.0f) {
            if (S(this.F, i)) {
                this.F.onAbsorb(i);
                return true;
            }
            v(-i);
            return true;
        }
        if (AbstractC6189lF.b(this.G) == 0.0f) {
            return false;
        }
        int i2 = -i;
        if (S(this.G, i2)) {
            this.G.onAbsorb(i2);
            return true;
        }
        v(i2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.I) {
            this.K = view2;
        } else {
            Q(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return R(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            L();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.I = true;
        super.requestLayout();
    }

    public final void s() {
        this.S = -1;
        this.L = false;
        L();
        Z(0);
        this.F.onRelease();
        this.G.onRelease();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iF = f(i, width, width2);
            int iF2 = f(i2, height, height2);
            if (iF == getScrollX() && iF2 == getScrollY()) {
                return;
            }
            super.scrollTo(iF, iF2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.N) {
            this.N = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.c0.m(z);
    }

    public void setOnScrollChangeListener(d dVar) {
        this.e0 = dVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.O = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return X(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        Z(0);
    }

    public boolean t(KeyEvent keyEvent) {
        this.D.setEmpty();
        if (!e()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
            return false;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? w(33) : c(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? w(130) : c(130);
            }
            if (keyCode == 62) {
                K(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
            if (keyCode == 92) {
                return w(33);
            }
            if (keyCode == 93) {
                return w(130);
            }
            if (keyCode == 122) {
                K(33);
                return false;
            }
            if (keyCode == 123) {
                K(130);
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View u(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            r9 = 1
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = 1
            goto L29
        L28:
            r10 = 0
        L29:
            if (r2 != 0) goto L2e
            r2 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r2.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r2.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = 1
            goto L41
        L40:
            r7 = 0
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r2 = r6
            r5 = 1
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r2 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.u(boolean, int, int):android.view.View");
    }

    public void v(int i) {
        if (getChildCount() > 0) {
            this.E.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            N(true);
        }
    }

    public boolean w(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.D;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.D.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.D;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.D;
        return O(i, rect3.top, rect3.bottom);
    }

    public final float x(int i) {
        double dLog = Math.log((Math.abs(i) * 0.35f) / (this.B * 0.015f));
        float f = h0;
        return (float) (((double) (this.B * 0.015f)) * Math.exp((((double) f) / (((double) f) - 1.0d)) * dLog));
    }

    public boolean y(int i) {
        return this.c0.k(i);
    }

    public final boolean z(int i, int i2) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.D = new Rect();
        this.I = true;
        this.J = false;
        this.K = null;
        this.L = false;
        this.O = true;
        this.S = -1;
        this.T = new int[2];
        this.U = new int[2];
        c cVar = new c();
        this.f0 = cVar;
        this.g0 = new TB(getContext(), cVar);
        this.F = AbstractC6189lF.a(context, attributeSet);
        this.G = AbstractC6189lF.a(context, attributeSet);
        this.B = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        B();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.b0 = new C9414wn0(this);
        this.c0 = new C8570tn0(this);
        setNestedScrollingEnabled(true);
        AbstractC2317Td1.p0(this, i0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
