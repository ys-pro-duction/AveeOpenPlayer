package com.daaw;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DI {

    public class a implements ThreadFactory {
        public final /* synthetic */ String B;
        public final /* synthetic */ AtomicLong C;

        /* JADX INFO: renamed from: com.daaw.DI$a$a, reason: collision with other inner class name */
        public class C0058a extends AbstractRunnableC4042de {
            public final /* synthetic */ Runnable B;

            public C0058a(Runnable runnable) {
                this.B = runnable;
            }

            @Override // com.daaw.AbstractRunnableC4042de
            public void a() {
                this.B.run();
            }
        }

        public a(String str, AtomicLong atomicLong) {
            this.B = str;
            this.C = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C0058a(runnable));
            threadNewThread.setName(this.B + this.C.getAndIncrement());
            return threadNewThread;
        }
    }

    public class b extends AbstractRunnableC4042de {
        public final /* synthetic */ String B;
        public final /* synthetic */ ExecutorService C;
        public final /* synthetic */ long D;
        public final /* synthetic */ TimeUnit E;

        public b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.B = str;
            this.C = executorService;
            this.D = j;
            this.E = timeUnit;
        }

        @Override // com.daaw.AbstractRunnableC4042de
        public void a() {
            try {
                C2106Rd0.f().b("Executing shutdown hook for " + this.B);
                this.C.shutdown();
                if (this.C.awaitTermination(this.D, this.E)) {
                    return;
                }
                C2106Rd0.f().b(this.B + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.C.shutdownNow();
            } catch (InterruptedException unused) {
                C2106Rd0.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.B));
                this.C.shutdownNow();
            }
        }
    }

    public static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    public static void b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService executorServiceE = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, executorServiceE);
        return executorServiceE;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    public static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
