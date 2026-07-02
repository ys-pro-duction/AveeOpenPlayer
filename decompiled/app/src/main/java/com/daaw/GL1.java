package com.daaw;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class GL1 implements VI1 {
    public final BT1 a;
    public final /* synthetic */ HL1 b;

    public GL1(HL1 hl1, BT1 bt1) {
        this.b = hl1;
        this.a = bt1;
    }

    @Override // com.daaw.VI1
    public final void a(JSONObject jSONObject) {
        try {
            this.a.b(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.a.c(e);
        }
    }

    @Override // com.daaw.VI1
    public final void zza(String str) {
        try {
            if (str == null) {
                this.a.c(new C4521fL1());
            } else {
                this.a.c(new C4521fL1(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
