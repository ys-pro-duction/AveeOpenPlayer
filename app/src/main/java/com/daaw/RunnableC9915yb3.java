package com.daaw;

/* JADX INFO: renamed from: com.daaw.yb3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9915yb3 implements Runnable {
    public final /* synthetic */ long B;
    public final /* synthetic */ Hb3 C;

    public RunnableC9915yb3(Hb3 hb3, long j) {
        this.C = hb3;
        this.B = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.C.a.y().j(this.B);
        this.C.e = null;
    }
}
