package com.daaw;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.daaw.wJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC9282wJ1 extends AbstractBinderC6674mz1 implements InterfaceC9561xJ1 {
    public static InterfaceC9561xJ1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9561xJ1 ? (InterfaceC9561xJ1) iInterfaceQueryLocalInterface : new C9003vJ1(iBinder);
    }
}
