package com.daaw;

/* JADX INFO: renamed from: com.daaw.uS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8753uS1 implements Runnable {
    public final /* synthetic */ AbstractC6963o11 B;
    public final /* synthetic */ C8393t82 C;

    public RunnableC8753uS1(C8393t82 c8393t82, AbstractC6963o11 abstractC6963o11) {
        this.C = c8393t82;
        this.B = abstractC6963o11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.B.l()) {
            this.C.c.s();
            return;
        }
        try {
            this.C.c.r(this.C.b.a(this.B));
        } catch (C8720uK0 e) {
            if (e.getCause() instanceof Exception) {
                this.C.c.q((Exception) e.getCause());
            } else {
                this.C.c.q(e);
            }
        } catch (Exception e2) {
            this.C.c.q(e2);
        }
    }
}
