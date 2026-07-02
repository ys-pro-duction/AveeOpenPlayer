package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Cj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0542Cj2 {
    public final ConcurrentHashMap a;
    public final RS1 b;
    public final FF2 c;
    public final String d;
    public final String e;

    public C0542Cj2(C1590Mj2 c1590Mj2, RS1 rs1, FF2 ff2, String str, String str2) {
        ConcurrentHashMap concurrentHashMapC = c1590Mj2.c();
        this.a = concurrentHashMapC;
        this.b = rs1;
        this.c = ff2;
        this.d = str;
        this.e = str2;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.W6)).booleanValue()) {
            int iZze = zzf.zze(ff2);
            int i = iZze - 1;
            if (i == 0) {
                concurrentHashMapC.put("scar", "false");
                return;
            }
            if (i == 1) {
                concurrentHashMapC.put("se", "query_g");
            } else if (i == 2) {
                concurrentHashMapC.put("se", "r_adinfo");
            } else if (i != 3) {
                concurrentHashMapC.put("se", "r_both");
            } else {
                concurrentHashMapC.put("se", "r_adstring");
            }
            concurrentHashMapC.put("scar", "true");
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.w7)).booleanValue()) {
                concurrentHashMapC.put("ad_format", str2);
            }
            if (iZze == 2) {
                concurrentHashMapC.put("rid", str);
            }
            d("ragent", ff2.d.zzp);
            d("rtype", zzf.zza(zzf.zzb(ff2.d)));
        }
    }

    public final Map a() {
        return this.a;
    }

    public final void b(C9267wF2 c9267wF2) {
        if (!c9267wF2.b.a.isEmpty()) {
            switch (((C4498fF2) c9267wF2.b.a.get(0)).b) {
                case 1:
                    this.a.put("ad_format", "banner");
                    break;
                case 2:
                    this.a.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.a.put("ad_format", "native_express");
                    break;
                case 4:
                    this.a.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.a.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.a.put("ad_format", "app_open_ad");
                    this.a.put("as", true != this.b.l() ? "0" : "1");
                    break;
                default:
                    this.a.put("ad_format", "unknown");
                    break;
            }
        }
        d("gqi", c9267wF2.b.b.b);
    }

    public final void c(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final void d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.a.put(str, str2);
    }
}
