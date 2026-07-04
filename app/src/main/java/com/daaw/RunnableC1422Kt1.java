package com.daaw;

/* JADX INFO: renamed from: com.daaw.Kt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC1422Kt1 implements Runnable {
    public final /* synthetic */ AbstractC4970gu1 B;
    public final /* synthetic */ C1525Lt1 C;

    public RunnableC1422Kt1(C1525Lt1 c1525Lt1, AbstractC4970gu1 abstractC4970gu1) {
        this.C = c1525Lt1;
        this.B = abstractC4970gu1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.C.C.put(this.B);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
