package com.daaw;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.tS2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8475tS2 implements InterfaceFutureC8236sc0 {
    public static final InterfaceFutureC8236sc0 C = new C8475tS2(null);
    public static final Logger D = Logger.getLogger(C8475tS2.class.getName());
    public final Object B;

    public C8475tS2(Object obj) {
        this.B = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // com.daaw.InterfaceFutureC8236sc0
    public final void g(Runnable runnable, Executor executor) {
        AbstractC5381iO2.c(runnable, "Runnable was null.");
        AbstractC5381iO2.c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            D.logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.B;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.B;
        return super.toString() + "[status=SUCCESS, result=[" + String.valueOf(obj) + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.B;
    }
}
