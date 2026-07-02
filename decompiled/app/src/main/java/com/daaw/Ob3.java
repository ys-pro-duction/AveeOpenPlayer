package com.daaw;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzau;

/* JADX INFO: loaded from: classes3.dex */
public final class Ob3 implements Runnable {
    public final /* synthetic */ LV1 B;
    public final /* synthetic */ zzau C;
    public final /* synthetic */ String D;
    public final /* synthetic */ AppMeasurementDynamiteService E;

    public Ob3(AppMeasurementDynamiteService appMeasurementDynamiteService, LV1 lv1, zzau zzauVar, String str) {
        this.E = appMeasurementDynamiteService;
        this.B = lv1;
        this.C = zzauVar;
        this.D = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.E.B.L().l(this.B, this.C, this.D);
    }
}
