package com.daaw;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbzo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ZR1 extends AbstractBinderC6674mz1 implements InterfaceC3156aS1 {
    public ZR1() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static InterfaceC3156aS1 zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3156aS1 ? (InterfaceC3156aS1) iInterfaceQueryLocalInterface : new YR1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        XR1 vr1 = null;
        switch (i) {
            case 1:
                InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                zzbzo zzbzoVar = (zzbzo) AbstractC6953nz1.a(parcel, zzbzo.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    vr1 = iInterfaceQueryLocalInterface instanceof XR1 ? (XR1) iInterfaceQueryLocalInterface : new VR1(strongBinder);
                }
                AbstractC6953nz1.c(parcel);
                zze(interfaceC7934rXG, zzbzoVar, vr1);
                parcel2.writeNoException();
                return true;
            case 2:
                InterfaceC7934rX interfaceC7934rXG2 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzj(interfaceC7934rXG2);
                parcel2.writeNoException();
                return true;
            case 3:
                InterfaceC7934rX.a.G(parcel.readStrongBinder());
                InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, null);
                return true;
            case 4:
                InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC7934rX interfaceC7934rXG3 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                EO1 eo1Z2 = DO1.Z2(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzl(arrayListCreateTypedArrayList, interfaceC7934rXG3, eo1Z2);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC7934rX interfaceC7934rXG4 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                EO1 eo1Z22 = DO1.Z2(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzk(arrayListCreateTypedArrayList2, interfaceC7934rXG4, eo1Z22);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbtt zzbttVar = (zzbtt) AbstractC6953nz1.a(parcel, zzbtt.CREATOR);
                AbstractC6953nz1.c(parcel);
                zzf(zzbttVar);
                parcel2.writeNoException();
                return true;
            case 8:
                InterfaceC7934rX interfaceC7934rXG5 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzi(interfaceC7934rXG5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC7934rX interfaceC7934rXG6 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                EO1 eo1Z23 = DO1.Z2(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzh(arrayListCreateTypedArrayList3, interfaceC7934rXG6, eo1Z23);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC7934rX interfaceC7934rXG7 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                EO1 eo1Z24 = DO1.Z2(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzg(arrayListCreateTypedArrayList4, interfaceC7934rXG7, eo1Z24);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
