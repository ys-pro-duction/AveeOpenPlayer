package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.zi2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10228zi2 {
    public final Map a = new ConcurrentHashMap();
    public JSONObject b;
    public final Executor c;
    public boolean d;
    public JSONObject e;

    public C10228zi2(Executor executor) {
        this.c = executor;
    }

    public final JSONObject a() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Q3)).booleanValue()) {
            return this.b;
        }
        return null;
    }

    public final JSONObject b(String str, String str2) {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.P3)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.d) {
            f();
        }
        Map map = (Map) this.a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String strA = AbstractC0434Bi2.a(this.e, str, str2);
        if (strA == null) {
            return null;
        }
        return (JSONObject) map.get(strA);
    }

    public final void c() {
        zzt.zzo().h().zzq(new Runnable() { // from class: com.daaw.wi2
            @Override // java.lang.Runnable
            public final void run() {
                this.B.e();
            }
        });
        this.c.execute(new Runnable() { // from class: com.daaw.xi2
            @Override // java.lang.Runnable
            public final void run() {
                this.B.f();
            }
        });
    }

    public final /* synthetic */ void e() {
        this.c.execute(new Runnable() { // from class: com.daaw.yi2
            @Override // java.lang.Runnable
            public final void run() {
                this.B.d();
            }
        });
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void f() {
        Map map;
        try {
            this.d = true;
            C6243lS1 c6243lS1Zzh = zzt.zzo().h().zzh();
            if (c6243lS1Zzh == null) {
                return;
            }
            JSONObject jSONObjectF = c6243lS1Zzh.f();
            if (jSONObjectF == null) {
                return;
            }
            this.b = ((Boolean) zzba.zzc().b(AbstractC9820yE1.Q3)).booleanValue() ? jSONObjectF.optJSONObject("common_settings") : null;
            this.e = jSONObjectF.optJSONObject("ad_unit_patterns");
            JSONArray jSONArrayOptJSONArray = jSONObjectF.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                        String strOptString2 = jSONObjectOptJSONObject.optString("format");
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                        if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                            if (this.a.containsKey(strOptString2)) {
                                map = (Map) this.a.get(strOptString2);
                            } else {
                                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                this.a.put(strOptString2, concurrentHashMap);
                                map = concurrentHashMap;
                            }
                            map.put(strOptString, jSONObjectOptJSONObject2);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
