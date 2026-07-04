package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    public final C0475Bt a;

    public class a implements InterfaceC1519Ls {
        @Override // com.daaw.InterfaceC1519Ls
        public Object a(AbstractC6963o11 abstractC6963o11) {
            if (abstractC6963o11.n()) {
                return null;
            }
            C2106Rd0.f().e("Error fetching settings.", abstractC6963o11.j());
            return null;
        }
    }

    public class b implements Callable {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ C0475Bt b;
        public final /* synthetic */ LQ0 c;

        public b(boolean z, C0475Bt c0475Bt, LQ0 lq0) {
            this.a = z;
            this.b = c0475Bt;
            this.c = lq0;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (!this.a) {
                return null;
            }
            this.b.g(this.c);
            return null;
        }
    }

    public IL(C0475Bt c0475Bt) {
        this.a = c0475Bt;
    }

    public static IL a() {
        IL il = (IL) C7050oL.l().j(IL.class);
        if (il != null) {
            return il;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public static IL b(C7050oL c7050oL, RL rl, InterfaceC7784qy interfaceC7784qy, InterfaceC7784qy interfaceC7784qy2) {
        Context contextK = c7050oL.k();
        String packageName = contextK.getPackageName();
        C2106Rd0.f().g("Initializing Firebase Crashlytics " + C0475Bt.i() + " for " + packageName);
        RK rk = new RK(contextK);
        C1739Nv c1739Nv = new C1739Nv(c7050oL);
        SX sx = new SX(contextK, packageName, rl, c1739Nv);
        C1004Gt c1004Gt = new C1004Gt(interfaceC7784qy);
        C3331b4 c3331b4 = new C3331b4(interfaceC7784qy2);
        C0475Bt c0475Bt = new C0475Bt(c7050oL, sx, c1004Gt, c1739Nv, c3331b4.e(), c3331b4.d(), rk, DI.c("Crashlytics Exception Handler"));
        String strC = c7050oL.n().c();
        String strO = AbstractC0555Cn.o(contextK);
        List<C8260sh> listL = AbstractC0555Cn.l(contextK);
        C2106Rd0.f().b("Mapping file ID is: " + strO);
        for (C8260sh c8260sh : listL) {
            C2106Rd0.f().b(String.format("Build id for %s on %s: %s", c8260sh.c(), c8260sh.a(), c8260sh.b()));
        }
        try {
            U9 u9A = U9.a(contextK, sx, strC, strO, listL, new FB(contextK));
            C2106Rd0.f().i("Installer package name is: " + u9A.d);
            ExecutorService executorServiceC = DI.c("com.google.firebase.crashlytics.startup");
            LQ0 lq0L = LQ0.l(contextK, strC, sx, new AW(), u9A.f, u9A.g, rk, c1739Nv);
            lq0L.p(executorServiceC).g(executorServiceC, new a());
            A11.c(executorServiceC, new b(c0475Bt.o(u9A, lq0L), c0475Bt, lq0L));
            return new IL(c0475Bt);
        } catch (PackageManager.NameNotFoundException e) {
            C2106Rd0.f().e("Error retrieving app package info.", e);
            return null;
        }
    }

    public void c(String str) {
        this.a.k(str);
    }

    public void d(Throwable th) {
        if (th == null) {
            C2106Rd0.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.a.l(th);
        }
    }
}
