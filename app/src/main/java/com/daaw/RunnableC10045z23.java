package com.daaw;

import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: renamed from: com.daaw.z23, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10045z23 implements Runnable {
    public final /* synthetic */ zzlk B;
    public final /* synthetic */ zzq C;
    public final /* synthetic */ K43 D;

    public RunnableC10045z23(K43 k43, zzlk zzlkVar, zzq zzqVar) {
        this.D = k43;
        this.B = zzlkVar;
        this.C = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.D.B.b();
        if (this.B.e() == null) {
            this.D.B.r(this.B.C, this.C);
        } else {
            this.D.B.B(this.B, this.C);
        }
    }
}
