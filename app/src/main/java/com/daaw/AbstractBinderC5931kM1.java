package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.kM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC5931kM1 extends AbstractBinderC6674mz1 implements InterfaceC6219lM1 {
    public AbstractBinderC5931kM1() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static InterfaceC6219lM1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6219lM1 ? (InterfaceC6219lM1) iInterfaceQueryLocalInterface : new C5652jM1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 3:
                List listZzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(listZzv);
                return true;
            case 4:
                String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 5:
                InterfaceC8147sG1 interfaceC8147sG1Zzl = zzl();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC8147sG1Zzl);
                return true;
            case 6:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 7:
                String strZzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(strZzp);
                return true;
            case 8:
                double dZze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(dZze);
                return true;
            case 9:
                String strZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(strZzu);
                return true;
            case 10:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 11:
                zzdq zzdqVarZzj = zzj();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzdqVarZzj);
                return true;
            case 12:
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, null);
                return true;
            case 13:
                InterfaceC7934rX interfaceC7934rXZzm = zzm();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC7934rXZzm);
                return true;
            case 14:
                InterfaceC7934rX interfaceC7934rXZzn = zzn();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC7934rXZzn);
                return true;
            case 15:
                InterfaceC7934rX interfaceC7934rXZzo = zzo();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC7934rXZzo);
                return true;
            case 16:
                Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                AbstractC6953nz1.e(parcel2, bundleZzi);
                return true;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                boolean zZzB = zzB();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC6953nz1.a;
                parcel2.writeInt(zZzB ? 1 : 0);
                return true;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC6953nz1.a;
                parcel2.writeInt(zZzA ? 1 : 0);
                return true;
            case 19:
                zzx();
                parcel2.writeNoException();
                return true;
            case 20:
                InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                k2(interfaceC7934rXG);
                parcel2.writeNoException();
                return true;
            case 21:
                InterfaceC7934rX interfaceC7934rXG2 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                InterfaceC7934rX interfaceC7934rXG3 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                InterfaceC7934rX interfaceC7934rXG4 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                Z1(interfaceC7934rXG2, interfaceC7934rXG3, interfaceC7934rXG4);
                parcel2.writeNoException();
                return true;
            case 22:
                InterfaceC7934rX interfaceC7934rXG5 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                j0(interfaceC7934rXG5);
                parcel2.writeNoException();
                return true;
            case 23:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 24:
                float fZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzh);
                return true;
            case 25:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            default:
                return false;
        }
    }
}
