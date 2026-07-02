package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Mb3 implements Runnable {
    public final /* synthetic */ Ue3 B;

    public /* synthetic */ Mb3(Ue3 ue3, AbstractC3747ca3 abstractC3747ca3) {
        this.B = ue3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jB = this.B.b();
        if (jB == -1 || C2599Vw.d().a() <= jB) {
            return;
        }
        Ue3.f(this.B.a);
    }
}
