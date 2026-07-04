package com.daaw;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.daaw.aF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3104aF1 extends AbstractBinderC6674mz1 implements InterfaceC3383bF1 {
    public static InterfaceC3383bF1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3383bF1 ? (InterfaceC3383bF1) iInterfaceQueryLocalInterface : new ZE1(iBinder);
    }
}
