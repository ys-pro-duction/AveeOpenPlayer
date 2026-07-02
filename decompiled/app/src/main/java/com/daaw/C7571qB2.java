package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.qB2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7571qB2 implements InterfaceC1343Jz2 {
    public final List a;

    public C7571qB2(List list) {
        this.a = list;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.a));
        } catch (JSONException unused) {
            zze.zza("Failed putting experiment ids.");
        }
    }
}
