package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class WF1 extends AbstractC6395lz1 implements IInterface {
    public WF1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void a3(InterfaceC4258eP1 interfaceC4258eP1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC4258eP1);
        I(1, parcelB);
    }
}
