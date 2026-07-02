package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.lI2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6204lI2 {
    public final HashMap a;
    public final C7877rI2 b;

    public C6204lI2() {
        HashMap map = new HashMap();
        this.a = map;
        this.b = new C7877rI2(zzt.zzB());
        map.put("new_csi", "1");
    }

    public static C6204lI2 b(String str) {
        C6204lI2 c6204lI2 = new C6204lI2();
        c6204lI2.a.put("action", str);
        return c6204lI2;
    }

    public static C6204lI2 c(String str) {
        C6204lI2 c6204lI2 = new C6204lI2();
        c6204lI2.a.put(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID, str);
        return c6204lI2;
    }

    public final C6204lI2 a(String str, String str2) {
        this.a.put(str, str2);
        return this;
    }

    public final C6204lI2 d(String str) {
        this.b.b(str);
        return this;
    }

    public final C6204lI2 e(String str, String str2) {
        this.b.c(str, str2);
        return this;
    }

    public final C6204lI2 f(C4498fF2 c4498fF2) {
        this.a.put("aai", c4498fF2.y);
        return this;
    }

    public final C6204lI2 g(C5622jF2 c5622jF2) {
        if (!TextUtils.isEmpty(c5622jF2.b)) {
            this.a.put("gqi", c5622jF2.b);
        }
        return this;
    }

    public final C6204lI2 h(C9267wF2 c9267wF2, RS1 rs1) {
        C8988vF2 c8988vF2 = c9267wF2.b;
        g(c8988vF2.b);
        if (!c8988vF2.a.isEmpty()) {
            switch (((C4498fF2) c8988vF2.a.get(0)).b) {
                case 1:
                    this.a.put("ad_format", "banner");
                    break;
                case 2:
                    this.a.put("ad_format", "interstitial");
                    return this;
                case 3:
                    this.a.put("ad_format", "native_express");
                    return this;
                case 4:
                    this.a.put("ad_format", "native_advanced");
                    return this;
                case 5:
                    this.a.put("ad_format", "rewarded");
                    return this;
                case 6:
                    this.a.put("ad_format", "app_open_ad");
                    if (rs1 != null) {
                        this.a.put("as", true != rs1.l() ? "0" : "1");
                        return this;
                    }
                    break;
                default:
                    this.a.put("ad_format", "unknown");
                    return this;
            }
        }
        return this;
    }

    public final C6204lI2 i(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map j() {
        HashMap map = new HashMap(this.a);
        for (C7599qI2 c7599qI2 : this.b.a()) {
            map.put(c7599qI2.a, c7599qI2.b);
        }
        return map;
    }
}
