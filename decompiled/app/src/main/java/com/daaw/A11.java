package com.daaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class A11 {
    public static Object a(AbstractC6963o11 abstractC6963o11) throws InterruptedException {
        AbstractC7506py0.j();
        AbstractC7506py0.h();
        AbstractC7506py0.m(abstractC6963o11, "Task must not be null");
        if (abstractC6963o11.m()) {
            return k(abstractC6963o11);
        }
        C0882Fo1 c0882Fo1 = new C0882Fo1(null);
        l(abstractC6963o11, c0882Fo1);
        c0882Fo1.a();
        return k(abstractC6963o11);
    }

    public static Object b(AbstractC6963o11 abstractC6963o11, long j, TimeUnit timeUnit) throws TimeoutException {
        AbstractC7506py0.j();
        AbstractC7506py0.h();
        AbstractC7506py0.m(abstractC6963o11, "Task must not be null");
        AbstractC7506py0.m(timeUnit, "TimeUnit must not be null");
        if (abstractC6963o11.m()) {
            return k(abstractC6963o11);
        }
        C0882Fo1 c0882Fo1 = new C0882Fo1(null);
        l(abstractC6963o11, c0882Fo1);
        if (c0882Fo1.d(j, timeUnit)) {
            return k(abstractC6963o11);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static AbstractC6963o11 c(Executor executor, Callable callable) {
        AbstractC7506py0.m(executor, "Executor must not be null");
        AbstractC7506py0.m(callable, "Callback must not be null");
        C9995yr3 c9995yr3 = new C9995yr3();
        executor.execute(new Ft3(c9995yr3, callable));
        return c9995yr3;
    }

    public static AbstractC6963o11 d(Exception exc) {
        C9995yr3 c9995yr3 = new C9995yr3();
        c9995yr3.q(exc);
        return c9995yr3;
    }

    public static AbstractC6963o11 e(Object obj) {
        C9995yr3 c9995yr3 = new C9995yr3();
        c9995yr3.r(obj);
        return c9995yr3;
    }

    public static AbstractC6963o11 f(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return e(null);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((AbstractC6963o11) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        C9995yr3 c9995yr3 = new C9995yr3();
        C1717Np1 c1717Np1 = new C1717Np1(collection.size(), c9995yr3);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            l((AbstractC6963o11) it2.next(), c1717Np1);
        }
        return c9995yr3;
    }

    public static AbstractC6963o11 g(AbstractC6963o11... abstractC6963o11Arr) {
        return (abstractC6963o11Arr == null || abstractC6963o11Arr.length == 0) ? e(null) : f(Arrays.asList(abstractC6963o11Arr));
    }

    public static AbstractC6963o11 h(Collection collection) {
        return i(AbstractC8922v11.a, collection);
    }

    public static AbstractC6963o11 i(Executor executor, Collection collection) {
        return (collection == null || collection.isEmpty()) ? e(Collections.EMPTY_LIST) : f(collection).i(executor, new C8571tn1(collection));
    }

    public static AbstractC6963o11 j(AbstractC6963o11... abstractC6963o11Arr) {
        return (abstractC6963o11Arr == null || abstractC6963o11Arr.length == 0) ? e(Collections.EMPTY_LIST) : h(Arrays.asList(abstractC6963o11Arr));
    }

    public static Object k(AbstractC6963o11 abstractC6963o11) throws ExecutionException {
        if (abstractC6963o11.n()) {
            return abstractC6963o11.k();
        }
        if (abstractC6963o11.l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC6963o11.j());
    }

    public static void l(AbstractC6963o11 abstractC6963o11, InterfaceC7187op1 interfaceC7187op1) {
        Executor executor = AbstractC8922v11.b;
        abstractC6963o11.e(executor, interfaceC7187op1);
        abstractC6963o11.d(executor, interfaceC7187op1);
        abstractC6963o11.a(executor, interfaceC7187op1);
    }
}
