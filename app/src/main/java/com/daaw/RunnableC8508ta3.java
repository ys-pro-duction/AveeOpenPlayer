package com.daaw;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.ta3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8508ta3 implements Runnable {
    public final /* synthetic */ AtomicReference B;
    public final /* synthetic */ Oa3 C;

    public RunnableC8508ta3(Oa3 oa3, AtomicReference atomicReference) {
        this.C = oa3;
        this.B = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.B) {
            try {
                try {
                    this.B.set(Double.valueOf(this.C.a.z().g(this.C.a.B().o(), AbstractC1311Jr2.Q)));
                } finally {
                    this.B.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
