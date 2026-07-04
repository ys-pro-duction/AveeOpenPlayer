package com.daaw;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.daaw.pg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7421pg1 {
    public final C8565tm0 a = new C8565tm0(new Reference[16], 0);
    public final ReferenceQueue b = new ReferenceQueue();

    public final void a() {
        Reference referencePoll;
        do {
            referencePoll = this.b.poll();
            if (referencePoll != null) {
                this.a.w(referencePoll);
            }
        } while (referencePoll != null);
    }

    public final int b() {
        a();
        return this.a.r();
    }

    public final Object c() {
        a();
        while (this.a.u()) {
            Object obj = ((Reference) this.a.z(r0.r() - 1)).get();
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }

    public final void d(Object obj) {
        a();
        this.a.d(new WeakReference(obj, this.b));
    }
}
