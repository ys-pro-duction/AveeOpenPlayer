package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.JM0;
import com.daaw.SJ1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzblg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzblg> CREATOR = new SJ1();
    public final String B;
    public final boolean C;
    public final int D;
    public final String E;

    public zzblg(String str, boolean z, int i, String str2) {
        this.B = str;
        this.C = z;
        this.D = i;
        this.E = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.B;
        int iA = JM0.a(parcel);
        JM0.q(parcel, 1, str, false);
        JM0.c(parcel, 2, this.C);
        JM0.k(parcel, 3, this.D);
        JM0.q(parcel, 4, this.E, false);
        JM0.b(parcel, iA);
    }
}
