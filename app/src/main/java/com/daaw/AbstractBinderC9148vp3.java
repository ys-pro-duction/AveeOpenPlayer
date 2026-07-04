package com.daaw;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.vp3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC9148vp3 extends AbstractBinderC9437wr3 implements InterfaceC4105dq3 {
    public AbstractBinderC9148vp3() {
        super("com.android.vending.billing.IInAppBillingServiceCallback");
    }

    @Override // com.daaw.AbstractBinderC9437wr3
    public final boolean B(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC3837cs3.a(parcel, Bundle.CREATOR);
        AbstractC3837cs3.b(parcel);
        m2(bundle);
        parcel2.writeNoException();
        return true;
    }
}
