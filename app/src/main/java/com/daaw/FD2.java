package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class FD2 implements Runnable {
    public final /* synthetic */ boolean B;
    public final /* synthetic */ C5618jE2 C;

    public FD2(C5618jE2 c5618jE2, boolean z) {
        this.C = c5618jE2;
        this.B = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.C.a.k(this.B);
    }
}
