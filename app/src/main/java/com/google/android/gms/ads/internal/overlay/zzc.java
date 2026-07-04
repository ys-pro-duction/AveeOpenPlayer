package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.BinderC7744qp0;
import com.daaw.InterfaceC7934rX;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzb();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final Intent zzh;
    public final zzx zzi;
    public final boolean zzj;

    public zzc(Intent intent, zzx zzxVar) {
        this(null, null, null, null, null, null, null, intent, BinderC7744qp0.Z2(zzxVar).asBinder(), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iA = JM0.a(parcel);
        JM0.q(parcel, 2, str, false);
        JM0.q(parcel, 3, this.zzb, false);
        JM0.q(parcel, 4, this.zzc, false);
        JM0.q(parcel, 5, this.zzd, false);
        JM0.q(parcel, 6, this.zze, false);
        JM0.q(parcel, 7, this.zzf, false);
        JM0.q(parcel, 8, this.zzg, false);
        JM0.p(parcel, 9, this.zzh, i, false);
        JM0.j(parcel, 10, BinderC7744qp0.Z2(this.zzi).asBinder(), false);
        JM0.c(parcel, 11, this.zzj);
        JM0.b(parcel, iA);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = intent;
        this.zzi = (zzx) BinderC7744qp0.I(InterfaceC7934rX.a.G(iBinder));
        this.zzj = z;
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, zzx zzxVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, BinderC7744qp0.Z2(zzxVar).asBinder(), false);
    }
}
