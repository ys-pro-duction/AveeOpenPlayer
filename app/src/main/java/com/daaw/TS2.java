package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class TS2 extends AbstractC9036vR2 implements Runnable {
    public final Runnable I;

    public TS2(Runnable runnable) {
        runnable.getClass();
        this.I = runnable;
    }

    @Override // com.daaw.AbstractC9873yR2
    public final String c() {
        return "task=[" + this.I.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.I.run();
        } catch (Error | RuntimeException e) {
            f(e);
            throw e;
        }
    }
}
