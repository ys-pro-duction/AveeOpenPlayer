package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Un2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2462Un2 implements Runnable {
    public final /* synthetic */ AbstractC6963o11 B;
    public final /* synthetic */ BD2 C;

    public RunnableC2462Un2(BD2 bd2, AbstractC6963o11 abstractC6963o11) {
        this.C = bd2;
        this.B = abstractC6963o11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC6963o11 abstractC6963o11 = (AbstractC6963o11) this.C.b.a(this.B);
            if (abstractC6963o11 == null) {
                this.C.c(new NullPointerException("Continuation returned null"));
                return;
            }
            BD2 bd2 = this.C;
            Executor executor = AbstractC8922v11.b;
            abstractC6963o11.e(executor, bd2);
            abstractC6963o11.d(executor, this.C);
            abstractC6963o11.a(executor, this.C);
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
