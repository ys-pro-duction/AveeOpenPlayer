package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* JADX INFO: renamed from: com.daaw.mg3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6586mg3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArrC = null;
        int[] iArrC2 = null;
        boolean zM = false;
        boolean zM2 = false;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            switch (IM0.l(iR)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) IM0.e(parcel, iR, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    zM = IM0.m(parcel, iR);
                    break;
                case 3:
                    zM2 = IM0.m(parcel, iR);
                    break;
                case 4:
                    iArrC = IM0.c(parcel, iR);
                    break;
                case 5:
                    iT = IM0.t(parcel, iR);
                    break;
                case 6:
                    iArrC2 = IM0.c(parcel, iR);
                    break;
                default:
                    IM0.x(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zM, zM2, iArrC, iT, iArrC2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionTelemetryConfiguration[i];
    }
}
