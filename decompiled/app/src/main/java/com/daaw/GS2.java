package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class GS2 implements Runnable {
    public final /* synthetic */ C8389t73 B;

    public GS2(C8389t73 c8389t73) {
        this.B = c8389t73;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.B.b) {
            try {
                C8389t73 c8389t73 = this.B;
                if (c8389t73.c != null) {
                    c8389t73.c.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
