package com.daaw;

/* JADX INFO: renamed from: com.daaw.s93, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8120s93 implements Runnable {
    public final /* synthetic */ long B;
    public final /* synthetic */ Oa3 C;

    public RunnableC8120s93(Oa3 oa3, long j) {
        this.C = oa3;
        this.B = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.C.a.F().k.b(this.B);
        this.C.a.w().m().b("Session timeout duration set", Long.valueOf(this.B));
    }
}
