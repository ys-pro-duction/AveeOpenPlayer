package com.daaw;

/* JADX INFO: renamed from: com.daaw.tg3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8538tg3 implements Runnable {
    public final /* synthetic */ AbstractC6963o11 B;
    public final /* synthetic */ C8264sh3 C;

    public RunnableC8538tg3(C8264sh3 c8264sh3, AbstractC6963o11 abstractC6963o11) {
        this.C = c8264sh3;
        this.B = abstractC6963o11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.C.b) {
            try {
                C8264sh3 c8264sh3 = this.C;
                if (c8264sh3.c != null) {
                    c8264sh3.c.onSuccess(this.B.k());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
