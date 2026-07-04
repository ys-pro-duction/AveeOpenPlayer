package com.daaw;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Ft2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0903Ft2 implements InterfaceC2890Yq2 {
    public final Map a = new HashMap();
    public final C8826ui2 b;

    public C0903Ft2(C8826ui2 c8826ui2) {
        this.b = c8826ui2;
    }

    @Override // com.daaw.InterfaceC2890Yq2
    public final C2994Zq2 a(String str, JSONObject jSONObject) {
        C2994Zq2 c2994Zq2;
        synchronized (this) {
            try {
                c2994Zq2 = (C2994Zq2) this.a.get(str);
                if (c2994Zq2 == null) {
                    c2994Zq2 = new C2994Zq2(this.b.c(str, jSONObject), new BinderC3836cs2(), str);
                    this.a.put(str, c2994Zq2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2994Zq2;
    }
}
