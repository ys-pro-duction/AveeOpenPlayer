package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzfu;

/* JADX INFO: loaded from: classes3.dex */
public final class LN2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzfu(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfu[i];
    }
}
