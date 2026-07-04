package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.JM0;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzfh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfh> CREATOR = new zzfi();
    public final String zza;

    public zzfh(SearchAdRequest searchAdRequest) {
        this.zza = searchAdRequest.getQuery();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iA = JM0.a(parcel);
        JM0.q(parcel, 15, str, false);
        JM0.b(parcel, iA);
    }

    public zzfh(String str) {
        this.zza = str;
    }
}
