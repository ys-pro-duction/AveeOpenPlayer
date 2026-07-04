package com.daaw;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.zH2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10112zH2 implements InterfaceFutureC8236sc0 {
    public final Object B;
    public final String C;
    public final InterfaceFutureC8236sc0 D;

    public C10112zH2(Object obj, String str, InterfaceFutureC8236sc0 interfaceFutureC8236sc0) {
        this.B = obj;
        this.C = str;
        this.D = interfaceFutureC8236sc0;
    }

    public final Object a() {
        return this.B;
    }

    public final String b() {
        return this.C;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.D.cancel(z);
    }

    @Override // com.daaw.InterfaceFutureC8236sc0
    public final void g(Runnable runnable, Executor executor) {
        this.D.g(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.D.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.D.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.D.isDone();
    }

    public final String toString() {
        return this.C + "@" + System.identityHashCode(this);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.D.get(j, timeUnit);
    }
}
