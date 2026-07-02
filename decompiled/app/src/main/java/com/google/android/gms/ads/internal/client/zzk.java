package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.daaw.AbstractC4274eT1;
import com.daaw.AbstractC5400iT1;
import com.daaw.AbstractC9820yE1;
import com.daaw.BinderC7744qp0;
import com.daaw.C5121hT1;
import com.daaw.IG0;
import com.daaw.InterfaceC4842gT1;
import com.daaw.RO1;
import com.daaw.SL1;
import com.daaw.ZO1;

/* JADX INFO: loaded from: classes.dex */
public final class zzk extends IG0 {
    public ZO1 c;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.daaw.IG0
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzbv ? (zzbv) iInterfaceQueryLocalInterface : new zzbv(iBinder);
    }

    public final zzbu zza(Context context, zzq zzqVar, String str, SL1 sl1, int i) {
        AbstractC9820yE1.a(context);
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.Q9)).booleanValue()) {
            try {
                IBinder iBinderZze = ((zzbv) b(context)).zze(BinderC7744qp0.Z2(context), zzqVar, str, sl1, 233702000, i);
                if (iBinderZze == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(iBinderZze);
            } catch (RemoteException e) {
                e = e;
                AbstractC4274eT1.zzf("Could not create remote AdManager.", e);
                return null;
            } catch (IG0.a e2) {
                e = e2;
                AbstractC4274eT1.zzf("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder iBinderZze2 = ((zzbv) AbstractC5400iT1.b(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new InterfaceC4842gT1() { // from class: com.google.android.gms.ads.internal.client.zzj
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.InterfaceC4842gT1
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface2 = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return iInterfaceQueryLocalInterface2 instanceof zzbv ? (zzbv) iInterfaceQueryLocalInterface2 : new zzbv(obj);
                }
            })).zze(BinderC7744qp0.Z2(context), zzqVar, str, sl1, 233702000, i);
            if (iBinderZze2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface2 = iBinderZze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return iInterfaceQueryLocalInterface2 instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface2 : new zzbs(iBinderZze2);
        } catch (RemoteException e3) {
            e = e3;
            Throwable th = e;
            ZO1 zo1C = RO1.c(context);
            this.c = zo1C;
            zo1C.a(th, "AdManagerCreator.newAdManagerByDynamiteLoader");
            AbstractC4274eT1.zzl("#007 Could not call remote method.", th);
            return null;
        } catch (C5121hT1 e4) {
            e = e4;
            Throwable th2 = e;
            ZO1 zo1C2 = RO1.c(context);
            this.c = zo1C2;
            zo1C2.a(th2, "AdManagerCreator.newAdManagerByDynamiteLoader");
            AbstractC4274eT1.zzl("#007 Could not call remote method.", th2);
            return null;
        } catch (NullPointerException e5) {
            e = e5;
            Throwable th22 = e;
            ZO1 zo1C22 = RO1.c(context);
            this.c = zo1C22;
            zo1C22.a(th22, "AdManagerCreator.newAdManagerByDynamiteLoader");
            AbstractC4274eT1.zzl("#007 Could not call remote method.", th22);
            return null;
        }
    }
}
