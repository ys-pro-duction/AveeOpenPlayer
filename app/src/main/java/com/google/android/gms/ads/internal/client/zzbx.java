package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.daaw.AbstractBinderC6674mz1;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbx extends AbstractBinderC6674mz1 implements zzby {
    public static zzby zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return iInterfaceQueryLocalInterface instanceof zzby ? (zzby) iInterfaceQueryLocalInterface : new zzbw(iBinder);
    }
}
