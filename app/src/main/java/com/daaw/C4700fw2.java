package com.daaw;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzl;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.fw2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4700fw2 implements InterfaceC1343Jz2 {
    public final FF2 a;
    public final long b;

    public C4700fw2(FF2 ff2, long j) {
        AbstractC7506py0.m(ff2, "the targeting must not be null");
        this.a = ff2;
        this.b = j;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzl zzlVar = this.a.d;
        bundle.putInt("http_timeout_millis", zzlVar.zzw);
        bundle.putString("slotname", this.a.f);
        int i = this.a.o.a;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i2 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.b);
        RF2.f(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzlVar.zzb)), zzlVar.zzb != -1);
        RF2.b(bundle, "extras", zzlVar.zzc);
        int i3 = zzlVar.zzd;
        RF2.e(bundle, "cust_gender", i3, i3 != -1);
        RF2.d(bundle, "kw", zzlVar.zze);
        int i4 = zzlVar.zzg;
        RF2.e(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
        if (zzlVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzlVar.zzy);
        RF2.e(bundle, "d_imp_hdr", 1, zzlVar.zza >= 2 && zzlVar.zzh);
        String str = zzlVar.zzi;
        RF2.f(bundle, "ppid", str, zzlVar.zza >= 2 && !TextUtils.isEmpty(str));
        Location location = zzlVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = location.getLongitude() * 1.0E7d;
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", accuracy);
            bundle2.putLong("lat", (long) latitude);
            bundle2.putLong("long", (long) longitude);
            bundle2.putLong("time", time);
            bundle.putBundle("uule", bundle2);
        }
        RF2.c(bundle, "url", zzlVar.zzl);
        RF2.d(bundle, "neighboring_content_urls", zzlVar.zzv);
        RF2.b(bundle, "custom_targeting", zzlVar.zzn);
        RF2.d(bundle, "category_exclusions", zzlVar.zzo);
        RF2.c(bundle, "request_agent", zzlVar.zzp);
        RF2.c(bundle, "request_pkg", zzlVar.zzq);
        RF2.g(bundle, "is_designed_for_families", zzlVar.zzr, zzlVar.zza >= 7);
        if (zzlVar.zza >= 8) {
            int i5 = zzlVar.zzt;
            RF2.e(bundle, "tag_for_under_age_of_consent", i5, i5 != -1);
            RF2.c(bundle, "max_ad_content_rating", zzlVar.zzu);
        }
    }
}
