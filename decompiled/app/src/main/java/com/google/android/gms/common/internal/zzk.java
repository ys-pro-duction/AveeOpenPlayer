package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.JM0;
import com.daaw.Se3;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new Se3();
    public Bundle B;
    public Feature[] C;
    public int D;
    public ConnectionTelemetryConfiguration E;

    public zzk(Bundle bundle, Feature[] featureArr, int i, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.B = bundle;
        this.C = featureArr;
        this.D = i;
        this.E = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.e(parcel, 1, this.B, false);
        JM0.t(parcel, 2, this.C, i, false);
        JM0.k(parcel, 3, this.D);
        JM0.p(parcel, 4, this.E, i, false);
        JM0.b(parcel, iA);
    }
}
