package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.i12, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5280i12 implements Y02 {
    public final C7447pl2 a;

    public C5280i12(C7447pl2 c7447pl2) {
        this.a = c7447pl2;
    }

    @Override // com.daaw.Y02
    public final void b(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.V8)).booleanValue()) {
                this.a.m(jSONObject);
            }
        }
    }
}
