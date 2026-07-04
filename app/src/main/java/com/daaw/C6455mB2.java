package com.daaw;

import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.mB2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6455mB2 implements InterfaceC1343Jz2 {
    public final String a;
    public final String b;

    public C6455mB2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            JSONObject jSONObjectZzf = zzbw.zzf((JSONObject) obj, "pii");
            jSONObjectZzf.put("doritos", this.a);
            jSONObjectZzf.put("doritos_v2", this.b);
        } catch (JSONException unused) {
            zze.zza("Failed putting doritos string.");
        }
    }
}
