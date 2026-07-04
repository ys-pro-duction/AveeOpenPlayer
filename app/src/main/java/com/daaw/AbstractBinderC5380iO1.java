package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;

/* JADX INFO: renamed from: com.daaw.iO1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC5380iO1 extends AbstractBinderC6674mz1 implements InterfaceC5660jO1 {
    public AbstractBinderC5380iO1() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static InterfaceC5660jO1 zzI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5660jO1 ? (InterfaceC5660jO1) iInterfaceQueryLocalInterface : new C5101hO1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) AbstractC6953nz1.a(parcel, Bundle.CREATOR);
                AbstractC6953nz1.c(parcel);
                zzl(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                zzt();
                parcel2.writeNoException();
                return true;
            case 4:
                zzr();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) AbstractC6953nz1.a(parcel, Bundle.CREATOR);
                AbstractC6953nz1.c(parcel);
                zzs(bundle2);
                parcel2.writeNoException();
                AbstractC6953nz1.e(parcel2, bundle2);
                return true;
            case 7:
                zzu();
                parcel2.writeNoException();
                return true;
            case 8:
                zzm();
                parcel2.writeNoException();
                return true;
            case 9:
                zzx();
                parcel2.writeNoException();
                return true;
            case 10:
                zzi();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zZzH = zzH();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC6953nz1.a;
                parcel2.writeInt(zZzH ? 1 : 0);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                AbstractC6953nz1.c(parcel);
                parcel2.writeNoException();
                return true;
            case 13:
                InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzk(interfaceC7934rXG);
                parcel2.writeNoException();
                return true;
            case 14:
                zzv();
                parcel2.writeNoException();
                return true;
            case 15:
                int i3 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                AbstractC6953nz1.c(parcel);
                zzp(i3, strArrCreateStringArray, iArrCreateIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
