package com.daaw;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: com.daaw.jj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5751jj extends C2041Qn {
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(C5751jj.class, "_resumed");
    private volatile int _resumed;

    public C5751jj(InterfaceC1416Ks interfaceC1416Ks, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + interfaceC1416Ks + " was cancelled normally");
        }
        super(th, z);
        this._resumed = 0;
    }

    public final boolean c() {
        return c.compareAndSet(this, 0, 1);
    }
}
