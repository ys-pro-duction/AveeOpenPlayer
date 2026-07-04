package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.daaw.yn3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9975yn3 {
    public final Context a;
    public final String b;
    public final Map c = new TreeMap();
    public String d;
    public String e;
    public final String f;

    public C9975yn3(Context context, String str) {
        String strConcat;
        this.a = context.getApplicationContext();
        this.b = str;
        String packageName = context.getPackageName();
        try {
            strConcat = packageName + "-" + C6878nj1.a(context).f(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            AbstractC4274eT1.zzh("Unable to get package version name for reporting", e);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.f = strConcat;
    }

    public final String a() {
        return this.f;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.d;
    }

    public final Map e() {
        return this.c;
    }

    public final void f(zzl zzlVar, zzcaz zzcazVar) {
        this.d = zzlVar.zzj.zza;
        Bundle bundle = zzlVar.zzm;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) AbstractC5903kF1.c.e();
        for (String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.e = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.c.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        this.c.put("SDKVersion", zzcazVar.B);
        if (((Boolean) AbstractC5903kF1.a.e()).booleanValue()) {
            Bundle bundleZzb = zzad.zzb(this.a, (String) AbstractC5903kF1.b.e());
            for (String str3 : bundleZzb.keySet()) {
                this.c.put(str3, bundleZzb.get(str3).toString());
            }
        }
    }
}
