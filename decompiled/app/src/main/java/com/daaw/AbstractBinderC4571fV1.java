package com.daaw;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.fV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC4571fV1 extends MK1 implements LV1 {
    public AbstractBinderC4571fV1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.daaw.MK1
    public final boolean B(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC7888rL1.a(parcel, Bundle.CREATOR);
        AbstractC7888rL1.c(parcel);
        J0(bundle);
        parcel2.writeNoException();
        return true;
    }
}
