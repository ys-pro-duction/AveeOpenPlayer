package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RL1 extends AbstractBinderC6674mz1 implements SL1 {
    public RL1() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static SL1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof SL1 ? (SL1) iInterfaceQueryLocalInterface : new QL1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String string = parcel.readString();
            AbstractC6953nz1.c(parcel);
            ZL1 zl1Zzb = zzb(string);
            parcel2.writeNoException();
            AbstractC6953nz1.f(parcel2, zl1Zzb);
        } else if (i == 2) {
            String string2 = parcel.readString();
            AbstractC6953nz1.c(parcel);
            boolean zA = a(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zA ? 1 : 0);
        } else if (i == 3) {
            String string3 = parcel.readString();
            AbstractC6953nz1.c(parcel);
            ZM1 zm1O = o(string3);
            parcel2.writeNoException();
            AbstractC6953nz1.f(parcel2, zm1O);
        } else {
            if (i != 4) {
                return false;
            }
            String string4 = parcel.readString();
            AbstractC6953nz1.c(parcel);
            boolean zL = l(string4);
            parcel2.writeNoException();
            parcel2.writeInt(zL ? 1 : 0);
        }
        return true;
    }
}
