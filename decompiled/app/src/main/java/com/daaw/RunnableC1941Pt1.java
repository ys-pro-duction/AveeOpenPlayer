package com.daaw;

/* JADX INFO: renamed from: com.daaw.Pt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC1941Pt1 implements Runnable {
    public final AbstractC4970gu1 B;
    public final C6096ku1 C;
    public final Runnable D;

    public RunnableC1941Pt1(AbstractC4970gu1 abstractC4970gu1, C6096ku1 c6096ku1, Runnable runnable) {
        this.B = abstractC4970gu1;
        this.C = c6096ku1;
        this.D = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.B.zzw();
        C6096ku1 c6096ku1 = this.C;
        if (c6096ku1.c()) {
            this.B.g(c6096ku1.a);
        } else {
            this.B.zzn(c6096ku1.c);
        }
        if (this.C.d) {
            this.B.zzm("intermediate-response");
        } else {
            this.B.h("done");
        }
        Runnable runnable = this.D;
        if (runnable != null) {
            runnable.run();
        }
    }
}
