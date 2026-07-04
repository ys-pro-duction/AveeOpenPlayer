package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import com.daaw.InterfaceC2367Tq;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.as3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3280as3 {
    public final Application a;
    public final C6071kp1 b;
    public final Handler c;
    public final Executor d;
    public final C0814Ex1 e;
    public final C10131zM1 f;
    public final C10224zh3 g;
    public final C1394Km1 h;
    public final DS2 i;

    public C3280as3(Application application, C6071kp1 c6071kp1, Handler handler, Executor executor, C0814Ex1 c0814Ex1, C10131zM1 c10131zM1, C10224zh3 c10224zh3, C1394Km1 c1394Km1, DS2 ds2) {
        this.a = application;
        this.b = c6071kp1;
        this.c = handler;
        this.d = executor;
        this.e = c0814Ex1;
        this.f = c10131zM1;
        this.g = c10224zh3;
        this.h = c1394Km1;
        this.i = ds2;
    }

    public final /* synthetic */ void a(final InterfaceC2367Tq.b bVar, C2669Wn1 c2669Wn1) {
        Handler handler = this.c;
        bVar.getClass();
        handler.post(new Runnable() { // from class: com.daaw.tp3
            @Override // java.lang.Runnable
            public final void run() {
                bVar.a();
            }
        });
        if (c2669Wn1.b != InterfaceC2367Tq.c.NOT_REQUIRED) {
            this.f.c();
        }
    }

    public final /* synthetic */ void b(Activity activity, C2471Uq c2471Uq, final InterfaceC2367Tq.b bVar, final InterfaceC2367Tq.a aVar) throws IllegalAccessException, InvocationTargetException {
        try {
            C2157Rq c2157RqA = c2471Uq.a();
            if (c2157RqA == null || !c2157RqA.b()) {
                H02.a(this.a);
            }
            final C2669Wn1 c2669Wn1A = new Bt3(this.h, d(this.g.d(activity, c2471Uq))).a();
            this.e.e(c2669Wn1A.a);
            this.e.f(c2669Wn1A.b);
            this.f.d(c2669Wn1A.c);
            this.i.a().execute(new Runnable() { // from class: com.daaw.Io3
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.a(bVar, c2669Wn1A);
                }
            });
        } catch (C4304ea3 e) {
            this.c.post(new Runnable() { // from class: com.daaw.bq3
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a(e.a());
                }
            });
        } catch (RuntimeException e2) {
            final C4304ea3 c4304ea3 = new C4304ea3(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e2))));
            this.c.post(new Runnable() { // from class: com.daaw.Kq3
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a(c4304ea3.a());
                }
            });
        }
    }

    public final void c(final Activity activity, final C2471Uq c2471Uq, final InterfaceC2367Tq.b bVar, final InterfaceC2367Tq.a aVar) {
        this.d.execute(new Runnable() { // from class: com.daaw.ur3
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, InvocationTargetException {
                this.B.b(activity, c2471Uq, bVar, aVar);
            }
        });
    }

    public final C3035a02 d(QY1 qy1) throws C4304ea3, IllegalAccessException, InvocationTargetException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(this.a));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = qy1.a;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    String str2 = qy1.b;
                    if (str2 != null) {
                        jsonWriter.name("adid");
                        jsonWriter.value(str2);
                    }
                    C7654qW1 c7654qW1 = qy1.c;
                    if (c7654qW1 != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i = c7654qW1.c;
                        if (i != 1) {
                            jsonWriter.name("os_type");
                            int i2 = i - 1;
                            if (i2 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i2 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str3 = c7654qW1.a;
                        if (str3 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str3);
                        }
                        Integer num = c7654qW1.b;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str4 = qy1.d;
                    if (str4 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str4);
                    }
                    Boolean bool = qy1.e;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = qy1.f;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    EX1 ex1 = qy1.g;
                    if (ex1 != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = ex1.a;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = ex1.b;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d = ex1.c;
                        if (d != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d);
                        }
                        List<YW1> list = ex1.d;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (YW1 yw1 : list) {
                                jsonWriter.beginObject();
                                Integer num4 = yw1.a;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = yw1.b;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = yw1.c;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = yw1.d;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    C4282eV1 c4282eV1 = qy1.h;
                    if (c4282eV1 != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str5 = c4282eV1.a;
                        if (str5 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = c4282eV1.b;
                        if (str6 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str6);
                        }
                        String str7 = c4282eV1.c;
                        if (str7 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str7);
                        }
                        jsonWriter.endObject();
                    }
                    C5979kY1 c5979kY1 = qy1.i;
                    if (c5979kY1 != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        String str8 = c5979kY1.a;
                        if (str8 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str8);
                        }
                        jsonWriter.endObject();
                    }
                    List list2 = qy1.j;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            int iOrdinal = ((KV1) it.next()).ordinal();
                            if (iOrdinal == 0) {
                                jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                            } else if (iOrdinal == 1) {
                                jsonWriter.value("ALWAYS_SHOW");
                            } else if (iOrdinal == 2) {
                                jsonWriter.value("GEO_OVERRIDE_EEA");
                            } else if (iOrdinal == 3) {
                                jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                            } else if (iOrdinal == 4) {
                                jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        C3035a02 c3035a02A = C3035a02.a(new JsonReader(new StringReader(headerField)));
                        c3035a02A.a = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return c3035a02A;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            C3035a02 c3035a02A2 = C3035a02.a(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return c3035a02A2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (SocketTimeoutException e) {
            throw new C4304ea3(4, "The server timed out.", e);
        } catch (IOException e2) {
            throw new C4304ea3(2, "Error making request.", e2);
        }
    }
}
