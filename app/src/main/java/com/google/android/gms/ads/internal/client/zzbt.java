package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.AO1;
import com.daaw.AbstractBinderC3104aF1;
import com.daaw.AbstractBinderC4830gQ1;
import com.daaw.AbstractBinderC6674mz1;
import com.daaw.AbstractBinderC9581xO1;
import com.daaw.AbstractC6953nz1;
import com.daaw.BO1;
import com.daaw.C6564mc1;
import com.daaw.DA1;
import com.daaw.EA1;
import com.daaw.InterfaceC3383bF1;
import com.daaw.InterfaceC5109hQ1;
import com.daaw.InterfaceC7934rX;
import com.daaw.InterfaceC9860yO1;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbt extends AbstractBinderC6674mz1 implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbu zzac(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzbh zzbfVar = null;
        zzci zzcgVar = null;
        zzbk zzbiVar = null;
        zzdg zzdeVar = null;
        zzby zzbwVar = null;
        zzcf zzcfVar = null;
        zzbe zzbcVar = null;
        zzcb zzbzVar = null;
        switch (i) {
            case 1:
                InterfaceC7934rX interfaceC7934rXZzn = zzn();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC7934rXZzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzZ = zzZ();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC6953nz1.a;
                parcel2.writeInt(zZzZ ? 1 : 0);
                return true;
            case 4:
                zzl zzlVar = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                AbstractC6953nz1.c(parcel);
                boolean zZzaa = zzaa(zzlVar);
                parcel2.writeNoException();
                parcel2.writeInt(zZzaa ? 1 : 0);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(strongBinder);
                }
                AbstractC6953nz1.c(parcel);
                zzD(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzbzVar = iInterfaceQueryLocalInterface2 instanceof zzcb ? (zzcb) iInterfaceQueryLocalInterface2 : new zzbz(strongBinder2);
                }
                AbstractC6953nz1.c(parcel);
                zzG(zzbzVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                zzq zzqVarZzg = zzg();
                parcel2.writeNoException();
                AbstractC6953nz1.e(parcel2, zzqVarZzg);
                return true;
            case 13:
                zzq zzqVar = (zzq) AbstractC6953nz1.a(parcel, zzq.CREATOR);
                AbstractC6953nz1.c(parcel);
                zzF(zzqVar);
                parcel2.writeNoException();
                return true;
            case 14:
                InterfaceC9860yO1 interfaceC9860yO1Z2 = AbstractBinderC9581xO1.Z2(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzM(interfaceC9860yO1Z2);
                parcel2.writeNoException();
                return true;
            case 15:
                BO1 bo1Z2 = AO1.Z2(parcel.readStrongBinder());
                String string = parcel.readString();
                AbstractC6953nz1.c(parcel);
                zzQ(bo1Z2, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case 27:
            case 28:
            default:
                return false;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 19:
                InterfaceC3383bF1 interfaceC3383bF1Z2 = AbstractBinderC3104aF1.Z2(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzO(interfaceC3383bF1Z2);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbcVar = iInterfaceQueryLocalInterface3 instanceof zzbe ? (zzbe) iInterfaceQueryLocalInterface3 : new zzbc(strongBinder3);
                }
                AbstractC6953nz1.c(parcel);
                zzC(zzbcVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcfVar = iInterfaceQueryLocalInterface4 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface4 : new zzcf(strongBinder4);
                }
                AbstractC6953nz1.c(parcel);
                zzab(zzcfVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zG = AbstractC6953nz1.g(parcel);
                AbstractC6953nz1.c(parcel);
                zzN(zG);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zZzY = zzY();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC6953nz1.a;
                parcel2.writeInt(zZzY ? 1 : 0);
                return true;
            case 24:
                InterfaceC5109hQ1 interfaceC5109hQ1Z2 = AbstractBinderC4830gQ1.Z2(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzS(interfaceC5109hQ1Z2);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                AbstractC6953nz1.c(parcel);
                zzT(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzdq zzdqVarZzl = zzl();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzdqVarZzl);
                return true;
            case 29:
                zzfl zzflVar = (zzfl) AbstractC6953nz1.a(parcel, zzfl.CREATOR);
                AbstractC6953nz1.c(parcel);
                zzU(zzflVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzdu zzduVar = (zzdu) AbstractC6953nz1.a(parcel, zzdu.CREATOR);
                AbstractC6953nz1.c(parcel);
                zzK(zzduVar);
                parcel2.writeNoException();
                return true;
            case 31:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 32:
                zzcb zzcbVarZzj = zzj();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzcbVarZzj);
                return true;
            case 33:
                zzbh zzbhVarZzi = zzi();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzbhVarZzi);
                return true;
            case 34:
                boolean zG2 = AbstractC6953nz1.g(parcel);
                AbstractC6953nz1.c(parcel);
                zzL(zG2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 36:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbwVar = iInterfaceQueryLocalInterface5 instanceof zzby ? (zzby) iInterfaceQueryLocalInterface5 : new zzbw(strongBinder5);
                }
                AbstractC6953nz1.c(parcel);
                zzE(zzbwVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzd = zzd();
                parcel2.writeNoException();
                AbstractC6953nz1.e(parcel2, bundleZzd);
                return true;
            case 38:
                String string3 = parcel.readString();
                AbstractC6953nz1.c(parcel);
                zzR(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzw zzwVar = (zzw) AbstractC6953nz1.a(parcel, zzw.CREATOR);
                AbstractC6953nz1.c(parcel);
                zzI(zzwVar);
                parcel2.writeNoException();
                return true;
            case 40:
                EA1 ea1Z2 = DA1.Z2(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzH(ea1Z2);
                parcel2.writeNoException();
                return true;
            case 41:
                zzdn zzdnVarZzk = zzk();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzdnVarZzk);
                return true;
            case 42:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdeVar = iInterfaceQueryLocalInterface6 instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface6 : new zzde(strongBinder6);
                }
                AbstractC6953nz1.c(parcel);
                zzP(zzdeVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzl zzlVar2 = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbiVar = iInterfaceQueryLocalInterface7 instanceof zzbk ? (zzbk) iInterfaceQueryLocalInterface7 : new zzbi(strongBinder7);
                }
                AbstractC6953nz1.c(parcel);
                zzy(zzlVar2, zzbiVar);
                parcel2.writeNoException();
                return true;
            case 44:
                InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzW(interfaceC7934rXG);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzcgVar = iInterfaceQueryLocalInterface8 instanceof zzci ? (zzci) iInterfaceQueryLocalInterface8 : new zzcg(strongBinder8);
                }
                AbstractC6953nz1.c(parcel);
                zzJ(zzcgVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
