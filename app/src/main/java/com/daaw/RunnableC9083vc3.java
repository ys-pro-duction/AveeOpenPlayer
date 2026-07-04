package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzau;

/* JADX INFO: renamed from: com.daaw.vc3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9083vc3 implements Runnable {
    public final /* synthetic */ zzau B;
    public final /* synthetic */ String C;
    public final /* synthetic */ LV1 D;
    public final /* synthetic */ C7129od3 E;

    public RunnableC9083vc3(C7129od3 c7129od3, zzau zzauVar, String str, LV1 lv1) {
        this.E = c7129od3;
        this.B = zzauVar;
        this.C = str;
        this.D = lv1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9327wU2 c9327wU2;
        byte[] bArrP2 = null;
        try {
            try {
                C7129od3 c7129od3 = this.E;
                InterfaceC9167vt2 interfaceC9167vt2 = c7129od3.d;
                if (interfaceC9167vt2 == null) {
                    c7129od3.a.w().n().a("Discarding data. Failed to send event to service to bundle");
                    c9327wU2 = this.E.a;
                } else {
                    bArrP2 = interfaceC9167vt2.P2(this.B, this.C);
                    this.E.E();
                    c9327wU2 = this.E.a;
                }
            } catch (RemoteException e) {
                this.E.a.w().n().b("Failed to send event to the service to bundle", e);
                c9327wU2 = this.E.a;
            }
            c9327wU2.N().H(this.D, bArrP2);
        } catch (Throwable th) {
            this.E.a.N().H(this.D, bArrP2);
            throw th;
        }
    }
}
