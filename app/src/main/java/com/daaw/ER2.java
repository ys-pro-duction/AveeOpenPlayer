package com.daaw;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ER2 extends AbstractExecutorService implements PS2, AutoCloseable {
    @Override // com.daaw.PS2
    public final InterfaceFutureC8236sc0 S0(Callable callable) {
        return (InterfaceFutureC8236sc0) super.submit(callable);
    }

    @Override // com.daaw.PS2
    public final InterfaceFutureC8236sc0 Z0(Runnable runnable) {
        return (InterfaceFutureC8236sc0) super.submit(runnable);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        JO.a(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return RunnableFutureC4275eT2.D(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (InterfaceFutureC8236sc0) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC4275eT2(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (InterfaceFutureC8236sc0) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (InterfaceFutureC8236sc0) super.submit(callable);
    }
}
