package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.bp2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3543bp2 {
    public final QP1 a;

    public C3543bp2(QP1 qp1) {
        this.a = qp1;
    }

    public static void a(Map map, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pii");
        if (jSONObjectOptJSONObject == null) {
            zze.zza("DSID signal does not exist.");
            return;
        }
        if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
            map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
        }
        if (TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
            return;
        }
        map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
    }

    public final void b() {
        AbstractC10159zT1.a(this.a.a(), "persistFlags");
    }
}
