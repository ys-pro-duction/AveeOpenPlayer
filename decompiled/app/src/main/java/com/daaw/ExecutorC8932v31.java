package com.daaw;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: com.daaw.v31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class ExecutorC8932v31 implements Executor {
    public final Executor B;
    public final Semaphore C;

    public ExecutorC8932v31(int i, Executor executor) {
        this.C = new Semaphore(i);
        this.B = executor;
    }

    public static /* synthetic */ void a(ExecutorC8932v31 executorC8932v31, Runnable runnable) {
        executorC8932v31.getClass();
        runnable.run();
        executorC8932v31.C.release();
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        if (!this.C.tryAcquire()) {
            runnable.run();
            return;
        }
        try {
            this.B.execute(new Runnable() { // from class: com.daaw.u31
                @Override // java.lang.Runnable
                public final void run() {
                    ExecutorC8932v31.a(this.B, runnable);
                }
            });
        } catch (RejectedExecutionException unused) {
            runnable.run();
        }
    }
}
