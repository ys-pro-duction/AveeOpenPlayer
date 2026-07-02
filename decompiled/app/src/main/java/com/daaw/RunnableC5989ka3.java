package com.daaw;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.ka3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5989ka3 implements Runnable {
    public final /* synthetic */ AtomicReference B;
    public final /* synthetic */ Oa3 C;

    public RunnableC5989ka3(Oa3 oa3, AtomicReference atomicReference) {
        this.C = oa3;
        this.B = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.B) {
            try {
                try {
                    this.B.set(this.C.a.z().u(this.C.a.B().o(), AbstractC1311Jr2.N));
                } finally {
                    this.B.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
