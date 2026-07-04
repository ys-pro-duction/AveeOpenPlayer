package com.daaw;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.zJ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10120zJ2 {
    public final HJ2 a;
    public final HJ2 b;
    public final DJ2 c;
    public final GJ2 d;

    public C10120zJ2(DJ2 dj2, GJ2 gj2, HJ2 hj2, HJ2 hj22, boolean z) {
        this.c = dj2;
        this.d = gj2;
        this.a = hj2;
        if (hj22 == null) {
            this.b = HJ2.NONE;
        } else {
            this.b = hj22;
        }
    }

    public static C10120zJ2 a(DJ2 dj2, GJ2 gj2, HJ2 hj2, HJ2 hj22, boolean z) {
        AbstractC7885rK2.b(gj2, "ImpressionType is null");
        AbstractC7885rK2.b(hj2, "Impression owner is null");
        if (hj2 == HJ2.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (dj2 == DJ2.DEFINED_BY_JAVASCRIPT && hj2 == HJ2.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (gj2 == GJ2.DEFINED_BY_JAVASCRIPT && hj2 == HJ2.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new C10120zJ2(dj2, gj2, hj2, hj22, true);
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        AbstractC6491mK2.e(jSONObject, "impressionOwner", this.a);
        AbstractC6491mK2.e(jSONObject, "mediaEventsOwner", this.b);
        AbstractC6491mK2.e(jSONObject, "creativeType", this.c);
        AbstractC6491mK2.e(jSONObject, "impressionType", this.d);
        AbstractC6491mK2.e(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
