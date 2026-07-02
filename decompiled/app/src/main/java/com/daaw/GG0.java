package com.daaw;

import android.app.Application;
import android.content.Context;
import com.daaw.ComponentCallbacks2C3485be;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.revenuecat.purchases.api.BuildConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class GG0 {
    public static final InterfaceC5485im j = C2599Vw.d();
    public static final Random k = new Random();
    public static final Map l = new HashMap();
    public final Map a;
    public final Context b;
    public final ScheduledExecutorService c;
    public final C7050oL d;
    public final RL e;
    public final C5925kL f;
    public final InterfaceC7569qB0 g;
    public final String h;
    public Map i;

    public static class a implements ComponentCallbacks2C3485be.a {
        public static final AtomicReference a = new AtomicReference();

        public static void c(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference = a;
            if (atomicReference.get() == null) {
                a aVar = new a();
                if (AbstractC0552Cm0.a(atomicReference, null, aVar)) {
                    ComponentCallbacks2C3485be.c(application);
                    ComponentCallbacks2C3485be.b().a(aVar);
                }
            }
        }

        @Override // com.daaw.ComponentCallbacks2C3485be.a
        public void a(boolean z) {
            GG0.o(z);
        }
    }

    public GG0(Context context, ScheduledExecutorService scheduledExecutorService, C7050oL c7050oL, RL rl, C5925kL c5925kL, InterfaceC7569qB0 interfaceC7569qB0) {
        this(context, scheduledExecutorService, c7050oL, rl, c5925kL, interfaceC7569qB0, true);
    }

    public static /* synthetic */ W3 a() {
        return null;
    }

    public static com.google.firebase.remoteconfig.internal.d j(Context context, String str, String str2) {
        return new com.google.firebase.remoteconfig.internal.d(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    public static C7490pu0 k(C7050oL c7050oL, String str, InterfaceC7569qB0 interfaceC7569qB0) {
        if (n(c7050oL) && str.equals("firebase")) {
            return new C7490pu0(interfaceC7569qB0);
        }
        return null;
    }

    public static boolean m(C7050oL c7050oL, String str) {
        return str.equals("firebase") && n(c7050oL);
    }

    public static boolean n(C7050oL c7050oL) {
        return c7050oL.m().equals("[DEFAULT]");
    }

    public static synchronized void o(boolean z) {
        Iterator it = l.values().iterator();
        while (it.hasNext()) {
            ((C3130aM) it.next()).p(z);
        }
    }

    public synchronized C3130aM c(C7050oL c7050oL, String str, RL rl, C5925kL c5925kL, Executor executor, C5786jq c5786jq, C5786jq c5786jq2, C5786jq c5786jq3, com.google.firebase.remoteconfig.internal.c cVar, C7748qq c7748qq, com.google.firebase.remoteconfig.internal.d dVar) throws Throwable {
        GG0 gg0;
        String str2;
        try {
            try {
                if (this.a.containsKey(str)) {
                    gg0 = this;
                    str2 = str;
                } else {
                    gg0 = this;
                    str2 = str;
                    C3130aM c3130aM = new C3130aM(this.b, c7050oL, rl, m(c7050oL, str) ? c5925kL : null, executor, c5786jq, c5786jq2, c5786jq3, cVar, c7748qq, dVar, l(c7050oL, rl, cVar, c5786jq2, this.b, str, dVar));
                    c3130aM.q();
                    gg0.a.put(str2, c3130aM);
                    l.put(str2, c3130aM);
                }
                return (C3130aM) gg0.a.get(str2);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public synchronized C3130aM d(String str) throws Throwable {
        Throwable th;
        try {
            try {
                C5786jq c5786jqE = e(str, "fetch");
                C5786jq c5786jqE2 = e(str, "activate");
                C5786jq c5786jqE3 = e(str, BuildConfig.FLAVOR);
                com.google.firebase.remoteconfig.internal.d dVarJ = j(this.b, this.h, str);
                C7748qq c7748qqI = i(c5786jqE2, c5786jqE3);
                final C7490pu0 c7490pu0K = k(this.d, str, this.g);
                if (c7490pu0K != null) {
                    try {
                        c7748qqI.b(new InterfaceC6298lf() { // from class: com.daaw.DG0
                            @Override // com.daaw.InterfaceC6298lf
                            public final void a(Object obj, Object obj2) {
                                c7490pu0K.a((String) obj, (com.google.firebase.remoteconfig.internal.b) obj2);
                            }
                        });
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                return c(this.d, str, this.e, this.f, this.c, c5786jqE, c5786jqE2, c5786jqE3, g(str, c5786jqE, dVarJ), c7748qqI, dVarJ);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final C5786jq e(String str, String str2) {
        return C5786jq.h(this.c, C8584tq.c(this.b, String.format("%s_%s_%s_%s.json", "frc", this.h, str, str2)));
    }

    public C3130aM f() {
        return d("firebase");
    }

    public synchronized com.google.firebase.remoteconfig.internal.c g(String str, C5786jq c5786jq, com.google.firebase.remoteconfig.internal.d dVar) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new com.google.firebase.remoteconfig.internal.c(this.e, n(this.d) ? this.g : new InterfaceC7569qB0() { // from class: com.daaw.FG0
            @Override // com.daaw.InterfaceC7569qB0
            public final Object get() {
                return GG0.a();
            }
        }, this.c, j, k, c5786jq, h(this.d.n().b(), str, dVar), dVar, this.i);
    }

    public ConfigFetchHttpClient h(String str, String str2, com.google.firebase.remoteconfig.internal.d dVar) {
        return new ConfigFetchHttpClient(this.b, this.d.n().c(), str, str2, dVar.b(), dVar.b());
    }

    public final C7748qq i(C5786jq c5786jq, C5786jq c5786jq2) {
        return new C7748qq(this.c, c5786jq, c5786jq2);
    }

    public synchronized C8026rq l(C7050oL c7050oL, RL rl, com.google.firebase.remoteconfig.internal.c cVar, C5786jq c5786jq, Context context, String str, com.google.firebase.remoteconfig.internal.d dVar) {
        return new C8026rq(c7050oL, rl, cVar, c5786jq, context, str, dVar, this.c);
    }

    public GG0(Context context, ScheduledExecutorService scheduledExecutorService, C7050oL c7050oL, RL rl, C5925kL c5925kL, InterfaceC7569qB0 interfaceC7569qB0, boolean z) {
        this.a = new HashMap();
        this.i = new HashMap();
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = c7050oL;
        this.e = rl;
        this.f = c5925kL;
        this.g = interfaceC7569qB0;
        this.h = c7050oL.n().c();
        a.c(context);
        if (z) {
            A11.c(scheduledExecutorService, new Callable() { // from class: com.daaw.EG0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.f();
                }
            });
        }
    }
}
