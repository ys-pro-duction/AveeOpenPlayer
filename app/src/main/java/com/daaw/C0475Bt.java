package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.daaw.Bt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0475Bt {
    public final Context a;
    public final C7050oL b;
    public final C1739Nv c;
    public C0579Ct f;
    public C0579Ct g;
    public boolean h;
    public C10280zt i;
    public final SX j;
    public final RK k;
    public final InterfaceC0848Fg l;
    public final InterfaceC3609c4 m;
    public final ExecutorService n;
    public final C9722xt o;
    public final InterfaceC0692Dt p;
    public final long e = System.currentTimeMillis();
    public final C7191oq0 d = new C7191oq0();

    /* JADX INFO: renamed from: com.daaw.Bt$a */
    public class a implements Callable {
        public final /* synthetic */ OQ0 a;

        public a(OQ0 oq0) {
            this.a = oq0;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC6963o11 call() {
            return C0475Bt.this.f(this.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Bt$b */
    public class b implements Runnable {
        public final /* synthetic */ OQ0 B;

        public b(OQ0 oq0) {
            this.B = oq0;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0475Bt.this.f(this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Bt$c */
    public class c implements Callable {
        public c() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            try {
                boolean zD = C0475Bt.this.f.d();
                if (!zD) {
                    C2106Rd0.f().k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(zD);
            } catch (Exception e) {
                C2106Rd0.f().e("Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Bt$d */
    public class d implements Callable {
        public d() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(C0475Bt.this.i.s());
        }
    }

    public C0475Bt(C7050oL c7050oL, SX sx, InterfaceC0692Dt interfaceC0692Dt, C1739Nv c1739Nv, InterfaceC0848Fg interfaceC0848Fg, InterfaceC3609c4 interfaceC3609c4, RK rk, ExecutorService executorService) {
        this.b = c7050oL;
        this.c = c1739Nv;
        this.a = c7050oL.k();
        this.j = sx;
        this.p = interfaceC0692Dt;
        this.l = interfaceC0848Fg;
        this.m = interfaceC3609c4;
        this.n = executorService;
        this.k = rk;
        this.o = new C9722xt(executorService);
    }

    public static String i() {
        return "18.3.7";
    }

    public static boolean j(String str, boolean z) {
        if (z) {
            return !TextUtils.isEmpty(str);
        }
        C2106Rd0.f().i("Configured not to require a build ID.");
        return true;
    }

    public final void d() {
        try {
            this.h = Boolean.TRUE.equals((Boolean) AbstractC0622Db1.f(this.o.h(new d())));
        } catch (Exception unused) {
            this.h = false;
        }
    }

    public boolean e() {
        return this.f.c();
    }

    public final AbstractC6963o11 f(OQ0 oq0) {
        n();
        try {
            this.l.a(new InterfaceC0744Eg() { // from class: com.daaw.At
                @Override // com.daaw.InterfaceC0744Eg
                public final void a(String str) {
                    this.a.k(str);
                }
            });
            this.i.R();
            if (!oq0.b().b.a) {
                C2106Rd0.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return A11.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.i.z(oq0)) {
                C2106Rd0.f().k("Previous sessions could not be finalized.");
            }
            return this.i.T(oq0.a());
        } catch (Exception e) {
            C2106Rd0.f().e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return A11.d(e);
        } finally {
            m();
        }
    }

    public AbstractC6963o11 g(OQ0 oq0) {
        return AbstractC0622Db1.h(this.n, new a(oq0));
    }

    public final void h(OQ0 oq0) {
        Future<?> futureSubmit = this.n.submit(new b(oq0));
        C2106Rd0.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            C2106Rd0.f().e("Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            C2106Rd0.f().e("Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            C2106Rd0.f().e("Crashlytics timed out during initialization.", e3);
        }
    }

    public void k(String str) {
        this.i.X(System.currentTimeMillis() - this.e, str);
    }

    public void l(Throwable th) {
        this.i.W(Thread.currentThread(), th);
    }

    public void m() {
        this.o.h(new c());
    }

    public void n() {
        this.o.b();
        this.f.a();
        C2106Rd0.f().i("Initialization marker file was created.");
    }

    public boolean o(U9 u9, OQ0 oq0) {
        if (!j(u9.b, AbstractC0555Cn.k(this.a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String string = new C6592mi(this.j).toString();
        try {
            this.g = new C0579Ct("crash_marker", this.k);
            this.f = new C0579Ct("initialization_marker", this.k);
            C2199Sa1 c2199Sa1 = new C2199Sa1(string, this.k, this.o);
            C0941Gd0 c0941Gd0 = new C0941Gd0(this.k);
            this.i = new C10280zt(this.a, this.o, this.j, this.c, this.k, this.g, u9, c2199Sa1, c0941Gd0, C7629qQ0.g(this.a, this.j, this.k, u9, c0941Gd0, c2199Sa1, new C7997rk0(1024, new RG0(10)), oq0, this.d), this.p, this.m);
            boolean zE = e();
            d();
            this.i.x(string, Thread.getDefaultUncaughtExceptionHandler(), oq0);
            if (!zE || !AbstractC0555Cn.c(this.a)) {
                C2106Rd0.f().b("Successfully configured exception handler.");
                return true;
            }
            C2106Rd0.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            h(oq0);
            return false;
        } catch (Exception e) {
            C2106Rd0.f().e("Crashlytics was not started due to an exception during initialization", e);
            this.i = null;
            return false;
        }
    }
}
