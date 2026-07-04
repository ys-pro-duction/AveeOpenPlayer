package com.daaw;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class GR1 implements ThreadFactory {
    public final AtomicInteger B = new AtomicInteger(1);

    public GR1(JR1 jr1) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(SCION_TASK_EXECUTOR) #" + this.B.getAndIncrement());
    }
}
