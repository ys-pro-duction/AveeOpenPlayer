package com.daaw;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.gS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4836gS {
    public String a;
    public String b;

    public C4836gS(String str, String str2) {
        AbstractC7506py0.l(str);
        AbstractC7506py0.l(str2);
        this.a = str;
        this.b = str2;
    }

    public static C4836gS a(String str) throws JL {
        JSONObject jSONObject = new JSONObject(str);
        String strA = AbstractC7661qY0.a(jSONObject.optString("challenge"));
        String strA2 = AbstractC7661qY0.a(jSONObject.optString("ttl"));
        if (strA == null || strA2 == null) {
            throw new JL("Unexpected server response.");
        }
        return new C4836gS(strA, strA2);
    }

    public String b() {
        return this.a;
    }
}
