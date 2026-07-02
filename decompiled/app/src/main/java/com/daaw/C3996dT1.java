package com.daaw;

import android.util.JsonWriter;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: com.daaw.dT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3996dT1 {
    public static boolean c = false;
    public static boolean d = false;
    public final List a;
    public static final Object b = new Object();
    public static final InterfaceC5485im e = C2599Vw.d();
    public static final Set f = new HashSet(Arrays.asList(new String[0]));

    public C3996dT1(String str) {
        this.a = !k() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public static /* synthetic */ void a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        r(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(AbstractC6293le.a(bArr));
        }
        jsonWriter.endObject();
    }

    public static /* synthetic */ void b(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        r(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static void i() {
        synchronized (b) {
            c = false;
            d = false;
            AbstractC4274eT1.zzj("Ad debug logging enablement is out of date.");
        }
    }

    public static void j(boolean z) {
        synchronized (b) {
            c = true;
            d = z;
        }
    }

    public static boolean k() {
        boolean z;
        synchronized (b) {
            try {
                z = false;
                if (c && d) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public static boolean l() {
        boolean z;
        synchronized (b) {
            z = c;
        }
        return z;
    }

    public static synchronized void m(String str) {
        try {
            AbstractC4274eT1.zzi("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                AbstractC4274eT1.zzi("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i, Math.min(i2, str.length())))));
                i = i2;
            }
            AbstractC4274eT1.zzi("GMA Debug FINISH");
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void r(JsonWriter jsonWriter, Map map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        AbstractC4274eT1.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void c(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (k()) {
            p(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void d(String str, String str2, Map map, byte[] bArr) {
        if (k()) {
            p(str, "GET", map, bArr);
        }
    }

    public final void e(HttpURLConnection httpURLConnection, int i) {
        if (k()) {
            String responseMessage = null;
            q(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e2) {
                    AbstractC4274eT1.zzj("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e2.getMessage())));
                }
                o(responseMessage);
            }
        }
    }

    public final void f(Map map, int i) {
        if (k()) {
            q(map, i);
            if (i < 200 || i >= 300) {
                o(null);
            }
        }
    }

    public final void g(String str) {
        if (k() && str != null) {
            h(str.getBytes());
        }
    }

    public final void h(final byte[] bArr) {
        n("onNetworkResponseBody", new InterfaceC3717cT1() { // from class: com.daaw.ZS1
            @Override // com.daaw.InterfaceC3717cT1
            public final void a(JsonWriter jsonWriter) throws IOException {
                Object obj = C3996dT1.b;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String strA = AbstractC6293le.a(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(strA);
                } else {
                    String strI = XS1.i(strA);
                    if (strI != null) {
                        jsonWriter.name("bodydigest").value(strI);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    public final void n(String str, InterfaceC3717cT1 interfaceC3717cT1) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name(DiagnosticsEntry.Event.TIMESTAMP_KEY).value(e.a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            interfaceC3717cT1.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e2) {
            AbstractC4274eT1.zzh("unable to log", e2);
        }
        m(stringWriter.toString());
    }

    public final void o(final String str) {
        n("onNetworkRequestError", new InterfaceC3717cT1() { // from class: com.daaw.aT1
            @Override // com.daaw.InterfaceC3717cT1
            public final void a(JsonWriter jsonWriter) throws IOException {
                Object obj = C3996dT1.b;
                jsonWriter.name("params").beginObject();
                String str2 = str;
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    public final void p(final String str, final String str2, final Map map, final byte[] bArr) {
        n("onNetworkRequest", new InterfaceC3717cT1() { // from class: com.daaw.YS1
            @Override // com.daaw.InterfaceC3717cT1
            public final void a(JsonWriter jsonWriter) throws IOException {
                C3996dT1.a(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    public final void q(final Map map, final int i) {
        n("onNetworkResponse", new InterfaceC3717cT1() { // from class: com.daaw.bT1
            @Override // com.daaw.InterfaceC3717cT1
            public final void a(JsonWriter jsonWriter) throws IOException {
                C3996dT1.b(i, map, jsonWriter);
            }
        });
    }
}
