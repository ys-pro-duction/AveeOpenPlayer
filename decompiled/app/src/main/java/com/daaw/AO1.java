package com.daaw;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AO1 extends AbstractBinderC6674mz1 implements BO1 {
    public static BO1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return iInterfaceQueryLocalInterface instanceof BO1 ? (BO1) iInterfaceQueryLocalInterface : new C10139zO1(iBinder);
    }
}
