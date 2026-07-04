package com.daaw;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.daaw.ao2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3259ao2 extends EC1 implements InterfaceC9259wD2 {
    public static InterfaceC9259wD2 B(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9259wD2 ? (InterfaceC9259wD2) iInterfaceQueryLocalInterface : new C82(iBinder);
    }
}
