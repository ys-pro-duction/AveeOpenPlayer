package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC9820yE1;
import com.daaw.BinderC7744qp0;
import com.daaw.C4184e72;
import com.daaw.InterfaceC1974Qb2;
import com.daaw.InterfaceC3697cO1;
import com.daaw.InterfaceC7934rX;
import com.daaw.InterfaceC9334wW1;
import com.daaw.JM0;
import com.daaw.LH1;
import com.daaw.TH1;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: loaded from: classes.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzn();
    public final zzc zza;
    public final com.google.android.gms.ads.internal.client.zza zzb;
    public final zzo zzc;
    public final InterfaceC9334wW1 zzd;
    public final TH1 zze;
    public final String zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzz zzi;
    public final int zzj;
    public final int zzk;
    public final String zzl;
    public final zzcaz zzm;
    public final String zzn;
    public final com.google.android.gms.ads.internal.zzj zzo;
    public final LH1 zzp;
    public final String zzq;
    public final String zzr;
    public final String zzs;
    public final C4184e72 zzt;
    public final InterfaceC1974Qb2 zzu;
    public final InterfaceC3697cO1 zzv;
    public final boolean zzw;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, LH1 lh1, TH1 th1, zzz zzzVar, InterfaceC9334wW1 interfaceC9334wW1, boolean z, int i, String str, zzcaz zzcazVar, InterfaceC1974Qb2 interfaceC1974Qb2, InterfaceC3697cO1 interfaceC3697cO1, boolean z2) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = interfaceC9334wW1;
        this.zzp = lh1;
        this.zze = th1;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzzVar;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = zzcazVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = interfaceC1974Qb2;
        this.zzv = interfaceC3697cO1;
        this.zzw = z2;
    }

    public static AdOverlayInfoParcel zza(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzc zzcVar = this.zza;
        int iA = JM0.a(parcel);
        JM0.p(parcel, 2, zzcVar, i, false);
        JM0.j(parcel, 3, BinderC7744qp0.Z2(this.zzb).asBinder(), false);
        JM0.j(parcel, 4, BinderC7744qp0.Z2(this.zzc).asBinder(), false);
        JM0.j(parcel, 5, BinderC7744qp0.Z2(this.zzd).asBinder(), false);
        JM0.j(parcel, 6, BinderC7744qp0.Z2(this.zze).asBinder(), false);
        JM0.q(parcel, 7, this.zzf, false);
        JM0.c(parcel, 8, this.zzg);
        JM0.q(parcel, 9, this.zzh, false);
        JM0.j(parcel, 10, BinderC7744qp0.Z2(this.zzi).asBinder(), false);
        JM0.k(parcel, 11, this.zzj);
        JM0.k(parcel, 12, this.zzk);
        JM0.q(parcel, 13, this.zzl, false);
        JM0.p(parcel, 14, this.zzm, i, false);
        JM0.q(parcel, 16, this.zzn, false);
        JM0.p(parcel, 17, this.zzo, i, false);
        JM0.j(parcel, 18, BinderC7744qp0.Z2(this.zzp).asBinder(), false);
        JM0.q(parcel, 19, this.zzq, false);
        JM0.q(parcel, 24, this.zzr, false);
        JM0.q(parcel, 25, this.zzs, false);
        JM0.j(parcel, 26, BinderC7744qp0.Z2(this.zzt).asBinder(), false);
        JM0.j(parcel, 27, BinderC7744qp0.Z2(this.zzu).asBinder(), false);
        JM0.j(parcel, 28, BinderC7744qp0.Z2(this.zzv).asBinder(), false);
        JM0.c(parcel, 29, this.zzw);
        JM0.b(parcel, iA);
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, LH1 lh1, TH1 th1, zzz zzzVar, InterfaceC9334wW1 interfaceC9334wW1, boolean z, int i, String str, String str2, zzcaz zzcazVar, InterfaceC1974Qb2 interfaceC1974Qb2, InterfaceC3697cO1 interfaceC3697cO1) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = interfaceC9334wW1;
        this.zzp = lh1;
        this.zze = th1;
        this.zzf = str2;
        this.zzg = z;
        this.zzh = str;
        this.zzi = zzzVar;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = zzcazVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = interfaceC1974Qb2;
        this.zzv = interfaceC3697cO1;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzz zzzVar, InterfaceC9334wW1 interfaceC9334wW1, int i, zzcaz zzcazVar, String str, com.google.android.gms.ads.internal.zzj zzjVar, String str2, String str3, String str4, C4184e72 c4184e72, InterfaceC3697cO1 interfaceC3697cO1) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzoVar;
        this.zzd = interfaceC9334wW1;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.H0)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = zzcazVar;
        this.zzn = str;
        this.zzo = zzjVar;
        this.zzq = null;
        this.zzr = null;
        this.zzs = str4;
        this.zzt = c4184e72;
        this.zzu = null;
        this.zzv = interfaceC3697cO1;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzz zzzVar, InterfaceC9334wW1 interfaceC9334wW1, boolean z, int i, zzcaz zzcazVar, InterfaceC1974Qb2 interfaceC1974Qb2, InterfaceC3697cO1 interfaceC3697cO1) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = interfaceC9334wW1;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzzVar;
        this.zzj = i;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = zzcazVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = interfaceC1974Qb2;
        this.zzv = interfaceC3697cO1;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(zzc zzcVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, zzcaz zzcazVar, String str4, com.google.android.gms.ads.internal.zzj zzjVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z2) {
        this.zza = zzcVar;
        this.zzb = (com.google.android.gms.ads.internal.client.zza) BinderC7744qp0.I(InterfaceC7934rX.a.G(iBinder));
        this.zzc = (zzo) BinderC7744qp0.I(InterfaceC7934rX.a.G(iBinder2));
        this.zzd = (InterfaceC9334wW1) BinderC7744qp0.I(InterfaceC7934rX.a.G(iBinder3));
        this.zzp = (LH1) BinderC7744qp0.I(InterfaceC7934rX.a.G(iBinder6));
        this.zze = (TH1) BinderC7744qp0.I(InterfaceC7934rX.a.G(iBinder4));
        this.zzf = str;
        this.zzg = z;
        this.zzh = str2;
        this.zzi = (zzz) BinderC7744qp0.I(InterfaceC7934rX.a.G(iBinder5));
        this.zzj = i;
        this.zzk = i2;
        this.zzl = str3;
        this.zzm = zzcazVar;
        this.zzn = str4;
        this.zzo = zzjVar;
        this.zzq = str5;
        this.zzr = str6;
        this.zzs = str7;
        this.zzt = (C4184e72) BinderC7744qp0.I(InterfaceC7934rX.a.G(iBinder7));
        this.zzu = (InterfaceC1974Qb2) BinderC7744qp0.I(InterfaceC7934rX.a.G(iBinder8));
        this.zzv = (InterfaceC3697cO1) BinderC7744qp0.I(InterfaceC7934rX.a.G(iBinder9));
        this.zzw = z2;
    }

    public AdOverlayInfoParcel(zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzz zzzVar, zzcaz zzcazVar, InterfaceC9334wW1 interfaceC9334wW1, InterfaceC1974Qb2 interfaceC1974Qb2) {
        this.zza = zzcVar;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = interfaceC9334wW1;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzzVar;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = zzcazVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = interfaceC1974Qb2;
        this.zzv = null;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(zzo zzoVar, InterfaceC9334wW1 interfaceC9334wW1, int i, zzcaz zzcazVar) {
        this.zzc = zzoVar;
        this.zzd = interfaceC9334wW1;
        this.zzj = 1;
        this.zzm = zzcazVar;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(InterfaceC9334wW1 interfaceC9334wW1, zzcaz zzcazVar, String str, String str2, int i, InterfaceC3697cO1 interfaceC3697cO1) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = interfaceC9334wW1;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = zzcazVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = str2;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = interfaceC3697cO1;
        this.zzw = false;
    }
}
