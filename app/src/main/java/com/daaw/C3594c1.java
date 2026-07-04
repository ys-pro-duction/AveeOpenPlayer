package com.daaw;

import android.text.TextUtils;
import com.daaw.W3;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3594c1 {
    public static final String[] g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    public static final DateFormat h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    public final String a;
    public final String b;
    public final String c;
    public final Date d;
    public final long e;
    public final long f;

    public C3594c1(String str, String str2, String str3, Date date, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = date;
        this.e = j;
        this.f = j2;
    }

    public static C3594c1 a(W3.c cVar) {
        String str = cVar.d;
        if (str == null) {
            str = "";
        }
        return new C3594c1(cVar.b, String.valueOf(cVar.c), str, new Date(cVar.m), cVar.e, cVar.j);
    }

    public static C3594c1 b(Map map) throws C3316b1 {
        g(map);
        try {
            return new C3594c1((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis")));
        } catch (NumberFormatException e) {
            throw new C3316b1("Could not process experiment: one of the durations could not be converted into a long.", e);
        } catch (ParseException e2) {
            throw new C3316b1("Could not process experiment: parsing experiment start time failed.", e2);
        }
    }

    public static void g(Map map) throws C3316b1 {
        ArrayList arrayList = new ArrayList();
        for (String str : g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new C3316b1(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    public String c() {
        return this.a;
    }

    public long d() {
        return this.d.getTime();
    }

    public String e() {
        return this.b;
    }

    public W3.c f(String str) {
        W3.c cVar = new W3.c();
        cVar.a = str;
        cVar.m = d();
        cVar.b = this.a;
        cVar.c = this.b;
        cVar.d = TextUtils.isEmpty(this.c) ? null : this.c;
        cVar.e = this.e;
        cVar.j = this.f;
        return cVar;
    }
}
