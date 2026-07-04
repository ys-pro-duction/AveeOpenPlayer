package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.nH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC6757nH1 extends AbstractBinderC6674mz1 implements InterfaceC7036oH1 {
    public AbstractBinderC6757nH1() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static InterfaceC7036oH1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7036oH1 ? (InterfaceC7036oH1) iInterfaceQueryLocalInterface : new C6478mH1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC9553xH1 c8995vH1;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c8995vH1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            c8995vH1 = iInterfaceQueryLocalInterface instanceof InterfaceC9553xH1 ? (InterfaceC9553xH1) iInterfaceQueryLocalInterface : new C8995vH1(strongBinder);
        }
        AbstractC6953nz1.c(parcel);
        v2(c8995vH1);
        parcel2.writeNoException();
        return true;
    }
}
