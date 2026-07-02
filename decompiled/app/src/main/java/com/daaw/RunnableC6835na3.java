package com.daaw;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.na3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC6835na3 implements Runnable {
    public final /* synthetic */ AtomicReference B;
    public final /* synthetic */ Oa3 C;

    public RunnableC6835na3(Oa3 oa3, AtomicReference atomicReference) {
        this.C = oa3;
        this.B = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.B) {
            try {
                try {
                    this.B.set(Long.valueOf(this.C.a.z().n(this.C.a.B().o(), AbstractC1311Jr2.O)));
                } finally {
                    this.B.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
