package com.daaw;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class WP0 implements Executor {
    public final Executor C;
    public volatile Runnable E;
    public final ArrayDeque B = new ArrayDeque();
    public final Object D = new Object();

    public static class a implements Runnable {
        public final WP0 B;
        public final Runnable C;

        public a(WP0 wp0, Runnable runnable) {
            this.B = wp0;
            this.C = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.C.run();
            } finally {
                this.B.b();
            }
        }
    }

    public WP0(Executor executor) {
        this.C = executor;
    }

    public boolean a() {
        boolean z;
        synchronized (this.D) {
            z = !this.B.isEmpty();
        }
        return z;
    }

    public void b() {
        synchronized (this.D) {
            try {
                Runnable runnable = (Runnable) this.B.poll();
                this.E = runnable;
                if (runnable != null) {
                    this.C.execute(this.E);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.D) {
            try {
                this.B.add(new a(this, runnable));
                if (this.E == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
