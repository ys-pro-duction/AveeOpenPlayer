package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import com.daaw.AbstractC4274eT1;
import com.daaw.BinderC9431wq2;
import com.daaw.C4858gX1;
import com.daaw.C6454mB1;
import com.daaw.FW1;
import com.daaw.InterfaceC9334wW1;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class zzab {
    public zzab() {
    }

    public static zzab zzo(int i) {
        return i >= 30 ? new zzz() : i >= 28 ? new zzy() : i >= 26 ? new zzw() : i >= 24 ? new zzv() : i >= 21 ? new zzu() : new zzab();
    }

    public int zza() {
        return 1;
    }

    public CookieManager zzb(Context context) {
        com.google.android.gms.ads.internal.zzt.zzp();
        if (zzt.zzE()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            AbstractC4274eT1.zzh("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzt.zzo().u(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public WebResourceResponse zzc(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public FW1 zzd(InterfaceC9334wW1 interfaceC9334wW1, C6454mB1 c6454mB1, boolean z, BinderC9431wq2 binderC9431wq2) {
        return new C4858gX1(interfaceC9334wW1, c6454mB1, z, binderC9431wq2);
    }

    public boolean zze(Activity activity, Configuration configuration) {
        return false;
    }

    public Intent zzg(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public void zzh(Context context, String str, String str2) {
    }

    public boolean zzi(Context context, String str) {
        return false;
    }

    public int zzj(Context context, TelephonyManager telephonyManager) {
        return 1001;
    }

    public int zzk(AudioManager audioManager) {
        return 0;
    }

    public void zzl(Activity activity) {
    }

    public int zzn(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    public /* synthetic */ zzab(zzaa zzaaVar) {
    }
}
