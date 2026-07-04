package com.daaw;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Do2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0675Do2 implements InterfaceC5648jL1 {
    @Override // com.daaw.InterfaceC5648jL1
    public final /* bridge */ /* synthetic */ JSONObject a(Object obj) throws JSONException {
        C0779Eo2 c0779Eo2 = (C0779Eo2) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Y8)).booleanValue()) {
            jSONObject2.put("ad_request_url", c0779Eo2.c.e());
            jSONObject2.put("ad_request_post_body", c0779Eo2.c.d());
        }
        jSONObject2.put("base_url", c0779Eo2.c.b());
        jSONObject2.put("signals", c0779Eo2.b);
        jSONObject3.put("body", c0779Eo2.a.c);
        jSONObject3.put("headers", zzay.zzb().m(c0779Eo2.a.b));
        jSONObject3.put(DiagnosticsTracker.RESPONSE_CODE_KEY, c0779Eo2.a.a);
        jSONObject3.put("latency", c0779Eo2.a.d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", c0779Eo2.c.g());
        return jSONObject;
    }
}
