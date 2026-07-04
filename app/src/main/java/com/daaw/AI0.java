package com.daaw;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class AI0 {
    public final ScheduledExecutorService a;
    public final Executor b;
    public final Runnable c;
    public final C8772uX0 d;
    public long e;
    public boolean f;
    public ScheduledFuture g;

    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!AI0.this.f) {
                AI0.this.g = null;
                return;
            }
            long j = AI0.this.j();
            if (AI0.this.e - j > 0) {
                AI0 ai0 = AI0.this;
                ai0.g = ai0.a.schedule(new c(), AI0.this.e - j, TimeUnit.NANOSECONDS);
            } else {
                AI0.this.f = false;
                AI0.this.g = null;
                AI0.this.c.run();
            }
        }
    }

    public final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AI0.this.b.execute(new b());
        }
    }

    public AI0(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, C8772uX0 c8772uX0) {
        this.c = runnable;
        this.b = executor;
        this.a = scheduledExecutorService;
        this.d = c8772uX0;
        c8772uX0.g();
    }

    public void i(boolean z) {
        ScheduledFuture scheduledFuture;
        this.f = false;
        if (!z || (scheduledFuture = this.g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.g = null;
    }

    public final long j() {
        return this.d.d(TimeUnit.NANOSECONDS);
    }

    public void k(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        long j2 = j() + nanos;
        this.f = true;
        if (j2 - this.e < 0 || this.g == null) {
            ScheduledFuture scheduledFuture = this.g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.g = this.a.schedule(new c(), nanos, TimeUnit.NANOSECONDS);
        }
        this.e = j2;
    }
}
