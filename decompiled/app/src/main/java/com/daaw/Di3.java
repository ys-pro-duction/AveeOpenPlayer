package com.daaw;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class Di3 implements Runnable {
    public final /* synthetic */ AbstractC6963o11 B;
    public final /* synthetic */ Jk3 C;

    public Di3(Jk3 jk3, AbstractC6963o11 abstractC6963o11) {
        this.C = jk3;
        this.B = abstractC6963o11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC6963o11 abstractC6963o11A = this.C.b.a(this.B.k());
            if (abstractC6963o11A == null) {
                this.C.c(new NullPointerException("Continuation returned null"));
                return;
            }
            Jk3 jk3 = this.C;
            Executor executor = AbstractC8922v11.b;
            abstractC6963o11A.e(executor, jk3);
            abstractC6963o11A.d(executor, this.C);
            abstractC6963o11A.a(executor, this.C);
        } catch (C8720uK0 e) {
            if (e.getCause() instanceof Exception) {
                this.C.c((Exception) e.getCause());
            } else {
                this.C.c(e);
            }
        } catch (CancellationException unused) {
            this.C.b();
        } catch (Exception e2) {
            this.C.c(e2);
        }
    }
}
