package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.daaw.AbstractC4274eT1;
import com.daaw.BinderC7744qp0;
import com.daaw.IG0;
import com.daaw.SL1;

/* JADX INFO: loaded from: classes.dex */
public final class zzi extends IG0 {
    public zzi() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // com.daaw.IG0
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterfaceQueryLocalInterface instanceof zzbr ? (zzbr) iInterfaceQueryLocalInterface : new zzbr(iBinder);
    }

    public final zzbq zza(Context context, String str, SL1 sl1) {
        try {
            IBinder iBinderZze = ((zzbr) b(context)).zze(BinderC7744qp0.Z2(context), str, sl1, 233702000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof zzbq ? (zzbq) iInterfaceQueryLocalInterface : new zzbo(iBinderZze);
        } catch (RemoteException e) {
            e = e;
            AbstractC4274eT1.zzk("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (IG0.a e2) {
            e = e2;
            AbstractC4274eT1.zzk("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
