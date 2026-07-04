package com.daaw;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class N8 {
    public String a;
    public String b;

    public N8(String str, String str2) {
        AbstractC7506py0.l(str);
        AbstractC7506py0.l(str2);
        this.a = str;
        this.b = str2;
    }

    public static N8 a(String str) throws JL {
        JSONObject jSONObject = new JSONObject(str);
        String strA = AbstractC7661qY0.a(jSONObject.optString("token"));
        String strA2 = AbstractC7661qY0.a(jSONObject.optString("ttl"));
        if (strA == null || strA2 == null) {
            throw new JL("Unexpected server response.");
        }
        return new N8(strA, strA2);
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }
}
