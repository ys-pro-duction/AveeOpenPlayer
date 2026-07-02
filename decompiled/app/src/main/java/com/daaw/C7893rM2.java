package com.daaw;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.rM2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7893rM2 implements InterfaceC7336pM2 {
    public /* synthetic */ C7893rM2(AbstractC7615qM2 abstractC7615qM2) {
    }

    @Override // com.daaw.InterfaceC7336pM2
    public final ExecutorService a(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.daaw.InterfaceC7336pM2
    public final ExecutorService b(ThreadFactory threadFactory, int i) {
        return a(1, threadFactory, 1);
    }

    @Override // com.daaw.InterfaceC7336pM2
    public final ExecutorService c(int i) {
        return a(1, Executors.defaultThreadFactory(), 2);
    }
}
