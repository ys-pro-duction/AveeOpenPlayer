package com.daaw;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public final class X10 extends W30 {
    public static final AtomicIntegerFieldUpdater G = AtomicIntegerFieldUpdater.newUpdater(X10.class, "_invoked");
    public final NQ F;
    private volatile int _invoked;

    public X10(NQ nq) {
        this.F = nq;
    }

    @Override // com.daaw.NQ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        w((Throwable) obj);
        return G91.a;
    }

    @Override // com.daaw.AbstractC2251Sn
    public void w(Throwable th) {
        if (G.compareAndSet(this, 0, 1)) {
            this.F.invoke(th);
        }
    }
}
