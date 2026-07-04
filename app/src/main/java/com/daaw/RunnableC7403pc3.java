package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: renamed from: com.daaw.pc3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC7403pc3 implements Runnable {
    public final /* synthetic */ zzq B;
    public final /* synthetic */ Bundle C;
    public final /* synthetic */ C7129od3 D;

    public RunnableC7403pc3(C7129od3 c7129od3, zzq zzqVar, Bundle bundle) {
        this.D = c7129od3;
        this.B = zzqVar;
        this.C = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7129od3 c7129od3 = this.D;
        InterfaceC9167vt2 interfaceC9167vt2 = c7129od3.d;
        if (interfaceC9167vt2 == null) {
            c7129od3.a.w().n().a("Failed to send default event parameters to service");
            return;
        }
        try {
            AbstractC7506py0.l(this.B);
            interfaceC9167vt2.Z(this.C, this.B);
        } catch (RemoteException e) {
            this.D.a.w().n().b("Failed to send default event parameters to service", e);
        }
    }
}
