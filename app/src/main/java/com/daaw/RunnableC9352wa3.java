package com.daaw;

/* JADX INFO: renamed from: com.daaw.wa3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9352wa3 implements Runnable {
    public final /* synthetic */ Boolean B;
    public final /* synthetic */ Oa3 C;

    public RunnableC9352wa3(Oa3 oa3, Boolean bool) {
        this.C = oa3;
        this.B = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.C.O(this.B, true);
    }
}
