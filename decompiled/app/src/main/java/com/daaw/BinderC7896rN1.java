package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbrj;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.rN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC7896rN1 extends YM1 {
    public final RtbAdapter B;
    public MediationInterstitialAd C;
    public MediationRewardedAd D;
    public MediationAppOpenAd E;
    public String F = "";

    public BinderC7896rN1(RtbAdapter rtbAdapter) {
        this.B = rtbAdapter;
    }

    public static final Bundle e3(String str) throws RemoteException {
        AbstractC4274eT1.zzj("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            AbstractC4274eT1.zzh("", e);
            throw new RemoteException();
        }
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

    @Override // com.daaw.ZM1
    public final void G2(String str) {
        this.F = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    @Override // com.daaw.ZM1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H2(com.daaw.InterfaceC7934rX r4, java.lang.String r5, android.os.Bundle r6, android.os.Bundle r7, com.google.android.gms.ads.internal.client.zzq r8, com.daaw.InterfaceC3693cN1 r9) throws android.os.RemoteException {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.BinderC7896rN1.H2(com.daaw.rX, java.lang.String, android.os.Bundle, android.os.Bundle, com.google.android.gms.ads.internal.client.zzq, com.daaw.cN1):void");
    }

    @Override // com.daaw.ZM1
    public final void K0(String str, String str2, zzl zzlVar, InterfaceC7934rX interfaceC7934rX, KM1 km1, InterfaceC3689cM1 interfaceC3689cM1) throws RemoteException {
        try {
            this.B.loadRtbAppOpenAd(new MediationAppOpenAdConfiguration((Context) BinderC7744qp0.I(interfaceC7934rX), str, e3(str2), d3(zzlVar), f3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, g3(str2, zzlVar), this.F), new C7060oN1(this, km1, interfaceC3689cM1));
        } catch (Throwable th) {
            AbstractC4274eT1.zzh("Adapter failed to render app open ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.daaw.ZM1
    public final void Q(String str, String str2, zzl zzlVar, InterfaceC7934rX interfaceC7934rX, WM1 wm1, InterfaceC3689cM1 interfaceC3689cM1) throws RemoteException {
        try {
            this.B.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) BinderC7744qp0.I(interfaceC7934rX), str, e3(str2), d3(zzlVar), f3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, g3(str2, zzlVar), this.F), new C7618qN1(this, wm1, interfaceC3689cM1));
        } catch (Throwable th) {
            AbstractC4274eT1.zzh("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.daaw.ZM1
    public final void Q0(String str, String str2, zzl zzlVar, InterfaceC7934rX interfaceC7934rX, NM1 nm1, InterfaceC3689cM1 interfaceC3689cM1, zzq zzqVar) throws RemoteException {
        try {
            this.B.loadRtbBannerAd(new MediationBannerAdConfiguration((Context) BinderC7744qp0.I(interfaceC7934rX), str, e3(str2), d3(zzlVar), f3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, g3(str2, zzlVar), zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.F), new C5935kN1(this, nm1, interfaceC3689cM1));
        } catch (Throwable th) {
            AbstractC4274eT1.zzh("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.daaw.ZM1
    public final void Q2(String str, String str2, zzl zzlVar, InterfaceC7934rX interfaceC7934rX, WM1 wm1, InterfaceC3689cM1 interfaceC3689cM1) throws RemoteException {
        try {
            this.B.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) BinderC7744qp0.I(interfaceC7934rX), str, e3(str2), d3(zzlVar), f3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, g3(str2, zzlVar), this.F), new C7618qN1(this, wm1, interfaceC3689cM1));
        } catch (Throwable th) {
            AbstractC4274eT1.zzh("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.daaw.ZM1
    public final void X0(String str, String str2, zzl zzlVar, InterfaceC7934rX interfaceC7934rX, TM1 tm1, InterfaceC3689cM1 interfaceC3689cM1, zzbfc zzbfcVar) throws RemoteException {
        try {
            this.B.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) BinderC7744qp0.I(interfaceC7934rX), str, e3(str2), d3(zzlVar), f3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, g3(str2, zzlVar), this.F, zzbfcVar), new C6781nN1(this, tm1, interfaceC3689cM1));
        } catch (Throwable th) {
            AbstractC4274eT1.zzh("Adapter failed to render native ad.", th);
            throw new RemoteException();
        }
    }

    public final Bundle d3(zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.B.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // com.daaw.ZM1
    public final void f0(String str, String str2, zzl zzlVar, InterfaceC7934rX interfaceC7934rX, TM1 tm1, InterfaceC3689cM1 interfaceC3689cM1) throws RemoteException {
        X0(str, str2, zzlVar, interfaceC7934rX, tm1, interfaceC3689cM1, null);
    }

    @Override // com.daaw.ZM1
    public final void h0(String str, String str2, zzl zzlVar, InterfaceC7934rX interfaceC7934rX, QM1 qm1, InterfaceC3689cM1 interfaceC3689cM1) throws RemoteException {
        try {
            this.B.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) BinderC7744qp0.I(interfaceC7934rX), str, e3(str2), d3(zzlVar), f3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, g3(str2, zzlVar), this.F), new C6502mN1(this, qm1, interfaceC3689cM1));
        } catch (Throwable th) {
            AbstractC4274eT1.zzh("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.daaw.ZM1
    public final void j1(String str, String str2, zzl zzlVar, InterfaceC7934rX interfaceC7934rX, NM1 nm1, InterfaceC3689cM1 interfaceC3689cM1, zzq zzqVar) throws RemoteException {
        try {
            this.B.loadRtbInterscrollerAd(new MediationBannerAdConfiguration((Context) BinderC7744qp0.I(interfaceC7934rX), str, e3(str2), d3(zzlVar), f3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, g3(str2, zzlVar), zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.F), new C6223lN1(this, nm1, interfaceC3689cM1));
        } catch (Throwable th) {
            AbstractC4274eT1.zzh("Adapter failed to render interscroller ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.daaw.ZM1
    public final boolean s(InterfaceC7934rX interfaceC7934rX) {
        MediationAppOpenAd mediationAppOpenAd = this.E;
        if (mediationAppOpenAd == null) {
            return false;
        }
        try {
            mediationAppOpenAd.showAd((Context) BinderC7744qp0.I(interfaceC7934rX));
            return true;
        } catch (Throwable th) {
            AbstractC4274eT1.zzh("", th);
            return true;
        }
    }

    @Override // com.daaw.ZM1
    public final boolean z(InterfaceC7934rX interfaceC7934rX) {
        MediationInterstitialAd mediationInterstitialAd = this.C;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) BinderC7744qp0.I(interfaceC7934rX));
            return true;
        } catch (Throwable th) {
            AbstractC4274eT1.zzh("", th);
            return true;
        }
    }

    @Override // com.daaw.ZM1
    public final boolean z1(InterfaceC7934rX interfaceC7934rX) {
        MediationRewardedAd mediationRewardedAd = this.D;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) BinderC7744qp0.I(interfaceC7934rX));
            return true;
        } catch (Throwable th) {
            AbstractC4274eT1.zzh("", th);
            return true;
        }
    }

    @Override // com.daaw.ZM1
    public final zzdq zze() {
        MediationExtrasReceiver mediationExtrasReceiver = this.B;
        if (mediationExtrasReceiver instanceof zza) {
            try {
                return ((zza) mediationExtrasReceiver).getVideoController();
            } catch (Throwable th) {
                AbstractC4274eT1.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.daaw.ZM1
    public final zzbrj zzf() {
        return zzbrj.e(this.B.getVersionInfo());
    }

    @Override // com.daaw.ZM1
    public final zzbrj zzg() {
        return zzbrj.e(this.B.getSDKVersionInfo());
    }
}
