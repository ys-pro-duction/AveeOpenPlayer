package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.JM0;
import com.daaw.LQ1;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbxd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbxd> CREATOR = new LQ1();
    public final String B;
    public final String C;

    public zzbxd(ServerSideVerificationOptions serverSideVerificationOptions) {
        this(serverSideVerificationOptions.getUserId(), serverSideVerificationOptions.getCustomData());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.B;
        int iA = JM0.a(parcel);
        JM0.q(parcel, 1, str, false);
        JM0.q(parcel, 2, this.C, false);
        JM0.b(parcel, iA);
    }

    public zzbxd(String str, String str2) {
        this.B = str;
        this.C = str2;
    }
}
