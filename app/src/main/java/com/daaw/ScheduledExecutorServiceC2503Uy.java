package com.daaw;

import com.daaw.ScheduledFutureC2607Vy;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.Uy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class ScheduledExecutorServiceC2503Uy implements ScheduledExecutorService, AutoCloseable {
    public final ExecutorService B;
    public final ScheduledExecutorService C;

    public ScheduledExecutorServiceC2503Uy(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.B = executorService;
        this.C = scheduledExecutorService;
    }

    public static /* synthetic */ void I(Runnable runnable, ScheduledFutureC2607Vy.b bVar) {
        try {
            runnable.run();
        } catch (Exception e) {
            bVar.a(e);
        }
    }

    public static /* synthetic */ void R(Runnable runnable, ScheduledFutureC2607Vy.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e) {
            bVar.a(e);
        }
    }

    public static /* synthetic */ void j(Callable callable, ScheduledFutureC2607Vy.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e) {
            bVar.a(e);
        }
    }

    public static /* synthetic */ void o(Runnable runnable, ScheduledFutureC2607Vy.b bVar) throws Exception {
        try {
            runnable.run();
        } catch (Exception e) {
            bVar.a(e);
            throw e;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.B.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        JO.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.B.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.B.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.B.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.B.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.B.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new ScheduledFutureC2607Vy(new ScheduledFutureC2607Vy.c() { // from class: com.daaw.Iy
            @Override // com.daaw.ScheduledFutureC2607Vy.c
            public final ScheduledFuture a(ScheduledFutureC2607Vy.b bVar) {
                ScheduledExecutorServiceC2503Uy scheduledExecutorServiceC2503Uy = this.a;
                return scheduledExecutorServiceC2503Uy.C.schedule(new Runnable() { // from class: com.daaw.Py
                    @Override // java.lang.Runnable
                    public final void run() {
                        scheduledExecutorServiceC2503Uy.B.execute(new Runnable() { // from class: com.daaw.Sy
                            @Override // java.lang.Runnable
                            public final void run() {
                                ScheduledExecutorServiceC2503Uy.R(runnable, bVar);
                            }
                        });
                    }
                }, j, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new ScheduledFutureC2607Vy(new ScheduledFutureC2607Vy.c() { // from class: com.daaw.Ly
            @Override // com.daaw.ScheduledFutureC2607Vy.c
            public final ScheduledFuture a(ScheduledFutureC2607Vy.b bVar) {
                ScheduledExecutorServiceC2503Uy scheduledExecutorServiceC2503Uy = this.a;
                return scheduledExecutorServiceC2503Uy.C.scheduleAtFixedRate(new Runnable() { // from class: com.daaw.Oy
                    @Override // java.lang.Runnable
                    public final void run() {
                        scheduledExecutorServiceC2503Uy.B.execute(new Runnable() { // from class: com.daaw.Jy
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                ScheduledExecutorServiceC2503Uy.o(runnable, bVar);
                            }
                        });
                    }
                }, j, j2, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new ScheduledFutureC2607Vy(new ScheduledFutureC2607Vy.c() { // from class: com.daaw.My
            @Override // com.daaw.ScheduledFutureC2607Vy.c
            public final ScheduledFuture a(ScheduledFutureC2607Vy.b bVar) {
                ScheduledExecutorServiceC2503Uy scheduledExecutorServiceC2503Uy = this.a;
                return scheduledExecutorServiceC2503Uy.C.scheduleWithFixedDelay(new Runnable() { // from class: com.daaw.Ry
                    @Override // java.lang.Runnable
                    public final void run() {
                        scheduledExecutorServiceC2503Uy.B.execute(new Runnable() { // from class: com.daaw.Ky
                            @Override // java.lang.Runnable
                            public final void run() {
                                ScheduledExecutorServiceC2503Uy.I(runnable, bVar);
                            }
                        });
                    }
                }, j, j2, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.B.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.B.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.B.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j, final TimeUnit timeUnit) {
        return new ScheduledFutureC2607Vy(new ScheduledFutureC2607Vy.c() { // from class: com.daaw.Ny
            @Override // com.daaw.ScheduledFutureC2607Vy.c
            public final ScheduledFuture a(ScheduledFutureC2607Vy.b bVar) {
                ScheduledExecutorServiceC2503Uy scheduledExecutorServiceC2503Uy = this.a;
                return scheduledExecutorServiceC2503Uy.C.schedule(new Callable() { // from class: com.daaw.Qy
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return scheduledExecutorServiceC2503Uy.B.submit(new Runnable() { // from class: com.daaw.Ty
                            @Override // java.lang.Runnable
                            public final void run() {
                                ScheduledExecutorServiceC2503Uy.j(callable, bVar);
                            }
                        });
                    }
                }, j, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.B.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.B.submit(runnable);
    }
}
