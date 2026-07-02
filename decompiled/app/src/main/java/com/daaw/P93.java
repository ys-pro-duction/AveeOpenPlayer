package com.daaw;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class P93 implements Runnable {
    public final /* synthetic */ AtomicReference B;
    public final /* synthetic */ Oa3 C;

    public P93(Oa3 oa3, AtomicReference atomicReference) {
        this.C = oa3;
        this.B = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.B) {
            try {
                try {
                    this.B.set(Boolean.valueOf(this.C.a.z().B(this.C.a.B().o(), AbstractC1311Jr2.M)));
                } finally {
                    this.B.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
