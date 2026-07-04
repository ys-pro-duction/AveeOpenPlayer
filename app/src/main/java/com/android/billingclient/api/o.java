package com.android.billingclient.api;

import com.android.billingclient.api.f;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final f.c f;

    public o(JSONObject jSONObject) {
        this.a = jSONObject.getString("productId");
        this.b = jSONObject.optString("title");
        this.c = jSONObject.optString("name");
        this.d = jSONObject.optString("description");
        this.e = jSONObject.optString("basePlanId");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pricingPhase");
        this.f = jSONObjectOptJSONObject == null ? null : new f.c(jSONObjectOptJSONObject);
    }
}
