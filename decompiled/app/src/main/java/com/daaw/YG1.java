package com.daaw;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class YG1 extends AbstractC6395lz1 implements InterfaceC3112aH1 {
    public YG1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.daaw.InterfaceC3112aH1
    public final void L2(QG1 qg1, String str) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, qg1);
        parcelB.writeString(str);
        I(1, parcelB);
    }
}
