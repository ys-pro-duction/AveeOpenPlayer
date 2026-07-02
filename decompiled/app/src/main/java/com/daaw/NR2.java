package com.daaw;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class NR2 extends MR2 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicIntegerFieldUpdater b;

    public NR2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicIntegerFieldUpdater;
    }

    @Override // com.daaw.MR2
    public final int a(QR2 qr2) {
        return this.b.decrementAndGet(qr2);
    }

    @Override // com.daaw.MR2
    public final void b(QR2 qr2, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.a;
            if (AbstractC5549j0.a(atomicReferenceFieldUpdater, qr2, null, set2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(qr2) == null);
    }
}
