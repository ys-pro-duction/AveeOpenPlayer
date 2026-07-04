package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Sd3 implements Runnable {
    public final /* synthetic */ long B;
    public final /* synthetic */ C7134oe3 C;

    public Sd3(C7134oe3 c7134oe3, long j) {
        this.C = c7134oe3;
        this.B = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7134oe3.n(this.C, this.B);
    }
}
