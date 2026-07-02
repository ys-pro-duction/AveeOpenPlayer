package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import com.daaw.AbstractC7506py0;
import com.daaw.AbstractC8701uF1;
import com.daaw.AbstractC9820yE1;
import com.daaw.RO1;
import com.daaw.TS1;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;

/* JADX INFO: loaded from: classes.dex */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(Context context) {
        super(context, 0);
        AbstractC7506py0.m(context, "Context cannot be null");
    }

    public final /* synthetic */ void a(AdManagerAdRequest adManagerAdRequest) {
        try {
            this.B.zzm(adManagerAdRequest.zza());
        } catch (IllegalStateException e) {
            RO1.c(getContext()).a(e, "AdManagerAdView.loadAd");
        }
    }

    public AdSize[] getAdSizes() {
        return this.B.zzB();
    }

    public AppEventListener getAppEventListener() {
        return this.B.zzh();
    }

    public VideoController getVideoController() {
        return this.B.zzf();
    }

    public VideoOptions getVideoOptions() {
        return this.B.zzg();
    }

    public void loadAd(final AdManagerAdRequest adManagerAdRequest) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC9820yE1.a(getContext());
        if (((Boolean) AbstractC8701uF1.f.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ma)).booleanValue()) {
                TS1.b.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.a(adManagerAdRequest);
                    }
                });
                return;
            }
        }
        this.B.zzm(adManagerAdRequest.zza());
    }

    public void recordManualImpression() {
        this.B.zzo();
    }

    public void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.B.zzt(adSizeArr);
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.B.zzv(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.B.zzw(z);
    }

    public void setVideoOptions(VideoOptions videoOptions) {
        this.B.zzy(videoOptions);
    }

    public final boolean zzb(zzbu zzbuVar) {
        return this.B.zzz(zzbuVar);
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, true);
        AbstractC7506py0.m(context, "Context cannot be null");
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, true);
        AbstractC7506py0.m(context, "Context cannot be null");
    }
}
