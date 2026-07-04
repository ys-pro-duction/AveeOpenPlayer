package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.JM0;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new zzx();

    @AppOpenAd.AppOpenAdOrientation
    public final int zza;

    public zzw(@AppOpenAd.AppOpenAdOrientation int i) {
        this.zza = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iA = JM0.a(parcel);
        JM0.k(parcel, 2, i2);
        JM0.b(parcel, iA);
    }
}
