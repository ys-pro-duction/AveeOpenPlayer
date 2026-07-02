package com.daaw;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.Ui1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2441Ui1 {
    public static final String f = AbstractC1772Od0.f("WorkTimer");
    public final ThreadFactory a;
    public final ScheduledExecutorService b;
    public final Map c;
    public final Map d;
    public final Object e;

    /* JADX INFO: renamed from: com.daaw.Ui1$a */
    public class a implements ThreadFactory {
        public int B = 0;

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.B);
            this.B = this.B + 1;
            return threadNewThread;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ui1$b */
    public interface b {
        void a(String str);
    }

    /* JADX INFO: renamed from: com.daaw.Ui1$c */
    public static class c implements Runnable {
        public final C2441Ui1 B;
        public final String C;

        public c(C2441Ui1 c2441Ui1, String str) {
            this.B = c2441Ui1;
            this.C = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.B.e) {
                try {
                    if (((c) this.B.c.remove(this.C)) != null) {
                        b bVar = (b) this.B.d.remove(this.C);
                        if (bVar != null) {
                            bVar.a(this.C);
                        }
                    } else {
                        AbstractC1772Od0.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.C), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C2441Ui1() {
        a aVar = new a();
        this.a = aVar;
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new Object();
        this.b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (this.b.isShutdown()) {
            return;
        }
        this.b.shutdownNow();
    }

    public void b(String str, long j, b bVar) {
        synchronized (this.e) {
            AbstractC1772Od0.c().a(f, String.format("Starting timer for %s", str), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.c.put(str, cVar);
            this.d.put(str, bVar);
            this.b.schedule(cVar, j, TimeUnit.MILLISECONDS);
        }
    }

    public void c(String str) {
        synchronized (this.e) {
            try {
                if (((c) this.c.remove(str)) != null) {
                    AbstractC1772Od0.c().a(f, String.format("Stopping timer for %s", str), new Throwable[0]);
                    this.d.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
