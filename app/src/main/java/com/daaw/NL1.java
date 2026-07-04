package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbwi;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class NL1 {
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final String g;
    public final String h;

    public NL1(JSONObject jSONObject) throws JSONException {
        if (AbstractC4274eT1.zzm(2)) {
            zze.zza("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                ML1 ml1 = new ML1(jSONArray.getJSONObject(i2));
                "banner".equalsIgnoreCase(ml1.v);
                arrayList.add(ml1);
                if (i < 0) {
                    Iterator it = ml1.c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.a = DesugarCollections.unmodifiableList(arrayList);
        this.g = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject == null) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.h = null;
            return;
        }
        jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
        zzt.zzg();
        this.b = OL1.a(jSONObjectOptJSONObject, "click_urls");
        zzt.zzg();
        this.c = OL1.a(jSONObjectOptJSONObject, "imp_urls");
        zzt.zzg();
        this.d = OL1.a(jSONObjectOptJSONObject, "downloaded_imp_urls");
        zzt.zzg();
        this.e = OL1.a(jSONObjectOptJSONObject, "nofill_urls");
        zzt.zzg();
        this.f = OL1.a(jSONObjectOptJSONObject, "remote_ping_urls");
        jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
        jSONObjectOptJSONObject.optLong("refresh", -1L);
        zzbwi zzbwiVarE = zzbwi.e(jSONObjectOptJSONObject.optJSONArray("rewards"));
        if (zzbwiVarE == null) {
            this.h = null;
        } else {
            this.h = zzbwiVarE.B;
        }
        jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
        jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
        jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
        jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
    }
}
