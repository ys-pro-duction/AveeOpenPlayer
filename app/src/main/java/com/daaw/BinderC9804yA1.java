package com.daaw;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: renamed from: com.daaw.yA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC9804yA1 extends HA1 {
    public FullScreenContentCallback B;

    public final void Z2(FullScreenContentCallback fullScreenContentCallback) {
        this.B = fullScreenContentCallback;
    }

    @Override // com.daaw.IA1
    public final void zzb() {
        FullScreenContentCallback fullScreenContentCallback = this.B;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.daaw.IA1
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback = this.B;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.daaw.IA1
    public final void zzd(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.B;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.daaw.IA1
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.B;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.daaw.IA1
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.B;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }
}
