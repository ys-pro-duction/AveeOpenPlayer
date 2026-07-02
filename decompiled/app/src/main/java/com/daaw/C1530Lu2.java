package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Lu2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1530Lu2 {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public final Map e = new HashMap();
    public final Executor f;
    public JSONObject g;

    public C1530Lu2(Executor executor) {
        this.f = executor;
    }

    public static final Bundle o(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized Map a(String str, String str2) {
        HashMap map;
        try {
            Map mapB = b(str, str2);
            RP2 rp2H = h(str2);
            map = new HashMap();
            for (Map.Entry entry : ((RP2) mapB).entrySet()) {
                String str3 = (String) entry.getKey();
                if (rp2H.containsKey(str3)) {
                    C1946Pu2 c1946Pu2 = (C1946Pu2) rp2H.get(str3);
                    List list = (List) entry.getValue();
                    map.put(str3, new C1946Pu2(str3, c1946Pu2.b, c1946Pu2.c, c1946Pu2.d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            UQ2 uq2Y = rp2H.entrySet().y();
            while (uq2Y.hasNext()) {
                Map.Entry entry2 = (Map.Entry) uq2Y.next();
                String str4 = (String) entry2.getKey();
                if (!map.containsKey(str4) && ((C1946Pu2) entry2.getValue()).d) {
                    map.put(str4, (C1946Pu2) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return map;
    }

    public final synchronized Map b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(zzt.zzo().h().zzh().c())) {
            Map map = (Map) this.c.get(str);
            if (map == null) {
                return RP2.e();
            }
            List<C1738Nu2> list = (List) map.get(str2);
            if (list == null) {
                String strA = AbstractC0434Bi2.a(this.g, str2, str);
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.X9)).booleanValue()) {
                    strA = strA.toLowerCase(Locale.ROOT);
                }
                list = (List) map.get(strA);
            }
            if (list == null) {
                return RP2.e();
            }
            HashMap map2 = new HashMap();
            for (C1738Nu2 c1738Nu2 : list) {
                String str3 = c1738Nu2.a;
                if (!map2.containsKey(str3)) {
                    map2.put(str3, new ArrayList());
                }
                ((List) map2.get(str3)).add(c1738Nu2.c);
            }
            return RP2.d(map2);
        }
        return RP2.e();
    }

    public final synchronized Map c() {
        if (TextUtils.isEmpty(zzt.zzo().h().zzh().c())) {
            return RP2.e();
        }
        return RP2.d(this.b);
    }

    public final void e() {
        zzt.zzo().h().zzq(new Runnable() { // from class: com.daaw.Ku2
            @Override // java.lang.Runnable
            public final void run() {
                this.B.f();
            }
        });
        this.f.execute(new RunnableC1323Ju2(this));
    }

    public final /* synthetic */ void f() {
        this.f.execute(new RunnableC1323Ju2(this));
    }

    public final synchronized void g(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.a.containsKey(str)) {
            return;
        }
        this.a.put(str, new C1738Nu2(str, "", new Bundle()));
    }

    public final synchronized RP2 h(String str) {
        HashMap map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(zzt.zzo().h().zzh().c())) {
                boolean zMatches = Pattern.matches((String) zzba.zzc().b(AbstractC9820yE1.T2), str);
                boolean zMatches2 = Pattern.matches((String) zzba.zzc().b(AbstractC9820yE1.U2), str);
                if (zMatches) {
                    map = new HashMap(this.e);
                } else {
                    if (!zMatches2) {
                        return RP2.e();
                    }
                    map = new HashMap(this.d);
                }
                return RP2.d(map);
            }
            return RP2.e();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized List i(JSONObject jSONObject, String str) {
        try {
            ArrayList arrayList = new ArrayList();
            if (jSONObject == null) {
                return arrayList;
            }
            Bundle bundleO = o(jSONObject.optJSONObject("data"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
            if (jSONArrayOptJSONArray == null) {
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i, "");
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList2.add(strOptString);
                }
            }
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = (String) arrayList2.get(i2);
                g(str2);
                if (((C1738Nu2) this.a.get(str2)) != null) {
                    arrayList.add(new C1738Nu2(str2, str, bundleO));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j() {
        this.b.clear();
        this.a.clear();
        this.e.clear();
        this.d.clear();
        m();
        n();
        k();
    }

    public final synchronized void k() {
        try {
            if (!((Boolean) HF1.b.e()).booleanValue()) {
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.K1)).booleanValue()) {
                    JSONObject jSONObjectF = zzt.zzo().h().zzh().f();
                    if (jSONObjectF == null) {
                        return;
                    }
                    JSONArray jSONArray = jSONObjectF.getJSONArray("adapter_settings");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String strOptString = jSONObject.optString("adapter_class_name");
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(strOptString)) {
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                                boolean zOptBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                boolean zOptBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                boolean zOptBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                String strOptString2 = jSONObject2.optString("platform");
                                C1946Pu2 c1946Pu2 = new C1946Pu2(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new Bundle());
                                if (strOptString2.equals("ADMOB")) {
                                    this.d.put(strOptString, c1946Pu2);
                                } else if (strOptString2.equals("AD_MANAGER")) {
                                    this.e.put(strOptString, c1946Pu2);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e) {
            zze.zzb("Malformed config loading JSON.", e);
        } finally {
        }
    }

    public final synchronized void l(String str, String str2, List list) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = (Map) this.c.get(str);
            if (map == null) {
                map = new HashMap();
            }
            this.c.put(str, map);
            List arrayList = (List) map.get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.addAll(list);
            map.put(str2, arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void m() {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObjectF = zzt.zzo().h().zzh().f();
            if (jSONObjectF != null) {
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectF.optJSONArray("ad_unit_id_settings");
                    this.g = jSONObjectF.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                            JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i);
                            String lowerCase = ((Boolean) zzba.zzc().b(AbstractC9820yE1.X9)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                            String strOptString = jSONObject.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                    arrayList.addAll(i(jSONArrayOptJSONArray.getJSONObject(i2), strOptString));
                                }
                            }
                            l(strOptString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e) {
                    zze.zzb("Malformed config loading JSON.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void n() {
        if (!((Boolean) HF1.g.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.J1)).booleanValue()) {
                JSONObject jSONObjectF = zzt.zzo().h().zzh().f();
                if (jSONObjectF == null) {
                    return;
                }
                try {
                    JSONArray jSONArray = jSONObjectF.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        Bundle bundleO = o(jSONObject.optJSONObject("data"));
                        String strOptString = jSONObject.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.b.put(strOptString, new C1946Pu2(strOptString, zOptBoolean2, zOptBoolean, true, bundleO));
                        }
                    }
                } catch (JSONException e) {
                    zze.zzb("Malformed config loading JSON.", e);
                }
            }
        }
    }
}
