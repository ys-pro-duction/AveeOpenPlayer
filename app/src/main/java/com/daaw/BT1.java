package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class BT1 implements InterfaceFutureC8236sc0 {
    public final XS2 B = XS2.C();

    public static final boolean a(boolean z) {
        if (!z) {
            zzt.zzo().t(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    public final boolean b(Object obj) {
        boolean zE = this.B.e(obj);
        a(zE);
        return zE;
    }

    public final boolean c(Throwable th) {
        boolean zF = this.B.f(th);
        a(zF);
        return zF;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.B.cancel(z);
    }

    @Override // com.daaw.InterfaceFutureC8236sc0
    public final void g(Runnable runnable, Executor executor) {
        this.B.g(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.B.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.B.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.B.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.B.get(j, timeUnit);
    }
}
