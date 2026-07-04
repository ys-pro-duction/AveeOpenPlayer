package com.daaw;

/* JADX INFO: renamed from: com.daaw.uN2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC8734uN2 implements Runnable {
    public final C7521q11 B;

    public AbstractRunnableC8734uN2() {
        this.B = null;
    }

    public abstract void a();

    public final C7521q11 b() {
        return this.B;
    }

    public final void c(Exception exc) {
        C7521q11 c7521q11 = this.B;
        if (c7521q11 != null) {
            c7521q11.d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            c(e);
        }
    }

    public AbstractRunnableC8734uN2(C7521q11 c7521q11) {
        this.B = c7521q11;
    }
}
