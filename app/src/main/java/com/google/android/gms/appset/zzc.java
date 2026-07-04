package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C9237w82;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new C9237w82();
    public final String B;
    public final int C;

    public zzc(String str, int i) {
        this.B = str;
        this.C = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.q(parcel, 1, this.B, false);
        JM0.k(parcel, 2, this.C);
        JM0.b(parcel, iA);
    }

    public final int zza() {
        return this.C;
    }

    public final String zzb() {
        return this.B;
    }
}
