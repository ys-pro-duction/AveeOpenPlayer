package com.daaw;

/* JADX INFO: renamed from: com.daaw.cd3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3762cd3 implements Runnable {
    public final /* synthetic */ InterfaceC9167vt2 B;
    public final /* synthetic */ ServiceConnectionC6292ld3 C;

    public RunnableC3762cd3(ServiceConnectionC6292ld3 serviceConnectionC6292ld3, InterfaceC9167vt2 interfaceC9167vt2) {
        this.C = serviceConnectionC6292ld3;
        this.B = interfaceC9167vt2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.C) {
            try {
                this.C.a = false;
                if (!this.C.c.z()) {
                    this.C.c.a.w().m().a("Connected to remote service");
                    this.C.c.u(this.B);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
