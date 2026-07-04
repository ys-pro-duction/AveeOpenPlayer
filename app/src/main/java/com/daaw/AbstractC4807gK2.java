package com.daaw;

import android.os.Build;
import android.webkit.WebView;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.gK2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4807gK2 {
    public MK2 a;
    public long b;
    public int c;

    public AbstractC4807gK2() {
        b();
        this.a = new MK2(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView a() {
        return (WebView) this.a.get();
    }

    public final void b() {
        this.b = System.nanoTime();
        this.c = 1;
    }

    public void c() {
        this.a.clear();
    }

    public final void d(String str, long j) {
        if (j < this.b || this.c == 3) {
            return;
        }
        this.c = 3;
        ZJ2.a().g(a(), str);
    }

    public final void e(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        AbstractC6491mK2.e(jSONObject, DiagnosticsEntry.Event.TIMESTAMP_KEY, Long.valueOf(date.getTime()));
        ZJ2.a().f(a(), jSONObject);
    }

    public final void f(String str, long j) {
        if (j >= this.b) {
            this.c = 2;
            ZJ2.a().g(a(), str);
        }
    }

    public void g(CJ2 cj2, AJ2 aj2) {
        h(cj2, aj2, null);
    }

    public final void h(CJ2 cj2, AJ2 aj2, JSONObject jSONObject) {
        String strH = cj2.h();
        JSONObject jSONObject2 = new JSONObject();
        AbstractC6491mK2.e(jSONObject2, "environment", "app");
        AbstractC6491mK2.e(jSONObject2, "adSessionType", aj2.d());
        JSONObject jSONObject3 = new JSONObject();
        AbstractC6491mK2.e(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        AbstractC6491mK2.e(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        AbstractC6491mK2.e(jSONObject3, "os", "Android");
        AbstractC6491mK2.e(jSONObject2, "deviceInfo", jSONObject3);
        AbstractC6491mK2.e(jSONObject2, "deviceCategory", AbstractC6212lK2.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        AbstractC6491mK2.e(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        AbstractC6491mK2.e(jSONObject4, "partnerName", aj2.e().b());
        AbstractC6491mK2.e(jSONObject4, "partnerVersion", aj2.e().c());
        AbstractC6491mK2.e(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        AbstractC6491mK2.e(jSONObject5, "libraryVersion", "1.4.8-google_20230803");
        AbstractC6491mK2.e(jSONObject5, "appId", TJ2.b().a().getApplicationContext().getPackageName());
        AbstractC6491mK2.e(jSONObject2, "app", jSONObject5);
        if (aj2.f() != null) {
            AbstractC6491mK2.e(jSONObject2, "contentUrl", aj2.f());
        }
        AbstractC6491mK2.e(jSONObject2, "customReferenceData", aj2.g());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = aj2.h().iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            throw null;
        }
        ZJ2.a().h(a(), strH, jSONObject2, jSONObject6, jSONObject);
    }

    public final void i(float f) {
        ZJ2.a().e(a(), f);
    }

    public final void j(WebView webView) {
        this.a = new MK2(webView);
    }

    public final boolean l() {
        return this.a.get() != 0;
    }

    public void k() {
    }
}
