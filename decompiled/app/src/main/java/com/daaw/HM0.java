package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class HM0 implements Executor {
    public final Executor B;

    public static class a implements Runnable {
        public final Runnable B;

        public a(Runnable runnable) {
            this.B = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.B.run();
            } catch (Exception e) {
                AbstractC2732Xd0.d("Executor", "Background execution failure.", e);
            }
        }
    }

    public HM0(Executor executor) {
        this.B = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.B.execute(new a(runnable));
    }
}
