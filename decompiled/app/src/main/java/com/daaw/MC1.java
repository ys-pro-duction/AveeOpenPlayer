package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class MC1 implements Runnable {
    public final /* synthetic */ String B;
    public final /* synthetic */ long C;
    public final /* synthetic */ C8114s82 D;

    public MC1(C8114s82 c8114s82, String str, long j) {
        this.D = c8114s82;
        this.B = str;
        this.C = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8114s82.f(this.D, this.B, this.C);
    }
}
