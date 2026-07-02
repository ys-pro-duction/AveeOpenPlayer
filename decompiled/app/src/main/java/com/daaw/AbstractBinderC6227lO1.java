package com.daaw;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.daaw.lO1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC6227lO1 extends AbstractBinderC6674mz1 implements InterfaceC6506mO1 {
    public static InterfaceC6506mO1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6506mO1 ? (InterfaceC6506mO1) iInterfaceQueryLocalInterface : new C5939kO1(iBinder);
    }
}
