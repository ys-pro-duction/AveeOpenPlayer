package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzafc;

/* JADX INFO: renamed from: com.daaw.Pp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1925Pp1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzafc(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzafc[i];
    }
}
