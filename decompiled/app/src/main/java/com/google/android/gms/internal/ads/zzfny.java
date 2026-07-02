package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.DL2;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfny extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfny> CREATOR = new DL2();
    public final int B;
    public final String C;
    public final String D;

    public zzfny(int i, String str, String str2) {
        this.B = i;
        this.C = str;
        this.D = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.B;
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, i2);
        JM0.q(parcel, 2, this.C, false);
        JM0.q(parcel, 3, this.D, false);
        JM0.b(parcel, iA);
    }

    public zzfny(String str, String str2) {
        this(1, str, str2);
    }
}
