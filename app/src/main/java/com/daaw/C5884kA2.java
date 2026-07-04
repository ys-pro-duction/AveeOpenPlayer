package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.kA2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5884kA2 implements InterfaceC1343Jz2 {
    public final AdvertisingIdClient.Info a;
    public final String b;
    public final C8730uM2 c;

    public C5884kA2(AdvertisingIdClient.Info info, String str, C8730uM2 c8730uM2) {
        this.a = info;
        this.b = str;
        this.c = c8730uM2;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            JSONObject jSONObjectZzf = zzbw.zzf((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.a;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.b;
                if (str != null) {
                    jSONObjectZzf.put("pdid", str);
                    jSONObjectZzf.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectZzf.put("rdid", this.a.getId());
            jSONObjectZzf.put("is_lat", this.a.isLimitAdTrackingEnabled());
            jSONObjectZzf.put("idtype", "adid");
            C8730uM2 c8730uM2 = this.c;
            if (c8730uM2.c()) {
                jSONObjectZzf.put("paidv1_id_android_3p", c8730uM2.b());
                jSONObjectZzf.put("paidv1_creation_time_android_3p", this.c.a());
            }
        } catch (JSONException e) {
            zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
