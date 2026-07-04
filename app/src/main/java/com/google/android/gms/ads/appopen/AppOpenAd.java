package com.google.android.gms.ads.appopen;

import android.app.Activity;
import android.content.Context;
import com.daaw.AbstractC7506py0;
import com.daaw.AbstractC8701uF1;
import com.daaw.AbstractC9820yE1;
import com.daaw.JA1;
import com.daaw.RO1;
import com.daaw.TS1;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppOpenAd {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    public static abstract class AppOpenAdLoadCallback extends AdLoadCallback<AppOpenAd> {
    }

    public @interface AppOpenAdOrientation {
    }

    @Deprecated
    public static void load(final Context context, final String str, final AdRequest adRequest, @AppOpenAdOrientation final int i, final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        AbstractC7506py0.m(context, "Context cannot be null.");
        AbstractC7506py0.m(str, "adUnitId cannot be null.");
        AbstractC7506py0.m(adRequest, "AdRequest cannot be null.");
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC9820yE1.a(context);
        if (((Boolean) AbstractC8701uF1.d.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ma)).booleanValue()) {
                TS1.b.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i2 = i;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new JA1(context2, str2, adRequest2.zza(), i2, appOpenAdLoadCallback).a();
                        } catch (IllegalStateException e) {
                            RO1.c(context2).a(e, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new JA1(context, str, adRequest.zza(), i, appOpenAdLoadCallback).a();
    }

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void show(Activity activity);

    public static void load(final Context context, final String str, final AdRequest adRequest, final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        AbstractC7506py0.m(context, "Context cannot be null.");
        AbstractC7506py0.m(str, "adUnitId cannot be null.");
        AbstractC7506py0.m(adRequest, "AdRequest cannot be null.");
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC9820yE1.a(context);
        if (((Boolean) AbstractC8701uF1.d.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ma)).booleanValue()) {
                TS1.b.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new JA1(context2, str2, adRequest2.zza(), 3, appOpenAdLoadCallback).a();
                        } catch (IllegalStateException e) {
                            RO1.c(context2).a(e, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new JA1(context, str, adRequest.zza(), 3, appOpenAdLoadCallback).a();
    }

    @Deprecated
    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, @AppOpenAdOrientation final int i, final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        AbstractC7506py0.m(context, "Context cannot be null.");
        AbstractC7506py0.m(str, "adUnitId cannot be null.");
        AbstractC7506py0.m(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC9820yE1.a(context);
        if (((Boolean) AbstractC8701uF1.d.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ma)).booleanValue()) {
                TS1.b.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i2 = i;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new JA1(context2, str2, adManagerAdRequest2.zza(), i2, appOpenAdLoadCallback).a();
                        } catch (IllegalStateException e) {
                            RO1.c(context2).a(e, "AppOpenAdManager.load");
                        }
                    }
                });
                return;
            }
        }
        new JA1(context, str, adManagerAdRequest.zza(), i, appOpenAdLoadCallback).a();
    }
}
