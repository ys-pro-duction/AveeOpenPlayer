package com.daaw;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes3.dex */
public final class Bh3 implements Runnable {
    public final /* synthetic */ LV1 B;
    public final /* synthetic */ AppMeasurementDynamiteService C;

    public Bh3(AppMeasurementDynamiteService appMeasurementDynamiteService, LV1 lv1) {
        this.C = appMeasurementDynamiteService;
        this.B = lv1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.C.B.N().E(this.B, this.C.B.j());
    }
}
