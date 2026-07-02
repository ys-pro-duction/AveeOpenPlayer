package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class QL1 extends AbstractC6395lz1 implements SL1 {
    public QL1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.daaw.SL1
    public final boolean a(String str) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        Parcel parcelG = G(2, parcelB);
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }

    @Override // com.daaw.SL1
    public final boolean l(String str) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        Parcel parcelG = G(4, parcelB);
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }

    @Override // com.daaw.SL1
    public final ZM1 o(String str) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        Parcel parcelG = G(3, parcelB);
        ZM1 zm1Z2 = YM1.Z2(parcelG.readStrongBinder());
        parcelG.recycle();
        return zm1Z2;
    }

    @Override // com.daaw.SL1
    public final ZL1 zzb(String str) {
        ZL1 tl1;
        Parcel parcelB = B();
        parcelB.writeString(str);
        Parcel parcelG = G(1, parcelB);
        IBinder strongBinder = parcelG.readStrongBinder();
        if (strongBinder == null) {
            tl1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            tl1 = iInterfaceQueryLocalInterface instanceof ZL1 ? (ZL1) iInterfaceQueryLocalInterface : new TL1(strongBinder);
        }
        parcelG.recycle();
        return tl1;
    }
}
