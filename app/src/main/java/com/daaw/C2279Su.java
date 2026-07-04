package com.daaw;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Su, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2279Su extends C2591Vu implements RW {
    public JSONArray e;
    public int f;

    public C2279Su(int i, JSONObject jSONObject, boolean z) {
        super(i, jSONObject, (C2591Vu) null);
        this.f = i;
        if (z) {
            H0();
            return;
        }
        try {
            this.e = this.c.getJSONArray("elements");
        } catch (JSONException e) {
            AbstractC0441Bk1.c("Failed to create from saved string: " + e.getMessage());
            H0();
        }
    }

    public static C2279Su w0(int i, JSONObject jSONObject) {
        return new C2279Su(i, jSONObject, true);
    }

    public static C2279Su y0(int i, JSONObject jSONObject) {
        return new C2279Su(i, jSONObject, false);
    }

    public C2591Vu A0(C2591Vu c2591Vu) {
        return new C2591Vu(-1, F0(c2591Vu.c), this);
    }

    public C2591Vu B0(int i) {
        if (i >= 0 && i < this.e.length()) {
            try {
                return new C2591Vu(i, this.e.getJSONObject(i), this);
            } catch (JSONException e) {
                AbstractC0441Bk1.c(e.getMessage());
            }
        }
        return null;
    }

    public C2591Vu C0(List list, int i) {
        int iX = list.size() > i ? AbstractC0405Bb1.x((String) list.get(i), -1) : -1;
        if (iX < 0) {
            return null;
        }
        C2591Vu c2591VuB0 = B0(iX);
        if (c2591VuB0 == null) {
            AbstractC0441Bk1.c("entry is null");
            return null;
        }
        while (true) {
            i++;
            if (i >= list.size()) {
                return c2591VuB0;
            }
            c2591VuB0 = c2591VuB0.h((String) list.get(i));
        }
    }

    @Override // com.daaw.RW
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public C2591Vu a(int i) {
        return B0(i);
    }

    public final JSONObject E0() {
        return F0(null);
    }

    public final JSONObject F0(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject != null) {
            try {
                jSONObject2 = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
                AbstractC0441Bk1.c("json obj cloning failed");
                jSONObject2 = new JSONObject();
            }
        } else {
            jSONObject2 = new JSONObject();
        }
        this.e.put(jSONObject2);
        return jSONObject2;
    }

    public void G0() {
        H0();
    }

    public final void H0() {
        try {
            JSONArray jSONArray = new JSONArray();
            this.e = jSONArray;
            this.c.put("elements", jSONArray);
        } catch (JSONException e) {
            AbstractC0441Bk1.c(e.getMessage());
            this.e = null;
        }
    }

    public void I0(int i, C2591Vu c2591Vu) {
        try {
            this.e.put(i, c2591Vu.c);
        } catch (JSONException unused) {
        }
    }

    @Override // com.daaw.RW
    public int c() {
        return this.e.length();
    }

    public int x0() {
        return this.f;
    }

    @Override // com.daaw.RW
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public C2591Vu b() {
        return new C2591Vu(-1, E0(), this);
    }
}
