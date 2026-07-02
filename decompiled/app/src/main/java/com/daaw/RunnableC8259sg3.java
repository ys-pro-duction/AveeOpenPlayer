package com.daaw;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: renamed from: com.daaw.sg3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8259sg3 implements Runnable {
    public final /* synthetic */ LV1 B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ AppMeasurementDynamiteService E;

    public RunnableC8259sg3(AppMeasurementDynamiteService appMeasurementDynamiteService, LV1 lv1, String str, String str2) {
        this.E = appMeasurementDynamiteService;
        this.B = lv1;
        this.C = str;
        this.D = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.E.B.L().T(this.B, this.C, this.D);
    }
}
