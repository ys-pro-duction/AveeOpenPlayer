package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Ke3 implements Runnable {
    public final /* synthetic */ C9656xf3 B;
    public final /* synthetic */ C8812uf3 C;

    public Ke3(C8812uf3 c8812uf3, C9656xf3 c9656xf3) {
        this.C = c8812uf3;
        this.B = c9656xf3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8812uf3.k0(this.C, this.B);
        this.C.u();
    }
}
