package com.daaw;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: com.daaw.bS2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3436bS2 extends OS2 {
    public final Executor D;
    public final /* synthetic */ C3714cS2 E;

    public AbstractC3436bS2(C3714cS2 c3714cS2, Executor executor) {
        this.E = c3714cS2;
        executor.getClass();
        this.D = executor;
    }

    @Override // com.daaw.OS2
    public final void d(Throwable th) {
        this.E.Q = null;
        if (th instanceof ExecutionException) {
            this.E.f(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.E.cancel(false);
        } else {
            this.E.f(th);
        }
    }

    @Override // com.daaw.OS2
    public final void e(Object obj) {
        this.E.Q = null;
        h(obj);
    }

    @Override // com.daaw.OS2
    public final boolean f() {
        return this.E.isDone();
    }

    public abstract void h(Object obj);

    public final void i() {
        try {
            this.D.execute(this);
        } catch (RejectedExecutionException e) {
            this.E.f(e);
        }
    }
}
