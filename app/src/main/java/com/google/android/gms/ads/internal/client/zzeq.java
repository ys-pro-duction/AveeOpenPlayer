package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.daaw.AbstractC4274eT1;
import com.daaw.BinderC7744qp0;
import com.daaw.IG0;

/* JADX INFO: loaded from: classes.dex */
public final class zzeq extends IG0 {
    public zzeq() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // com.daaw.IG0
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzcp ? (zzcp) iInterfaceQueryLocalInterface : new zzcp(iBinder);
    }

    public final zzco zza(Context context) {
        try {
            IBinder iBinderZze = ((zzcp) b(context)).zze(BinderC7744qp0.Z2(context), 233702000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof zzco ? (zzco) iInterfaceQueryLocalInterface : new zzcm(iBinderZze);
        } catch (RemoteException e) {
            e = e;
            AbstractC4274eT1.zzk("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (IG0.a e2) {
            e = e2;
            AbstractC4274eT1.zzk("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
