package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbw;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class RB2 implements InterfaceC1343Jz2 {
    public final String a;

    public RB2(String str) {
        this.a = str;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (TextUtils.isEmpty(this.a)) {
                return;
            }
            zzbw.zzf(jSONObject, "pii").put("adsid", this.a);
        } catch (JSONException e) {
            AbstractC4274eT1.zzk("Failed putting trustless token.", e);
        }
    }
}
