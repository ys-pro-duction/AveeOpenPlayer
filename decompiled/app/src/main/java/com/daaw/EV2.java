package com.daaw;

import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class EV2 implements Runnable {
    public final /* synthetic */ zzac B;
    public final /* synthetic */ zzq C;
    public final /* synthetic */ K43 D;

    public EV2(K43 k43, zzac zzacVar, zzq zzqVar) {
        this.D = k43;
        this.B = zzacVar;
        this.C = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.D.B.b();
        if (this.B.D.e() == null) {
            this.D.B.q(this.B, this.C);
        } else {
            this.D.B.z(this.B, this.C);
        }
    }
}
