package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC5908kG2;
import com.daaw.BO2;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();
    public final String zza;
    public final int zzb;

    public zzbb(String str, int i) {
        this.zza = str == null ? "" : str;
        this.zzb = i;
    }

    public static zzbb zzb(Throwable th) {
        com.google.android.gms.ads.internal.client.zze zzeVarA = AbstractC5908kG2.a(th);
        return new zzbb(BO2.d(th.getMessage()) ? zzeVarA.zzb : th.getMessage(), zzeVarA.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iA = JM0.a(parcel);
        JM0.q(parcel, 1, str, false);
        JM0.k(parcel, 2, this.zzb);
        JM0.b(parcel, iA);
    }

    public final zzba zza() {
        return new zzba(this.zza, this.zzb);
    }
}
