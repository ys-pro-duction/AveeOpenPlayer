package com.daaw;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.daaw.gQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC4830gQ1 extends AbstractBinderC6674mz1 implements InterfaceC5109hQ1 {
    public static InterfaceC5109hQ1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5109hQ1 ? (InterfaceC5109hQ1) iInterfaceQueryLocalInterface : new C4551fQ1(iBinder);
    }
}
