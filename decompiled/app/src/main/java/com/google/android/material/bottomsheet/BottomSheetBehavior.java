package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
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
import com.daaw.AbstractC2633We1;
import com.daaw.AbstractC4336eh0;
import com.daaw.AbstractC6314li0;
import com.daaw.AbstractC9105vh0;
import com.daaw.C3487be1;
import com.daaw.C3869d00;
import com.daaw.C4904gh0;
import com.daaw.C5671jR0;
import com.daaw.InterfaceC4724g2;
import com.daaw.JC0;
import com.daaw.ND0;
import com.daaw.SD0;
import com.daaw.WD0;
import com.daaw.YC0;
import com.daaw.Z1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.b {
    public static final int h0 = SD0.c;
    public boolean A;
    public final f B;
    public ValueAnimator C;
    public int D;
    public int E;
    public int F;
    public float G;
    public int H;
    public float I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public C3487be1 O;
    public boolean P;
    public int Q;
    public boolean R;
    public float S;
    public int T;
    public int U;
    public int V;
    public WeakReference W;
    public WeakReference X;
    public WeakReference Y;
    public final ArrayList Z;
    public int a;
    public VelocityTracker a0;
    public boolean b;
    public int b0;
    public boolean c;
    public int c0;
    public float d;
    public boolean d0;
    public int e;
    public Map e0;
    public int f;
    public final SparseIntArray f0;
    public boolean g;
    public final C3487be1.c g0;
    public int h;
    public int i;
    public C4904gh0 j;
    public ColorStateList k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public boolean y;
    public C5671jR0 z;

    public class a implements Runnable {
        public final /* synthetic */ View B;
        public final /* synthetic */ int C;

        public a(View view, int i) {
            this.B = view;
            this.C = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.S0(this.B, this.C, false);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.j != null) {
                BottomSheetBehavior.this.j.T(fFloatValue);
            }
        }
    }

    public class c implements AbstractC2633We1.d {
        public final /* synthetic */ boolean a;

        public c(boolean z) {
            this.a = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
        @Override // com.daaw.AbstractC2633We1.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.daaw.C8820uh1 a(android.view.View r11, com.daaw.C8820uh1 r12, com.daaw.AbstractC2633We1.e r13) {
            /*
                Method dump skipped, instruction units count: 207
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c.a(android.view.View, com.daaw.uh1, com.daaw.We1$e):com.daaw.uh1");
        }
    }

    public class d extends C3487be1.c {
        public long a;

        public d() {
        }

        @Override // com.daaw.C3487be1.c
        public int a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // com.daaw.C3487be1.c
        public int b(View view, int i, int i2) {
            return AbstractC9105vh0.b(i, BottomSheetBehavior.this.k0(), e(view));
        }

        @Override // com.daaw.C3487be1.c
        public int e(View view) {
            return BottomSheetBehavior.this.c0() ? BottomSheetBehavior.this.V : BottomSheetBehavior.this.H;
        }

        @Override // com.daaw.C3487be1.c
        public void j(int i) {
            if (i == 1 && BottomSheetBehavior.this.L) {
                BottomSheetBehavior.this.L0(1);
            }
        }

        @Override // com.daaw.C3487be1.c
        public void k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.h0(i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
        @Override // com.daaw.C3487be1.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instruction units count: 309
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        @Override // com.daaw.C3487be1.c
        public boolean m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.M;
            if (i2 == 1 || bottomSheetBehavior.d0) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.b0 == i) {
                WeakReference weakReference = bottomSheetBehavior.Y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.a = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.W;
            return weakReference2 != null && weakReference2.get() == view;
        }

        public final boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.V + bottomSheetBehavior.k0()) / 2;
        }
    }

    public class e implements InterfaceC4724g2 {
        public final /* synthetic */ int a;

        public e(int i) {
            this.a = i;
        }

        @Override // com.daaw.InterfaceC4724g2
        public boolean a(View view, InterfaceC4724g2.a aVar) {
            BottomSheetBehavior.this.K0(this.a);
            return true;
        }
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.c = false;
        this.l = -1;
        this.m = -1;
        this.B = new f(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.S = 0.1f;
        this.Z = new ArrayList();
        this.f0 = new SparseIntArray();
        this.g0 = new d();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.Q = 0;
        this.R = false;
        return (i & 2) != 0;
    }

    public void A0(boolean z) {
        this.o = z;
    }

    public void B0(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.G = f2;
        if (this.W != null) {
            Z();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.k0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.L0(r0)
            return
        Lf:
            boolean r3 = r2.s0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference r3 = r2.Y
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.R
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.Q
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.F
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.J
            if (r3 == 0) goto L49
            float r3 = r2.m0()
            boolean r3 = r2.P0(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.Q
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.b
            if (r1 == 0) goto L68
            int r5 = r2.E
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.F
            if (r3 >= r1) goto L7e
            int r1 = r2.H
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.Q0()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.b
            if (r3 == 0) goto L94
        L92:
            r0 = 4
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.F
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = 6
        Laa:
            r3 = 0
            r2.S0(r4, r0, r3)
            r2.R = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public void C0(boolean z) {
        if (this.J != z) {
            this.J = z;
            if (!z && this.M == 5) {
                K0(4);
            }
            T0();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.M == 1 && actionMasked == 0) {
            return true;
        }
        if (O0()) {
            this.O.F(motionEvent);
        }
        if (actionMasked == 0) {
            u0();
        }
        if (this.a0 == null) {
            this.a0 = VelocityTracker.obtain();
        }
        this.a0.addMovement(motionEvent);
        if (O0() && actionMasked == 2 && !this.P && Math.abs(this.c0 - motionEvent.getY()) > this.O.z()) {
            this.O.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.P;
    }

    public void D0(int i) {
        this.m = i;
    }

    public void E0(int i) {
        this.l = i;
    }

    public void F0(int i) {
        G0(i, false);
    }

    public final void G0(int i, boolean z) {
        if (i == -1) {
            if (this.g) {
                return;
            } else {
                this.g = true;
            }
        } else {
            if (!this.g && this.f == i) {
                return;
            }
            this.g = false;
            this.f = Math.max(0, i);
        }
        X0(z);
    }

    public void H0(int i) {
        this.a = i;
    }

    public void I0(int i) {
        this.e = i;
    }

    public void J0(boolean z) {
        this.K = z;
    }

    public void K0(int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (this.J || i != 5) {
            int i2 = (i == 6 && this.b && l0(i) <= this.E) ? 3 : i;
            WeakReference weakReference = this.W;
            if (weakReference == null || weakReference.get() == null) {
                L0(i);
            } else {
                View view = (View) this.W.get();
                w0(view, new a(view, i2));
            }
        }
    }

    public void L0(int i) {
        if (this.M == i) {
            return;
        }
        this.M = i;
        if (i == 4 || i == 3 || i == 6 || (this.J && i == 5)) {
            this.N = i;
        }
        WeakReference weakReference = this.W;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            W0(true);
        } else if (i == 6 || i == 5 || i == 4) {
            W0(false);
        }
        V0(i, true);
        if (this.Z.size() <= 0) {
            T0();
        } else {
            AbstractC6314li0.a(this.Z.get(0));
            throw null;
        }
    }

    public final void M0(View view) {
        boolean z = (Build.VERSION.SDK_INT < 29 || o0() || this.g) ? false : true;
        if (this.p || this.q || this.r || this.t || this.u || this.v || z) {
            AbstractC2633We1.a(view, new c(z));
        }
    }

    public boolean N0(long j, float f2) {
        return false;
    }

    public final boolean O0() {
        if (this.O != null) {
            return this.L || this.M == 1;
        }
        return false;
    }

    public boolean P0(View view, float f2) {
        if (this.K) {
            return true;
        }
        if (q0() && view.getTop() >= this.H) {
            return Math.abs((((float) view.getTop()) + (f2 * this.S)) - ((float) this.H)) / ((float) a0()) > 0.5f;
        }
        return false;
    }

    public boolean Q0() {
        return false;
    }

    public boolean R0() {
        return true;
    }

    public final void S0(View view, int i, boolean z) {
        int iL0 = l0(i);
        C3487be1 c3487be1 = this.O;
        if (c3487be1 == null || (!z ? c3487be1.Q(view, view.getLeft(), iL0) : c3487be1.O(view.getLeft(), iL0))) {
            L0(i);
            return;
        }
        L0(2);
        V0(i, true);
        this.B.c(i);
    }

    public final void T0() {
        WeakReference weakReference = this.W;
        if (weakReference != null) {
            U0((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.X;
        if (weakReference2 != null) {
            U0((View) weakReference2.get(), 1);
        }
    }

    public final void U0(View view, int i) {
        if (view == null) {
            return;
        }
        d0(view, i);
        if (!this.b && this.M != 6) {
            this.f0.put(i, X(view, ND0.a, 6));
        }
        if (this.J && q0() && this.M != 5) {
            t0(view, Z1.a.y, 5);
        }
        int i2 = this.M;
        if (i2 == 3) {
            t0(view, Z1.a.x, this.b ? 4 : 6);
            return;
        }
        if (i2 == 4) {
            t0(view, Z1.a.w, this.b ? 3 : 6);
        } else {
            if (i2 != 6) {
                return;
            }
            t0(view, Z1.a.x, 4);
            t0(view, Z1.a.w, 3);
        }
    }

    public final void V0(int i, boolean z) {
        boolean zN0;
        ValueAnimator valueAnimator;
        if (i == 2 || this.A == (zN0 = n0()) || this.j == null) {
            return;
        }
        this.A = zN0;
        if (!z || (valueAnimator = this.C) == null) {
            ValueAnimator valueAnimator2 = this.C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.C.cancel();
            }
            this.j.T(this.A ? 0.0f : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.C.reverse();
            return;
        }
        float f2 = zN0 ? 0.0f : 1.0f;
        this.C.setFloatValues(1.0f - f2, f2);
        this.C.start();
    }

    public final void W0(boolean z) {
        Map map;
        WeakReference weakReference = this.W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.e0 != null) {
                    return;
                } else {
                    this.e0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.W.get()) {
                    if (z) {
                        this.e0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.c) {
                            AbstractC2317Td1.z0(childAt, 4);
                        }
                    } else if (this.c && (map = this.e0) != null && map.containsKey(childAt)) {
                        AbstractC2317Td1.z0(childAt, ((Integer) this.e0.get(childAt)).intValue());
                    }
                }
            }
            if (!z) {
                this.e0 = null;
            } else if (this.c) {
                ((View) this.W.get()).sendAccessibilityEvent(8);
            }
        }
    }

    public final int X(View view, int i, int i2) {
        return AbstractC2317Td1.c(view, view.getResources().getString(i), e0(i2));
    }

    public final void X0(boolean z) {
        View view;
        if (this.W != null) {
            Y();
            if (this.M != 4 || (view = (View) this.W.get()) == null) {
                return;
            }
            if (z) {
                K0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    public final void Y() {
        int iA0 = a0();
        if (this.b) {
            this.H = Math.max(this.V - iA0, this.E);
        } else {
            this.H = this.V - iA0;
        }
    }

    public final void Z() {
        this.F = (int) (this.V * (1.0f - this.G));
    }

    public final int a0() {
        int i;
        return this.g ? Math.min(Math.max(this.h, this.V - ((this.U * 9) / 16)), this.T) + this.w : (this.o || this.p || (i = this.n) <= 0) ? this.f + this.w : Math.max(this.f, i + this.i);
    }

    public final float b0(int i) {
        float f2;
        float fK0;
        int i2 = this.H;
        if (i > i2 || i2 == k0()) {
            int i3 = this.H;
            f2 = i3 - i;
            fK0 = this.V - i3;
        } else {
            int i4 = this.H;
            f2 = i4 - i;
            fK0 = i4 - k0();
        }
        return f2 / fK0;
    }

    public final boolean c0() {
        return p0() && q0();
    }

    public final void d0(View view, int i) {
        if (view == null) {
            return;
        }
        AbstractC2317Td1.j0(view, 524288);
        AbstractC2317Td1.j0(view, 262144);
        AbstractC2317Td1.j0(view, 1048576);
        int i2 = this.f0.get(i, -1);
        if (i2 != -1) {
            AbstractC2317Td1.j0(view, i2);
            this.f0.delete(i);
        }
    }

    public final InterfaceC4724g2 e0(int i) {
        return new e(i);
    }

    public final void f0(Context context) {
        if (this.z == null) {
            return;
        }
        C4904gh0 c4904gh0 = new C4904gh0(this.z);
        this.j = c4904gh0;
        c4904gh0.I(context);
        ColorStateList colorStateList = this.k;
        if (colorStateList != null) {
            this.j.S(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.j.setTint(typedValue.data);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void g(CoordinatorLayout.e eVar) {
        super.g(eVar);
        this.W = null;
        this.O = null;
    }

    public final void g0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.C.addUpdateListener(new b());
    }

    public void h0(int i) {
        if (((View) this.W.get()) == null || this.Z.isEmpty()) {
            return;
        }
        b0(i);
        if (this.Z.size() <= 0) {
            return;
        }
        AbstractC6314li0.a(this.Z.get(0));
        throw null;
    }

    public View i0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (AbstractC2317Td1.V(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewI0 = i0(viewGroup.getChildAt(i));
                if (viewI0 != null) {
                    return viewI0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void j() {
        super.j();
        this.W = null;
        this.O = null;
    }

    public final int j0(int i, int i2, int i3, int i4) {
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

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C3487be1 c3487be1;
        if (!view.isShown() || !this.L) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u0();
        }
        if (this.a0 == null) {
            this.a0 = VelocityTracker.obtain();
        }
        this.a0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.c0 = (int) motionEvent.getY();
            if (this.M != 2) {
                WeakReference weakReference = this.Y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.z(view2, x, this.c0)) {
                    this.b0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.d0 = true;
                }
            }
            this.P = this.b0 == -1 && !coordinatorLayout.z(view, x, this.c0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.d0 = false;
            this.b0 = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (!this.P && (c3487be1 = this.O) != null && c3487be1.P(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.Y;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.P || this.M == 1 || coordinatorLayout.z(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || Math.abs(((float) this.c0) - motionEvent.getY()) <= ((float) this.O.z())) ? false : true;
    }

    public int k0() {
        if (this.b) {
            return this.E;
        }
        return Math.max(this.D, this.s ? 0 : this.x);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (AbstractC2317Td1.A(coordinatorLayout) && !AbstractC2317Td1.A(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.W == null) {
            this.h = coordinatorLayout.getResources().getDimensionPixelSize(YC0.a);
            M0(view);
            AbstractC2317Td1.J0(view, new C3869d00(view));
            this.W = new WeakReference(view);
            C4904gh0 c4904gh0 = this.j;
            if (c4904gh0 != null) {
                AbstractC2317Td1.t0(view, c4904gh0);
                C4904gh0 c4904gh02 = this.j;
                float fX = this.I;
                if (fX == -1.0f) {
                    fX = AbstractC2317Td1.x(view);
                }
                c4904gh02.R(fX);
            } else {
                ColorStateList colorStateList = this.k;
                if (colorStateList != null) {
                    AbstractC2317Td1.u0(view, colorStateList);
                }
            }
            T0();
            if (AbstractC2317Td1.B(view) == 0) {
                AbstractC2317Td1.z0(view, 1);
            }
        }
        if (this.O == null) {
            this.O = C3487be1.o(coordinatorLayout, this.g0);
        }
        int top = view.getTop();
        coordinatorLayout.G(view, i);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int i2 = this.V;
        int i3 = i2 - height;
        int i4 = this.x;
        if (i3 < i4) {
            if (this.s) {
                this.T = i2;
            } else {
                this.T = i2 - i4;
            }
        }
        this.E = Math.max(0, i2 - this.T);
        Z();
        Y();
        int i5 = this.M;
        if (i5 == 3) {
            AbstractC2317Td1.a0(view, k0());
        } else if (i5 == 6) {
            AbstractC2317Td1.a0(view, this.F);
        } else if (this.J && i5 == 5) {
            AbstractC2317Td1.a0(view, this.V);
        } else if (i5 == 4) {
            AbstractC2317Td1.a0(view, this.H);
        } else if (i5 == 1 || i5 == 2) {
            AbstractC2317Td1.a0(view, top - view.getTop());
        }
        V0(this.M, false);
        this.Y = new WeakReference(i0(view));
        if (this.Z.size() <= 0) {
            return true;
        }
        AbstractC6314li0.a(this.Z.get(0));
        throw null;
    }

    public final int l0(int i) {
        if (i == 3) {
            return k0();
        }
        if (i == 4) {
            return this.H;
        }
        if (i == 5) {
            return this.V;
        }
        if (i == 6) {
            return this.F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(j0(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.l, marginLayoutParams.width), j0(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.m, marginLayoutParams.height));
        return true;
    }

    public final float m0() {
        VelocityTracker velocityTracker = this.a0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.d);
        return this.a0.getYVelocity(this.b0);
    }

    public final boolean n0() {
        if (this.M == 3) {
            return this.y || k0() == 0;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f2, float f3) {
        WeakReference weakReference;
        return s0() && (weakReference = this.Y) != null && view2 == weakReference.get() && (this.M != 3 || super.o(coordinatorLayout, view, view2, f2, f3));
    }

    public boolean o0() {
        return this.o;
    }

    public boolean p0() {
        return this.J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.Y;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!s0() || view2 == view3) {
            int top = view.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < k0()) {
                    int iK0 = top - k0();
                    iArr[1] = iK0;
                    AbstractC2317Td1.a0(view, -iK0);
                    L0(3);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i2;
                    AbstractC2317Td1.a0(view, -i2);
                    L0(1);
                }
            } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
                if (i4 > this.H && !c0()) {
                    int i5 = top - this.H;
                    iArr[1] = i5;
                    AbstractC2317Td1.a0(view, -i5);
                    L0(4);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i2;
                    AbstractC2317Td1.a0(view, -i2);
                    L0(1);
                }
            }
            h0(view.getTop());
            this.Q = i2;
            this.R = true;
        }
    }

    public boolean q0() {
        return true;
    }

    public final boolean r0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && AbstractC2317Td1.T(view);
    }

    public boolean s0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public final void t0(View view, Z1.a aVar, int i) {
        AbstractC2317Td1.l0(view, aVar, null, e0(i));
    }

    public final void u0() {
        this.b0 = -1;
        VelocityTracker velocityTracker = this.a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.a0 = null;
        }
    }

    public final void v0(SavedState savedState) {
        int i = this.a;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.f = savedState.E;
        }
        if (i == -1 || (i & 2) == 2) {
            this.b = savedState.F;
        }
        if (i == -1 || (i & 4) == 4) {
            this.J = savedState.G;
        }
        if (i == -1 || (i & 8) == 8) {
            this.K = savedState.H;
        }
    }

    public final void w0(View view, Runnable runnable) {
        if (r0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.x(coordinatorLayout, view, savedState.a());
        v0(savedState);
        int i = savedState.D;
        if (i == 1 || i == 2) {
            this.M = 4;
            this.N = 4;
        } else {
            this.M = i;
            this.N = i;
        }
    }

    public void x0(boolean z) {
        this.L = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.y(coordinatorLayout, view), this);
    }

    public void y0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.D = i;
        V0(this.M, true);
    }

    public void z0(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (this.W != null) {
            Y();
        }
        L0((this.b && this.M == 6) ? 3 : this.M);
        V0(this.M, true);
        T0();
    }

    public class f {
        public int a;
        public boolean b;
        public final Runnable c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.b = false;
                C3487be1 c3487be1 = BottomSheetBehavior.this.O;
                if (c3487be1 != null && c3487be1.m(true)) {
                    f fVar = f.this;
                    fVar.c(fVar.a);
                    return;
                }
                f fVar2 = f.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.M == 2) {
                    bottomSheetBehavior.L0(fVar2.a);
                }
            }
        }

        public f() {
            this.c = new a();
        }

        public void c(int i) {
            WeakReference weakReference = BottomSheetBehavior.this.W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.a = i;
            if (this.b) {
                return;
            }
            AbstractC2317Td1.h0((View) BottomSheetBehavior.this.W.get(), this.c);
            this.b = true;
        }

        public /* synthetic */ f(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int D;
        public int E;
        public boolean F;
        public boolean G;
        public boolean H;

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
            this.E = parcel.readInt();
            this.F = parcel.readInt() == 1;
            this.G = parcel.readInt() == 1;
            this.H = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.D);
            parcel.writeInt(this.E);
            parcel.writeInt(this.F ? 1 : 0);
            parcel.writeInt(this.G ? 1 : 0);
            parcel.writeInt(this.H ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.D = bottomSheetBehavior.M;
            this.E = bottomSheetBehavior.f;
            this.F = bottomSheetBehavior.b;
            this.G = bottomSheetBehavior.J;
            this.H = bottomSheetBehavior.K;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.a = 0;
        this.b = true;
        this.c = false;
        this.l = -1;
        this.m = -1;
        this.B = new f(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.S = 0.1f;
        this.Z = new ArrayList();
        this.f0 = new SparseIntArray();
        this.g0 = new d();
        this.i = context.getResources().getDimensionPixelSize(YC0.O);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, WD0.x);
        if (typedArrayObtainStyledAttributes.hasValue(WD0.B)) {
            this.k = AbstractC4336eh0.a(context, typedArrayObtainStyledAttributes, WD0.B);
        }
        if (typedArrayObtainStyledAttributes.hasValue(WD0.T)) {
            this.z = C5671jR0.e(context, attributeSet, JC0.b, h0).m();
        }
        f0(context);
        g0();
        this.I = typedArrayObtainStyledAttributes.getDimension(WD0.A, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(WD0.y)) {
            E0(typedArrayObtainStyledAttributes.getDimensionPixelSize(WD0.y, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(WD0.z)) {
            D0(typedArrayObtainStyledAttributes.getDimensionPixelSize(WD0.z, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(WD0.H);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            F0(i);
        } else {
            F0(typedArrayObtainStyledAttributes.getDimensionPixelSize(WD0.H, -1));
        }
        C0(typedArrayObtainStyledAttributes.getBoolean(WD0.G, false));
        A0(typedArrayObtainStyledAttributes.getBoolean(WD0.L, false));
        z0(typedArrayObtainStyledAttributes.getBoolean(WD0.E, true));
        J0(typedArrayObtainStyledAttributes.getBoolean(WD0.K, false));
        x0(typedArrayObtainStyledAttributes.getBoolean(WD0.C, true));
        H0(typedArrayObtainStyledAttributes.getInt(WD0.I, 0));
        B0(typedArrayObtainStyledAttributes.getFloat(WD0.F, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(WD0.D);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            y0(typedValuePeekValue2.data);
        } else {
            y0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(WD0.D, 0));
        }
        I0(typedArrayObtainStyledAttributes.getInt(WD0.J, 500));
        this.p = typedArrayObtainStyledAttributes.getBoolean(WD0.P, false);
        this.q = typedArrayObtainStyledAttributes.getBoolean(WD0.Q, false);
        this.r = typedArrayObtainStyledAttributes.getBoolean(WD0.R, false);
        this.s = typedArrayObtainStyledAttributes.getBoolean(WD0.S, true);
        this.t = typedArrayObtainStyledAttributes.getBoolean(WD0.M, false);
        this.u = typedArrayObtainStyledAttributes.getBoolean(WD0.N, false);
        this.v = typedArrayObtainStyledAttributes.getBoolean(WD0.O, false);
        this.y = typedArrayObtainStyledAttributes.getBoolean(WD0.U, true);
        typedArrayObtainStyledAttributes.recycle();
        this.d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
