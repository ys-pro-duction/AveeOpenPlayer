package com.daaw;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TG1 extends AbstractBinderC6674mz1 implements UG1 {
    public static UG1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof UG1 ? (UG1) iInterfaceQueryLocalInterface : new SG1(iBinder);
    }
}
