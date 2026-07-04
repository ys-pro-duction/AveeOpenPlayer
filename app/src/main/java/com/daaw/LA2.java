package com.daaw;

import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class LA2 implements InterfaceC1343Jz2 {
    public final JSONObject a;

    public LA2(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            JSONObject jSONObjectZzf = zzbw.zzf((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.a;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectZzf.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
            zze.zza("Failed putting app indexing json.");
        }
    }
}
