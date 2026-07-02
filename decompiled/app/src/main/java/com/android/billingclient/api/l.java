package com.android.billingclient.api;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public l(JSONObject jSONObject) throws JSONException {
        jSONObject.getLong("preorderReleaseTimeMillis");
        jSONObject.getLong("preorderPresaleEndTimeMillis");
    }
}
