package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class KG1 extends AbstractBinderC6674mz1 implements LG1 {
    public KG1() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                InterfaceC7934rX interfaceC7934rXZzh = zzh();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC7934rXZzh);
                return true;
            case 3:
                String strZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 4:
                List listZzo = zzo();
                parcel2.writeNoException();
                parcel2.writeList(listZzo);
                return true;
            case 5:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 6:
                InterfaceC8147sG1 interfaceC8147sG1Zzf = zzf();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC8147sG1Zzf);
                return true;
            case 7:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 8:
                double dZzb = zzb();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzb);
                return true;
            case 9:
                String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 10:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 11:
                Bundle bundleZzc = zzc();
                parcel2.writeNoException();
                AbstractC6953nz1.e(parcel2, bundleZzc);
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                zzdq zzdqVarZzd = zzd();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzdqVarZzd);
                return true;
            case 14:
                Bundle bundle = (Bundle) AbstractC6953nz1.a(parcel, Bundle.CREATOR);
                AbstractC6953nz1.c(parcel);
                u(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) AbstractC6953nz1.a(parcel, Bundle.CREATOR);
                AbstractC6953nz1.c(parcel);
                boolean zZzs = zzs(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzs ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) AbstractC6953nz1.a(parcel, Bundle.CREATOR);
                AbstractC6953nz1.c(parcel);
                F(bundle3);
                parcel2.writeNoException();
                return true;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                InterfaceC5907kG1 interfaceC5907kG1Zze = zze();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC5907kG1Zze);
                return true;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                InterfaceC7934rX interfaceC7934rXZzg = zzg();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC7934rXZzg);
                return true;
            case 19:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            default:
                return false;
        }
    }
}
