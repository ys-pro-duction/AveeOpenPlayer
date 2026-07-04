package com.daaw;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class Ia3 implements Runnable {
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Uri C;
    public final /* synthetic */ String D;
    public final /* synthetic */ String E;
    public final /* synthetic */ La3 F;

    public Ia3(La3 la3, boolean z, Uri uri, String str, String str2) {
        this.F = la3;
        this.B = z;
        this.C = uri;
        this.D = str;
        this.E = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleV0;
        La3 la3 = this.F;
        boolean z = this.B;
        Uri uri = this.C;
        String str = this.D;
        String str2 = this.E;
        la3.B.d();
        try {
            Pf3 pf3N = la3.B.a.N();
            In3.b();
            C5788jq1 c5788jq1Z = la3.B.a.z();
            C4388er2 c4388er2 = AbstractC1311Jr2.x0;
            boolean zB = c5788jq1Z.B(null, c4388er2);
            if (TextUtils.isEmpty(str2)) {
                bundleV0 = null;
            } else {
                if (!str2.contains("gclid") && !str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_id") && !str2.contains("dclid") && !str2.contains("srsltid")) {
                    if (zB && str2.contains("sfmc_id")) {
                        zB = true;
                    }
                    pf3N.a.w().m().a("Activity created with data 'referrer' without required params");
                    bundleV0 = null;
                }
                bundleV0 = pf3N.v0(Uri.parse("https://google.com/search?".concat(str2)), zB);
                if (bundleV0 != null) {
                    bundleV0.putString("_cis", "referrer");
                }
            }
            if (z) {
                Pf3 pf3N2 = la3.B.a.N();
                In3.b();
                Bundle bundleV02 = pf3N2.v0(uri, la3.B.a.z().B(null, c4388er2));
                if (bundleV02 != null) {
                    bundleV02.putString("_cis", "intent");
                    if (!bundleV02.containsKey("gclid") && bundleV0 != null && bundleV0.containsKey("gclid")) {
                        bundleV02.putString("_cer", String.format("gclid=%s", bundleV0.getString("gclid")));
                    }
                    la3.B.r(str, "_cmp", bundleV02);
                    la3.B.l.a(str, bundleV02);
                }
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            la3.B.a.w().m().b("Activity created with referrer", str2);
            if (la3.B.a.z().B(null, AbstractC1311Jr2.c0)) {
                if (bundleV0 != null) {
                    la3.B.r(str, "_cmp", bundleV0);
                    la3.B.l.a(str, bundleV0);
                } else {
                    la3.B.a.w().m().b("Referrer does not contain valid parameters", str2);
                }
                la3.B.K("auto", "_ldl", null, true);
                return;
            }
            if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                la3.B.a.w().m().a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                la3.B.K("auto", "_ldl", str2, true);
            }
        } catch (RuntimeException e) {
            la3.B.a.w().n().b("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }
}
