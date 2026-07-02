package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: renamed from: com.daaw.yn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C9972yn0 {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final InterfaceC7569qB0 e;

    public C9972yn0(C7050oL c7050oL) {
        this(c7050oL.k(), c7050oL.n(), ((C7501px) AbstractC7329pL.d(c7050oL)).l());
    }

    public static String f(int i) {
        if (i == 1) {
            return "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangeSafetyNetToken?key=%s";
        }
        if (i == 2) {
            return "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangeDebugToken?key=%s";
        }
        if (i == 3) {
            return "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangePlayIntegrityToken?key=%s";
        }
        throw new IllegalArgumentException("Unknown token type.");
    }

    public static final boolean g(int i) {
        return i >= 200 && i < 300;
    }

    public HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public N8 b(byte[] bArr, int i, C6206lJ0 c6206lJ0) throws JL {
        if (c6206lJ0.a()) {
            return N8.a(h(new URL(String.format(f(i), this.d, this.c, this.b)), bArr, c6206lJ0));
        }
        throw new JL("Too many attempts.");
    }

    public String c(byte[] bArr, C6206lJ0 c6206lJ0) throws JL {
        if (c6206lJ0.a()) {
            return h(new URL(String.format("https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:generatePlayIntegrityChallenge?key=%s", this.d, this.c, this.b)), bArr, c6206lJ0);
        }
        throw new JL("Too many attempts.");
    }

    public final String d() {
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

    public String e() {
        HV hv = (HV) this.e.get();
        if (hv != null) {
            try {
                return (String) A11.a(hv.a());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final String h(URL url, byte[] bArr, C6206lJ0 c6206lJ0) {
        HttpURLConnection httpURLConnectionA = a(url);
        try {
            httpURLConnectionA.setDoOutput(true);
            httpURLConnectionA.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionA.setRequestProperty("Content-Type", "application/json");
            String strE = e();
            if (strE != null) {
                httpURLConnectionA.setRequestProperty("X-Firebase-Client", strE);
            }
            httpURLConnectionA.setRequestProperty("X-Android-Package", this.a.getPackageName());
            httpURLConnectionA.setRequestProperty("X-Android-Cert", d());
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnectionA.getOutputStream(), bArr.length);
            try {
                bufferedOutputStream.write(bArr, 0, bArr.length);
                bufferedOutputStream.close();
                int responseCode = httpURLConnectionA.getResponseCode();
                InputStream inputStream = g(responseCode) ? httpURLConnectionA.getInputStream() : httpURLConnectionA.getErrorStream();
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    } finally {
                    }
                }
                bufferedReader.close();
                String string = sb.toString();
                if (g(responseCode)) {
                    c6206lJ0.c();
                    httpURLConnectionA.disconnect();
                    return string;
                }
                c6206lJ0.d(responseCode);
                C9890yW c9890yWA = C9890yW.a(string);
                throw new JL("Error returned from API. code: " + c9890yWA.b() + " body: " + c9890yWA.c());
            } finally {
            }
        } catch (Throwable th) {
            httpURLConnectionA.disconnect();
            throw th;
        }
    }

    public C9972yn0(Context context, UL ul, InterfaceC7569qB0 interfaceC7569qB0) {
        AbstractC7506py0.l(context);
        AbstractC7506py0.l(ul);
        AbstractC7506py0.l(interfaceC7569qB0);
        this.a = context;
        this.b = ul.b();
        this.c = ul.c();
        String strE = ul.e();
        this.d = strE;
        if (strE != null) {
            this.e = interfaceC7569qB0;
            return;
        }
        throw new IllegalArgumentException("FirebaseOptions#getProjectId cannot be null.");
    }
}
