package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.AbstractBinderC6674mz1;
import com.daaw.AbstractC6953nz1;
import com.daaw.C6564mc1;
import com.daaw.InterfaceC7934rX;
import com.daaw.RL1;
import com.daaw.SL1;
import com.daaw.XJ1;
import com.daaw.YJ1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcn extends AbstractBinderC6674mz1 implements zzco {
    public zzcn() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzda zzcyVar;
        switch (i) {
            case 1:
                zzk();
                parcel2.writeNoException();
                return true;
            case 2:
                float f = parcel.readFloat();
                AbstractC6953nz1.c(parcel);
                zzq(f);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                AbstractC6953nz1.c(parcel);
                zzr(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zG = AbstractC6953nz1.g(parcel);
                AbstractC6953nz1.c(parcel);
                zzp(zG);
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                String string2 = parcel.readString();
                AbstractC6953nz1.c(parcel);
                zzn(interfaceC7934rXG, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                InterfaceC7934rX interfaceC7934rXG2 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzl(string3, interfaceC7934rXG2);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 8:
                boolean zZzv = zzv();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC6953nz1.a;
                parcel2.writeInt(zZzv ? 1 : 0);
                return true;
            case 9:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 10:
                String string4 = parcel.readString();
                AbstractC6953nz1.c(parcel);
                zzh(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                SL1 sl1Z2 = RL1.Z2(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzo(sl1Z2);
                parcel2.writeNoException();
                return true;
            case 12:
                YJ1 yj1Z2 = XJ1.Z2(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzs(yj1Z2);
                parcel2.writeNoException();
                return true;
            case 13:
                List listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case 14:
                zzff zzffVar = (zzff) AbstractC6953nz1.a(parcel, zzff.CREATOR);
                AbstractC6953nz1.c(parcel);
                zzu(zzffVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzi();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzcyVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzcyVar = iInterfaceQueryLocalInterface instanceof zzda ? (zzda) iInterfaceQueryLocalInterface : new zzcy(strongBinder);
                }
                AbstractC6953nz1.c(parcel);
                zzm(zzcyVar);
                parcel2.writeNoException();
                return true;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                boolean zG2 = AbstractC6953nz1.g(parcel);
                AbstractC6953nz1.c(parcel);
                zzj(zG2);
                parcel2.writeNoException();
                return true;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                String string5 = parcel.readString();
                AbstractC6953nz1.c(parcel);
                zzt(string5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
