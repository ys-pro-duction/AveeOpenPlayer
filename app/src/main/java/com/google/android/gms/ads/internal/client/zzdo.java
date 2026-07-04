package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.AbstractC6395lz1;
import com.daaw.AbstractC6953nz1;

/* JADX INFO: loaded from: classes.dex */
public final class zzdo extends AbstractC6395lz1 implements zzdq {
    public zzdo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() {
        Parcel parcelG = G(5, B());
        int i = parcelG.readInt();
        parcelG.recycle();
        return i;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final zzdt zzi() {
        zzdt zzdrVar;
        Parcel parcelG = G(11, B());
        IBinder strongBinder = parcelG.readStrongBinder();
        if (strongBinder == null) {
            zzdrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzdrVar = iInterfaceQueryLocalInterface instanceof zzdt ? (zzdt) iInterfaceQueryLocalInterface : new zzdr(strongBinder);
        }
        parcelG.recycle();
        return zzdrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z) {
        Parcel parcelB = B();
        ClassLoader classLoader = AbstractC6953nz1.a;
        parcelB.writeInt(z ? 1 : 0);
        I(3, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() {
        I(2, B());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() {
        I(1, B());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(zzdt zzdtVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, zzdtVar);
        I(8, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() {
        I(13, B());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() {
        Parcel parcelG = G(12, B());
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() {
        Parcel parcelG = G(10, B());
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() {
        Parcel parcelG = G(4, B());
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }
}
