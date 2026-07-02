package com.daaw;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.vK2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9008vK2 {
    public JSONObject a;
    public final HK2 b;

    public C9008vK2(HK2 hk2) {
        this.b = hk2;
    }

    public final JSONObject a() {
        return this.a;
    }

    public final void b() {
        this.b.b(new IK2(this));
    }

    public final void c(JSONObject jSONObject, HashSet hashSet, long j) {
        this.b.b(new JK2(this, hashSet, jSONObject, j));
    }

    public final void d(JSONObject jSONObject, HashSet hashSet, long j) {
        this.b.b(new KK2(this, hashSet, jSONObject, j));
    }

    public final void e(JSONObject jSONObject) {
        this.a = jSONObject;
    }
}
