package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DA1 extends AbstractBinderC6674mz1 implements EA1 {
    public DA1() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static EA1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof EA1 ? (EA1) iInterfaceQueryLocalInterface : new CA1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        BA1 c10083zA1;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c10083zA1 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                c10083zA1 = iInterfaceQueryLocalInterface instanceof BA1 ? (BA1) iInterfaceQueryLocalInterface : new C10083zA1(strongBinder);
            }
            AbstractC6953nz1.c(parcel);
            b2(c10083zA1);
        } else if (i == 2) {
            parcel.readInt();
            AbstractC6953nz1.c(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            zze zzeVar = (zze) AbstractC6953nz1.a(parcel, zze.CREATOR);
            AbstractC6953nz1.c(parcel);
            U1(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
