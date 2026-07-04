package com.daaw;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.wT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9322wT1 {
    public static final PS2 a;
    public static final PS2 b;
    public static final PS2 c;
    public static final ScheduledExecutorService d;
    public static final PS2 e;
    public static final PS2 f;

    static {
        ExecutorService threadPoolExecutor;
        ExecutorService executorServiceA;
        ExecutorService executorServiceB;
        if (AbstractC2555Vl.a()) {
            AbstractC8172sM2.a();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new ThreadFactoryC8199sT1("Default")));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC8199sT1("Default"));
        }
        AbstractC8757uT1 abstractC8757uT1 = null;
        a = new C9043vT1(threadPoolExecutor, abstractC8757uT1);
        if (AbstractC2555Vl.a()) {
            executorServiceA = AbstractC8172sM2.a().a(5, new ThreadFactoryC8199sT1("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC8199sT1("Loader"));
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            executorServiceA = threadPoolExecutor2;
        }
        b = new C9043vT1(executorServiceA, abstractC8757uT1);
        if (AbstractC2555Vl.a()) {
            executorServiceB = AbstractC8172sM2.a().b(new ThreadFactoryC8199sT1("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC8199sT1("Activeview"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorServiceB = threadPoolExecutor3;
        }
        c = new C9043vT1(executorServiceB, abstractC8757uT1);
        d = new C7920rT1(3, new ThreadFactoryC8199sT1("Schedule"));
        e = new C9043vT1(new ExecutorC8478tT1(), abstractC8757uT1);
        f = new C9043vT1(VS2.b(), abstractC8757uT1);
    }
}
