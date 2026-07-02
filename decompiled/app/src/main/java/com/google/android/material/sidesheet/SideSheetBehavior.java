package com.google.android.material.sidesheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC4336eh0;
import com.daaw.AbstractC6314li0;
import com.daaw.AbstractC9105vh0;
import com.daaw.C3487be1;
import com.daaw.C4904gh0;
import com.daaw.C5671jR0;
import com.daaw.C9560xJ0;
import com.daaw.InterfaceC4724g2;
import com.daaw.ND0;
import com.daaw.SD0;
import com.daaw.TR0;
import com.daaw.WD0;
import com.daaw.Z1;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.b {
    public static final int x = ND0.w;
    public static final int y = SD0.h;
    public TR0 a;
    public float b;
    public C4904gh0 c;
    public ColorStateList d;
    public C5671jR0 e;
    public final b f;
    public float g;
    public boolean h;
    public int i;
    public int j;
    public C3487be1 k;
    public boolean l;
    public float m;
    public int n;
    public int o;
    public int p;
    public WeakReference q;
    public WeakReference r;
    public int s;
    public VelocityTracker t;
    public int u;
    public final Set v;
    public final C3487be1.c w;

    public class a extends C3487be1.c {
        public a() {
        }

        @Override // com.daaw.C3487be1.c
        public int a(View view, int i, int i2) {
            return AbstractC9105vh0.b(i, SideSheetBehavior.this.Z(), SideSheetBehavior.this.o);
        }

        @Override // com.daaw.C3487be1.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // com.daaw.C3487be1.c
        public int d(View view) {
            return SideSheetBehavior.this.o;
        }

        @Override // com.daaw.C3487be1.c
        public void j(int i) {
            if (i == 1 && SideSheetBehavior.this.h) {
                SideSheetBehavior.this.r0(1);
            }
        }

        @Override // com.daaw.C3487be1.c
        public void k(View view, int i, int i2, int i3, int i4) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewX = SideSheetBehavior.this.X();
            if (viewX != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewX.getLayoutParams()) != null) {
                SideSheetBehavior.this.a.i(marginLayoutParams, view.getLeft(), view.getRight());
                viewX.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.T(view, i);
        }

        @Override // com.daaw.C3487be1.c
        public void l(View view, float f, float f2) {
            int iC = SideSheetBehavior.this.a.c(view, f, f2);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.v0(view, iC, sideSheetBehavior.u0());
        }

        @Override // com.daaw.C3487be1.c
        public boolean m(View view, int i) {
            return (SideSheetBehavior.this.i == 1 || SideSheetBehavior.this.q == null || SideSheetBehavior.this.q.get() != view) ? false : true;
        }
    }

    public class b {
        public int a;
        public boolean b;
        public final Runnable c = new Runnable() { // from class: com.daaw.hS0
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.b.a(this.B);
            }
        };

        public b() {
        }

        public static /* synthetic */ void a(b bVar) {
            bVar.b = false;
            if (SideSheetBehavior.this.k != null && SideSheetBehavior.this.k.m(true)) {
                bVar.b(bVar.a);
            } else if (SideSheetBehavior.this.i == 2) {
                SideSheetBehavior.this.r0(bVar.a);
            }
        }

        public void b(int i) {
            if (SideSheetBehavior.this.q == null || SideSheetBehavior.this.q.get() == null) {
                return;
            }
            this.a = i;
            if (this.b) {
                return;
            }
            AbstractC2317Td1.h0((View) SideSheetBehavior.this.q.get(), this.c);
            this.b = true;
        }
    }

    public SideSheetBehavior() {
        this.f = new b();
        this.h = true;
        this.i = 5;
        this.j = 5;
        this.m = 0.1f;
        this.s = -1;
        this.v = new LinkedHashSet();
        this.w = new a();
    }

    public static /* synthetic */ boolean E(SideSheetBehavior sideSheetBehavior, int i, View view, InterfaceC4724g2.a aVar) {
        sideSheetBehavior.q0(i);
        return true;
    }

    public static /* synthetic */ void F(SideSheetBehavior sideSheetBehavior, int i) {
        View view = (View) sideSheetBehavior.q.get();
        if (view != null) {
            sideSheetBehavior.v0(view, i, false);
        }
    }

    private InterfaceC4724g2 R(final int i) {
        return new InterfaceC4724g2() { // from class: com.daaw.fS0
            @Override // com.daaw.InterfaceC4724g2
            public final boolean a(View view, InterfaceC4724g2.a aVar) {
                return SideSheetBehavior.E(this.a, i, view, aVar);
            }
        };
    }

    private void S(Context context) {
        if (this.e == null) {
            return;
        }
        C4904gh0 c4904gh0 = new C4904gh0(this.e);
        this.c = c4904gh0;
        c4904gh0.I(context);
        ColorStateList colorStateList = this.d;
        if (colorStateList != null) {
            this.c.S(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.c.setTint(typedValue.data);
    }

    private int V(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    private void k0(View view, Z1.a aVar, int i) {
        AbstractC2317Td1.l0(view, aVar, null, R(i));
    }

    private void m0(View view, Runnable runnable) {
        if (i0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private boolean s0() {
        if (this.k != null) {
            return this.h || this.i == 1;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0(View view, int i, boolean z) {
        if (!this.a.h(view, i, z)) {
            r0(i);
        } else {
            r0(2);
            this.f.b(i);
        }
    }

    private void w0() {
        View view;
        WeakReference weakReference = this.q;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC2317Td1.j0(view, 262144);
        AbstractC2317Td1.j0(view, 1048576);
        if (this.i != 5) {
            k0(view, Z1.a.y, 5);
        }
        if (this.i != 3) {
            k0(view, Z1.a.w, 3);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.i == 1 && actionMasked == 0) {
            return true;
        }
        if (s0()) {
            this.k.F(motionEvent);
        }
        if (actionMasked == 0) {
            l0();
        }
        if (this.t == null) {
            this.t = VelocityTracker.obtain();
        }
        this.t.addMovement(motionEvent);
        if (s0() && actionMasked == 2 && !this.l && h0(motionEvent)) {
            this.k.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.l;
    }

    public final int O(int i, View view) {
        int i2 = this.i;
        if (i2 == 1 || i2 == 2) {
            return i - this.a.f(view);
        }
        if (i2 == 3) {
            return 0;
        }
        if (i2 == 5) {
            return this.a.e();
        }
        throw new IllegalStateException("Unexpected value: " + this.i);
    }

    public final float P(float f, float f2) {
        return Math.abs(f - f2);
    }

    public final void Q() {
        WeakReference weakReference = this.r;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.r = null;
    }

    public final void T(View view, int i) {
        if (this.v.isEmpty()) {
            return;
        }
        this.a.b(i);
        Iterator it = this.v.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            throw null;
        }
    }

    public final void U(View view) {
        if (AbstractC2317Td1.q(view) == null) {
            AbstractC2317Td1.s0(view, view.getResources().getString(x));
        }
    }

    public int W() {
        return this.n;
    }

    public View X() {
        WeakReference weakReference = this.r;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final int Y() {
        return 0;
    }

    public int Z() {
        return this.a.d();
    }

    public float a0() {
        return this.m;
    }

    public float b0() {
        return 0.5f;
    }

    public int c0() {
        return this.p;
    }

    public int d0(int i) {
        if (i == 3) {
            return Z();
        }
        if (i == 5) {
            return this.a.e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i);
    }

    public int e0() {
        return this.o;
    }

    public int f0() {
        return 500;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void g(CoordinatorLayout.e eVar) {
        super.g(eVar);
        this.q = null;
        this.k = null;
    }

    public C3487be1 g0() {
        return this.k;
    }

    public final boolean h0(MotionEvent motionEvent) {
        return s0() && P((float) this.u, motionEvent.getX()) > ((float) this.k.z());
    }

    public final boolean i0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && AbstractC2317Td1.T(view);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void j() {
        super.j();
        this.q = null;
        this.k = null;
    }

    public final void j0(CoordinatorLayout coordinatorLayout) {
        int i;
        View viewFindViewById;
        if (this.r != null || (i = this.s) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i)) == null) {
            return;
        }
        this.r = new WeakReference(viewFindViewById);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C3487be1 c3487be1;
        if (!t0(view)) {
            this.l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            l0();
        }
        if (this.t == null) {
            this.t = VelocityTracker.obtain();
        }
        this.t.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.u = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.l) {
            this.l = false;
            return false;
        }
        return (this.l || (c3487be1 = this.k) == null || !c3487be1.P(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (AbstractC2317Td1.A(coordinatorLayout) && !AbstractC2317Td1.A(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.q == null) {
            this.q = new WeakReference(view);
            C4904gh0 c4904gh0 = this.c;
            if (c4904gh0 != null) {
                AbstractC2317Td1.t0(view, c4904gh0);
                C4904gh0 c4904gh02 = this.c;
                float fX = this.g;
                if (fX == -1.0f) {
                    fX = AbstractC2317Td1.x(view);
                }
                c4904gh02.R(fX);
            } else {
                ColorStateList colorStateList = this.d;
                if (colorStateList != null) {
                    AbstractC2317Td1.u0(view, colorStateList);
                }
            }
            x0(view);
            w0();
            if (AbstractC2317Td1.B(view) == 0) {
                AbstractC2317Td1.z0(view, 1);
            }
            U(view);
        }
        if (this.k == null) {
            this.k = C3487be1.o(coordinatorLayout, this.w);
        }
        int iF = this.a.f(view);
        coordinatorLayout.G(view, i);
        this.o = coordinatorLayout.getWidth();
        this.n = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.p = marginLayoutParams != null ? this.a.a(marginLayoutParams) : 0;
        AbstractC2317Td1.Z(view, O(iF, view));
        j0(coordinatorLayout);
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            AbstractC6314li0.a(it.next());
        }
        return true;
    }

    public final void l0() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.t = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(V(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, -1, marginLayoutParams.width), V(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, -1, marginLayoutParams.height));
        return true;
    }

    public void n0(int i) {
        this.s = i;
        Q();
        WeakReference weakReference = this.q;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i == -1 || !AbstractC2317Td1.U(view)) {
                return;
            }
            view.requestLayout();
        }
    }

    public void o0(boolean z) {
        this.h = z;
    }

    public final void p0(int i) {
        TR0 tr0 = this.a;
        if (tr0 == null || tr0.g() != i) {
            if (i == 0) {
                this.a = new C9560xJ0(this);
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i + ". Must be 0");
        }
    }

    public void q0(final int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = this.q;
        if (weakReference == null || weakReference.get() == null) {
            r0(i);
        } else {
            m0((View) this.q.get(), new Runnable() { // from class: com.daaw.gS0
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.F(this.B, i);
                }
            });
        }
    }

    public void r0(int i) {
        View view;
        if (this.i == i) {
            return;
        }
        this.i = i;
        if (i == 3 || i == 5) {
            this.j = i;
        }
        WeakReference weakReference = this.q;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        x0(view);
        Iterator it = this.v.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            throw null;
        }
        w0();
    }

    public final boolean t0(View view) {
        return (view.isShown() || AbstractC2317Td1.q(view) != null) && this.h;
    }

    public boolean u0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.a() != null) {
            super.x(coordinatorLayout, view, savedState.a());
        }
        int i = savedState.D;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.i = i;
        this.j = i;
    }

    public final void x0(View view) {
        int i = this.i == 5 ? 4 : 0;
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.y(coordinatorLayout, view), this);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int D;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.D);
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.D = sideSheetBehavior.i;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new b();
        this.h = true;
        this.i = 5;
        this.j = 5;
        this.m = 0.1f;
        this.s = -1;
        this.v = new LinkedHashSet();
        this.w = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, WD0.Y4);
        if (typedArrayObtainStyledAttributes.hasValue(WD0.a5)) {
            this.d = AbstractC4336eh0.a(context, typedArrayObtainStyledAttributes, WD0.a5);
        }
        if (typedArrayObtainStyledAttributes.hasValue(WD0.d5)) {
            this.e = C5671jR0.e(context, attributeSet, 0, y).m();
        }
        if (typedArrayObtainStyledAttributes.hasValue(WD0.c5)) {
            n0(typedArrayObtainStyledAttributes.getResourceId(WD0.c5, -1));
        }
        S(context);
        this.g = typedArrayObtainStyledAttributes.getDimension(WD0.Z4, -1.0f);
        o0(typedArrayObtainStyledAttributes.getBoolean(WD0.b5, true));
        typedArrayObtainStyledAttributes.recycle();
        p0(Y());
        this.b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
