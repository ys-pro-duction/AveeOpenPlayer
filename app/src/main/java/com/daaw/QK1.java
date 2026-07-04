package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class QK1 implements Runnable {
    public final /* synthetic */ C3407bL1 B;
    public final /* synthetic */ InterfaceC8442tK1 C;
    public final /* synthetic */ ArrayList D;
    public final /* synthetic */ long E;
    public final /* synthetic */ C3685cL1 F;

    public QK1(C3685cL1 c3685cL1, C3407bL1 c3407bL1, InterfaceC8442tK1 interfaceC8442tK1, ArrayList arrayList, long j) {
        this.F = c3685cL1;
        this.B = c3407bL1;
        this.C = interfaceC8442tK1;
        this.D = arrayList;
        this.E = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        synchronized (this.F.a) {
            try {
                if (this.B.a() != -1 && this.B.a() != 1) {
                    this.B.c();
                    PS2 ps2 = AbstractC9322wT1.e;
                    final InterfaceC8442tK1 interfaceC8442tK1 = this.C;
                    ps2.execute(new Runnable() { // from class: com.daaw.LK1
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC8442tK1.zzc();
                        }
                    });
                    String strValueOf = String.valueOf(zzba.zzc().b(AbstractC9820yE1.d));
                    int iA = this.B.a();
                    int i = this.F.i;
                    if (this.D.isEmpty()) {
                        str = ". Still waiting for the engine to be loaded";
                    } else {
                        str = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is " + String.valueOf(this.D.get(0));
                    }
                    zze.zza("Could not finish the full JS engine loading in " + strValueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + iA + ". Update status(fullLoadTimeout) is " + i + str + " ms. Total latency(fullLoadTimeout) is " + (zzt.zzB().a() - this.E) + " ms at timeout. Rejecting.");
                }
            } finally {
            }
        }
    }
}
