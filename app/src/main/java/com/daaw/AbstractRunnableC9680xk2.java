package com.daaw;

/* JADX INFO: renamed from: com.daaw.xk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC9680xk2 implements Runnable {
    public final long B;
    public final long C;
    public final boolean D;
    public final /* synthetic */ C3831cr2 E;

    public AbstractRunnableC9680xk2(C3831cr2 c3831cr2, boolean z) {
        this.E = c3831cr2;
        this.B = c3831cr2.b.a();
        this.C = c3831cr2.b.b();
        this.D = z;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        if (this.E.g) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            this.E.j(e, false, this.D);
            b();
        }
    }

    public void b() {
    }
}
