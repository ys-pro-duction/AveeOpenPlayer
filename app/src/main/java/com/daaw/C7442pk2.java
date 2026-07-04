package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.pk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7442pk2 {
    public Long a;
    public final String b;
    public String c;
    public Integer d;
    public String e;
    public Integer f;

    public /* synthetic */ C7442pk2(String str, AbstractC7163ok2 abstractC7163ok2) {
        this.b = str;
    }

    public static /* bridge */ /* synthetic */ String a(C7442pk2 c7442pk2) {
        String str = (String) zzba.zzc().b(AbstractC9820yE1.r9);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", c7442pk2.a);
            jSONObject.put("eventCategory", c7442pk2.b);
            jSONObject.putOpt("event", c7442pk2.c);
            jSONObject.putOpt("errorCode", c7442pk2.d);
            jSONObject.putOpt("rewardType", c7442pk2.e);
            jSONObject.putOpt("rewardAmount", c7442pk2.f);
        } catch (JSONException unused) {
            AbstractC4274eT1.zzj("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
