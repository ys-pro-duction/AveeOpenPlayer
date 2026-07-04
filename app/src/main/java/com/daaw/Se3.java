package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.zzk;

/* JADX INFO: loaded from: classes.dex */
public final class Se3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        Bundle bundleA = null;
        Feature[] featureArr = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 1) {
                bundleA = IM0.a(parcel, iR);
            } else if (iL == 2) {
                featureArr = (Feature[]) IM0.i(parcel, iR, Feature.CREATOR);
            } else if (iL == 3) {
                iT = IM0.t(parcel, iR);
            } else if (iL != 4) {
                IM0.x(parcel, iR);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) IM0.e(parcel, iR, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        IM0.k(parcel, iY);
        return new zzk(bundleA, featureArr, iT, connectionTelemetryConfiguration);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzk[i];
    }
}
