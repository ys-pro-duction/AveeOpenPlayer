package com.daaw;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.uI2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8714uI2 {
    public final Context a;
    public final String b;
    public final String c;

    public C8714uI2(Context context, zzcaz zzcazVar) {
        this.a = context;
        this.b = context.getPackageName();
        this.c = zzcazVar.B;
    }

    public final void a(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzt.zzp();
        map.put("device", com.google.android.gms.ads.internal.util.zzt.zzr());
        map.put("app", this.b);
        zzt.zzp();
        map.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzt.zzD(this.a) ? "0" : "1");
        AbstractC7582qE1 abstractC7582qE1 = AbstractC9820yE1.a;
        List listB = zzba.zza().b();
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Q6)).booleanValue()) {
            listB.addAll(zzt.zzo().h().zzh().d());
        }
        map.put("e", TextUtils.join(",", listB));
        map.put("sdkVersion", this.c);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.qa)).booleanValue()) {
            zzt.zzp();
            map.put("is_bstar", true != com.google.android.gms.ads.internal.util.zzt.zzA(this.a) ? "0" : "1");
        }
    }
}
