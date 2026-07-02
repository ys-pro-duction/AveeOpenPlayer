package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class WJ1 extends AbstractC6395lz1 implements YJ1 {
    public WJ1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.daaw.YJ1
    public final void W1(List list) {
        Parcel parcelB = B();
        parcelB.writeTypedList(list);
        I(1, parcelB);
    }
}
