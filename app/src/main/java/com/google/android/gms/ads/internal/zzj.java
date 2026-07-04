package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final float zze;
    public final int zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzj(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = str;
        this.zzd = z3;
        this.zze = f;
        this.zzf = i;
        this.zzg = z4;
        this.zzh = z5;
        this.zzi = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.zza;
        int iA = JM0.a(parcel);
        JM0.c(parcel, 2, z);
        JM0.c(parcel, 3, this.zzb);
        JM0.q(parcel, 4, this.zzc, false);
        JM0.c(parcel, 5, this.zzd);
        JM0.h(parcel, 6, this.zze);
        JM0.k(parcel, 7, this.zzf);
        JM0.c(parcel, 8, this.zzg);
        JM0.c(parcel, 9, this.zzh);
        JM0.c(parcel, 10, this.zzi);
        JM0.b(parcel, iA);
    }

    public zzj(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f, -1, z4, z5, z6);
    }
}
