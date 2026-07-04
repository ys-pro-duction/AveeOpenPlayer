package com.daaw;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.daaw.hj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5192hj extends C2395Tx {
    public final Runnable c;
    public final NQ d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5192hj(Lock lock, Runnable runnable, NQ nq) {
        super(lock);
        G10.g(lock, "lock");
        G10.g(runnable, "checkCancelled");
        G10.g(nq, "interruptedExceptionHandler");
        this.c = runnable;
        this.d = nq;
    }

    @Override // com.daaw.C2395Tx, com.daaw.MS0
    public void b() {
        while (!c().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.c.run();
            } catch (InterruptedException e) {
                this.d.invoke(e);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5192hj(Runnable runnable, NQ nq) {
        this(new ReentrantLock(), runnable, nq);
        G10.g(runnable, "checkCancelled");
        G10.g(nq, "interruptedExceptionHandler");
    }
}
