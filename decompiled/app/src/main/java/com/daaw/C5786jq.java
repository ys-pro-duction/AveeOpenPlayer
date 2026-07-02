package com.daaw;

import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.daaw.jq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5786jq {
    public static final Map d = new HashMap();
    public static final Executor e = new ExecutorC2748Xh0();
    public final Executor a;
    public final C8584tq b;
    public AbstractC6963o11 c = null;

    /* JADX INFO: renamed from: com.daaw.jq$b */
    public static class b implements InterfaceC0464Bq0, InterfaceC7470pq0, InterfaceC4381eq0 {
        public final CountDownLatch a;

        public b() {
            this.a = new CountDownLatch(1);
        }

        public boolean a(long j, TimeUnit timeUnit) {
            return this.a.await(j, timeUnit);
        }

        @Override // com.daaw.InterfaceC4381eq0
        public void b() {
            this.a.countDown();
        }

        @Override // com.daaw.InterfaceC7470pq0
        public void c(Exception exc) {
            this.a.countDown();
        }

        @Override // com.daaw.InterfaceC0464Bq0
        public void onSuccess(Object obj) {
            this.a.countDown();
        }
    }

    public C5786jq(Executor executor, C8584tq c8584tq) {
        this.a = executor;
        this.b = c8584tq;
    }

    public static /* synthetic */ AbstractC6963o11 a(C5786jq c5786jq, boolean z, com.google.firebase.remoteconfig.internal.b bVar, Void r3) {
        if (z) {
            c5786jq.k(bVar);
        } else {
            c5786jq.getClass();
        }
        return A11.e(bVar);
    }

    public static Object c(AbstractC6963o11 abstractC6963o11, long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        b bVar = new b();
        Executor executor = e;
        abstractC6963o11.e(executor, bVar);
        abstractC6963o11.d(executor, bVar);
        abstractC6963o11.a(executor, bVar);
        if (!bVar.a(j, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (abstractC6963o11.n()) {
            return abstractC6963o11.k();
        }
        throw new ExecutionException(abstractC6963o11.j());
    }

    public static synchronized C5786jq h(Executor executor, C8584tq c8584tq) {
        String strB;
        Map map;
        try {
            strB = c8584tq.b();
            map = d;
            if (!map.containsKey(strB)) {
                map.put(strB, new C5786jq(executor, c8584tq));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C5786jq) map.get(strB);
    }

    public void d() {
        synchronized (this) {
            this.c = A11.e(null);
        }
        this.b.a();
    }

    public synchronized AbstractC6963o11 e() {
        try {
            AbstractC6963o11 abstractC6963o11 = this.c;
            if (abstractC6963o11 == null || (abstractC6963o11.m() && !this.c.n())) {
                Executor executor = this.a;
                final C8584tq c8584tq = this.b;
                Objects.requireNonNull(c8584tq);
                this.c = A11.c(executor, new Callable() { // from class: com.daaw.gq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return c8584tq.d();
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public com.google.firebase.remoteconfig.internal.b f() {
        return g(5L);
    }

    public com.google.firebase.remoteconfig.internal.b g(long j) {
        synchronized (this) {
            try {
                AbstractC6963o11 abstractC6963o11 = this.c;
                if (abstractC6963o11 == null || !abstractC6963o11.n()) {
                    try {
                        return (com.google.firebase.remoteconfig.internal.b) c(e(), j, TimeUnit.SECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                        return null;
                    }
                }
                return (com.google.firebase.remoteconfig.internal.b) this.c.k();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AbstractC6963o11 i(com.google.firebase.remoteconfig.internal.b bVar) {
        return j(bVar, true);
    }

    public AbstractC6963o11 j(final com.google.firebase.remoteconfig.internal.b bVar, final boolean z) {
        return A11.c(this.a, new Callable() { // from class: com.daaw.hq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.b.e(bVar);
            }
        }).p(this.a, new InterfaceC9066vZ0() { // from class: com.daaw.iq
            @Override // com.daaw.InterfaceC9066vZ0
            public final AbstractC6963o11 a(Object obj) {
                return C5786jq.a(this.a, z, bVar, (Void) obj);
            }
        });
    }

    public final synchronized void k(com.google.firebase.remoteconfig.internal.b bVar) {
        this.c = A11.e(bVar);
    }
}
