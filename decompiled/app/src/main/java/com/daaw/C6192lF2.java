package com.daaw;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbw;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.lF2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6192lF2 {
    public final String a;
    public final String b;
    public final JSONObject c;
    public final JSONObject d;

    public C6192lF2(JsonReader jsonReader) {
        JSONObject jSONObjectZzh = zzbw.zzh(jsonReader);
        this.d = jSONObjectZzh;
        this.a = jSONObjectZzh.optString("ad_html", null);
        this.b = jSONObjectZzh.optString("ad_base_url", null);
        this.c = jSONObjectZzh.optJSONObject("ad_json");
    }
}
