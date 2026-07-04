package com.android.billingclient.api;

import android.text.TextUtils;
import com.daaw.AbstractC9714xr1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final String a;
    public final JSONObject b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final List l;
    public final List m;

    public static final class a {
        public final int a;
        public final int b;

        public a(JSONObject jSONObject) {
            this.a = jSONObject.getInt("commitmentPaymentsCount");
            this.b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
    }

    public static final class b {
        public final String a;
        public final long b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final AbstractC9714xr1 g;
        public final Long h;
        public final j i;
        public final n j;
        public final k k;
        public final l l;
        public final m m;

        public b(JSONObject jSONObject) {
            this.a = jSONObject.optString("formattedPrice");
            this.b = jSONObject.optLong("priceAmountMicros");
            this.c = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.d = true == strOptString.isEmpty() ? null : strOptString;
            String strOptString2 = jSONObject.optString("offerId");
            this.e = true == strOptString2.isEmpty() ? null : strOptString2;
            String strOptString3 = jSONObject.optString("purchaseOptionId");
            this.f = true == strOptString3.isEmpty() ? null : strOptString3;
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                }
            }
            this.g = AbstractC9714xr1.G(arrayList);
            this.h = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.i = jSONObjectOptJSONObject == null ? null : new j(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.j = jSONObjectOptJSONObject2 == null ? null : new n(jSONObjectOptJSONObject2);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.k = jSONObjectOptJSONObject3 == null ? null : new k(jSONObjectOptJSONObject3);
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            this.l = jSONObjectOptJSONObject4 == null ? null : new l(jSONObjectOptJSONObject4);
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.m = jSONObjectOptJSONObject5 != null ? new m(jSONObjectOptJSONObject5) : null;
        }

        public String a() {
            return this.a;
        }

        public long b() {
            return this.b;
        }

        public String c() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }
    }

    public static final class c {
        public final String a;
        public final long b;
        public final String c;
        public final String d;
        public final int e;
        public final int f;

        public c(JSONObject jSONObject) {
            this.d = jSONObject.optString("billingPeriod");
            this.c = jSONObject.optString("priceCurrencyCode");
            this.a = jSONObject.optString("formattedPrice");
            this.b = jSONObject.optLong("priceAmountMicros");
            this.f = jSONObject.optInt("recurrenceMode");
            this.e = jSONObject.optInt("billingCycleCount");
        }

        public int a() {
            return this.e;
        }

        public String b() {
            return this.d;
        }

        public String c() {
            return this.a;
        }

        public long d() {
            return this.b;
        }

        public String e() {
            return this.c;
        }

        public int f() {
            return this.f;
        }
    }

    public static class d {
        public final List a;

        public d(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new c(jSONObjectOptJSONObject));
                    }
                }
            }
            this.a = arrayList;
        }

        public List a() {
            return this.a;
        }
    }

    public static final class e {
        public final String a;
        public final String b;
        public final String c;
        public final d d;
        public final List e;
        public final a f;
        public final o g;

        public e(JSONObject jSONObject) {
            this.a = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.b = true == strOptString.isEmpty() ? null : strOptString;
            this.c = jSONObject.getString("offerIdToken");
            this.d = new d(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f = jSONObjectOptJSONObject == null ? null : new a(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            this.g = jSONObjectOptJSONObject2 != null ? new o(jSONObjectOptJSONObject2) : null;
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                }
            }
            this.e = arrayList;
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public List c() {
            return this.e;
        }

        public String d() {
            return this.c;
        }

        public d e() {
            return this.d;
        }
    }

    public f(String str) {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.e = jSONObject.optString("title");
        this.f = jSONObject.optString("name");
        this.g = jSONObject.optString("description");
        this.i = jSONObject.optString("packageDisplayName");
        this.j = jSONObject.optString("iconUrl");
        this.h = jSONObject.optString("skuDetailsToken");
        this.k = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(new e(jSONArrayOptJSONArray.getJSONObject(i)));
            }
            this.l = arrayList;
        } else {
            this.l = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                arrayList2.add(new b(jSONArrayOptJSONArray2.getJSONObject(i2)));
            }
            this.m = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.m = null;
        } else {
            arrayList2.add(new b(jSONObjectOptJSONObject));
            this.m = arrayList2;
        }
    }

    public String a() {
        return this.g;
    }

    public b b() {
        List list = this.m;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) this.m.get(0);
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public List e() {
        return this.l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return TextUtils.equals(this.a, ((f) obj).a);
        }
        return false;
    }

    public String f() {
        return this.e;
    }

    public final String g() {
        return this.b.optString("packageName");
    }

    public final String h() {
        return this.h;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String i() {
        return this.k;
    }

    public String toString() {
        List list = this.l;
        return "ProductDetails{jsonString='" + this.a + "', parsedJson=" + this.b.toString() + ", productId='" + this.c + "', productType='" + this.d + "', title='" + this.e + "', productDetailsToken='" + this.h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }
}
