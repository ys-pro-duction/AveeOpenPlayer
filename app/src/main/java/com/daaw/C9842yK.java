package com.daaw;

import android.os.Process;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.daaw.yK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9842yK extends ThreadPoolExecutor implements AutoCloseable {
    public final AtomicInteger B;
    public final d C;

    /* JADX INFO: renamed from: com.daaw.yK$b */
    public static class b implements ThreadFactory {
        public int B = 0;

        /* JADX INFO: renamed from: com.daaw.yK$b$a */
        public class a extends Thread {
            public a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            a aVar = new a(runnable, "fifo-pool-thread-" + this.B);
            this.B = this.B + 1;
            return aVar;
        }
    }

    /* JADX INFO: renamed from: com.daaw.yK$c */
    public static class c extends FutureTask implements Comparable {
        public final int B;
        public final int C;

        public c(Runnable runnable, Object obj, int i) {
            super(runnable, obj);
            if (!(runnable instanceof InterfaceC8625tz0)) {
                throw new IllegalArgumentException("FifoPriorityThreadPoolExecutor must be given Runnables that implement Prioritized");
            }
            this.B = ((InterfaceC8625tz0) runnable).a();
            this.C = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i = this.B - cVar.B;
            return i == 0 ? this.C - cVar.C : i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.C == cVar.C && this.B == cVar.B) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.B * 31) + this.C;
        }
    }

    public C9842yK(int i) {
        this(i, d.C);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            if (!future.isDone() || future.isCancelled()) {
                return;
            }
            try {
                future.get();
            } catch (InterruptedException e) {
                this.C.a(e);
            } catch (ExecutionException e2) {
                this.C.a(e2);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        JO.a(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new c(runnable, obj, this.B.getAndIncrement());
    }

    public C9842yK(int i, d dVar) {
        this(i, i, 0L, TimeUnit.MILLISECONDS, new b(), dVar);
    }

    public C9842yK(int i, int i2, long j, TimeUnit timeUnit, ThreadFactory threadFactory, d dVar) {
        super(i, i2, j, timeUnit, new PriorityBlockingQueue(), threadFactory);
        this.B = new AtomicInteger();
        this.C = dVar;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.daaw.yK$d */
    public static class d {
        public static final d B;
        public static final d C;
        public static final d D;
        public static final /* synthetic */ d[] E;

        /* JADX INFO: renamed from: com.daaw.yK$d$b */
        public enum b extends d {
            public b(String str, int i) {
                super(str, i);
            }

            @Override // com.daaw.C9842yK.d
            public void a(Throwable th) {
                super.a(th);
                throw new RuntimeException(th);
            }
        }

        static {
            d dVar = new d("IGNORE", 0);
            B = dVar;
            a aVar = new a("LOG", 1);
            C = aVar;
            b bVar = new b("THROW", 2);
            D = bVar;
            E = new d[]{dVar, aVar, bVar};
        }

        public d(String str, int i) {
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) E.clone();
        }

        /* JADX INFO: renamed from: com.daaw.yK$d$a */
        public enum a extends d {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // com.daaw.C9842yK.d
            public void a(Throwable th) {
            }
        }

        public void a(Throwable th) {
        }
    }
}
