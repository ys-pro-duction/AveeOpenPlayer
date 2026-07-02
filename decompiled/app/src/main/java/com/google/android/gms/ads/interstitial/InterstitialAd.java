package com.google.android.gms.ads.interstitial;

import android.app.Activity;
import android.content.Context;
import com.daaw.AbstractC7506py0;
import com.daaw.AbstractC8701uF1;
import com.daaw.AbstractC9820yE1;
import com.daaw.C7048oK1;
import com.daaw.RO1;
import com.daaw.TS1;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public abstract class InterstitialAd {
    public static void load(final Context context, final String str, final AdRequest adRequest, final InterstitialAdLoadCallback interstitialAdLoadCallback) {
        AbstractC7506py0.m(context, "Context cannot be null.");
        AbstractC7506py0.m(str, "AdUnitId cannot be null.");
        AbstractC7506py0.m(adRequest, "AdRequest cannot be null.");
        AbstractC7506py0.m(interstitialAdLoadCallback, "LoadCallback cannot be null.");
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC9820yE1.a(context);
        if (((Boolean) AbstractC8701uF1.i.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ma)).booleanValue()) {
                TS1.b.execute(new Runnable() { // from class: com.google.android.gms.ads.interstitial.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new C7048oK1(context2, str2).a(adRequest2.zza(), interstitialAdLoadCallback);
                        } catch (IllegalStateException e) {
                            RO1.c(context2).a(e, "InterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new C7048oK1(context, str).a(adRequest.zza(), interstitialAdLoadCallback);
    }

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void show(Activity activity);
}
