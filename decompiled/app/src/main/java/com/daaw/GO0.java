package com.daaw;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public abstract class GO0 extends AbstractC4101dq implements InterfaceC10256zo0 {
    public static final AtomicIntegerFieldUpdater E = AtomicIntegerFieldUpdater.newUpdater(GO0.class, "cleanedAndPointers");
    public final long D;
    private volatile int cleanedAndPointers;

    public GO0(long j, GO0 go0, int i) {
        super(go0);
        this.D = j;
        this.cleanedAndPointers = i << 16;
    }

    @Override // com.daaw.AbstractC4101dq
    public boolean h() {
        return E.get(this) == n() && !i();
    }

    public final boolean m() {
        return E.addAndGet(this, -65536) == n() && !i();
    }

    public abstract int n();

    public abstract void o(int i, Throwable th, InterfaceC4684ft interfaceC4684ft);

    public final void p() {
        if (E.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = E;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i == n() && !i()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
