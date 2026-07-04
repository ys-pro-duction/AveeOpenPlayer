package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: renamed from: com.daaw.jc3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5720jc3 implements Runnable {
    public final /* synthetic */ zzq B;
    public final /* synthetic */ C7129od3 C;

    public RunnableC5720jc3(C7129od3 c7129od3, zzq zzqVar) {
        this.C = c7129od3;
        this.B = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7129od3 c7129od3 = this.C;
        InterfaceC9167vt2 interfaceC9167vt2 = c7129od3.d;
        if (interfaceC9167vt2 == null) {
            c7129od3.a.w().n().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            AbstractC7506py0.l(this.B);
            interfaceC9167vt2.g1(this.B);
            this.C.a.C().q();
            this.C.n(interfaceC9167vt2, null, this.B);
            this.C.E();
        } catch (RemoteException e) {
            this.C.a.w().n().b("Failed to send app launch to the service", e);
        }
    }
}
