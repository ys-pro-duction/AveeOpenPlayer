package com.daaw;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.daaw.AbstractC7898rO;
import com.daaw.C6295le1;
import com.daaw.C6423m5;
import com.daaw.C9982yp0;
import com.daaw.E90;
import com.daaw.G70;
import com.daaw.InterfaceC1073Hk0;
import com.daaw.InterfaceC1413Kr0;
import com.daaw.InterfaceC6225lO;
import com.daaw.WZ;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.daaw.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6423m5 extends ViewGroup implements InterfaceC1413Kr0, InterfaceC1673Ne1, InterfaceC1956Px0, DefaultLifecycleObserver {
    public static final a S0 = new a(null);
    public static Class T0;
    public static Method U0;
    public final InterfaceC6225lO.a A0;
    public long B;
    public final InterfaceC8007rm0 B0;
    public boolean C;
    public int C0;
    public final G90 D;
    public final InterfaceC8007rm0 D0;
    public InterfaceC4988gz E;
    public final DU E0;
    public final C7903rP0 F;
    public final YZ F0;
    public final QN G;
    public final Q21 G0;
    public final C4626fh1 H;
    public MotionEvent H0;
    public final Q70 I;
    public long I0;
    public final InterfaceC1073Hk0 J;
    public final C7421pg1 J0;
    public final C7434pj K;
    public final C8565tm0 K0;
    public final E90 L;
    public final h L0;
    public final VJ0 M;
    public final Runnable M0;
    public final C9305wP0 N;
    public boolean N0;
    public final C7260p5 O;
    public final LQ O0;
    public final C1875Pd P;
    public final InterfaceC0327Ai P0;
    public final List Q;
    public InterfaceC5819jx0 Q0;
    public List R;
    public final InterfaceC6386lx0 R0;
    public boolean S;
    public final C8281sl0 T;
    public final C8617tx0 U;
    public NQ V;
    public final C8370t4 W;
    public boolean a0;
    public final C4450f5 b0;
    public final C6697n4 c0;
    public final C1620Mr0 d0;
    public boolean e0;
    public D6 f0;
    public GD g0;
    public C6079kr h0;
    public boolean i0;
    public final C0749Eh0 j0;
    public final InterfaceC2733Xd1 k0;
    public long l0;
    public final int[] m0;
    public final float[] n0;
    public final float[] o0;
    public long p0;
    public boolean q0;
    public long r0;
    public boolean s0;
    public final InterfaceC8007rm0 t0;
    public NQ u0;
    public final ViewTreeObserver.OnGlobalLayoutListener v0;
    public final ViewTreeObserver.OnScrollChangedListener w0;
    public final ViewTreeObserver.OnTouchModeChangeListener x0;
    public final C7804r21 y0;
    public final C7526q21 z0;

    /* JADX INFO: renamed from: com.daaw.m5$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final boolean b() {
            try {
                if (C6423m5.T0 == null) {
                    C6423m5.T0 = Class.forName("android.os.SystemProperties");
                    Class cls = C6423m5.T0;
                    C6423m5.U0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = C6423m5.U0;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
            } catch (Exception unused) {
            }
            return false;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.m5$b */
    public static final class b {
        public final InterfaceC1764Ob0 a;
        public final InterfaceC3135aN0 b;

        public b(InterfaceC1764Ob0 interfaceC1764Ob0, InterfaceC3135aN0 interfaceC3135aN0) {
            G10.g(interfaceC1764Ob0, "lifecycleOwner");
            G10.g(interfaceC3135aN0, "savedStateRegistryOwner");
            this.a = interfaceC1764Ob0;
            this.b = interfaceC3135aN0;
        }

        public final InterfaceC1764Ob0 a() {
            return this.a;
        }

        public final InterfaceC3135aN0 b() {
            return this.b;
        }
    }

    /* JADX INFO: renamed from: com.daaw.m5$c */
    public static final class c extends AbstractC4192e90 implements NQ {
        public c() {
            super(1);
        }

        public final Boolean a(int i) {
            WZ.a aVar = WZ.b;
            return Boolean.valueOf(WZ.f(i, aVar.b()) ? C6423m5.this.isInTouchMode() : WZ.f(i, aVar.a()) ? C6423m5.this.isInTouchMode() ? C6423m5.this.requestFocusFromTouch() : true : false);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((WZ) obj).i());
        }
    }

    /* JADX INFO: renamed from: com.daaw.m5$d */
    public static final class d extends AbstractC4192e90 implements NQ {
        public static final d B = new d();

        public d() {
            super(1);
        }

        public final void a(Configuration configuration) {
            G10.g(configuration, "it");
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Configuration) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.m5$e */
    public static final class e extends AbstractC4192e90 implements NQ {
        public e() {
            super(1);
        }

        public final Boolean a(KeyEvent keyEvent) {
            G10.g(keyEvent, "it");
            HN hnJ = C6423m5.this.J(keyEvent);
            return (hnJ == null || !K70.e(L70.b(keyEvent), K70.a.a())) ? Boolean.FALSE : Boolean.valueOf(C6423m5.this.getFocusManager().a(hnJ.o()));
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((I70) obj).f());
        }
    }

    /* JADX INFO: renamed from: com.daaw.m5$f */
    public static final class f implements InterfaceC6386lx0 {
        public f() {
        }

        @Override // com.daaw.InterfaceC6386lx0
        public void a(InterfaceC5819jx0 interfaceC5819jx0) {
            G10.g(interfaceC5819jx0, "value");
            C6423m5.this.Q0 = interfaceC5819jx0;
        }
    }

    /* JADX INFO: renamed from: com.daaw.m5$g */
    public static final class g extends AbstractC4192e90 implements LQ {
        public g() {
            super(0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m58invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m58invoke() {
            MotionEvent motionEvent = C6423m5.this.H0;
            if (motionEvent != null) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 7 || actionMasked == 9) {
                    C6423m5.this.I0 = SystemClock.uptimeMillis();
                    C6423m5 c6423m5 = C6423m5.this;
                    c6423m5.post(c6423m5.L0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.m5$h */
    public static final class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6423m5.this.removeCallbacks(this);
            MotionEvent motionEvent = C6423m5.this.H0;
            if (motionEvent != null) {
                boolean z = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (z) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 1) {
                    return;
                }
                int i = (actionMasked == 7 || actionMasked == 9) ? 7 : 2;
                C6423m5 c6423m5 = C6423m5.this;
                c6423m5.j0(motionEvent, i, c6423m5.I0, false);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.m5$i */
    public static final class i extends AbstractC4192e90 implements NQ {
        public static final i B = new i();

        public i() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C3402bK0 c3402bK0) {
            G10.g(c3402bK0, "it");
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: com.daaw.m5$j */
    public static final class j extends AbstractC4192e90 implements NQ {
        public static final j B = new j();

        public j() {
            super(1);
        }

        public final void a(CP0 cp0) {
            G10.g(cp0, "$this$$receiver");
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CP0) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.m5$k */
    public static final class k extends AbstractC4192e90 implements NQ {
        public k() {
            super(1);
        }

        public static final void d(LQ lq) {
            G10.g(lq, "$tmp0");
            lq.invoke();
        }

        public final void c(final LQ lq) {
            G10.g(lq, "command");
            Handler handler = C6423m5.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                lq.invoke();
                return;
            }
            Handler handler2 = C6423m5.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: com.daaw.n5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6423m5.k.d(lq);
                    }
                });
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            c((LQ) obj);
            return G91.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6423m5(Context context) {
        super(context);
        G10.g(context, "context");
        C9982yp0.a aVar = C9982yp0.b;
        this.B = aVar.b();
        int i2 = 1;
        this.C = true;
        this.D = new G90(null, i2, 0 == true ? 1 : 0);
        this.E = F5.a(context);
        C7903rP0 c7903rP0 = new C7903rP0(C7903rP0.D.a(), false, false, j.B);
        this.F = c7903rP0;
        QN qn = new QN(0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        this.G = qn;
        this.H = new C4626fh1();
        Q70 q70 = new Q70(new e(), null);
        this.I = q70;
        InterfaceC1073Hk0.a aVar2 = InterfaceC1073Hk0.m;
        InterfaceC1073Hk0 interfaceC1073Hk0C = AbstractC3123aK0.c(aVar2, i.B);
        this.J = interfaceC1073Hk0C;
        this.K = new C7434pj();
        E90 e90 = new E90(false, 1, null);
        e90.e(WJ0.b);
        e90.a(aVar2.g(c7903rP0).g(interfaceC1073Hk0C).g(qn.f()).g(q70));
        e90.f(getDensity());
        this.L = e90;
        this.M = this;
        this.N = new C9305wP0(getRoot());
        C7260p5 c7260p5 = new C7260p5(this);
        this.O = c7260p5;
        this.P = new C1875Pd();
        this.Q = new ArrayList();
        this.T = new C8281sl0();
        this.U = new C8617tx0(getRoot());
        this.V = d.B;
        this.W = E() ? new C8370t4(this, getAutofillTree()) : null;
        this.b0 = new C4450f5(context);
        this.c0 = new C6697n4(context);
        this.d0 = new C1620Mr0(new k());
        this.j0 = new C0749Eh0(getRoot());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        G10.f(viewConfiguration, "get(context)");
        this.k0 = new B6(viewConfiguration);
        this.l0 = D00.b.a();
        this.m0 = new int[]{0, 0};
        this.n0 = C9384wh0.c(null, 1, null);
        this.o0 = C9384wh0.c(null, 1, null);
        this.p0 = -1L;
        this.r0 = aVar.a();
        this.s0 = true;
        this.t0 = AbstractC9046vU0.d(null, null, 2, null);
        this.v0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.daaw.i5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C6423m5.L(this.B);
            }
        };
        this.w0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.daaw.j5
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                C6423m5.f0(this.B);
            }
        };
        this.x0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: com.daaw.k5
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                C6423m5.l0(this.B, z);
            }
        };
        C7804r21 c7804r21 = new C7804r21(this);
        this.y0 = c7804r21;
        this.z0 = (C7526q21) A5.e().invoke(c7804r21);
        this.A0 = new N5(context);
        this.B0 = AbstractC7923rU0.d(AbstractC9300wO.a(context), AbstractC7923rU0.h());
        Configuration configuration = context.getResources().getConfiguration();
        G10.f(configuration, "context.resources.configuration");
        this.C0 = K(configuration);
        Configuration configuration2 = context.getResources().getConfiguration();
        G10.f(configuration2, "context.resources.configuration");
        this.D0 = AbstractC9046vU0.d(A5.d(configuration2), null, 2, null);
        this.E0 = new C2696Wu0(this);
        this.F0 = new YZ(isInTouchMode() ? WZ.b.b() : WZ.b.a(), new c(), null);
        this.G0 = new C8380t6(this);
        this.J0 = new C7421pg1();
        this.K0 = new C8565tm0(new LQ[16], 0);
        this.L0 = new h();
        this.M0 = new Runnable() { // from class: com.daaw.l5
            @Override // java.lang.Runnable
            public final void run() {
                C6423m5.g0(this.B);
            }
        };
        this.O0 = new g();
        int i3 = Build.VERSION.SDK_INT;
        this.P0 = i3 >= 29 ? new C0648Di() : new C0431Bi();
        setWillNotDraw(false);
        setFocusable(true);
        if (i3 >= 26) {
            C10056z5.a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        setTransitionGroup(true);
        AbstractC2317Td1.p0(this, c7260p5);
        NQ nqA = InterfaceC1673Ne1.q.a();
        if (nqA != null) {
            nqA.invoke(this);
        }
        getRoot().B(this);
        if (i3 >= 29) {
            C8096s5.a.a(this);
        }
        this.R0 = new f();
    }

    public static final void L(C6423m5 c6423m5) {
        G10.g(c6423m5, "this$0");
        c6423m5.m0();
    }

    public static /* synthetic */ void e0(C6423m5 c6423m5, E90 e90, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            e90 = null;
        }
        c6423m5.d0(e90);
    }

    public static final void f0(C6423m5 c6423m5) {
        G10.g(c6423m5, "this$0");
        c6423m5.m0();
    }

    public static final void g0(C6423m5 c6423m5) {
        G10.g(c6423m5, "this$0");
        c6423m5.N0 = false;
        MotionEvent motionEvent = c6423m5.H0;
        G10.d(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        c6423m5.i0(motionEvent);
    }

    public static /* synthetic */ void k0(C6423m5 c6423m5, MotionEvent motionEvent, int i2, long j2, boolean z, int i3, Object obj) {
        c6423m5.j0(motionEvent, i2, j2, (i3 & 8) != 0 ? true : z);
    }

    public static final void l0(C6423m5 c6423m5, boolean z) {
        G10.g(c6423m5, "this$0");
        c6423m5.F0.b(z ? WZ.b.b() : WZ.b.a());
        c6423m5.G.c();
    }

    private void setFontFamilyResolver(AbstractC7898rO.b bVar) {
        this.B0.setValue(bVar);
    }

    private void setLayoutDirection(EnumC7560q90 enumC7560q90) {
        this.D0.setValue(enumC7560q90);
    }

    private final void setViewTreeOwners(b bVar) {
        this.t0.setValue(bVar);
    }

    public final boolean E() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public final Object F(InterfaceC1416Ks interfaceC1416Ks) {
        Object objX = this.O.x(interfaceC1416Ks);
        return objX == I10.c() ? objX : G91.a;
    }

    public final void G(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof C6423m5) {
                ((C6423m5) childAt).k();
            } else if (childAt instanceof ViewGroup) {
                G((ViewGroup) childAt);
            }
        }
    }

    public final C0576Cs0 H(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return D61.a(0, Integer.valueOf(size));
        }
        if (mode == 0) {
            return D61.a(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return D61.a(Integer.valueOf(size), Integer.valueOf(size));
        }
        throw new IllegalStateException();
    }

    public final View I(int i2, View view) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (G10.c(declaredMethod.invoke(view, null), Integer.valueOf(i2))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    G10.f(childAt, "currentView.getChildAt(i)");
                    View viewI = I(i2, childAt);
                    if (viewI != null) {
                        return viewI;
                    }
                }
            }
        }
        return null;
    }

    public HN J(KeyEvent keyEvent) {
        G10.g(keyEvent, "keyEvent");
        long jA = L70.a(keyEvent);
        G70.a aVar = G70.a;
        if (G70.l(jA, aVar.j())) {
            return HN.i(L70.c(keyEvent) ? HN.b.f() : HN.b.d());
        }
        if (G70.l(jA, aVar.e())) {
            return HN.i(HN.b.g());
        }
        if (G70.l(jA, aVar.d())) {
            return HN.i(HN.b.c());
        }
        if (G70.l(jA, aVar.f())) {
            return HN.i(HN.b.h());
        }
        if (G70.l(jA, aVar.c())) {
            return HN.i(HN.b.a());
        }
        if (G70.l(jA, aVar.b()) ? true : G70.l(jA, aVar.g()) ? true : G70.l(jA, aVar.i())) {
            return HN.i(HN.b.b());
        }
        if (G70.l(jA, aVar.a()) ? true : G70.l(jA, aVar.h())) {
            return HN.i(HN.b.e());
        }
        return null;
    }

    public final int K(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    public final int M(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        removeCallbacks(this.L0);
        try {
            Z(motionEvent);
            boolean z = true;
            this.q0 = true;
            a(false);
            this.Q0 = null;
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.H0;
                boolean z2 = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                if (motionEvent3 == null || !O(motionEvent, motionEvent3)) {
                    motionEvent2 = motionEvent3;
                } else {
                    if (T(motionEvent3)) {
                        this.U.b();
                    } else if (motionEvent3.getActionMasked() != 10 && z2) {
                        k0(this, motionEvent3, 10, motionEvent3.getEventTime(), false, 8, null);
                        motionEvent2 = motionEvent3;
                    }
                    motionEvent2 = motionEvent3;
                }
                if (motionEvent.getToolType(0) != 3) {
                    z = false;
                }
                if (!z2 && z && actionMasked != 3 && actionMasked != 9 && U(motionEvent)) {
                    k0(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.H0 = MotionEvent.obtainNoHistory(motionEvent);
                int iI0 = i0(motionEvent);
                Trace.endSection();
                if (Build.VERSION.SDK_INT >= 24) {
                    C9219w5.a.a(this, this.Q0);
                }
                return iI0;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } finally {
            this.q0 = false;
        }
    }

    public final boolean N(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f2 = -motionEvent.getAxisValue(26);
        C3402bK0 c3402bK0 = new C3402bK0(AbstractC3208ae1.j(viewConfiguration, getContext()) * f2, f2 * AbstractC3208ae1.f(viewConfiguration, getContext()), motionEvent.getEventTime());
        SN snD = this.G.d();
        if (snD != null) {
            return snD.u(c3402bK0);
        }
        return false;
    }

    public final boolean O(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    public void P() {
        Q(getRoot());
    }

    public final void Q(E90 e90) {
        e90.A0();
        C8565tm0 c8565tm0R0 = e90.r0();
        int iR = c8565tm0R0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0R0.q();
            int i2 = 0;
            do {
                Q((E90) objArrQ[i2]);
                i2++;
            } while (i2 < iR);
        }
    }

    public final void R(E90 e90) {
        int i2 = 0;
        C0749Eh0.r(this.j0, e90, false, 2, null);
        C8565tm0 c8565tm0R0 = e90.r0();
        int iR = c8565tm0R0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0R0.q();
            do {
                R((E90) objArrQ[i2]);
                i2++;
            } while (i2 < iR);
        }
    }

    public final boolean S(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (Float.isInfinite(x) || Float.isNaN(x)) {
            return true;
        }
        float y = motionEvent.getY();
        if (Float.isInfinite(y) || Float.isNaN(y)) {
            return true;
        }
        float rawX = motionEvent.getRawX();
        if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
            return true;
        }
        float rawY = motionEvent.getRawY();
        return Float.isInfinite(rawY) || Float.isNaN(rawY);
    }

    public final boolean T(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    public final boolean U(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final boolean V(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.H0) != null && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final Object W(InterfaceC1416Ks interfaceC1416Ks) {
        Object objJ = this.y0.j(interfaceC1416Ks);
        return objJ == I10.c() ? objJ : G91.a;
    }

    public final void X(InterfaceC1205Ir0 interfaceC1205Ir0, boolean z) {
        G10.g(interfaceC1205Ir0, "layer");
        if (!z) {
            if (!this.S && !this.Q.remove(interfaceC1205Ir0)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else {
            if (!this.S) {
                this.Q.add(interfaceC1205Ir0);
                return;
            }
            List arrayList = this.R;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.R = arrayList;
            }
            arrayList.add(interfaceC1205Ir0);
        }
    }

    public final void Y() {
        if (this.q0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.p0) {
            this.p0 = jCurrentAnimationTimeMillis;
            a0();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.m0);
            int[] iArr = this.m0;
            float f2 = iArr[0];
            float f3 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.m0;
            this.r0 = AbstractC0460Bp0.a(f2 - iArr2[0], f3 - iArr2[1]);
        }
    }

    public final void Z(MotionEvent motionEvent) {
        this.p0 = AnimationUtils.currentAnimationTimeMillis();
        a0();
        long jF = C9384wh0.f(this.n0, AbstractC0460Bp0.a(motionEvent.getX(), motionEvent.getY()));
        this.r0 = AbstractC0460Bp0.a(motionEvent.getRawX() - C9982yp0.l(jF), motionEvent.getRawY() - C9982yp0.m(jF));
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public void a(boolean z) {
        LQ lq;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z) {
            try {
                lq = this.O0;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            lq = null;
        }
        if (this.j0.k(lq)) {
            requestLayout();
        }
        C0749Eh0.e(this.j0, false, 1, null);
        G91 g91 = G91.a;
        Trace.endSection();
    }

    public final void a0() {
        this.P0.a(this, this.n0);
        V10.a(this.n0, this.o0);
    }

    @Override // android.view.View
    public void autofill(SparseArray sparseArray) {
        C8370t4 c8370t4;
        G10.g(sparseArray, DiagnosticsEntry.Histogram.VALUES_KEY);
        if (!E() || (c8370t4 = this.W) == null) {
            return;
        }
        AbstractC8935v4.a(c8370t4, sparseArray);
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public void b(E90 e90) {
        G10.g(e90, "node");
        this.j0.l(e90);
        c0();
    }

    public final boolean b0(InterfaceC1205Ir0 interfaceC1205Ir0) {
        G10.g(interfaceC1205Ir0, "layer");
        boolean z = this.g0 == null || C6295le1.N.b() || Build.VERSION.SDK_INT >= 23 || this.J0.b() < 10;
        if (z) {
            this.J0.d(interfaceC1205Ir0);
        }
        return z;
    }

    public final void c0() {
        this.a0 = true;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        return this.O.y(false, i2, this.B);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i2) {
        return this.O.y(true, i2, this.B);
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public long d(long j2) {
        Y();
        return C9384wh0.f(this.n0, j2);
    }

    public final void d0(E90 e90) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (this.i0 && e90 != null) {
            while (e90 != null && e90.d0() == E90.i.InMeasureBlock) {
                e90 = e90.l0();
            }
            if (e90 == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        G10.g(canvas, "canvas");
        if (!isAttachedToWindow()) {
            Q(getRoot());
        }
        AbstractC1309Jr0.a(this, false, 1, null);
        this.S = true;
        C7434pj c7434pj = this.K;
        Canvas canvasR = c7434pj.a().r();
        c7434pj.a().s(canvas);
        getRoot().M(c7434pj.a());
        c7434pj.a().s(canvasR);
        if (!this.Q.isEmpty()) {
            int size = this.Q.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((InterfaceC1205Ir0) this.Q.get(i2)).i();
            }
        }
        if (C6295le1.N.b()) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        this.Q.clear();
        this.S = false;
        List list = this.R;
        if (list != null) {
            G10.d(list);
            this.Q.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        G10.g(motionEvent, "event");
        return motionEvent.getActionMasked() == 8 ? motionEvent.isFromSource(4194304) ? N(motionEvent) : (S(motionEvent) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(motionEvent) : AbstractC0500Bz0.c(M(motionEvent)) : super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        G10.g(motionEvent, "event");
        if (this.N0) {
            removeCallbacks(this.M0);
            this.M0.run();
        }
        if (S(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.isFromSource(4098) && motionEvent.getToolType(0) == 1) {
            return this.O.F(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && U(motionEvent)) {
                if (motionEvent.getToolType(0) != 3) {
                    MotionEvent motionEvent2 = this.H0;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.H0 = MotionEvent.obtainNoHistory(motionEvent);
                    this.N0 = true;
                    post(this.M0);
                    return false;
                }
                if (motionEvent.getButtonState() != 0) {
                    return false;
                }
            }
        } else if (!V(motionEvent)) {
            return false;
        }
        return AbstractC0500Bz0.c(M(motionEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        G10.g(keyEvent, "event");
        return isFocused() ? h0(I70.b(keyEvent)) : super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        G10.g(motionEvent, "motionEvent");
        if (this.N0) {
            removeCallbacks(this.M0);
            MotionEvent motionEvent2 = this.H0;
            G10.d(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || O(motionEvent, motionEvent2)) {
                this.M0.run();
            } else {
                this.N0 = false;
            }
        }
        if (S(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !V(motionEvent)) {
            return false;
        }
        int iM = M(motionEvent);
        if (AbstractC0500Bz0.b(iM)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return AbstractC0500Bz0.c(iM);
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public void e(E90 e90) {
        G10.g(e90, "layoutNode");
        this.O.R(e90);
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public void f(LQ lq) {
        G10.g(lq, "listener");
        if (this.K0.m(lq)) {
            return;
        }
        this.K0.d(lq);
    }

    public final View findViewByAccessibilityIdTraversal(int i2) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return I(i2, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i2));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public void g(E90 e90) {
        G10.g(e90, "layoutNode");
        this.j0.g(e90);
    }

    public final D6 getAndroidViewsHandler$ui_release() {
        if (this.f0 == null) {
            Context context = getContext();
            G10.f(context, "context");
            D6 d6 = new D6(context);
            this.f0 = d6;
            addView(d6);
        }
        D6 d62 = this.f0;
        G10.d(d62);
        return d62;
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public InterfaceC8798ud getAutofill() {
        return this.W;
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public C1875Pd getAutofillTree() {
        return this.P;
    }

    public final NQ getConfigurationChangeObserver() {
        return this.V;
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public InterfaceC4988gz getDensity() {
        return this.E;
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public PN getFocusManager() {
        return this.G;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        G91 g91;
        C3103aF0 c3103aF0E;
        G10.g(rect, "rect");
        SN snD = this.G.d();
        if (snD == null || (c3103aF0E = AbstractC5099hO.e(snD)) == null) {
            g91 = null;
        } else {
            rect.left = AbstractC8261sh0.b(c3103aF0E.f());
            rect.top = AbstractC8261sh0.b(c3103aF0E.i());
            rect.right = AbstractC8261sh0.b(c3103aF0E.g());
            rect.bottom = AbstractC8261sh0.b(c3103aF0E.c());
            g91 = G91.a;
        }
        if (g91 == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public AbstractC7898rO.b getFontFamilyResolver() {
        return (AbstractC7898rO.b) this.B0.getValue();
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public InterfaceC6225lO.a getFontLoader() {
        return this.A0;
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public DU getHapticFeedBack() {
        return this.E0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.j0.i();
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public XZ getInputModeManager() {
        return this.F0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.p0;
    }

    @Override // android.view.View, android.view.ViewParent, com.daaw.InterfaceC1413Kr0
    public EnumC7560q90 getLayoutDirection() {
        return (EnumC7560q90) this.D0.getValue();
    }

    public long getMeasureIteration() {
        return this.j0.j();
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public InterfaceC6386lx0 getPointerIconService() {
        return this.R0;
    }

    public E90 getRoot() {
        return this.L;
    }

    public VJ0 getRootForTest() {
        return this.M;
    }

    public C9305wP0 getSemanticsOwner() {
        return this.N;
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public G90 getSharedDrawScope() {
        return this.D;
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public boolean getShowLayoutBounds() {
        return this.e0;
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public C1620Mr0 getSnapshotObserver() {
        return this.d0;
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public C7526q21 getTextInputService() {
        return this.z0;
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public Q21 getTextToolbar() {
        return this.G0;
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public InterfaceC2733Xd1 getViewConfiguration() {
        return this.k0;
    }

    public final b getViewTreeOwners() {
        return (b) this.t0.getValue();
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public InterfaceC4337eh1 getWindowInfo() {
        return this.H;
    }

    @Override // com.daaw.InterfaceC1956Px0
    public long h(long j2) {
        Y();
        long jF = C9384wh0.f(this.n0, j2);
        return AbstractC0460Bp0.a(C9982yp0.l(jF) + C9982yp0.l(this.r0), C9982yp0.m(jF) + C9982yp0.m(this.r0));
    }

    public boolean h0(KeyEvent keyEvent) {
        G10.g(keyEvent, "keyEvent");
        return this.I.h(keyEvent);
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public void i(E90 e90, boolean z) {
        G10.g(e90, "layoutNode");
        if (this.j0.q(e90, z)) {
            d0(e90);
        }
    }

    public final int i0(MotionEvent motionEvent) {
        Object objPrevious;
        C8059rx0 c8059rx0C = this.T.c(motionEvent, this);
        if (c8059rx0C == null) {
            this.U.b();
            return AbstractC8903ux0.a(false, false);
        }
        List listB = c8059rx0C.b();
        ListIterator listIterator = listB.listIterator(listB.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((C8338sx0) objPrevious).a()) {
                break;
            }
        }
        C8338sx0 c8338sx0 = (C8338sx0) objPrevious;
        if (c8338sx0 != null) {
            this.B = c8338sx0.e();
        }
        int iA = this.U.a(c8059rx0C, this, U(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 0 || actionMasked == 5) && !AbstractC0500Bz0.c(iA)) {
            this.T.e(motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return iA;
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public void j(E90 e90, boolean z) {
        G10.g(e90, "layoutNode");
        if (this.j0.o(e90, z)) {
            e0(this, null, 1, null);
        }
    }

    public final void j0(MotionEvent motionEvent, int i2, long j2, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i2 != 9 && i2 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = ((actionIndex < 0 || i5 < actionIndex) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i6, pointerCoords);
            long jH = h(AbstractC0460Bp0.a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = C9982yp0.l(jH);
            pointerCoords.y = C9982yp0.m(jH);
            i5++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j2 : motionEvent.getDownTime(), j2, i2, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        C8281sl0 c8281sl0 = this.T;
        G10.f(motionEventObtain, "event");
        C8059rx0 c8059rx0C = c8281sl0.c(motionEventObtain, this);
        G10.d(c8059rx0C);
        this.U.a(c8059rx0C, this, true);
        motionEventObtain.recycle();
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public void k() {
        if (this.a0) {
            getSnapshotObserver().a();
            this.a0 = false;
        }
        D6 d6 = this.f0;
        if (d6 != null) {
            G(d6);
        }
        while (this.K0.u()) {
            int iR = this.K0.r();
            for (int i2 = 0; i2 < iR; i2++) {
                LQ lq = (LQ) this.K0.q()[i2];
                this.K0.D(i2, null);
                if (lq != null) {
                    lq.invoke();
                }
            }
            this.K0.A(0, iR);
        }
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public void l() {
        this.O.S();
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public void m(E90 e90) {
        G10.g(e90, "node");
    }

    public final void m0() {
        getLocationOnScreen(this.m0);
        boolean z = false;
        if (D00.f(this.l0) != this.m0[0] || D00.g(this.l0) != this.m0[1]) {
            int[] iArr = this.m0;
            this.l0 = E00.a(iArr[0], iArr[1]);
            z = true;
        }
        this.j0.d(z);
    }

    @Override // com.daaw.InterfaceC1956Px0
    public long n(long j2) {
        Y();
        return C9384wh0.f(this.o0, AbstractC0460Bp0.a(C9982yp0.l(j2) - C9982yp0.l(this.r0), C9982yp0.m(j2) - C9982yp0.m(this.r0)));
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public void o(InterfaceC1413Kr0.b bVar) {
        G10.g(bVar, "listener");
        this.j0.m(bVar);
        e0(this, null, 1, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        InterfaceC1764Ob0 interfaceC1764Ob0A;
        androidx.lifecycle.g gVarW;
        C8370t4 c8370t4;
        super.onAttachedToWindow();
        R(getRoot());
        Q(getRoot());
        getSnapshotObserver().f();
        if (E() && (c8370t4 = this.W) != null) {
            C1667Nd.a.a(c8370t4);
        }
        InterfaceC1764Ob0 interfaceC1764Ob0A2 = AbstractC2217Se1.a(this);
        InterfaceC3135aN0 interfaceC3135aN0A = AbstractC2425Ue1.a(this);
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (interfaceC1764Ob0A2 != null && interfaceC3135aN0A != null && (interfaceC1764Ob0A2 != viewTreeOwners.a() || interfaceC3135aN0A != viewTreeOwners.a()))) {
            if (interfaceC1764Ob0A2 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (interfaceC3135aN0A == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (interfaceC1764Ob0A = viewTreeOwners.a()) != null && (gVarW = interfaceC1764Ob0A.w()) != null) {
                gVarW.d(this);
            }
            interfaceC1764Ob0A2.w().a(this);
            b bVar = new b(interfaceC1764Ob0A2, interfaceC3135aN0A);
            setViewTreeOwners(bVar);
            NQ nq = this.u0;
            if (nq != null) {
                nq.invoke(bVar);
            }
            this.u0 = null;
        }
        b viewTreeOwners2 = getViewTreeOwners();
        G10.d(viewTreeOwners2);
        viewTreeOwners2.a().w().a(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.v0);
        getViewTreeObserver().addOnScrollChangedListener(this.w0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.x0);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        return this.y0.g();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        G10.g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        G10.f(context, "context");
        this.E = F5.a(context);
        if (K(configuration) != this.C0) {
            this.C0 = K(configuration);
            Context context2 = getContext();
            G10.f(context2, "context");
            setFontFamilyResolver(AbstractC9300wO.a(context2));
        }
        this.V.invoke(configuration);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(InterfaceC1764Ob0 interfaceC1764Ob0) {
        AbstractC0708Dx.a(this, interfaceC1764Ob0);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        G10.g(editorInfo, "outAttrs");
        return this.y0.d(editorInfo);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(InterfaceC1764Ob0 interfaceC1764Ob0) {
        AbstractC0708Dx.b(this, interfaceC1764Ob0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C8370t4 c8370t4;
        InterfaceC1764Ob0 interfaceC1764Ob0A;
        androidx.lifecycle.g gVarW;
        super.onDetachedFromWindow();
        getSnapshotObserver().g();
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (interfaceC1764Ob0A = viewTreeOwners.a()) != null && (gVarW = interfaceC1764Ob0A.w()) != null) {
            gVarW.d(this);
        }
        if (E() && (c8370t4 = this.W) != null) {
            C1667Nd.a.b(c8370t4);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.v0);
        getViewTreeObserver().removeOnScrollChangedListener(this.w0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.x0);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        G10.g(canvas, "canvas");
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        QN qn = this.G;
        if (z) {
            qn.i();
        } else {
            qn.g();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.h0 = null;
        m0();
        if (this.f0 != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i4 - i2, i5 - i3);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                R(getRoot());
            }
            C0576Cs0 c0576Cs0H = H(i2);
            int iIntValue = ((Number) c0576Cs0H.a()).intValue();
            int iIntValue2 = ((Number) c0576Cs0H.b()).intValue();
            C0576Cs0 c0576Cs0H2 = H(i3);
            long jA = AbstractC6916nr.a(iIntValue, iIntValue2, ((Number) c0576Cs0H2.a()).intValue(), ((Number) c0576Cs0H2.b()).intValue());
            C6079kr c6079kr = this.h0;
            boolean zG = false;
            if (c6079kr == null) {
                this.h0 = C6079kr.b(jA);
                this.i0 = false;
            } else {
                if (c6079kr != null) {
                    zG = C6079kr.g(c6079kr.s(), jA);
                }
                if (!zG) {
                    this.i0 = true;
                }
            }
            this.j0.s(jA);
            this.j0.k(this.O0);
            setMeasuredDimension(getRoot().p0(), getRoot().T());
            if (this.f0 != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().p0(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().T(), 1073741824));
            }
            G91 g91 = G91.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(InterfaceC1764Ob0 interfaceC1764Ob0) {
        AbstractC0708Dx.c(this, interfaceC1764Ob0);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        C8370t4 c8370t4;
        if (!E() || viewStructure == null || (c8370t4 = this.W) == null) {
            return;
        }
        AbstractC8935v4.b(c8370t4, viewStructure);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(InterfaceC1764Ob0 interfaceC1764Ob0) {
        G10.g(interfaceC1764Ob0, "owner");
        setShowLayoutBounds(S0.b());
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        if (this.C) {
            EnumC7560q90 enumC7560q90F = A5.f(i2);
            setLayoutDirection(enumC7560q90F);
            this.G.h(enumC7560q90F);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(InterfaceC1764Ob0 interfaceC1764Ob0) {
        AbstractC0708Dx.d(this, interfaceC1764Ob0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(InterfaceC1764Ob0 interfaceC1764Ob0) {
        AbstractC0708Dx.e(this, interfaceC1764Ob0);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        boolean zB;
        this.H.a(z);
        super.onWindowFocusChanged(z);
        if (!z || getShowLayoutBounds() == (zB = S0.b())) {
            return;
        }
        setShowLayoutBounds(zB);
        P();
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public InterfaceC1205Ir0 p(NQ nq, LQ lq) {
        GD c6853ne1;
        G10.g(nq, "drawBlock");
        G10.g(lq, "invalidateParentLayer");
        InterfaceC1205Ir0 interfaceC1205Ir0 = (InterfaceC1205Ir0) this.J0.c();
        if (interfaceC1205Ir0 != null) {
            interfaceC1205Ir0.g(nq, lq);
            return interfaceC1205Ir0;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT >= 23 && this.s0) {
            try {
                return new NH0(this, nq, lq);
            } catch (Throwable unused) {
                this.s0 = false;
            }
        }
        if (this.g0 == null) {
            C6295le1.c cVar = C6295le1.N;
            if (!cVar.a()) {
                cVar.d(new View(getContext()));
            }
            if (cVar.b()) {
                Context context = getContext();
                G10.f(context, "context");
                c6853ne1 = new GD(context);
            } else {
                Context context2 = getContext();
                G10.f(context2, "context");
                c6853ne1 = new C6853ne1(context2);
            }
            this.g0 = c6853ne1;
            addView(c6853ne1);
        }
        GD gd = this.g0;
        G10.d(gd);
        return new C6295le1(this, gd, nq, lq);
    }

    public final void setConfigurationChangeObserver(NQ nq) {
        G10.g(nq, "<set-?>");
        this.V = nq;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j2) {
        this.p0 = j2;
    }

    public final void setOnViewTreeOwnersAvailable(NQ nq) {
        G10.g(nq, "callback");
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            nq.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.u0 = nq;
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public void setShowLayoutBounds(boolean z) {
        this.e0 = z;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public C6697n4 getAccessibilityManager() {
        return this.c0;
    }

    @Override // com.daaw.InterfaceC1413Kr0
    public C4450f5 getClipboardManager() {
        return this.b0;
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public View getView() {
        return this;
    }
}
