package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;

/* JADX INFO: renamed from: com.daaw.dM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3968dM1 extends AbstractC6395lz1 implements InterfaceC4525fM1 {
    public C3968dM1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.daaw.InterfaceC4525fM1
    public final InterfaceC7934rX zze() {
        Parcel parcelG = G(1, B());
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC7934rXG;
    }

    @Override // com.daaw.InterfaceC4525fM1
    public final boolean zzf() {
        Parcel parcelG = G(2, B());
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }
}
