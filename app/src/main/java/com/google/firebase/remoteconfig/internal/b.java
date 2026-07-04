package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b {
    public static final Date g = new Date(0);
    public JSONObject a;
    public JSONObject b;
    public Date c;
    public JSONArray d;
    public JSONObject e;
    public long f;

    /* JADX INFO: renamed from: com.google.firebase.remoteconfig.internal.b$b, reason: collision with other inner class name */
    public static class C0271b {
        public JSONObject a;
        public Date b;
        public JSONArray c;
        public JSONObject d;
        public long e;

        public b a() {
            return new b(this.a, this.b, this.c, this.d, this.e);
        }

        public C0271b b(JSONObject jSONObject) {
            try {
                this.a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public C0271b c(JSONArray jSONArray) {
            try {
                this.c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public C0271b d(Date date) {
            this.b = date;
            return this;
        }

        public C0271b e(JSONObject jSONObject) {
            try {
                this.d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public C0271b f(long j) {
            this.e = j;
            return this;
        }

        public C0271b() {
            this.a = new JSONObject();
            this.b = b.g;
            this.c = new JSONArray();
            this.d = new JSONObject();
            this.e = 0L;
        }
    }

    public static b b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        return new b(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObjectOptJSONObject, jSONObject.optLong("template_version_number_key"));
    }

    public static b c(JSONObject jSONObject) {
        return b(new JSONObject(jSONObject.toString()));
    }

    public static C0271b j() {
        return new C0271b();
    }

    public JSONArray d() {
        return this.d;
    }

    public Set e(b bVar) {
        JSONObject jSONObjectF = c(bVar.a).f();
        HashSet hashSet = new HashSet();
        Iterator<String> itKeys = f().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!bVar.f().has(next)) {
                hashSet.add(next);
            } else if (!f().get(next).equals(bVar.f().get(next))) {
                hashSet.add(next);
            } else if ((h().has(next) && !bVar.h().has(next)) || (!h().has(next) && bVar.h().has(next))) {
                hashSet.add(next);
            } else if (h().has(next) && bVar.h().has(next) && !h().getJSONObject(next).toString().equals(bVar.h().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else {
                jSONObjectF.remove(next);
            }
        }
        Iterator<String> itKeys2 = jSONObjectF.keys();
        while (itKeys2.hasNext()) {
            hashSet.add(itKeys2.next());
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.a.toString().equals(((b) obj).toString());
        }
        return false;
    }

    public JSONObject f() {
        return this.b;
    }

    public Date g() {
        return this.c;
    }

    public JSONObject h() {
        return this.e;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public long i() {
        return this.f;
    }

    public String toString() {
        return this.a.toString();
    }

    public b(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        this.b = jSONObject;
        this.c = date;
        this.d = jSONArray;
        this.e = jSONObject2;
        this.f = j;
        this.a = jSONObject3;
    }
}
