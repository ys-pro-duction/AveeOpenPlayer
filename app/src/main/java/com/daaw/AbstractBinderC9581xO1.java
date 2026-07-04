package com.daaw;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.daaw.xO1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC9581xO1 extends AbstractBinderC6674mz1 implements InterfaceC9860yO1 {
    public static InterfaceC9860yO1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9860yO1 ? (InterfaceC9860yO1) iInterfaceQueryLocalInterface : new C9302wO1(iBinder);
    }
}
