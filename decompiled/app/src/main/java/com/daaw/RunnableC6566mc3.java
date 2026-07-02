package com.daaw;

import android.os.RemoteException;

/* JADX INFO: renamed from: com.daaw.mc3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC6566mc3 implements Runnable {
    public final /* synthetic */ C5715jb3 B;
    public final /* synthetic */ C7129od3 C;

    public RunnableC6566mc3(C7129od3 c7129od3, C5715jb3 c5715jb3) {
        this.C = c7129od3;
        this.B = c5715jb3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7129od3 c7129od3 = this.C;
        InterfaceC9167vt2 interfaceC9167vt2 = c7129od3.d;
        if (interfaceC9167vt2 == null) {
            c7129od3.a.w().n().a("Failed to send current screen to service");
            return;
        }
        try {
            C5715jb3 c5715jb3 = this.B;
            if (c5715jb3 == null) {
                interfaceC9167vt2.o1(0L, null, null, c7129od3.a.v().getPackageName());
            } else {
                interfaceC9167vt2.o1(c5715jb3.c, c5715jb3.a, c5715jb3.b, c7129od3.a.v().getPackageName());
            }
            this.C.E();
        } catch (RemoteException e) {
            this.C.a.w().n().b("Failed to send current screen to the service", e);
        }
    }
}
