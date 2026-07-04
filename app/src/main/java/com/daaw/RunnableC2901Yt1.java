package com.daaw;

/* JADX INFO: renamed from: com.daaw.Yt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2901Yt1 implements Runnable {
    public final /* synthetic */ InterfaceC5027h63 B;
    public final /* synthetic */ AbstractC0585Cu1 C;

    public RunnableC2901Yt1(AbstractC0585Cu1 abstractC0585Cu1, InterfaceC5027h63 interfaceC5027h63) {
        this.C = abstractC0585Cu1;
        this.B = interfaceC5027h63;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.B.a();
        if (C8292sn1.a()) {
            this.B.x().z(this);
            return;
        }
        boolean zE = this.C.e();
        this.C.c = 0L;
        if (zE) {
            this.C.c();
        }
    }
}
