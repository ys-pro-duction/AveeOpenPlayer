package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AA1 extends AbstractBinderC6674mz1 implements BA1 {
    public AA1() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        IA1 ga1;
        switch (i) {
            case 2:
                zzbu zzbuVarZze = zze();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzbuVarZze);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (iInterfaceQueryLocalInterface instanceof FA1) {
                    }
                }
                AbstractC6953nz1.c(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    ga1 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    ga1 = iInterfaceQueryLocalInterface2 instanceof IA1 ? (IA1) iInterfaceQueryLocalInterface2 : new GA1(strongBinder2);
                }
                AbstractC6953nz1.c(parcel);
                l2(interfaceC7934rXG, ga1);
                parcel2.writeNoException();
                return true;
            case 5:
                zzdn zzdnVarZzf = zzf();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzdnVarZzf);
                return true;
            case 6:
                boolean zG = AbstractC6953nz1.g(parcel);
                AbstractC6953nz1.c(parcel);
                R2(zG);
                parcel2.writeNoException();
                return true;
            case 7:
                zzdg zzdgVarZzb = zzdf.zzb(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                S0(zzdgVarZzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
