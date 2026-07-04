package com.daaw;

/* JADX INFO: renamed from: com.daaw.ix1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5538ix1 implements Runnable {
    public final /* synthetic */ C5820jx1 B;

    public RunnableC5538ix1(C5820jx1 c5820jx1) {
        this.B = c5820jx1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.B.O) {
            if (this.B.P) {
                return;
            }
            this.B.P = true;
            try {
                C5820jx1.f(this.B);
            } catch (Exception e) {
                this.B.G.c(2023, -1L, e);
            }
            synchronized (this.B.O) {
                this.B.P = false;
            }
        }
    }
}
