package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.cH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3669cH1 extends AbstractBinderC6674mz1 implements InterfaceC3948dH1 {
    public AbstractBinderC3669cH1() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public static InterfaceC3948dH1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3948dH1 ? (InterfaceC3948dH1) iInterfaceQueryLocalInterface : new C3391bH1(iBinder);
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
        AbstractC6953nz1.c(parcel);
        y2(og1);
        parcel2.writeNoException();
        return true;
    }
}
