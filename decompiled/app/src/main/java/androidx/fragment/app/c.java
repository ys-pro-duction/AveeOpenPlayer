package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import com.daaw.AbstractC1041Hc0;
import com.daaw.AbstractC2217Se1;
import com.daaw.AbstractC2425Ue1;
import com.daaw.AbstractC2529Ve1;
import com.daaw.AbstractC5247hu;
import com.daaw.AbstractC9240w90;
import com.daaw.C0313Ae1;
import com.daaw.C3804cm0;
import com.daaw.C4828gQ;
import com.daaw.C5208hm0;
import com.daaw.C6512mQ;
import com.daaw.C9345wZ0;
import com.daaw.GR0;
import com.daaw.InterfaceC0417Be1;
import com.daaw.InterfaceC1764Ob0;
import com.daaw.InterfaceC3135aN0;
import com.daaw.MP;
import com.daaw.OP;
import com.daaw.QP;
import com.daaw.YM0;
import com.daaw.ZM0;
import com.daaw.ZP;
import com.revenuecat.purchases.common.Constants;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1764Ob0, InterfaceC0417Be1, androidx.lifecycle.e, InterfaceC3135aN0 {
    public static final Object F0 = new Object();
    public ZM0 A0;
    public int B0;
    public Bundle C;
    public SparseArray D;
    public Bundle E;
    public Boolean F;
    public Bundle H;
    public c I;
    public int K;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public FragmentManager W;
    public QP X;
    public c Z;
    public int a0;
    public int b0;
    public String c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean j0;
    public ViewGroup k0;
    public View l0;
    public boolean m0;
    public g o0;
    public Handler p0;
    public boolean r0;
    public LayoutInflater s0;
    public boolean t0;
    public String u0;
    public l w0;
    public C6512mQ x0;
    public y.c z0;
    public int B = -1;
    public String G = UUID.randomUUID().toString();
    public String J = null;
    public Boolean L = null;
    public FragmentManager Y = new ZP();
    public boolean i0 = true;
    public boolean n0 = true;
    public Runnable q0 = new a();
    public g.b v0 = g.b.RESUMED;
    public C5208hm0 y0 = new C5208hm0();
    public final AtomicInteger C0 = new AtomicInteger();
    public final ArrayList D0 = new ArrayList();
    public final i E0 = new b();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.H1();
        }
    }

    public class b extends i {
        public b() {
            super(null);
        }

        @Override // androidx.fragment.app.c.i
        public void a() {
            c.this.A0.c();
            u.c(c.this);
            Bundle bundle = c.this.C;
            c.this.A0.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$c, reason: collision with other inner class name */
    public class RunnableC0018c implements Runnable {
        public RunnableC0018c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f(false);
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ androidx.fragment.app.h B;

        public d(androidx.fragment.app.h hVar) {
            this.B = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.B.w()) {
                this.B.n();
            }
        }
    }

    public class e extends OP {
        public e() {
        }

        @Override // com.daaw.OP
        public View k(int i) {
            View view = c.this.l0;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + c.this + " does not have a view");
        }

        @Override // com.daaw.OP
        public boolean m() {
            return c.this.l0 != null;
        }
    }

    public class f implements j {
        public f() {
        }

        @Override // androidx.lifecycle.j
        public void c(InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
            View view;
            if (aVar != g.a.ON_STOP || (view = c.this.l0) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    public static class g {
        public View a;
        public boolean b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public ArrayList h;
        public ArrayList i;
        public Object j = null;
        public Object k;
        public Object l;
        public Object m;
        public Object n;
        public Object o;
        public Boolean p;
        public Boolean q;
        public float r;
        public View s;
        public boolean t;

        public g() {
            Object obj = c.F0;
            this.k = obj;
            this.l = null;
            this.m = obj;
            this.n = null;
            this.o = obj;
            this.r = 1.0f;
            this.s = null;
        }
    }

    public static class h extends RuntimeException {
        public h(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static abstract class i {
        public i() {
        }

        public abstract void a();

        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    public c() {
        a0();
    }

    public static c c0(Context context, String str, Bundle bundle) {
        try {
            c cVar = (c) androidx.fragment.app.e.d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return cVar;
            }
            bundle.setClassLoader(cVar.getClass().getClassLoader());
            cVar.y1(bundle);
            return cVar;
        } catch (IllegalAccessException e2) {
            throw new h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new h("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new h("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    public static /* synthetic */ void e(c cVar) {
        cVar.x0.e(cVar.E);
        cVar.E = null;
    }

    public Object A() {
        g gVar = this.o0;
        if (gVar == null) {
            return null;
        }
        return gVar.l;
    }

    public LayoutInflater A0(Bundle bundle) {
        return E(bundle);
    }

    public void A1(int i2) {
        if (this.o0 == null && i2 == 0) {
            return;
        }
        i();
        this.o0.g = i2;
    }

    public GR0 B() {
        g gVar = this.o0;
        if (gVar == null) {
            return null;
        }
        gVar.getClass();
        return null;
    }

    public void B0(boolean z) {
    }

    public void B1(boolean z) {
        if (this.o0 == null) {
            return;
        }
        i().b = z;
    }

    public View C() {
        g gVar = this.o0;
        if (gVar == null) {
            return null;
        }
        return gVar.s;
    }

    public void C0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.j0 = true;
    }

    public void C1(float f2) {
        i().r = f2;
    }

    public final Object D() {
        QP qp = this.X;
        if (qp == null) {
            return null;
        }
        return qp.y();
    }

    public void D0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.j0 = true;
        QP qp = this.X;
        Activity activityO = qp == null ? null : qp.o();
        if (activityO != null) {
            this.j0 = false;
            C0(activityO, attributeSet, bundle);
        }
    }

    public void D1(ArrayList arrayList, ArrayList arrayList2) {
        i();
        g gVar = this.o0;
        gVar.h = arrayList;
        gVar.i = arrayList2;
    }

    public LayoutInflater E(Bundle bundle) {
        QP qp = this.X;
        if (qp == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterZ = qp.z();
        AbstractC9240w90.a(layoutInflaterZ, this.Y.x0());
        return layoutInflaterZ;
    }

    public void E0(boolean z) {
    }

    public void E1(Intent intent) {
        F1(intent, null);
    }

    public final int F() {
        g.b bVar = this.v0;
        return (bVar == g.b.INITIALIZED || this.Z == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.Z.F());
    }

    public boolean F0(MenuItem menuItem) {
        return false;
    }

    public void F1(Intent intent, Bundle bundle) {
        QP qp = this.X;
        if (qp != null) {
            qp.A(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public int G() {
        g gVar = this.o0;
        if (gVar == null) {
            return 0;
        }
        return gVar.g;
    }

    public void G0(Menu menu) {
    }

    public void G1(Intent intent, int i2, Bundle bundle) {
        if (this.X != null) {
            I().R0(this, intent, i2, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final c H() {
        return this.Z;
    }

    public void H0() {
        this.j0 = true;
    }

    public void H1() {
        if (this.o0 == null || !i().t) {
            return;
        }
        if (this.X == null) {
            i().t = false;
        } else if (Looper.myLooper() != this.X.t().getLooper()) {
            this.X.t().postAtFrontOfQueue(new RunnableC0018c());
        } else {
            f(true);
        }
    }

    public final FragmentManager I() {
        FragmentManager fragmentManager = this.W;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void I0(boolean z) {
    }

    public boolean J() {
        g gVar = this.o0;
        if (gVar == null) {
            return false;
        }
        return gVar.b;
    }

    public void J0(Menu menu) {
    }

    public int K() {
        g gVar = this.o0;
        if (gVar == null) {
            return 0;
        }
        return gVar.e;
    }

    public void K0(boolean z) {
    }

    public int L() {
        g gVar = this.o0;
        if (gVar == null) {
            return 0;
        }
        return gVar.f;
    }

    public void L0(int i2, String[] strArr, int[] iArr) {
    }

    public float M() {
        g gVar = this.o0;
        if (gVar == null) {
            return 1.0f;
        }
        return gVar.r;
    }

    public void M0() {
        this.j0 = true;
    }

    public Object N() {
        g gVar = this.o0;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.m;
        return obj == F0 ? A() : obj;
    }

    public void N0(Bundle bundle) {
    }

    public final Resources O() {
        return s1().getResources();
    }

    public void O0() {
        this.j0 = true;
    }

    public Object P() {
        g gVar = this.o0;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.k;
        return obj == F0 ? x() : obj;
    }

    public void P0() {
        this.j0 = true;
    }

    public Object Q() {
        g gVar = this.o0;
        if (gVar == null) {
            return null;
        }
        return gVar.n;
    }

    public void Q0(View view, Bundle bundle) {
    }

    public Object R() {
        g gVar = this.o0;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.o;
        return obj == F0 ? Q() : obj;
    }

    public void R0(Bundle bundle) {
        this.j0 = true;
    }

    public ArrayList S() {
        ArrayList arrayList;
        g gVar = this.o0;
        return (gVar == null || (arrayList = gVar.h) == null) ? new ArrayList() : arrayList;
    }

    public void S0(Bundle bundle) {
        this.Y.T0();
        this.B = 3;
        this.j0 = false;
        l0(bundle);
        if (this.j0) {
            v1();
            this.Y.y();
        } else {
            throw new C9345wZ0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public ArrayList T() {
        ArrayList arrayList;
        g gVar = this.o0;
        return (gVar == null || (arrayList = gVar.i) == null) ? new ArrayList() : arrayList;
    }

    public void T0() {
        Iterator it = this.D0.iterator();
        while (it.hasNext()) {
            ((i) it.next()).a();
        }
        this.D0.clear();
        this.Y.m(this.X, g(), this);
        this.B = 0;
        this.j0 = false;
        o0(this.X.r());
        if (this.j0) {
            this.W.I(this);
            this.Y.z();
        } else {
            throw new C9345wZ0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public final String U(int i2) {
        return O().getString(i2);
    }

    public void U0(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public final String V(int i2, Object... objArr) {
        return O().getString(i2, objArr);
    }

    public boolean V0(MenuItem menuItem) {
        if (this.d0) {
            return false;
        }
        if (q0(menuItem)) {
            return true;
        }
        return this.Y.B(menuItem);
    }

    public final c W(boolean z) {
        String str;
        if (z) {
            C4828gQ.h(this);
        }
        c cVar = this.I;
        if (cVar != null) {
            return cVar;
        }
        FragmentManager fragmentManager = this.W;
        if (fragmentManager == null || (str = this.J) == null) {
            return null;
        }
        return fragmentManager.g0(str);
    }

    public void W0(Bundle bundle) {
        this.Y.T0();
        this.B = 1;
        this.j0 = false;
        this.w0.a(new f());
        r0(bundle);
        this.t0 = true;
        if (this.j0) {
            this.w0.i(g.a.ON_CREATE);
            return;
        }
        throw new C9345wZ0("Fragment " + this + " did not call through to super.onCreate()");
    }

    public View X() {
        return this.l0;
    }

    public boolean X0(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.d0) {
            return false;
        }
        if (this.h0 && this.i0) {
            u0(menu, menuInflater);
            z = true;
        }
        return this.Y.D(menu, menuInflater) | z;
    }

    public InterfaceC1764Ob0 Y() {
        C6512mQ c6512mQ = this.x0;
        if (c6512mQ != null) {
            return c6512mQ;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public void Y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.Y.T0();
        this.U = true;
        this.x0 = new C6512mQ(this, n(), new Runnable() { // from class: com.daaw.EP
            @Override // java.lang.Runnable
            public final void run() {
                androidx.fragment.app.c.e(this.B);
            }
        });
        View viewV0 = v0(layoutInflater, viewGroup, bundle);
        this.l0 = viewV0;
        if (viewV0 == null) {
            if (this.x0.d()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.x0 = null;
            return;
        }
        this.x0.b();
        if (FragmentManager.J0(3)) {
            Objects.toString(this.l0);
            toString();
        }
        AbstractC2217Se1.b(this.l0, this.x0);
        AbstractC2529Ve1.b(this.l0, this.x0);
        AbstractC2425Ue1.b(this.l0, this.x0);
        this.y0.l(this.x0);
    }

    public m Z() {
        return this.y0;
    }

    public void Z0() {
        this.Y.E();
        this.w0.i(g.a.ON_DESTROY);
        this.B = 0;
        this.j0 = false;
        this.t0 = false;
        w0();
        if (this.j0) {
            return;
        }
        throw new C9345wZ0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public final void a0() {
        this.w0 = new l(this);
        this.A0 = ZM0.a(this);
        this.z0 = null;
        if (this.D0.contains(this.E0)) {
            return;
        }
        q1(this.E0);
    }

    public void a1() {
        this.Y.F();
        if (this.l0 != null && this.x0.w().b().c(g.b.CREATED)) {
            this.x0.a(g.a.ON_DESTROY);
        }
        this.B = 1;
        this.j0 = false;
        y0();
        if (this.j0) {
            AbstractC1041Hc0.b(this).c();
            this.U = false;
        } else {
            throw new C9345wZ0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public void b0() {
        a0();
        this.u0 = this.G;
        this.G = UUID.randomUUID().toString();
        this.M = false;
        this.N = false;
        this.Q = false;
        this.R = false;
        this.T = false;
        this.V = 0;
        this.W = null;
        this.Y = new ZP();
        this.X = null;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = null;
        this.d0 = false;
        this.e0 = false;
    }

    public void b1() {
        this.B = -1;
        this.j0 = false;
        z0();
        this.s0 = null;
        if (this.j0) {
            if (this.Y.I0()) {
                return;
            }
            this.Y.E();
            this.Y = new ZP();
            return;
        }
        throw new C9345wZ0("Fragment " + this + " did not call through to super.onDetach()");
    }

    public LayoutInflater c1(Bundle bundle) {
        LayoutInflater layoutInflaterA0 = A0(bundle);
        this.s0 = layoutInflaterA0;
        return layoutInflaterA0;
    }

    public final boolean d0() {
        return this.X != null && this.M;
    }

    public void d1() {
        onLowMemory();
    }

    public final boolean e0() {
        if (this.d0) {
            return true;
        }
        FragmentManager fragmentManager = this.W;
        return fragmentManager != null && fragmentManager.M0(this.Z);
    }

    public void e1(boolean z) {
        E0(z);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        g gVar = this.o0;
        if (gVar != null) {
            gVar.t = false;
        }
        if (this.l0 == null || (viewGroup = this.k0) == null || (fragmentManager = this.W) == null) {
            return;
        }
        androidx.fragment.app.h hVarU = androidx.fragment.app.h.u(viewGroup, fragmentManager);
        hVarU.x();
        if (z) {
            this.X.t().post(new d(hVarU));
        } else {
            hVarU.n();
        }
        Handler handler = this.p0;
        if (handler != null) {
            handler.removeCallbacks(this.q0);
            this.p0 = null;
        }
    }

    public final boolean f0() {
        return this.V > 0;
    }

    public boolean f1(MenuItem menuItem) {
        if (this.d0) {
            return false;
        }
        if (this.h0 && this.i0 && F0(menuItem)) {
            return true;
        }
        return this.Y.K(menuItem);
    }

    public OP g() {
        return new e();
    }

    public final boolean g0() {
        if (!this.i0) {
            return false;
        }
        FragmentManager fragmentManager = this.W;
        return fragmentManager == null || fragmentManager.N0(this.Z);
    }

    public void g1(Menu menu) {
        if (this.d0) {
            return;
        }
        if (this.h0 && this.i0) {
            G0(menu);
        }
        this.Y.L(menu);
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.a0));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.b0));
        printWriter.print(" mTag=");
        printWriter.println(this.c0);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.B);
        printWriter.print(" mWho=");
        printWriter.print(this.G);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.V);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.M);
        printWriter.print(" mRemoving=");
        printWriter.print(this.N);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.Q);
        printWriter.print(" mInLayout=");
        printWriter.println(this.R);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.d0);
        printWriter.print(" mDetached=");
        printWriter.print(this.e0);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.i0);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.h0);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f0);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.n0);
        if (this.W != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.W);
        }
        if (this.X != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.X);
        }
        if (this.Z != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.Z);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.H);
        }
        if (this.C != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.C);
        }
        if (this.D != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.D);
        }
        if (this.E != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.E);
        }
        c cVarW = W(false);
        if (cVarW != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(cVarW);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.K);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(J());
        if (v() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(v());
        }
        if (z() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(z());
        }
        if (K() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(K());
        }
        if (L() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(L());
        }
        if (this.k0 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.k0);
        }
        if (this.l0 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.l0);
        }
        if (r() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(r());
        }
        if (u() != null) {
            AbstractC1041Hc0.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.Y + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        this.Y.X(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public boolean h0() {
        g gVar = this.o0;
        if (gVar == null) {
            return false;
        }
        return gVar.t;
    }

    public void h1() {
        this.Y.N();
        if (this.l0 != null) {
            this.x0.a(g.a.ON_PAUSE);
        }
        this.w0.i(g.a.ON_PAUSE);
        this.B = 6;
        this.j0 = false;
        H0();
        if (this.j0) {
            return;
        }
        throw new C9345wZ0("Fragment " + this + " did not call through to super.onPause()");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final g i() {
        if (this.o0 == null) {
            this.o0 = new g();
        }
        return this.o0;
    }

    public final boolean i0() {
        return this.N;
    }

    public void i1(boolean z) {
        I0(z);
    }

    @Override // androidx.lifecycle.e
    public y.c j() {
        Application application;
        if (this.W == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.z0 == null) {
            Context applicationContext = s1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && FragmentManager.J0(3)) {
                Objects.toString(s1().getApplicationContext());
            }
            this.z0 = new v(application, this, s());
        }
        return this.z0;
    }

    public final boolean j0() {
        FragmentManager fragmentManager = this.W;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.Q0();
    }

    public boolean j1(Menu menu) {
        boolean z = false;
        if (this.d0) {
            return false;
        }
        if (this.h0 && this.i0) {
            J0(menu);
            z = true;
        }
        return this.Y.P(menu) | z;
    }

    @Override // androidx.lifecycle.e
    public AbstractC5247hu k() {
        Application application;
        Context applicationContext = s1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && FragmentManager.J0(3)) {
            Objects.toString(s1().getApplicationContext());
        }
        C3804cm0 c3804cm0 = new C3804cm0();
        if (application != null) {
            c3804cm0.c(y.a.g, application);
        }
        c3804cm0.c(u.a, this);
        c3804cm0.c(u.b, this);
        if (s() != null) {
            c3804cm0.c(u.c, s());
        }
        return c3804cm0;
    }

    public void k0() {
        this.Y.T0();
    }

    public void k1() {
        boolean zO0 = this.W.O0(this);
        Boolean bool = this.L;
        if (bool == null || bool.booleanValue() != zO0) {
            this.L = Boolean.valueOf(zO0);
            K0(zO0);
            this.Y.Q();
        }
    }

    public c l(String str) {
        return str.equals(this.G) ? this : this.Y.k0(str);
    }

    public void l0(Bundle bundle) {
        this.j0 = true;
    }

    public void l1() {
        this.Y.T0();
        this.Y.b0(true);
        this.B = 7;
        this.j0 = false;
        M0();
        if (!this.j0) {
            throw new C9345wZ0("Fragment " + this + " did not call through to super.onResume()");
        }
        l lVar = this.w0;
        g.a aVar = g.a.ON_RESUME;
        lVar.i(aVar);
        if (this.l0 != null) {
            this.x0.a(aVar);
        }
        this.Y.R();
    }

    public final MP m() {
        QP qp = this.X;
        if (qp == null) {
            return null;
        }
        return (MP) qp.o();
    }

    public void m0(int i2, int i3, Intent intent) {
        if (FragmentManager.J0(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void m1(Bundle bundle) {
        N0(bundle);
    }

    @Override // com.daaw.InterfaceC0417Be1
    public C0313Ae1 n() {
        if (this.W == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (F() != g.b.INITIALIZED.ordinal()) {
            return this.W.E0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public void n0(Activity activity) {
        this.j0 = true;
    }

    public void n1() {
        this.Y.T0();
        this.Y.b0(true);
        this.B = 5;
        this.j0 = false;
        O0();
        if (!this.j0) {
            throw new C9345wZ0("Fragment " + this + " did not call through to super.onStart()");
        }
        l lVar = this.w0;
        g.a aVar = g.a.ON_START;
        lVar.i(aVar);
        if (this.l0 != null) {
            this.x0.a(aVar);
        }
        this.Y.S();
    }

    public boolean o() {
        Boolean bool;
        g gVar = this.o0;
        if (gVar == null || (bool = gVar.q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void o0(Context context) {
        this.j0 = true;
        QP qp = this.X;
        Activity activityO = qp == null ? null : qp.o();
        if (activityO != null) {
            this.j0 = false;
            n0(activityO);
        }
    }

    public void o1() {
        this.Y.U();
        if (this.l0 != null) {
            this.x0.a(g.a.ON_STOP);
        }
        this.w0.i(g.a.ON_STOP);
        this.B = 4;
        this.j0 = false;
        P0();
        if (this.j0) {
            return;
        }
        throw new C9345wZ0("Fragment " + this + " did not call through to super.onStop()");
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.j0 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        r1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.j0 = true;
    }

    @Override // com.daaw.InterfaceC3135aN0
    public final YM0 p() {
        return this.A0.b();
    }

    public void p0(c cVar) {
    }

    public void p1() {
        Bundle bundle = this.C;
        Q0(this.l0, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.Y.V();
    }

    public boolean q() {
        Boolean bool;
        g gVar = this.o0;
        if (gVar == null || (bool = gVar.p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean q0(MenuItem menuItem) {
        return false;
    }

    public final void q1(i iVar) {
        if (this.B >= 0) {
            iVar.a();
        } else {
            this.D0.add(iVar);
        }
    }

    public View r() {
        g gVar = this.o0;
        if (gVar == null) {
            return null;
        }
        return gVar.a;
    }

    public void r0(Bundle bundle) {
        this.j0 = true;
        u1();
        if (this.Y.P0(1)) {
            return;
        }
        this.Y.C();
    }

    public final MP r1() {
        MP mpM = m();
        if (mpM != null) {
            return mpM;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle s() {
        return this.H;
    }

    public Animation s0(int i2, boolean z, int i3) {
        return null;
    }

    public final Context s1() {
        Context contextU = u();
        if (contextU != null) {
            return contextU;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void startActivityForResult(Intent intent, int i2) {
        G1(intent, i2, null);
    }

    public final FragmentManager t() {
        if (this.X != null) {
            return this.Y;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Animator t0(int i2, boolean z, int i3) {
        return null;
    }

    public final View t1() {
        View viewX = X();
        if (viewX != null) {
            return viewX;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.G);
        if (this.a0 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.a0));
        }
        if (this.c0 != null) {
            sb.append(" tag=");
            sb.append(this.c0);
        }
        sb.append(")");
        return sb.toString();
    }

    public Context u() {
        QP qp = this.X;
        if (qp == null) {
            return null;
        }
        return qp.r();
    }

    public void u0(Menu menu, MenuInflater menuInflater) {
    }

    public void u1() {
        Bundle bundle;
        Bundle bundle2 = this.C;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.Y.g1(bundle);
        this.Y.C();
    }

    public int v() {
        g gVar = this.o0;
        if (gVar == null) {
            return 0;
        }
        return gVar.c;
    }

    public View v0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.B0;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    public final void v1() {
        if (FragmentManager.J0(3)) {
            toString();
        }
        if (this.l0 != null) {
            Bundle bundle = this.C;
            w1(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.C = null;
    }

    @Override // com.daaw.InterfaceC1764Ob0
    public androidx.lifecycle.g w() {
        return this.w0;
    }

    public void w0() {
        this.j0 = true;
    }

    public final void w1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.D;
        if (sparseArray != null) {
            this.l0.restoreHierarchyState(sparseArray);
            this.D = null;
        }
        this.j0 = false;
        R0(bundle);
        if (this.j0) {
            if (this.l0 != null) {
                this.x0.a(g.a.ON_CREATE);
            }
        } else {
            throw new C9345wZ0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public Object x() {
        g gVar = this.o0;
        if (gVar == null) {
            return null;
        }
        return gVar.j;
    }

    public void x0() {
    }

    public void x1(int i2, int i3, int i4, int i5) {
        if (this.o0 == null && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return;
        }
        i().c = i2;
        i().d = i3;
        i().e = i4;
        i().f = i5;
    }

    public GR0 y() {
        g gVar = this.o0;
        if (gVar == null) {
            return null;
        }
        gVar.getClass();
        return null;
    }

    public void y0() {
        this.j0 = true;
    }

    public void y1(Bundle bundle) {
        if (this.W != null && j0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.H = bundle;
    }

    public int z() {
        g gVar = this.o0;
        if (gVar == null) {
            return 0;
        }
        return gVar.d;
    }

    public void z0() {
        this.j0 = true;
    }

    public void z1(View view) {
        i().s = view;
    }
}
