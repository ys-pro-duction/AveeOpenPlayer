package com.daaw;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.fK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4517fK1 extends AbstractC6395lz1 implements InterfaceC5085hK1 {
    public C4517fK1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.daaw.InterfaceC5085hK1
    public final void zze(int i) {
        Parcel parcelB = B();
        parcelB.writeInt(i);
        I(2, parcelB);
    }

    @Override // com.daaw.InterfaceC5085hK1
    public final void zzf() {
        I(1, B());
    }
}
