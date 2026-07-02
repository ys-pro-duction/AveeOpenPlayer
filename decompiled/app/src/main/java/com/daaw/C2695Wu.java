package com.daaw;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Wu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2695Wu implements RW {
    public JSONObject a;
    public JSONArray b;

    public C2695Wu(JSONObject jSONObject) {
        if (jSONObject == null) {
            this.a = new JSONObject();
            n();
            return;
        }
        try {
            this.a = jSONObject;
            this.b = jSONObject.getJSONArray("compositions");
        } catch (JSONException e) {
            AbstractC0441Bk1.c("Failed to create from saved string: " + e.getMessage());
            this.a = new JSONObject();
            n();
        }
    }

    public static C2695Wu d() {
        return new C2695Wu(null);
    }

    public static C2695Wu e(String str) {
        JSONObject jSONObject;
        if (str == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        return new C2695Wu(jSONObject);
    }

    public static C2695Wu g(String str) {
        return e(str);
    }

    private JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        this.b.put(jSONObject);
        return jSONObject;
    }

    private void n() {
        try {
            JSONArray jSONArray = new JSONArray();
            this.b = jSONArray;
            this.a.put("compositions", jSONArray);
        } catch (JSONException e) {
            AbstractC0441Bk1.c(e.getMessage());
            this.b = null;
        }
    }

    @Override // com.daaw.RW
    public int c() {
        return this.b.length();
    }

    @Override // com.daaw.RW
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C2279Su b() {
        return C2279Su.w0(this.b.length(), k());
    }

    public int h() {
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            return -1;
        }
        try {
            return jSONObject.getInt("template");
        } catch (JSONException unused) {
            return -1;
        }
    }

    public C2591Vu i(List list) {
        if (list == null) {
            return null;
        }
        int iX = list.size() > 0 ? AbstractC0405Bb1.x((String) list.get(0), -1) : -1;
        if (iX < 0) {
            return null;
        }
        C2279Su c2279SuA = a(iX);
        if (c2279SuA == null) {
            AbstractC0441Bk1.c("entry is null");
            return null;
        }
        if (list.size() <= 1) {
            return c2279SuA;
        }
        if (AbstractC0405Bb1.x((String) list.get(1), -1) < 0) {
            return null;
        }
        return c2279SuA.C0(list, 1);
    }

    @Override // com.daaw.RW
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C2279Su a(int i) {
        if (i >= 0 && i < this.b.length()) {
            try {
                return C2279Su.y0(i, this.b.getJSONObject(i));
            } catch (JSONException e) {
                AbstractC0441Bk1.c(e.getMessage());
            }
        }
        return null;
    }

    public String l() {
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            return "";
        }
        try {
            return jSONObject.getString("ver");
        } catch (JSONException unused) {
            return "";
        }
    }

    public void m() {
        n();
    }

    public String o() {
        JSONObject jSONObject = this.a;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public String p() {
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            return "";
        }
        try {
            return jSONObject.toString(2);
        } catch (JSONException unused) {
            return "";
        }
    }

    public void q(int i) {
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("template", i);
        } catch (JSONException unused) {
        }
    }

    public void r(int i, C2279Su c2279Su) {
        try {
            this.b.put(i, c2279Su.c);
        } catch (JSONException unused) {
        }
    }

    public void s(String str) {
        try {
            this.a.put("objType", str);
        } catch (JSONException unused) {
        }
    }

    public void t(String str) {
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("ver", str);
        } catch (JSONException unused) {
        }
    }
}
