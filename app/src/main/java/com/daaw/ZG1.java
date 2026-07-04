package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ZG1 extends AbstractBinderC6674mz1 implements InterfaceC3112aH1 {
    public ZG1() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static InterfaceC3112aH1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3112aH1 ? (InterfaceC3112aH1) iInterfaceQueryLocalInterface : new YG1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        QG1 og1;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            og1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            og1 = iInterfaceQueryLocalInterface instanceof QG1 ? (QG1) iInterfaceQueryLocalInterface : new OG1(strongBinder);
        }
        String string = parcel.readString();
        AbstractC6953nz1.c(parcel);
        L2(og1, string);
        parcel2.writeNoException();
        return true;
    }
}
