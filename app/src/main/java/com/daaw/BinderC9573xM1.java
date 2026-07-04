package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbrj;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.xM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC9573xM1 extends UL1 {
    public final Object B;
    public EM1 C;
    public InterfaceC6235lQ1 D;
    public InterfaceC7934rX E;
    public View F;
    public MediationInterstitialAd G;
    public UnifiedNativeAdMapper H;
    public MediationRewardedAd I;
    public MediationInterscrollerAd J;
    public MediationAppOpenAd K;
    public final String L = "";

    public BinderC9573xM1(Adapter adapter) {
        this.B = adapter;
    }

    public static final boolean f3(zzl zzlVar) {
        if (zzlVar.zzf) {
            return true;
        }
        zzay.zzb();
        return XS1.v();
    }

    public static final String g3(String str, zzl zzlVar) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzlVar.zzu;
        }
    }

    @Override // com.daaw.ZL1
    public final void B2(InterfaceC7934rX interfaceC7934rX, zzl zzlVar, String str, InterfaceC3689cM1 interfaceC3689cM1) throws RemoteException {
        D1(interfaceC7934rX, zzlVar, str, null, interfaceC3689cM1);
    }

    @Override // com.daaw.ZL1
    public final void D1(InterfaceC7934rX interfaceC7934rX, zzl zzlVar, String str, String str2, InterfaceC3689cM1 interfaceC3689cM1) throws RemoteException {
        Object obj = this.B;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof Adapter)) {
            AbstractC4274eT1.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        AbstractC4274eT1.zze("Requesting interstitial ad from adapter.");
        Object obj2 = this.B;
        if (!(obj2 instanceof MediationInterstitialAdapter)) {
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) BinderC7744qp0.I(interfaceC7934rX), "", e3(str, zzlVar, str2), d3(zzlVar), f3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, g3(str, zzlVar), this.L), new C8450tM1(this, interfaceC3689cM1));
                    return;
                } finally {
                    AbstractC4274eT1.zzh("", th);
                    RemoteException remoteException = new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
            List list = zzlVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = zzlVar.zzb;
            C7056oM1 c7056oM1 = new C7056oM1(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, f3(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, g3(str, zzlVar));
            Bundle bundle = zzlVar.zzm;
            mediationInterstitialAdapter.requestInterstitialAd((Context) BinderC7744qp0.I(interfaceC7934rX), new EM1(interfaceC3689cM1), e3(str, zzlVar, str2), c7056oM1, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            throw new RemoteException();
        }
    }

    @Override // com.daaw.ZL1
    public final void G0(InterfaceC7934rX interfaceC7934rX) throws RemoteException {
        Object obj = this.B;
        if (obj instanceof Adapter) {
            AbstractC4274eT1.zze("Show app open ad from adapter.");
            MediationAppOpenAd mediationAppOpenAd = this.K;
            if (mediationAppOpenAd != null) {
                mediationAppOpenAd.showAd((Context) BinderC7744qp0.I(interfaceC7934rX));
                return;
            } else {
                AbstractC4274eT1.zzg("Can not show null mediation app open ad.");
                throw new RemoteException();
            }
        }
        AbstractC4274eT1.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.daaw.ZL1
    public final void J1(InterfaceC7934rX interfaceC7934rX) throws RemoteException {
        Object obj = this.B;
        if (obj instanceof Adapter) {
            AbstractC4274eT1.zze("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.I;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) BinderC7744qp0.I(interfaceC7934rX));
                return;
            } else {
                AbstractC4274eT1.zzg("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        }
        AbstractC4274eT1.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.daaw.ZL1
    public final void K(InterfaceC7934rX interfaceC7934rX, zzl zzlVar, String str, InterfaceC6235lQ1 interfaceC6235lQ1, String str2) throws RemoteException {
        Object obj = this.B;
        if ((obj instanceof Adapter) || AbstractC7335pM1.a(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.E = interfaceC7934rX;
            this.D = interfaceC6235lQ1;
            interfaceC6235lQ1.u1(BinderC7744qp0.Z2(this.B));
            return;
        }
        Object obj2 = this.B;
        AbstractC4274eT1.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.daaw.ZL1
    public final void K1(boolean z) {
        Object obj = this.B;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                AbstractC4274eT1.zzh("", th);
                return;
            }
        }
        AbstractC4274eT1.zze(OnImmersiveModeUpdatedListener.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
    }

    @Override // com.daaw.ZL1
    public final void M0(InterfaceC7934rX interfaceC7934rX, zzl zzlVar, String str, InterfaceC3689cM1 interfaceC3689cM1) throws RemoteException {
        Object obj = this.B;
        if (obj instanceof Adapter) {
            AbstractC4274eT1.zze("Requesting app open ad from adapter.");
            try {
                ((Adapter) this.B).loadAppOpenAd(new MediationAppOpenAdConfiguration((Context) BinderC7744qp0.I(interfaceC7934rX), "", e3(str, zzlVar, null), d3(zzlVar), f3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, g3(str, zzlVar), ""), new C9294wM1(this, interfaceC3689cM1));
                return;
            } catch (Exception e) {
                AbstractC4274eT1.zzh("", e);
                throw new RemoteException();
            }
        }
        AbstractC4274eT1.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.daaw.ZL1
    public final void O1(InterfaceC7934rX interfaceC7934rX, zzq zzqVar, zzl zzlVar, String str, String str2, InterfaceC3689cM1 interfaceC3689cM1) throws RemoteException {
        Object obj = this.B;
        if (obj instanceof Adapter) {
            AbstractC4274eT1.zze("Requesting interscroller ad from adapter.");
            try {
                Adapter adapter = (Adapter) this.B;
                adapter.loadInterscrollerAd(new MediationBannerAdConfiguration((Context) BinderC7744qp0.I(interfaceC7934rX), "", e3(str, zzlVar, str2), d3(zzlVar), f3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, g3(str, zzlVar), zzb.zze(zzqVar.zze, zzqVar.zzb), ""), new C7614qM1(this, interfaceC3689cM1, adapter));
                return;
            } catch (Exception e) {
                AbstractC4274eT1.zzh("", e);
                throw new RemoteException();
            }
        }
        AbstractC4274eT1.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.daaw.ZL1
    public final void U(InterfaceC7934rX interfaceC7934rX, zzq zzqVar, zzl zzlVar, String str, InterfaceC3689cM1 interfaceC3689cM1) throws RemoteException {
        t2(interfaceC7934rX, zzqVar, zzlVar, str, null, interfaceC3689cM1);
    }

    @Override // com.daaw.ZL1
    public final void V1(InterfaceC7934rX interfaceC7934rX, InterfaceC6235lQ1 interfaceC6235lQ1, List list) throws RemoteException {
        AbstractC4274eT1.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.daaw.ZL1
    public final void W0(InterfaceC7934rX interfaceC7934rX, zzl zzlVar, String str, InterfaceC3689cM1 interfaceC3689cM1) throws RemoteException {
        Object obj = this.B;
        if (obj instanceof Adapter) {
            AbstractC4274eT1.zze("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) this.B).loadRewardedAd(new MediationRewardedAdConfiguration((Context) BinderC7744qp0.I(interfaceC7934rX), "", e3(str, zzlVar, null), d3(zzlVar), f3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, g3(str, zzlVar), ""), new C9015vM1(this, interfaceC3689cM1));
                return;
            } catch (Exception e) {
                AbstractC4274eT1.zzh("", e);
                throw new RemoteException();
            }
        }
        AbstractC4274eT1.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.daaw.ZL1
    public final void Y2(zzl zzlVar, String str, String str2) throws RemoteException {
        Object obj = this.B;
        if (obj instanceof Adapter) {
            W0(this.E, zzlVar, str, new FM1((Adapter) obj, this.D));
            return;
        }
        AbstractC4274eT1.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.daaw.ZL1
    public final void c() throws RemoteException {
        Object obj = this.B;
        if (obj instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.I;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) BinderC7744qp0.I(this.E));
                return;
            } else {
                AbstractC4274eT1.zzg("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        }
        AbstractC4274eT1.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.daaw.ZL1
    public final void d2(InterfaceC7934rX interfaceC7934rX, zzl zzlVar, String str, String str2, InterfaceC3689cM1 interfaceC3689cM1, zzbfc zzbfcVar, List list) throws RemoteException {
        Object obj = this.B;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof Adapter)) {
            AbstractC4274eT1.zzj(MediationNativeAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        AbstractC4274eT1.zze("Requesting native ad from adapter.");
        Object obj2 = this.B;
        if (!(obj2 instanceof MediationNativeAdapter)) {
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadNativeAd(new MediationNativeAdConfiguration((Context) BinderC7744qp0.I(interfaceC7934rX), "", e3(str, zzlVar, str2), d3(zzlVar), f3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, g3(str, zzlVar), this.L, zzbfcVar), new C8729uM1(this, interfaceC3689cM1));
                    return;
                } finally {
                    AbstractC4274eT1.zzh("", th);
                    RemoteException remoteException = new RemoteException();
                }
            }
            return;
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
            List list2 = zzlVar.zze;
            HashSet hashSet = list2 != null ? new HashSet(list2) : null;
            long j = zzlVar.zzb;
            GM1 gm1 = new GM1(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, f3(zzlVar), zzlVar.zzg, zzbfcVar, list, zzlVar.zzr, zzlVar.zzt, g3(str, zzlVar));
            Bundle bundle = zzlVar.zzm;
            Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.C = new EM1(interfaceC3689cM1);
            mediationNativeAdapter.requestNativeAd((Context) BinderC7744qp0.I(interfaceC7934rX), this.C, e3(str, zzlVar, str2), gm1, bundle2);
        } catch (Throwable th) {
            throw new RemoteException();
        }
    }

    public final Bundle d3(zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.B.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    public final Bundle e3(String str, zzl zzlVar, String str2) throws RemoteException {
        AbstractC4274eT1.zze("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.B instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzlVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzlVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            AbstractC4274eT1.zzh("", th);
            throw new RemoteException();
        }
    }

    @Override // com.daaw.ZL1
    public final void f() throws RemoteException {
        Object obj = this.B;
        if (obj instanceof MediationInterstitialAdapter) {
            AbstractC4274eT1.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.B).showInterstitial();
                return;
            } catch (Throwable th) {
                AbstractC4274eT1.zzh("", th);
                throw new RemoteException();
            }
        }
        AbstractC4274eT1.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.daaw.ZL1
    public final void g2(InterfaceC7934rX interfaceC7934rX) {
        Context context = (Context) BinderC7744qp0.I(interfaceC7934rX);
        Object obj = this.B;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.daaw.ZL1
    public final void h() throws RemoteException {
        Object obj = this.B;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                AbstractC4274eT1.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.daaw.ZL1
    public final void j2(zzl zzlVar, String str) throws RemoteException {
        Y2(zzlVar, str, null);
    }

    @Override // com.daaw.ZL1
    public final boolean k() {
        return false;
    }

    @Override // com.daaw.ZL1
    public final void t2(InterfaceC7934rX interfaceC7934rX, zzq zzqVar, zzl zzlVar, String str, String str2, InterfaceC3689cM1 interfaceC3689cM1) throws RemoteException {
        Object obj = this.B;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof Adapter)) {
            AbstractC4274eT1.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        AbstractC4274eT1.zze("Requesting banner ad from adapter.");
        AdSize adSizeZzd = zzqVar.zzn ? zzb.zzd(zzqVar.zze, zzqVar.zzb) : zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza);
        Object obj2 = this.B;
        if (!(obj2 instanceof MediationBannerAdapter)) {
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadBannerAd(new MediationBannerAdConfiguration((Context) BinderC7744qp0.I(interfaceC7934rX), "", e3(str, zzlVar, str2), d3(zzlVar), f3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, g3(str, zzlVar), adSizeZzd, this.L), new C8171sM1(this, interfaceC3689cM1));
                    return;
                } finally {
                    AbstractC4274eT1.zzh("", th);
                    RemoteException remoteException = new RemoteException();
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
            List list = zzlVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = zzlVar.zzb;
            C7056oM1 c7056oM1 = new C7056oM1(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, f3(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, g3(str, zzlVar));
            Bundle bundle = zzlVar.zzm;
            mediationBannerAdapter.requestBannerAd((Context) BinderC7744qp0.I(interfaceC7934rX), new EM1(interfaceC3689cM1), e3(str, zzlVar, str2), adSizeZzd, c7056oM1, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            throw new RemoteException();
        }
    }

    @Override // com.daaw.ZL1
    public final void v1(InterfaceC7934rX interfaceC7934rX) throws RemoteException {
        Object obj = this.B;
        if ((obj instanceof Adapter) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                f();
                return;
            }
            AbstractC4274eT1.zze("Show interstitial ad from adapter.");
            MediationInterstitialAd mediationInterstitialAd = this.G;
            if (mediationInterstitialAd != null) {
                mediationInterstitialAd.showAd((Context) BinderC7744qp0.I(interfaceC7934rX));
                return;
            } else {
                AbstractC4274eT1.zzg("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        AbstractC4274eT1.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    @Override // com.daaw.ZL1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w2(com.daaw.InterfaceC7934rX r6, com.daaw.VJ1 r7, java.util.List r8) throws android.os.RemoteException {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.BinderC9573xM1.w2(com.daaw.rX, com.daaw.VJ1, java.util.List):void");
    }

    @Override // com.daaw.ZL1
    public final void x1(InterfaceC7934rX interfaceC7934rX, zzl zzlVar, String str, InterfaceC3689cM1 interfaceC3689cM1) throws RemoteException {
        Object obj = this.B;
        if (obj instanceof Adapter) {
            AbstractC4274eT1.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) this.B).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) BinderC7744qp0.I(interfaceC7934rX), "", e3(str, zzlVar, null), d3(zzlVar), f3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, g3(str, zzlVar), ""), new C9015vM1(this, interfaceC3689cM1));
                return;
            } catch (Exception e) {
                AbstractC4274eT1.zzh("", e);
                throw new RemoteException();
            }
        }
        AbstractC4274eT1.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.daaw.ZL1
    public final void zzE() throws RemoteException {
        Object obj = this.B;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                AbstractC4274eT1.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.daaw.ZL1
    public final boolean zzN() throws RemoteException {
        Object obj = this.B;
        if ((obj instanceof Adapter) || AbstractC7335pM1.a(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.D != null;
        }
        Object obj2 = this.B;
        AbstractC4274eT1.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.daaw.ZL1
    public final C5093hM1 zzO() {
        return null;
    }

    @Override // com.daaw.ZL1
    public final C5372iM1 zzP() {
        return null;
    }

    @Override // com.daaw.ZL1
    public final Bundle zze() {
        return new Bundle();
    }

    @Override // com.daaw.ZL1
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override // com.daaw.ZL1
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.daaw.ZL1
    public final zzdq zzh() {
        Object obj = this.B;
        if (obj instanceof zza) {
            try {
                return ((zza) obj).getVideoController();
            } catch (Throwable th) {
                AbstractC4274eT1.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.daaw.ZL1
    public final QG1 zzi() {
        EM1 em1 = this.C;
        if (em1 == null) {
            return null;
        }
        NativeCustomTemplateAd nativeCustomTemplateAdA = em1.a();
        if (nativeCustomTemplateAdA instanceof RG1) {
            return ((RG1) nativeCustomTemplateAdA).a();
        }
        return null;
    }

    @Override // com.daaw.ZL1
    public final InterfaceC4525fM1 zzj() {
        MediationInterscrollerAd mediationInterscrollerAd = this.J;
        if (mediationInterscrollerAd != null) {
            return new BinderC9852yM1(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.daaw.ZL1
    public final InterfaceC6219lM1 zzk() {
        UnifiedNativeAdMapper unifiedNativeAdMapper;
        UnifiedNativeAdMapper unifiedNativeAdMapperB;
        Object obj = this.B;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof Adapter) || (unifiedNativeAdMapper = this.H) == null) {
                return null;
            }
            return new HM1(unifiedNativeAdMapper);
        }
        EM1 em1 = this.C;
        if (em1 == null || (unifiedNativeAdMapperB = em1.b()) == null) {
            return null;
        }
        return new HM1(unifiedNativeAdMapperB);
    }

    @Override // com.daaw.ZL1
    public final zzbrj zzl() {
        Object obj = this.B;
        if (obj instanceof Adapter) {
            return zzbrj.e(((Adapter) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.daaw.ZL1
    public final zzbrj zzm() {
        Object obj = this.B;
        if (obj instanceof Adapter) {
            return zzbrj.e(((Adapter) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.daaw.ZL1
    public final InterfaceC7934rX zzn() throws RemoteException {
        Object obj = this.B;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return BinderC7744qp0.Z2(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                AbstractC4274eT1.zzh("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof Adapter) {
            return BinderC7744qp0.Z2(this.F);
        }
        AbstractC4274eT1.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.daaw.ZL1
    public final void zzo() throws RemoteException {
        Object obj = this.B;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                AbstractC4274eT1.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    public BinderC9573xM1(MediationAdapter mediationAdapter) {
        this.B = mediationAdapter;
    }
}
