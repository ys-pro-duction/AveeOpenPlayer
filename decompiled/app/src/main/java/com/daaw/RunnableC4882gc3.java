package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: renamed from: com.daaw.gc3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC4882gc3 implements Runnable {
    public final /* synthetic */ zzq B;
    public final /* synthetic */ LV1 C;
    public final /* synthetic */ C7129od3 D;

    public RunnableC4882gc3(C7129od3 c7129od3, zzq zzqVar, LV1 lv1) {
        this.D = c7129od3;
        this.B = zzqVar;
        this.C = lv1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9327wU2 c9327wU2;
        String strR0 = null;
        try {
            try {
                if (this.D.a.F().m().j(EnumC9512x73.ANALYTICS_STORAGE)) {
                    C7129od3 c7129od3 = this.D;
                    InterfaceC9167vt2 interfaceC9167vt2 = c7129od3.d;
                    if (interfaceC9167vt2 == null) {
                        c7129od3.a.w().n().a("Failed to get app instance id");
                        c9327wU2 = this.D.a;
                    } else {
                        AbstractC7506py0.l(this.B);
                        strR0 = interfaceC9167vt2.r0(this.B);
                        if (strR0 != null) {
                            this.D.a.I().C(strR0);
                            this.D.a.F().g.b(strR0);
                        }
                        this.D.E();
                        c9327wU2 = this.D.a;
                    }
                } else {
                    this.D.a.w().u().a("Analytics storage consent denied; will not get app instance id");
                    this.D.a.I().C(null);
                    this.D.a.F().g.b(null);
                    c9327wU2 = this.D.a;
                }
            } catch (RemoteException e) {
                this.D.a.w().n().b("Failed to get app instance id", e);
                c9327wU2 = this.D.a;
            }
            c9327wU2.N().K(this.C, strR0);
        } catch (Throwable th) {
            this.D.a.N().K(this.C, null);
            throw th;
        }
    }
}
