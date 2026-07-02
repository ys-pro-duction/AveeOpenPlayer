package com.daaw;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class KS2 extends F53 {
    public static final AtomicLong l = new AtomicLong(Long.MIN_VALUE);
    public UR2 c;
    public UR2 d;
    public final PriorityBlockingQueue e;
    public final BlockingQueue f;
    public final Thread.UncaughtExceptionHandler g;
    public final Thread.UncaughtExceptionHandler h;
    public final Object i;
    public final Semaphore j;
    public volatile boolean k;

    public KS2(C9327wU2 c9327wU2) {
        super(c9327wU2);
        this.i = new Object();
        this.j = new Semaphore(2);
        this.e = new PriorityBlockingQueue();
        this.f = new LinkedBlockingQueue();
        this.g = new AQ2(this, "Thread death: Uncaught exception on worker thread");
        this.h = new AQ2(this, "Thread death: Uncaught exception on network thread");
    }

    public static /* bridge */ /* synthetic */ boolean B(KS2 ks2) {
        boolean z = ks2.k;
        return false;
    }

    public final void A(Runnable runnable) {
        g();
        AbstractC7506py0.l(runnable);
        D(new C4267eR2(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean C() {
        return Thread.currentThread() == this.c;
    }

    public final void D(C4267eR2 c4267eR2) {
        synchronized (this.i) {
            try {
                this.e.add(c4267eR2);
                UR2 ur2 = this.c;
                if (ur2 == null) {
                    UR2 ur22 = new UR2(this, "Measurement Worker", this.e);
                    this.c = ur22;
                    ur22.setUncaughtExceptionHandler(this.g);
                    this.c.start();
                } else {
                    ur2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.AbstractC6706n53
    public final void c() {
        if (Thread.currentThread() != this.d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.daaw.AbstractC6706n53
    public final void d() {
        if (Thread.currentThread() != this.c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.daaw.F53
    public final boolean f() {
        return false;
    }

    public final Object n(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.a.x().z(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                this.a.w().t().a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.a.w().t().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final Future o(Callable callable) {
        g();
        AbstractC7506py0.l(callable);
        C4267eR2 c4267eR2 = new C4267eR2(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() != this.c) {
            D(c4267eR2);
            return c4267eR2;
        }
        if (!this.e.isEmpty()) {
            this.a.w().t().a("Callable skipped the worker queue.");
        }
        c4267eR2.run();
        return c4267eR2;
    }

    public final Future q(Callable callable) {
        g();
        AbstractC7506py0.l(callable);
        C4267eR2 c4267eR2 = new C4267eR2(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            c4267eR2.run();
            return c4267eR2;
        }
        D(c4267eR2);
        return c4267eR2;
    }

    public final void y(Runnable runnable) {
        g();
        AbstractC7506py0.l(runnable);
        C4267eR2 c4267eR2 = new C4267eR2(this, runnable, false, "Task exception on network thread");
        synchronized (this.i) {
            try {
                this.f.add(c4267eR2);
                UR2 ur2 = this.d;
                if (ur2 == null) {
                    UR2 ur22 = new UR2(this, "Measurement Network", this.f);
                    this.d = ur22;
                    ur22.setUncaughtExceptionHandler(this.h);
                    this.d.start();
                } else {
                    ur2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(Runnable runnable) {
        g();
        AbstractC7506py0.l(runnable);
        D(new C4267eR2(this, runnable, false, "Task exception on worker thread"));
    }
}
