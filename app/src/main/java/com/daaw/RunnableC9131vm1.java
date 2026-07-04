package com.daaw;

/* JADX INFO: renamed from: com.daaw.vm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9131vm1 implements Runnable {
    public final /* synthetic */ String B;
    public final /* synthetic */ long C;
    public final /* synthetic */ C8114s82 D;

    public RunnableC9131vm1(C8114s82 c8114s82, String str, long j) {
        this.D = c8114s82;
        this.B = str;
        this.C = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8114s82.e(this.D, this.B, this.C);
    }
}
