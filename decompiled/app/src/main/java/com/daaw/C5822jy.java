package com.daaw;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.jy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5822jy {
    public final C7501px a;
    public final Executor b;
    public final ScheduledExecutorService c;
    public volatile ScheduledFuture d;
    public volatile long e = -1;

    public C5822jy(C7501px c7501px, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.a = (C7501px) AbstractC7506py0.l(c7501px);
        this.b = executor;
        this.c = scheduledExecutorService;
    }

    public void c() {
        if (this.d == null || this.d.isDone()) {
            return;
        }
        this.d.cancel(false);
    }

    public final long d() {
        if (this.e == -1) {
            return 30L;
        }
        if (this.e * 2 < 960) {
            return this.e * 2;
        }
        return 960L;
    }

    public final void e() {
        this.a.k().d(this.b, new InterfaceC7470pq0() { // from class: com.daaw.iy
            @Override // com.daaw.InterfaceC7470pq0
            public final void c(Exception exc) {
                this.a.g();
            }
        });
    }

    public void f(long j) {
        c();
        this.e = -1L;
        this.d = this.c.schedule(new RunnableC5263hy(this), Math.max(0L, j), TimeUnit.MILLISECONDS);
    }

    public final void g() {
        c();
        this.e = d();
        this.d = this.c.schedule(new RunnableC5263hy(this), this.e, TimeUnit.SECONDS);
    }
}
