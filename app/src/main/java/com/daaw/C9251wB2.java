package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.wB2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9251wB2 implements InterfaceC1343Jz2 {
    public final Bundle a;

    public C9251wB2(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.a != null) {
            try {
                zzbw.zzf(zzbw.zzf(jSONObject, "device"), "play_store").put("parental_controls", zzay.zzb().l(this.a));
            } catch (JSONException unused) {
                zze.zza("Failed putting parental controls bundle.");
            }
        }
    }
}
