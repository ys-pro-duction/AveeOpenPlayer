package com.daaw;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class UL {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public UL(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC7506py0.p(!AbstractC7661qY0.b(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static UL a(Context context) {
        C5419iY0 c5419iY0 = new C5419iY0(context);
        String strA = c5419iY0.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new UL(strA, c5419iY0.a("google_api_key"), c5419iY0.a("firebase_database_url"), c5419iY0.a("ga_trackingId"), c5419iY0.a("gcm_defaultSenderId"), c5419iY0.a("google_storage_bucket"), c5419iY0.a("project_id"));
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UL)) {
            return false;
        }
        UL ul = (UL) obj;
        return AbstractC8022rp0.a(this.b, ul.b) && AbstractC8022rp0.a(this.a, ul.a) && AbstractC8022rp0.a(this.c, ul.c) && AbstractC8022rp0.a(this.d, ul.d) && AbstractC8022rp0.a(this.e, ul.e) && AbstractC8022rp0.a(this.f, ul.f) && AbstractC8022rp0.a(this.g, ul.g);
    }

    public int hashCode() {
        return AbstractC8022rp0.b(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
    }

    public String toString() {
        return AbstractC8022rp0.c(this).a("applicationId", this.b).a("apiKey", this.a).a("databaseUrl", this.c).a("gcmSenderId", this.e).a("storageBucket", this.f).a("projectId", this.g).toString();
    }
}
