package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class WA2 implements InterfaceC1343Jz2 {
    public final String a;

    public WA2(String str) {
        this.a = str;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            JSONObject jSONObjectZzf = zzbw.zzf((JSONObject) obj, "pii");
            if (TextUtils.isEmpty(this.a)) {
                return;
            }
            jSONObjectZzf.put("attok", this.a);
        } catch (JSONException e) {
            zze.zzb("Failed putting attestation token.", e);
        }
    }
}
