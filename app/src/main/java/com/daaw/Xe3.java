package com.daaw;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes3.dex */
public final class Xe3 implements Runnable {
    public final /* synthetic */ Ci3 B;
    public final /* synthetic */ AppMeasurementDynamiteService C;

    public Xe3(AppMeasurementDynamiteService appMeasurementDynamiteService, Ci3 ci3) {
        this.C = appMeasurementDynamiteService;
        this.B = ci3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.C.B.I().H(this.B);
    }
}
