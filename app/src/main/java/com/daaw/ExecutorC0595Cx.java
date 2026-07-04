package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Cx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ExecutorC0595Cx extends CI implements Executor {
    public static final ExecutorC0595Cx E = new ExecutorC0595Cx();
    public static final AbstractC5801jt F = N91.D.j1(K01.e("kotlinx.coroutines.io.parallelism", AbstractC8417tE0.d(64, I01.a()), 0, 0, 12, null));

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        g1(C5905kG.B, runnable);
    }

    @Override // com.daaw.AbstractC5801jt
    public void g1(InterfaceC4684ft interfaceC4684ft, Runnable runnable) {
        F.g1(interfaceC4684ft, runnable);
    }

    @Override // com.daaw.AbstractC5801jt
    public void h1(InterfaceC4684ft interfaceC4684ft, Runnable runnable) {
        F.h1(interfaceC4684ft, runnable);
    }

    @Override // com.daaw.AbstractC5801jt
    public String toString() {
        return "Dispatchers.IO";
    }
}
