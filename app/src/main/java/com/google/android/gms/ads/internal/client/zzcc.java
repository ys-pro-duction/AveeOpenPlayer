package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.AbstractBinderC3419bO1;
import com.daaw.AbstractBinderC5380iO1;
import com.daaw.AbstractBinderC7908rQ1;
import com.daaw.AbstractBinderC8438tJ1;
import com.daaw.AbstractBinderC8991vG1;
import com.daaw.AbstractC6395lz1;
import com.daaw.AbstractC6953nz1;
import com.daaw.BG1;
import com.daaw.CG1;
import com.daaw.InterfaceC3156aS1;
import com.daaw.InterfaceC3697cO1;
import com.daaw.InterfaceC5660jO1;
import com.daaw.InterfaceC7880rJ1;
import com.daaw.InterfaceC7934rX;
import com.daaw.InterfaceC8187sQ1;
import com.daaw.InterfaceC8717uJ1;
import com.daaw.InterfaceC9270wG1;
import com.daaw.SL1;
import com.daaw.YP1;
import com.daaw.ZR1;

/* JADX INFO: loaded from: classes.dex */
public final class zzcc extends AbstractC6395lz1 implements zzce {
    public zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(InterfaceC7934rX interfaceC7934rX, String str, SL1 sl1, int i) {
        zzbq zzboVar;
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        parcelB.writeString(str);
        AbstractC6953nz1.f(parcelB, sl1);
        parcelB.writeInt(233702000);
        Parcel parcelG = G(3, parcelB);
        IBinder strongBinder = parcelG.readStrongBinder();
        if (strongBinder == null) {
            zzboVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzboVar = iInterfaceQueryLocalInterface instanceof zzbq ? (zzbq) iInterfaceQueryLocalInterface : new zzbo(strongBinder);
        }
        parcelG.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(InterfaceC7934rX interfaceC7934rX, zzq zzqVar, String str, SL1 sl1, int i) {
        zzbu zzbsVar;
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.d(parcelB, zzqVar);
        parcelB.writeString(str);
        AbstractC6953nz1.f(parcelB, sl1);
        parcelB.writeInt(233702000);
        Parcel parcelG = G(13, parcelB);
        IBinder strongBinder = parcelG.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelG.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(InterfaceC7934rX interfaceC7934rX, zzq zzqVar, String str, SL1 sl1, int i) {
        zzbu zzbsVar;
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.d(parcelB, zzqVar);
        parcelB.writeString(str);
        AbstractC6953nz1.f(parcelB, sl1);
        parcelB.writeInt(233702000);
        Parcel parcelG = G(1, parcelB);
        IBinder strongBinder = parcelG.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelG.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(InterfaceC7934rX interfaceC7934rX, zzq zzqVar, String str, SL1 sl1, int i) {
        zzbu zzbsVar;
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.d(parcelB, zzqVar);
        parcelB.writeString(str);
        AbstractC6953nz1.f(parcelB, sl1);
        parcelB.writeInt(233702000);
        Parcel parcelG = G(2, parcelB);
        IBinder strongBinder = parcelG.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelG.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(InterfaceC7934rX interfaceC7934rX, zzq zzqVar, String str, int i) {
        zzbu zzbsVar;
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.d(parcelB, zzqVar);
        parcelB.writeString(str);
        parcelB.writeInt(233702000);
        Parcel parcelG = G(10, parcelB);
        IBinder strongBinder = parcelG.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelG.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(InterfaceC7934rX interfaceC7934rX, int i) {
        zzco zzcmVar;
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        parcelB.writeInt(233702000);
        Parcel parcelG = G(9, parcelB);
        IBinder strongBinder = parcelG.readStrongBinder();
        if (strongBinder == null) {
            zzcmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcmVar = iInterfaceQueryLocalInterface instanceof zzco ? (zzco) iInterfaceQueryLocalInterface : new zzcm(strongBinder);
        }
        parcelG.recycle();
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(InterfaceC7934rX interfaceC7934rX, SL1 sl1, int i) {
        zzdj zzdhVar;
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.f(parcelB, sl1);
        parcelB.writeInt(233702000);
        Parcel parcelG = G(17, parcelB);
        IBinder strongBinder = parcelG.readStrongBinder();
        if (strongBinder == null) {
            zzdhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdhVar = iInterfaceQueryLocalInterface instanceof zzdj ? (zzdj) iInterfaceQueryLocalInterface : new zzdh(strongBinder);
        }
        parcelG.recycle();
        return zzdhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final InterfaceC9270wG1 zzi(InterfaceC7934rX interfaceC7934rX, InterfaceC7934rX interfaceC7934rX2) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.f(parcelB, interfaceC7934rX2);
        Parcel parcelG = G(5, parcelB);
        InterfaceC9270wG1 interfaceC9270wG1ZzbE = AbstractBinderC8991vG1.zzbE(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC9270wG1ZzbE;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final CG1 zzj(InterfaceC7934rX interfaceC7934rX, InterfaceC7934rX interfaceC7934rX2, InterfaceC7934rX interfaceC7934rX3) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.f(parcelB, interfaceC7934rX2);
        AbstractC6953nz1.f(parcelB, interfaceC7934rX3);
        Parcel parcelG = G(11, parcelB);
        CG1 cg1Zze = BG1.zze(parcelG.readStrongBinder());
        parcelG.recycle();
        return cg1Zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final InterfaceC8717uJ1 zzk(InterfaceC7934rX interfaceC7934rX, SL1 sl1, int i, InterfaceC7880rJ1 interfaceC7880rJ1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.f(parcelB, sl1);
        parcelB.writeInt(233702000);
        AbstractC6953nz1.f(parcelB, interfaceC7880rJ1);
        Parcel parcelG = G(16, parcelB);
        InterfaceC8717uJ1 interfaceC8717uJ1Z2 = AbstractBinderC8438tJ1.Z2(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC8717uJ1Z2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final InterfaceC3697cO1 zzl(InterfaceC7934rX interfaceC7934rX, SL1 sl1, int i) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.f(parcelB, sl1);
        parcelB.writeInt(233702000);
        Parcel parcelG = G(15, parcelB);
        InterfaceC3697cO1 interfaceC3697cO1Z2 = AbstractBinderC3419bO1.Z2(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC3697cO1Z2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final InterfaceC5660jO1 zzm(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        Parcel parcelG = G(8, parcelB);
        InterfaceC5660jO1 interfaceC5660jO1ZzI = AbstractBinderC5380iO1.zzI(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC5660jO1ZzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final YP1 zzn(InterfaceC7934rX interfaceC7934rX, SL1 sl1, int i) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final InterfaceC8187sQ1 zzo(InterfaceC7934rX interfaceC7934rX, String str, SL1 sl1, int i) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        parcelB.writeString(str);
        AbstractC6953nz1.f(parcelB, sl1);
        parcelB.writeInt(233702000);
        Parcel parcelG = G(12, parcelB);
        InterfaceC8187sQ1 interfaceC8187sQ1Zzq = AbstractBinderC7908rQ1.zzq(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC8187sQ1Zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final InterfaceC3156aS1 zzp(InterfaceC7934rX interfaceC7934rX, SL1 sl1, int i) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.f(parcelB, sl1);
        parcelB.writeInt(233702000);
        Parcel parcelG = G(14, parcelB);
        InterfaceC3156aS1 interfaceC3156aS1Zzb = ZR1.zzb(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC3156aS1Zzb;
    }
}
