package com.daaw;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.vs2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9162vs2 implements InterfaceC2890Yq2 {
    public final C8826ui2 a;

    public C9162vs2(C8826ui2 c8826ui2) {
        this.a = c8826ui2;
    }

    @Override // com.daaw.InterfaceC2890Yq2
    public final C2994Zq2 a(String str, JSONObject jSONObject) {
        return new C2994Zq2(this.a.c(str, jSONObject), new BinderC3558bs2(), str);
    }
}
