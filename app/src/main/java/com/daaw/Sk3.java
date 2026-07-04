package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes3.dex */
public final class Sk3 implements M83 {
    public final FX1 a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public Sk3(AppMeasurementDynamiteService appMeasurementDynamiteService, FX1 fx1) {
        this.b = appMeasurementDynamiteService;
        this.a = fx1;
    }

    @Override // com.daaw.M83
    public final void a(String str, String str2, Bundle bundle, long j) {
        try {
            this.a.P(str, str2, bundle, j);
        } catch (RemoteException e) {
            C9327wU2 c9327wU2 = this.b.B;
            if (c9327wU2 != null) {
                c9327wU2.w().t().b("Event listener threw exception", e);
            }
        }
    }
}
