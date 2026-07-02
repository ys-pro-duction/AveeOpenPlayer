package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.pS2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7360pS2 extends AbstractC7917rS2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static C7081oS2 a(Iterable iterable) {
        return new C7081oS2(false, OP2.H(iterable), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C7081oS2 b(Iterable iterable) {
        VQ2 vq2 = OP2.C;
        iterable.getClass();
        return new C7081oS2(true, OP2.H(iterable), null);
    }

    public static C7081oS2 c(InterfaceFutureC8236sc0... interfaceFutureC8236sc0Arr) {
        return new C7081oS2(true, OP2.I(interfaceFutureC8236sc0Arr), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceFutureC8236sc0 d(Iterable iterable) {
        return new XR2(OP2.H(iterable), true);
    }

    public static InterfaceFutureC8236sc0 e(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, Class cls, WN2 wn2, Executor executor) {
        C5952kR2 c5952kR2 = new C5952kR2(interfaceFutureC8236sc0, cls, wn2);
        interfaceFutureC8236sc0.g(c5952kR2, VS2.c(executor, c5952kR2));
        return c5952kR2;
    }

    public static InterfaceFutureC8236sc0 f(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, Class cls, WR2 wr2, Executor executor) {
        C5673jR2 c5673jR2 = new C5673jR2(interfaceFutureC8236sc0, cls, wr2);
        interfaceFutureC8236sc0.g(c5673jR2, VS2.c(executor, c5673jR2));
        return c5673jR2;
    }

    public static InterfaceFutureC8236sc0 g(Throwable th) {
        th.getClass();
        return new C8196sS2(th);
    }

    public static InterfaceFutureC8236sc0 h(Object obj) {
        return obj == null ? C8475tS2.C : new C8475tS2(obj);
    }

    public static InterfaceFutureC8236sc0 i() {
        return C8475tS2.C;
    }

    public static InterfaceFutureC8236sc0 j(Callable callable, Executor executor) {
        RunnableFutureC4275eT2 runnableFutureC4275eT2 = new RunnableFutureC4275eT2(callable);
        executor.execute(runnableFutureC4275eT2);
        return runnableFutureC4275eT2;
    }

    public static InterfaceFutureC8236sc0 k(RR2 rr2, Executor executor) {
        RunnableFutureC4275eT2 runnableFutureC4275eT2 = new RunnableFutureC4275eT2(rr2);
        executor.execute(runnableFutureC4275eT2);
        return runnableFutureC4275eT2;
    }

    public static InterfaceFutureC8236sc0 l(InterfaceFutureC8236sc0... interfaceFutureC8236sc0Arr) {
        return new XR2(OP2.I(interfaceFutureC8236sc0Arr), false);
    }

    public static InterfaceFutureC8236sc0 m(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, WN2 wn2, Executor executor) {
        GR2 gr2 = new GR2(interfaceFutureC8236sc0, wn2);
        interfaceFutureC8236sc0.g(gr2, VS2.c(executor, gr2));
        return gr2;
    }

    public static InterfaceFutureC8236sc0 n(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, WR2 wr2, Executor executor) {
        int i = HR2.K;
        executor.getClass();
        FR2 fr2 = new FR2(interfaceFutureC8236sc0, wr2);
        interfaceFutureC8236sc0.g(fr2, VS2.c(executor, fr2));
        return fr2;
    }

    public static InterfaceFutureC8236sc0 o(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return interfaceFutureC8236sc0.isDone() ? interfaceFutureC8236sc0 : C3440bT2.E(interfaceFutureC8236sc0, j, timeUnit, scheduledExecutorService);
    }

    public static Object p(Future future) {
        if (future.isDone()) {
            return AbstractC4843gT2.a(future);
        }
        throw new IllegalStateException(BO2.b("Future was expected to be done: %s", future));
    }

    public static Object q(Future future) {
        try {
            return AbstractC4843gT2.a(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new C4271eS2((Error) cause);
            }
            throw new C4564fT2(cause);
        }
    }

    public static void r(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, InterfaceC6244lS2 interfaceC6244lS2, Executor executor) {
        interfaceC6244lS2.getClass();
        interfaceFutureC8236sc0.g(new RunnableC6523mS2(interfaceFutureC8236sc0, interfaceC6244lS2), executor);
    }
}
