package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzaxh;

/* JADX INFO: renamed from: com.daaw.aB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3088aB1 extends AbstractC6395lz1 implements IInterface {
    public C3088aB1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long a3(zzaxh zzaxhVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzaxhVar);
        Parcel parcelG = G(3, parcelB);
        long j = parcelG.readLong();
        parcelG.recycle();
        return j;
    }

    public final zzaxe b3(zzaxh zzaxhVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzaxhVar);
        Parcel parcelG = G(1, parcelB);
        zzaxe zzaxeVar = (zzaxe) AbstractC6953nz1.a(parcelG, zzaxe.CREATOR);
        parcelG.recycle();
        return zzaxeVar;
    }

    public final zzaxe c3(zzaxh zzaxhVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzaxhVar);
        Parcel parcelG = G(2, parcelB);
        zzaxe zzaxeVar = (zzaxe) AbstractC6953nz1.a(parcelG, zzaxe.CREATOR);
        parcelG.recycle();
        return zzaxeVar;
    }
}
