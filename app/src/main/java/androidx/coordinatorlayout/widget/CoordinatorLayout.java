package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.customview.view.AbsSavedState;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC3099aE0;
import com.daaw.AbstractC5448ie1;
import com.daaw.AbstractC8580tp0;
import com.daaw.AbstractC9438ws;
import com.daaw.C1644Mx0;
import com.daaw.C8820uh1;
import com.daaw.C9414wn0;
import com.daaw.DC0;
import com.daaw.InterfaceC1229Ix0;
import com.daaw.InterfaceC2780Xp0;
import com.daaw.InterfaceC8849un0;
import com.daaw.InterfaceC9135vn0;
import com.daaw.QD0;
import com.daaw.SD;
import com.daaw.WT;
import com.daaw.YB;
import j$.util.DesugarCollections;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC8849un0, InterfaceC9135vn0 {
    public static final String V;
    public static final Class[] W;
    public static final ThreadLocal a0;
    public static final Comparator b0;
    public static final InterfaceC1229Ix0 c0;
    public final List B;
    public final YB C;
    public final List D;
    public final List E;
    public Paint F;
    public final int[] G;
    public final int[] H;
    public boolean I;
    public boolean J;
    public int[] K;
    public View L;
    public View M;
    public f N;
    public boolean O;
    public C8820uh1 P;
    public boolean Q;
    public Drawable R;
    public ViewGroup.OnHierarchyChangeListener S;
    public InterfaceC2780Xp0 T;
    public final C9414wn0 U;

    public class a implements InterfaceC2780Xp0 {
        public a() {
        }

        @Override // com.daaw.InterfaceC2780Xp0
        public C8820uh1 a(View view, C8820uh1 c8820uh1) {
            return CoordinatorLayout.this.U(c8820uh1);
        }
    }

    public static abstract class b {
        public b() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            if (i2 == 0) {
                return z(coordinatorLayout, view, view2, view3, i);
            }
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            if (i == 0) {
                B(coordinatorLayout, view, view2);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view) {
            return d(coordinatorLayout, view) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void g(e eVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
            return false;
        }

        public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                p(coordinatorLayout, view, view2, i, i2, iArr);
            }
        }

        public void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
        }

        public void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                r(coordinatorLayout, view, view2, i, i2, i3, i4);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            s(coordinatorLayout, view, view2, i, i2, i3, i4, i5);
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        }

        public void v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            if (i2 == 0) {
                u(coordinatorLayout, view, view2, view3, i);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
            return false;
        }

        public b(Context context, AttributeSet attributeSet) {
        }

        public C8820uh1 f(CoordinatorLayout coordinatorLayout, View view, C8820uh1 c8820uh1) {
            return c8820uh1;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
        Class value();
    }

    public class d implements ViewGroup.OnHierarchyChangeListener {
        public d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.S;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.F(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.S;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class f implements ViewTreeObserver.OnPreDrawListener {
        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.F(0);
            return true;
        }
    }

    public static class g implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fO = AbstractC2317Td1.O(view);
            float fO2 = AbstractC2317Td1.O(view2);
            if (fO > fO2) {
                return -1;
            }
            return fO < fO2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        V = r0 != null ? r0.getName() : null;
        b0 = new g();
        W = new Class[]{Context.class, AttributeSet.class};
        a0 = new ThreadLocal();
        c0 = new C1644Mx0(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, DC0.a);
    }

    public static b I(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = V;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = a0;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(W);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (b) constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    public static void M(Rect rect) {
        rect.setEmpty();
        c0.a(rect);
    }

    public static int P(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    public static int Q(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    public static int R(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    public static Rect a() {
        Rect rect = (Rect) c0.b();
        return rect == null ? new Rect() : rect;
    }

    private static int c(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public final void A(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        Rect rectA = a();
        rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        if (this.P != null && AbstractC2317Td1.A(this) && !AbstractC2317Td1.A(view)) {
            rectA.left += this.P.k();
            rectA.top += this.P.m();
            rectA.right -= this.P.l();
            rectA.bottom -= this.P.j();
        }
        Rect rectA2 = a();
        WT.a(Q(eVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i);
        view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        M(rectA);
        M(rectA2);
    }

    public final void B(View view, View view2, int i) {
        Rect rectA = a();
        Rect rectA2 = a();
        try {
            r(view2, rectA);
            s(view, i, rectA, rectA2);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        } finally {
            M(rectA);
            M(rectA2);
        }
    }

    public final void C(View view, int i, int i2) {
        e eVar = (e) view.getLayoutParams();
        int iB = WT.b(R(eVar.c), i2);
        int i3 = iB & 7;
        int i4 = iB & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int iU = u(i) - measuredWidth;
        if (i3 == 1) {
            iU += measuredWidth / 2;
        } else if (i3 == 5) {
            iU += measuredWidth;
        }
        int i5 = i4 != 16 ? i4 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(iU, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    public final void D(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (AbstractC2317Td1.U(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            e eVar = (e) view.getLayoutParams();
            b bVarE = eVar.e();
            Rect rectA = a();
            Rect rectA2 = a();
            rectA2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (bVarE == null || !bVarE.b(this, view, rectA)) {
                rectA.set(rectA2);
            } else if (!rectA2.contains(rectA)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA.toShortString() + " | Bounds:" + rectA2.toShortString());
            }
            M(rectA2);
            if (rectA.isEmpty()) {
                M(rectA);
                return;
            }
            int iB = WT.b(eVar.h, i);
            boolean z3 = true;
            if ((iB & 48) != 48 || (i6 = (rectA.top - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - eVar.j) >= (i7 = rect.top)) {
                z = false;
            } else {
                T(view, i7 - i6);
                z = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectA.bottom) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) + eVar.j) < (i5 = rect.bottom)) {
                T(view, height - i5);
                z = true;
            }
            if (!z) {
                T(view, 0);
            }
            if ((iB & 3) != 3 || (i3 = (rectA.left - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - eVar.i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                S(view, i4 - i3);
                z2 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectA.right) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin) + eVar.i) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                S(view, width - i2);
            }
            if (!z3) {
                S(view, 0);
            }
            M(rectA);
        }
    }

    public void E(View view, int i) {
        b bVarE;
        e eVar = (e) view.getLayoutParams();
        if (eVar.k != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            Rect rectA3 = a();
            r(eVar.k, rectA);
            p(view, false, rectA2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            t(view, i, rectA, rectA3, eVar, measuredWidth, measuredHeight);
            boolean z = (rectA3.left == rectA2.left && rectA3.top == rectA2.top) ? false : true;
            d(eVar, rectA3, measuredWidth, measuredHeight);
            int i2 = rectA3.left - rectA2.left;
            int i3 = rectA3.top - rectA2.top;
            if (i2 != 0) {
                AbstractC2317Td1.Z(view, i2);
            }
            if (i3 != 0) {
                AbstractC2317Td1.a0(view, i3);
            }
            if (z && (bVarE = eVar.e()) != null) {
                bVarE.h(this, view, eVar.k);
            }
            M(rectA);
            M(rectA2);
            M(rectA3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(int r18) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.F(int):void");
    }

    public void G(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = eVar.k;
        if (view2 != null) {
            B(view, view2, i);
            return;
        }
        int i2 = eVar.e;
        if (i2 >= 0) {
            C(view, i2, i);
        } else {
            A(view, i);
        }
    }

    public void H(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public final boolean J(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.D;
        x(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zK = false;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) list.get(i2);
            e eVar = (e) view.getLayoutParams();
            b bVarE = eVar.e();
            if (!(zK || z) || actionMasked == 0) {
                if (!zK && bVarE != null) {
                    if (i == 0) {
                        zK = bVarE.k(this, view, motionEvent);
                    } else if (i == 1) {
                        zK = bVarE.D(this, view, motionEvent);
                    }
                    if (zK) {
                        this.L = view;
                    }
                }
                boolean zC = eVar.c();
                boolean zH = eVar.h(this, view);
                z = zH && !zC;
                if (zH && !z) {
                    break;
                }
            } else if (bVarE != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    bVarE.k(this, view, motionEventObtain);
                } else if (i == 1) {
                    bVarE.D(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zK;
    }

    public final void K() {
        this.B.clear();
        this.C.c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            e eVarW = w(childAt);
            eVarW.d(this, childAt);
            this.C.b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (eVarW.b(this, childAt, childAt2)) {
                        if (!this.C.d(childAt2)) {
                            this.C.b(childAt2);
                        }
                        this.C.a(childAt2, childAt);
                    }
                }
            }
        }
        this.B.addAll(this.C.h());
        Collections.reverse(this.B);
    }

    public void L(View view, Rect rect) {
        ((e) view.getLayoutParams()).p(rect);
    }

    public void N() {
        if (this.J && this.N != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.N);
        }
        this.O = false;
    }

    public final void O(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            b bVarE = ((e) childAt.getLayoutParams()).e();
            if (bVarE != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    bVarE.k(this, childAt, motionEventObtain);
                } else {
                    bVarE.D(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((e) getChildAt(i2).getLayoutParams()).l();
        }
        this.L = null;
        this.I = false;
    }

    public final void S(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int i2 = eVar.i;
        if (i2 != i) {
            AbstractC2317Td1.Z(view, i - i2);
            eVar.i = i;
        }
    }

    public final void T(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int i2 = eVar.j;
        if (i2 != i) {
            AbstractC2317Td1.a0(view, i - i2);
            eVar.j = i;
        }
    }

    public final C8820uh1 U(C8820uh1 c8820uh1) {
        if (AbstractC8580tp0.a(this.P, c8820uh1)) {
            return c8820uh1;
        }
        this.P = c8820uh1;
        boolean z = false;
        boolean z2 = c8820uh1 != null && c8820uh1.m() > 0;
        this.Q = z2;
        if (!z2 && getBackground() == null) {
            z = true;
        }
        setWillNotDraw(z);
        C8820uh1 c8820uh1E = e(c8820uh1);
        requestLayout();
        return c8820uh1E;
    }

    public final void V() {
        if (!AbstractC2317Td1.A(this)) {
            AbstractC2317Td1.D0(this, null);
            return;
        }
        if (this.T == null) {
            this.T = new a();
        }
        AbstractC2317Td1.D0(this, this.T);
        setSystemUiVisibility(1280);
    }

    public void b() {
        if (this.J) {
            if (this.N == null) {
                this.N = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.N);
        }
        this.O = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    public final void d(e eVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean drawChild(android.graphics.Canvas r17, android.view.View r18, long r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r2
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r3 = r2.a
            if (r3 == 0) goto L90
            float r3 = r3.d(r0, r1)
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L90
            android.graphics.Paint r4 = r0.F
            if (r4 != 0) goto L22
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r0.F = r4
        L22:
            android.graphics.Paint r4 = r0.F
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r2 = r2.a
            int r2 = r2.c(r0, r1)
            r4.setColor(r2)
            android.graphics.Paint r2 = r0.F
            r4 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            r4 = 0
            r5 = 255(0xff, float:3.57E-43)
            int r3 = c(r3, r4, r5)
            r2.setAlpha(r3)
            int r2 = r17.save()
            boolean r3 = r1.isOpaque()
            if (r3 == 0) goto L66
            int r3 = r1.getLeft()
            float r5 = (float) r3
            int r3 = r1.getTop()
            float r6 = (float) r3
            int r3 = r1.getRight()
            float r7 = (float) r3
            int r3 = r1.getBottom()
            float r8 = (float) r3
            android.graphics.Region$Op r9 = android.graphics.Region.Op.DIFFERENCE
            r4 = r17
            r4.clipRect(r5, r6, r7, r8, r9)
        L66:
            int r3 = r0.getPaddingLeft()
            float r11 = (float) r3
            int r3 = r0.getPaddingTop()
            float r12 = (float) r3
            int r3 = r0.getWidth()
            int r4 = r0.getPaddingRight()
            int r3 = r3 - r4
            float r13 = (float) r3
            int r3 = r0.getHeight()
            int r4 = r0.getPaddingBottom()
            int r3 = r3 - r4
            float r14 = (float) r3
            android.graphics.Paint r15 = r0.F
            r10 = r17
            r10.drawRect(r11, r12, r13, r14, r15)
            r4 = r10
            r4.restoreToCount(r2)
            goto L92
        L90:
            r4 = r17
        L92:
            boolean r1 = super.drawChild(r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.R;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final C8820uh1 e(C8820uh1 c8820uh1) {
        b bVarE;
        if (c8820uh1.q()) {
            return c8820uh1;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (AbstractC2317Td1.A(childAt) && (bVarE = ((e) childAt.getLayoutParams()).e()) != null) {
                c8820uh1 = bVarE.f(this, childAt, c8820uh1);
                if (c8820uh1.q()) {
                    return c8820uh1;
                }
            }
        }
        return c8820uh1;
    }

    public void f() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (y(getChildAt(i))) {
                z = true;
                break;
            }
            i++;
        }
        if (z != this.O) {
            if (z) {
                b();
            } else {
                N();
            }
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    public final List<View> getDependencySortedChildren() {
        K();
        return DesugarCollections.unmodifiableList(this.B);
    }

    public final C8820uh1 getLastWindowInsets() {
        return this.P;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.U.a();
    }

    public Drawable getStatusBarBackground() {
        return this.R;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // com.daaw.InterfaceC9135vn0
    public void j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        b bVarE;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(i5) && (bVarE = eVar.e()) != null) {
                    int[] iArr2 = this.G;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVarE.t(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.G;
                    iMax = i3 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.G;
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            F(1);
        }
    }

    @Override // com.daaw.InterfaceC8849un0
    public void k(View view, int i, int i2, int i3, int i4, int i5) {
        j(view, i, i2, i3, i4, 0, this.H);
    }

    @Override // com.daaw.InterfaceC8849un0
    public boolean l(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b bVarE = eVar.e();
                if (bVarE != null) {
                    boolean zA = bVarE.A(this, childAt, view, view2, i, i2);
                    z |= zA;
                    eVar.q(i2, zA);
                } else {
                    eVar.q(i2, false);
                }
            }
        }
        return z;
    }

    @Override // com.daaw.InterfaceC8849un0
    public void m(View view, View view2, int i, int i2) {
        b bVarE;
        View view3;
        View view4;
        int i3;
        int i4;
        this.U.c(view, view2, i, i2);
        this.M = view2;
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.i(i2) && (bVarE = eVar.e()) != null) {
                view3 = view;
                view4 = view2;
                i3 = i;
                i4 = i2;
                bVarE.v(this, childAt, view3, view4, i3, i4);
            } else {
                view3 = view;
                view4 = view2;
                i3 = i;
                i4 = i2;
            }
            i5++;
            view = view3;
            view2 = view4;
            i = i3;
            i2 = i4;
        }
    }

    @Override // com.daaw.InterfaceC8849un0
    public void n(View view, int i) {
        this.U.d(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.i(i)) {
                b bVarE = eVar.e();
                if (bVarE != null) {
                    bVarE.C(this, childAt, view, i);
                }
                eVar.k(i);
                eVar.j();
            }
        }
        this.M = null;
    }

    @Override // com.daaw.InterfaceC8849un0
    public void o(View view, int i, int i2, int[] iArr, int i3) {
        b bVarE;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(i3) && (bVarE = eVar.e()) != null) {
                    int[] iArr2 = this.G;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVarE.q(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.G;
                    iMax = i > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.G;
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            F(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        O(false);
        if (this.O) {
            if (this.N == null) {
                this.N = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.N);
        }
        if (this.P == null && AbstractC2317Td1.A(this)) {
            AbstractC2317Td1.m0(this);
        }
        this.J = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        O(false);
        if (this.O && this.N != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.N);
        }
        View view = this.M;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.J = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.Q || this.R == null) {
            return;
        }
        C8820uh1 c8820uh1 = this.P;
        int iM = c8820uh1 != null ? c8820uh1.m() : 0;
        if (iM > 0) {
            this.R.setBounds(0, 0, getWidth(), iM);
            this.R.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            O(true);
        }
        boolean zJ = J(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zJ;
        }
        O(true);
        return zJ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        b bVarE;
        int iD = AbstractC2317Td1.D(this);
        int size = this.B.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.B.get(i5);
            if (view.getVisibility() != 8 && ((bVarE = ((e) view.getLayoutParams()).e()) == null || !bVarE.l(this, view, iD))) {
                G(view, iD);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onNestedFling(android.view.View r12, float r13, float r14, boolean r15) {
        /*
            r11 = this;
            int r0 = r11.getChildCount()
            r1 = 0
            r2 = 0
            r3 = 0
        L7:
            if (r2 >= r0) goto L3f
            android.view.View r6 = r11.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1b
        L15:
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r15
            goto L38
        L1b:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r4
            boolean r5 = r4.i(r1)
            if (r5 != 0) goto L28
            goto L15
        L28:
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r4 = r4.e()
            if (r4 == 0) goto L15
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r15
            boolean r12 = r4.n(r5, r6, r7, r8, r9, r10)
            r3 = r3 | r12
        L38:
            int r2 = r2 + 1
            r12 = r7
            r13 = r8
            r14 = r9
            r15 = r10
            goto L7
        L3f:
            r5 = r11
            if (r3 == 0) goto L46
            r12 = 1
            r11.F(r12)
        L46:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onNestedFling(android.view.View, float, float, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onNestedPreFling(android.view.View r11, float r12, float r13) {
        /*
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            r2 = 0
            r3 = 0
        L7:
            if (r2 >= r0) goto L3b
            android.view.View r6 = r10.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L19
        L15:
            r7 = r11
            r8 = r12
            r9 = r13
            goto L35
        L19:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r4
            boolean r5 = r4.i(r1)
            if (r5 != 0) goto L26
            goto L15
        L26:
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r4 = r4.e()
            if (r4 == 0) goto L15
            r5 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            boolean r11 = r4.o(r5, r6, r7, r8, r9)
            r3 = r3 | r11
        L35:
            int r2 = r2 + 1
            r11 = r7
            r12 = r8
            r13 = r9
            goto L7
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onNestedPreFling(android.view.View, float, float):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        o(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        k(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        m(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        SparseArray sparseArray = savedState.D;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b bVarE = w(childAt).e();
            if (id != -1 && bVarE != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                bVarE.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableY;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b bVarE = ((e) childAt.getLayoutParams()).e();
            if (id != -1 && bVarE != null && (parcelableY = bVarE.y(this, childAt)) != null) {
                sparseArray.append(id, parcelableY);
            }
        }
        savedState.D = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return l(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.L
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.J(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = 0
            goto L2c
        L17:
            r3 = 0
        L18:
            android.view.View r6 = r0.L
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r6 = r6.e()
            if (r6 == 0) goto L15
            android.view.View r7 = r0.L
            boolean r6 = r6.D(r0, r7, r1)
        L2c:
            android.view.View r7 = r0.L
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L56
            r1 = 3
            if (r2 != r1) goto L55
            goto L56
        L55:
            return r6
        L56:
            r0.O(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            r(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List q(View view) {
        List listG = this.C.g(view);
        this.E.clear();
        if (listG != null) {
            this.E.addAll(listG);
        }
        return this.E;
    }

    public void r(View view, Rect rect) {
        AbstractC5448ie1.a(this, view, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        b bVarE = ((e) view.getLayoutParams()).e();
        if (bVarE == null || !bVarE.w(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.I) {
            return;
        }
        O(false);
        this.I = true;
    }

    public void s(View view, int i, Rect rect, Rect rect2) {
        e eVar = (e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        t(view, i, rect, rect2, eVar, measuredWidth, measuredHeight);
        d(eVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        V();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.S = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.R;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.R = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.R.setState(getDrawableState());
                }
                SD.m(this.R, AbstractC2317Td1.D(this));
                this.R.setVisible(getVisibility() == 0, false);
                this.R.setCallback(this);
            }
            AbstractC2317Td1.g0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? AbstractC9438ws.e(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.R;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.R.setVisible(z, false);
    }

    public final void t(View view, int i, Rect rect, Rect rect2, e eVar, int i2, int i3) {
        int iB = WT.b(P(eVar.c), i);
        int iB2 = WT.b(Q(eVar.d), i);
        int i4 = iB & 7;
        int i5 = iB & 112;
        int i6 = iB2 & 7;
        int i7 = iB2 & 112;
        int iWidth = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            iWidth -= i2 / 2;
        } else if (i4 != 5) {
            iWidth -= i2;
        }
        if (i5 == 16) {
            iHeight -= i3 / 2;
        } else if (i5 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    public final int u(int i) {
        int[] iArr = this.K;
        if (iArr == null) {
            toString();
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        toString();
        return 0;
    }

    public void v(View view, Rect rect) {
        rect.set(((e) view.getLayoutParams()).g());
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.R;
    }

    public e w(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.b) {
            c cVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                cVar = (c) superclass.getAnnotation(c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    eVar.n((b) cVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception unused) {
                    cVar.value().getName();
                }
            }
            eVar.b = true;
        }
        return eVar;
    }

    public final void x(List list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator comparator = b0;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public final boolean y(View view) {
        return this.C.i(view);
    }

    public boolean z(View view, int i, int i2) {
        Rect rectA = a();
        r(view, rectA);
        try {
            return rectA.contains(i, i2);
        } finally {
            M(rectA);
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i);
        this.B = new ArrayList();
        this.C = new YB();
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.G = new int[2];
        this.H = new int[2];
        this.U = new C9414wn0(this);
        TypedArray typedArrayObtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, AbstractC3099aE0.b, 0, QD0.a) : context.obtainStyledAttributes(attributeSet, AbstractC3099aE0.b, i, 0);
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, AbstractC3099aE0.b, attributeSet, typedArrayObtainStyledAttributes, 0, QD0.a);
        } else {
            context2 = context;
            coordinatorLayout = this;
            coordinatorLayout.saveAttributeDataForStyleable(context2, AbstractC3099aE0.b, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC3099aE0.c, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.K = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.K.length;
            for (int i2 = 0; i2 < length; i2++) {
                coordinatorLayout.K[i2] = (int) (r12[i2] * f2);
            }
        }
        coordinatorLayout.R = typedArrayObtainStyledAttributes.getDrawable(AbstractC3099aE0.d);
        typedArrayObtainStyledAttributes.recycle();
        V();
        super.setOnHierarchyChangeListener(new d());
        if (AbstractC2317Td1.B(this) == 0) {
            AbstractC2317Td1.z0(this, 1);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public SparseArray D;

        public static class a implements Parcelable.ClassLoaderCreator {
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
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.D = new SparseArray(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.D.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.D;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.D.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.D.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public b a;
        public boolean b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public View k;
        public View l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public final Rect q;
        public Object r;

        public e(int i, int i2) {
            super(i, i2);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public boolean a() {
            return this.k == null && this.f != -1;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.l || r(view2, AbstractC2317Td1.D(coordinatorLayout))) {
                return true;
            }
            b bVar = this.a;
            return bVar != null && bVar.e(coordinatorLayout, view, view2);
        }

        public boolean c() {
            if (this.a == null) {
                this.m = false;
            }
            return this.m;
        }

        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f == -1) {
                this.l = null;
                this.k = null;
                return null;
            }
            if (this.k == null || !s(view, coordinatorLayout)) {
                m(view, coordinatorLayout);
            }
            return this.k;
        }

        public b e() {
            return this.a;
        }

        public boolean f() {
            return this.p;
        }

        public Rect g() {
            return this.q;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.m;
            if (z) {
                return true;
            }
            b bVar = this.a;
            boolean zA = (bVar != null ? bVar.a(coordinatorLayout, view) : false) | z;
            this.m = zA;
            return zA;
        }

        public boolean i(int i) {
            if (i == 0) {
                return this.n;
            }
            if (i != 1) {
                return false;
            }
            return this.o;
        }

        public void j() {
            this.p = false;
        }

        public void k(int i) {
            q(i, false);
        }

        public void l() {
            this.m = false;
        }

        public final void m(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f);
            this.k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.l = null;
                    this.k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.l = null;
                this.k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.l = null;
                    this.k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.l = viewFindViewById;
        }

        public void n(b bVar) {
            b bVar2 = this.a;
            if (bVar2 != bVar) {
                if (bVar2 != null) {
                    bVar2.j();
                }
                this.a = bVar;
                this.r = null;
                this.b = true;
                if (bVar != null) {
                    bVar.g(this);
                }
            }
        }

        public void o(boolean z) {
            this.p = z;
        }

        public void p(Rect rect) {
            this.q.set(rect);
        }

        public void q(int i, boolean z) {
            if (i == 0) {
                this.n = z;
            } else {
                if (i != 1) {
                    return;
                }
                this.o = z;
            }
        }

        public final boolean r(View view, int i) {
            int iB = WT.b(((e) view.getLayoutParams()).g, i);
            return iB != 0 && (WT.b(this.h, i) & iB) == iB;
        }

        public final boolean s(View view, CoordinatorLayout coordinatorLayout) {
            if (this.k.getId() != this.f) {
                return false;
            }
            View view2 = this.k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.l = null;
                    this.k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.l = view2;
            return true;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3099aE0.e);
            this.c = typedArrayObtainStyledAttributes.getInteger(AbstractC3099aE0.f, 0);
            this.f = typedArrayObtainStyledAttributes.getResourceId(AbstractC3099aE0.g, -1);
            this.d = typedArrayObtainStyledAttributes.getInteger(AbstractC3099aE0.h, 0);
            this.e = typedArrayObtainStyledAttributes.getInteger(AbstractC3099aE0.l, -1);
            this.g = typedArrayObtainStyledAttributes.getInt(AbstractC3099aE0.k, 0);
            this.h = typedArrayObtainStyledAttributes.getInt(AbstractC3099aE0.j, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(AbstractC3099aE0.i);
            this.b = zHasValue;
            if (zHasValue) {
                this.a = CoordinatorLayout.I(context, attributeSet, typedArrayObtainStyledAttributes.getString(AbstractC3099aE0.i));
            }
            typedArrayObtainStyledAttributes.recycle();
            b bVar = this.a;
            if (bVar != null) {
                bVar.g(this);
            }
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }
    }
}
