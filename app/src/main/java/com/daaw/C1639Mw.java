package com.daaw;

import com.daaw.InterfaceC5766jm;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Mw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1639Mw extends L8 {
    public final String a;
    public final long b;
    public final long c;

    public C1639Mw(String str, long j) {
        this(str, j, new InterfaceC5766jm.a().a());
    }

    public static C1639Mw c(N8 n8) {
        long jG;
        AbstractC7506py0.l(n8);
        try {
            jG = (long) (Double.parseDouble(n8.b().replace("s", "")) * 1000.0d);
        } catch (NumberFormatException unused) {
            Map mapB = AbstractC4736g41.b(n8.c());
            jG = 1000 * (g(mapB, "exp") - g(mapB, "iat"));
        }
        return new C1639Mw(n8.c(), jG);
    }

    public static C1639Mw d(String str) {
        AbstractC7506py0.l(str);
        Map mapB = AbstractC4736g41.b(str);
        long jG = g(mapB, "iat");
        return new C1639Mw(str, (g(mapB, "exp") - jG) * 1000, jG * 1000);
    }

    public static C1639Mw e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C1639Mw(jSONObject.getString("token"), jSONObject.getLong("expiresIn"), jSONObject.getLong("receivedAt"));
        } catch (JSONException e) {
            e.getMessage();
            return null;
        }
    }

    public static long g(Map map, String str) {
        AbstractC7506py0.l(map);
        AbstractC7506py0.f(str);
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    @Override // com.daaw.L8
    public long a() {
        return this.b + this.c;
    }

    @Override // com.daaw.L8
    public String b() {
        return this.a;
    }

    public long f() {
        return this.c;
    }

    public long h() {
        return this.b;
    }

    public String i() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", this.a);
            jSONObject.put("receivedAt", this.b);
            jSONObject.put("expiresIn", this.c);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.getMessage();
            return null;
        }
    }

    public C1639Mw(String str, long j, long j2) {
        AbstractC7506py0.f(str);
        this.a = str;
        this.c = j;
        this.b = j2;
    }
}
