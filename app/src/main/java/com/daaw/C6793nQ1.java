package com.daaw;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.nQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6793nQ1 extends AbstractC6395lz1 implements InterfaceC7351pQ1 {
    public C6793nQ1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.daaw.InterfaceC7351pQ1
    public final int zze() {
        Parcel parcelG = G(2, B());
        int i = parcelG.readInt();
        parcelG.recycle();
        return i;
    }

    @Override // com.daaw.InterfaceC7351pQ1
    public final String zzf() {
        Parcel parcelG = G(1, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }
}
