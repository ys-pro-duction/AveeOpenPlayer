package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.qJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC7602qJ1 extends AbstractBinderC6674mz1 implements InterfaceC7880rJ1 {
    public AbstractBinderC7602qJ1() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    public static InterfaceC7880rJ1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7880rJ1 ? (InterfaceC7880rJ1) iInterfaceQueryLocalInterface : new C7323pJ1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        AbstractC6953nz1.c(parcel);
        zzb(string);
        parcel2.writeNoException();
        return true;
    }
}
