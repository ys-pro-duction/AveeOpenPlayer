package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();
    public final String zza;
    public long zzb;
    public zze zzc;
    public final Bundle zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final String zzh;

    public zzu(String str, long j, zze zzeVar, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.zza = str;
        this.zzb = j;
        this.zzc = zzeVar;
        this.zzd = bundle;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzh = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iA = JM0.a(parcel);
        JM0.q(parcel, 1, str, false);
        JM0.n(parcel, 2, this.zzb);
        JM0.p(parcel, 3, this.zzc, i, false);
        JM0.e(parcel, 4, this.zzd, false);
        JM0.q(parcel, 5, this.zze, false);
        JM0.q(parcel, 6, this.zzf, false);
        JM0.q(parcel, 7, this.zzg, false);
        JM0.q(parcel, 8, this.zzh, false);
        JM0.b(parcel, iA);
    }
}
