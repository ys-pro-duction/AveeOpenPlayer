package com.daaw;

/* JADX INFO: renamed from: com.daaw.y93, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9801y93 implements Runnable {
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ long E;
    public final /* synthetic */ Oa3 F;

    public RunnableC9801y93(Oa3 oa3, String str, String str2, Object obj, long j) {
        this.F = oa3;
        this.B = str;
        this.C = str2;
        this.D = obj;
        this.E = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.F.M(this.B, this.C, this.D, this.E);
    }
}
