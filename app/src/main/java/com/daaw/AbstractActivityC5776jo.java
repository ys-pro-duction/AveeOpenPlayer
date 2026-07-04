package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.g;
import androidx.lifecycle.y;
import com.daaw.AbstractActivityC5776jo;
import com.daaw.AbstractC5247hu;
import com.daaw.B2;
import com.daaw.YM0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.daaw.jo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC5776jo extends AbstractActivityC7459po implements InterfaceC1764Ob0, InterfaceC0417Be1, androidx.lifecycle.e, InterfaceC3135aN0, InterfaceC3824cq0, I2, InterfaceC5506iq0, InterfaceC0681Dq0, InterfaceC8864uq0, InterfaceC9150vq0, InterfaceC9952yj0, EQ {
    public static final c W = new c(null);
    public final C8873us D = new C8873us();
    public final C10231zj0 E = new C10231zj0(new Runnable() { // from class: com.daaw.co
        @Override // java.lang.Runnable
        public final void run() {
            AbstractActivityC5776jo.W(this.B);
        }
    });
    public final ZM0 F;
    public C0313Ae1 G;
    public final e H;
    public final O90 I;
    public int J;
    public final AtomicInteger K;
    public final H2 L;
    public final CopyOnWriteArrayList M;
    public final CopyOnWriteArrayList N;
    public final CopyOnWriteArrayList O;
    public final CopyOnWriteArrayList P;
    public final CopyOnWriteArrayList Q;
    public final CopyOnWriteArrayList R;
    public boolean S;
    public boolean T;
    public final O90 U;
    public final O90 V;

    /* JADX INFO: renamed from: com.daaw.jo$a */
    public static final class a implements androidx.lifecycle.j {
        public a() {
        }

        @Override // androidx.lifecycle.j
        public void c(InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
            G10.g(interfaceC1764Ob0, "source");
            G10.g(aVar, "event");
            AbstractActivityC5776jo.this.S();
            AbstractActivityC5776jo.this.w().d(this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jo$b */
    public static final class b {
        public static final b a = new b();

        public final OnBackInvokedDispatcher a(Activity activity) {
            G10.g(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            G10.f(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    /* JADX INFO: renamed from: com.daaw.jo$c */
    public static final class c {
        public /* synthetic */ c(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public c() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.jo$d */
    public static final class d {
        public Object a;
        public C0313Ae1 b;

        public final C0313Ae1 a() {
            return this.b;
        }

        public final void b(Object obj) {
            this.a = obj;
        }

        public final void c(C0313Ae1 c0313Ae1) {
            this.b = c0313Ae1;
        }
    }

    /* JADX INFO: renamed from: com.daaw.jo$e */
    public interface e extends Executor {
        void l();

        void y0(View view);
    }

    /* JADX INFO: renamed from: com.daaw.jo$f */
    public final class f implements e, ViewTreeObserver.OnDrawListener, Runnable {
        public final long B = SystemClock.uptimeMillis() + ((long) 10000);
        public Runnable C;
        public boolean D;

        public f() {
        }

        public static final void b(f fVar) {
            G10.g(fVar, "this$0");
            Runnable runnable = fVar.C;
            if (runnable != null) {
                G10.d(runnable);
                runnable.run();
                fVar.C = null;
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            G10.g(runnable, "runnable");
            this.C = runnable;
            View decorView = AbstractActivityC5776jo.this.getWindow().getDecorView();
            G10.f(decorView, "window.decorView");
            if (!this.D) {
                decorView.postOnAnimation(new Runnable() { // from class: com.daaw.ko
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC5776jo.f.b(this.B);
                    }
                });
            } else if (G10.c(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // com.daaw.AbstractActivityC5776jo.e
        public void l() {
            AbstractActivityC5776jo.this.getWindow().getDecorView().removeCallbacks(this);
            AbstractActivityC5776jo.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.C;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.B) {
                    this.D = false;
                    AbstractActivityC5776jo.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.C = null;
            if (AbstractActivityC5776jo.this.T().c()) {
                this.D = false;
                AbstractActivityC5776jo.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractActivityC5776jo.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // com.daaw.AbstractActivityC5776jo.e
        public void y0(View view) {
            G10.g(view, "view");
            if (this.D) {
                return;
            }
            this.D = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jo$g */
    public static final class g extends H2 {
        public g() {
        }

        public static final void s(g gVar, int i, B2.a aVar) {
            G10.g(gVar, "this$0");
            gVar.f(i, aVar.a());
        }

        public static final void t(g gVar, int i, IntentSender.SendIntentException sendIntentException) {
            G10.g(gVar, "this$0");
            G10.g(sendIntentException, "$e");
            gVar.e(i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        @Override // com.daaw.H2
        public void i(final int i, B2 b2, Object obj, AbstractC9762y2 abstractC9762y2) {
            Bundle bundleExtra;
            final int i2;
            G10.g(b2, "contract");
            AbstractActivityC5776jo abstractActivityC5776jo = AbstractActivityC5776jo.this;
            final B2.a aVarB = b2.b(abstractActivityC5776jo, obj);
            if (aVarB != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.daaw.lo
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC5776jo.g.s(this.B, i, aVarB);
                    }
                });
                return;
            }
            Intent intentA = b2.a(abstractActivityC5776jo, obj);
            if (intentA.getExtras() != null) {
                Bundle extras = intentA.getExtras();
                G10.d(extras);
                if (extras.getClassLoader() == null) {
                    intentA.setExtrasClassLoader(abstractActivityC5776jo.getClassLoader());
                }
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleExtra = null;
            }
            Bundle bundle = bundleExtra;
            if (G10.c("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                AbstractC9204w2.o(abstractActivityC5776jo, stringArrayExtra, i);
                return;
            }
            if (!G10.c("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentA.getAction())) {
                AbstractC9204w2.p(abstractActivityC5776jo, intentA, i, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                G10.d(intentSenderRequest);
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                AbstractC9204w2.q(abstractActivityC5776jo, intentSenderRequest.getIntentSender(), i2, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle);
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                final IntentSender.SendIntentException sendIntentException = e;
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.daaw.mo
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC5776jo.g.t(this.B, i2, sendIntentException);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.jo$h */
    public static final class h extends AbstractC4192e90 implements LQ {
        public h() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.v invoke() {
            Application application = AbstractActivityC5776jo.this.getApplication();
            AbstractActivityC5776jo abstractActivityC5776jo = AbstractActivityC5776jo.this;
            return new androidx.lifecycle.v(application, abstractActivityC5776jo, abstractActivityC5776jo.getIntent() != null ? AbstractActivityC5776jo.this.getIntent().getExtras() : null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jo$i */
    public static final class i extends AbstractC4192e90 implements LQ {

        /* JADX INFO: renamed from: com.daaw.jo$i$a */
        public static final class a extends AbstractC4192e90 implements LQ {
            public final /* synthetic */ AbstractActivityC5776jo B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractActivityC5776jo abstractActivityC5776jo) {
                super(0);
                this.B = abstractActivityC5776jo;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m53invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m53invoke() {
                this.B.reportFullyDrawn();
            }
        }

        public i() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DQ invoke() {
            return new DQ(AbstractActivityC5776jo.this.H, new a(AbstractActivityC5776jo.this));
        }
    }

    /* JADX INFO: renamed from: com.daaw.jo$j */
    public static final class j extends AbstractC4192e90 implements LQ {
        public j() {
            super(0);
        }

        public static final void h(AbstractActivityC5776jo abstractActivityC5776jo) {
            G10.g(abstractActivityC5776jo, "this$0");
            try {
                AbstractActivityC5776jo.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!G10.c(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            } catch (NullPointerException e2) {
                if (!G10.c(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e2;
                }
            }
        }

        public static final void i(AbstractActivityC5776jo abstractActivityC5776jo, C3267aq0 c3267aq0) {
            G10.g(abstractActivityC5776jo, "this$0");
            G10.g(c3267aq0, "$dispatcher");
            abstractActivityC5776jo.N(c3267aq0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final C3267aq0 invoke() {
            final AbstractActivityC5776jo abstractActivityC5776jo = AbstractActivityC5776jo.this;
            final C3267aq0 c3267aq0 = new C3267aq0(new Runnable() { // from class: com.daaw.no
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractActivityC5776jo.j.h(abstractActivityC5776jo);
                }
            });
            final AbstractActivityC5776jo abstractActivityC5776jo2 = AbstractActivityC5776jo.this;
            if (Build.VERSION.SDK_INT >= 33) {
                if (!G10.c(Looper.myLooper(), Looper.getMainLooper())) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.daaw.oo
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractActivityC5776jo.j.i(abstractActivityC5776jo2, c3267aq0);
                        }
                    });
                    return c3267aq0;
                }
                abstractActivityC5776jo2.N(c3267aq0);
            }
            return c3267aq0;
        }
    }

    public AbstractActivityC5776jo() {
        ZM0 zm0A = ZM0.d.a(this);
        this.F = zm0A;
        this.H = R();
        this.I = AbstractC3192ab0.a(new i());
        this.K = new AtomicInteger();
        this.L = new g();
        this.M = new CopyOnWriteArrayList();
        this.N = new CopyOnWriteArrayList();
        this.O = new CopyOnWriteArrayList();
        this.P = new CopyOnWriteArrayList();
        this.Q = new CopyOnWriteArrayList();
        this.R = new CopyOnWriteArrayList();
        if (w() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        w().a(new androidx.lifecycle.j() { // from class: com.daaw.eo
            @Override // androidx.lifecycle.j
            public final void c(InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
                AbstractActivityC5776jo.F(this.B, interfaceC1764Ob0, aVar);
            }
        });
        w().a(new androidx.lifecycle.j() { // from class: com.daaw.fo
            @Override // androidx.lifecycle.j
            public final void c(InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
                AbstractActivityC5776jo.G(this.B, interfaceC1764Ob0, aVar);
            }
        });
        w().a(new a());
        zm0A.c();
        androidx.lifecycle.u.c(this);
        if (Build.VERSION.SDK_INT <= 23) {
            w().a(new HY(this));
        }
        p().h("android:support:activity-result", new YM0.c() { // from class: com.daaw.go
            @Override // com.daaw.YM0.c
            public final Bundle a() {
                return AbstractActivityC5776jo.H(this.a);
            }
        });
        P(new InterfaceC6075kq0() { // from class: com.daaw.ho
            @Override // com.daaw.InterfaceC6075kq0
            public final void a(Context context) {
                AbstractActivityC5776jo.I(this.a, context);
            }
        });
        this.U = AbstractC3192ab0.a(new h());
        this.V = AbstractC3192ab0.a(new j());
    }

    public static final void F(AbstractActivityC5776jo abstractActivityC5776jo, InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
        Window window;
        View viewPeekDecorView;
        G10.g(abstractActivityC5776jo, "this$0");
        G10.g(interfaceC1764Ob0, "<anonymous parameter 0>");
        G10.g(aVar, "event");
        if (aVar != g.a.ON_STOP || (window = abstractActivityC5776jo.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    public static final void G(AbstractActivityC5776jo abstractActivityC5776jo, InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
        G10.g(abstractActivityC5776jo, "this$0");
        G10.g(interfaceC1764Ob0, "<anonymous parameter 0>");
        G10.g(aVar, "event");
        if (aVar == g.a.ON_DESTROY) {
            abstractActivityC5776jo.D.b();
            if (!abstractActivityC5776jo.isChangingConfigurations()) {
                abstractActivityC5776jo.n().a();
            }
            abstractActivityC5776jo.H.l();
        }
    }

    public static final Bundle H(AbstractActivityC5776jo abstractActivityC5776jo) {
        G10.g(abstractActivityC5776jo, "this$0");
        Bundle bundle = new Bundle();
        abstractActivityC5776jo.L.k(bundle);
        return bundle;
    }

    public static final void I(AbstractActivityC5776jo abstractActivityC5776jo, Context context) {
        G10.g(abstractActivityC5776jo, "this$0");
        G10.g(context, "it");
        Bundle bundleB = abstractActivityC5776jo.p().b("android:support:activity-result");
        if (bundleB != null) {
            abstractActivityC5776jo.L.j(bundleB);
        }
    }

    public static final void O(C3267aq0 c3267aq0, AbstractActivityC5776jo abstractActivityC5776jo, InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
        G10.g(c3267aq0, "$dispatcher");
        G10.g(abstractActivityC5776jo, "this$0");
        G10.g(interfaceC1764Ob0, "<anonymous parameter 0>");
        G10.g(aVar, "event");
        if (aVar == g.a.ON_CREATE) {
            c3267aq0.n(b.a.a(abstractActivityC5776jo));
        }
    }

    public static final void W(AbstractActivityC5776jo abstractActivityC5776jo) {
        G10.g(abstractActivityC5776jo, "this$0");
        abstractActivityC5776jo.V();
    }

    public final void N(final C3267aq0 c3267aq0) {
        w().a(new androidx.lifecycle.j() { // from class: com.daaw.io
            @Override // androidx.lifecycle.j
            public final void c(InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
                AbstractActivityC5776jo.O(c3267aq0, this, interfaceC1764Ob0, aVar);
            }
        });
    }

    public final void P(InterfaceC6075kq0 interfaceC6075kq0) {
        G10.g(interfaceC6075kq0, "listener");
        this.D.a(interfaceC6075kq0);
    }

    public final void Q(InterfaceC8589tr interfaceC8589tr) {
        G10.g(interfaceC8589tr, "listener");
        this.O.add(interfaceC8589tr);
    }

    public final e R() {
        return new f();
    }

    public final void S() {
        if (this.G == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.G = dVar.a();
            }
            if (this.G == null) {
                this.G = new C0313Ae1();
            }
        }
    }

    public DQ T() {
        return (DQ) this.I.getValue();
    }

    public void U() {
        View decorView = getWindow().getDecorView();
        G10.f(decorView, "window.decorView");
        AbstractC2217Se1.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        G10.f(decorView2, "window.decorView");
        AbstractC2529Ve1.b(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        G10.f(decorView3, "window.decorView");
        AbstractC2425Ue1.b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        G10.f(decorView4, "window.decorView");
        AbstractC2321Te1.a(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        G10.f(decorView5, "window.decorView");
        AbstractC2111Re1.a(decorView5, this);
    }

    public void V() {
        invalidateOptionsMenu();
    }

    public Object X() {
        return null;
    }

    public final F2 Y(B2 b2, A2 a2) {
        G10.g(b2, "contract");
        G10.g(a2, "callback");
        return Z(b2, this.L, a2);
    }

    public final F2 Z(B2 b2, H2 h2, A2 a2) {
        G10.g(b2, "contract");
        G10.g(h2, "registry");
        G10.g(a2, "callback");
        return h2.m("activity_rq#" + this.K.getAndIncrement(), this, b2, a2);
    }

    @Override // com.daaw.InterfaceC0681Dq0
    public final void a(InterfaceC8589tr interfaceC8589tr) {
        G10.g(interfaceC8589tr, "listener");
        this.N.add(interfaceC8589tr);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        U();
        e eVar = this.H;
        View decorView = getWindow().getDecorView();
        G10.f(decorView, "window.decorView");
        eVar.y0(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // com.daaw.InterfaceC3824cq0
    public final C3267aq0 c() {
        return (C3267aq0) this.V.getValue();
    }

    @Override // com.daaw.InterfaceC9150vq0
    public final void d(InterfaceC8589tr interfaceC8589tr) {
        G10.g(interfaceC8589tr, "listener");
        this.Q.add(interfaceC8589tr);
    }

    @Override // com.daaw.InterfaceC9952yj0
    public void e(InterfaceC0861Fj0 interfaceC0861Fj0) {
        G10.g(interfaceC0861Fj0, "provider");
        this.E.f(interfaceC0861Fj0);
    }

    @Override // com.daaw.InterfaceC8864uq0
    public final void f(InterfaceC8589tr interfaceC8589tr) {
        G10.g(interfaceC8589tr, "listener");
        this.P.add(interfaceC8589tr);
    }

    @Override // com.daaw.InterfaceC8864uq0
    public final void g(InterfaceC8589tr interfaceC8589tr) {
        G10.g(interfaceC8589tr, "listener");
        this.P.remove(interfaceC8589tr);
    }

    @Override // com.daaw.InterfaceC5506iq0
    public final void h(InterfaceC8589tr interfaceC8589tr) {
        G10.g(interfaceC8589tr, "listener");
        this.M.remove(interfaceC8589tr);
    }

    @Override // com.daaw.InterfaceC5506iq0
    public final void i(InterfaceC8589tr interfaceC8589tr) {
        G10.g(interfaceC8589tr, "listener");
        this.M.add(interfaceC8589tr);
    }

    @Override // androidx.lifecycle.e
    public y.c j() {
        return (y.c) this.U.getValue();
    }

    @Override // androidx.lifecycle.e
    public AbstractC5247hu k() {
        C3804cm0 c3804cm0 = new C3804cm0(null, 1, null);
        if (getApplication() != null) {
            AbstractC5247hu.b bVar = y.a.g;
            Application application = getApplication();
            G10.f(application, "application");
            c3804cm0.c(bVar, application);
        }
        c3804cm0.c(androidx.lifecycle.u.a, this);
        c3804cm0.c(androidx.lifecycle.u.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            c3804cm0.c(androidx.lifecycle.u.c, extras);
        }
        return c3804cm0;
    }

    @Override // com.daaw.I2
    public final H2 l() {
        return this.L;
    }

    @Override // com.daaw.InterfaceC0417Be1
    public C0313Ae1 n() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        S();
        C0313Ae1 c0313Ae1 = this.G;
        G10.d(c0313Ae1);
        return c0313Ae1;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (this.L.e(i2, i3, intent)) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c().k();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        G10.g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.M.iterator();
        while (it.hasNext()) {
            ((InterfaceC8589tr) it.next()).accept(configuration);
        }
    }

    @Override // com.daaw.AbstractActivityC7459po, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.F.d(bundle);
        this.D.c(this);
        super.onCreate(bundle);
        androidx.lifecycle.q.INSTANCE.c(this);
        int i2 = this.J;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        G10.g(menu, "menu");
        if (i2 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        this.E.b(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        G10.g(menuItem, "item");
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.E.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.S) {
            return;
        }
        Iterator it = this.P.iterator();
        while (it.hasNext()) {
            ((InterfaceC8589tr) it.next()).accept(new C2764Xl0(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        G10.g(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            ((InterfaceC8589tr) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        G10.g(menu, "menu");
        this.E.c(menu);
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.T) {
            return;
        }
        Iterator it = this.Q.iterator();
        while (it.hasNext()) {
            ((InterfaceC8589tr) it.next()).accept(new C10007yu0(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        G10.g(menu, "menu");
        if (i2 != 0) {
            return true;
        }
        super.onPreparePanel(i2, view, menu);
        this.E.e(menu);
        return true;
    }

    @Override // android.app.Activity, com.daaw.AbstractC9204w2.c
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        G10.g(strArr, "permissions");
        G10.g(iArr, "grantResults");
        if (this.L.e(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object objX = X();
        C0313Ae1 c0313Ae1A = this.G;
        if (c0313Ae1A == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            c0313Ae1A = dVar.a();
        }
        if (c0313Ae1A == null && objX == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.b(objX);
        dVar2.c(c0313Ae1A);
        return dVar2;
    }

    @Override // com.daaw.AbstractActivityC7459po, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        G10.g(bundle, "outState");
        if (w() instanceof androidx.lifecycle.l) {
            androidx.lifecycle.g gVarW = w();
            G10.e(gVarW, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((androidx.lifecycle.l) gVarW).n(g.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.F.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        Iterator it = this.N.iterator();
        while (it.hasNext()) {
            ((InterfaceC8589tr) it.next()).accept(Integer.valueOf(i2));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.R.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // com.daaw.InterfaceC3135aN0
    public final YM0 p() {
        return this.F.b();
    }

    @Override // com.daaw.InterfaceC0681Dq0
    public final void q(InterfaceC8589tr interfaceC8589tr) {
        G10.g(interfaceC8589tr, "listener");
        this.N.remove(interfaceC8589tr);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (P41.d()) {
                P41.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            T().b();
            P41.b();
        } catch (Throwable th) {
            P41.b();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        U();
        e eVar = this.H;
        View decorView = getWindow().getDecorView();
        G10.f(decorView, "window.decorView");
        eVar.y0(decorView);
        super.setContentView(i2);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i2) {
        G10.g(intent, "intent");
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) throws IntentSender.SendIntentException {
        G10.g(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // com.daaw.InterfaceC9952yj0
    public void u(InterfaceC0861Fj0 interfaceC0861Fj0) {
        G10.g(interfaceC0861Fj0, "provider");
        this.E.a(interfaceC0861Fj0);
    }

    @Override // com.daaw.InterfaceC9150vq0
    public final void v(InterfaceC8589tr interfaceC8589tr) {
        G10.g(interfaceC8589tr, "listener");
        this.Q.remove(interfaceC8589tr);
    }

    @Override // com.daaw.AbstractActivityC7459po, com.daaw.InterfaceC1764Ob0
    public androidx.lifecycle.g w() {
        return super.w();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        G10.g(intent, "intent");
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        G10.g(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        G10.g(configuration, "newConfig");
        this.S = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.S = false;
            Iterator it = this.P.iterator();
            while (it.hasNext()) {
                ((InterfaceC8589tr) it.next()).accept(new C2764Xl0(z, configuration));
            }
        } catch (Throwable th) {
            this.S = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        G10.g(configuration, "newConfig");
        this.T = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.T = false;
            Iterator it = this.Q.iterator();
            while (it.hasNext()) {
                ((InterfaceC8589tr) it.next()).accept(new C10007yu0(z, configuration));
            }
        } catch (Throwable th) {
            this.T = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        U();
        e eVar = this.H;
        View decorView = getWindow().getDecorView();
        G10.f(decorView, "window.decorView");
        eVar.y0(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        U();
        e eVar = this.H;
        View decorView = getWindow().getDecorView();
        G10.f(decorView, "window.decorView");
        eVar.y0(decorView);
        super.setContentView(view, layoutParams);
    }
}
