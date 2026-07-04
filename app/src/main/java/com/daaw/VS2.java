package com.daaw;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public abstract class VS2 {
    public static PS2 a(ExecutorService executorService) {
        return executorService instanceof PS2 ? (PS2) executorService : executorService instanceof ScheduledExecutorService ? new US2((ScheduledExecutorService) executorService) : new RS2(executorService);
    }

    public static Executor b() {
        return EnumC3993dS2.INSTANCE;
    }

    public static Executor c(Executor executor, AbstractC9873yR2 abstractC9873yR2) {
        executor.getClass();
        return executor == EnumC3993dS2.INSTANCE ? executor : new QS2(executor, abstractC9873yR2);
    }
}
