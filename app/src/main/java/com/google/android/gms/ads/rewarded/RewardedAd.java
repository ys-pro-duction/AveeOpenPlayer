package com.google.android.gms.ads.rewarded;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.daaw.AbstractC4274eT1;
import com.daaw.AbstractC7506py0;
import com.daaw.AbstractC8701uF1;
import com.daaw.AbstractC9820yE1;
import com.daaw.BQ1;
import com.daaw.RO1;
import com.daaw.TS1;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public abstract class RewardedAd {
    public static void load(final Context context, final String str, final AdRequest adRequest, final RewardedAdLoadCallback rewardedAdLoadCallback) {
        AbstractC7506py0.m(context, "Context cannot be null.");
        AbstractC7506py0.m(str, "AdUnitId cannot be null.");
        AbstractC7506py0.m(adRequest, "AdRequest cannot be null.");
        AbstractC7506py0.m(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC9820yE1.a(context);
        if (((Boolean) AbstractC8701uF1.l.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ma)).booleanValue()) {
                TS1.b.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new BQ1(context2, str2).a(adRequest2.zza(), rewardedAdLoadCallback);
                        } catch (IllegalStateException e) {
                            RO1.c(context2).a(e, "RewardedAd.load");
                        }
                    }
                });
                return;
            }
        }
        AbstractC4274eT1.zze("Loading on UI thread");
        new BQ1(context, str).a(adRequest.zza(), rewardedAdLoadCallback);
    }

    public abstract Bundle getAdMetadata();

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnAdMetadataChangedListener getOnAdMetadataChangedListener();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract RewardItem getRewardItem();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions);

    public abstract void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener);

    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final RewardedAdLoadCallback rewardedAdLoadCallback) {
        AbstractC7506py0.m(context, "Context cannot be null.");
        AbstractC7506py0.m(str, "AdUnitId cannot be null.");
        AbstractC7506py0.m(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        AbstractC7506py0.m(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC9820yE1.a(context);
        if (((Boolean) AbstractC8701uF1.l.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ma)).booleanValue()) {
                AbstractC4274eT1.zze("Loading on background thread");
                TS1.b.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new BQ1(context2, str2).a(adManagerAdRequest2.zza(), rewardedAdLoadCallback);
                        } catch (IllegalStateException e) {
                            RO1.c(context2).a(e, "RewardedAd.loadAdManager");
                        }
                    }
                });
                return;
            }
        }
        AbstractC4274eT1.zze("Loading on UI thread");
        new BQ1(context, str).a(adManagerAdRequest.zza(), rewardedAdLoadCallback);
    }
}
