package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.DJ1;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbkt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbkt> CREATOR = new DJ1();
    public final String B;
    public final String[] C;
    public final String[] D;

    public zzbkt(String str, String[] strArr, String[] strArr2) {
        this.B = str;
        this.C = strArr;
        this.D = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.B;
        int iA = JM0.a(parcel);
        JM0.q(parcel, 1, str, false);
        JM0.r(parcel, 2, this.C, false);
        JM0.r(parcel, 3, this.D, false);
        JM0.b(parcel, iA);
    }
}
