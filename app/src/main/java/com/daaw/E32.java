package com.daaw;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class E32 implements Executor {
    public final ThreadPoolExecutor C;
    public final AtomicInteger B = new AtomicInteger(1);
    public WeakReference D = new WeakReference(null);

    public E32(String str) {
        final String str2 = "Google consent worker";
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory(str2) { // from class: com.daaw.a32
            public final /* synthetic */ String C = "Google consent worker";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return this.B.a(this.C, runnable);
            }
        });
        this.C = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public final /* synthetic */ Thread a(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, "Google consent worker #" + this.B.getAndIncrement());
        this.D = new WeakReference(thread);
        return thread;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.D.get()) {
            runnable.run();
        } else {
            this.C.execute(runnable);
        }
    }
}
