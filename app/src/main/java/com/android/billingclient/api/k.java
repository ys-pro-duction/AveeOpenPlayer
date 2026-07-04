package com.android.billingclient.api;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public k(JSONObject jSONObject) throws JSONException {
        jSONObject.getInt("maximumQuantity");
        jSONObject.getInt("remainingQuantity");
    }
}
