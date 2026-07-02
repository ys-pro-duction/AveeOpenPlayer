package com.daaw;

/* JADX INFO: renamed from: com.daaw.jk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC5758jk1 implements Runnable {
    public final C7521q11 B;

    public AbstractRunnableC5758jk1() {
        this.B = null;
    }

    public void a(Exception exc) {
        C7521q11 c7521q11 = this.B;
        if (c7521q11 != null) {
            c7521q11.d(exc);
        }
    }

    public abstract void b();

    public final C7521q11 c() {
        return this.B;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }

    public AbstractRunnableC5758jk1(C7521q11 c7521q11) {
        this.B = c7521q11;
    }
}
