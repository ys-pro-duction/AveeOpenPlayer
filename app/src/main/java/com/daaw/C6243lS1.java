package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.lS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6243lS1 {
    public String d;
    public String e;
    public long f;
    public JSONObject g;
    public boolean h;
    public boolean j;
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final Map c = new HashMap();
    public final List i = new ArrayList();

    public C6243lS1(String str, long j) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.d = "";
        this.h = false;
        this.j = false;
        this.e = str;
        this.f = j;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.g = new JSONObject(str);
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Ha)).booleanValue() && j()) {
                return;
            }
            if (this.g.optInt("status", -1) != 1) {
                this.h = false;
                AbstractC4274eT1.zzj("App settings could not be fetched successfully.");
                return;
            }
            this.h = true;
            this.d = this.g.optString("app_id");
            JSONArray jSONArrayOptJSONArray2 = this.g.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i);
                    String strOptString = jSONObject.optString("format");
                    String strOptString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.b.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.c.put(strOptString2, new NL1(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray3 = this.g.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray3.length(); i2++) {
                    this.a.add(jSONArrayOptJSONArray3.optString(i2));
                }
            }
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Q6)).booleanValue() && (jSONObjectOptJSONObject2 = this.g.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                    this.i.add(jSONArrayOptJSONArray.get(i3).toString());
                }
            }
            if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.l6)).booleanValue() || (jSONObjectOptJSONObject = this.g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.j = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e) {
            AbstractC4274eT1.zzk("Exception occurred while processing app setting json", e);
            zzt.zzo().u(e, "AppSettings.parseAppSettingsJson");
        }
    }

    public final long a() {
        return this.f;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final List d() {
        return this.i;
    }

    public final Map e() {
        return this.c;
    }

    public final JSONObject f() {
        return this.g;
    }

    public final void g(long j) {
        this.f = j;
    }

    public final boolean h() {
        return this.j;
    }

    public final boolean i() {
        return this.h;
    }

    public final boolean j() {
        if (!TextUtils.isEmpty(this.e) && this.g != null) {
            AbstractC7582qE1 abstractC7582qE1 = AbstractC9820yE1.Ka;
            long jLongValue = ((Long) zzba.zzc().b(abstractC7582qE1)).longValue();
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Ja)).booleanValue() && !TextUtils.isEmpty(this.e)) {
                jLongValue = this.g.optLong("cache_ttl_sec", ((Long) zzba.zzc().b(abstractC7582qE1)).longValue());
            }
            long jA = zzt.zzB().a();
            if (jLongValue >= 0) {
                long j = this.f;
                if (j > jA || TimeUnit.MILLISECONDS.toSeconds(jA - j) > jLongValue) {
                    this.a.clear();
                    this.b.clear();
                    this.c.clear();
                    this.d = "";
                    this.e = "";
                    this.g = null;
                    this.h = false;
                    this.i.clear();
                    this.j = false;
                    return true;
                }
            }
        }
        return false;
    }
}
