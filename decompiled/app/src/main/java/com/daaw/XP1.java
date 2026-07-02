package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.internal.ads.zzbwd;

/* JADX INFO: loaded from: classes3.dex */
public abstract class XP1 extends AbstractBinderC6674mz1 implements YP1 {
    public XP1() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzbwd zzbwdVar = (zzbwd) AbstractC6953nz1.a(parcel, zzbwd.CREATOR);
            AbstractC6953nz1.c(parcel);
            C1(zzbwdVar);
            parcel2.writeNoException();
        } else if (i != 2) {
            InterfaceC5109hQ1 c4551fQ1 = null;
            WP1 wp1 = null;
            if (i == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    c4551fQ1 = iInterfaceQueryLocalInterface instanceof InterfaceC5109hQ1 ? (InterfaceC5109hQ1) iInterfaceQueryLocalInterface : new C4551fQ1(strongBinder);
                }
                AbstractC6953nz1.c(parcel);
                z0(c4551fQ1);
                parcel2.writeNoException();
            } else if (i != 34) {
                switch (i) {
                    case 5:
                        boolean zZzs = zzs();
                        parcel2.writeNoException();
                        ClassLoader classLoader = AbstractC6953nz1.a;
                        parcel2.writeInt(zZzs ? 1 : 0);
                        break;
                    case 6:
                        zzh();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzj();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zze();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                        AbstractC6953nz1.c(parcel);
                        zzi(interfaceC7934rXG);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        InterfaceC7934rX interfaceC7934rXG2 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                        AbstractC6953nz1.c(parcel);
                        zzk(interfaceC7934rXG2);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        InterfaceC7934rX interfaceC7934rXG3 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                        AbstractC6953nz1.c(parcel);
                        E(interfaceC7934rXG3);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String strZzd = zzd();
                        parcel2.writeNoException();
                        parcel2.writeString(strZzd);
                        break;
                    case 13:
                        String string = parcel.readString();
                        AbstractC6953nz1.c(parcel);
                        m(string);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        zzby zzbyVarZzb = zzbx.zzb(parcel.readStrongBinder());
                        AbstractC6953nz1.c(parcel);
                        q2(zzbyVarZzb);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle bundleZzb = zzb();
                        parcel2.writeNoException();
                        AbstractC6953nz1.e(parcel2, bundleZzb);
                        break;
                    case 16:
                        IBinder strongBinder2 = parcel.readStrongBinder();
                        if (strongBinder2 != null) {
                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            wp1 = iInterfaceQueryLocalInterface2 instanceof WP1 ? (WP1) iInterfaceQueryLocalInterface2 : new WP1(strongBinder2);
                        }
                        AbstractC6953nz1.c(parcel);
                        m1(wp1);
                        parcel2.writeNoException();
                        break;
                    case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        parcel.readString();
                        AbstractC6953nz1.c(parcel);
                        parcel2.writeNoException();
                        break;
                    case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        InterfaceC7934rX interfaceC7934rXG4 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                        AbstractC6953nz1.c(parcel);
                        s(interfaceC7934rXG4);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String string2 = parcel.readString();
                        AbstractC6953nz1.c(parcel);
                        i1(string2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zZzt = zzt();
                        parcel2.writeNoException();
                        ClassLoader classLoader2 = AbstractC6953nz1.a;
                        parcel2.writeInt(zZzt ? 1 : 0);
                        break;
                    case 21:
                        zzdn zzdnVarZzc = zzc();
                        parcel2.writeNoException();
                        AbstractC6953nz1.f(parcel2, zzdnVarZzc);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zG = AbstractC6953nz1.g(parcel);
                AbstractC6953nz1.c(parcel);
                r(zG);
                parcel2.writeNoException();
            }
        } else {
            zzq();
            parcel2.writeNoException();
        }
        return true;
    }
}
