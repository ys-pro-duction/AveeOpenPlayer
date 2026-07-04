package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PurchaseHistoryRecord {
    public final String a;
    public final String b;
    public final JSONObject c;

    public PurchaseHistoryRecord(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = new JSONObject(str);
    }

    public String a() {
        return this.a;
    }

    public List b() {
        return g();
    }

    public long c() {
        return this.c.optLong("purchaseTime");
    }

    public String d() {
        JSONObject jSONObject = this.c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.a, purchaseHistoryRecord.a()) && TextUtils.equals(this.b, purchaseHistoryRecord.e());
    }

    public ArrayList f() {
        return g();
    }

    public final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        if (this.c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i));
                }
            }
        } else if (this.c.has("productId")) {
            arrayList.add(this.c.optString("productId"));
        }
        return arrayList;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.a));
    }
}
