package com.daaw;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Gn3 extends AbstractBinderC9437wr3 implements Ko3 {
    public static Ko3 G(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        return iInterfaceQueryLocalInterface instanceof Ko3 ? (Ko3) iInterfaceQueryLocalInterface : new C8010rm3(iBinder);
    }
}
