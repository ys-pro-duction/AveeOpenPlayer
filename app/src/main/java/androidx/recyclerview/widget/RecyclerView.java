package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.p;
import com.daaw.AbstractC0917Fx0;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC3208ae1;
import com.daaw.AbstractC4213eE0;
import com.daaw.AbstractC5836k1;
import com.daaw.AbstractC6189lF;
import com.daaw.AbstractC6314li0;
import com.daaw.AbstractC8560tl0;
import com.daaw.AbstractC8621ty0;
import com.daaw.C5554j1;
import com.daaw.C8570tn0;
import com.daaw.GC0;
import com.daaw.S41;
import com.daaw.VC0;
import com.daaw.Z1;
import com.google.android.gms.ads.AdRequest;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static boolean c1 = false;
    public static boolean d1 = false;
    public static final int[] e1 = {R.attr.nestedScrollingEnabled};
    public static final float f1 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean g1;
    public static final boolean h1;
    public static final boolean i1;
    public static final boolean j1;
    public static final boolean k1;
    public static final boolean l1;
    public static final Class[] m1;
    public static final Interpolator n1;
    public static final A o1;
    public r A0;
    public final float B;
    public final int B0;
    public final x C;
    public final int C0;
    public final v D;
    public float D0;
    public SavedState E;
    public float E0;
    public a F;
    public boolean F0;
    public b G;
    public final C G0;
    public final androidx.recyclerview.widget.p H;
    public androidx.recyclerview.widget.e H0;
    public boolean I;
    public e.b I0;
    public final Runnable J;
    public final z J0;
    public final Rect K;
    public t K0;
    public final Rect L;
    public List L0;
    public final RectF M;
    public boolean M0;
    public h N;
    public boolean N0;
    public p O;
    public m.a O0;
    public final List P;
    public boolean P0;
    public final ArrayList Q;
    public androidx.recyclerview.widget.k Q0;
    public final ArrayList R;
    public final int[] R0;
    public s S;
    public C8570tn0 S0;
    public boolean T;
    public final int[] T0;
    public boolean U;
    public final int[] U0;
    public boolean V;
    public final int[] V0;
    public boolean W;
    public final List W0;
    public Runnable X0;
    public boolean Y0;
    public int Z0;
    public int a0;
    public int a1;
    public boolean b0;
    public final p.b b1;
    public boolean c0;
    public boolean d0;
    public int e0;
    public boolean f0;
    public final AccessibilityManager g0;
    public List h0;
    public boolean i0;
    public boolean j0;
    public int k0;
    public int l0;
    public l m0;
    public EdgeEffect n0;
    public EdgeEffect o0;
    public EdgeEffect p0;
    public EdgeEffect q0;
    public m r0;
    public int s0;
    public int t0;
    public VelocityTracker u0;
    public int v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public static class A extends l {
        @Override // androidx.recyclerview.widget.RecyclerView.l
        public EdgeEffect a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class B {
    }

    public class C implements Runnable {
        public int B;
        public int C;
        public OverScroller D;
        public Interpolator E;
        public boolean F;
        public boolean G;

        public C() {
            Interpolator interpolator = RecyclerView.n1;
            this.E = interpolator;
            this.F = false;
            this.G = false;
            this.D = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final int a(int i, int i2) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        public void b(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.C = 0;
            this.B = 0;
            Interpolator interpolator = this.E;
            Interpolator interpolator2 = RecyclerView.n1;
            if (interpolator != interpolator2) {
                this.E = interpolator2;
                this.D = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.D.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        public final void c() {
            RecyclerView.this.removeCallbacks(this);
            AbstractC2317Td1.h0(RecyclerView.this, this);
        }

        public void d() {
            if (this.F) {
                this.G = true;
            } else {
                c();
            }
        }

        public void e(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = a(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.n1;
            }
            if (this.E != interpolator) {
                this.E = interpolator;
                this.D = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.C = 0;
            this.B = 0;
            RecyclerView.this.setScrollState(2);
            this.D.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.D.computeScrollOffset();
            }
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.D.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.O == null) {
                f();
                return;
            }
            this.G = false;
            this.F = true;
            recyclerView.z();
            OverScroller overScroller = this.D;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.B;
                int i4 = currY - this.C;
                this.B = currX;
                this.C = currY;
                int iW = RecyclerView.this.w(i3);
                int iY = RecyclerView.this.y(i4);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.V0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.K(iW, iY, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.V0;
                    iW -= iArr2[0];
                    iY -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.v(iW, iY);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.N != null) {
                    int[] iArr3 = recyclerView3.V0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.r1(iW, iY, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.V0;
                    int i5 = iArr4[0];
                    int i6 = iArr4[1];
                    iW -= i5;
                    iY -= i6;
                    y yVar = recyclerView4.O.g;
                    if (yVar != null && !yVar.g() && yVar.h()) {
                        int iB = RecyclerView.this.J0.b();
                        if (iB == 0) {
                            yVar.r();
                        } else if (yVar.f() >= iB) {
                            yVar.p(iB - 1);
                            yVar.j(i5, i6);
                        } else {
                            yVar.j(i5, i6);
                        }
                    }
                    i2 = i6;
                    i = i5;
                } else {
                    i = 0;
                    i2 = 0;
                }
                int i7 = iW;
                int i8 = iY;
                if (!RecyclerView.this.Q.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.V0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.L(i, i2, i7, i8, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.V0;
                int i9 = i7 - iArr6[0];
                int i10 = i8 - iArr6[1];
                if (i != 0 || i2 != 0) {
                    recyclerView6.N(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i9 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i10 != 0));
                y yVar2 = RecyclerView.this.O.g;
                if ((yVar2 == null || !yVar2.g()) && z) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i11 = i9 < 0 ? -currVelocity : i9 > 0 ? currVelocity : 0;
                        if (i10 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i10 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i11, currVelocity);
                    }
                    if (RecyclerView.j1) {
                        RecyclerView.this.I0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView7.H0;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i, i2);
                    }
                }
            }
            y yVar3 = RecyclerView.this.O.g;
            if (yVar3 != null && yVar3.g()) {
                yVar3.j(0, 0);
            }
            this.F = false;
            if (this.G) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.G1(1);
            }
        }
    }

    public static abstract class D {
        public static final List t = Collections.EMPTY_LIST;
        public final View a;
        public WeakReference b;
        public int j;
        public RecyclerView r;
        public h s;
        public int c = -1;
        public int d = -1;
        public long e = -1;
        public int f = -1;
        public int g = -1;
        public D h = null;
        public D i = null;
        public List k = null;
        public List l = null;
        public int m = 0;
        public v n = null;
        public boolean o = false;
        public int p = 0;
        public int q = -1;

        public D(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.a = view;
        }

        public boolean A() {
            return this.n != null;
        }

        public boolean B() {
            return (this.j & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        }

        public boolean C() {
            return (this.j & 2) != 0;
        }

        public boolean D() {
            return (this.j & 2) != 0;
        }

        public void E(int i, boolean z) {
            if (this.d == -1) {
                this.d = this.c;
            }
            if (this.g == -1) {
                this.g = this.c;
            }
            if (z) {
                this.g += i;
            }
            this.c += i;
            if (this.a.getLayoutParams() != null) {
                ((q) this.a.getLayoutParams()).c = true;
            }
        }

        public void F(RecyclerView recyclerView) {
            int i = this.q;
            if (i != -1) {
                this.p = i;
            } else {
                this.p = AbstractC2317Td1.B(this.a);
            }
            recyclerView.u1(this, 4);
        }

        public void G(RecyclerView recyclerView) {
            recyclerView.u1(this, this.p);
            this.p = 0;
        }

        public void H() {
            if (RecyclerView.c1 && B()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.j = 0;
            this.c = -1;
            this.d = -1;
            this.e = -1L;
            this.g = -1;
            this.m = 0;
            this.h = null;
            this.i = null;
            f();
            this.p = 0;
            this.q = -1;
            RecyclerView.t(this);
        }

        public void I() {
            if (this.d == -1) {
                this.d = this.c;
            }
        }

        public void J(int i, int i2) {
            this.j = (i & i2) | (this.j & (~i2));
        }

        public final void K(boolean z) {
            int i = this.m;
            int i2 = z ? i - 1 : i + 1;
            this.m = i2;
            if (i2 < 0) {
                this.m = 0;
                if (RecyclerView.c1) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                toString();
            } else if (!z && i2 == 1) {
                this.j |= 16;
            } else if (z && i2 == 0) {
                this.j &= -17;
            }
            if (RecyclerView.d1) {
                toString();
            }
        }

        public void L(v vVar, boolean z) {
            this.n = vVar;
            this.o = z;
        }

        public boolean M() {
            return (this.j & 16) != 0;
        }

        public boolean N() {
            return (this.j & 128) != 0;
        }

        public void O() {
            this.n.O(this);
        }

        public boolean P() {
            return (this.j & 32) != 0;
        }

        public void c(Object obj) {
            if (obj == null) {
                d(1024);
            } else if ((1024 & this.j) == 0) {
                i();
                this.k.add(obj);
            }
        }

        public void d(int i) {
            this.j = i | this.j;
        }

        public void e() {
            this.d = -1;
            this.g = -1;
        }

        public void f() {
            List list = this.k;
            if (list != null) {
                list.clear();
            }
            this.j &= -1025;
        }

        public void g() {
            this.j &= -33;
        }

        public void h() {
            this.j &= -257;
        }

        public final void i() {
            if (this.k == null) {
                ArrayList arrayList = new ArrayList();
                this.k = arrayList;
                this.l = DesugarCollections.unmodifiableList(arrayList);
            }
        }

        public boolean j() {
            return (this.j & 16) == 0 && AbstractC2317Td1.R(this.a);
        }

        public void k(int i, int i2, boolean z) {
            d(8);
            E(i2, z);
            this.c = i;
        }

        public final int l() {
            RecyclerView recyclerView = this.r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.g0(this);
        }

        public final int m() {
            return n();
        }

        public final int n() {
            RecyclerView recyclerView;
            h adapter;
            int iG0;
            if (this.s == null || (recyclerView = this.r) == null || (adapter = recyclerView.getAdapter()) == null || (iG0 = this.r.g0(this)) == -1) {
                return -1;
            }
            return adapter.e(this.s, this, iG0);
        }

        public final long o() {
            return this.e;
        }

        public final int p() {
            return this.f;
        }

        public final int q() {
            int i = this.g;
            return i == -1 ? this.c : i;
        }

        public final int r() {
            return this.d;
        }

        public List s() {
            if ((this.j & 1024) != 0) {
                return t;
            }
            List list = this.k;
            return (list == null || list.size() == 0) ? t : this.l;
        }

        public boolean t(int i) {
            return (i & this.j) != 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
            if (A()) {
                sb.append(" scrap ");
                sb.append(this.o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (x()) {
                sb.append(" invalid");
            }
            if (!w()) {
                sb.append(" unbound");
            }
            if (D()) {
                sb.append(" update");
            }
            if (z()) {
                sb.append(" removed");
            }
            if (N()) {
                sb.append(" ignored");
            }
            if (B()) {
                sb.append(" tmpDetached");
            }
            if (!y()) {
                sb.append(" not recyclable(" + this.m + ")");
            }
            if (u()) {
                sb.append(" undefined adapter position");
            }
            if (this.a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public boolean u() {
            return (this.j & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 || x();
        }

        public boolean v() {
            return (this.a.getParent() == null || this.a.getParent() == this.r) ? false : true;
        }

        public boolean w() {
            return (this.j & 1) != 0;
        }

        public boolean x() {
            return (this.j & 4) != 0;
        }

        public final boolean y() {
            return (this.j & 16) == 0 && !AbstractC2317Td1.R(this.a);
        }

        public boolean z() {
            return (this.j & 8) != 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    public class RunnableC0291a implements Runnable {
        public RunnableC0291a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.W || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.T) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.c0) {
                recyclerView2.b0 = true;
            } else {
                recyclerView2.z();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    public class RunnableC0292b implements Runnable {
        public RunnableC0292b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.r0;
            if (mVar != null) {
                mVar.u();
            }
            RecyclerView.this.P0 = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    public class InterpolatorC0293c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$d, reason: case insensitive filesystem */
    public class C0294d implements p.b {
        public C0294d() {
        }

        @Override // androidx.recyclerview.widget.p.b
        public void a(D d) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.O.p1(d.a, recyclerView.D);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void b(D d, m.b bVar, m.b bVar2) {
            RecyclerView.this.n(d, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void c(D d, m.b bVar, m.b bVar2) {
            RecyclerView.this.D.O(d);
            RecyclerView.this.p(d, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void d(D d, m.b bVar, m.b bVar2) {
            d.K(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.i0) {
                if (recyclerView.r0.b(d, d, bVar, bVar2)) {
                    RecyclerView.this.V0();
                }
            } else if (recyclerView.r0.d(d, bVar, bVar2)) {
                RecyclerView.this.V0();
            }
        }
    }

    public class e implements b.InterfaceC0027b {
        public e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0027b
        public View a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0027b
        public void b(View view) {
            D dM0 = RecyclerView.m0(view);
            if (dM0 != null) {
                dM0.F(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0027b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0027b
        public void d() {
            int iC = c();
            for (int i = 0; i < iC; i++) {
                View viewA = a(i);
                RecyclerView.this.E(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0027b
        public int e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0027b
        public D f(View view) {
            return RecyclerView.m0(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0027b
        public void g(int i) {
            View viewA = a(i);
            if (viewA != null) {
                D dM0 = RecyclerView.m0(viewA);
                if (dM0 != null) {
                    if (dM0.B() && !dM0.N()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + dM0 + RecyclerView.this.U());
                    }
                    if (RecyclerView.d1) {
                        dM0.toString();
                    }
                    dM0.d(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                }
            } else if (RecyclerView.c1) {
                throw new IllegalArgumentException("No view at offset " + i + RecyclerView.this.U());
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0027b
        public void h(View view) {
            D dM0 = RecyclerView.m0(view);
            if (dM0 != null) {
                dM0.G(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0027b
        public void i(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.D(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0027b
        public void j(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.E(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0027b
        public void k(View view, int i, ViewGroup.LayoutParams layoutParams) {
            D dM0 = RecyclerView.m0(view);
            if (dM0 != null) {
                if (!dM0.B() && !dM0.N()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + dM0 + RecyclerView.this.U());
                }
                if (RecyclerView.d1) {
                    dM0.toString();
                }
                dM0.h();
            } else if (RecyclerView.c1) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i + RecyclerView.this.U());
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }
    }

    public class f implements a.InterfaceC0026a {
        public f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0026a
        public void a(int i, int i2) {
            RecyclerView.this.L0(i, i2);
            RecyclerView.this.M0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0026a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0026a
        public void c(int i, int i2, Object obj) {
            RecyclerView.this.J1(i, i2, obj);
            RecyclerView.this.N0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0026a
        public void d(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0026a
        public D e(int i) {
            D dE0 = RecyclerView.this.e0(i, true);
            if (dE0 == null) {
                return null;
            }
            if (!RecyclerView.this.G.n(dE0.a)) {
                return dE0;
            }
            boolean z = RecyclerView.c1;
            return null;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0026a
        public void f(int i, int i2) {
            RecyclerView.this.M0(i, i2, false);
            RecyclerView.this.M0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0026a
        public void g(int i, int i2) {
            RecyclerView.this.K0(i, i2);
            RecyclerView.this.M0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0026a
        public void h(int i, int i2) {
            RecyclerView.this.M0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.M0 = true;
            recyclerView.J0.d += i2;
        }

        public void i(a.b bVar) {
            int i = bVar.a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.O.U0(recyclerView, bVar.b, bVar.d);
                return;
            }
            if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.O.X0(recyclerView2, bVar.b, bVar.d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.O.Z0(recyclerView3, bVar.b, bVar.d, bVar.c);
            } else {
                if (i != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.O.W0(recyclerView4, bVar.b, bVar.d, 1);
            }
        }
    }

    public static /* synthetic */ class g {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h.a.values().length];
            a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class h {
        public final i a = new i();
        public boolean b = false;
        public a c = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void b(D d, int i) {
            boolean z = d.s == null;
            if (z) {
                d.c = i;
                if (j()) {
                    d.e = g(i);
                }
                d.J(1, 519);
                S41.a("RV OnBindView");
            }
            d.s = this;
            if (RecyclerView.c1) {
                if (d.a.getParent() == null && AbstractC2317Td1.T(d.a) != d.B()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + d.B() + ", attached to window: " + AbstractC2317Td1.T(d.a) + ", holder: " + d);
                }
                if (d.a.getParent() == null && AbstractC2317Td1.T(d.a)) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + d);
                }
            }
            p(d, i, d.s());
            if (z) {
                d.f();
                ViewGroup.LayoutParams layoutParams = d.a.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).c = true;
                }
                S41.b();
            }
        }

        public boolean c() {
            int i = g.a[this.c.ordinal()];
            return i != 1 && (i != 2 || f() > 0);
        }

        public final D d(ViewGroup viewGroup, int i) {
            try {
                S41.a("RV CreateView");
                D dQ = q(viewGroup, i);
                if (dQ.a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                dQ.f = i;
                return dQ;
            } finally {
                S41.b();
            }
        }

        public int e(h hVar, D d, int i) {
            if (hVar == this) {
                return i;
            }
            return -1;
        }

        public abstract int f();

        public long g(int i) {
            return -1L;
        }

        public int h(int i) {
            return 0;
        }

        public final boolean i() {
            return this.a.a();
        }

        public final boolean j() {
            return this.b;
        }

        public final void k() {
            this.a.b();
        }

        public final void l(int i) {
            this.a.c(i, 1);
        }

        public final void m(int i, int i2) {
            this.a.c(i, i2);
        }

        public void n(RecyclerView recyclerView) {
        }

        public abstract void o(D d, int i);

        public void p(D d, int i, List list) {
            o(d, i);
        }

        public abstract D q(ViewGroup viewGroup, int i);

        public void r(RecyclerView recyclerView) {
        }

        public boolean s(D d) {
            return false;
        }

        public void t(D d) {
        }

        public void u(D d) {
        }

        public void v(D d) {
        }

        public void w(j jVar) {
            this.a.registerObserver(jVar);
        }

        public void x(boolean z) {
            if (i()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.b = z;
        }

        public void y(j jVar) {
            this.a.unregisterObserver(jVar);
        }
    }

    public static class i extends Observable {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i, int i2) {
            d(i, i2, null);
        }

        public void d(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i, i2, obj);
            }
        }
    }

    public static abstract class j {
        public abstract void a();

        public void b(int i, int i2) {
        }

        public void c(int i, int i2, Object obj) {
            b(i, i2);
        }
    }

    public interface k {
    }

    public static class l {
        public abstract EdgeEffect a(RecyclerView recyclerView, int i);
    }

    public static abstract class m {
        public a a = null;
        public ArrayList b = new ArrayList();
        public long c = 120;
        public long d = 120;
        public long e = 250;
        public long f = 250;

        public interface a {
            void a(D d);
        }

        public static class b {
            public int a;
            public int b;
            public int c;
            public int d;

            public b a(D d) {
                return b(d, 0);
            }

            public b b(D d, int i) {
                View view = d.a;
                this.a = view.getLeft();
                this.b = view.getTop();
                this.c = view.getRight();
                this.d = view.getBottom();
                return this;
            }
        }

        public static int e(D d) {
            int i = d.j;
            int i2 = i & 14;
            if (d.x()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int iR = d.r();
                int iL = d.l();
                if (iR != -1 && iL != -1 && iR != iL) {
                    return i2 | 2048;
                }
            }
            return i2;
        }

        public abstract boolean a(D d, b bVar, b bVar2);

        public abstract boolean b(D d, D d2, b bVar, b bVar2);

        public abstract boolean c(D d, b bVar, b bVar2);

        public abstract boolean d(D d, b bVar, b bVar2);

        public abstract boolean f(D d);

        public boolean g(D d, List list) {
            return f(d);
        }

        public final void h(D d) {
            r(d);
            a aVar = this.a;
            if (aVar != null) {
                aVar.a(d);
            }
        }

        public final void i() {
            if (this.b.size() <= 0) {
                this.b.clear();
            } else {
                AbstractC6314li0.a(this.b.get(0));
                throw null;
            }
        }

        public abstract void j(D d);

        public abstract void k();

        public long l() {
            return this.c;
        }

        public long m() {
            return this.f;
        }

        public long n() {
            return this.e;
        }

        public long o() {
            return this.d;
        }

        public abstract boolean p();

        public b q() {
            return new b();
        }

        public void r(D d) {
        }

        public b s(z zVar, D d) {
            return q().a(d);
        }

        public b t(z zVar, D d, int i, List list) {
            return q().a(d);
        }

        public abstract void u();

        public void v(a aVar) {
            this.a = aVar;
        }
    }

    public class n implements m.a {
        public n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.a
        public void a(D d) {
            d.K(true);
            if (d.h != null && d.i == null) {
                d.h = null;
            }
            d.i = null;
            if (d.M() || RecyclerView.this.g1(d.a) || !d.B()) {
                return;
            }
            RecyclerView.this.removeDetachedView(d.a, false);
        }
    }

    public static abstract class o {
        public void d(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, z zVar) {
            d(rect, ((q) view.getLayoutParams()).a(), recyclerView);
        }

        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, z zVar) {
            f(canvas, recyclerView);
        }

        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, z zVar) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class r {
        public abstract boolean a(int i, int i2);
    }

    public interface s {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z);
    }

    public static abstract class t {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static class u {
        public SparseArray a = new SparseArray();
        public int b = 0;
        public Set c = Collections.newSetFromMap(new IdentityHashMap());

        public static class a {
            public final ArrayList a = new ArrayList();
            public int b = 5;
            public long c = 0;
            public long d = 0;
        }

        public void a() {
            this.b++;
        }

        public void b(h hVar) {
            this.c.add(hVar);
        }

        public void c() {
            for (int i = 0; i < this.a.size(); i++) {
                a aVar = (a) this.a.valueAt(i);
                Iterator it = aVar.a.iterator();
                while (it.hasNext()) {
                    AbstractC0917Fx0.b(((D) it.next()).a);
                }
                aVar.a.clear();
            }
        }

        public void d() {
            this.b--;
        }

        public void e(h hVar, boolean z) {
            this.c.remove(hVar);
            if (this.c.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < this.a.size(); i++) {
                SparseArray sparseArray = this.a;
                ArrayList arrayList = ((a) sparseArray.get(sparseArray.keyAt(i))).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    AbstractC0917Fx0.b(((D) arrayList.get(i2)).a);
                }
            }
        }

        public void f(int i, long j) {
            a aVarI = i(i);
            aVarI.d = l(aVarI.d, j);
        }

        public void g(int i, long j) {
            a aVarI = i(i);
            aVarI.c = l(aVarI.c, j);
        }

        public D h(int i) {
            a aVar = (a) this.a.get(i);
            if (aVar == null || aVar.a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((D) arrayList.get(size)).v()) {
                    return (D) arrayList.remove(size);
                }
            }
            return null;
        }

        public final a i(int i) {
            a aVar = (a) this.a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.a.put(i, aVar2);
            return aVar2;
        }

        public void j(h hVar, h hVar2, boolean z) {
            if (hVar != null) {
                d();
            }
            if (!z && this.b == 0) {
                c();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void k(D d) {
            int iP = d.p();
            ArrayList arrayList = i(iP).a;
            if (((a) this.a.get(iP)).b <= arrayList.size()) {
                AbstractC0917Fx0.b(d.a);
            } else {
                if (RecyclerView.c1 && arrayList.contains(d)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                d.H();
                arrayList.add(d);
            }
        }

        public long l(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        public boolean m(int i, long j, long j2) {
            long j3 = i(i).d;
            return j3 == 0 || j + j3 < j2;
        }

        public boolean n(int i, long j, long j2) {
            long j3 = i(i).c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    public final class v {
        public final ArrayList a;
        public ArrayList b;
        public final ArrayList c;
        public final List d;
        public int e;
        public int f;
        public u g;

        public v() {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            this.b = null;
            this.c = new ArrayList();
            this.d = DesugarCollections.unmodifiableList(arrayList);
            this.e = 2;
            this.f = 2;
        }

        public void A() {
            for (int i = 0; i < this.c.size(); i++) {
                AbstractC0917Fx0.b(((D) this.c.get(i)).a);
            }
            B(RecyclerView.this.N);
        }

        public final void B(h hVar) {
            C(hVar, false);
        }

        public final void C(h hVar, boolean z) {
            u uVar = this.g;
            if (uVar != null) {
                uVar.e(hVar, z);
            }
        }

        public void D(View view) {
            D dM0 = RecyclerView.m0(view);
            dM0.n = null;
            dM0.o = false;
            dM0.g();
            H(dM0);
        }

        public void E() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                F(size);
            }
            this.c.clear();
            if (RecyclerView.j1) {
                RecyclerView.this.I0.b();
            }
        }

        public void F(int i) {
            boolean z = RecyclerView.c1;
            D d = (D) this.c.get(i);
            if (RecyclerView.d1) {
                Objects.toString(d);
            }
            a(d, true);
            this.c.remove(i);
        }

        public void G(View view) {
            D dM0 = RecyclerView.m0(view);
            if (dM0.B()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (dM0.A()) {
                dM0.O();
            } else if (dM0.P()) {
                dM0.g();
            }
            H(dM0);
            if (RecyclerView.this.r0 == null || dM0.y()) {
                return;
            }
            RecyclerView.this.r0.j(dM0);
        }

        public void H(D d) {
            boolean z;
            boolean z2 = true;
            if (d.A() || d.a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d.A());
                sb.append(" isAttached:");
                sb.append(d.a.getParent() != null);
                sb.append(RecyclerView.this.U());
                throw new IllegalArgumentException(sb.toString());
            }
            if (d.B()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d + RecyclerView.this.U());
            }
            if (d.N()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.U());
            }
            boolean zJ = d.j();
            h hVar = RecyclerView.this.N;
            boolean z3 = hVar != null && zJ && hVar.s(d);
            if (RecyclerView.c1 && this.c.contains(d)) {
                throw new IllegalArgumentException("cached view received recycle internal? " + d + RecyclerView.this.U());
            }
            if (z3 || d.y()) {
                if (this.f <= 0 || d.t(526)) {
                    z = false;
                } else {
                    int size = this.c.size();
                    if (size >= this.f && size > 0) {
                        F(0);
                        size--;
                    }
                    if (RecyclerView.j1 && size > 0 && !RecyclerView.this.I0.d(d.c)) {
                        int i = size - 1;
                        while (i >= 0) {
                            if (!RecyclerView.this.I0.d(((D) this.c.get(i)).c)) {
                                break;
                            } else {
                                i--;
                            }
                        }
                        size = i + 1;
                    }
                    this.c.add(size, d);
                    z = true;
                }
                if (!z) {
                    a(d, true);
                    z = z;
                    RecyclerView.this.H.q(d);
                    if (z && !z2 && zJ) {
                        AbstractC0917Fx0.b(d.a);
                        d.s = null;
                        d.r = null;
                        return;
                    }
                    return;
                }
                z = z;
            } else if (RecyclerView.d1) {
                RecyclerView.this.U();
            }
            z2 = false;
            RecyclerView.this.H.q(d);
            if (z) {
            }
        }

        public void I(View view) {
            D dM0 = RecyclerView.m0(view);
            if (!dM0.t(12) && dM0.C() && !RecyclerView.this.r(dM0)) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                dM0.L(this, true);
                this.b.add(dM0);
                return;
            }
            if (!dM0.x() || dM0.z() || RecyclerView.this.N.j()) {
                dM0.L(this, false);
                this.a.add(dM0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.U());
            }
        }

        public void J(u uVar) {
            B(RecyclerView.this.N);
            u uVar2 = this.g;
            if (uVar2 != null) {
                uVar2.d();
            }
            this.g = uVar;
            if (uVar != null && RecyclerView.this.getAdapter() != null) {
                this.g.a();
            }
            u();
        }

        public void K(B b) {
        }

        public void L(int i) {
            this.e = i;
            P();
        }

        public final boolean M(D d, int i, int i2, long j) {
            d.s = null;
            d.r = RecyclerView.this;
            int iP = d.p();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z = false;
            if (j != Long.MAX_VALUE && !this.g.m(iP, nanoTime, j)) {
                return false;
            }
            if (d.B()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(d.a, recyclerView.getChildCount(), d.a.getLayoutParams());
                z = true;
            }
            RecyclerView.this.N.b(d, i);
            if (z) {
                RecyclerView.this.detachViewFromParent(d.a);
            }
            this.g.f(d.p(), RecyclerView.this.getNanoTime() - nanoTime);
            b(d);
            if (RecyclerView.this.J0.e()) {
                d.g = i2;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x01fd  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01d0  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01de  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01fa A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.RecyclerView.D N(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instruction units count: 569
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.N(int, boolean, long):androidx.recyclerview.widget.RecyclerView$D");
        }

        public void O(D d) {
            if (d.o) {
                this.b.remove(d);
            } else {
                this.a.remove(d);
            }
            d.n = null;
            d.o = false;
            d.g();
        }

        public void P() {
            p pVar = RecyclerView.this.O;
            this.f = this.e + (pVar != null ? pVar.m : 0);
            for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f; size--) {
                F(size);
            }
        }

        public boolean Q(D d) {
            if (d.z()) {
                if (!RecyclerView.c1 || RecyclerView.this.J0.e()) {
                    return RecyclerView.this.J0.e();
                }
                throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.U());
            }
            int i = d.c;
            if (i >= 0 && i < RecyclerView.this.N.f()) {
                if (RecyclerView.this.J0.e() || RecyclerView.this.N.h(d.c) == d.p()) {
                    return !RecyclerView.this.N.j() || d.o() == RecyclerView.this.N.g(d.c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d + RecyclerView.this.U());
        }

        public void R(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                D d = (D) this.c.get(size);
                if (d != null && (i3 = d.c) >= i && i3 < i4) {
                    d.d(2);
                    F(size);
                }
            }
        }

        public void a(D d, boolean z) {
            RecyclerView.t(d);
            View view = d.a;
            androidx.recyclerview.widget.k kVar = RecyclerView.this.Q0;
            if (kVar != null) {
                C5554j1 c5554j1N = kVar.n();
                AbstractC2317Td1.p0(view, c5554j1N instanceof k.a ? ((k.a) c5554j1N).n(view) : null);
            }
            if (z) {
                g(d);
            }
            d.s = null;
            d.r = null;
            i().k(d);
        }

        public final void b(D d) {
            if (RecyclerView.this.B0()) {
                View view = d.a;
                if (AbstractC2317Td1.B(view) == 0) {
                    AbstractC2317Td1.z0(view, 1);
                }
                androidx.recyclerview.widget.k kVar = RecyclerView.this.Q0;
                if (kVar == null) {
                    return;
                }
                C5554j1 c5554j1N = kVar.n();
                if (c5554j1N instanceof k.a) {
                    ((k.a) c5554j1N).o(view);
                }
                AbstractC2317Td1.p0(view, c5554j1N);
            }
        }

        public void c() {
            this.a.clear();
            E();
        }

        public void d() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                ((D) this.c.get(i)).e();
            }
            int size2 = this.a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((D) this.a.get(i2)).e();
            }
            ArrayList arrayList = this.b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((D) this.b.get(i3)).e();
                }
            }
        }

        public void e() {
            this.a.clear();
            ArrayList arrayList = this.b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i) {
            if (i >= 0 && i < RecyclerView.this.J0.b()) {
                return !RecyclerView.this.J0.e() ? i : RecyclerView.this.F.m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.J0.b() + RecyclerView.this.U());
        }

        public void g(D d) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.P.size() > 0) {
                AbstractC6314li0.a(RecyclerView.this.P.get(0));
                throw null;
            }
            h hVar = RecyclerView.this.N;
            if (hVar != null) {
                hVar.v(d);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.J0 != null) {
                recyclerView.H.q(d);
            }
            if (RecyclerView.d1) {
                Objects.toString(d);
            }
        }

        public D h(int i) {
            int size;
            int iM;
            ArrayList arrayList = this.b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    D d = (D) this.b.get(i2);
                    if (!d.P() && d.q() == i) {
                        d.d(32);
                        return d;
                    }
                }
                if (RecyclerView.this.N.j() && (iM = RecyclerView.this.F.m(i)) > 0 && iM < RecyclerView.this.N.f()) {
                    long jG = RecyclerView.this.N.g(iM);
                    for (int i3 = 0; i3 < size; i3++) {
                        D d2 = (D) this.b.get(i3);
                        if (!d2.P() && d2.o() == jG) {
                            d2.d(32);
                            return d2;
                        }
                    }
                }
            }
            return null;
        }

        public u i() {
            if (this.g == null) {
                this.g = new u();
                u();
            }
            return this.g;
        }

        public int j() {
            return this.a.size();
        }

        public List k() {
            return this.d;
        }

        public D l(long j, int i, boolean z) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                D d = (D) this.a.get(size);
                if (d.o() == j && !d.P()) {
                    if (i == d.p()) {
                        d.d(32);
                        if (d.z() && !RecyclerView.this.J0.e()) {
                            d.J(2, 14);
                        }
                        return d;
                    }
                    if (!z) {
                        this.a.remove(size);
                        RecyclerView.this.removeDetachedView(d.a, false);
                        D(d.a);
                    }
                }
            }
            int size2 = this.c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                D d2 = (D) this.c.get(size2);
                if (d2.o() == j && !d2.v()) {
                    if (i == d2.p()) {
                        if (!z) {
                            this.c.remove(size2);
                        }
                        return d2;
                    }
                    if (!z) {
                        F(size2);
                        return null;
                    }
                }
            }
        }

        public D m(int i, boolean z) {
            View viewE;
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                D d = (D) this.a.get(i2);
                if (!d.P() && d.q() == i && !d.x() && (RecyclerView.this.J0.h || !d.z())) {
                    d.d(32);
                    return d;
                }
            }
            if (z || (viewE = RecyclerView.this.G.e(i)) == null) {
                int size2 = this.c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    D d2 = (D) this.c.get(i3);
                    if (!d2.x() && d2.q() == i && !d2.v()) {
                        if (!z) {
                            this.c.remove(i3);
                        }
                        if (RecyclerView.d1) {
                            d2.toString();
                        }
                        return d2;
                    }
                }
                return null;
            }
            D dM0 = RecyclerView.m0(viewE);
            RecyclerView.this.G.s(viewE);
            int iM = RecyclerView.this.G.m(viewE);
            if (iM != -1) {
                RecyclerView.this.G.d(iM);
                I(viewE);
                dM0.d(8224);
                return dM0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + dM0 + RecyclerView.this.U());
        }

        public View n(int i) {
            return ((D) this.a.get(i)).a;
        }

        public View o(int i) {
            return p(i, false);
        }

        public View p(int i, boolean z) {
            return N(i, z, Long.MAX_VALUE).a;
        }

        public final void q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        public final void r(D d) {
            View view = d.a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        public void s() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                q qVar = (q) ((D) this.c.get(i)).a.getLayoutParams();
                if (qVar != null) {
                    qVar.c = true;
                }
            }
        }

        public void t() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                D d = (D) this.c.get(i);
                if (d != null) {
                    d.d(6);
                    d.c(null);
                }
            }
            h hVar = RecyclerView.this.N;
            if (hVar == null || !hVar.j()) {
                E();
            }
        }

        public final void u() {
            if (this.g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.N == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.g.b(RecyclerView.this.N);
            }
        }

        public void v(int i, int i2) {
            int size = this.c.size();
            for (int i3 = 0; i3 < size; i3++) {
                D d = (D) this.c.get(i3);
                if (d != null && d.c >= i) {
                    if (RecyclerView.d1) {
                        d.toString();
                    }
                    d.E(i2, false);
                }
            }
        }

        public void w(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.c.size();
            for (int i7 = 0; i7 < size; i7++) {
                D d = (D) this.c.get(i7);
                if (d != null && (i6 = d.c) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        d.E(i2 - i, false);
                    } else {
                        d.E(i3, false);
                    }
                    if (RecyclerView.d1) {
                        d.toString();
                    }
                }
            }
        }

        public void x(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                D d = (D) this.c.get(size);
                if (d != null) {
                    int i4 = d.c;
                    if (i4 >= i3) {
                        if (RecyclerView.d1) {
                            d.toString();
                        }
                        d.E(-i2, z);
                    } else if (i4 >= i) {
                        d.d(8);
                        F(size);
                    }
                }
            }
        }

        public void y(h hVar, h hVar2, boolean z) {
            c();
            C(hVar, true);
            i().j(hVar, hVar2, z);
            u();
        }

        public void z() {
            u();
        }
    }

    public interface w {
    }

    public class x extends j {
        public x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.q(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.J0.g = true;
            recyclerView.Y0(true);
            if (RecyclerView.this.F.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i, int i2, Object obj) {
            RecyclerView.this.q(null);
            if (RecyclerView.this.F.r(i, i2, obj)) {
                d();
            }
        }

        public void d() {
            if (RecyclerView.i1) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.U && recyclerView.T) {
                    AbstractC2317Td1.h0(recyclerView, recyclerView.J);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f0 = true;
            recyclerView2.requestLayout();
        }
    }

    public static abstract class y {
        public RecyclerView b;
        public p c;
        public boolean d;
        public boolean e;
        public View f;
        public boolean h;
        public int a = -1;
        public final a g = new a(0, 0);

        public static class a {
            public int a;
            public int b;
            public int c;
            public int d;
            public Interpolator e;
            public boolean f;
            public int g;

            public a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            public boolean a() {
                return this.d >= 0;
            }

            public void b(int i) {
                this.d = i;
            }

            public void c(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.E0(i);
                    this.f = false;
                } else {
                    if (!this.f) {
                        this.g = 0;
                        return;
                    }
                    e();
                    recyclerView.G0.e(this.a, this.b, this.c, this.e);
                    this.g++;
                    this.f = false;
                }
            }

            public void d(int i, int i2, int i3, Interpolator interpolator) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
                this.f = true;
            }

            public final void e() {
                if (this.e != null && this.c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public a(int i, int i2, int i3, Interpolator interpolator) {
                this.d = -1;
                this.f = false;
                this.g = 0;
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
            }
        }

        public interface b {
            PointF b(int i);
        }

        public PointF a(int i) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).b(i);
            }
            return null;
        }

        public View b(int i) {
            return this.b.O.D(i);
        }

        public int c() {
            return this.b.O.K();
        }

        public int d(View view) {
            return this.b.j0(view);
        }

        public p e() {
            return this.c;
        }

        public int f() {
            return this.a;
        }

        public boolean g() {
            return this.d;
        }

        public boolean h() {
            return this.e;
        }

        public void i(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public void j(int i, int i2) {
            PointF pointFA;
            RecyclerView recyclerView = this.b;
            if (this.a == -1 || recyclerView == null) {
                r();
            }
            if (this.d && this.f == null && this.c != null && (pointFA = a(this.a)) != null) {
                float f = pointFA.x;
                if (f != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.r1((int) Math.signum(f), (int) Math.signum(pointFA.y), null);
                }
            }
            this.d = false;
            View view = this.f;
            if (view != null) {
                if (d(view) == this.a) {
                    o(this.f, recyclerView.J0, this.g);
                    this.g.c(recyclerView);
                    r();
                } else {
                    this.f = null;
                }
            }
            if (this.e) {
                l(i, i2, recyclerView.J0, this.g);
                boolean zA = this.g.a();
                this.g.c(recyclerView);
                if (zA && this.e) {
                    this.d = true;
                    recyclerView.G0.d();
                }
            }
        }

        public void k(View view) {
            if (d(view) == f()) {
                this.f = view;
                boolean z = RecyclerView.c1;
            }
        }

        public abstract void l(int i, int i2, z zVar, a aVar);

        public abstract void m();

        public abstract void n();

        public abstract void o(View view, z zVar, a aVar);

        public void p(int i) {
            this.a = i;
        }

        public void q(RecyclerView recyclerView, p pVar) {
            recyclerView.G0.f();
            this.b = recyclerView;
            this.c = pVar;
            int i = this.a;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.J0.a = i;
            this.e = true;
            this.d = true;
            this.f = b(f());
            m();
            this.b.G0.d();
            this.h = true;
        }

        public final void r() {
            if (this.e) {
                this.e = false;
                n();
                this.b.J0.a = -1;
                this.f = null;
                this.a = -1;
                this.d = false;
                this.c.i1(this);
                this.c = null;
                this.b = null;
            }
        }
    }

    public static class z {
        public SparseArray b;
        public int m;
        public long n;
        public int o;
        public int p;
        public int q;
        public int a = -1;
        public int c = 0;
        public int d = 0;
        public int e = 1;
        public int f = 0;
        public boolean g = false;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;
        public boolean k = false;
        public boolean l = false;

        public void a(int i) {
            if ((this.e & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.e));
        }

        public int b() {
            return this.h ? this.c - this.d : this.f;
        }

        public int c() {
            return this.a;
        }

        public boolean d() {
            return this.a != -1;
        }

        public boolean e() {
            return this.h;
        }

        public void f(h hVar) {
            this.e = 1;
            this.f = hVar.f();
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public boolean g() {
            return this.l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.a + ", mData=" + this.b + ", mItemCount=" + this.f + ", mIsMeasuring=" + this.j + ", mPreviousLayoutItemCount=" + this.c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.d + ", mStructureChanged=" + this.g + ", mInPreLayout=" + this.h + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        g1 = false;
        h1 = i2 >= 23;
        i1 = true;
        j1 = true;
        k1 = false;
        l1 = false;
        Class cls = Integer.TYPE;
        m1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        n1 = new InterpolatorC0293c();
        o1 = new A();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, GC0.a);
    }

    private boolean E1(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.n0;
        if (edgeEffect == null || AbstractC6189lF.b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z2 = false;
        } else {
            AbstractC6189lF.d(this.n0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z2 = true;
        }
        EdgeEffect edgeEffect2 = this.p0;
        if (edgeEffect2 != null && AbstractC6189lF.b(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            AbstractC6189lF.d(this.p0, 0.0f, motionEvent.getY() / getHeight());
            z2 = true;
        }
        EdgeEffect edgeEffect3 = this.o0;
        if (edgeEffect3 != null && AbstractC6189lF.b(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            AbstractC6189lF.d(this.o0, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        }
        EdgeEffect edgeEffect4 = this.q0;
        if (edgeEffect4 == null || AbstractC6189lF.b(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z2;
        }
        AbstractC6189lF.d(this.q0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public static RecyclerView a0(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView recyclerViewA0 = a0(viewGroup.getChildAt(i2));
            if (recyclerViewA0 != null) {
                return recyclerViewA0;
            }
        }
        return null;
    }

    private int e1(int i2, float f2) {
        float width = f2 / getWidth();
        float height = i2 / getHeight();
        EdgeEffect edgeEffect = this.o0;
        float f3 = 0.0f;
        if (edgeEffect == null || AbstractC6189lF.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.q0;
            if (edgeEffect2 != null && AbstractC6189lF.b(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.q0.onRelease();
                } else {
                    float fD = AbstractC6189lF.d(this.q0, height, 1.0f - width);
                    if (AbstractC6189lF.b(this.q0) == 0.0f) {
                        this.q0.onRelease();
                    }
                    f3 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.o0.onRelease();
            } else {
                float f4 = -AbstractC6189lF.d(this.o0, -height, width);
                if (AbstractC6189lF.b(this.o0) == 0.0f) {
                    this.o0.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getHeight());
    }

    private C8570tn0 getScrollingChildHelper() {
        if (this.S0 == null) {
            this.S0 = new C8570tn0(this);
        }
        return this.S0;
    }

    public static D m0(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).a;
    }

    public static void n0(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private float r0(int i2) {
        double dLog = Math.log((Math.abs(i2) * 0.35f) / (this.B * 0.015f));
        float f2 = f1;
        return (float) (((double) (this.B * 0.015f)) * Math.exp((((double) f2) / (((double) f2) - 1.0d)) * dLog));
    }

    public static void setDebugAssertionsEnabled(boolean z2) {
        c1 = z2;
    }

    public static void setVerboseLoggingEnabled(boolean z2) {
        d1 = z2;
    }

    public static void t(D d) {
        WeakReference weakReference = d.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == d.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            d.b = null;
        }
    }

    public final void A(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strP0 = p0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strP0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                try {
                    constructor = clsAsSubclass.getConstructor(m1);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                } catch (NoSuchMethodException e2) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strP0, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strP0, e4);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strP0, e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strP0, e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strP0, e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strP0, e8);
            }
        }
    }

    public void A0() {
        if (this.Q.size() == 0) {
            return;
        }
        p pVar = this.O;
        if (pVar != null) {
            pVar.h("Cannot invalidate item decorations during a scroll or layout");
        }
        F0();
        requestLayout();
    }

    public void A1(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        p pVar = this.O;
        if (pVar == null || this.c0) {
            return;
        }
        if (!pVar.l()) {
            i2 = 0;
        }
        if (!this.O.m()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (i4 != Integer.MIN_VALUE && i4 <= 0) {
            scrollBy(i2, i3);
            return;
        }
        if (z2) {
            int i5 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i5 |= 2;
            }
            D1(i5, 1);
        }
        this.G0.e(i2, i3, i4, interpolator);
    }

    public void B(int i2, int i3) {
        setMeasuredDimension(p.o(i2, getPaddingLeft() + getPaddingRight(), AbstractC2317Td1.F(this)), p.o(i3, getPaddingTop() + getPaddingBottom(), AbstractC2317Td1.E(this)));
    }

    public boolean B0() {
        AccessibilityManager accessibilityManager = this.g0;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void B1(int i2) {
        p pVar;
        if (this.c0 || (pVar = this.O) == null) {
            return;
        }
        pVar.L1(this, this.J0, i2);
    }

    public final boolean C(int i2, int i3) {
        Z(this.R0);
        int[] iArr = this.R0;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    public boolean C0() {
        return this.k0 > 0;
    }

    public void C1() {
        int i2 = this.a0 + 1;
        this.a0 = i2;
        if (i2 != 1 || this.c0) {
            return;
        }
        this.b0 = false;
    }

    public void D(View view) {
        int size;
        D dM0 = m0(view);
        N0(view);
        h hVar = this.N;
        if (hVar != null && dM0 != null) {
            hVar.t(dM0);
        }
        if (this.h0 == null || r2.size() - 1 < 0) {
            return;
        }
        AbstractC6314li0.a(this.h0.get(size));
        throw null;
    }

    public final boolean D0(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || view2 == view || W(view2) == null) {
            return false;
        }
        if (view == null || W(view) == null) {
            return true;
        }
        this.K.set(0, 0, view.getWidth(), view.getHeight());
        this.L.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.K);
        offsetDescendantRectToMyCoords(view2, this.L);
        byte b = -1;
        int i4 = this.O.a0() == 1 ? -1 : 1;
        Rect rect = this.K;
        int i5 = rect.left;
        Rect rect2 = this.L;
        int i6 = rect2.left;
        if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i7 = rect.right;
            int i8 = rect2.right;
            i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
            b = 1;
        } else {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if ((i11 <= i12 && i9 < i12) || i9 <= i10) {
                b = 0;
            }
        }
        if (i2 == 1) {
            return b < 0 || (b == 0 && i3 * i4 < 0);
        }
        if (i2 == 2) {
            return b > 0 || (b == 0 && i3 * i4 > 0);
        }
        if (i2 == 17) {
            return i3 < 0;
        }
        if (i2 == 33) {
            return b < 0;
        }
        if (i2 == 66) {
            return i3 > 0;
        }
        if (i2 == 130) {
            return b > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i2 + U());
    }

    public boolean D1(int i2, int i3) {
        return getScrollingChildHelper().p(i2, i3);
    }

    public void E(View view) {
        int size;
        D dM0 = m0(view);
        O0(view);
        h hVar = this.N;
        if (hVar != null && dM0 != null) {
            hVar.u(dM0);
        }
        if (this.h0 == null || r2.size() - 1 < 0) {
            return;
        }
        AbstractC6314li0.a(this.h0.get(size));
        throw null;
    }

    public void E0(int i2) {
        if (this.O == null) {
            return;
        }
        setScrollState(2);
        this.O.A1(i2);
        awakenScrollBars();
    }

    public final void F() {
        int i2 = this.e0;
        this.e0 = 0;
        if (i2 == 0 || !B0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        AbstractC5836k1.b(accessibilityEventObtain, i2);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    public void F0() {
        int iJ = this.G.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            ((q) this.G.i(i2).getLayoutParams()).c = true;
        }
        this.D.s();
    }

    public void F1(boolean z2) {
        if (this.a0 < 1) {
            if (c1) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + U());
            }
            this.a0 = 1;
        }
        if (!z2 && !this.c0) {
            this.b0 = false;
        }
        if (this.a0 == 1) {
            if (z2 && this.b0 && !this.c0 && this.O != null && this.N != null) {
                G();
            }
            if (!this.c0) {
                this.b0 = false;
            }
        }
        this.a0--;
    }

    public void G() {
        if (this.N == null || this.O == null) {
            return;
        }
        this.J0.j = false;
        boolean z2 = this.Y0 && !(this.Z0 == getWidth() && this.a1 == getHeight());
        this.Z0 = 0;
        this.a1 = 0;
        this.Y0 = false;
        if (this.J0.e == 1) {
            H();
            this.O.C1(this);
            I();
        } else if (this.F.q() || z2 || this.O.r0() != getWidth() || this.O.X() != getHeight()) {
            this.O.C1(this);
            I();
        } else {
            this.O.C1(this);
        }
        J();
    }

    public void G0() {
        int iJ = this.G.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            D dM0 = m0(this.G.i(i2));
            if (dM0 != null && !dM0.N()) {
                dM0.d(6);
            }
        }
        F0();
        this.D.t();
    }

    public void G1(int i2) {
        getScrollingChildHelper().r(i2);
    }

    public final void H() {
        this.J0.a(1);
        V(this.J0);
        this.J0.j = false;
        C1();
        this.H.f();
        P0();
        X0();
        o1();
        z zVar = this.J0;
        zVar.i = zVar.k && this.N0;
        this.N0 = false;
        this.M0 = false;
        zVar.h = zVar.l;
        zVar.f = this.N.f();
        Z(this.R0);
        if (this.J0.k) {
            int iG = this.G.g();
            for (int i2 = 0; i2 < iG; i2++) {
                D dM0 = m0(this.G.f(i2));
                if (!dM0.N() && (!dM0.x() || this.N.j())) {
                    this.H.e(dM0, this.r0.t(this.J0, dM0, m.e(dM0), dM0.s()));
                    if (this.J0.i && dM0.C() && !dM0.z() && !dM0.N() && !dM0.x()) {
                        this.H.c(h0(dM0), dM0);
                    }
                }
            }
        }
        if (this.J0.l) {
            p1();
            z zVar2 = this.J0;
            boolean z2 = zVar2.g;
            zVar2.g = false;
            this.O.a1(this.D, zVar2);
            this.J0.g = z2;
            for (int i3 = 0; i3 < this.G.g(); i3++) {
                D dM02 = m0(this.G.f(i3));
                if (!dM02.N() && !this.H.i(dM02)) {
                    int iE = m.e(dM02);
                    boolean zT = dM02.t(8192);
                    if (!zT) {
                        iE |= 4096;
                    }
                    m.b bVarT = this.r0.t(this.J0, dM02, iE, dM02.s());
                    if (zT) {
                        a1(dM02, bVarT);
                    } else {
                        this.H.a(dM02, bVarT);
                    }
                }
            }
            u();
        } else {
            u();
        }
        Q0();
        F1(false);
        this.J0.e = 2;
    }

    public final void H0(int i2, int i3, MotionEvent motionEvent, int i4) {
        p pVar = this.O;
        if (pVar == null || this.c0) {
            return;
        }
        int[] iArr = this.V0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zL = pVar.l();
        boolean zM = this.O.m();
        int i5 = zM ? (zL ? 1 : 0) | 2 : zL ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iD1 = i2 - d1(i2, height);
        int iE1 = i3 - e1(i3, width);
        D1(i5, i4);
        if (K(zL ? iD1 : 0, zM ? iE1 : 0, this.V0, this.T0, i4)) {
            int[] iArr2 = this.V0;
            iD1 -= iArr2[0];
            iE1 -= iArr2[1];
        }
        q1(zL ? iD1 : 0, zM ? iE1 : 0, motionEvent, i4);
        androidx.recyclerview.widget.e eVar = this.H0;
        if (eVar != null && (iD1 != 0 || iE1 != 0)) {
            eVar.f(this, iD1, iE1);
        }
        G1(i4);
    }

    public void H1() {
        setScrollState(0);
        I1();
    }

    public final void I() {
        C1();
        P0();
        this.J0.a(6);
        this.F.j();
        this.J0.f = this.N.f();
        this.J0.d = 0;
        if (this.E != null && this.N.c()) {
            Parcelable parcelable = this.E.D;
            if (parcelable != null) {
                this.O.f1(parcelable);
            }
            this.E = null;
        }
        z zVar = this.J0;
        zVar.h = false;
        this.O.a1(this.D, zVar);
        z zVar2 = this.J0;
        zVar2.g = false;
        zVar2.k = zVar2.k && this.r0 != null;
        zVar2.e = 4;
        Q0();
        F1(false);
    }

    public void I0(int i2) {
        int iG = this.G.g();
        for (int i3 = 0; i3 < iG; i3++) {
            this.G.f(i3).offsetLeftAndRight(i2);
        }
    }

    public final void I1() {
        this.G0.f();
        p pVar = this.O;
        if (pVar != null) {
            pVar.N1();
        }
    }

    public final void J() {
        RecyclerView recyclerView;
        this.J0.a(4);
        C1();
        P0();
        z zVar = this.J0;
        zVar.e = 1;
        if (zVar.k) {
            for (int iG = this.G.g() - 1; iG >= 0; iG--) {
                D dM0 = m0(this.G.f(iG));
                if (!dM0.N()) {
                    long jH0 = h0(dM0);
                    m.b bVarS = this.r0.s(this.J0, dM0);
                    D dG = this.H.g(jH0);
                    if (dG == null || dG.N()) {
                        this.H.d(dM0, bVarS);
                    } else {
                        boolean zH = this.H.h(dG);
                        boolean zH2 = this.H.h(dM0);
                        if (zH && dG == dM0) {
                            this.H.d(dM0, bVarS);
                        } else {
                            m.b bVarN = this.H.n(dG);
                            this.H.d(dM0, bVarS);
                            m.b bVarM = this.H.m(dM0);
                            if (bVarN == null) {
                                s0(jH0, dM0, dG);
                            } else {
                                o(dG, dM0, bVarN, bVarM, zH, zH2);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.H.o(recyclerView.b1);
        } else {
            recyclerView = this;
        }
        recyclerView.O.o1(recyclerView.D);
        z zVar2 = recyclerView.J0;
        zVar2.c = zVar2.f;
        recyclerView.i0 = false;
        recyclerView.j0 = false;
        zVar2.k = false;
        zVar2.l = false;
        recyclerView.O.h = false;
        ArrayList arrayList = recyclerView.D.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = recyclerView.O;
        if (pVar.n) {
            pVar.m = 0;
            pVar.n = false;
            recyclerView.D.P();
        }
        recyclerView.O.b1(recyclerView.J0);
        Q0();
        F1(false);
        recyclerView.H.f();
        int[] iArr = recyclerView.R0;
        if (C(iArr[0], iArr[1])) {
            N(0, 0);
        }
        b1();
        m1();
    }

    public void J0(int i2) {
        int iG = this.G.g();
        for (int i3 = 0; i3 < iG; i3++) {
            this.G.f(i3).offsetTopAndBottom(i2);
        }
    }

    public void J1(int i2, int i3, Object obj) {
        int i4;
        int iJ = this.G.j();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < iJ; i6++) {
            View viewI = this.G.i(i6);
            D dM0 = m0(viewI);
            if (dM0 != null && !dM0.N() && (i4 = dM0.c) >= i2 && i4 < i5) {
                dM0.d(2);
                dM0.c(obj);
                ((q) viewI.getLayoutParams()).c = true;
            }
        }
        this.D.R(i2, i3);
    }

    public boolean K(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().d(i2, i3, iArr, iArr2, i4);
    }

    public void K0(int i2, int i3) {
        int iJ = this.G.j();
        for (int i4 = 0; i4 < iJ; i4++) {
            D dM0 = m0(this.G.i(i4));
            if (dM0 != null && !dM0.N() && dM0.c >= i2) {
                if (d1) {
                    dM0.toString();
                }
                dM0.E(i3, false);
                this.J0.g = true;
            }
        }
        this.D.v(i2, i3);
        requestLayout();
    }

    public final void L(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void L0(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int iJ = this.G.j();
        if (i2 < i3) {
            i6 = -1;
            i5 = i2;
            i4 = i3;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i8 = 0; i8 < iJ; i8++) {
            D dM0 = m0(this.G.i(i8));
            if (dM0 != null && (i7 = dM0.c) >= i5 && i7 <= i4) {
                if (d1) {
                    dM0.toString();
                }
                if (dM0.c == i2) {
                    dM0.E(i3 - i2, false);
                } else {
                    dM0.E(i6, false);
                }
                this.J0.g = true;
            }
        }
        this.D.w(i2, i3);
        requestLayout();
    }

    public void M(int i2) {
        p pVar = this.O;
        if (pVar != null) {
            pVar.h1(i2);
        }
        T0(i2);
        t tVar = this.K0;
        if (tVar != null) {
            tVar.a(this, i2);
        }
        List list = this.L0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((t) this.L0.get(size)).a(this, i2);
            }
        }
    }

    public void M0(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int iJ = this.G.j();
        for (int i5 = 0; i5 < iJ; i5++) {
            D dM0 = m0(this.G.i(i5));
            if (dM0 != null && !dM0.N()) {
                int i6 = dM0.c;
                if (i6 >= i4) {
                    if (d1) {
                        dM0.toString();
                    }
                    dM0.E(-i3, z2);
                    this.J0.g = true;
                } else if (i6 >= i2) {
                    if (d1) {
                        dM0.toString();
                    }
                    dM0.k(i2 - 1, -i3, z2);
                    this.J0.g = true;
                }
            }
        }
        this.D.x(i2, i3, z2);
        requestLayout();
    }

    public void N(int i2, int i3) {
        this.l0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        U0(i2, i3);
        t tVar = this.K0;
        if (tVar != null) {
            tVar.b(this, i2, i3);
        }
        List list = this.L0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((t) this.L0.get(size)).b(this, i2, i3);
            }
        }
        this.l0--;
    }

    public void N0(View view) {
    }

    public void O() {
        int i2;
        for (int size = this.W0.size() - 1; size >= 0; size--) {
            D d = (D) this.W0.get(size);
            if (d.a.getParent() == this && !d.N() && (i2 = d.q) != -1) {
                AbstractC2317Td1.z0(d.a, i2);
                d.q = -1;
            }
        }
        this.W0.clear();
    }

    public void O0(View view) {
    }

    public final boolean P(MotionEvent motionEvent) {
        s sVar = this.S;
        if (sVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return Y(motionEvent);
        }
        sVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.S = null;
        }
        return true;
    }

    public void P0() {
        this.k0++;
    }

    public void Q() {
        if (this.q0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.m0.a(this, 3);
        this.q0 = edgeEffectA;
        if (this.I) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void Q0() {
        R0(true);
    }

    public void R() {
        if (this.n0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.m0.a(this, 0);
        this.n0 = edgeEffectA;
        if (this.I) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void R0(boolean z2) {
        int i2 = this.k0 - 1;
        this.k0 = i2;
        if (i2 < 1) {
            if (c1 && i2 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + U());
            }
            this.k0 = 0;
            if (z2) {
                F();
                O();
            }
        }
    }

    public void S() {
        if (this.p0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.m0.a(this, 2);
        this.p0 = edgeEffectA;
        if (this.I) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void S0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.t0) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.t0 = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.x0 = x2;
            this.v0 = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.y0 = y2;
            this.w0 = y2;
        }
    }

    public void T() {
        if (this.o0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.m0.a(this, 1);
        this.o0 = edgeEffectA;
        if (this.I) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void T0(int i2) {
    }

    public String U() {
        return " " + super.toString() + ", adapter:" + this.N + ", layout:" + this.O + ", context:" + getContext();
    }

    public void U0(int i2, int i3) {
    }

    public final void V(z zVar) {
        if (getScrollState() != 2) {
            zVar.p = 0;
            zVar.q = 0;
        } else {
            OverScroller overScroller = this.G0.D;
            zVar.p = overScroller.getFinalX() - overScroller.getCurrX();
            zVar.q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public void V0() {
        if (this.P0 || !this.T) {
            return;
        }
        AbstractC2317Td1.h0(this, this.X0);
        this.P0 = true;
    }

    public View W(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean W0() {
        return this.r0 != null && this.O.O1();
    }

    public D X(View view) {
        View viewW = W(view);
        if (viewW == null) {
            return null;
        }
        return l0(viewW);
    }

    public final void X0() {
        boolean z2;
        if (this.i0) {
            this.F.v();
            if (this.j0) {
                this.O.V0(this);
            }
        }
        if (W0()) {
            this.F.t();
        } else {
            this.F.j();
        }
        boolean z3 = this.M0 || this.N0;
        this.J0.k = this.W && this.r0 != null && ((z2 = this.i0) || z3 || this.O.h) && (!z2 || this.N.j());
        z zVar = this.J0;
        zVar.l = zVar.k && z3 && !this.i0 && W0();
    }

    public final boolean Y(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.R.size();
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = (s) this.R.get(i2);
            if (sVar.b(this, motionEvent) && action != 3) {
                this.S = sVar;
                return true;
            }
        }
        return false;
    }

    public void Y0(boolean z2) {
        this.j0 = z2 | this.j0;
        this.i0 = true;
        G0();
    }

    public final void Z(int[] iArr) {
        int iG = this.G.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < iG; i4++) {
            D dM0 = m0(this.G.f(i4));
            if (!dM0.N()) {
                int iQ = dM0.q();
                if (iQ < i2) {
                    i2 = iQ;
                }
                if (iQ > i3) {
                    i3 = iQ;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.R()
            android.widget.EdgeEffect r3 = r6.n0
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            com.daaw.AbstractC6189lF.d(r3, r4, r9)
        L1f:
            r9 = 1
            goto L3c
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L3b
            r6.S()
            android.widget.EdgeEffect r3 = r6.p0
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            com.daaw.AbstractC6189lF.d(r3, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L56
            r6.T()
            android.widget.EdgeEffect r9 = r6.o0
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            com.daaw.AbstractC6189lF.d(r9, r0, r7)
            goto L72
        L56:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L71
            r6.Q()
            android.widget.EdgeEffect r9 = r6.q0
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            com.daaw.AbstractC6189lF.d(r9, r3, r0)
            goto L72
        L71:
            r1 = r9
        L72:
            if (r1 != 0) goto L7e
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L7e
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7d
            goto L7e
        L7d:
            return
        L7e:
            com.daaw.AbstractC2317Td1.g0(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Z0(float, float, float, float):void");
    }

    public void a(int i2, int i3) {
        if (i2 < 0) {
            R();
            if (this.n0.isFinished()) {
                this.n0.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            S();
            if (this.p0.isFinished()) {
                this.p0.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            T();
            if (this.o0.isFinished()) {
                this.o0.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            Q();
            if (this.q0.isFinished()) {
                this.q0.onAbsorb(i3);
            }
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        AbstractC2317Td1.g0(this);
    }

    public void a1(D d, m.b bVar) {
        d.J(0, 8192);
        if (this.J0.i && d.C() && !d.z() && !d.N()) {
            this.H.c(h0(d), d);
        }
        this.H.e(d, bVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i2, int i3) {
        p pVar = this.O;
        if (pVar == null || !pVar.I0(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public final View b0() {
        D dC0;
        z zVar = this.J0;
        int i2 = zVar.m;
        if (i2 == -1) {
            i2 = 0;
        }
        int iB = zVar.b();
        for (int i3 = i2; i3 < iB; i3++) {
            D dC02 = c0(i3);
            if (dC02 == null) {
                break;
            }
            if (dC02.a.hasFocusable()) {
                return dC02.a;
            }
        }
        int iMin = Math.min(iB, i2);
        do {
            iMin--;
            if (iMin < 0 || (dC0 = c0(iMin)) == null) {
                return null;
            }
        } while (!dC0.a.hasFocusable());
        return dC0.a;
    }

    public final void b1() {
        View viewFindViewById;
        if (!this.F0 || this.N == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!l1 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.G.n(focusedChild)) {
                    return;
                }
            } else if (this.G.g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewB0 = null;
        D dD0 = (this.J0.n == -1 || !this.N.j()) ? null : d0(this.J0.n);
        if (dD0 != null && !this.G.n(dD0.a) && dD0.a.hasFocusable()) {
            viewB0 = dD0.a;
        } else if (this.G.g() > 0) {
            viewB0 = b0();
        }
        if (viewB0 != null) {
            int i2 = this.J0.o;
            if (i2 != -1 && (viewFindViewById = viewB0.findViewById(i2)) != null && viewFindViewById.isFocusable()) {
                viewB0 = viewFindViewById;
            }
            viewB0.requestFocus();
        }
    }

    public D c0(int i2) {
        D d = null;
        if (this.i0) {
            return null;
        }
        int iJ = this.G.j();
        for (int i3 = 0; i3 < iJ; i3++) {
            D dM0 = m0(this.G.i(i3));
            if (dM0 != null && !dM0.z() && g0(dM0) == i2) {
                if (!this.G.n(dM0.a)) {
                    return dM0;
                }
                d = dM0;
            }
        }
        return d;
    }

    public final void c1() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.n0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.n0.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.o0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.o0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.p0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.p0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.q0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.q0.isFinished();
        }
        if (zIsFinished) {
            AbstractC2317Td1.g0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.O.n((q) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        p pVar = this.O;
        if (pVar != null && pVar.l()) {
            return this.O.r(this.J0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        p pVar = this.O;
        if (pVar != null && pVar.l()) {
            return this.O.s(this.J0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        p pVar = this.O;
        if (pVar != null && pVar.l()) {
            return this.O.t(this.J0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        p pVar = this.O;
        if (pVar != null && pVar.m()) {
            return this.O.u(this.J0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        p pVar = this.O;
        if (pVar != null && pVar.m()) {
            return this.O.v(this.J0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        p pVar = this.O;
        if (pVar != null && pVar.m()) {
            return this.O.w(this.J0);
        }
        return 0;
    }

    public D d0(long j2) {
        h hVar = this.N;
        D d = null;
        if (hVar != null && hVar.j()) {
            int iJ = this.G.j();
            for (int i2 = 0; i2 < iJ; i2++) {
                D dM0 = m0(this.G.i(i2));
                if (dM0 != null && !dM0.z() && dM0.o() == j2) {
                    if (!this.G.n(dM0.a)) {
                        return dM0;
                    }
                    d = dM0;
                }
            }
        }
        return d;
    }

    public final int d1(int i2, float f2) {
        float height = f2 / getHeight();
        float width = i2 / getWidth();
        EdgeEffect edgeEffect = this.n0;
        float f3 = 0.0f;
        if (edgeEffect == null || AbstractC6189lF.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.p0;
            if (edgeEffect2 != null && AbstractC6189lF.b(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.p0.onRelease();
                } else {
                    float fD = AbstractC6189lF.d(this.p0, width, height);
                    if (AbstractC6189lF.b(this.p0) == 0.0f) {
                        this.p0.onRelease();
                    }
                    f3 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.n0.onRelease();
            } else {
                float f4 = -AbstractC6189lF.d(this.n0, -width, 1.0f - height);
                if (AbstractC6189lF.b(this.n0) == 0.0f) {
                    this.n0.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getWidth());
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().f(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        int size = this.Q.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ((o) this.Q.get(i2)).i(canvas, this, this.J0);
        }
        EdgeEffect edgeEffect = this.n0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.I ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.n0;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.o0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.I) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.o0;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.p0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.I ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.p0;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.q0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.I) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.q0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(iSave4);
        }
        if ((z2 || this.r0 == null || this.Q.size() <= 0 || !this.r0.p()) ? z2 : true) {
            AbstractC2317Td1.g0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.recyclerview.widget.RecyclerView.D e0(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.G
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.G
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$D r3 = m0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.z()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.q()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.G
            android.view.View r4 = r3.a
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.e0(int, boolean):androidx.recyclerview.widget.RecyclerView$D");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean f0(int i2, int i3) {
        int iMax;
        int i4;
        p pVar = this.O;
        if (pVar == null || this.c0) {
            return false;
        }
        int iL = pVar.l();
        boolean zM = this.O.m();
        if (iL == 0 || Math.abs(i2) < this.B0) {
            i2 = 0;
        }
        if (!zM || Math.abs(i3) < this.B0) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        if (i2 == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.n0;
            if (edgeEffect == null || AbstractC6189lF.b(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.p0;
                if (edgeEffect2 != null && AbstractC6189lF.b(edgeEffect2) != 0.0f) {
                    if (v1(this.p0, i2, getWidth())) {
                        this.p0.onAbsorb(i2);
                        i2 = 0;
                    }
                    iMax = i2;
                    i2 = 0;
                }
                iMax = 0;
            } else {
                int i5 = -i2;
                if (v1(this.n0, i5, getWidth())) {
                    this.n0.onAbsorb(i5);
                    i2 = 0;
                }
                iMax = i2;
                i2 = 0;
            }
        }
        if (i3 == 0) {
            i4 = i3;
            i3 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.o0;
            if (edgeEffect3 == null || AbstractC6189lF.b(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.q0;
                if (edgeEffect4 != null && AbstractC6189lF.b(edgeEffect4) != 0.0f) {
                    if (v1(this.q0, i3, getHeight())) {
                        this.q0.onAbsorb(i3);
                        i3 = 0;
                    }
                    i4 = 0;
                }
                i4 = i3;
                i3 = 0;
            } else {
                int i6 = -i3;
                if (v1(this.o0, i6, getHeight())) {
                    this.o0.onAbsorb(i6);
                    i3 = 0;
                }
                i4 = 0;
            }
        }
        if (iMax != 0 || i3 != 0) {
            int i7 = this.C0;
            iMax = Math.max(-i7, Math.min(iMax, i7));
            int i8 = this.C0;
            i3 = Math.max(-i8, Math.min(i3, i8));
            this.G0.b(iMax, i3);
        }
        if (i2 == 0 && i4 == 0) {
            return (iMax == 0 && i3 == 0) ? false : true;
        }
        float f2 = i2;
        float f3 = i4;
        if (!dispatchNestedPreFling(f2, f3)) {
            boolean z2 = iL != 0 || zM;
            dispatchNestedFling(f2, f3, z2);
            r rVar = this.A0;
            if (rVar != null && rVar.a(i2, i4)) {
                return true;
            }
            if (z2) {
                if (zM) {
                    iL = (iL == true ? 1 : 0) | 2;
                }
                D1(iL, 1);
                int i9 = this.C0;
                int iMax2 = Math.max(-i9, Math.min(i2, i9));
                int i10 = this.C0;
                this.G0.b(iMax2, Math.max(-i10, Math.min(i4, i10)));
                return true;
            }
        }
        return false;
    }

    public void f1() {
        m mVar = this.r0;
        if (mVar != null) {
            mVar.k();
        }
        p pVar = this.O;
        if (pVar != null) {
            pVar.n1(this.D);
            this.O.o1(this.D);
        }
        this.D.c();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        View viewM0;
        boolean z2;
        View viewT0 = this.O.T0(view, i2);
        if (viewT0 != null) {
            return viewT0;
        }
        boolean z3 = (this.N == null || this.O == null || C0() || this.c0) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i2 == 2 || i2 == 1)) {
            if (this.O.m()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = focusFinder.findNextFocus(this, view, i3) == null;
                if (k1) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.O.l()) {
                int i4 = (this.O.a0() == 1) ^ (i2 == 2) ? 66 : 17;
                boolean z4 = focusFinder.findNextFocus(this, view, i4) == null;
                if (k1) {
                    i2 = i4;
                }
                z2 = z4;
            }
            if (z2) {
                z();
                if (W(view) == null) {
                    return null;
                }
                C1();
                this.O.M0(view, i2, this.D, this.J0);
                F1(false);
            }
            viewM0 = focusFinder.findNextFocus(this, view, i2);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (viewFindNextFocus == null && z3) {
                z();
                if (W(view) == null) {
                    return null;
                }
                C1();
                viewM0 = this.O.M0(view, i2, this.D, this.J0);
                F1(false);
            } else {
                viewM0 = viewFindNextFocus;
            }
        }
        if (viewM0 == null || viewM0.hasFocusable()) {
            return D0(view, viewM0, i2) ? viewM0 : super.focusSearch(view, i2);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        }
        l1(viewM0, null);
        return view;
    }

    public int g0(D d) {
        if (d.t(524) || !d.w()) {
            return -1;
        }
        return this.F.e(d.c);
    }

    public boolean g1(View view) {
        C1();
        boolean zR = this.G.r(view);
        if (zR) {
            D dM0 = m0(view);
            this.D.O(dM0);
            this.D.H(dM0);
            if (d1) {
                Objects.toString(view);
                toString();
            }
        }
        F1(!zR);
        return zR;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.O;
        if (pVar != null) {
            return pVar.E();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + U());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.O;
        if (pVar != null) {
            return pVar.F(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + U());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.N;
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.O;
        return pVar != null ? pVar.H() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.I;
    }

    public androidx.recyclerview.widget.k getCompatAccessibilityDelegate() {
        return this.Q0;
    }

    public l getEdgeEffectFactory() {
        return this.m0;
    }

    public m getItemAnimator() {
        return this.r0;
    }

    public int getItemDecorationCount() {
        return this.Q.size();
    }

    public p getLayoutManager() {
        return this.O;
    }

    public int getMaxFlingVelocity() {
        return this.C0;
    }

    public int getMinFlingVelocity() {
        return this.B0;
    }

    public long getNanoTime() {
        if (j1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public r getOnFlingListener() {
        return this.A0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.F0;
    }

    public u getRecycledViewPool() {
        return this.D.i();
    }

    public int getScrollState() {
        return this.s0;
    }

    public long h0(D d) {
        return this.N.j() ? d.o() : d.c;
    }

    public void h1(o oVar) {
        p pVar = this.O;
        if (pVar != null) {
            pVar.h("Cannot remove item decoration during a scroll  or layout");
        }
        this.Q.remove(oVar);
        if (this.Q.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        F0();
        requestLayout();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public final void i(D d) {
        View view = d.a;
        boolean z2 = view.getParent() == this;
        this.D.O(l0(view));
        if (d.B()) {
            this.G.c(view, -1, view.getLayoutParams(), true);
        } else if (z2) {
            this.G.k(view);
        } else {
            this.G.b(view, true);
        }
    }

    public int i0(View view) {
        D dM0 = m0(view);
        if (dM0 != null) {
            return dM0.l();
        }
        return -1;
    }

    public void i1(s sVar) {
        this.R.remove(sVar);
        if (this.S == sVar) {
            this.S = null;
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.T;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.c0;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(o oVar) {
        k(oVar, -1);
    }

    public int j0(View view) {
        D dM0 = m0(view);
        if (dM0 != null) {
            return dM0.q();
        }
        return -1;
    }

    public void j1(t tVar) {
        List list = this.L0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    public void k(o oVar, int i2) {
        p pVar = this.O;
        if (pVar != null) {
            pVar.h("Cannot add item decoration during a scroll  or layout");
        }
        if (this.Q.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.Q.add(oVar);
        } else {
            this.Q.add(i2, oVar);
        }
        F0();
        requestLayout();
    }

    public int k0(View view) {
        return i0(view);
    }

    public void k1() {
        D d;
        int iG = this.G.g();
        for (int i2 = 0; i2 < iG; i2++) {
            View viewF = this.G.f(i2);
            D dL0 = l0(viewF);
            if (dL0 != null && (d = dL0.i) != null) {
                View view = d.a;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void l(s sVar) {
        this.R.add(sVar);
    }

    public D l0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final void l1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.K.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.c) {
                Rect rect = qVar.b;
                Rect rect2 = this.K;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.K);
            offsetRectIntoDescendantCoords(view, this.K);
        }
        this.O.v1(this, view, this.K, !this.W, view2 == null);
    }

    public void m(t tVar) {
        if (this.L0 == null) {
            this.L0 = new ArrayList();
        }
        this.L0.add(tVar);
    }

    public final void m1() {
        z zVar = this.J0;
        zVar.n = -1L;
        zVar.m = -1;
        zVar.o = -1;
    }

    public void n(D d, m.b bVar, m.b bVar2) {
        d.K(false);
        if (this.r0.a(d, bVar, bVar2)) {
            V0();
        }
    }

    public final void n1() {
        VelocityTracker velocityTracker = this.u0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        G1(0);
        c1();
    }

    public final void o(D d, D d2, m.b bVar, m.b bVar2, boolean z2, boolean z3) {
        d.K(false);
        if (z2) {
            i(d);
        }
        if (d != d2) {
            if (z3) {
                i(d2);
            }
            d.h = d2;
            i(d);
            this.D.O(d);
            d2.K(false);
            d2.i = d;
        }
        if (this.r0.b(d, d2, bVar, bVar2)) {
            V0();
        }
    }

    public final int o0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    public final void o1() {
        View focusedChild = (this.F0 && hasFocus() && this.N != null) ? getFocusedChild() : null;
        D dX = focusedChild != null ? X(focusedChild) : null;
        if (dX == null) {
            m1();
            return;
        }
        this.J0.n = this.N.j() ? dX.o() : -1L;
        this.J0.m = this.i0 ? -1 : dX.z() ? dX.d : dX.l();
        this.J0.o = o0(dX.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.k0 = r0
            r1 = 1
            r5.T = r1
            boolean r2 = r5.W
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            r5.W = r1
            androidx.recyclerview.widget.RecyclerView$v r1 = r5.D
            r1.z()
            androidx.recyclerview.widget.RecyclerView$p r1 = r5.O
            if (r1 == 0) goto L23
            r1.A(r5)
        L23:
            r5.P0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.j1
            if (r0 == 0) goto L66
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.e.F
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.e r1 = (androidx.recyclerview.widget.e) r1
            r5.H0 = r1
            if (r1 != 0) goto L61
            androidx.recyclerview.widget.e r1 = new androidx.recyclerview.widget.e
            r1.<init>()
            r5.H0 = r1
            android.view.Display r1 = com.daaw.AbstractC2317Td1.w(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L53
            if (r1 == 0) goto L53
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L53
            goto L55
        L53:
            r1 = 1114636288(0x42700000, float:60.0)
        L55:
            androidx.recyclerview.widget.e r2 = r5.H0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.D = r3
            r0.set(r2)
        L61:
            androidx.recyclerview.widget.e r0 = r5.H0
            r0.a(r5)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        m mVar = this.r0;
        if (mVar != null) {
            mVar.k();
        }
        H1();
        this.T = false;
        p pVar = this.O;
        if (pVar != null) {
            pVar.B(this, this.D);
        }
        this.W0.clear();
        removeCallbacks(this.X0);
        this.H.j();
        this.D.A();
        AbstractC0917Fx0.c(this);
        if (!j1 || (eVar = this.H0) == null) {
            return;
        }
        eVar.j(this);
        this.H0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.Q.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((o) this.Q.get(i2)).g(canvas, this, this.J0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.O
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.c0
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L7a
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.O
            boolean r0 = r0.m()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.O
            boolean r3 = r3.l()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = 0
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.O
            boolean r3 = r3.m()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.O
            boolean r3 = r3.l()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = 0
            goto L64
        L62:
            r0 = 0
            goto L3c
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L7a
        L6c:
            float r2 = r5.D0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.E0
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.H0(r2, r0, r6, r3)
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.c0) {
            return false;
        }
        this.S = null;
        if (Y(motionEvent)) {
            s();
            return true;
        }
        p pVar = this.O;
        if (pVar == null) {
            return false;
        }
        boolean zL = pVar.l();
        boolean zM = this.O.m();
        if (this.u0 == null) {
            this.u0 = VelocityTracker.obtain();
        }
        this.u0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.d0) {
                this.d0 = false;
            }
            this.t0 = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.x0 = x2;
            this.v0 = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.y0 = y2;
            this.w0 = y2;
            if (E1(motionEvent) || this.s0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                G1(1);
            }
            int[] iArr = this.U0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = zL;
            if (zM) {
                i2 = (zL ? 1 : 0) | 2;
            }
            D1(i2, 0);
        } else if (actionMasked == 1) {
            this.u0.clear();
            G1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.t0);
            if (iFindPointerIndex < 0) {
                return false;
            }
            int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.s0 != 1) {
                int i3 = x3 - this.v0;
                int i4 = y3 - this.w0;
                if (!zL || Math.abs(i3) <= this.z0) {
                    z2 = false;
                } else {
                    this.x0 = x3;
                    z2 = true;
                }
                if (zM && Math.abs(i4) > this.z0) {
                    this.y0 = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            s();
        } else if (actionMasked == 5) {
            this.t0 = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.x0 = x4;
            this.v0 = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.y0 = y4;
            this.w0 = y4;
        } else if (actionMasked == 6) {
            S0(motionEvent);
        }
        return this.s0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        S41.a("RV OnLayout");
        G();
        S41.b();
        this.W = true;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        p pVar = this.O;
        if (pVar == null) {
            B(i2, i3);
            return;
        }
        boolean z2 = false;
        if (pVar.v0()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.O.c1(this.D, this.J0, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.Y0 = z2;
            if (z2 || this.N == null) {
                return;
            }
            if (this.J0.e == 1) {
                H();
            }
            this.O.D1(i2, i3);
            this.J0.j = true;
            I();
            this.O.G1(i2, i3);
            if (this.O.J1()) {
                this.O.D1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.J0.j = true;
                I();
                this.O.G1(i2, i3);
            }
            this.Z0 = getMeasuredWidth();
            this.a1 = getMeasuredHeight();
            return;
        }
        if (this.U) {
            this.O.c1(this.D, this.J0, i2, i3);
            return;
        }
        if (this.f0) {
            C1();
            P0();
            X0();
            Q0();
            z zVar = this.J0;
            if (zVar.l) {
                zVar.h = true;
            } else {
                this.F.j();
                this.J0.h = false;
            }
            this.f0 = false;
            F1(false);
        } else if (this.J0.l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.N;
        if (hVar != null) {
            this.J0.f = hVar.f();
        } else {
            this.J0.f = 0;
        }
        C1();
        this.O.c1(this.D, this.J0, i2, i3);
        F1(false);
        this.J0.h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (C0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.E = savedState;
        super.onRestoreInstanceState(savedState.a());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.E;
        if (savedState2 != null) {
            savedState.b(savedState2);
            return savedState;
        }
        p pVar = this.O;
        if (pVar != null) {
            savedState.D = pVar.g1();
            return savedState;
        }
        savedState.D = null;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        z0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2 A[PHI: r1
  0x00c2: PHI (r1v46 int) = (r1v26 int), (r1v50 int) binds: [B:40:0x00ab, B:44:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(D d, m.b bVar, m.b bVar2) {
        i(d);
        d.K(false);
        if (this.r0.c(d, bVar, bVar2)) {
            V0();
        }
    }

    public final String p0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    public void p1() {
        int iJ = this.G.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            D dM0 = m0(this.G.i(i2));
            if (c1 && dM0.c == -1 && !dM0.z()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + U());
            }
            if (!dM0.N()) {
                dM0.I();
            }
        }
    }

    public void q(String str) {
        if (C0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + U());
        }
        if (this.l0 > 0) {
            new IllegalStateException("" + U());
        }
    }

    public Rect q0(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.c) {
            return qVar.b;
        }
        if (this.J0.e() && (qVar.b() || qVar.d())) {
            return qVar.b;
        }
        Rect rect = qVar.b;
        rect.set(0, 0, 0, 0);
        int size = this.Q.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.K.set(0, 0, 0, 0);
            ((o) this.Q.get(i2)).e(this.K, view, this, this.J0);
            int i3 = rect.left;
            Rect rect2 = this.K;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.c = false;
        return rect;
    }

    public boolean q1(int i2, int i3, MotionEvent motionEvent, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        z();
        if (this.N != null) {
            int[] iArr = this.V0;
            iArr[0] = 0;
            iArr[1] = 0;
            r1(i2, i3, iArr);
            int[] iArr2 = this.V0;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i7 = i2 - i9;
            i8 = i3 - i10;
            i6 = i10;
            i5 = i9;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (!this.Q.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.V0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        L(i5, i6, i7, i8, this.T0, i4, iArr3);
        int[] iArr4 = this.V0;
        int i11 = iArr4[0];
        int i12 = i7 - i11;
        int i13 = iArr4[1];
        int i14 = i8 - i13;
        boolean z2 = (i11 == 0 && i13 == 0) ? false : true;
        int i15 = this.x0;
        int[] iArr5 = this.T0;
        int i16 = iArr5[0];
        this.x0 = i15 - i16;
        int i17 = this.y0;
        int i18 = iArr5[1];
        this.y0 = i17 - i18;
        int[] iArr6 = this.U0;
        iArr6[0] = iArr6[0] + i16;
        iArr6[1] = iArr6[1] + i18;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !AbstractC8560tl0.a(motionEvent, 8194)) {
                Z0(motionEvent.getX(), i12, motionEvent.getY(), i14);
            }
            v(i2, i3);
        }
        if (i5 != 0 || i6 != 0) {
            N(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i5 == 0 && i6 == 0) ? false : true;
    }

    public boolean r(D d) {
        m mVar = this.r0;
        return mVar == null || mVar.g(d, d.s());
    }

    public void r1(int i2, int i3, int[] iArr) {
        C1();
        P0();
        S41.a("RV Scroll");
        V(this.J0);
        int iZ1 = i2 != 0 ? this.O.z1(i2, this.D, this.J0) : 0;
        int iB1 = i3 != 0 ? this.O.B1(i3, this.D, this.J0) : 0;
        S41.b();
        k1();
        Q0();
        F1(false);
        if (iArr != null) {
            iArr[0] = iZ1;
            iArr[1] = iB1;
        }
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z2) {
        D dM0 = m0(view);
        if (dM0 != null) {
            if (dM0.B()) {
                dM0.h();
            } else if (!dM0.N()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + dM0 + U());
            }
        } else if (c1) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + U());
        }
        view.clearAnimation();
        E(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.O.e1(this, this.J0, view, view2) && view2 != null) {
            l1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.O.u1(this, view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.R.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((s) this.R.get(i2)).c(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.a0 != 0 || this.c0) {
            this.b0 = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        n1();
        setScrollState(0);
    }

    public final void s0(long j2, D d, D d2) {
        int iG = this.G.g();
        for (int i2 = 0; i2 < iG; i2++) {
            D dM0 = m0(this.G.f(i2));
            if (dM0 != d && h0(dM0) == j2) {
                h hVar = this.N;
                if (hVar == null || !hVar.j()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + dM0 + " \n View Holder 2:" + d + U());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + dM0 + " \n View Holder 2:" + d + U());
            }
        }
        Objects.toString(d2);
        Objects.toString(d);
        U();
    }

    public void s1(int i2) {
        if (this.c0) {
            return;
        }
        H1();
        p pVar = this.O;
        if (pVar == null) {
            return;
        }
        pVar.A1(i2);
        awakenScrollBars();
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        p pVar = this.O;
        if (pVar == null || this.c0) {
            return;
        }
        boolean zL = pVar.l();
        boolean zM = this.O.m();
        if (zL || zM) {
            if (!zL) {
                i2 = 0;
            }
            if (!zM) {
                i3 = 0;
            }
            q1(i2, i3, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (w1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.k kVar) {
        this.Q0 = kVar;
        AbstractC2317Td1.p0(this, kVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        t1(hVar, false, true);
        Y0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.I) {
            z0();
        }
        this.I = z2;
        super.setClipToPadding(z2);
        if (this.W) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        AbstractC8621ty0.g(lVar);
        this.m0 = lVar;
        z0();
    }

    public void setHasFixedSize(boolean z2) {
        this.U = z2;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.r0;
        if (mVar2 != null) {
            mVar2.k();
            this.r0.v(null);
        }
        this.r0 = mVar;
        if (mVar != null) {
            mVar.v(this.O0);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.D.L(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.O) {
            return;
        }
        H1();
        if (this.O != null) {
            m mVar = this.r0;
            if (mVar != null) {
                mVar.k();
            }
            this.O.n1(this.D);
            this.O.o1(this.D);
            this.D.c();
            if (this.T) {
                this.O.B(this, this.D);
            }
            this.O.H1(null);
            this.O = null;
        } else {
            this.D.c();
        }
        this.G.o();
        this.O = pVar;
        if (pVar != null) {
            if (pVar.b != null) {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.b.U());
            }
            pVar.H1(this);
            if (this.T) {
                this.O.A(this);
            }
        }
        this.D.P();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().m(z2);
    }

    public void setOnFlingListener(r rVar) {
        this.A0 = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.K0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.F0 = z2;
    }

    public void setRecycledViewPool(u uVar) {
        this.D.J(uVar);
    }

    @Deprecated
    public void setRecyclerListener(w wVar) {
    }

    public void setScrollState(int i2) {
        if (i2 == this.s0) {
            return;
        }
        if (d1) {
            new Exception();
        }
        this.s0 = i2;
        if (i2 != 2) {
            I1();
        }
        M(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 == 0 || i2 != 1) {
            this.z0 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.z0 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(B b) {
        this.D.K(b);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().o(i2);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.c0) {
            q("Do not suppressLayout in layout or scroll");
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.c0 = true;
                this.d0 = true;
                H1();
                return;
            }
            this.c0 = false;
            if (this.b0 && this.O != null && this.N != null) {
                requestLayout();
            }
            this.b0 = false;
        }
    }

    public boolean t0() {
        return !this.W || this.i0 || this.F.p();
    }

    public final void t1(h hVar, boolean z2, boolean z3) {
        h hVar2 = this.N;
        if (hVar2 != null) {
            hVar2.y(this.C);
            this.N.r(this);
        }
        if (!z2 || z3) {
            f1();
        }
        this.F.v();
        h hVar3 = this.N;
        this.N = hVar;
        if (hVar != null) {
            hVar.w(this.C);
            hVar.n(this);
        }
        p pVar = this.O;
        if (pVar != null) {
            pVar.H0(hVar3, this.N);
        }
        this.D.y(hVar3, this.N, z2);
        this.J0.g = true;
    }

    public void u() {
        int iJ = this.G.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            D dM0 = m0(this.G.i(i2));
            if (!dM0.N()) {
                dM0.e();
            }
        }
        this.D.d();
    }

    public final boolean u0() {
        int iG = this.G.g();
        for (int i2 = 0; i2 < iG; i2++) {
            D dM0 = m0(this.G.f(i2));
            if (dM0 != null && !dM0.N() && dM0.C()) {
                return true;
            }
        }
        return false;
    }

    public boolean u1(D d, int i2) {
        if (!C0()) {
            AbstractC2317Td1.z0(d.a, i2);
            return true;
        }
        d.q = i2;
        this.W0.add(d);
        return false;
    }

    public void v(int i2, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.n0;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            zIsFinished = false;
        } else {
            this.n0.onRelease();
            zIsFinished = this.n0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.p0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.p0.onRelease();
            zIsFinished |= this.p0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.o0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.o0.onRelease();
            zIsFinished |= this.o0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.q0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.q0.onRelease();
            zIsFinished |= this.q0.isFinished();
        }
        if (zIsFinished) {
            AbstractC2317Td1.g0(this);
        }
    }

    public void v0() {
        this.F = new a(new f());
    }

    public final boolean v1(EdgeEffect edgeEffect, int i2, int i3) {
        if (i2 > 0) {
            return true;
        }
        return r0(-i2) < AbstractC6189lF.b(edgeEffect) * ((float) i3);
    }

    public int w(int i2) {
        return x(i2, this.n0, this.p0, getWidth());
    }

    public final void w0() {
        if (AbstractC2317Td1.C(this) == 0) {
            AbstractC2317Td1.B0(this, 8);
        }
    }

    public boolean w1(AccessibilityEvent accessibilityEvent) {
        if (!C0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? AbstractC5836k1.a(accessibilityEvent) : 0;
        this.e0 |= iA != 0 ? iA : 0;
        return true;
    }

    public final int x(int i2, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i3) {
        if (i2 > 0 && edgeEffect != null && AbstractC6189lF.b(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i3) / 4.0f) * AbstractC6189lF.d(edgeEffect, ((-i2) * 4.0f) / i3, 0.5f));
            if (iRound != i2) {
                edgeEffect.finish();
            }
            return i2 - iRound;
        }
        if (i2 >= 0 || edgeEffect2 == null || AbstractC6189lF.b(edgeEffect2) == 0.0f) {
            return i2;
        }
        float f2 = i3;
        int iRound2 = Math.round((f2 / 4.0f) * AbstractC6189lF.d(edgeEffect2, (i2 * 4.0f) / f2, 0.5f));
        if (iRound2 != i2) {
            edgeEffect2.finish();
        }
        return i2 - iRound2;
    }

    public final void x0() {
        this.G = new b(new e());
    }

    public void x1(int i2, int i3) {
        y1(i2, i3, null);
    }

    public int y(int i2) {
        return x(i2, this.o0, this.q0, getHeight());
    }

    public void y0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(VC0.a), resources.getDimensionPixelSize(VC0.c), resources.getDimensionPixelOffset(VC0.b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + U());
        }
    }

    public void y1(int i2, int i3, Interpolator interpolator) {
        z1(i2, i3, interpolator, Integer.MIN_VALUE);
    }

    public void z() {
        if (!this.W || this.i0) {
            S41.a("RV FullInvalidate");
            G();
            S41.b();
            return;
        }
        if (this.F.p()) {
            if (!this.F.o(4) || this.F.o(11)) {
                if (this.F.p()) {
                    S41.a("RV FullInvalidate");
                    G();
                    S41.b();
                    return;
                }
                return;
            }
            S41.a("RV PartialInvalidate");
            C1();
            P0();
            this.F.t();
            if (!this.b0) {
                if (u0()) {
                    G();
                } else {
                    this.F.i();
                }
            }
            F1(true);
            Q0();
            S41.b();
        }
    }

    public void z0() {
        this.q0 = null;
        this.o0 = null;
        this.p0 = null;
        this.n0 = null;
    }

    public void z1(int i2, int i3, Interpolator interpolator, int i4) {
        A1(i2, i3, interpolator, i4, false);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.C = new x();
        this.D = new v();
        this.H = new androidx.recyclerview.widget.p();
        this.J = new RunnableC0291a();
        this.K = new Rect();
        this.L = new Rect();
        this.M = new RectF();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.a0 = 0;
        this.i0 = false;
        this.j0 = false;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = o1;
        this.r0 = new c();
        this.s0 = 0;
        this.t0 = -1;
        this.D0 = Float.MIN_VALUE;
        this.E0 = Float.MIN_VALUE;
        this.F0 = true;
        this.G0 = new C();
        this.I0 = j1 ? new e.b() : null;
        this.J0 = new z();
        this.M0 = false;
        this.N0 = false;
        this.O0 = new n();
        this.P0 = false;
        this.R0 = new int[2];
        this.T0 = new int[2];
        this.U0 = new int[2];
        this.V0 = new int[2];
        this.W0 = new ArrayList();
        this.X0 = new RunnableC0292b();
        this.Z0 = 0;
        this.a1 = 0;
        this.b1 = new C0294d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.z0 = viewConfiguration.getScaledTouchSlop();
        this.D0 = AbstractC3208ae1.f(viewConfiguration, context);
        this.E0 = AbstractC3208ae1.j(viewConfiguration, context);
        this.B0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.C0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.B = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.r0.v(this.O0);
        v0();
        x0();
        w0();
        if (AbstractC2317Td1.B(this) == 0) {
            AbstractC2317Td1.z0(this, 1);
        }
        this.g0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.k(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4213eE0.a, i2, 0);
        AbstractC2317Td1.n0(this, context, AbstractC4213eE0.a, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        String string = typedArrayObtainStyledAttributes.getString(AbstractC4213eE0.j);
        if (typedArrayObtainStyledAttributes.getInt(AbstractC4213eE0.d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.I = typedArrayObtainStyledAttributes.getBoolean(AbstractC4213eE0.c, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(AbstractC4213eE0.e, false);
        this.V = z2;
        if (z2) {
            y0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(AbstractC4213eE0.h), typedArrayObtainStyledAttributes.getDrawable(AbstractC4213eE0.i), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(AbstractC4213eE0.f), typedArrayObtainStyledAttributes.getDrawable(AbstractC4213eE0.g));
        }
        typedArrayObtainStyledAttributes.recycle();
        A(context, string, attributeSet, i2, 0);
        int[] iArr = e1;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        AbstractC2317Td1.n0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i2, 0);
        boolean z3 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
        AbstractC0917Fx0.h(this, true);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public Parcelable D;

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
            this.D = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        public void b(SavedState savedState) {
            this.D = savedState.D;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.D, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class q extends ViewGroup.MarginLayoutParams {
        public D a;
        public final Rect b;
        public boolean c;
        public boolean d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public int a() {
            return this.a.q();
        }

        public boolean b() {
            return this.a.C();
        }

        public boolean c() {
            return this.a.z();
        }

        public boolean d() {
            return this.a.x();
        }

        public q(int i, int i2) {
            super(i, i2);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.O;
        if (pVar != null) {
            return pVar.G(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + U());
    }

    public static abstract class p {
        public androidx.recyclerview.widget.b a;
        public RecyclerView b;
        public final o.b c;
        public final o.b d;
        public androidx.recyclerview.widget.o e;
        public androidx.recyclerview.widget.o f;
        public y g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public int m;
        public boolean n;
        public int o;
        public int p;
        public int q;
        public int r;

        public class a implements o.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i) {
                return p.this.J(i);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b(View view) {
                return p.this.R(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return p.this.g0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d() {
                return p.this.r0() - p.this.h0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return p.this.U(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        public class b implements o.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i) {
                return p.this.J(i);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b(View view) {
                return p.this.V(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return p.this.j0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d() {
                return p.this.X() - p.this.e0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return p.this.P(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i, int i2);
        }

        public static class d {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public p() {
            a aVar = new a();
            this.c = aVar;
            b bVar = new b();
            this.d = bVar;
            this.e = new androidx.recyclerview.widget.o(aVar);
            this.f = new androidx.recyclerview.widget.o(bVar);
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = true;
            this.l = true;
        }

        public static int L(int i, int i2, int i3, int i4, boolean z) {
            int iMax = Math.max(0, i - i3);
            if (z) {
                if (i4 < 0) {
                    if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                        i2 = 0;
                        i4 = 0;
                    } else {
                        i4 = iMax;
                    }
                }
                i2 = 1073741824;
            } else {
                if (i4 < 0) {
                    if (i4 != -1) {
                        if (i4 == -2) {
                            i2 = (i2 == Integer.MIN_VALUE || i2 == 1073741824) ? Integer.MIN_VALUE : 0;
                        }
                        i2 = 0;
                        i4 = 0;
                    }
                    i4 = iMax;
                }
                i2 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        public static d l0(Context context, AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4213eE0.a, i, i2);
            dVar.a = typedArrayObtainStyledAttributes.getInt(AbstractC4213eE0.b, 1);
            dVar.b = typedArrayObtainStyledAttributes.getInt(AbstractC4213eE0.l, 1);
            dVar.c = typedArrayObtainStyledAttributes.getBoolean(AbstractC4213eE0.k, false);
            dVar.d = typedArrayObtainStyledAttributes.getBoolean(AbstractC4213eE0.m, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static int o(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        public static boolean z0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        public void A(RecyclerView recyclerView) {
            this.i = true;
            J0(recyclerView);
        }

        public boolean A0() {
            y yVar = this.g;
            return yVar != null && yVar.h();
        }

        public abstract void A1(int i);

        public void B(RecyclerView recyclerView, v vVar) {
            this.i = false;
            L0(recyclerView, vVar);
        }

        public boolean B0(View view, boolean z, boolean z2) {
            boolean z3 = this.e.b(view, 24579) && this.f.b(view, 24579);
            return z ? z3 : !z3;
        }

        public int B1(int i, v vVar, z zVar) {
            return 0;
        }

        public View C(View view) {
            View viewW;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (viewW = recyclerView.W(view)) == null || this.a.n(viewW)) {
                return null;
            }
            return viewW;
        }

        public void C0(View view, int i, int i2, int i3, int i4) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        public void C1(RecyclerView recyclerView) {
            D1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public View D(int i) {
            int iK = K();
            for (int i2 = 0; i2 < iK; i2++) {
                View viewJ = J(i2);
                D dM0 = RecyclerView.m0(viewJ);
                if (dM0 != null && dM0.q() == i && !dM0.N() && (this.b.J0.e() || !dM0.z())) {
                    return viewJ;
                }
            }
            return null;
        }

        public void D0(View view, int i, int i2) {
            q qVar = (q) view.getLayoutParams();
            Rect rectQ0 = this.b.q0(view);
            int i3 = i + rectQ0.left + rectQ0.right;
            int i4 = i2 + rectQ0.top + rectQ0.bottom;
            int iL = L(r0(), s0(), g0() + h0() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i3, ((ViewGroup.MarginLayoutParams) qVar).width, l());
            int iL2 = L(X(), Y(), j0() + e0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) qVar).height, m());
            if (I1(view, iL, iL2, qVar)) {
                view.measure(iL, iL2);
            }
        }

        public void D1(int i, int i2) {
            this.q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.o = mode;
            if (mode == 0 && !RecyclerView.h1) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.p = mode2;
            if (mode2 != 0 || RecyclerView.h1) {
                return;
            }
            this.r = 0;
        }

        public abstract q E();

        public void E0(int i, int i2) {
            View viewJ = J(i);
            if (viewJ != null) {
                y(i);
                i(viewJ, i2);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.b.toString());
            }
        }

        public void E1(int i, int i2) {
            this.b.setMeasuredDimension(i, i2);
        }

        public q F(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public void F0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.I0(i);
            }
        }

        public void F1(Rect rect, int i, int i2) {
            E1(o(i, rect.width() + g0() + h0(), d0()), o(i2, rect.height() + j0() + e0(), c0()));
        }

        public q G(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof q ? new q((q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        public void G0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.J0(i);
            }
        }

        public void G1(int i, int i2) {
            int iK = K();
            if (iK == 0) {
                this.b.B(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < iK; i7++) {
                View viewJ = J(i7);
                Rect rect = this.b.K;
                Q(viewJ, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.b.K.set(i5, i6, i3, i4);
            F1(this.b.K, i, i2);
        }

        public int H() {
            return -1;
        }

        public void H0(h hVar, h hVar2) {
        }

        public void H1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.b = null;
                this.a = null;
                this.q = 0;
                this.r = 0;
            } else {
                this.b = recyclerView;
                this.a = recyclerView.G;
                this.q = recyclerView.getWidth();
                this.r = recyclerView.getHeight();
            }
            this.o = 1073741824;
            this.p = 1073741824;
        }

        public int I(View view) {
            return ((q) view.getLayoutParams()).b.bottom;
        }

        public boolean I0(RecyclerView recyclerView, ArrayList arrayList, int i, int i2) {
            return false;
        }

        public boolean I1(View view, int i, int i2, q qVar) {
            return (!view.isLayoutRequested() && this.k && z0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) qVar).width) && z0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public View J(int i) {
            androidx.recyclerview.widget.b bVar = this.a;
            if (bVar != null) {
                return bVar.f(i);
            }
            return null;
        }

        public void J0(RecyclerView recyclerView) {
        }

        public boolean J1() {
            return false;
        }

        public int K() {
            androidx.recyclerview.widget.b bVar = this.a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public void K0(RecyclerView recyclerView) {
        }

        public boolean K1(View view, int i, int i2, q qVar) {
            return (this.k && z0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) qVar).width) && z0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public void L0(RecyclerView recyclerView, v vVar) {
            K0(recyclerView);
        }

        public abstract void L1(RecyclerView recyclerView, z zVar, int i);

        public final int[] M(View view, Rect rect) {
            int iG0 = g0();
            int iJ0 = j0();
            int iR0 = r0() - h0();
            int iX = X() - e0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i = left - iG0;
            int iMin = Math.min(0, i);
            int i2 = top - iJ0;
            int iMin2 = Math.min(0, i2);
            int i3 = iWidth - iR0;
            int iMax = Math.max(0, i3);
            int iMax2 = Math.max(0, iHeight - iX);
            if (a0() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i3);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i2, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        public View M0(View view, int i, v vVar, z zVar) {
            return null;
        }

        public void M1(y yVar) {
            y yVar2 = this.g;
            if (yVar2 != null && yVar != yVar2 && yVar2.h()) {
                this.g.r();
            }
            this.g = yVar;
            yVar.q(this.b, this);
        }

        public boolean N() {
            RecyclerView recyclerView = this.b;
            return recyclerView != null && recyclerView.I;
        }

        public void N0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            O0(recyclerView.D, recyclerView.J0, accessibilityEvent);
        }

        public void N1() {
            y yVar = this.g;
            if (yVar != null) {
                yVar.r();
            }
        }

        public int O(v vVar, z zVar) {
            return -1;
        }

        public void O0(v vVar, z zVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            h hVar = this.b.N;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.f());
            }
        }

        public boolean O1() {
            return false;
        }

        public int P(View view) {
            return view.getBottom() + I(view);
        }

        public void P0(v vVar, z zVar, Z1 z1) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                z1.a(8192);
                z1.N0(true);
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                z1.a(4096);
                z1.N0(true);
            }
            z1.p0(Z1.e.b(n0(vVar, zVar), O(vVar, zVar), y0(vVar, zVar), o0(vVar, zVar)));
        }

        public void Q(View view, Rect rect) {
            RecyclerView.n0(view, rect);
        }

        public void Q0(Z1 z1) {
            RecyclerView recyclerView = this.b;
            P0(recyclerView.D, recyclerView.J0, z1);
        }

        public int R(View view) {
            return view.getLeft() - b0(view);
        }

        public void R0(View view, Z1 z1) {
            D dM0 = RecyclerView.m0(view);
            if (dM0 == null || dM0.z() || this.a.n(dM0.a)) {
                return;
            }
            RecyclerView recyclerView = this.b;
            S0(recyclerView.D, recyclerView.J0, view, z1);
        }

        public int S(View view) {
            Rect rect = ((q) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int T(View view) {
            Rect rect = ((q) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public View T0(View view, int i) {
            return null;
        }

        public int U(View view) {
            return view.getRight() + m0(view);
        }

        public void U0(RecyclerView recyclerView, int i, int i2) {
        }

        public int V(View view) {
            return view.getTop() - p0(view);
        }

        public void V0(RecyclerView recyclerView) {
        }

        public View W() {
            View focusedChild;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void W0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public int X() {
            return this.r;
        }

        public void X0(RecyclerView recyclerView, int i, int i2) {
        }

        public int Y() {
            return this.p;
        }

        public void Y0(RecyclerView recyclerView, int i, int i2) {
        }

        public int Z() {
            RecyclerView recyclerView = this.b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.f();
            }
            return 0;
        }

        public void Z0(RecyclerView recyclerView, int i, int i2, Object obj) {
            Y0(recyclerView, i, i2);
        }

        public int a0() {
            return AbstractC2317Td1.D(this.b);
        }

        public abstract void a1(v vVar, z zVar);

        public int b0(View view) {
            return ((q) view.getLayoutParams()).b.left;
        }

        public void b1(z zVar) {
        }

        public void c(View view) {
            d(view, -1);
        }

        public int c0() {
            return AbstractC2317Td1.E(this.b);
        }

        public void c1(v vVar, z zVar, int i, int i2) {
            this.b.B(i, i2);
        }

        public void d(View view, int i) {
            g(view, i, true);
        }

        public int d0() {
            return AbstractC2317Td1.F(this.b);
        }

        public boolean d1(RecyclerView recyclerView, View view, View view2) {
            return A0() || recyclerView.C0();
        }

        public void e(View view) {
            f(view, -1);
        }

        public int e0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public boolean e1(RecyclerView recyclerView, z zVar, View view, View view2) {
            return d1(recyclerView, view, view2);
        }

        public void f(View view, int i) {
            g(view, i, false);
        }

        public int f0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return AbstractC2317Td1.H(recyclerView);
            }
            return 0;
        }

        public void f1(Parcelable parcelable) {
        }

        public final void g(View view, int i, boolean z) {
            D dM0 = RecyclerView.m0(view);
            if (z || dM0.z()) {
                this.b.H.b(dM0);
            } else {
                this.b.H.p(dM0);
            }
            q qVar = (q) view.getLayoutParams();
            if (dM0.P() || dM0.A()) {
                if (dM0.A()) {
                    dM0.O();
                } else {
                    dM0.g();
                }
                this.a.c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.b) {
                int iM = this.a.m(view);
                if (i == -1) {
                    i = this.a.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.U());
                }
                if (iM != i) {
                    this.b.O.E0(iM, i);
                }
            } else {
                this.a.a(view, i, false);
                qVar.c = true;
                y yVar = this.g;
                if (yVar != null && yVar.h()) {
                    this.g.k(view);
                }
            }
            if (qVar.d) {
                if (RecyclerView.d1) {
                    Objects.toString(qVar.a);
                }
                dM0.a.invalidate();
                qVar.d = false;
            }
        }

        public int g0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public Parcelable g1() {
            return null;
        }

        public void h(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.q(str);
            }
        }

        public int h0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void h1(int i) {
        }

        public void i(View view, int i) {
            j(view, i, (q) view.getLayoutParams());
        }

        public int i0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return AbstractC2317Td1.I(recyclerView);
            }
            return 0;
        }

        public void i1(y yVar) {
            if (this.g == yVar) {
                this.g = null;
            }
        }

        public void j(View view, int i, q qVar) {
            D dM0 = RecyclerView.m0(view);
            if (dM0.z()) {
                this.b.H.b(dM0);
            } else {
                this.b.H.p(dM0);
            }
            this.a.c(view, i, qVar, dM0.z());
        }

        public int j0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public boolean j1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return k1(recyclerView.D, recyclerView.J0, i, bundle);
        }

        public void k(View view, Rect rect) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.q0(view));
            }
        }

        public int k0(View view) {
            return ((q) view.getLayoutParams()).a();
        }

        public boolean k1(v vVar, z zVar, int i, Bundle bundle) {
            int iJ0;
            int iG0;
            int i2;
            int i3;
            if (this.b == null) {
                return false;
            }
            int iX = X();
            int iR0 = r0();
            Rect rect = new Rect();
            if (this.b.getMatrix().isIdentity() && this.b.getGlobalVisibleRect(rect)) {
                iX = rect.height();
                iR0 = rect.width();
            }
            if (i == 4096) {
                iJ0 = this.b.canScrollVertically(1) ? (iX - j0()) - e0() : 0;
                if (this.b.canScrollHorizontally(1)) {
                    iG0 = (iR0 - g0()) - h0();
                    i2 = iJ0;
                    i3 = iG0;
                }
                i2 = iJ0;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                iJ0 = this.b.canScrollVertically(-1) ? -((iX - j0()) - e0()) : 0;
                if (this.b.canScrollHorizontally(-1)) {
                    iG0 = -((iR0 - g0()) - h0());
                    i2 = iJ0;
                    i3 = iG0;
                }
                i2 = iJ0;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.b.A1(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        public abstract boolean l();

        public boolean l1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return m1(recyclerView.D, recyclerView.J0, view, i, bundle);
        }

        public boolean m() {
            return false;
        }

        public int m0(View view) {
            return ((q) view.getLayoutParams()).b.right;
        }

        public boolean m1(v vVar, z zVar, View view, int i, Bundle bundle) {
            return false;
        }

        public boolean n(q qVar) {
            return qVar != null;
        }

        public int n0(v vVar, z zVar) {
            return -1;
        }

        public void n1(v vVar) {
            for (int iK = K() - 1; iK >= 0; iK--) {
                if (!RecyclerView.m0(J(iK)).N()) {
                    q1(iK, vVar);
                }
            }
        }

        public int o0(v vVar, z zVar) {
            return 0;
        }

        public void o1(v vVar) {
            int iJ = vVar.j();
            for (int i = iJ - 1; i >= 0; i--) {
                View viewN = vVar.n(i);
                D dM0 = RecyclerView.m0(viewN);
                if (!dM0.N()) {
                    dM0.K(false);
                    if (dM0.B()) {
                        this.b.removeDetachedView(viewN, false);
                    }
                    m mVar = this.b.r0;
                    if (mVar != null) {
                        mVar.j(dM0);
                    }
                    dM0.K(true);
                    vVar.D(viewN);
                }
            }
            vVar.e();
            if (iJ > 0) {
                this.b.invalidate();
            }
        }

        public void p(int i, int i2, z zVar, c cVar) {
        }

        public int p0(View view) {
            return ((q) view.getLayoutParams()).b.top;
        }

        public void p1(View view, v vVar) {
            s1(view);
            vVar.G(view);
        }

        public void q(int i, c cVar) {
        }

        public void q0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((q) view.getLayoutParams()).b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.b.M;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void q1(int i, v vVar) {
            View viewJ = J(i);
            t1(i);
            vVar.G(viewJ);
        }

        public abstract int r(z zVar);

        public int r0() {
            return this.q;
        }

        public boolean r1(Runnable runnable) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public abstract int s(z zVar);

        public int s0() {
            return this.o;
        }

        public void s1(View view) {
            this.a.p(view);
        }

        public abstract int t(z zVar);

        public boolean t0() {
            int iK = K();
            for (int i = 0; i < iK; i++) {
                ViewGroup.LayoutParams layoutParams = J(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void t1(int i) {
            if (J(i) != null) {
                this.a.q(i);
            }
        }

        public int u(z zVar) {
            return 0;
        }

        public boolean u0() {
            return this.i;
        }

        public boolean u1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return v1(recyclerView, view, rect, z, false);
        }

        public int v(z zVar) {
            return 0;
        }

        public boolean v0() {
            return this.j;
        }

        public boolean v1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] iArrM = M(view, rect);
            int i = iArrM[0];
            int i2 = iArrM[1];
            if ((z2 && !w0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.x1(i, i2);
            }
            return true;
        }

        public int w(z zVar) {
            return 0;
        }

        public final boolean w0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iG0 = g0();
            int iJ0 = j0();
            int iR0 = r0() - h0();
            int iX = X() - e0();
            Rect rect = this.b.K;
            Q(focusedChild, rect);
            return rect.left - i < iR0 && rect.right - i > iG0 && rect.top - i2 < iX && rect.bottom - i2 > iJ0;
        }

        public void w1() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void x(v vVar) {
            for (int iK = K() - 1; iK >= 0; iK--) {
                y1(vVar, iK, J(iK));
            }
        }

        public final boolean x0() {
            return this.l;
        }

        public void x1() {
            this.h = true;
        }

        public void y(int i) {
            z(i, J(i));
        }

        public boolean y0(v vVar, z zVar) {
            return false;
        }

        public final void y1(v vVar, int i, View view) {
            D dM0 = RecyclerView.m0(view);
            if (dM0.N()) {
                if (RecyclerView.d1) {
                    dM0.toString();
                }
            } else if (dM0.x() && !dM0.z() && !this.b.N.j()) {
                t1(i);
                vVar.H(dM0);
            } else {
                y(i);
                vVar.I(view);
                this.b.H.k(dM0);
            }
        }

        public final void z(int i, View view) {
            this.a.d(i);
        }

        public abstract int z1(int i, v vVar, z zVar);

        public void S0(v vVar, z zVar, View view, Z1 z1) {
        }
    }
}
