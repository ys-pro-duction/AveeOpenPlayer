package com.daaw;

import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Sx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2291Sx implements QQ0 {
    public final String a;
    public final AW b;
    public final C2106Rd0 c;

    public C2291Sx(String str, AW aw) {
        this(str, aw, C2106Rd0.f());
    }

    @Override // com.daaw.QQ0
    public JSONObject a(PQ0 pq0, boolean z) {
        if (!z) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map mapF = f(pq0);
            C10169zW c10169zWB = b(d(mapF), pq0);
            this.c.b("Requesting settings from " + this.a);
            this.c.i("Settings query params were: " + mapF);
            return g(c10169zWB.c());
        } catch (IOException e) {
            this.c.e("Settings request failed.", e);
            return null;
        }
    }

    public final C10169zW b(C10169zW c10169zW, PQ0 pq0) {
        c(c10169zW, "X-CRASHLYTICS-GOOGLE-APP-ID", pq0.a);
        c(c10169zW, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(c10169zW, "X-CRASHLYTICS-API-CLIENT-VERSION", C0475Bt.i());
        c(c10169zW, "Accept", "application/json");
        c(c10169zW, "X-CRASHLYTICS-DEVICE-MODEL", pq0.b);
        c(c10169zW, "X-CRASHLYTICS-OS-BUILD-VERSION", pq0.c);
        c(c10169zW, "X-CRASHLYTICS-OS-DISPLAY-VERSION", pq0.d);
        c(c10169zW, "X-CRASHLYTICS-INSTALLATION-ID", pq0.e.a());
        return c10169zW;
    }

    public final void c(C10169zW c10169zW, String str, String str2) {
        if (str2 != null) {
            c10169zW.d(str, str2);
        }
    }

    public C10169zW d(Map map) {
        return this.b.a(this.a, map).d("User-Agent", "Crashlytics Android SDK/" + C0475Bt.i()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    public final JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            this.c.l("Failed to parse settings JSON from " + this.a, e);
            this.c.k("Settings response " + str);
            return null;
        }
    }

    public final Map f(PQ0 pq0) {
        HashMap map = new HashMap();
        map.put("build_version", pq0.h);
        map.put("display_version", pq0.g);
        map.put("source", Integer.toString(pq0.i));
        String str = pq0.f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public JSONObject g(BW bw) {
        int iB = bw.b();
        this.c.i("Settings response code was: " + iB);
        if (h(iB)) {
            return e(bw.a());
        }
        this.c.d("Settings request failed; (status: " + iB + ") from " + this.a);
        return null;
    }

    public boolean h(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    public C2291Sx(String str, AW aw, C2106Rd0 c2106Rd0) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.c = c2106Rd0;
        this.b = aw;
        this.a = str;
    }
}
