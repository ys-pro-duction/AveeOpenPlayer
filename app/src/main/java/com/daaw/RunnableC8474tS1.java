package com.daaw;

/* JADX INFO: renamed from: com.daaw.tS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8474tS1 implements Runnable {
    public final /* synthetic */ long B;
    public final /* synthetic */ C8114s82 C;

    public RunnableC8474tS1(C8114s82 c8114s82, long j) {
        this.C = c8114s82;
        this.B = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.C.m(this.B);
    }
}
