package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PG1 extends AbstractBinderC6674mz1 implements QG1 {
    public PG1() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static QG1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof QG1 ? (QG1) iInterfaceQueryLocalInterface : new OG1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                String string = parcel.readString();
                AbstractC6953nz1.c(parcel);
                String strU2 = u2(string);
                parcel2.writeNoException();
                parcel2.writeString(strU2);
                return true;
            case 2:
                String string2 = parcel.readString();
                AbstractC6953nz1.c(parcel);
                InterfaceC8147sG1 interfaceC8147sG1T = t(string2);
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC8147sG1T);
                return true;
            case 3:
                List<String> listZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzk);
                return true;
            case 4:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 5:
                String string3 = parcel.readString();
                AbstractC6953nz1.c(parcel);
                zzn(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                zzdq zzdqVarZze = zze();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzdqVarZze);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC7934rX interfaceC7934rXZzh = zzh();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC7934rXZzh);
                return true;
            case 10:
                InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                boolean z = z(interfaceC7934rXG);
                parcel2.writeNoException();
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, null);
                return true;
            case 12:
                boolean zZzq = zzq();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC6953nz1.a;
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 13:
                boolean zZzt = zzt();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC6953nz1.a;
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            case 14:
                InterfaceC7934rX interfaceC7934rXG2 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                a0(interfaceC7934rXG2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                InterfaceC7311pG1 interfaceC7311pG1Zzf = zzf();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC7311pG1Zzf);
                return true;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                InterfaceC7934rX interfaceC7934rXG3 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                boolean zS = s(interfaceC7934rXG3);
                parcel2.writeNoException();
                parcel2.writeInt(zS ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
