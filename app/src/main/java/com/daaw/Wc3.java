package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Wc3 implements Runnable {
    public final /* synthetic */ InterfaceC9167vt2 B;
    public final /* synthetic */ ServiceConnectionC6292ld3 C;

    public Wc3(ServiceConnectionC6292ld3 serviceConnectionC6292ld3, InterfaceC9167vt2 interfaceC9167vt2) {
        this.C = serviceConnectionC6292ld3;
        this.B = interfaceC9167vt2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.C) {
            try {
                this.C.a = false;
                if (!this.C.c.z()) {
                    this.C.c.a.w().s().a("Connected to service");
                    this.C.c.u(this.B);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
