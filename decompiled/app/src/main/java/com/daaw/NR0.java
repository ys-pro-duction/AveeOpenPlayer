package com.daaw;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class NR0 {
    public static final NR0 d = new NR0(new a());
    public final IdentityHashMap a = new IdentityHashMap();
    public final e b;
    public ScheduledExecutorService c;

    public class a implements e {
        @Override // com.daaw.NR0.e
        public ScheduledExecutorService a() {
            return Executors.newSingleThreadScheduledExecutor(AbstractC7365pU.i("grpc-shared-destroyer-%d", true));
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ c B;
        public final /* synthetic */ d C;
        public final /* synthetic */ Object D;

        public b(c cVar, d dVar, Object obj) {
            this.B = cVar;
            this.C = dVar;
            this.D = obj;
        }

        /* JADX WARN: Finally extract failed */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (NR0.this) {
                try {
                    if (this.B.b == 0) {
                        try {
                            this.C.b(this.D);
                            NR0.this.a.remove(this.C);
                            if (NR0.this.a.isEmpty()) {
                                NR0.this.c.shutdown();
                                NR0.this.c = null;
                            }
                        } catch (Throwable th) {
                            NR0.this.a.remove(this.C);
                            if (NR0.this.a.isEmpty()) {
                                NR0.this.c.shutdown();
                                NR0.this.c = null;
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static class c {
        public final Object a;
        public int b;
        public ScheduledFuture c;

        public c(Object obj) {
            this.a = obj;
        }
    }

    public interface d {
        Object a();

        void b(Object obj);
    }

    public interface e {
        ScheduledExecutorService a();
    }

    public NR0(e eVar) {
        this.b = eVar;
    }

    public static Object d(d dVar) {
        return d.e(dVar);
    }

    public static Object f(d dVar, Object obj) {
        return d.g(dVar, obj);
    }

    public synchronized Object e(d dVar) {
        c cVar;
        try {
            cVar = (c) this.a.get(dVar);
            if (cVar == null) {
                cVar = new c(dVar.a());
                this.a.put(dVar, cVar);
            }
            ScheduledFuture scheduledFuture = cVar.c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                cVar.c = null;
            }
            cVar.b++;
        } catch (Throwable th) {
            throw th;
        }
        return cVar.a;
    }

    public synchronized Object g(d dVar, Object obj) {
        try {
            c cVar = (c) this.a.get(dVar);
            if (cVar == null) {
                throw new IllegalArgumentException("No cached instance found for " + dVar);
            }
            AbstractC7785qy0.e(obj == cVar.a, "Releasing the wrong instance");
            AbstractC7785qy0.u(cVar.b > 0, "Refcount has already reached zero");
            int i = cVar.b - 1;
            cVar.b = i;
            if (i == 0) {
                AbstractC7785qy0.u(cVar.c == null, "Destroy task already scheduled");
                if (this.c == null) {
                    this.c = this.b.a();
                }
                cVar.c = this.c.schedule(new RunnableC0733Ed0(new b(cVar, dVar, obj)), 1L, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return null;
    }
}
