package com.daaw;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.vO1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9023vO1 {
    public final boolean a;
    public final String b;

    public C9023vO1(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public static C9023vO1 a(JSONObject jSONObject) {
        return new C9023vO1(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
