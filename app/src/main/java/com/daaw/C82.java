package com.daaw;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class C82 extends AbstractC6893nm1 implements InterfaceC9259wD2 {
    public C82(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // com.daaw.InterfaceC9259wD2
    public final boolean o0(boolean z) {
        Parcel parcelB = B();
        DS1.a(parcelB, true);
        Parcel parcelG = G(2, parcelB);
        boolean zB = DS1.b(parcelG);
        parcelG.recycle();
        return zB;
    }

    @Override // com.daaw.InterfaceC9259wD2
    public final String zzc() {
        Parcel parcelG = G(1, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.daaw.InterfaceC9259wD2
    public final boolean zzd() {
        Parcel parcelG = G(6, B());
        boolean zB = DS1.b(parcelG);
        parcelG.recycle();
        return zB;
    }
}
