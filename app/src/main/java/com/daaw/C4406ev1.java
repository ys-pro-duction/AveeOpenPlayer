package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzeu;

/* JADX INFO: renamed from: com.daaw.ev1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4406ev1 extends SA1 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ SL1 d;
    public final /* synthetic */ zzaw e;

    public C4406ev1(zzaw zzawVar, Context context, String str, SL1 sl1) {
        this.e = zzawVar;
        this.b = context;
        this.c = str;
        this.d = sl1;
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.i(this.b, "native_ad");
        return new zzeu();
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object b(zzce zzceVar) {
        return zzceVar.zzb(BinderC7744qp0.Z2(this.b), this.c, this.d, 233702000);
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object c() {
        AbstractC9820yE1.a(this.b);
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.Q9)).booleanValue()) {
            return this.e.b.zza(this.b, this.c, this.d);
        }
        try {
            IBinder iBinderZze = ((zzbr) AbstractC5400iT1.b(this.b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new InterfaceC4842gT1() { // from class: com.google.android.gms.ads.internal.client.zzan
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.InterfaceC4842gT1
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return iInterfaceQueryLocalInterface instanceof zzbr ? (zzbr) iInterfaceQueryLocalInterface : new zzbr(obj);
                }
            })).zze(BinderC7744qp0.Z2(this.b), this.c, this.d, 233702000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof zzbq ? (zzbq) iInterfaceQueryLocalInterface : new zzbo(iBinderZze);
        } catch (RemoteException e) {
            e = e;
            this.e.h = RO1.c(this.b);
            this.e.h.a(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (C5121hT1 e2) {
            e = e2;
            this.e.h = RO1.c(this.b);
            this.e.h.a(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            this.e.h = RO1.c(this.b);
            this.e.h.a(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
