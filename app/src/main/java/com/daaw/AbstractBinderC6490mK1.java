package com.daaw;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.daaw.mK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC6490mK1 extends AbstractBinderC6674mz1 implements InterfaceC6769nK1 {
    public static InterfaceC6769nK1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6769nK1 ? (InterfaceC6769nK1) iInterfaceQueryLocalInterface : new C5364iK1(iBinder);
    }
}
