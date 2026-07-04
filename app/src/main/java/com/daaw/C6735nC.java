package com.daaw;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: com.daaw.nC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C6735nC extends ON0 {
    public static final AtomicIntegerFieldUpdater F = AtomicIntegerFieldUpdater.newUpdater(C6735nC.class, "_decision");
    private volatile int _decision;

    public C6735nC(InterfaceC4684ft interfaceC4684ft, InterfaceC1416Ks interfaceC1416Ks) {
        super(interfaceC4684ft, interfaceC1416Ks);
    }

    private final boolean W0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = F;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!F.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean X0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = F;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!F.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // com.daaw.ON0, com.daaw.AbstractC9472x
    public void R0(Object obj) {
        if (W0()) {
            return;
        }
        AbstractC6456mC.c(H10.b(this.E), AbstractC2459Un.a(obj, this.E), null, 2, null);
    }

    public final Object V0() {
        if (X0()) {
            return I10.c();
        }
        Object objH = AbstractC4167e40.h(a0());
        if (objH instanceof C2041Qn) {
            throw ((C2041Qn) objH).a;
        }
        return objH;
    }

    @Override // com.daaw.ON0, com.daaw.C3889d40
    public void q(Object obj) {
        R0(obj);
    }
}
