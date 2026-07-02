package com.daaw;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.hS2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5118hS2 extends AbstractC4839gS2 {
    public final InterfaceFutureC8236sc0 I;

    public C5118hS2(InterfaceFutureC8236sc0 interfaceFutureC8236sc0) {
        interfaceFutureC8236sc0.getClass();
        this.I = interfaceFutureC8236sc0;
    }

    @Override // com.daaw.AbstractC9873yR2, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.I.cancel(z);
    }

    @Override // com.daaw.AbstractC9873yR2, com.daaw.InterfaceFutureC8236sc0
    public final void g(Runnable runnable, Executor executor) {
        this.I.g(runnable, executor);
    }

    @Override // com.daaw.AbstractC9873yR2, java.util.concurrent.Future
    public final Object get() {
        return this.I.get();
    }

    @Override // com.daaw.AbstractC9873yR2, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.I.isCancelled();
    }

    @Override // com.daaw.AbstractC9873yR2, java.util.concurrent.Future
    public final boolean isDone() {
        return this.I.isDone();
    }

    @Override // com.daaw.AbstractC9873yR2
    public final String toString() {
        return this.I.toString();
    }

    @Override // com.daaw.AbstractC9873yR2, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.I.get(j, timeUnit);
    }
}
