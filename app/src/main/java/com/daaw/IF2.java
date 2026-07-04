package com.daaw;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class IF2 {
    public final JSONObject a;

    public IF2(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final String a() {
        if (b() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final int b() {
        int iOptInt = this.a.optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
