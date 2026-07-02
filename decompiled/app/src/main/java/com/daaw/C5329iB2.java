package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.iB2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5329iB2 implements InterfaceC1447Kz2 {
    public final JSONObject a;

    public C5329iB2(Context context) {
        this.a = PP1.c(context);
    }

    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.a);
        } catch (JSONException unused) {
            zze.zza("Failed putting version constants.");
        }
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 46;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return AbstractC7360pS2.h(new InterfaceC1343Jz2() { // from class: com.daaw.hB2
            @Override // com.daaw.InterfaceC1343Jz2
            public final void a(Object obj) {
                this.a.a((JSONObject) obj);
            }
        });
    }
}
