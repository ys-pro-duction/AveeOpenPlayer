package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzfnv;
import com.google.android.gms.internal.ads.zzfny;
import com.google.android.gms.internal.ads.zzfoa;
import com.google.android.gms.internal.ads.zzfoh;
import com.google.android.gms.internal.ads.zzfoj;

/* JADX INFO: loaded from: classes3.dex */
public final class IL2 extends AbstractC6395lz1 implements IInterface {
    public IL2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfoa a3(zzfny zzfnyVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzfnyVar);
        Parcel parcelG = G(1, parcelB);
        zzfoa zzfoaVar = (zzfoa) AbstractC6953nz1.a(parcelG, zzfoa.CREATOR);
        parcelG.recycle();
        return zzfoaVar;
    }

    public final zzfoj b3(zzfoh zzfohVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzfohVar);
        Parcel parcelG = G(3, parcelB);
        zzfoj zzfojVar = (zzfoj) AbstractC6953nz1.a(parcelG, zzfoj.CREATOR);
        parcelG.recycle();
        return zzfojVar;
    }

    public final void c3(zzfnv zzfnvVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzfnvVar);
        I(2, parcelB);
    }
}
