package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.tJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC8438tJ1 extends AbstractBinderC6674mz1 implements InterfaceC8717uJ1 {
    public AbstractBinderC8438tJ1() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    public static InterfaceC8717uJ1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8717uJ1 ? (InterfaceC8717uJ1) iInterfaceQueryLocalInterface : new C8159sJ1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String string = parcel.readString();
            AbstractC6953nz1.c(parcel);
            e(string);
        } else {
            if (i != 2) {
                return false;
            }
            zze();
        }
        parcel2.writeNoException();
        return true;
    }
}
