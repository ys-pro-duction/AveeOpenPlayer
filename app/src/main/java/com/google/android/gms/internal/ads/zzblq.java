package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C3403bK1;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzblq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzblq> CREATOR = new C3403bK1();
    public final String B;
    public final Bundle C;

    public zzblq(String str, Bundle bundle) {
        this.B = str;
        this.C = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.B;
        int iA = JM0.a(parcel);
        JM0.q(parcel, 1, str, false);
        JM0.e(parcel, 2, this.C, false);
        JM0.b(parcel, iA);
    }
}
