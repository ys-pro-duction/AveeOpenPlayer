package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC6314li0;
import com.daaw.AbstractC7480ps0;
import com.daaw.AbstractC9438ws;
import com.daaw.C5554j1;
import com.daaw.C8820uh1;
import com.daaw.InterfaceC2780Xp0;
import com.daaw.Z1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ViewPager extends ViewGroup {
    public static final int[] G0 = {R.attr.layout_gravity};
    public static final Comparator H0 = new a();
    public static final Interpolator I0 = new b();
    public static final k J0 = new k();
    public i A0;
    public int B;
    public List B0;
    public final ArrayList C;
    public int C0;
    public final f D;
    public ArrayList D0;
    public final Rect E;
    public final Runnable E0;
    public AbstractC7480ps0 F;
    public int F0;
    public int G;
    public int H;
    public Parcelable I;
    public ClassLoader J;
    public Scroller K;
    public boolean L;
    public j M;
    public int N;
    public Drawable O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean a0;
    public int b0;
    public boolean c0;
    public boolean d0;
    public int e0;
    public int f0;
    public int g0;
    public float h0;
    public float i0;
    public float j0;
    public float k0;
    public int l0;
    public VelocityTracker m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public boolean r0;
    public EdgeEffect s0;
    public EdgeEffect t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public int x0;
    public List y0;
    public i z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int D;
        public Parcelable E;
        public ClassLoader F;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.D + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.D);
            parcel.writeParcelable(this.E, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.D = parcel.readInt();
            this.E = parcel.readParcelable(classLoader);
            this.F = classLoader;
        }
    }

    public static class a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.b - fVar2.b;
        }
    }

    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.C();
        }
    }

    public class d implements InterfaceC2780Xp0 {
        public final Rect B = new Rect();

        public d() {
        }

        @Override // com.daaw.InterfaceC2780Xp0
        public C8820uh1 a(View view, C8820uh1 c8820uh1) {
            C8820uh1 c8820uh1B0 = AbstractC2317Td1.b0(view, c8820uh1);
            if (c8820uh1B0.q()) {
                return c8820uh1B0;
            }
            Rect rect = this.B;
            rect.left = c8820uh1B0.k();
            rect.top = c8820uh1B0.m();
            rect.right = c8820uh1B0.l();
            rect.bottom = c8820uh1B0.j();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C8820uh1 c8820uh1I = AbstractC2317Td1.i(ViewPager.this.getChildAt(i), c8820uh1B0);
                rect.left = Math.min(c8820uh1I.k(), rect.left);
                rect.top = Math.min(c8820uh1I.m(), rect.top);
                rect.right = Math.min(c8820uh1I.l(), rect.right);
                rect.bottom = Math.min(c8820uh1I.j(), rect.bottom);
            }
            return c8820uh1B0.s(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    public static class f {
        public Object a;
        public int b;
        public boolean c;
        public float d;
        public float e;
    }

    public class h extends C5554j1 {
        public h() {
        }

        @Override // com.daaw.C5554j1
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            AbstractC7480ps0 abstractC7480ps0;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() != 4096 || (abstractC7480ps0 = ViewPager.this.F) == null) {
                return;
            }
            accessibilityEvent.setItemCount(abstractC7480ps0.c());
            accessibilityEvent.setFromIndex(ViewPager.this.G);
            accessibilityEvent.setToIndex(ViewPager.this.G);
        }

        @Override // com.daaw.C5554j1
        public void g(View view, Z1 z1) {
            super.g(view, z1);
            z1.n0(ViewPager.class.getName());
            z1.N0(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                z1.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                z1.a(8192);
            }
        }

        @Override // com.daaw.C5554j1
        public boolean j(View view, int i, Bundle bundle) {
            if (super.j(view, i, bundle)) {
                return true;
            }
            if (i == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.G + 1);
                return true;
            }
            if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.G - 1);
            return true;
        }

        public final boolean n() {
            AbstractC7480ps0 abstractC7480ps0 = ViewPager.this.F;
            return abstractC7480ps0 != null && abstractC7480ps0.c() > 1;
        }
    }

    public interface i {
        void a(int i, float f, int i2);

        void b(int i);

        void c(int i);
    }

    public class j extends DataSetObserver {
        public j() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.g();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.g();
        }
    }

    public static class k implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z = gVar.a;
            return z != gVar2.a ? z ? 1 : -1 : gVar.e - gVar2.e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = new ArrayList();
        this.D = new f();
        this.E = new Rect();
        this.H = -1;
        this.I = null;
        this.J = null;
        this.R = -3.4028235E38f;
        this.S = Float.MAX_VALUE;
        this.b0 = 1;
        this.l0 = -1;
        this.u0 = true;
        this.v0 = false;
        this.E0 = new c();
        this.F0 = 0;
        t();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.W != z) {
            this.W = z;
        }
    }

    public static boolean u(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    public final boolean A(int i2) {
        if (this.C.size() == 0) {
            if (this.u0) {
                return false;
            }
            this.w0 = false;
            w(0, 0.0f, 0);
            if (this.w0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarR = r();
        int clientWidth = getClientWidth();
        int i3 = this.N;
        int i4 = clientWidth + i3;
        float f2 = clientWidth;
        int i5 = fVarR.b;
        float f3 = ((i2 / f2) - fVarR.e) / (fVarR.d + (i3 / f2));
        this.w0 = false;
        w(i5, f3, (int) (i4 * f3));
        if (this.w0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean B(float f2) {
        boolean z;
        boolean z2;
        float f3 = this.h0 - f2;
        this.h0 = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.R * clientWidth;
        float f5 = this.S * clientWidth;
        boolean z3 = false;
        f fVar = (f) this.C.get(0);
        ArrayList arrayList = this.C;
        f fVar2 = (f) arrayList.get(arrayList.size() - 1);
        if (fVar.b != 0) {
            f4 = fVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.b != this.F.c() - 1) {
            f5 = fVar2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f4) {
            if (z) {
                this.s0.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z2) {
                this.t0.onPull(Math.abs(scrollX - f5) / clientWidth);
                z3 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.h0 += scrollX - i2;
        scrollTo(i2, getScrollY());
        A(i2);
        return z3;
    }

    public void C() {
        D(this.G);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc A[PHI: r7 r10 r15
  0x00cc: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]
  0x00cc: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]
  0x00cc: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D(int r18) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.D(int):void");
    }

    public final void E(int i2, int i3, int i4, int i5) {
        if (i3 > 0 && !this.C.isEmpty()) {
            if (!this.K.isFinished()) {
                this.K.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)), getScrollY());
                return;
            }
        }
        f fVarS = s(this.G);
        int iMin = (int) ((fVarS != null ? Math.min(fVarS.e, this.S) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            f(false);
            scrollTo(iMin, getScrollY());
        }
    }

    public final void F() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((g) getChildAt(i2).getLayoutParams()).a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    public final void G(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final boolean H() {
        this.l0 = -1;
        m();
        this.s0.onRelease();
        this.t0.onRelease();
        return this.s0.isFinished() || this.t0.isFinished();
    }

    public final void I(int i2, boolean z, int i3, boolean z2) {
        f fVarS = s(i2);
        int clientWidth = fVarS != null ? (int) (getClientWidth() * Math.max(this.R, Math.min(fVarS.e, this.S))) : 0;
        if (z) {
            M(clientWidth, 0, i3);
            if (z2) {
                j(i2);
                return;
            }
            return;
        }
        if (z2) {
            j(i2);
        }
        f(false);
        scrollTo(clientWidth, 0);
        A(clientWidth);
    }

    public void J(int i2, boolean z) {
        this.a0 = false;
        K(i2, z, false);
    }

    public void K(int i2, boolean z, boolean z2) {
        L(i2, z, z2, 0);
    }

    public void L(int i2, boolean z, boolean z2, int i3) {
        AbstractC7480ps0 abstractC7480ps0 = this.F;
        if (abstractC7480ps0 == null || abstractC7480ps0.c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.G == i2 && this.C.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.F.c()) {
            i2 = this.F.c() - 1;
        }
        int i4 = this.b0;
        int i5 = this.G;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            for (int i6 = 0; i6 < this.C.size(); i6++) {
                ((f) this.C.get(i6)).c = true;
            }
        }
        boolean z3 = this.G != i2;
        if (!this.u0) {
            D(i2);
            I(i2, z, i3, z3);
        } else {
            this.G = i2;
            if (z3) {
                j(i2);
            }
            requestLayout();
        }
    }

    public void M(int i2, int i3, int i4) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.K;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.L ? this.K.getCurrX() : this.K.getStartX();
            this.K.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i5 = scrollX;
        int scrollY = getScrollY();
        int i6 = i2 - i5;
        int i7 = i3 - scrollY;
        if (i6 == 0 && i7 == 0) {
            f(false);
            C();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f2 = clientWidth;
        float f3 = i8;
        float fL = f3 + (l(Math.min(1.0f, (Math.abs(i6) * 1.0f) / f2)) * f3);
        int iAbs = Math.abs(i4);
        int iMin = Math.min(iAbs > 0 ? Math.round(Math.abs(fL / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i6) / ((f2 * this.F.f(this.G)) + this.N)) + 1.0f) * 100.0f), 600);
        this.L = false;
        this.K.startScroll(i5, scrollY, i6, i7, iMin);
        AbstractC2317Td1.g0(this);
    }

    public final void N() {
        if (this.C0 != 0) {
            ArrayList arrayList = this.D0;
            if (arrayList == null) {
                this.D0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.D0.add(getChildAt(i2));
            }
            Collections.sort(this.D0, J0);
        }
    }

    public f a(int i2, int i3) {
        f fVar = new f();
        fVar.b = i2;
        fVar.a = this.F.g(this, i2);
        fVar.d = this.F.f(i2);
        if (i3 < 0 || i3 >= this.C.size()) {
            this.C.add(fVar);
            return fVar;
        }
        this.C.add(i3, fVar);
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i2, int i3) {
        f fVarQ;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (fVarQ = q(childAt)) != null && fVarQ.b == this.G) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList arrayList) {
        f fVarQ;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarQ = q(childAt)) != null && fVarQ.b == this.G) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean zU = gVar.a | u(view);
        gVar.a = zU;
        if (!this.V) {
            super.addView(view, i2, layoutParams);
        } else {
            if (zU) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gVar.d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    public void b(i iVar) {
        if (this.y0 == null) {
            this.y0 = new ArrayList();
        }
        this.y0.add(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(int r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L9
        L7:
            r0 = r1
            goto L48
        L9:
            if (r0 == 0) goto L48
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r4) goto L16
            goto L48
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L7
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto L98
            if (r1 == r0) goto L98
            if (r5 != r3) goto L78
            android.graphics.Rect r2 = r4.E
            android.graphics.Rect r2 = r4.o(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.E
            android.graphics.Rect r3 = r4.o(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L73
            if (r2 < r3) goto L73
            boolean r0 = r4.y()
            goto Laf
        L73:
            boolean r0 = r1.requestFocus()
            goto Laf
        L78:
            if (r5 != r2) goto La4
            android.graphics.Rect r2 = r4.E
            android.graphics.Rect r2 = r4.o(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.E
            android.graphics.Rect r3 = r4.o(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L93
            if (r2 > r3) goto L93
            boolean r0 = r4.z()
            goto Laf
        L93:
            boolean r0 = r1.requestFocus()
            goto Laf
        L98:
            if (r5 == r3) goto Lab
            r0 = 1
            if (r5 != r0) goto L9e
            goto Lab
        L9e:
            if (r5 == r2) goto La6
            r0 = 2
            if (r5 != r0) goto La4
            goto La6
        La4:
            r0 = 0
            goto Laf
        La6:
            boolean r0 = r4.z()
            goto Laf
        Lab:
            boolean r0 = r4.y()
        Laf:
            if (r0 == 0) goto Lb8
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        Lb8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.c(int):boolean");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.F == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.R)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.S));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.L = true;
        if (this.K.isFinished() || !this.K.computeScrollOffset()) {
            f(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.K.getCurrX();
        int currY = this.K.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!A(currX)) {
                this.K.abortAnimation();
                scrollTo(0, currY);
            }
        }
        AbstractC2317Td1.g0(this);
    }

    public final void d(f fVar, int i2, f fVar2) {
        int i3;
        int i4;
        f fVar3;
        f fVar4;
        int iC = this.F.c();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.N / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i5 = fVar2.b;
            int i6 = fVar.b;
            if (i5 < i6) {
                float f3 = fVar2.e + fVar2.d + f2;
                int i7 = i5 + 1;
                int i8 = 0;
                while (i7 <= fVar.b && i8 < this.C.size()) {
                    Object obj = this.C.get(i8);
                    while (true) {
                        fVar4 = (f) obj;
                        if (i7 <= fVar4.b || i8 >= this.C.size() - 1) {
                            break;
                        }
                        i8++;
                        obj = this.C.get(i8);
                    }
                    while (i7 < fVar4.b) {
                        f3 += this.F.f(i7) + f2;
                        i7++;
                    }
                    fVar4.e = f3;
                    f3 += fVar4.d + f2;
                    i7++;
                }
            } else if (i5 > i6) {
                int size = this.C.size() - 1;
                float f4 = fVar2.e;
                while (true) {
                    i5--;
                    if (i5 < fVar.b || size < 0) {
                        break;
                    }
                    Object obj2 = this.C.get(size);
                    while (true) {
                        fVar3 = (f) obj2;
                        if (i5 >= fVar3.b || size <= 0) {
                            break;
                        }
                        size--;
                        obj2 = this.C.get(size);
                    }
                    while (i5 > fVar3.b) {
                        f4 -= this.F.f(i5) + f2;
                        i5--;
                    }
                    f4 -= fVar3.d + f2;
                    fVar3.e = f4;
                }
            }
        }
        int size2 = this.C.size();
        float f5 = fVar.e;
        int i9 = fVar.b;
        int i10 = i9 - 1;
        this.R = i9 == 0 ? f5 : -3.4028235E38f;
        int i11 = iC - 1;
        this.S = i9 == i11 ? (fVar.d + f5) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            f fVar5 = (f) this.C.get(i12);
            while (true) {
                i4 = fVar5.b;
                if (i10 <= i4) {
                    break;
                }
                f5 -= this.F.f(i10) + f2;
                i10--;
            }
            f5 -= fVar5.d + f2;
            fVar5.e = f5;
            if (i4 == 0) {
                this.R = f5;
            }
            i12--;
            i10--;
        }
        float f6 = fVar.e + fVar.d + f2;
        int i13 = fVar.b + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            f fVar6 = (f) this.C.get(i14);
            while (true) {
                i3 = fVar6.b;
                if (i13 >= i3) {
                    break;
                }
                f6 += this.F.f(i13) + f2;
                i13++;
            }
            if (i3 == i11) {
                this.S = (fVar6.d + f6) - 1.0f;
            }
            fVar6.e = f6;
            f6 += fVar6.d + f2;
            i14++;
            i13++;
        }
        this.v0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || n(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarQ;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarQ = q(childAt)) != null && fVarQ.b == this.G && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC7480ps0 abstractC7480ps0;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC7480ps0 = this.F) != null && abstractC7480ps0.c() > 1)) {
            if (!this.s0.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.R * width);
                this.s0.setSize(height, width);
                zDraw = this.s0.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.t0.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.S + 1.0f)) * width2);
                this.t0.setSize(height2, width2);
                zDraw |= this.t0.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.s0.finish();
            this.t0.finish();
        }
        if (zDraw) {
            AbstractC2317Td1.g0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.O;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public boolean e(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && e(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    public final void f(boolean z) {
        boolean z2 = this.F0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.K.isFinished()) {
                this.K.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.K.getCurrX();
                int currY = this.K.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A(currX);
                    }
                }
            }
        }
        this.a0 = false;
        for (int i2 = 0; i2 < this.C.size(); i2++) {
            f fVar = (f) this.C.get(i2);
            if (fVar.c) {
                fVar.c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                AbstractC2317Td1.h0(this, this.E0);
            } else {
                this.E0.run();
            }
        }
    }

    public void g() {
        int iC = this.F.c();
        this.B = iC;
        boolean z = this.C.size() < (this.b0 * 2) + 1 && this.C.size() < iC;
        int iMax = this.G;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.C.size()) {
            f fVar = (f) this.C.get(i2);
            int iD = this.F.d(fVar.a);
            if (iD != -1) {
                if (iD == -2) {
                    this.C.remove(i2);
                    i2--;
                    if (!z2) {
                        this.F.n(this);
                        z2 = true;
                    }
                    this.F.a(this, fVar.b, fVar.a);
                    int i3 = this.G;
                    if (i3 == fVar.b) {
                        iMax = Math.max(0, Math.min(i3, iC - 1));
                    }
                } else {
                    int i4 = fVar.b;
                    if (i4 != iD) {
                        if (i4 == this.G) {
                            iMax = iD;
                        }
                        fVar.b = iD;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.F.b(this);
        }
        Collections.sort(this.C, H0);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                g gVar = (g) getChildAt(i5).getLayoutParams();
                if (!gVar.a) {
                    gVar.c = 0.0f;
                }
            }
            K(iMax, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC7480ps0 getAdapter() {
        return this.F;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.C0 == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((g) ((View) this.D0.get(i3)).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.G;
    }

    public int getOffscreenPageLimit() {
        return this.b0;
    }

    public int getPageMargin() {
        return this.N;
    }

    public final int h(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.p0 || Math.abs(i3) <= this.n0) {
            i2 += (int) (f2 + (i2 >= this.G ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.C.size() <= 0) {
            return i2;
        }
        return Math.max(((f) this.C.get(0)).b, Math.min(i2, ((f) this.C.get(r4.size() - 1)).b));
    }

    public final void i(int i2, float f2, int i3) {
        i iVar = this.z0;
        if (iVar != null) {
            iVar.a(i2, f2, i3);
        }
        List list = this.y0;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                i iVar2 = (i) this.y0.get(i4);
                if (iVar2 != null) {
                    iVar2.a(i2, f2, i3);
                }
            }
        }
        i iVar3 = this.A0;
        if (iVar3 != null) {
            iVar3.a(i2, f2, i3);
        }
    }

    public final void j(int i2) {
        i iVar = this.z0;
        if (iVar != null) {
            iVar.c(i2);
        }
        List list = this.y0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar2 = (i) this.y0.get(i3);
                if (iVar2 != null) {
                    iVar2.c(i2);
                }
            }
        }
        i iVar3 = this.A0;
        if (iVar3 != null) {
            iVar3.c(i2);
        }
    }

    public final void k(int i2) {
        i iVar = this.z0;
        if (iVar != null) {
            iVar.b(i2);
        }
        List list = this.y0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar2 = (i) this.y0.get(i3);
                if (iVar2 != null) {
                    iVar2.b(i2);
                }
            }
        }
        i iVar3 = this.A0;
        if (iVar3 != null) {
            iVar3.b(i2);
        }
    }

    public float l(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    public final void m() {
        this.c0 = false;
        this.d0 = false;
        VelocityTracker velocityTracker = this.m0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.m0 = null;
        }
    }

    public boolean n(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            return keyEvent.hasModifiers(2) ? y() : c(17);
        }
        if (keyCode == 22) {
            return keyEvent.hasModifiers(2) ? z() : c(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return c(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return c(1);
        }
        return false;
    }

    public final Rect o(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.u0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.E0);
        Scroller scroller = this.K;
        if (scroller != null && !scroller.isFinished()) {
            this.K.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i2;
        float f2;
        int i3;
        super.onDraw(canvas);
        if (this.N <= 0 || this.O == null || this.C.size() <= 0 || this.F == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f3 = this.N / width;
        int i4 = 0;
        f fVar = (f) this.C.get(0);
        float f4 = fVar.e;
        int size = this.C.size();
        int i5 = fVar.b;
        int i6 = ((f) this.C.get(size - 1)).b;
        while (i5 < i6) {
            while (true) {
                i2 = fVar.b;
                if (i5 <= i2 || i4 >= size) {
                    break;
                }
                i4++;
                fVar = (f) this.C.get(i4);
            }
            if (i5 == i2) {
                float f5 = fVar.e;
                float f6 = fVar.d;
                f2 = (f5 + f6) * width;
                f4 = f5 + f6 + f3;
            } else {
                float f7 = this.F.f(i5);
                f2 = (f4 + f7) * width;
                f4 += f7 + f3;
            }
            if (this.N + f2 > scrollX) {
                i3 = scrollX;
                this.O.setBounds(Math.round(f2), this.P, Math.round(this.N + f2), this.Q);
                this.O.draw(canvas);
            } else {
                i3 = scrollX;
            }
            if (f2 > i3 + r2) {
                return;
            }
            i5++;
            scrollX = i3;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            H();
            return false;
        }
        if (action != 0) {
            if (this.c0) {
                return true;
            }
            if (this.d0) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.j0 = x;
            this.h0 = x;
            float y = motionEvent.getY();
            this.k0 = y;
            this.i0 = y;
            this.l0 = motionEvent.getPointerId(0);
            this.d0 = false;
            this.L = true;
            this.K.computeScrollOffset();
            if (this.F0 != 2 || Math.abs(this.K.getFinalX() - this.K.getCurrX()) <= this.q0) {
                f(false);
                this.c0 = false;
            } else {
                this.K.abortAnimation();
                this.a0 = false;
                C();
                this.c0 = true;
                G(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.l0;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f2 = x2 - this.h0;
                float fAbs = Math.abs(f2);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.k0);
                if (f2 != 0.0f && !v(this.h0, f2) && e(this, false, (int) f2, (int) x2, (int) y2)) {
                    this.h0 = x2;
                    this.i0 = y2;
                    this.d0 = true;
                    return false;
                }
                int i3 = this.g0;
                if (fAbs > i3 && fAbs * 0.5f > fAbs2) {
                    this.c0 = true;
                    G(true);
                    setScrollState(1);
                    float f3 = this.j0;
                    float f4 = this.g0;
                    this.h0 = f2 > 0.0f ? f3 + f4 : f3 - f4;
                    this.i0 = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i3) {
                    this.d0 = true;
                }
                if (this.c0 && B(x2)) {
                    AbstractC2317Td1.g0(this);
                }
            }
        } else if (action == 6) {
            x(motionEvent);
        }
        if (this.m0 == null) {
            this.m0 = VelocityTracker.obtain();
        }
        this.m0.addMovement(motionEvent);
        return this.c0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        int i5;
        f fVarQ;
        int childCount = getChildCount();
        if ((i2 & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i5 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
            i5 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (fVarQ = q(childAt)) != null && fVarQ.b == this.G && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i5;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        AbstractC7480ps0 abstractC7480ps0 = this.F;
        if (abstractC7480ps0 != null) {
            abstractC7480ps0.j(savedState.E, savedState.F);
            K(savedState.D, false, true);
        } else {
            this.H = savedState.D;
            this.I = savedState.E;
            this.J = savedState.F;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.D = this.G;
        AbstractC7480ps0 abstractC7480ps0 = this.F;
        if (abstractC7480ps0 != null) {
            savedState.E = abstractC7480ps0.k();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.N;
            E(i2, i4, i6, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public f p(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return q(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public f q(View view) {
        for (int i2 = 0; i2 < this.C.size(); i2++) {
            f fVar = (f) this.C.get(i2);
            if (this.F.h(view, fVar.a)) {
                return fVar;
            }
        }
        return null;
    }

    public final f r() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.N / clientWidth : 0.0f;
        f fVar = null;
        float f4 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z = true;
        while (i4 < this.C.size()) {
            f fVar2 = (f) this.C.get(i4);
            if (!z && fVar2.b != (i2 = i3 + 1)) {
                fVar2 = this.D;
                fVar2.e = f2 + f4 + f3;
                fVar2.b = i2;
                fVar2.d = this.F.f(i2);
                i4--;
            }
            f fVar3 = fVar2;
            f2 = fVar3.e;
            float f5 = fVar3.d + f2 + f3;
            if (!z && scrollX < f2) {
                break;
            }
            if (scrollX < f5 || i4 == this.C.size() - 1) {
                return fVar3;
            }
            int i5 = fVar3.b;
            float f6 = fVar3.d;
            i4++;
            i3 = i5;
            f4 = f6;
            fVar = fVar3;
            z = false;
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.V) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public f s(int i2) {
        for (int i3 = 0; i3 < this.C.size(); i3++) {
            f fVar = (f) this.C.get(i3);
            if (fVar.b == i2) {
                return fVar;
            }
        }
        return null;
    }

    public void setAdapter(AbstractC7480ps0 abstractC7480ps0) {
        AbstractC7480ps0 abstractC7480ps02 = this.F;
        if (abstractC7480ps02 != null) {
            abstractC7480ps02.m(null);
            this.F.n(this);
            for (int i2 = 0; i2 < this.C.size(); i2++) {
                f fVar = (f) this.C.get(i2);
                this.F.a(this, fVar.b, fVar.a);
            }
            this.F.b(this);
            this.C.clear();
            F();
            this.G = 0;
            scrollTo(0, 0);
        }
        this.F = abstractC7480ps0;
        this.B = 0;
        if (abstractC7480ps0 != null) {
            if (this.M == null) {
                this.M = new j();
            }
            this.F.m(this.M);
            this.a0 = false;
            boolean z = this.u0;
            this.u0 = true;
            this.B = this.F.c();
            if (this.H >= 0) {
                this.F.j(this.I, this.J);
                K(this.H, false, true);
                this.H = -1;
                this.I = null;
                this.J = null;
            } else if (z) {
                requestLayout();
            } else {
                C();
            }
        }
        List list = this.B0;
        if (list == null || list.isEmpty() || this.B0.size() <= 0) {
            return;
        }
        AbstractC6314li0.a(this.B0.get(0));
        throw null;
    }

    public void setCurrentItem(int i2) {
        this.a0 = false;
        K(i2, !this.u0, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            i2 = 1;
        }
        if (i2 != this.b0) {
            this.b0 = i2;
            C();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.z0 = iVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.N;
        this.N = i2;
        int width = getWidth();
        E(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.O = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i2) {
        if (this.F0 == i2) {
            return;
        }
        this.F0 = i2;
        k(i2);
    }

    public void t() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.K = new Scroller(context, I0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.g0 = viewConfiguration.getScaledPagingTouchSlop();
        this.n0 = (int) (400.0f * f2);
        this.o0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.s0 = new EdgeEffect(context);
        this.t0 = new EdgeEffect(context);
        this.p0 = (int) (25.0f * f2);
        this.q0 = (int) (2.0f * f2);
        this.e0 = (int) (f2 * 16.0f);
        AbstractC2317Td1.p0(this, new h());
        if (AbstractC2317Td1.B(this) == 0) {
            AbstractC2317Td1.z0(this, 1);
        }
        AbstractC2317Td1.D0(this, new d());
    }

    public final boolean v(float f2, float f3) {
        if (f2 >= this.f0 || f3 <= 0.0f) {
            return f2 > ((float) (getWidth() - this.f0)) && f3 < 0.0f;
        }
        return true;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.O;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.x0
            r1 = 1
            if (r0 <= 0) goto L6b
            int r0 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = 0
        L1a:
            if (r6 >= r5) goto L6b
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r8 = (androidx.viewpager.widget.ViewPager.g) r8
            boolean r9 = r8.a
            if (r9 != 0) goto L2b
            goto L68
        L2b:
            int r8 = r8.b
            r8 = r8 & 7
            if (r8 == r1) goto L4f
            r9 = 3
            if (r8 == r9) goto L49
            r9 = 5
            if (r8 == r9) goto L39
            r8 = r2
            goto L5c
        L39:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L45:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L5c
        L49:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5c
        L4f:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L45
        L5c:
            int r2 = r2 + r0
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L67
            r7.offsetLeftAndRight(r2)
        L67:
            r2 = r8
        L68:
            int r6 = r6 + 1
            goto L1a
        L6b:
            r11.i(r12, r13, r14)
            r11.w0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.w(int, float, int):void");
    }

    public final void x(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.l0) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.h0 = motionEvent.getX(i2);
            this.l0 = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.m0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean y() {
        int i2 = this.G;
        if (i2 <= 0) {
            return false;
        }
        J(i2 - 1, true);
        return true;
    }

    public boolean z() {
        AbstractC7480ps0 abstractC7480ps0 = this.F;
        if (abstractC7480ps0 == null || this.G >= abstractC7480ps0.c() - 1) {
            return false;
        }
        J(this.G + 1, true);
        return true;
    }

    public static class g extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        public float c;
        public boolean d;
        public int e;
        public int f;

        public g() {
            super(-1, -1);
            this.c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.G0);
            this.b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(AbstractC9438ws.e(getContext(), i2));
    }
}
