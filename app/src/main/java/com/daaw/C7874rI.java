package com.daaw;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.rI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7874rI {
    public final String a;

    public C7874rI(String str) {
        this.a = str;
    }

    public String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("playIntegrityToken", this.a);
        return jSONObject.toString();
    }
}
