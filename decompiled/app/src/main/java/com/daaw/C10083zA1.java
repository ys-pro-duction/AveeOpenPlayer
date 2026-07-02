package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;

/* JADX INFO: renamed from: com.daaw.zA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10083zA1 extends AbstractC6395lz1 implements BA1 {
    public C10083zA1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.daaw.BA1
    public final void R2(boolean z) {
        Parcel parcelB = B();
        ClassLoader classLoader = AbstractC6953nz1.a;
        parcelB.writeInt(z ? 1 : 0);
        I(6, parcelB);
    }

    @Override // com.daaw.BA1
    public final void S0(zzdg zzdgVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, zzdgVar);
        I(7, parcelB);
    }

    @Override // com.daaw.BA1
    public final void l2(InterfaceC7934rX interfaceC7934rX, IA1 ia1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.f(parcelB, ia1);
        I(4, parcelB);
    }

    @Override // com.daaw.BA1
    public final zzdn zzf() {
        Parcel parcelG = G(5, B());
        zzdn zzdnVarZzb = zzdm.zzb(parcelG.readStrongBinder());
        parcelG.recycle();
        return zzdnVarZzb;
    }
}
