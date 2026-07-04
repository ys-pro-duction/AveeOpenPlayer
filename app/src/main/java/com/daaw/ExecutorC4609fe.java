package com.daaw;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: com.daaw.fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class ExecutorC4609fe implements Executor {
    public Semaphore B = new Semaphore(0);
    public int C = 0;

    public static /* synthetic */ void a(ExecutorC4609fe executorC4609fe, Runnable runnable) {
        executorC4609fe.getClass();
        runnable.run();
        executorC4609fe.B.release();
    }

    public void b() {
        try {
            this.B.acquire(this.C);
            this.C = 0;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            AbstractC6557mb.a("Interrupted while waiting for background task", e);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        this.C++;
        EI.c.execute(new Runnable() { // from class: com.daaw.ee
            @Override // java.lang.Runnable
            public final void run() {
                ExecutorC4609fe.a(this.B, runnable);
            }
        });
    }
}
