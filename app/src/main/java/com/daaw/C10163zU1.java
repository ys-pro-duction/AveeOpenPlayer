package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.zU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10163zU1 extends AbstractC6211lK1 implements LV1 {
    public C10163zU1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.daaw.LV1
    public final void J0(Bundle bundle) {
        Parcel parcelB = B();
        AbstractC7888rL1.d(parcelB, bundle);
        I(1, parcelB);
    }
}
