package com.daaw;

import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class Hc3 implements Runnable {
    public final /* synthetic */ zzq B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ zzau D;
    public final /* synthetic */ String E;
    public final /* synthetic */ C7129od3 F;

    public Hc3(C7129od3 c7129od3, boolean z, zzq zzqVar, boolean z2, zzau zzauVar, String str) {
        this.F = c7129od3;
        this.B = zzqVar;
        this.C = z2;
        this.D = zzauVar;
        this.E = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7129od3 c7129od3 = this.F;
        InterfaceC9167vt2 interfaceC9167vt2 = c7129od3.d;
        if (interfaceC9167vt2 == null) {
            c7129od3.a.w().n().a("Discarding data. Failed to send event to service");
            return;
        }
        AbstractC7506py0.l(this.B);
        this.F.n(interfaceC9167vt2, this.C ? null : this.D, this.B);
        this.F.E();
    }
}
