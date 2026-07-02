package com.daaw;

/* JADX INFO: renamed from: com.daaw.ha3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5151ha3 implements Runnable {
    public final /* synthetic */ AbstractC6963o11 B;
    public final /* synthetic */ Pb3 C;

    public RunnableC5151ha3(Pb3 pb3, AbstractC6963o11 abstractC6963o11) {
        this.C = pb3;
        this.B = abstractC6963o11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.C.b) {
            try {
                Pb3 pb3 = this.C;
                if (pb3.c != null) {
                    pb3.c.a(this.B);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
