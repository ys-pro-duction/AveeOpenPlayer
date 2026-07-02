package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.fB2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4482fB2 implements InterfaceC1343Jz2 {
    public final JSONObject a;

    public C4482fB2(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.a);
        } catch (JSONException unused) {
            zze.zza("Unable to get cache_state");
        }
    }
}
