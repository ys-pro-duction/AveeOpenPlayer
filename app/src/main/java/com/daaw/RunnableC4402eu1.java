package com.daaw;

/* JADX INFO: renamed from: com.daaw.eu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC4402eu1 implements Runnable {
    public final /* synthetic */ String B;
    public final /* synthetic */ long C;
    public final /* synthetic */ AbstractC4970gu1 D;

    public RunnableC4402eu1(AbstractC4970gu1 abstractC4970gu1, String str, long j) {
        this.D = abstractC4970gu1;
        this.B = str;
        this.C = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.D.B.a(this.B, this.C);
        AbstractC4970gu1 abstractC4970gu1 = this.D;
        abstractC4970gu1.B.b(abstractC4970gu1.toString());
    }
}
