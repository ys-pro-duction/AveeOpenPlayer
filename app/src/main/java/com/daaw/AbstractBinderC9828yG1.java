package com.daaw;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.daaw.yG1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC9828yG1 extends AbstractBinderC6674mz1 implements InterfaceC10107zG1 {
    public static InterfaceC10107zG1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC10107zG1 ? (InterfaceC10107zG1) iInterfaceQueryLocalInterface : new C9549xG1(iBinder);
    }
}
