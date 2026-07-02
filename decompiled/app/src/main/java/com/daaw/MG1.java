package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MG1 extends AbstractBinderC6674mz1 implements NG1 {
    public MG1() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                InterfaceC7934rX interfaceC7934rXZzg = zzg();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC7934rXZzg);
                return true;
            case 3:
                String strZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 4:
                List listZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeList(listZzm);
                return true;
            case 5:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 6:
                InterfaceC8147sG1 interfaceC8147sG1Zze = zze();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC8147sG1Zze);
                return true;
            case 7:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 8:
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                AbstractC6953nz1.e(parcel2, bundleZzb);
                return true;
            case 10:
                zzn();
                parcel2.writeNoException();
                return true;
            case 11:
                zzdq zzdqVarZzc = zzc();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzdqVarZzc);
                return true;
            case 12:
                Bundle bundle = (Bundle) AbstractC6953nz1.a(parcel, Bundle.CREATOR);
                AbstractC6953nz1.c(parcel);
                w0(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) AbstractC6953nz1.a(parcel, Bundle.CREATOR);
                AbstractC6953nz1.c(parcel);
                boolean zU = u(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zU ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) AbstractC6953nz1.a(parcel, Bundle.CREATOR);
                AbstractC6953nz1.c(parcel);
                q(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                InterfaceC5907kG1 interfaceC5907kG1Zzd = zzd();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC5907kG1Zzd);
                return true;
            case 16:
                InterfaceC7934rX interfaceC7934rXZzf = zzf();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC7934rXZzf);
                return true;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            default:
                return false;
        }
    }
}
