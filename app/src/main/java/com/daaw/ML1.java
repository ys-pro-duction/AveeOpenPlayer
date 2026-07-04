package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ML1 {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;
    public final String k;
    public final List l;
    public final List m;
    public final List n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final List t;
    public final String u;
    public final String v;

    public ML1(JSONObject jSONObject) throws JSONException {
        List listA;
        this.b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.c = DesugarCollections.unmodifiableList(arrayList);
        this.d = jSONObject.optString("allocation_id", null);
        zzt.zzg();
        this.f = OL1.a(jSONObject, "clickurl");
        zzt.zzg();
        this.g = OL1.a(jSONObject, "imp_urls");
        zzt.zzg();
        this.h = OL1.a(jSONObject, "downloaded_imp_urls");
        zzt.zzg();
        this.j = OL1.a(jSONObject, "fill_urls");
        zzt.zzg();
        this.l = OL1.a(jSONObject, "video_start_urls");
        zzt.zzg();
        this.n = OL1.a(jSONObject, "video_complete_urls");
        zzt.zzg();
        this.m = OL1.a(jSONObject, "video_reward_urls");
        this.o = jSONObject.optString("transaction_id");
        this.p = jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            zzt.zzg();
            listA = OL1.a(jSONObjectOptJSONObject, "manual_impression_urls");
        } else {
            listA = null;
        }
        this.i = listA;
        this.a = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.k = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        this.e = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("class_name") : null;
        this.q = jSONObject.optString("html_template", null);
        this.r = jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        this.s = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.toString() : null;
        zzt.zzg();
        this.t = OL1.a(jSONObject, "template_ids");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.u = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.toString() : null;
        this.v = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
