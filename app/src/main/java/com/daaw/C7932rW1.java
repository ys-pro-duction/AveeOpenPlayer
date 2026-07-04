package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.rW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7932rW1 extends AbstractC6211lK1 implements FX1 {
    public C7932rW1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.daaw.FX1
    public final void P(String str, String str2, Bundle bundle, long j) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC7888rL1.d(parcelB, bundle);
        parcelB.writeLong(j);
        I(1, parcelB);
    }

    @Override // com.daaw.FX1
    public final int zzd() {
        Parcel parcelG = G(2, B());
        int i = parcelG.readInt();
        parcelG.recycle();
        return i;
    }
}
