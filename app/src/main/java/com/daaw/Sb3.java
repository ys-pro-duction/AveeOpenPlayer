package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.measurement.internal.zzq;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Sb3 implements Runnable {
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ zzq D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ LV1 F;
    public final /* synthetic */ C7129od3 G;

    public Sb3(C7129od3 c7129od3, String str, String str2, zzq zzqVar, boolean z, LV1 lv1) {
        this.G = c7129od3;
        this.B = str;
        this.C = str2;
        this.D = zzqVar;
        this.E = z;
        this.F = lv1;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e;
        Bundle bundle2 = new Bundle();
        try {
            try {
                C7129od3 c7129od3 = this.G;
                InterfaceC9167vt2 interfaceC9167vt2 = c7129od3.d;
                if (interfaceC9167vt2 == null) {
                    c7129od3.a.w().n().c("Failed to get user properties; not connected to service", this.B, this.C);
                    this.G.a.N().G(this.F, bundle2);
                    return;
                }
                AbstractC7506py0.l(this.D);
                List<zzlk> listM1 = interfaceC9167vt2.M1(this.B, this.C, this.E, this.D);
                bundle = new Bundle();
                if (listM1 != null) {
                    for (zzlk zzlkVar : listM1) {
                        String str = zzlkVar.F;
                        if (str != null) {
                            bundle.putString(zzlkVar.C, str);
                        } else {
                            Long l = zzlkVar.E;
                            if (l != null) {
                                bundle.putLong(zzlkVar.C, l.longValue());
                            } else {
                                Double d = zzlkVar.H;
                                if (d != null) {
                                    bundle.putDouble(zzlkVar.C, d.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    this.G.E();
                    this.G.a.N().G(this.F, bundle);
                    return;
                } catch (RemoteException e2) {
                    e = e2;
                    this.G.a.w().n().c("Failed to get user properties; remote exception", this.B, e);
                    this.G.a.N().G(this.F, bundle);
                    return;
                }
            } catch (RemoteException e3) {
                bundle = bundle2;
                e = e3;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            bundle2 = bundle;
        }
        this.G.a.N().G(this.F, bundle2);
        throw th;
    }
}
