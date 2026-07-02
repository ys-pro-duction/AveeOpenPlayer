package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class QA2 implements InterfaceC1343Jz2 {
    public final String a;
    public final int b;

    public QA2(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(this.a) || this.b == -1) {
            return;
        }
        try {
            JSONObject jSONObjectZzf = zzbw.zzf(jSONObject, "pii");
            jSONObjectZzf.put("pvid", this.a);
            jSONObjectZzf.put("pvid_s", this.b);
        } catch (JSONException e) {
            zze.zzb("Failed putting gms core app set ID info.", e);
        }
    }
}
