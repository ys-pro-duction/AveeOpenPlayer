package com.daaw;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Dx2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0711Dx2 implements InterfaceC1343Jz2 {
    public final JSONObject a;
    public final JSONObject b;

    public C0711Dx2(JSONObject jSONObject, JSONObject jSONObject2) {
        this.a = jSONObject;
        this.b = jSONObject2;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        JSONObject jSONObject = this.a;
        Bundle bundle = (Bundle) obj;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
