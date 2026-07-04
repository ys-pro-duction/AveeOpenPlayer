package com.daaw;

/* JADX INFO: renamed from: com.daaw.kx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC6108kx1 implements Runnable {
    public final /* synthetic */ C6387lx1 B;

    public RunnableC6108kx1(C6387lx1 c6387lx1) {
        this.B = c6387lx1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.B.b != null) {
            return;
        }
        synchronized (C6387lx1.c) {
            if (this.B.b != null) {
                return;
            }
            boolean z = false;
            try {
                zBooleanValue = ((Boolean) AbstractC9820yE1.n2.e()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    C6387lx1.d = WL2.b(this.B.a.a, "ADSHIELD", null);
                    z = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z = zBooleanValue;
            }
            this.B.b = Boolean.valueOf(z);
            C6387lx1.c.open();
        }
    }
}
