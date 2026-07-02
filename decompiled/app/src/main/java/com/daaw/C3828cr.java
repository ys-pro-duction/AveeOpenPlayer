package com.daaw;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.cr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3828cr implements KP0 {
    public final AtomicReference a;

    public C3828cr(KP0 kp0) {
        G10.g(kp0, "sequence");
        this.a = new AtomicReference(kp0);
    }

    @Override // com.daaw.KP0
    public Iterator iterator() {
        KP0 kp0 = (KP0) this.a.getAndSet(null);
        if (kp0 != null) {
            return kp0.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
