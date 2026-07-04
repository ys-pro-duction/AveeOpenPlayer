package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzafa;

/* JADX INFO: renamed from: com.daaw.Hp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1094Hp1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzafa(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzafa[i];
    }
}
