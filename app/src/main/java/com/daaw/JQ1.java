package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class JQ1 {
    public static final InterfaceC8187sQ1 a(Context context, String str, SL1 sl1) {
        try {
            IBinder iBinderZze = ((C9310wQ1) AbstractC5400iT1.b(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new InterfaceC4842gT1() { // from class: com.daaw.IQ1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.InterfaceC4842gT1
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return iInterfaceQueryLocalInterface instanceof C9310wQ1 ? (C9310wQ1) iInterfaceQueryLocalInterface : new C9310wQ1(obj);
                }
            })).zze(BinderC7744qp0.Z2(context), str, sl1, 233702000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof InterfaceC8187sQ1 ? (InterfaceC8187sQ1) iInterfaceQueryLocalInterface : new C7630qQ1(iBinderZze);
        } catch (RemoteException e) {
            e = e;
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
            return null;
        } catch (C5121hT1 e2) {
            e = e2;
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
