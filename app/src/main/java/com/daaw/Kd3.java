package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Kd3 implements Runnable {
    public final /* synthetic */ C8812uf3 B;
    public final /* synthetic */ Runnable C;

    public Kd3(Qd3 qd3, C8812uf3 c8812uf3, Runnable runnable) {
        this.B = c8812uf3;
        this.C = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.B.b();
        this.B.l0(this.C);
        this.B.C();
    }
}
