package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;

/* JADX INFO: renamed from: com.daaw.vG1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC8991vG1 extends AbstractBinderC6674mz1 implements InterfaceC9270wG1 {
    public AbstractBinderC8991vG1() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static InterfaceC9270wG1 zzbE(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9270wG1 ? (InterfaceC9270wG1) iInterfaceQueryLocalInterface : new C8705uG1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC7311pG1 c6753nG1;
        switch (i) {
            case 1:
                String string = parcel.readString();
                InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzbz(string, interfaceC7934rXG);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                AbstractC6953nz1.c(parcel);
                InterfaceC7934rX interfaceC7934rXZzb = zzb(string2);
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC7934rXZzb);
                return true;
            case 3:
                InterfaceC7934rX interfaceC7934rXG2 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzbD(interfaceC7934rXG2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzc();
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC7934rX.a.G(parcel.readStrongBinder());
                parcel.readInt();
                AbstractC6953nz1.c(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC7934rX interfaceC7934rXG3 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzbA(interfaceC7934rXG3);
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC7934rX interfaceC7934rXG4 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzd(interfaceC7934rXG4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c6753nG1 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    c6753nG1 = iInterfaceQueryLocalInterface instanceof InterfaceC7311pG1 ? (InterfaceC7311pG1) iInterfaceQueryLocalInterface : new C6753nG1(strongBinder);
                }
                AbstractC6953nz1.c(parcel);
                zzbB(c6753nG1);
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC7934rX interfaceC7934rXG5 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzbC(interfaceC7934rXG5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
