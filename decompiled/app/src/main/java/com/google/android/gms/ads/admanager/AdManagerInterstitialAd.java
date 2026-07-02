package com.google.android.gms.ads.admanager;

import android.content.Context;
import com.daaw.AbstractC7506py0;
import com.daaw.AbstractC8701uF1;
import com.daaw.AbstractC9820yE1;
import com.daaw.C7048oK1;
import com.daaw.RO1;
import com.daaw.TS1;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* JADX INFO: loaded from: classes.dex */
public abstract class AdManagerInterstitialAd extends InterstitialAd {
    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        AbstractC7506py0.m(context, "Context cannot be null.");
        AbstractC7506py0.m(str, "AdUnitId cannot be null.");
        AbstractC7506py0.m(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        AbstractC7506py0.m(adManagerInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC9820yE1.a(context);
        if (((Boolean) AbstractC8701uF1.i.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ma)).booleanValue()) {
                TS1.b.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new C7048oK1(context2, str2).a(adManagerAdRequest2.zza(), adManagerInterstitialAdLoadCallback);
                        } catch (IllegalStateException e) {
                            RO1.c(context2).a(e, "AdManagerInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new C7048oK1(context, str).a(adManagerAdRequest.zza(), adManagerInterstitialAdLoadCallback);
    }

    public abstract AppEventListener getAppEventListener();

    public abstract void setAppEventListener(AppEventListener appEventListener);
}
