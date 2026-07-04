package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzaes;

/* JADX INFO: renamed from: com.daaw.Dp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0678Dp1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzaes(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaes[i];
    }
}
