package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.daaw.AbstractC10159zT1;
import com.daaw.AbstractC4274eT1;
import com.daaw.AbstractC6773nL1;
import com.daaw.AbstractC7360pS2;
import com.daaw.AbstractC7582qE1;
import com.daaw.AbstractC9322wT1;
import com.daaw.AbstractC9820yE1;
import com.daaw.C6243lS1;
import com.daaw.C6878nj1;
import com.daaw.C9011vL1;
import com.daaw.DI2;
import com.daaw.EI2;
import com.daaw.InterfaceC4810gL1;
import com.daaw.InterfaceC5927kL1;
import com.daaw.InterfaceFutureC8236sc0;
import com.daaw.PS2;
import com.daaw.WI2;
import com.daaw.WR2;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzcaz;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zze {
    public Context a;
    public long b = 0;

    public final void a(Context context, zzcaz zzcazVar, boolean z, C6243lS1 c6243lS1, String str, String str2, Runnable runnable, final WI2 wi2) {
        PackageInfo packageInfoF;
        if (zzt.zzB().b() - this.b < 5000) {
            AbstractC4274eT1.zzj("Not retrying to fetch app settings");
            return;
        }
        this.b = zzt.zzB().b();
        if (c6243lS1 != null && !TextUtils.isEmpty(c6243lS1.c())) {
            if (zzt.zzB().a() - c6243lS1.a() <= ((Long) zzba.zzc().b(AbstractC9820yE1.U3)).longValue() && c6243lS1.i()) {
                return;
            }
        }
        if (context == null) {
            AbstractC4274eT1.zzj("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            AbstractC4274eT1.zzj("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.a = applicationContext;
        final EI2 ei2A = DI2.a(context, 4);
        ei2A.zzh();
        C9011vL1 c9011vL1A = zzt.zzf().a(this.a, zzcazVar, wi2);
        InterfaceC5927kL1 interfaceC5927kL1 = AbstractC6773nL1.b;
        InterfaceC4810gL1 interfaceC4810gL1A = c9011vL1A.a("google.afma.config.fetchAppSettings", interfaceC5927kL1, interfaceC5927kL1);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            AbstractC7582qE1 abstractC7582qE1 = AbstractC9820yE1.a;
            jSONObject.put("experiment_ids", TextUtils.join(",", zzba.zza().a()));
            jSONObject.put("js", zzcazVar.B);
            try {
                ApplicationInfo applicationInfo = this.a.getApplicationInfo();
                if (applicationInfo != null && (packageInfoF = C6878nj1.a(context).f(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", packageInfoF.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            InterfaceFutureC8236sc0 interfaceFutureC8236sc0A = interfaceC4810gL1A.a(jSONObject);
            WR2 wr2 = new WR2() { // from class: com.google.android.gms.ads.internal.zzd
                @Override // com.daaw.WR2
                public final InterfaceFutureC8236sc0 zza(Object obj) throws JSONException {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean zOptBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (zOptBoolean) {
                        zzt.zzo().h().zzu(jSONObject2.getString("appSettingsJson"));
                    }
                    EI2 ei2 = ei2A;
                    WI2 wi22 = wi2;
                    ei2.zzf(zOptBoolean);
                    wi22.b(ei2.zzl());
                    return AbstractC7360pS2.h(null);
                }
            };
            PS2 ps2 = AbstractC9322wT1.f;
            InterfaceFutureC8236sc0 interfaceFutureC8236sc0N = AbstractC7360pS2.n(interfaceFutureC8236sc0A, wr2, ps2);
            if (runnable != null) {
                interfaceFutureC8236sc0A.g(runnable, ps2);
            }
            AbstractC10159zT1.a(interfaceFutureC8236sc0N, "ConfigLoader.maybeFetchNewAppSettings");
        } catch (Exception e) {
            AbstractC4274eT1.zzh("Error requesting application settings", e);
            ei2A.e(e);
            ei2A.zzf(false);
            wi2.b(ei2A.zzl());
        }
    }

    public final void zza(Context context, zzcaz zzcazVar, String str, Runnable runnable, WI2 wi2) {
        a(context, zzcazVar, true, null, str, null, runnable, wi2);
    }

    public final void zzc(Context context, zzcaz zzcazVar, String str, C6243lS1 c6243lS1, WI2 wi2) {
        a(context, zzcazVar, false, c6243lS1, c6243lS1 != null ? c6243lS1.b() : null, str, null, wi2);
    }
}
