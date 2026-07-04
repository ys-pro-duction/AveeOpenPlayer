package com.daaw;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class J32 implements Runnable {
    public final /* synthetic */ AtomicReference B;

    public /* synthetic */ J32(AtomicReference atomicReference) {
        this.B = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L32.o(this.B);
    }
}
