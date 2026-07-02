package com.daaw;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: renamed from: com.daaw.fd3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC4608fd3 implements Runnable {
    public final /* synthetic */ ServiceConnectionC6292ld3 B;

    public RunnableC4608fd3(ServiceConnectionC6292ld3 serviceConnectionC6292ld3) {
        this.B = serviceConnectionC6292ld3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7129od3 c7129od3 = this.B.c;
        Context contextV = c7129od3.a.v();
        this.B.c.a.a();
        C7129od3.M(c7129od3, new ComponentName(contextV, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
