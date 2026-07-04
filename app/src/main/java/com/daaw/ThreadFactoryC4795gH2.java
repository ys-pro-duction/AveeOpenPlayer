package com.daaw;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.daaw.gH2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ThreadFactoryC4795gH2 implements ThreadFactory {
    public final AtomicInteger B = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(NG) #" + this.B.getAndIncrement());
    }
}
