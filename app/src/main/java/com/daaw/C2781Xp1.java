package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzafp;

/* JADX INFO: renamed from: com.daaw.Xp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2781Xp1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        string.getClass();
        String string2 = parcel.readString();
        String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        return new zzafp(string, string2, OP2.I(strArrCreateStringArray));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzafp[i];
    }
}
