package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
import com.daaw.InterfaceC9611xW;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.Ax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0387Ax implements InterfaceC9611xW {
    public static final Pattern p = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicReference q = new AtomicReference();
    public final boolean a;
    public final int b;
    public final int c;
    public final String d;
    public final InterfaceC9611xW.e e;
    public final InterfaceC9611xW.e f = new InterfaceC9611xW.e();
    public final InterfaceC5299i51 g;
    public C2907Yv h;
    public HttpURLConnection i;
    public InputStream j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;

    public C0387Ax(String str, InterfaceC3024Zy0 interfaceC3024Zy0, InterfaceC5299i51 interfaceC5299i51, int i, int i2, boolean z, InterfaceC9611xW.e eVar) {
        this.d = AbstractC7115ob.d(str);
        this.g = interfaceC5299i51;
        this.b = i;
        this.c = i2;
        this.a = z;
        this.e = eVar;
    }

    public static long f(HttpURLConnection httpURLConnection) {
        long j;
        String headerField = httpURLConnection.getHeaderField("Content-Length");
        if (TextUtils.isEmpty(headerField)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                j = -1;
            }
        }
        String headerField2 = httpURLConnection.getHeaderField("Content-Range");
        if (TextUtils.isEmpty(headerField2)) {
            return j;
        }
        Matcher matcher = p.matcher(headerField2);
        if (!matcher.find()) {
            return j;
        }
        try {
            long j2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
            return j < 0 ? j2 : j != j2 ? Math.max(j, j2) : j;
        } catch (NumberFormatException unused2) {
            return j;
        }
    }

    public static URL g(URL url, String str) throws ProtocolException {
        if (str == null) {
            throw new ProtocolException("Null location redirect");
        }
        URL url2 = new URL(url, str);
        String protocol = url2.getProtocol();
        if ("https".equals(protocol) || "http".equals(protocol)) {
            return url2;
        }
        throw new ProtocolException("Unsupported protocol redirect: " + protocol);
    }

    public static void j(HttpURLConnection httpURLConnection, long j) {
        int i = AbstractC6280lb1.a;
        if (i == 19 || i == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, null);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final long a() {
        long j = this.m;
        return j == -1 ? j : j - this.o;
    }

    public final void b() {
        HttpURLConnection httpURLConnection = this.i;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception unused) {
            }
            this.i = null;
        }
    }

    @Override // com.daaw.InterfaceC2595Vv
    public int c(byte[] bArr, int i, int i2) throws InterfaceC9611xW.c {
        try {
            l();
            return k(bArr, i, i2);
        } catch (IOException e) {
            throw new InterfaceC9611xW.c(e, this.h, 2);
        }
    }

    @Override // com.daaw.InterfaceC2595Vv
    public void close() {
        try {
            if (this.j != null) {
                j(this.i, a());
                try {
                    this.j.close();
                } catch (IOException e) {
                    throw new InterfaceC9611xW.c(e, this.h, 3);
                }
            }
        } finally {
            this.j = null;
            b();
            if (this.k) {
                this.k = false;
                InterfaceC5299i51 interfaceC5299i51 = this.g;
                if (interfaceC5299i51 != null) {
                    interfaceC5299i51.b(this);
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC2595Vv
    public long d(C2907Yv c2907Yv) throws InterfaceC9611xW.c {
        this.h = c2907Yv;
        long j = 0;
        this.o = 0L;
        this.n = 0L;
        try {
            HttpURLConnection httpURLConnectionH = h(c2907Yv);
            this.i = httpURLConnectionH;
            try {
                int responseCode = httpURLConnectionH.getResponseCode();
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = this.i.getHeaderFields();
                    b();
                    InterfaceC9611xW.d dVar = new InterfaceC9611xW.d(responseCode, headerFields, c2907Yv);
                    if (responseCode != 416) {
                        throw dVar;
                    }
                    dVar.initCause(new C2699Wv(0));
                    throw dVar;
                }
                this.i.getContentType();
                if (responseCode == 200) {
                    long j2 = c2907Yv.d;
                    if (j2 != 0) {
                        j = j2;
                    }
                }
                this.l = j;
                if (c2907Yv.a(1)) {
                    this.m = c2907Yv.e;
                } else {
                    long j3 = c2907Yv.e;
                    if (j3 != -1) {
                        this.m = j3;
                    } else {
                        long jF = f(this.i);
                        this.m = jF != -1 ? jF - this.l : -1L;
                    }
                }
                try {
                    this.j = this.i.getInputStream();
                    this.k = true;
                    InterfaceC5299i51 interfaceC5299i51 = this.g;
                    if (interfaceC5299i51 != null) {
                        interfaceC5299i51.c(this, c2907Yv);
                    }
                    return this.m;
                } catch (IOException e) {
                    b();
                    throw new InterfaceC9611xW.c(e, c2907Yv, 1);
                }
            } catch (IOException e2) {
                b();
                throw new InterfaceC9611xW.c("Unable to connect to " + c2907Yv.a.toString(), e2, c2907Yv, 1);
            }
        } catch (IOException e3) {
            throw new InterfaceC9611xW.c("Unable to connect to " + c2907Yv.a.toString(), e3, c2907Yv, 1);
        }
    }

    @Override // com.daaw.InterfaceC2595Vv
    public Uri e() {
        HttpURLConnection httpURLConnection = this.i;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final HttpURLConnection h(C2907Yv c2907Yv) throws IOException {
        HttpURLConnection httpURLConnectionI;
        URL url = new URL(c2907Yv.a.toString());
        byte[] bArr = c2907Yv.b;
        long j = c2907Yv.d;
        long j2 = c2907Yv.e;
        boolean zA = c2907Yv.a(1);
        if (!this.a) {
            return i(url, bArr, j, j2, zA, true);
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i > 20) {
                throw new NoRouteToHostException("Too many redirects: " + i2);
            }
            long j3 = j2;
            boolean z = zA;
            long j4 = j;
            httpURLConnectionI = i(url, bArr, j4, j3, z, false);
            j = j4;
            j2 = j3;
            zA = z;
            int responseCode = httpURLConnectionI.getResponseCode();
            if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && (bArr != null || (responseCode != 307 && responseCode != 308))) {
                break;
            }
            String headerField = httpURLConnectionI.getHeaderField("Location");
            httpURLConnectionI.disconnect();
            url = g(url, headerField);
            bArr = null;
            i = i2;
        }
        return httpURLConnectionI;
    }

    public final HttpURLConnection i(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.b);
        httpURLConnection.setReadTimeout(this.c);
        InterfaceC9611xW.e eVar = this.e;
        if (eVar != null) {
            for (Map.Entry entry : eVar.a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        for (Map.Entry entry2 : this.f.a().entrySet()) {
            httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
        }
        if (j != 0 || j2 != -1) {
            String str = "bytes=" + j + "-";
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.d);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setRequestMethod("POST");
        if (bArr.length == 0) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final int k(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.m;
        if (j != -1) {
            long j2 = j - this.o;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int i3 = this.j.read(bArr, i, i2);
        if (i3 == -1) {
            if (this.m == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.o += (long) i3;
        InterfaceC5299i51 interfaceC5299i51 = this.g;
        if (interfaceC5299i51 != null) {
            interfaceC5299i51.a(this, i3);
        }
        return i3;
    }

    public final void l() throws IOException {
        if (this.n == this.l) {
            return;
        }
        byte[] bArr = (byte[]) q.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[4096];
        }
        while (true) {
            long j = this.n;
            long j2 = this.l;
            if (j == j2) {
                q.set(bArr);
                return;
            }
            int i = this.j.read(bArr, 0, (int) Math.min(j2 - j, bArr.length));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (i == -1) {
                throw new EOFException();
            }
            this.n += (long) i;
            InterfaceC5299i51 interfaceC5299i51 = this.g;
            if (interfaceC5299i51 != null) {
                interfaceC5299i51.a(this, i);
            }
        }
    }
}
