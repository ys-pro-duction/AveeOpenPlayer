package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.TelemetryData;

/* JADX INFO: renamed from: com.daaw.Sl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2245Sl1 extends AbstractC1490Lk1 implements IInterface {
    public C2245Sl1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void Z2(TelemetryData telemetryData) {
        Parcel parcelB = B();
        AbstractC7167ol1.c(parcelB, telemetryData);
        I(1, parcelB);
    }
}
