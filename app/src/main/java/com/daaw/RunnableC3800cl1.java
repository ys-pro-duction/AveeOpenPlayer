package com.daaw;

/* JADX INFO: renamed from: com.daaw.cl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3800cl1 implements Runnable {
    public final /* synthetic */ int B;
    public final /* synthetic */ C4646fl1 C;

    public RunnableC3800cl1(C4646fl1 c4646fl1, int i) {
        this.C = c4646fl1;
        this.B = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.C.i(this.B);
    }
}
