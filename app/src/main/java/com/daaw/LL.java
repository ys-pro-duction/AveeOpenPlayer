package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import com.daaw.AbstractC5294i41;
import com.daaw.AbstractC6957o00;
import com.daaw.SL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class LL {
    public static final Pattern d = Pattern.compile("[0-9]+s");
    public static final Charset e = Charset.forName("UTF-8");
    public final Context a;
    public final InterfaceC7569qB0 b;
    public final C8154sI0 c = new C8154sI0();

    public LL(Context context, InterfaceC7569qB0 interfaceC7569qB0) {
        this.a = context;
        this.b = interfaceC7569qB0;
    }

    public static String a(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    public static JSONObject b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.1.3");
            return jSONObject;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.1.3");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static byte[] h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    public static boolean i(int i) {
        return i >= 200 && i < 300;
    }

    public static void k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        if (TextUtils.isEmpty(o(httpURLConnection))) {
            return;
        }
        a(str, str2, str3);
    }

    public static long m(String str) {
        AbstractC7506py0.b(d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static String o(HttpURLConnection httpURLConnection) {
        StringBuilder sb;
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, e));
        try {
            try {
                sb = new StringBuilder();
            } catch (IOException unused) {
                bufferedReader.close();
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (IOException unused3) {
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
            sb.append('\n');
            return null;
        }
        String str = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
        try {
            bufferedReader.close();
        } catch (IOException unused4) {
        }
        return str;
    }

    public static void s(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public AbstractC6957o00 d(String str, String str2, String str3, String str4, String str5) throws SL {
        int responseCode;
        AbstractC6957o00 abstractC6957o00N;
        if (!this.c.b()) {
            throw new SL("Firebase Installations Service is unavailable. Please try again later.", SL.a.UNAVAILABLE);
        }
        URL urlG = g(String.format("projects/%s/installations", str3));
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionL = l(urlG, str);
            try {
                try {
                    httpURLConnectionL.setRequestMethod("POST");
                    httpURLConnectionL.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionL.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    q(httpURLConnectionL, str2, str4);
                    responseCode = httpURLConnectionL.getResponseCode();
                    this.c.f(responseCode);
                } catch (Throwable th) {
                    httpURLConnectionL.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused) {
            }
            if (i(responseCode)) {
                abstractC6957o00N = n(httpURLConnectionL);
            } else {
                k(httpURLConnectionL, str4, str, str3);
                if (responseCode == 429) {
                    throw new SL("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", SL.a.TOO_MANY_REQUESTS);
                }
                if (responseCode < 500 || responseCode >= 600) {
                    j();
                    abstractC6957o00N = AbstractC6957o00.a().e(AbstractC6957o00.b.BAD_CONFIG).a();
                }
                httpURLConnectionL.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            httpURLConnectionL.disconnect();
            TrafficStats.clearThreadStatsTag();
            return abstractC6957o00N;
        }
        throw new SL("Firebase Installations Service is unavailable. Please try again later.", SL.a.UNAVAILABLE);
    }

    public AbstractC5294i41 e(String str, String str2, String str3, String str4) throws SL {
        int responseCode;
        AbstractC5294i41 abstractC5294i41P;
        if (!this.c.b()) {
            throw new SL("Firebase Installations Service is unavailable. Please try again later.", SL.a.UNAVAILABLE);
        }
        URL urlG = g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionL = l(urlG, str);
            try {
                try {
                    httpURLConnectionL.setRequestMethod("POST");
                    httpURLConnectionL.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionL.setDoOutput(true);
                    r(httpURLConnectionL);
                    responseCode = httpURLConnectionL.getResponseCode();
                    this.c.f(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (i(responseCode)) {
                    abstractC5294i41P = p(httpURLConnectionL);
                } else {
                    k(httpURLConnectionL, null, str, str3);
                    if (responseCode == 401 || responseCode == 404) {
                        abstractC5294i41P = AbstractC5294i41.a().b(AbstractC5294i41.b.AUTH_ERROR).a();
                    } else {
                        if (responseCode == 429) {
                            throw new SL("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", SL.a.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            j();
                            abstractC5294i41P = AbstractC5294i41.a().b(AbstractC5294i41.b.BAD_CONFIG).a();
                        }
                    }
                }
                return abstractC5294i41P;
            } finally {
                httpURLConnectionL.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new SL("Firebase Installations Service is unavailable. Please try again later.", SL.a.UNAVAILABLE);
    }

    public final String f() {
        try {
            Context context = this.a;
            byte[] bArrA = AbstractC9782y6.a(context, context.getPackageName());
            if (bArrA != null) {
                return RV.b(bArrA, false);
            }
            this.a.getPackageName();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            this.a.getPackageName();
            return null;
        }
    }

    public final URL g(String str) throws SL {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e2) {
            throw new SL(e2.getMessage(), SL.a.UNAVAILABLE);
        }
    }

    public final HttpURLConnection l(URL url, String str) throws SL {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.a.getPackageName());
            HV hv = (HV) this.b.get();
            if (hv != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) A11.a(hv.a()));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException unused2) {
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused3) {
            throw new SL("Firebase Installations Service is unavailable. Please try again later.", SL.a.UNAVAILABLE);
        }
    }

    public final AbstractC6957o00 n(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        AbstractC5294i41.a aVarA = AbstractC5294i41.a();
        AbstractC6957o00.a aVarA2 = AbstractC6957o00.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                aVarA2.f(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                aVarA2.c(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                aVarA2.d(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        aVarA.c(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        aVarA.d(m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                aVarA2.b(aVarA.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarA2.e(AbstractC6957o00.b.OK).a();
    }

    public final AbstractC5294i41 p(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        AbstractC5294i41.a aVarA = AbstractC5294i41.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                aVarA.d(m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarA.b(AbstractC5294i41.b.OK).a();
    }

    public final void q(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        s(httpURLConnection, h(b(str, str2)));
    }

    public final void r(HttpURLConnection httpURLConnection) throws IOException {
        s(httpURLConnection, h(c()));
    }

    public static void j() {
    }
}
