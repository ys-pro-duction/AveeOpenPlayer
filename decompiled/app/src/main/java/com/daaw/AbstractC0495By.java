package com.daaw;

import com.daaw.AbstractC1699Nl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.By, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0495By extends AbstractC1699Nl {
    public static final Logger j = Logger.getLogger(AbstractC0495By.class.getName());
    public static final AbstractC1699Nl k = new i();
    public final ScheduledFuture a;
    public final Executor b;
    public final C8594ts c;
    public volatile boolean d;
    public AbstractC1699Nl.a e;
    public AbstractC1699Nl f;
    public C6262lX0 g;
    public List h = new ArrayList();
    public k i;

    /* JADX INFO: renamed from: com.daaw.By$a */
    public class a extends AbstractRunnableC0471Bs {
        public a(C8594ts c8594ts) {
            super(c8594ts);
        }

        @Override // com.daaw.AbstractRunnableC0471Bs
        public void a() {
            AbstractC0495By.this.m();
        }
    }

    /* JADX INFO: renamed from: com.daaw.By$b */
    public class b implements Runnable {
        public final /* synthetic */ StringBuilder B;

        public b(StringBuilder sb) {
            this.B = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0495By.this.k(C6262lX0.j.q(this.B.toString()), true);
        }
    }

    /* JADX INFO: renamed from: com.daaw.By$c */
    public class c extends AbstractRunnableC0471Bs {
        public final /* synthetic */ k C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k kVar) {
            super(AbstractC0495By.this.c);
            this.C = kVar;
        }

        @Override // com.daaw.AbstractRunnableC0471Bs
        public void a() {
            this.C.g();
        }
    }

    /* JADX INFO: renamed from: com.daaw.By$d */
    public class d implements Runnable {
        public final /* synthetic */ AbstractC1699Nl.a B;
        public final /* synthetic */ C2756Xj0 C;

        public d(AbstractC1699Nl.a aVar, C2756Xj0 c2756Xj0) {
            this.B = aVar;
            this.C = c2756Xj0;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0495By.this.f.e(this.B, this.C);
        }
    }

    /* JADX INFO: renamed from: com.daaw.By$e */
    public class e implements Runnable {
        public final /* synthetic */ C6262lX0 B;

        public e(C6262lX0 c6262lX0) {
            this.B = c6262lX0;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0495By.this.f.a(this.B.n(), this.B.l());
        }
    }

    /* JADX INFO: renamed from: com.daaw.By$f */
    public class f implements Runnable {
        public final /* synthetic */ Object B;

        public f(Object obj) {
            this.B = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0495By.this.f.d(this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.By$g */
    public class g implements Runnable {
        public final /* synthetic */ int B;

        public g(int i) {
            this.B = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0495By.this.f.c(this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.By$h */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0495By.this.f.b();
        }
    }

    /* JADX INFO: renamed from: com.daaw.By$j */
    public final class j extends AbstractRunnableC0471Bs {
        public final AbstractC1699Nl.a C;
        public final C6262lX0 D;

        public j(AbstractC1699Nl.a aVar, C6262lX0 c6262lX0) {
            super(AbstractC0495By.this.c);
            this.C = aVar;
            this.D = c6262lX0;
        }

        @Override // com.daaw.AbstractRunnableC0471Bs
        public void a() {
            this.C.a(this.D, new C2756Xj0());
        }
    }

    /* JADX INFO: renamed from: com.daaw.By$k */
    public static final class k extends AbstractC1699Nl.a {
        public final AbstractC1699Nl.a a;
        public volatile boolean b;
        public List c = new ArrayList();

        /* JADX INFO: renamed from: com.daaw.By$k$a */
        public class a implements Runnable {
            public final /* synthetic */ C2756Xj0 B;

            public a(C2756Xj0 c2756Xj0) {
                this.B = c2756Xj0;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.a.b(this.B);
            }
        }

        /* JADX INFO: renamed from: com.daaw.By$k$b */
        public class b implements Runnable {
            public final /* synthetic */ Object B;

            public b(Object obj) {
                this.B = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.a.c(this.B);
            }
        }

        /* JADX INFO: renamed from: com.daaw.By$k$c */
        public class c implements Runnable {
            public final /* synthetic */ C6262lX0 B;
            public final /* synthetic */ C2756Xj0 C;

            public c(C6262lX0 c6262lX0, C2756Xj0 c2756Xj0) {
                this.B = c6262lX0;
                this.C = c2756Xj0;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.a.a(this.B, this.C);
            }
        }

        /* JADX INFO: renamed from: com.daaw.By$k$d */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.a.d();
            }
        }

        public k(AbstractC1699Nl.a aVar) {
            this.a = aVar;
        }

        @Override // com.daaw.AbstractC1699Nl.a
        public void a(C6262lX0 c6262lX0, C2756Xj0 c2756Xj0) {
            f(new c(c6262lX0, c2756Xj0));
        }

        @Override // com.daaw.AbstractC1699Nl.a
        public void b(C2756Xj0 c2756Xj0) {
            if (this.b) {
                this.a.b(c2756Xj0);
            } else {
                f(new a(c2756Xj0));
            }
        }

        @Override // com.daaw.AbstractC1699Nl.a
        public void c(Object obj) {
            if (this.b) {
                this.a.c(obj);
            } else {
                f(new b(obj));
            }
        }

        @Override // com.daaw.AbstractC1699Nl.a
        public void d() {
            if (this.b) {
                this.a.d();
            } else {
                f(new d());
            }
        }

        public final void f(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.b) {
                        runnable.run();
                    } else {
                        this.c.add(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void g() {
            List list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    try {
                        if (this.c.isEmpty()) {
                            this.c = null;
                            this.b = true;
                            return;
                        } else {
                            list = this.c;
                            this.c = arrayList;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list.clear();
                arrayList = list;
            }
        }
    }

    public AbstractC0495By(Executor executor, ScheduledExecutorService scheduledExecutorService, C6381lw c6381lw) {
        this.b = (Executor) AbstractC7785qy0.o(executor, "callExecutor");
        AbstractC7785qy0.o(scheduledExecutorService, "scheduler");
        this.c = C8594ts.e();
        this.a = o(scheduledExecutorService, c6381lw);
    }

    @Override // com.daaw.AbstractC1699Nl
    public final void a(String str, Throwable th) {
        C6262lX0 c6262lX0 = C6262lX0.g;
        C6262lX0 c6262lX0Q = str != null ? c6262lX0.q(str) : c6262lX0.q("Call cancelled without message");
        if (th != null) {
            c6262lX0Q = c6262lX0Q.p(th);
        }
        k(c6262lX0Q, false);
    }

    @Override // com.daaw.AbstractC1699Nl
    public final void b() {
        l(new h());
    }

    @Override // com.daaw.AbstractC1699Nl
    public final void c(int i2) {
        if (this.d) {
            this.f.c(i2);
        } else {
            l(new g(i2));
        }
    }

    @Override // com.daaw.AbstractC1699Nl
    public final void d(Object obj) {
        if (this.d) {
            this.f.d(obj);
        } else {
            l(new f(obj));
        }
    }

    @Override // com.daaw.AbstractC1699Nl
    public final void e(AbstractC1699Nl.a aVar, C2756Xj0 c2756Xj0) {
        C6262lX0 c6262lX0;
        boolean z;
        AbstractC7785qy0.u(this.e == null, "already started");
        synchronized (this) {
            try {
                this.e = (AbstractC1699Nl.a) AbstractC7785qy0.o(aVar, "listener");
                c6262lX0 = this.g;
                z = this.d;
                if (!z) {
                    k kVar = new k(aVar);
                    this.i = kVar;
                    aVar = kVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c6262lX0 != null) {
            this.b.execute(new j(aVar, c6262lX0));
        } else if (z) {
            this.f.e(aVar, c2756Xj0);
        } else {
            l(new d(aVar, c2756Xj0));
        }
    }

    public final void k(C6262lX0 c6262lX0, boolean z) {
        boolean z2;
        AbstractC1699Nl.a aVar;
        synchronized (this) {
            try {
                if (this.f == null) {
                    q(k);
                    aVar = this.e;
                    this.g = c6262lX0;
                    z2 = false;
                } else {
                    if (z) {
                        return;
                    }
                    z2 = true;
                    aVar = null;
                }
                if (z2) {
                    l(new e(c6262lX0));
                } else {
                    if (aVar != null) {
                        this.b.execute(new j(aVar, c6262lX0));
                    }
                    m();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.d) {
                    runnable.run();
                } else {
                    this.h.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.h     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            r0 = 0
            r3.h = r0     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r3.d = r0     // Catch: java.lang.Throwable -> L24
            com.daaw.By$k r0 = r3.i     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.b
            com.daaw.By$c r2 = new com.daaw.By$c
            r2.<init>(r0)
            r1.execute(r2)
        L23:
            return
        L24:
            r0 = move-exception
            goto L44
        L26:
            java.util.List r1 = r3.h     // Catch: java.lang.Throwable -> L24
            r3.h = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2f
        L3f:
            r1.clear()
            r0 = r1
            goto L5
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC0495By.m():void");
    }

    public final boolean n(C6381lw c6381lw, C6381lw c6381lw2) {
        if (c6381lw2 == null) {
            return true;
        }
        if (c6381lw == null) {
            return false;
        }
        return c6381lw.l(c6381lw2);
    }

    public final ScheduledFuture o(ScheduledExecutorService scheduledExecutorService, C6381lw c6381lw) {
        C6381lw c6381lwG = this.c.g();
        if (c6381lw == null && c6381lwG == null) {
            return null;
        }
        long jO = c6381lw != null ? c6381lw.o(TimeUnit.NANOSECONDS) : Long.MAX_VALUE;
        if (c6381lwG != null) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (c6381lwG.o(timeUnit) < jO) {
                jO = c6381lwG.o(timeUnit);
                Logger logger = j;
                if (logger.isLoggable(Level.FINE)) {
                    Locale locale = Locale.US;
                    StringBuilder sb = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(jO)));
                    if (c6381lw == null) {
                        sb.append(" Explicit call timeout was not set.");
                    } else {
                        sb.append(String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(c6381lw.o(timeUnit))));
                    }
                    logger.fine(sb.toString());
                }
            }
        }
        long jAbs = Math.abs(jO);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long nanos = jAbs / timeUnit2.toNanos(1L);
        long jAbs2 = Math.abs(jO) % timeUnit2.toNanos(1L);
        StringBuilder sb2 = new StringBuilder();
        String str = n(c6381lwG, c6381lw) ? "Context" : "CallOptions";
        if (jO < 0) {
            sb2.append("ClientCall started after ");
            sb2.append(str);
            sb2.append(" deadline was exceeded. Deadline has been exceeded for ");
        } else {
            sb2.append("Deadline ");
            sb2.append(str);
            sb2.append(" will be exceeded in ");
        }
        sb2.append(nanos);
        sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        sb2.append("s. ");
        return scheduledExecutorService.schedule(new b(sb2), jO, TimeUnit.NANOSECONDS);
    }

    public final Runnable p(AbstractC1699Nl abstractC1699Nl) {
        synchronized (this) {
            try {
                if (this.f != null) {
                    return null;
                }
                q((AbstractC1699Nl) AbstractC7785qy0.o(abstractC1699Nl, "call"));
                return new a(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q(AbstractC1699Nl abstractC1699Nl) {
        AbstractC1699Nl abstractC1699Nl2 = this.f;
        AbstractC7785qy0.w(abstractC1699Nl2 == null, "realCall already set to %s", abstractC1699Nl2);
        ScheduledFuture scheduledFuture = this.a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f = abstractC1699Nl;
    }

    public String toString() {
        return AbstractC6329ll0.b(this).d("realCall", this.f).toString();
    }

    /* JADX INFO: renamed from: com.daaw.By$i */
    public class i extends AbstractC1699Nl {
        @Override // com.daaw.AbstractC1699Nl
        public void b() {
        }

        @Override // com.daaw.AbstractC1699Nl
        public void c(int i) {
        }

        @Override // com.daaw.AbstractC1699Nl
        public void d(Object obj) {
        }

        @Override // com.daaw.AbstractC1699Nl
        public void a(String str, Throwable th) {
        }

        @Override // com.daaw.AbstractC1699Nl
        public void e(AbstractC1699Nl.a aVar, C2756Xj0 c2756Xj0) {
        }
    }

    public void j() {
    }
}
