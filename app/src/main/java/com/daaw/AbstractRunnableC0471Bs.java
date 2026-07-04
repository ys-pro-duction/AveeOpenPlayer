package com.daaw;

/* JADX INFO: renamed from: com.daaw.Bs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC0471Bs implements Runnable {
    public final C8594ts B;

    public AbstractRunnableC0471Bs(C8594ts c8594ts) {
        this.B = c8594ts;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        C8594ts c8594tsB = this.B.b();
        try {
            a();
        } finally {
            this.B.f(c8594tsB);
        }
    }
}
