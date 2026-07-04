package com.daaw;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public final class EE1 {
    public final String a = (String) AbstractC7586qF1.b.e();
    public final Map b;
    public final Context c;
    public final String d;

    public EE1(Context context, String str) {
        this.c = context;
        this.d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        zzt.zzp();
        linkedHashMap.put("device", com.google.android.gms.ads.internal.util.zzt.zzr());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        zzt.zzp();
        linkedHashMap.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzt.zzD(context) ? "0" : "1");
        Future futureB = zzt.zzm().b(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((KP1) futureB.get()).k));
            linkedHashMap.put("network_fine", Integer.toString(((KP1) futureB.get()).l));
        } catch (Exception e) {
            zzt.zzo().u(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.qa)).booleanValue()) {
            Map map = this.b;
            zzt.zzp();
            map.put("is_bstar", true != com.google.android.gms.ads.internal.util.zzt.zzA(context) ? "0" : "1");
        }
    }

    public final Context a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final Map d() {
        return this.b;
    }
}
