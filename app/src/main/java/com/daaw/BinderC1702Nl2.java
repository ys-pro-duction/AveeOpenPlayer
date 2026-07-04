package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdi;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Nl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC1702Nl2 extends zzdi {
    public final Map B = new HashMap();
    public final Context C;
    public final WeakReference D;
    public final C9685xl2 E;
    public final PS2 F;
    public final C1806Ol2 G;
    public C7447pl2 H;

    public BinderC1702Nl2(Context context, WeakReference weakReference, C9685xl2 c9685xl2, C1806Ol2 c1806Ol2, PS2 ps2) {
        this.C = context;
        this.D = weakReference;
        this.E = c9685xl2;
        this.F = ps2;
        this.G = c1806Ol2;
    }

    public static AdRequest h3() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        return builder.build();
    }

    public static String i3(Object obj) {
        ResponseInfo responseInfo;
        zzdn zzdnVarZzc;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else {
            if (!(obj instanceof AdView)) {
                if (obj instanceof NativeAd) {
                    responseInfo = ((NativeAd) obj).getResponseInfo();
                }
                return "";
            }
            responseInfo = ((AdView) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzdnVarZzc = responseInfo.zzc()) == null) {
            return "";
        }
        try {
            return zzdnVarZzc.zzh();
        } catch (RemoteException unused) {
        }
    }

    public final void c3(C7447pl2 c7447pl2) {
        this.H = c7447pl2;
    }

    public final synchronized void d3(String str, Object obj, String str2) {
        this.B.put(str, obj);
        j3(i3(obj), str2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void e3(final java.lang.String r7, java.lang.String r8, final java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.BinderC1702Nl2.e3(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final synchronized void f3(String str, String str2) {
        try {
            Activity activityA = this.E.a();
            if (activityA == null) {
                return;
            }
            Object obj = this.B.get(str);
            if (obj == null) {
                return;
            }
            AbstractC7582qE1 abstractC7582qE1 = AbstractC9820yE1.e9;
            if (!((Boolean) zzba.zzc().b(abstractC7582qE1)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
                this.B.remove(str);
            }
            k3(i3(obj), str2);
            if (obj instanceof AppOpenAd) {
                ((AppOpenAd) obj).show(activityA);
                return;
            }
            if (obj instanceof InterstitialAd) {
                ((InterstitialAd) obj).show(activityA);
                return;
            }
            if (obj instanceof RewardedAd) {
                ((RewardedAd) obj).show(activityA, new OnUserEarnedRewardListener() { // from class: com.daaw.zl2
                    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                    public final void onUserEarnedReward(RewardItem rewardItem) {
                    }
                });
                return;
            }
            if (obj instanceof RewardedInterstitialAd) {
                ((RewardedInterstitialAd) obj).show(activityA, new OnUserEarnedRewardListener() { // from class: com.daaw.Al2
                    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                    public final void onUserEarnedReward(RewardItem rewardItem) {
                    }
                });
                return;
            }
            if (((Boolean) zzba.zzc().b(abstractC7582qE1)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                Intent intent = new Intent();
                Context contextG3 = g3();
                intent.setClassName(contextG3, OutOfContextTestingActivity.CLASS_NAME);
                intent.putExtra(OutOfContextTestingActivity.AD_UNIT_KEY, str);
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzS(contextG3, intent);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Context g3() {
        Context context = (Context) this.D.get();
        return context == null ? this.C : context;
    }

    public final synchronized void j3(String str, String str2) {
        try {
            AbstractC7360pS2.r(this.H.b(str), new C1495Ll2(this, str2), this.F);
        } catch (NullPointerException e) {
            zzt.zzo().u(e, "OutOfContextTester.setAdAsOutOfContext");
            this.E.e(str2);
        }
    }

    public final synchronized void k3(String str, String str2) {
        try {
            AbstractC7360pS2.r(this.H.b(str), new C1598Ml2(this, str2), this.F);
        } catch (NullPointerException e) {
            zzt.zzo().u(e, "OutOfContextTester.setAdAsShown");
            this.E.e(str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdj
    public final void zze(String str, InterfaceC7934rX interfaceC7934rX, InterfaceC7934rX interfaceC7934rX2) {
        Context context = (Context) BinderC7744qp0.I(interfaceC7934rX);
        ViewGroup viewGroup = (ViewGroup) BinderC7744qp0.I(interfaceC7934rX2);
        if (context == null || viewGroup == null) {
            return;
        }
        Object obj = this.B.get(str);
        if (obj != null) {
            this.B.remove(str);
        }
        if (obj instanceof AdView) {
            C1806Ol2.a(context, viewGroup, (AdView) obj);
        } else if (obj instanceof NativeAd) {
            C1806Ol2.b(context, viewGroup, (NativeAd) obj);
        }
    }
}
