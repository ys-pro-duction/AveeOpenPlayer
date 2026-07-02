package com.daaw;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.qa3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC7672qa3 implements Runnable {
    public final /* synthetic */ AtomicReference B;
    public final /* synthetic */ Oa3 C;

    public RunnableC7672qa3(Oa3 oa3, AtomicReference atomicReference) {
        this.C = oa3;
        this.B = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.B) {
            try {
                try {
                    this.B.set(Integer.valueOf(this.C.a.z().k(this.C.a.B().o(), AbstractC1311Jr2.P)));
                } finally {
                    this.B.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
