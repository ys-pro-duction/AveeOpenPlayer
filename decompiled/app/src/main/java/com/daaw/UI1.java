package com.daaw;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class UI1 implements VI1 {
    public final /* synthetic */ BT1 a;

    public UI1(WI1 wi1, BT1 bt1) {
        this.a = bt1;
    }

    @Override // com.daaw.VI1
    public final void a(JSONObject jSONObject) {
        this.a.b(jSONObject);
    }

    @Override // com.daaw.VI1
    public final void zza(String str) {
        this.a.c(new C4521fL1(str));
    }
}
