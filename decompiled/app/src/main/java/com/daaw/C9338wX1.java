package com.daaw;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.wX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9338wX1 extends AbstractC6395lz1 implements InterfaceC9896yX1 {
    public C9338wX1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.daaw.InterfaceC9896yX1
    public final void Q1(InterfaceC7934rX interfaceC7934rX, InterfaceC9059vX1 interfaceC9059vX1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.f(parcelB, interfaceC9059vX1);
        I(2, parcelB);
    }
}
