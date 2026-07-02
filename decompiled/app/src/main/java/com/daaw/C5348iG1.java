package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.iG1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5348iG1 extends AbstractC6395lz1 implements InterfaceC5907kG1 {
    public C5348iG1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.daaw.InterfaceC5907kG1
    public final String zzg() {
        Parcel parcelG = G(2, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.daaw.InterfaceC5907kG1
    public final List zzh() {
        Parcel parcelG = G(3, B());
        ArrayList arrayListB = AbstractC6953nz1.b(parcelG);
        parcelG.recycle();
        return arrayListB;
    }
}
