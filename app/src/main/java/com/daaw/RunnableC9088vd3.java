package com.daaw;

/* JADX INFO: renamed from: com.daaw.vd3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9088vd3 implements Runnable {
    public final /* synthetic */ AbstractC6963o11 B;
    public final /* synthetic */ Ye3 C;

    public RunnableC9088vd3(Ye3 ye3, AbstractC6963o11 abstractC6963o11) {
        this.C = ye3;
        this.B = abstractC6963o11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.C.b) {
            try {
                Ye3 ye3 = this.C;
                if (ye3.c != null) {
                    ye3.c.c((Exception) AbstractC7506py0.l(this.B.j()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
