package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzem {
    public final String a;
    public final Bundle b;
    public final String c;

    public zzem(String str, Bundle bundle, String str2) {
        this.a = str;
        this.b = bundle;
        this.c = str2;
    }

    public final Bundle zza() {
        return this.b;
    }

    public final String zzb() {
        return this.a;
    }

    public final String zzc() {
        if (TextUtils.isEmpty(this.c)) {
            return "";
        }
        try {
            return new JSONObject(this.c).optString(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID, "");
        } catch (JSONException unused) {
            return "";
        }
    }
}
