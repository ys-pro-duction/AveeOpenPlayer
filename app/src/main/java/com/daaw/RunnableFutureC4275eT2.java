package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: renamed from: com.daaw.eT2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableFutureC4275eT2 extends AbstractC4560fS2 implements RunnableFuture {
    public volatile OS2 I;

    public RunnableFutureC4275eT2(RR2 rr2) {
        this.I = new C3718cT2(this, rr2);
    }

    public static RunnableFutureC4275eT2 D(Runnable runnable, Object obj) {
        return new RunnableFutureC4275eT2(Executors.callable(runnable, obj));
    }

    @Override // com.daaw.AbstractC9873yR2
    public final String c() {
        OS2 os2 = this.I;
        if (os2 == null) {
            return super.c();
        }
        return "task=[" + os2.toString() + "]";
    }

    @Override // com.daaw.AbstractC9873yR2
    public final void d() {
        OS2 os2;
        if (v() && (os2 = this.I) != null) {
            os2.g();
        }
        this.I = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        OS2 os2 = this.I;
        if (os2 != null) {
            os2.run();
        }
        this.I = null;
    }

    public RunnableFutureC4275eT2(Callable callable) {
        this.I = new C3997dT2(this, callable);
    }
}
