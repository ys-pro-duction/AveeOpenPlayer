package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CO1 extends AbstractC6395lz1 implements EO1 {
    public CO1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.daaw.EO1
    public final void a(String str) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        I(2, parcelB);
    }

    @Override // com.daaw.EO1
    public final void s0(List list) {
        Parcel parcelB = B();
        parcelB.writeTypedList(list);
        I(1, parcelB);
    }
}
