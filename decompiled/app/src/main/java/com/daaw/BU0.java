package com.daaw;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class BU0 {
    public final AtomicReference a = new AtomicReference(AbstractC6973o31.a());
    public final Object b = new Object();

    public final Object a() {
        return ((C6694n31) this.a.get()).b(Thread.currentThread().getId());
    }

    public final void b(Object obj) {
        long id = Thread.currentThread().getId();
        synchronized (this.b) {
            C6694n31 c6694n31 = (C6694n31) this.a.get();
            if (c6694n31.d(id, obj)) {
                return;
            }
            this.a.set(c6694n31.c(id, obj));
            G91 g91 = G91.a;
        }
    }
}
