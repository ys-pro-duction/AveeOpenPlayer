package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzcr;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.wH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC9274wH1 extends AbstractBinderC6674mz1 implements InterfaceC9553xH1 {
    public AbstractBinderC9274wH1() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC8709uH1 c8151sH1;
        switch (i) {
            case 2:
                String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 3:
                List listZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeList(listZzu);
                return true;
            case 4:
                String strZzo = zzo();
                parcel2.writeNoException();
                parcel2.writeString(strZzo);
                return true;
            case 5:
                InterfaceC8147sG1 interfaceC8147sG1Zzk = zzk();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC8147sG1Zzk);
                return true;
            case 6:
                String strZzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(strZzp);
                return true;
            case 7:
                String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 8:
                double dZze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(dZze);
                return true;
            case 9:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 10:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 11:
                zzdq zzdqVarZzh = zzh();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzdqVarZzh);
                return true;
            case 12:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 13:
                zzx();
                parcel2.writeNoException();
                return true;
            case 14:
                InterfaceC5907kG1 interfaceC5907kG1Zzi = zzi();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC5907kG1Zzi);
                return true;
            case 15:
                Bundle bundle = (Bundle) AbstractC6953nz1.a(parcel, Bundle.CREATOR);
                AbstractC6953nz1.c(parcel);
                S2(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) AbstractC6953nz1.a(parcel, Bundle.CREATOR);
                AbstractC6953nz1.c(parcel);
                boolean zR1 = R1(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zR1 ? 1 : 0);
                return true;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                Bundle bundle3 = (Bundle) AbstractC6953nz1.a(parcel, Bundle.CREATOR);
                AbstractC6953nz1.c(parcel);
                T0(bundle3);
                parcel2.writeNoException();
                return true;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                InterfaceC7934rX interfaceC7934rXZzm = zzm();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC7934rXZzm);
                return true;
            case 19:
                InterfaceC7934rX interfaceC7934rXZzl = zzl();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC7934rXZzl);
                return true;
            case 20:
                Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                AbstractC6953nz1.e(parcel2, bundleZzf);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c8151sH1 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    c8151sH1 = iInterfaceQueryLocalInterface instanceof InterfaceC8709uH1 ? (InterfaceC8709uH1) iInterfaceQueryLocalInterface : new C8151sH1(strongBinder);
                }
                AbstractC6953nz1.c(parcel);
                x2(c8151sH1);
                parcel2.writeNoException();
                return true;
            case 22:
                d();
                parcel2.writeNoException();
                return true;
            case 23:
                List listZzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(listZzv);
                return true;
            case 24:
                boolean zZzH = zzH();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC6953nz1.a;
                parcel2.writeInt(zZzH ? 1 : 0);
                return true;
            case 25:
                zzcw zzcwVarZzb = zzcv.zzb(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                q0(zzcwVarZzb);
                parcel2.writeNoException();
                return true;
            case 26:
                zzcs zzcsVarZzb = zzcr.zzb(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                A1(zzcsVarZzb);
                parcel2.writeNoException();
                return true;
            case 27:
                D();
                parcel2.writeNoException();
                return true;
            case 28:
                zzA();
                parcel2.writeNoException();
                return true;
            case 29:
                InterfaceC7311pG1 interfaceC7311pG1Zzj = zzj();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC7311pG1Zzj);
                return true;
            case 30:
                boolean zJ = j();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC6953nz1.a;
                parcel2.writeInt(zJ ? 1 : 0);
                return true;
            case 31:
                zzdn zzdnVarZzg = zzg();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzdnVarZzg);
                return true;
            case 32:
                zzdg zzdgVarZzb = zzdf.zzb(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                E0(zzdgVarZzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
