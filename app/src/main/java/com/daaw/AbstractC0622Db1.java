package com.daaw;

import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.daaw.Db1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0622Db1 {
    public static final ExecutorService a = DI.c("awaitEvenIfOnMainThread task continuation executor");

    public static /* synthetic */ Object a(C7521q11 c7521q11, AbstractC6963o11 abstractC6963o11) {
        if (abstractC6963o11.n()) {
            c7521q11.c(abstractC6963o11.k());
            return null;
        }
        if (abstractC6963o11.j() == null) {
            return null;
        }
        c7521q11.b(abstractC6963o11.j());
        return null;
    }

    public static /* synthetic */ Object b(CountDownLatch countDownLatch, AbstractC6963o11 abstractC6963o11) {
        countDownLatch.countDown();
        return null;
    }

    public static /* synthetic */ Void c(C7521q11 c7521q11, AbstractC6963o11 abstractC6963o11) {
        if (abstractC6963o11.n()) {
            c7521q11.e(abstractC6963o11.k());
            return null;
        }
        if (abstractC6963o11.j() == null) {
            return null;
        }
        c7521q11.d(abstractC6963o11.j());
        return null;
    }

    public static /* synthetic */ Void d(C7521q11 c7521q11, AbstractC6963o11 abstractC6963o11) {
        if (abstractC6963o11.n()) {
            c7521q11.e(abstractC6963o11.k());
            return null;
        }
        if (abstractC6963o11.j() == null) {
            return null;
        }
        c7521q11.d(abstractC6963o11.j());
        return null;
    }

    public static /* synthetic */ void e(Callable callable, Executor executor, final C7521q11 c7521q11) {
        try {
            ((AbstractC6963o11) callable.call()).g(executor, new InterfaceC1519Ls() { // from class: com.daaw.zb1
                @Override // com.daaw.InterfaceC1519Ls
                public final Object a(AbstractC6963o11 abstractC6963o11) {
                    return AbstractC0622Db1.a(c7521q11, abstractC6963o11);
                }
            });
        } catch (Exception e) {
            c7521q11.b(e);
        }
    }

    public static Object f(AbstractC6963o11 abstractC6963o11) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        abstractC6963o11.g(a, new InterfaceC1519Ls() { // from class: com.daaw.vb1
            @Override // com.daaw.InterfaceC1519Ls
            public final Object a(AbstractC6963o11 abstractC6963o112) {
                return AbstractC0622Db1.b(countDownLatch, abstractC6963o112);
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        }
        if (abstractC6963o11.n()) {
            return abstractC6963o11.k();
        }
        if (abstractC6963o11.l()) {
            throw new CancellationException("Task is already canceled");
        }
        if (abstractC6963o11.m()) {
            throw new IllegalStateException(abstractC6963o11.j());
        }
        throw new TimeoutException();
    }

    public static boolean g(CountDownLatch countDownLatch, long j, TimeUnit timeUnit) {
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static AbstractC6963o11 h(final Executor executor, final Callable callable) {
        final C7521q11 c7521q11 = new C7521q11();
        executor.execute(new Runnable() { // from class: com.daaw.wb1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0622Db1.e(callable, executor, c7521q11);
            }
        });
        return c7521q11.a();
    }

    public static AbstractC6963o11 i(AbstractC6963o11 abstractC6963o11, AbstractC6963o11 abstractC6963o112) {
        final C7521q11 c7521q11 = new C7521q11();
        InterfaceC1519Ls interfaceC1519Ls = new InterfaceC1519Ls() { // from class: com.daaw.yb1
            @Override // com.daaw.InterfaceC1519Ls
            public final Object a(AbstractC6963o11 abstractC6963o113) {
                return AbstractC0622Db1.d(c7521q11, abstractC6963o113);
            }
        };
        abstractC6963o11.f(interfaceC1519Ls);
        abstractC6963o112.f(interfaceC1519Ls);
        return c7521q11.a();
    }

    public static AbstractC6963o11 j(Executor executor, AbstractC6963o11 abstractC6963o11, AbstractC6963o11 abstractC6963o112) {
        final C7521q11 c7521q11 = new C7521q11();
        InterfaceC1519Ls interfaceC1519Ls = new InterfaceC1519Ls() { // from class: com.daaw.xb1
            @Override // com.daaw.InterfaceC1519Ls
            public final Object a(AbstractC6963o11 abstractC6963o113) {
                return AbstractC0622Db1.c(c7521q11, abstractC6963o113);
            }
        };
        abstractC6963o11.g(executor, interfaceC1519Ls);
        abstractC6963o112.g(executor, interfaceC1519Ls);
        return c7521q11.a();
    }
}
