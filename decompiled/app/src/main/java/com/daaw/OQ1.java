package com.daaw;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes3.dex */
public final class OQ1 extends AbstractBinderC8745uQ1 {
    public FullScreenContentCallback B;
    public OnUserEarnedRewardListener C;

    public final void Z2(FullScreenContentCallback fullScreenContentCallback) {
        this.B = fullScreenContentCallback;
    }

    public final void a3(OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.C = onUserEarnedRewardListener;
    }

    @Override // com.daaw.InterfaceC9031vQ1
    public final void e1(InterfaceC7351pQ1 interfaceC7351pQ1) {
        OnUserEarnedRewardListener onUserEarnedRewardListener = this.C;
        if (onUserEarnedRewardListener != null) {
            onUserEarnedRewardListener.onUserEarnedReward(new CQ1(interfaceC7351pQ1));
        }
    }

    @Override // com.daaw.InterfaceC9031vQ1
    public final void o2(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.B;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.daaw.InterfaceC9031vQ1
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.B;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.daaw.InterfaceC9031vQ1
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.B;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.daaw.InterfaceC9031vQ1
    public final void zzg() {
        FullScreenContentCallback fullScreenContentCallback = this.B;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.daaw.InterfaceC9031vQ1
    public final void zzj() {
        FullScreenContentCallback fullScreenContentCallback = this.B;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    @Override // com.daaw.InterfaceC9031vQ1
    public final void g(int i) {
    }
}
