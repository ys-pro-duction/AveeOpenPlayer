package com.daaw;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.internal.client.zzaz;
import com.google.android.gms.ads.internal.client.zzea;

/* JADX INFO: renamed from: com.daaw.tn2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8572tn2 extends zzaz {
    public final /* synthetic */ zzea D;

    public C8572tn2(zzea zzeaVar) {
        this.D = zzeaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        zzea zzeaVar = this.D;
        zzeaVar.d.zzb(zzeaVar.zzi());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        zzea zzeaVar = this.D;
        zzeaVar.d.zzb(zzeaVar.zzi());
        super.onAdLoaded();
    }
}
