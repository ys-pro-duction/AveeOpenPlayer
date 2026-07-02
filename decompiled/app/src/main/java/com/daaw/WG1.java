package com.daaw;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WG1 extends AbstractBinderC6674mz1 implements XG1 {
    public static XG1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof XG1 ? (XG1) iInterfaceQueryLocalInterface : new VG1(iBinder);
    }
}
