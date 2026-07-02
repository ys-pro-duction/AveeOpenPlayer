package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class US2 extends RS2 implements ScheduledExecutorService, PS2, AutoCloseable {
    public final ScheduledExecutorService C;

    public US2(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.C = scheduledExecutorService;
    }

    @Override // com.daaw.ER2, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        JO.a(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.C;
        RunnableFutureC4275eT2 runnableFutureC4275eT2D = RunnableFutureC4275eT2.D(runnable, null);
        return new SS2(runnableFutureC4275eT2D, scheduledExecutorService.schedule(runnableFutureC4275eT2D, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        TS2 ts2 = new TS2(runnable);
        return new SS2(ts2, this.C.scheduleAtFixedRate(ts2, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        TS2 ts2 = new TS2(runnable);
        return new SS2(ts2, this.C.scheduleWithFixedDelay(ts2, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        RunnableFutureC4275eT2 runnableFutureC4275eT2 = new RunnableFutureC4275eT2(callable);
        return new SS2(runnableFutureC4275eT2, this.C.schedule(runnableFutureC4275eT2, j, timeUnit));
    }
}
