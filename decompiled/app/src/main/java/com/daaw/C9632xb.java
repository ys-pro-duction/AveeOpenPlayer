package com.daaw;

import android.os.Handler;
import android.os.Looper;
import com.daaw.C9632xb;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C9632xb {
    public final ArrayList c = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final c a = new c();

    /* JADX INFO: renamed from: com.daaw.xb$b */
    public class b {
        public final d a;
        public final long b;
        public final Runnable c;
        public ScheduledFuture d;

        public void c() {
            C9632xb.this.n();
            ScheduledFuture scheduledFuture = this.d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                e();
            }
        }

        public final void d() {
            C9632xb.this.n();
            if (this.d != null) {
                e();
                this.c.run();
            }
        }

        public final void e() {
            AbstractC6557mb.d(this.d != null, "Caller should have verified scheduledFuture is non-null.", new Object[0]);
            this.d = null;
            C9632xb.this.m(this);
        }

        public final void f(long j) {
            this.d = C9632xb.this.a.schedule(new Runnable() { // from class: com.daaw.yb
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.d();
                }
            }, j, TimeUnit.MILLISECONDS);
        }

        public b(d dVar, long j, Runnable runnable) {
            this.a = dVar;
            this.b = j;
            this.c = runnable;
        }
    }

    /* JADX INFO: renamed from: com.daaw.xb$c */
    public class c implements Executor {
        public final ScheduledThreadPoolExecutor B;
        public boolean C;
        public final Thread D;

        /* JADX INFO: renamed from: com.daaw.xb$c$a */
        public class a extends ScheduledThreadPoolExecutor implements AutoCloseable {
            public final /* synthetic */ C9632xb B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, ThreadFactory threadFactory, C9632xb c9632xb) {
                super(i, threadFactory);
                this.B = c9632xb;
            }

            @Override // java.util.concurrent.ThreadPoolExecutor
            public void afterExecute(Runnable runnable, Throwable th) {
                super.afterExecute(runnable, th);
                if (th == null && (runnable instanceof Future)) {
                    Future future = (Future) runnable;
                    try {
                        if (future.isDone()) {
                            future.get();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    } catch (CancellationException unused2) {
                    } catch (ExecutionException e) {
                        th = e.getCause();
                    }
                }
                if (th != null) {
                    C9632xb.this.l(th);
                }
            }

            @Override // java.lang.AutoCloseable
            public /* synthetic */ void close() {
                JO.a(this);
            }
        }

        /* JADX INFO: renamed from: com.daaw.xb$c$b */
        public class b implements Runnable, ThreadFactory {
            public final CountDownLatch B;
            public Runnable C;

            public b() {
                this.B = new CountDownLatch(1);
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                AbstractC6557mb.d(this.C == null, "Only one thread may be created in an AsyncQueue.", new Object[0]);
                this.C = runnable;
                this.B.countDown();
                return c.this.D;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.B.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.C.run();
            }
        }

        public c() {
            b bVar = new b();
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(bVar);
            this.D = threadNewThread;
            threadNewThread.setName("FirestoreWorker");
            threadNewThread.setDaemon(true);
            threadNewThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.daaw.zb
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    C9632xb.this.l(th);
                }
            });
            a aVar = new a(1, bVar, C9632xb.this);
            this.B = aVar;
            aVar.setKeepAliveTime(3L, TimeUnit.SECONDS);
            this.C = false;
        }

        public static /* synthetic */ void a(C7521q11 c7521q11, Callable callable) {
            try {
                c7521q11.c(callable.call());
            } catch (Exception e) {
                c7521q11.b(e);
                throw new RuntimeException(e);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            if (!this.C) {
                this.B.execute(runnable);
            }
        }

        public final AbstractC6963o11 h(final Callable callable) {
            final C7521q11 c7521q11 = new C7521q11();
            try {
                execute(new Runnable() { // from class: com.daaw.Ab
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9632xb.c.a(c7521q11, callable);
                    }
                });
            } catch (RejectedExecutionException unused) {
                AbstractC2212Sd0.d(C9632xb.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
            }
            return c7521q11.a();
        }

        public final synchronized boolean i() {
            return this.C;
        }

        public final void j() {
            this.B.shutdownNow();
        }

        public final synchronized ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.C) {
                return null;
            }
            return this.B.schedule(runnable, j, timeUnit);
        }
    }

    /* JADX INFO: renamed from: com.daaw.xb$d */
    public enum d {
        ALL,
        LISTEN_STREAM_IDLE,
        LISTEN_STREAM_CONNECTION_BACKOFF,
        WRITE_STREAM_IDLE,
        WRITE_STREAM_CONNECTION_BACKOFF,
        HEALTH_CHECK_TIMEOUT,
        ONLINE_STATE_TIMEOUT,
        GARBAGE_COLLECTION,
        RETRY_TRANSACTION,
        CONNECTIVITY_ATTEMPT_TIMER,
        INDEX_BACKFILL
    }

    public static /* synthetic */ Void a(Runnable runnable) {
        runnable.run();
        return null;
    }

    public static /* synthetic */ void b(Throwable th) {
        if (!(th instanceof OutOfMemoryError)) {
            throw new RuntimeException("Internal error in Cloud Firestore (24.6.1).", th);
        }
        OutOfMemoryError outOfMemoryError = new OutOfMemoryError("Firestore (24.6.1) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data.");
        outOfMemoryError.initCause(th);
        throw outOfMemoryError;
    }

    public final b e(d dVar, long j, Runnable runnable) {
        b bVar = new b(dVar, System.currentTimeMillis() + j, runnable);
        bVar.f(j);
        return bVar;
    }

    public AbstractC6963o11 f(final Runnable runnable) {
        return g(new Callable() { // from class: com.daaw.wb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C9632xb.a(runnable);
            }
        });
    }

    public AbstractC6963o11 g(Callable callable) {
        return this.a.h(callable);
    }

    public b h(d dVar, long j, Runnable runnable) {
        if (this.c.contains(dVar)) {
            j = 0;
        }
        b bVarE = e(dVar, j, runnable);
        this.b.add(bVarE);
        return bVarE;
    }

    public void i(Runnable runnable) {
        f(runnable);
    }

    public Executor j() {
        return this.a;
    }

    public boolean k() {
        return this.a.i();
    }

    public void l(final Throwable th) {
        this.a.j();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.daaw.vb
            @Override // java.lang.Runnable
            public final void run() {
                C9632xb.b(th);
            }
        });
    }

    public final void m(b bVar) {
        AbstractC6557mb.d(this.b.remove(bVar), "Delayed task not found.", new Object[0]);
    }

    public void n() {
        Thread threadCurrentThread = Thread.currentThread();
        if (this.a.D != threadCurrentThread) {
            throw AbstractC6557mb.a("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", this.a.D.getName(), Long.valueOf(this.a.D.getId()), threadCurrentThread.getName(), Long.valueOf(threadCurrentThread.getId()));
        }
    }
}
