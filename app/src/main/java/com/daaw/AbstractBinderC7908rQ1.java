package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;
import com.google.android.gms.ads.internal.client.zzdc;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzbxd;

/* JADX INFO: renamed from: com.daaw.rQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC7908rQ1 extends AbstractBinderC6674mz1 implements InterfaceC8187sQ1 {
    public AbstractBinderC7908rQ1() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static InterfaceC8187sQ1 zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8187sQ1 ? (InterfaceC8187sQ1) iInterfaceQueryLocalInterface : new C7630qQ1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC10147zQ1 c9589xQ1 = null;
        InterfaceC10147zQ1 c9589xQ12 = null;
        AQ1 aq1 = null;
        InterfaceC9031vQ1 c8466tQ1 = null;
        switch (i) {
            case 1:
                zzl zzlVar = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    c9589xQ1 = iInterfaceQueryLocalInterface instanceof InterfaceC10147zQ1 ? (InterfaceC10147zQ1) iInterfaceQueryLocalInterface : new C9589xQ1(strongBinder);
                }
                AbstractC6953nz1.c(parcel);
                zzf(zzlVar, c9589xQ1);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    c8466tQ1 = iInterfaceQueryLocalInterface2 instanceof InterfaceC9031vQ1 ? (InterfaceC9031vQ1) iInterfaceQueryLocalInterface2 : new C8466tQ1(strongBinder2);
                }
                AbstractC6953nz1.c(parcel);
                zzk(c8466tQ1);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC6953nz1.a;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 4:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 5:
                InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzm(interfaceC7934rXG);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    aq1 = iInterfaceQueryLocalInterface3 instanceof AQ1 ? (AQ1) iInterfaceQueryLocalInterface3 : new AQ1(strongBinder3);
                }
                AbstractC6953nz1.c(parcel);
                zzp(aq1);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbxd zzbxdVar = (zzbxd) AbstractC6953nz1.a(parcel, zzbxd.CREATOR);
                AbstractC6953nz1.c(parcel);
                zzl(zzbxdVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzdd zzddVarZzb = zzdc.zzb(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzi(zzddVarZzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                AbstractC6953nz1.e(parcel2, bundleZzb);
                return true;
            case 10:
                InterfaceC7934rX interfaceC7934rXG2 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                boolean zG = AbstractC6953nz1.g(parcel);
                AbstractC6953nz1.c(parcel);
                zzn(interfaceC7934rXG2, zG);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC7351pQ1 interfaceC7351pQ1Zzd = zzd();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC7351pQ1Zzd);
                return true;
            case 12:
                zzdn zzdnVarZzc = zzc();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzdnVarZzc);
                return true;
            case 13:
                zzdg zzdgVarZzb = zzdf.zzb(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzj(zzdgVarZzb);
                parcel2.writeNoException();
                return true;
            case 14:
                zzl zzlVar2 = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    c9589xQ12 = iInterfaceQueryLocalInterface4 instanceof InterfaceC10147zQ1 ? (InterfaceC10147zQ1) iInterfaceQueryLocalInterface4 : new C9589xQ1(strongBinder4);
                }
                AbstractC6953nz1.c(parcel);
                zzg(zzlVar2, c9589xQ12);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zG2 = AbstractC6953nz1.g(parcel);
                AbstractC6953nz1.c(parcel);
                zzh(zG2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
