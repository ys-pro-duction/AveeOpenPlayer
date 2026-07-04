package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BG1 extends AbstractBinderC6674mz1 implements CG1 {
    public BG1() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static CG1 zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return iInterfaceQueryLocalInterface instanceof CG1 ? (CG1) iInterfaceQueryLocalInterface : new AG1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
            AbstractC6953nz1.c(parcel);
            zzc(interfaceC7934rXG);
        } else if (i == 2) {
            zzd();
        } else {
            if (i != 3) {
                return false;
            }
            InterfaceC7934rX interfaceC7934rXG2 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
            AbstractC6953nz1.c(parcel);
            zzb(interfaceC7934rXG2);
        }
        parcel2.writeNoException();
        return true;
    }
}
