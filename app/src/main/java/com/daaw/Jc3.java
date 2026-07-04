package com.daaw;

import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class Jc3 implements Runnable {
    public final /* synthetic */ zzq B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ zzac D;
    public final /* synthetic */ zzac E;
    public final /* synthetic */ C7129od3 F;

    public Jc3(C7129od3 c7129od3, boolean z, zzq zzqVar, boolean z2, zzac zzacVar, zzac zzacVar2) {
        this.F = c7129od3;
        this.B = zzqVar;
        this.C = z2;
        this.D = zzacVar;
        this.E = zzacVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7129od3 c7129od3 = this.F;
        InterfaceC9167vt2 interfaceC9167vt2 = c7129od3.d;
        if (interfaceC9167vt2 == null) {
            c7129od3.a.w().n().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        AbstractC7506py0.l(this.B);
        this.F.n(interfaceC9167vt2, this.C ? null : this.D, this.B);
        this.F.E();
    }
}
