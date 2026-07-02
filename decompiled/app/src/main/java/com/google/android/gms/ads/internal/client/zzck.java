package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.AbstractBinderC6674mz1;
import com.daaw.AbstractC6953nz1;
import com.daaw.SL1;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzck extends AbstractBinderC6674mz1 implements zzcl {
    public zzck() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcl asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof zzcl ? (zzcl) iInterfaceQueryLocalInterface : new zzcj(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzen liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            AbstractC6953nz1.e(parcel2, liteSdkVersion);
        } else {
            if (i != 2) {
                return false;
            }
            SL1 adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            AbstractC6953nz1.f(parcel2, adapterCreator);
        }
        return true;
    }
}
