package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.AbstractBinderC3669cH1;
import com.daaw.AbstractBinderC4794gH1;
import com.daaw.AbstractBinderC6490mK1;
import com.daaw.AbstractBinderC6674mz1;
import com.daaw.AbstractBinderC6757nH1;
import com.daaw.AbstractC6953nz1;
import com.daaw.InterfaceC3112aH1;
import com.daaw.InterfaceC3948dH1;
import com.daaw.InterfaceC5073hH1;
import com.daaw.InterfaceC6769nK1;
import com.daaw.InterfaceC7036oH1;
import com.daaw.TG1;
import com.daaw.UG1;
import com.daaw.WG1;
import com.daaw.XG1;
import com.daaw.ZG1;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbls;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbp extends AbstractBinderC6674mz1 implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzbh zzbfVar = null;
        zzcf zzcfVar = null;
        switch (i) {
            case 1:
                zzbn zzbnVarZze = zze();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzbnVarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(strongBinder);
                }
                AbstractC6953nz1.c(parcel);
                zzl(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 3:
                UG1 ug1Z2 = TG1.Z2(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzf(ug1Z2);
                parcel2.writeNoException();
                return true;
            case 4:
                XG1 xg1Z2 = WG1.Z2(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzg(xg1Z2);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                InterfaceC3948dH1 interfaceC3948dH1Z2 = AbstractBinderC3669cH1.Z2(parcel.readStrongBinder());
                InterfaceC3112aH1 interfaceC3112aH1Z2 = ZG1.Z2(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzh(string, interfaceC3948dH1Z2, interfaceC3112aH1Z2);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbfc zzbfcVar = (zzbfc) AbstractC6953nz1.a(parcel, zzbfc.CREATOR);
                AbstractC6953nz1.c(parcel);
                zzo(zzbfcVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcfVar = iInterfaceQueryLocalInterface2 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface2 : new zzcf(strongBinder2);
                }
                AbstractC6953nz1.c(parcel);
                zzq(zzcfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                InterfaceC5073hH1 interfaceC5073hH1Z2 = AbstractBinderC4794gH1.Z2(parcel.readStrongBinder());
                zzq zzqVar = (zzq) AbstractC6953nz1.a(parcel, zzq.CREATOR);
                AbstractC6953nz1.c(parcel);
                zzj(interfaceC5073hH1Z2, zzqVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) AbstractC6953nz1.a(parcel, PublisherAdViewOptions.CREATOR);
                AbstractC6953nz1.c(parcel);
                zzp(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                InterfaceC7036oH1 interfaceC7036oH1Z2 = AbstractBinderC6757nH1.Z2(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzk(interfaceC7036oH1Z2);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbls zzblsVar = (zzbls) AbstractC6953nz1.a(parcel, zzbls.CREATOR);
                AbstractC6953nz1.c(parcel);
                zzn(zzblsVar);
                parcel2.writeNoException();
                return true;
            case 14:
                InterfaceC6769nK1 interfaceC6769nK1Z2 = AbstractBinderC6490mK1.Z2(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzi(interfaceC6769nK1Z2);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) AbstractC6953nz1.a(parcel, AdManagerAdViewOptions.CREATOR);
                AbstractC6953nz1.c(parcel);
                zzm(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
