package com.daaw;

import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class Xb3 implements Runnable {
    public final /* synthetic */ zzq B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ zzlk D;
    public final /* synthetic */ C7129od3 E;

    public Xb3(C7129od3 c7129od3, zzq zzqVar, boolean z, zzlk zzlkVar) {
        this.E = c7129od3;
        this.B = zzqVar;
        this.C = z;
        this.D = zzlkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7129od3 c7129od3 = this.E;
        InterfaceC9167vt2 interfaceC9167vt2 = c7129od3.d;
        if (interfaceC9167vt2 == null) {
            c7129od3.a.w().n().a("Discarding data. Failed to set user property");
            return;
        }
        AbstractC7506py0.l(this.B);
        this.E.n(interfaceC9167vt2, this.C ? null : this.D, this.B);
        this.E.E();
    }
}
