package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.AbstractC6395lz1;
import com.daaw.AbstractC6953nz1;

/* JADX INFO: loaded from: classes.dex */
public final class zzdr extends AbstractC6395lz1 implements zzdt {
    public zzdr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze() {
        I(4, B());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzf(boolean z) {
        Parcel parcelB = B();
        ClassLoader classLoader = AbstractC6953nz1.a;
        parcelB.writeInt(z ? 1 : 0);
        I(5, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzg() {
        I(3, B());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzh() {
        I(2, B());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzi() {
        I(1, B());
    }
}
