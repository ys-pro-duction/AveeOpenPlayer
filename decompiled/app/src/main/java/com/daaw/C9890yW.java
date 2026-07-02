package com.daaw;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.yW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C9890yW {
    public int a;
    public String b;

    public C9890yW(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public static C9890yW a(String str) {
        JSONObject jSONObject = new JSONObject(new JSONObject(str).optString("error"));
        return new C9890yW(jSONObject.optInt("code"), jSONObject.optString("message"));
    }

    public int b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }
}
