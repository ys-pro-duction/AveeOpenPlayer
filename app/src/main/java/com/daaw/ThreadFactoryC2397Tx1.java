package com.daaw;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.daaw.Tx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ThreadFactoryC2397Tx1 implements ThreadFactory {
    public final ThreadFactory B = Executors.defaultThreadFactory();
    public final AtomicInteger C = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.C;
        Thread threadNewThread = this.B.newThread(runnable);
        threadNewThread.setName("gads-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }
}
