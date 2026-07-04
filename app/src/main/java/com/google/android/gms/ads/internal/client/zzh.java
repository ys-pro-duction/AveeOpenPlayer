package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdLoadCallback;

/* JADX INFO: loaded from: classes.dex */
public final class zzh extends zzbj {
    public final AdLoadCallback B;
    public final Object C;

    public zzh(AdLoadCallback adLoadCallback, Object obj) {
        this.B = adLoadCallback;
        this.C = obj;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb(zze zzeVar) {
        AdLoadCallback adLoadCallback = this.B;
        if (adLoadCallback != null) {
            adLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc() {
        Object obj;
        AdLoadCallback adLoadCallback = this.B;
        if (adLoadCallback == null || (obj = this.C) == null) {
            return;
        }
        adLoadCallback.onAdLoaded(obj);
    }
}
