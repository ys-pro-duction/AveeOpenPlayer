package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class Pc3 implements Runnable {
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ zzq D;
    public final /* synthetic */ LV1 E;
    public final /* synthetic */ C7129od3 F;

    public Pc3(C7129od3 c7129od3, String str, String str2, zzq zzqVar, LV1 lv1) {
        this.F = c7129od3;
        this.B = str;
        this.C = str2;
        this.D = zzqVar;
        this.E = lv1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9327wU2 c9327wU2;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                C7129od3 c7129od3 = this.F;
                InterfaceC9167vt2 interfaceC9167vt2 = c7129od3.d;
                if (interfaceC9167vt2 == null) {
                    c7129od3.a.w().n().c("Failed to get conditional properties; not connected to service", this.B, this.C);
                    c9327wU2 = this.F.a;
                } else {
                    AbstractC7506py0.l(this.D);
                    arrayList = Pf3.s(interfaceC9167vt2.h1(this.B, this.C, this.D));
                    this.F.E();
                    c9327wU2 = this.F.a;
                }
            } catch (RemoteException e) {
                this.F.a.w().n().d("Failed to get conditional properties; remote exception", this.B, this.C, e);
                c9327wU2 = this.F.a;
            }
            c9327wU2.N().F(this.E, arrayList);
        } catch (Throwable th) {
            this.F.a.N().F(this.E, arrayList);
            throw th;
        }
    }
}
