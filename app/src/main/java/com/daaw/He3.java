package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class He3 extends AbstractC10209ze3 {
    public He3(C8812uf3 c8812uf3) {
        super(c8812uf3);
    }

    public final Ee3 e(String str) {
        On3.b();
        Ee3 ee3 = null;
        if (this.a.z().B(null, AbstractC1311Jr2.s0)) {
            this.a.w().s().a("sgtm feature flag enabled.");
            C8110s73 c8110s73R = this.b.V().R(str);
            if (c8110s73R == null) {
                return new Ee3(f(str));
            }
            if (c8110s73R.Q()) {
                this.a.w().s().a("sgtm upload enabled in manifest.");
                C9271wG2 c9271wG2Q = this.b.Z().q(c8110s73R.l0());
                if (c9271wG2Q != null) {
                    String strK = c9271wG2Q.K();
                    if (!TextUtils.isEmpty(strK)) {
                        String strJ = c9271wG2Q.J();
                        this.a.w().s().c("sgtm configured with upload_url, server_info", strK, true != TextUtils.isEmpty(strJ) ? "N" : "Y");
                        if (TextUtils.isEmpty(strJ)) {
                            this.a.a();
                            ee3 = new Ee3(strK);
                        } else {
                            HashMap map = new HashMap();
                            map.put("x-google-sgtm-server-info", strJ);
                            ee3 = new Ee3(strK, map);
                        }
                    }
                }
            }
            if (ee3 != null) {
                return ee3;
            }
        }
        return new Ee3(f(str));
    }

    public final String f(String str) throws Throwable {
        String strT = this.b.Z().t(str);
        if (TextUtils.isEmpty(strT)) {
            return (String) AbstractC1311Jr2.s.a(null);
        }
        Uri uri = Uri.parse((String) AbstractC1311Jr2.s.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(strT + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }
}
