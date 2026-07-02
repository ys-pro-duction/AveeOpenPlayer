package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC4563fT1;
import com.daaw.AbstractC8022rp0;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzn();
    public final int zza;

    @Deprecated
    public final long zzb;
    public final Bundle zzc;

    @Deprecated
    public final int zzd;
    public final List zze;
    public final boolean zzf;
    public final int zzg;
    public final boolean zzh;
    public final String zzi;
    public final zzfh zzj;
    public final Location zzk;
    public final String zzl;
    public final Bundle zzm;
    public final Bundle zzn;
    public final List zzo;
    public final String zzp;
    public final String zzq;

    @Deprecated
    public final boolean zzr;
    public final zzc zzs;
    public final int zzt;
    public final String zzu;
    public final List zzv;
    public final int zzw;
    public final String zzx;
    public final int zzy;

    public zzl(int i, long j, Bundle bundle, int i2, List list, boolean z, int i3, boolean z2, String str, zzfh zzfhVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z3, zzc zzcVar, int i4, String str5, List list3, int i5, String str6, int i6) {
        this.zza = i;
        this.zzb = j;
        this.zzc = bundle == null ? new Bundle() : bundle;
        this.zzd = i2;
        this.zze = list;
        this.zzf = z;
        this.zzg = i3;
        this.zzh = z2;
        this.zzi = str;
        this.zzj = zzfhVar;
        this.zzk = location;
        this.zzl = str2;
        this.zzm = bundle2 == null ? new Bundle() : bundle2;
        this.zzn = bundle3;
        this.zzo = list2;
        this.zzp = str3;
        this.zzq = str4;
        this.zzr = z3;
        this.zzs = zzcVar;
        this.zzt = i4;
        this.zzu = str5;
        this.zzv = list3 == null ? new ArrayList() : list3;
        this.zzw = i5;
        this.zzx = str6;
        this.zzy = i6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzl)) {
            return false;
        }
        zzl zzlVar = (zzl) obj;
        return this.zza == zzlVar.zza && this.zzb == zzlVar.zzb && AbstractC4563fT1.a(this.zzc, zzlVar.zzc) && this.zzd == zzlVar.zzd && AbstractC8022rp0.a(this.zze, zzlVar.zze) && this.zzf == zzlVar.zzf && this.zzg == zzlVar.zzg && this.zzh == zzlVar.zzh && AbstractC8022rp0.a(this.zzi, zzlVar.zzi) && AbstractC8022rp0.a(this.zzj, zzlVar.zzj) && AbstractC8022rp0.a(this.zzk, zzlVar.zzk) && AbstractC8022rp0.a(this.zzl, zzlVar.zzl) && AbstractC4563fT1.a(this.zzm, zzlVar.zzm) && AbstractC4563fT1.a(this.zzn, zzlVar.zzn) && AbstractC8022rp0.a(this.zzo, zzlVar.zzo) && AbstractC8022rp0.a(this.zzp, zzlVar.zzp) && AbstractC8022rp0.a(this.zzq, zzlVar.zzq) && this.zzr == zzlVar.zzr && this.zzt == zzlVar.zzt && AbstractC8022rp0.a(this.zzu, zzlVar.zzu) && AbstractC8022rp0.a(this.zzv, zzlVar.zzv) && this.zzw == zzlVar.zzw && AbstractC8022rp0.a(this.zzx, zzlVar.zzx) && this.zzy == zzlVar.zzy;
    }

    public final int hashCode() {
        return AbstractC8022rp0.b(Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), this.zze, Boolean.valueOf(this.zzf), Integer.valueOf(this.zzg), Boolean.valueOf(this.zzh), this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, Boolean.valueOf(this.zzr), Integer.valueOf(this.zzt), this.zzu, this.zzv, Integer.valueOf(this.zzw), this.zzx, Integer.valueOf(this.zzy));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, i2);
        JM0.n(parcel, 2, this.zzb);
        JM0.e(parcel, 3, this.zzc, false);
        JM0.k(parcel, 4, this.zzd);
        JM0.s(parcel, 5, this.zze, false);
        JM0.c(parcel, 6, this.zzf);
        JM0.k(parcel, 7, this.zzg);
        JM0.c(parcel, 8, this.zzh);
        JM0.q(parcel, 9, this.zzi, false);
        JM0.p(parcel, 10, this.zzj, i, false);
        JM0.p(parcel, 11, this.zzk, i, false);
        JM0.q(parcel, 12, this.zzl, false);
        JM0.e(parcel, 13, this.zzm, false);
        JM0.e(parcel, 14, this.zzn, false);
        JM0.s(parcel, 15, this.zzo, false);
        JM0.q(parcel, 16, this.zzp, false);
        JM0.q(parcel, 17, this.zzq, false);
        JM0.c(parcel, 18, this.zzr);
        JM0.p(parcel, 19, this.zzs, i, false);
        JM0.k(parcel, 20, this.zzt);
        JM0.q(parcel, 21, this.zzu, false);
        JM0.s(parcel, 22, this.zzv, false);
        JM0.k(parcel, 23, this.zzw);
        JM0.q(parcel, 24, this.zzx, false);
        JM0.k(parcel, 25, this.zzy);
        JM0.b(parcel, iA);
    }
}
