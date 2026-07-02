package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzcp;
import com.google.android.gms.ads.internal.client.zzey;

/* JADX INFO: renamed from: com.daaw.vw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9179vw1 extends SA1 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzaw c;

    public C9179vw1(zzaw zzawVar, Context context) {
        this.c = zzawVar;
        this.b = context;
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.i(this.b, "mobile_ads_settings");
        return new zzey();
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object b(zzce zzceVar) {
        return zzceVar.zzg(BinderC7744qp0.Z2(this.b), 233702000);
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object c() {
        AbstractC9820yE1.a(this.b);
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.Q9)).booleanValue()) {
            return this.c.c.zza(this.b);
        }
        try {
            IBinder iBinderZze = ((zzcp) AbstractC5400iT1.b(this.b, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new InterfaceC4842gT1() { // from class: com.google.android.gms.ads.internal.client.zzap
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.InterfaceC4842gT1
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return iInterfaceQueryLocalInterface instanceof zzcp ? (zzcp) iInterfaceQueryLocalInterface : new zzcp(obj);
                }
            })).zze(BinderC7744qp0.Z2(this.b), 233702000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof zzco ? (zzco) iInterfaceQueryLocalInterface : new zzcm(iBinderZze);
        } catch (RemoteException e) {
            e = e;
            this.c.h = RO1.c(this.b);
            this.c.h.a(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (C5121hT1 e2) {
            e = e2;
            this.c.h = RO1.c(this.b);
            this.c.h.a(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            this.c.h = RO1.c(this.b);
            this.c.h.a(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
