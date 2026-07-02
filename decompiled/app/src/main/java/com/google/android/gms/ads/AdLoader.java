package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.daaw.AbstractC4274eT1;
import com.daaw.AbstractC7506py0;
import com.daaw.AbstractC8701uF1;
import com.daaw.AbstractC9820yE1;
import com.daaw.FH1;
import com.daaw.HH1;
import com.daaw.IH1;
import com.daaw.PL1;
import com.daaw.TS1;
import com.daaw.WN1;
import com.daaw.YN1;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.internal.ads.zzbfc;

/* JADX INFO: loaded from: classes.dex */
public class AdLoader {
    public final zzp a;
    public final Context b;
    public final zzbn c;

    public AdLoader(Context context, zzbn zzbnVar, zzp zzpVar) {
        this.b = context;
        this.c = zzbnVar;
        this.a = zzpVar;
    }

    public final /* synthetic */ void a(zzdx zzdxVar) {
        try {
            this.c.zzg(this.a.zza(this.b, zzdxVar));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("Failed to load ad.", e);
        }
    }

    public final void b(final zzdx zzdxVar) {
        AbstractC9820yE1.a(this.b);
        if (((Boolean) AbstractC8701uF1.c.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ma)).booleanValue()) {
                TS1.b.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.a(zzdxVar);
                    }
                });
                return;
            }
        }
        try {
            this.c.zzg(this.a.zza(this.b, zzdxVar));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("Failed to load ad.", e);
        }
    }

    public boolean isLoading() {
        try {
            return this.c.zzi();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzk("Failed to check if ad is loading.", e);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        b(adRequest.a);
    }

    public void loadAds(AdRequest adRequest, int i) {
        try {
            this.c.zzh(this.a.zza(this.b, adRequest.a), i);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("Failed to load ads.", e);
        }
    }

    public static class Builder {
        public final Context a;
        public final zzbq b;

        public Builder(Context context, String str) {
            Context context2 = (Context) AbstractC7506py0.m(context, "context cannot be null");
            zzbq zzbqVarZzc = zzay.zza().zzc(context, str, new PL1());
            this.a = context2;
            this.b = zzbqVarZzc;
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.a, this.b.zze(), zzp.zza);
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Failed to build AdLoader.", e);
                return new AdLoader(this.a, new zzeu().zzc(), zzp.zza);
            }
        }

        public Builder forAdManagerAdView(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.b.zzj(new HH1(onAdManagerAdViewLoadedListener), new zzq(this.a, adSizeArr));
                return this;
            } catch (RemoteException e) {
                AbstractC4274eT1.zzk("Failed to add Google Ad Manager banner ad listener", e);
                return this;
            }
        }

        public Builder forCustomFormatAd(String str, NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            WN1 wn1 = new WN1(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.b.zzh(str, wn1.b(), wn1.a());
                return this;
            } catch (RemoteException e) {
                AbstractC4274eT1.zzk("Failed to add custom format ad listener", e);
                return this;
            }
        }

        @Deprecated
        public Builder forCustomTemplateAd(String str, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            FH1 fh1 = new FH1(onCustomTemplateAdLoadedListener, onCustomClickListener);
            try {
                this.b.zzh(str, fh1.e(), fh1.d());
                return this;
            } catch (RemoteException e) {
                AbstractC4274eT1.zzk("Failed to add custom template ad listener", e);
                return this;
            }
        }

        public Builder forNativeAd(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.b.zzk(new YN1(onNativeAdLoadedListener));
                return this;
            } catch (RemoteException e) {
                AbstractC4274eT1.zzk("Failed to add google native ad listener", e);
                return this;
            }
        }

        @Deprecated
        public Builder forUnifiedNativeAd(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.b.zzk(new IH1(onUnifiedNativeAdLoadedListener));
                return this;
            } catch (RemoteException e) {
                AbstractC4274eT1.zzk("Failed to add google native ad listener", e);
                return this;
            }
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.b.zzl(new com.google.android.gms.ads.internal.client.zzg(adListener));
                return this;
            } catch (RemoteException e) {
                AbstractC4274eT1.zzk("Failed to set AdListener.", e);
                return this;
            }
        }

        public Builder withAdManagerAdViewOptions(AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.b.zzm(adManagerAdViewOptions);
                return this;
            } catch (RemoteException e) {
                AbstractC4274eT1.zzk("Failed to specify Ad Manager banner ad options", e);
                return this;
            }
        }

        @Deprecated
        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.b.zzo(new zzbfc(nativeAdOptions));
                return this;
            } catch (RemoteException e) {
                AbstractC4274eT1.zzk("Failed to specify native ad options", e);
                return this;
            }
        }

        public Builder withNativeAdOptions(com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions) {
            try {
                this.b.zzo(new zzbfc(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzfl(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzc(), nativeAdOptions.getMediaAspectRatio(), nativeAdOptions.zza(), nativeAdOptions.zzb()));
                return this;
            } catch (RemoteException e) {
                AbstractC4274eT1.zzk("Failed to specify native ad options", e);
                return this;
            }
        }
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest) {
        b(adManagerAdRequest.a);
    }
}
