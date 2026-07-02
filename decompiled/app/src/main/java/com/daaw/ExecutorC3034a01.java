package com.daaw;

import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.a01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC3034a01 implements Executor {
    public final Thread.UncaughtExceptionHandler B;
    public final Queue C = new ConcurrentLinkedQueue();
    public final AtomicReference D = new AtomicReference();

    /* JADX INFO: renamed from: com.daaw.a01$a */
    public class a implements Runnable {
        public final /* synthetic */ c B;
        public final /* synthetic */ Runnable C;

        public a(c cVar, Runnable runnable) {
            this.B = cVar;
            this.C = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            ExecutorC3034a01.this.execute(this.B);
        }

        public String toString() {
            return this.C.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    /* JADX INFO: renamed from: com.daaw.a01$b */
    public class b implements Runnable {
        public final /* synthetic */ c B;
        public final /* synthetic */ Runnable C;
        public final /* synthetic */ long D;

        public b(c cVar, Runnable runnable, long j) {
            this.B = cVar;
            this.C = runnable;
            this.D = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ExecutorC3034a01.this.execute(this.B);
        }

        public String toString() {
            return this.C.toString() + "(scheduled in SynchronizationContext with delay of " + this.D + ")";
        }
    }

    /* JADX INFO: renamed from: com.daaw.a01$c */
    public static class c implements Runnable {
        public final Runnable B;
        public boolean C;
        public boolean D;

        public c(Runnable runnable) {
            this.B = (Runnable) AbstractC7785qy0.o(runnable, "task");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.C) {
                return;
            }
            this.D = true;
            this.B.run();
        }
    }

    /* JADX INFO: renamed from: com.daaw.a01$d */
    public static final class d {
        public final c a;
        public final ScheduledFuture b;

        public /* synthetic */ d(c cVar, ScheduledFuture scheduledFuture, a aVar) {
            this(cVar, scheduledFuture);
        }

        public void a() {
            this.a.C = true;
            this.b.cancel(false);
        }

        public boolean b() {
            c cVar = this.a;
            return (cVar.D || cVar.C) ? false : true;
        }

        public d(c cVar, ScheduledFuture scheduledFuture) {
            this.a = (c) AbstractC7785qy0.o(cVar, "runnable");
            this.b = (ScheduledFuture) AbstractC7785qy0.o(scheduledFuture, "future");
        }
    }

    public ExecutorC3034a01(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.B = (Thread.UncaughtExceptionHandler) AbstractC7785qy0.o(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    public final void a() {
        while (AbstractC0552Cm0.a(this.D, null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.C.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        this.B.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    this.D.set(null);
                    throw th2;
                }
            }
            this.D.set(null);
            if (this.C.isEmpty()) {
                return;
            }
        }
    }

    public final void b(Runnable runnable) {
        this.C.add((Runnable) AbstractC7785qy0.o(runnable, "runnable is null"));
    }

    public final d c(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        c cVar = new c(runnable);
        return new d(cVar, scheduledExecutorService.schedule(new a(cVar, runnable), j, timeUnit), null);
    }

    public final d d(Runnable runnable, long j, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        c cVar = new c(runnable);
        return new d(cVar, scheduledExecutorService.scheduleWithFixedDelay(new b(cVar, runnable, j2), j, j2, timeUnit), null);
    }

    public void e() {
        AbstractC7785qy0.u(Thread.currentThread() == this.D.get(), "Not called from the SynchronizationContext");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        a();
    }
}
