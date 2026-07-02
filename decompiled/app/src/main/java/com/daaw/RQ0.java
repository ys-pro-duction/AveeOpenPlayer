package com.daaw;

import com.daaw.BQ0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class RQ0 implements NQ0 {
    public static BQ0.a b(JSONObject jSONObject) {
        return new BQ0.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    public static BQ0.b c(JSONObject jSONObject) {
        return new BQ0.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    public static long d(InterfaceC1735Nu interfaceC1735Nu, long j, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : interfaceC1735Nu.getCurrentTimeMillis() + (j * 1000);
    }

    @Override // com.daaw.NQ0
    public BQ0 a(InterfaceC1735Nu interfaceC1735Nu, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", 3600);
        return new BQ0(d(interfaceC1735Nu, iOptInt2, jSONObject), jSONObject.has("session") ? c(jSONObject.getJSONObject("session")) : c(new JSONObject()), b(jSONObject.getJSONObject("features")), iOptInt, iOptInt2, jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject.optDouble("on_demand_backoff_base", 1.2d), jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
