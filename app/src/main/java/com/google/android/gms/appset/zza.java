package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.JM0;
import com.daaw.TC1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new TC1();
    public final String B;
    public final String C;

    public zza(String str, String str2) {
        this.B = str;
        this.C = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.q(parcel, 1, this.B, false);
        JM0.q(parcel, 2, this.C, false);
        JM0.b(parcel, iA);
    }
}
