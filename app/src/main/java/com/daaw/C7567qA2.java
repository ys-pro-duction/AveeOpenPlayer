package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.qA2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7567qA2 implements InterfaceC1343Jz2 {
    public final String a;

    public C7567qA2(String str) {
        this.a = str;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.a);
        } catch (JSONException e) {
            zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
