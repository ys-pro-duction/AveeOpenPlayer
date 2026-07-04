package com.daaw;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.g51, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorC4741g51 implements Executor {
    public final Executor B;
    public final ArrayDeque C = new ArrayDeque();
    public Runnable D;

    /* JADX INFO: renamed from: com.daaw.g51$a */
    public class a implements Runnable {
        public final /* synthetic */ Runnable B;

        public a(Runnable runnable) {
            this.B = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.B.run();
            } finally {
                ExecutorC4741g51.this.a();
            }
        }
    }

    public ExecutorC4741g51(Executor executor) {
        this.B = executor;
    }

    public synchronized void a() {
        Runnable runnable = (Runnable) this.C.poll();
        this.D = runnable;
        if (runnable != null) {
            this.B.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.C.offer(new a(runnable));
        if (this.D == null) {
            a();
        }
    }
}
