package com.daaw;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* JADX INFO: loaded from: classes3.dex */
public final class EM1 implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {
    public final InterfaceC3689cM1 a;
    public UnifiedNativeAdMapper b;
    public NativeCustomTemplateAd c;

    public EM1(InterfaceC3689cM1 interfaceC3689cM1) {
        this.a = interfaceC3689cM1;
    }

    public final NativeCustomTemplateAd a() {
        return this.c;
    }

    public final UnifiedNativeAdMapper b() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdClicked.");
        try {
            this.a.zze();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdClosed.");
        try {
            this.a.zzf();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdFailedToLoad with error. " + i);
        try {
            this.a.b(i);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.b;
        if (this.c == null) {
            if (unifiedNativeAdMapper == null) {
                AbstractC4274eT1.zzl("#007 Could not call remote method.", null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideImpressionRecording()) {
                AbstractC4274eT1.zze("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        AbstractC4274eT1.zze("Adapter called onAdImpression.");
        try {
            this.a.zzm();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdLeftApplication.");
        try {
            this.a.zzn();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdLoaded.");
        try {
            this.a.zzo();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdOpened.");
        try {
            this.a.zzp();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onVideoEnd.");
        try {
            this.a.zzv();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zzc(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdLoaded with template id ".concat(String.valueOf(nativeCustomTemplateAd.getCustomTemplateId())));
        this.c = nativeCustomTemplateAd;
        try {
            this.a.zzo();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void zzd(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAppEvent.");
        try {
            this.a.X1(str, str2);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zze(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        if (!(nativeCustomTemplateAd instanceof RG1)) {
            AbstractC4274eT1.zzj("Unexpected native custom template ad type.");
            return;
        }
        try {
            this.a.R0(((RG1) nativeCustomTemplateAd).a(), str);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdClicked.");
        try {
            this.a.zze();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdClosed.");
        try {
            this.a.zzf();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, AdError adError) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError.getCode() + ". ErrorMessage: " + adError.getMessage() + ". ErrorDomain: " + adError.getDomain());
        try {
            this.a.l0(adError.zza());
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdLeftApplication.");
        try {
            this.a.zzn();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdLoaded.");
        try {
            this.a.zzo();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdOpened.");
        try {
            this.a.zzp();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.b;
        if (this.c == null) {
            if (unifiedNativeAdMapper == null) {
                AbstractC4274eT1.zzl("#007 Could not call remote method.", null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideClickHandling()) {
                AbstractC4274eT1.zze("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        AbstractC4274eT1.zze("Adapter called onAdClicked.");
        try {
            this.a.zze();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdClosed.");
        try {
            this.a.zzf();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdLeftApplication.");
        try {
            this.a.zzn();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdLoaded.");
        this.b = unifiedNativeAdMapper;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            VideoController videoController = new VideoController();
            videoController.zzb(new BinderC6498mM1());
            if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.hasVideoContent()) {
                unifiedNativeAdMapper.zze(videoController);
            }
        }
        try {
            this.a.zzo();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdOpened.");
        try {
            this.a.zzp();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.a.b(i);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, AdError adError) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError.getCode() + ". ErrorMessage: " + adError.getMessage() + ". ErrorDomain: " + adError.getDomain());
        try {
            this.a.l0(adError.zza());
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.a.b(i);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, AdError adError) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError.getCode() + ". ErrorMessage: " + adError.getMessage() + ". ErrorDomain: " + adError.getDomain());
        try {
            this.a.l0(adError.zza());
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }
}
