package com.android.billingclient.api;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final String a;
    public final String b;

    public m(JSONObject jSONObject) {
        this.a = jSONObject.getString("rentalPeriod");
        String strOptString = jSONObject.optString("rentalExpirationPeriod");
        this.b = true == strOptString.isEmpty() ? null : strOptString;
    }
}
