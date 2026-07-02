package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.daaw.AbstractC4274eT1;
import com.daaw.AbstractC7506py0;
import com.daaw.BinderC7744qp0;
import com.daaw.GO1;
import com.daaw.InterfaceC3156aS1;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* JADX INFO: loaded from: classes.dex */
public class MobileAds {
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    public static void disableMediationAdapterInitialization(Context context) {
        zzej.zzf().zzl(context);
    }

    public static void enableSameAppKey(boolean z) {
        zzej.zzf().zzm(z);
    }

    public static InitializationStatus getInitializationStatus() {
        return zzej.zzf().zze();
    }

    public static RequestConfiguration getRequestConfiguration() {
        return zzej.zzf().zzc();
    }

    public static VersionInfo getVersion() {
        zzej.zzf();
        String[] strArrSplit = TextUtils.split("22.5.0", "\\.");
        if (strArrSplit.length != 3) {
            return new VersionInfo(0, 0, 0);
        }
        try {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        } catch (NumberFormatException unused) {
            return new VersionInfo(0, 0, 0);
        }
    }

    public static void initialize(Context context) {
        zzej.zzf().zzn(context, null, null);
    }

    public static void openAdInspector(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        zzej.zzf().zzq(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(Context context, String str) {
        zzej.zzf().zzr(context, str);
    }

    public static void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        zzej.zzf().zzs(cls);
    }

    public static void registerWebView(WebView webView) {
        zzej.zzf();
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        if (webView == null) {
            AbstractC4274eT1.zzg("The webview to be registered cannot be null.");
            return;
        }
        InterfaceC3156aS1 interfaceC3156aS1A = GO1.a(webView.getContext());
        if (interfaceC3156aS1A == null) {
            AbstractC4274eT1.zzj("Internal error, query info generator is null.");
            return;
        }
        try {
            interfaceC3156aS1A.zzi(BinderC7744qp0.Z2(webView));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    public static void setAppMuted(boolean z) {
        zzej.zzf().zzt(z);
    }

    public static void setAppVolume(float f) {
        zzej.zzf().zzu(f);
    }

    private static void setPlugin(String str) {
        zzej.zzf().zzv(str);
    }

    public static void setRequestConfiguration(RequestConfiguration requestConfiguration) {
        zzej.zzf().zzw(requestConfiguration);
    }

    public static void initialize(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        zzej.zzf().zzn(context, null, onInitializationCompleteListener);
    }
}
