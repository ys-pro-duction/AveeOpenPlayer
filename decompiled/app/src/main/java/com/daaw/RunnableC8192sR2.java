package com.daaw;

/* JADX INFO: renamed from: com.daaw.sR2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8192sR2 implements Runnable {
    public final AbstractC9873yR2 B;
    public final InterfaceFutureC8236sc0 C;

    public RunnableC8192sR2(AbstractC9873yR2 abstractC9873yR2, InterfaceFutureC8236sc0 interfaceFutureC8236sc0) {
        this.B = abstractC9873yR2;
        this.C = interfaceFutureC8236sc0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.B.B != this) {
            return;
        }
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = this.C;
        if (AbstractC9873yR2.G.f(this.B, this, AbstractC9873yR2.h(interfaceFutureC8236sc0))) {
            AbstractC9873yR2.z(this.B, false);
        }
    }
}
