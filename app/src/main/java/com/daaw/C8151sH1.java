package com.daaw;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.sH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8151sH1 extends AbstractC6395lz1 implements InterfaceC8709uH1 {
    public C8151sH1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.daaw.InterfaceC8709uH1
    public final void e(String str) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        I(1, parcelB);
    }

    @Override // com.daaw.InterfaceC8709uH1
    public final void zze() {
        I(2, B());
    }
}
