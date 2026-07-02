package com.daaw;

import com.daaw.AbstractC8915v0;
import com.daaw.C2756Xj0;
import com.daaw.C6262lX0;
import com.daaw.C9632xb;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8915v0 {
    public static final long n;
    public static final long o;
    public static final long p;
    public static final long q;
    public static final long r;
    public C9632xb.b a;
    public C9632xb.b b;
    public final C7612qM c;
    public final C6882nk0 d;
    public final C9632xb f;
    public final C9632xb.d g;
    public final C9632xb.d h;
    public AbstractC1699Nl k;
    public final C4800gJ l;
    public final KX0 m;
    public JX0 i = JX0.Initial;
    public long j = 0;
    public final b e = new b();

    /* JADX INFO: renamed from: com.daaw.v0$a */
    public class a {
        public final long a;

        public a(long j) {
            this.a = j;
        }

        public void a(Runnable runnable) {
            AbstractC8915v0.this.f.n();
            if (AbstractC8915v0.this.j == this.a) {
                runnable.run();
            } else {
                AbstractC2212Sd0.a(AbstractC8915v0.this.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.v0$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC8915v0.this.j();
        }
    }

    /* JADX INFO: renamed from: com.daaw.v0$c */
    public class c implements InterfaceC4585fZ {
        public final a a;

        public c(a aVar) {
            this.a = aVar;
        }

        public static /* synthetic */ void e(c cVar, C6262lX0 c6262lX0) {
            cVar.getClass();
            if (c6262lX0.o()) {
                AbstractC2212Sd0.a(AbstractC8915v0.this.getClass().getSimpleName(), "(%x) Stream closed.", Integer.valueOf(System.identityHashCode(AbstractC8915v0.this)));
            } else {
                AbstractC2212Sd0.d(AbstractC8915v0.this.getClass().getSimpleName(), "(%x) Stream closed with status: %s.", Integer.valueOf(System.identityHashCode(AbstractC8915v0.this)), c6262lX0);
            }
            AbstractC8915v0.this.k(c6262lX0);
        }

        public static /* synthetic */ void f(c cVar, C2756Xj0 c2756Xj0) {
            cVar.getClass();
            if (AbstractC2212Sd0.c()) {
                HashMap map = new HashMap();
                for (String str : c2756Xj0.j()) {
                    if (C4408ew.e.contains(str.toLowerCase(Locale.ENGLISH))) {
                        map.put(str, (String) c2756Xj0.g(C2756Xj0.g.e(str, C2756Xj0.e)));
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                AbstractC2212Sd0.a(AbstractC8915v0.this.getClass().getSimpleName(), "(%x) Stream received headers: %s", Integer.valueOf(System.identityHashCode(AbstractC8915v0.this)), map);
            }
        }

        public static /* synthetic */ void g(c cVar, Object obj) {
            cVar.getClass();
            if (AbstractC2212Sd0.c()) {
                AbstractC2212Sd0.a(AbstractC8915v0.this.getClass().getSimpleName(), "(%x) Stream received: %s", Integer.valueOf(System.identityHashCode(AbstractC8915v0.this)), obj);
            }
            AbstractC8915v0.this.p(obj);
        }

        public static /* synthetic */ void h(c cVar) {
            AbstractC2212Sd0.a(AbstractC8915v0.this.getClass().getSimpleName(), "(%x) Stream is open", Integer.valueOf(System.identityHashCode(AbstractC8915v0.this)));
            AbstractC8915v0.this.q();
        }

        @Override // com.daaw.InterfaceC4585fZ
        public void a() {
            this.a.a(new Runnable() { // from class: com.daaw.w0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC8915v0.c.h(this.B);
                }
            });
        }

        @Override // com.daaw.InterfaceC4585fZ
        public void b(final C6262lX0 c6262lX0) {
            this.a.a(new Runnable() { // from class: com.daaw.z0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC8915v0.c.e(this.B, c6262lX0);
                }
            });
        }

        @Override // com.daaw.InterfaceC4585fZ
        public void c(final C2756Xj0 c2756Xj0) {
            this.a.a(new Runnable() { // from class: com.daaw.y0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC8915v0.c.f(this.B, c2756Xj0);
                }
            });
        }

        @Override // com.daaw.InterfaceC4585fZ
        public void d(final Object obj) {
            this.a.a(new Runnable() { // from class: com.daaw.x0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC8915v0.c.g(this.B, obj);
                }
            });
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        n = timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        o = timeUnit2.toMillis(1L);
        p = timeUnit2.toMillis(1L);
        q = timeUnit.toMillis(10L);
        r = timeUnit.toMillis(10L);
    }

    public AbstractC8915v0(C7612qM c7612qM, C6882nk0 c6882nk0, C9632xb c9632xb, C9632xb.d dVar, C9632xb.d dVar2, C9632xb.d dVar3, KX0 kx0) {
        this.c = c7612qM;
        this.d = c6882nk0;
        this.f = c9632xb;
        this.g = dVar2;
        this.h = dVar3;
        this.m = kx0;
        this.l = new C4800gJ(c9632xb, dVar, n, 1.5d, o);
    }

    public static /* synthetic */ void a(AbstractC8915v0 abstractC8915v0) {
        JX0 jx0 = abstractC8915v0.i;
        AbstractC6557mb.d(jx0 == JX0.Backoff, "State should still be backoff but was %s", jx0);
        abstractC8915v0.i = JX0.Initial;
        abstractC8915v0.s();
        AbstractC6557mb.d(abstractC8915v0.n(), "Stream should have started", new Object[0]);
    }

    public static /* synthetic */ void b(AbstractC8915v0 abstractC8915v0) {
        if (abstractC8915v0.m()) {
            abstractC8915v0.i = JX0.Healthy;
        }
    }

    public final void g() {
        C9632xb.b bVar = this.a;
        if (bVar != null) {
            bVar.c();
            this.a = null;
        }
    }

    public final void h() {
        C9632xb.b bVar = this.b;
        if (bVar != null) {
            bVar.c();
            this.b = null;
        }
    }

    public final void i(JX0 jx0, C6262lX0 c6262lX0) {
        AbstractC6557mb.d(n(), "Only started streams should be closed.", new Object[0]);
        JX0 jx02 = JX0.Error;
        AbstractC6557mb.d(jx0 == jx02 || c6262lX0.o(), "Can't provide an error when not in an error state.", new Object[0]);
        this.f.n();
        if (C4408ew.e(c6262lX0)) {
            AbstractC6838nb1.p(new IllegalStateException("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", c6262lX0.l()));
        }
        h();
        g();
        this.l.c();
        this.j++;
        C6262lX0.b bVarM = c6262lX0.m();
        if (bVarM == C6262lX0.b.OK) {
            this.l.e();
        } else if (bVarM == C6262lX0.b.RESOURCE_EXHAUSTED) {
            AbstractC2212Sd0.a(getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", Integer.valueOf(System.identityHashCode(this)));
            this.l.f();
        } else if (bVarM == C6262lX0.b.UNAUTHENTICATED && this.i != JX0.Healthy) {
            this.c.d();
        } else if (bVarM == C6262lX0.b.UNAVAILABLE && ((c6262lX0.l() instanceof UnknownHostException) || (c6262lX0.l() instanceof ConnectException))) {
            this.l.g(r);
        }
        if (jx0 != jx02) {
            AbstractC2212Sd0.a(getClass().getSimpleName(), "(%x) Performing stream teardown", Integer.valueOf(System.identityHashCode(this)));
            u();
        }
        if (this.k != null) {
            if (c6262lX0.o()) {
                AbstractC2212Sd0.a(getClass().getSimpleName(), "(%x) Closing stream client-side", Integer.valueOf(System.identityHashCode(this)));
                this.k.b();
            }
            this.k = null;
        }
        this.i = jx0;
        this.m.b(c6262lX0);
    }

    public final void j() {
        if (m()) {
            i(JX0.Initial, C6262lX0.f);
        }
    }

    public void k(C6262lX0 c6262lX0) {
        AbstractC6557mb.d(n(), "Can't handle server close on non-started stream!", new Object[0]);
        i(JX0.Error, c6262lX0);
    }

    public void l() {
        AbstractC6557mb.d(!n(), "Can only inhibit backoff after in a stopped state", new Object[0]);
        this.f.n();
        this.i = JX0.Initial;
        this.l.e();
    }

    public boolean m() {
        this.f.n();
        JX0 jx0 = this.i;
        return jx0 == JX0.Open || jx0 == JX0.Healthy;
    }

    public boolean n() {
        this.f.n();
        JX0 jx0 = this.i;
        return jx0 == JX0.Starting || jx0 == JX0.Backoff || m();
    }

    public void o() {
        if (m() && this.b == null) {
            this.b = this.f.h(this.g, p, this.e);
        }
    }

    public abstract void p(Object obj);

    public final void q() {
        this.i = JX0.Open;
        this.m.a();
        if (this.a == null) {
            this.a = this.f.h(this.h, q, new Runnable() { // from class: com.daaw.u0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC8915v0.b(this.B);
                }
            });
        }
    }

    public final void r() {
        AbstractC6557mb.d(this.i == JX0.Error, "Should only perform backoff in an error state", new Object[0]);
        this.i = JX0.Backoff;
        this.l.b(new Runnable() { // from class: com.daaw.t0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC8915v0.a(this.B);
            }
        });
    }

    public void s() {
        this.f.n();
        AbstractC6557mb.d(this.k == null, "Last call still set", new Object[0]);
        AbstractC6557mb.d(this.b == null, "Idle timer still set", new Object[0]);
        JX0 jx0 = this.i;
        if (jx0 == JX0.Error) {
            r();
            return;
        }
        AbstractC6557mb.d(jx0 == JX0.Initial, "Already started", new Object[0]);
        this.k = this.c.f(this.d, new c(new a(this.j)));
        this.i = JX0.Starting;
    }

    public void t() {
        if (n()) {
            i(JX0.Initial, C6262lX0.f);
        }
    }

    public void v(Object obj) {
        this.f.n();
        AbstractC2212Sd0.a(getClass().getSimpleName(), "(%x) Stream sending: %s", Integer.valueOf(System.identityHashCode(this)), obj);
        h();
        this.k.d(obj);
    }

    public void u() {
    }
}
