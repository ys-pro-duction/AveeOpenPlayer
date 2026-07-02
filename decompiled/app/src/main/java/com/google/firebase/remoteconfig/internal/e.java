package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import com.daaw.A11;
import com.daaw.AbstractC6963o11;
import com.daaw.AbstractC7236p00;
import com.daaw.AbstractC8863uq;
import com.daaw.AbstractC9782y6;
import com.daaw.C2599Vw;
import com.daaw.C3409bM;
import com.daaw.C3687cM;
import com.daaw.C4244eM;
import com.daaw.C5786jq;
import com.daaw.C7050oL;
import com.daaw.InterfaceC5485im;
import com.daaw.InterfaceC9066vZ0;
import com.daaw.InterfaceC9149vq;
import com.daaw.RL;
import com.daaw.RV;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.PSKKeyManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class e {
    public static final int[] q = {2, 4, 8, 16, 32, 64, 128, PSKKeyManager.MAX_KEY_LENGTH_BYTES};
    public static final Pattern r = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final Set a;
    public int c;
    public final ScheduledExecutorService g;
    public final c h;
    public final C7050oL i;
    public final RL j;
    public C5786jq k;
    public final Context l;
    public final String m;
    public final d p;
    public final int f = 8;
    public boolean b = false;
    public final Random n = new Random();
    public final InterfaceC5485im o = C2599Vw.d();
    public boolean d = false;
    public boolean e = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            e.this.d();
        }
    }

    public e(C7050oL c7050oL, RL rl, c cVar, C5786jq c5786jq, Context context, String str, Set set, d dVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = set;
        this.g = scheduledExecutorService;
        this.c = Math.max(8 - dVar.g().b(), 1);
        this.i = c7050oL;
        this.h = cVar;
        this.j = rl;
        this.k = c5786jq;
        this.l = context;
        this.m = str;
        this.p = dVar;
    }

    public static /* synthetic */ AbstractC6963o11 a(HttpURLConnection httpURLConnection, AbstractC7236p00 abstractC7236p00) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", abstractC7236p00.b());
        return A11.e(null);
    }

    public static String j(String str) {
        Matcher matcher = r.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public void A() {
        q(0L);
    }

    public final void B(Date date) {
        int iB = this.p.g().b() + 1;
        this.p.n(iB, new Date(date.getTime() + m(iB)));
    }

    public void d() throws Throwable {
        Integer num;
        Integer num2;
        HttpURLConnection httpURLConnectionG;
        if (e()) {
            if (new Date(this.o.a()).before(this.p.g().a())) {
                u();
                return;
            }
            w(true);
            HttpURLConnection httpURLConnection = null;
            numValueOf = null;
            Integer numValueOf = null;
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnectionG = g();
            } catch (IOException unused) {
                num2 = null;
            } catch (Throwable th) {
                th = th;
                num = null;
            }
            try {
                int responseCode = httpURLConnectionG.getResponseCode();
                numValueOf = Integer.valueOf(responseCode);
                if (responseCode == 200) {
                    t();
                    this.p.i();
                    z(httpURLConnectionG).h();
                }
                f(httpURLConnectionG);
                w(false);
                boolean zP = p(responseCode);
                if (zP) {
                    B(new Date(this.o.a()));
                }
                if (zP || responseCode == 200) {
                    u();
                    return;
                }
                String strR = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                if (responseCode == 403) {
                    strR = r(httpURLConnectionG.getErrorStream());
                }
                s(new C4244eM(responseCode, strR, C3687cM.a.CONFIG_UPDATE_STREAM_ERROR));
            } catch (IOException unused2) {
                num2 = numValueOf;
                httpURLConnection2 = httpURLConnectionG;
                f(httpURLConnection2);
                w(false);
                boolean z = num2 == null || p(num2.intValue());
                if (z) {
                    B(new Date(this.o.a()));
                }
                if (z || num2.intValue() == 200) {
                    u();
                    return;
                }
                String strR2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num2);
                if (num2.intValue() == 403) {
                    strR2 = r(httpURLConnection2.getErrorStream());
                }
                s(new C4244eM(num2.intValue(), strR2, C3687cM.a.CONFIG_UPDATE_STREAM_ERROR));
            } catch (Throwable th2) {
                th = th2;
                num = numValueOf;
                httpURLConnection = httpURLConnectionG;
                f(httpURLConnection);
                w(false);
                boolean z2 = num == null || p(num.intValue());
                if (z2) {
                    B(new Date(this.o.a()));
                }
                if (z2 || num.intValue() == 200) {
                    u();
                } else {
                    String strR3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                    if (num.intValue() == 403) {
                        strR3 = r(httpURLConnection.getErrorStream());
                    }
                    s(new C4244eM(num.intValue(), strR3, C3687cM.a.CONFIG_UPDATE_STREAM_ERROR));
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean e() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Set r0 = r1.a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.b     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.d     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.e     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L17:
            r0 = move-exception
            goto L1c
        L19:
            r0 = 0
        L1a:
            monitor-exit(r1)
            return r0
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.e.e():boolean");
    }

    public void f(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public HttpURLConnection g() throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) o().openConnection();
        v(httpURLConnection);
        y(httpURLConnection);
        return httpURLConnection;
    }

    public final JSONObject h() {
        HashMap map = new HashMap();
        map.put("project", j(this.i.n().c()));
        map.put("namespace", this.m);
        map.put("lastKnownVersionNumber", Long.toString(this.h.r()));
        map.put("appId", this.i.n().c());
        map.put("sdkVersion", "21.4.0");
        return new JSONObject(map);
    }

    public final synchronized void i() {
        this.d = true;
    }

    public final String k() {
        try {
            Context context = this.l;
            byte[] bArrA = AbstractC9782y6.a(context, context.getPackageName());
            if (bArrA != null) {
                return RV.b(bArrA, false);
            }
            this.l.getPackageName();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            this.l.getPackageName();
            return null;
        }
    }

    public final void l(final HttpURLConnection httpURLConnection) {
        this.j.a(false).p(this.g, new InterfaceC9066vZ0() { // from class: com.daaw.sq
            @Override // com.daaw.InterfaceC9066vZ0
            public final AbstractC6963o11 a(Object obj) {
                return com.google.firebase.remoteconfig.internal.e.a(httpURLConnection, (AbstractC7236p00) obj);
            }
        });
    }

    public final long m(int i) {
        int length = q.length;
        if (i >= length) {
            i = length;
        }
        long millis = TimeUnit.MINUTES.toMillis(r0[i - 1]);
        return (millis / 2) + ((long) this.n.nextInt((int) millis));
    }

    public final String n(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", j(this.i.n().c()), str);
    }

    public final URL o() {
        try {
            return new URL(n(this.m));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public final boolean p(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public final synchronized void q(long j) {
        try {
            if (e()) {
                int i = this.c;
                if (i > 0) {
                    this.c = i - 1;
                    this.g.schedule(new a(), j, TimeUnit.MILLISECONDS);
                } else if (!this.e) {
                    s(new C3409bM("Unable to connect to the server. Check your connection and try again.", C3687cM.a.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String r(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public final synchronized void s(C3687cM c3687cM) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC9149vq) it.next()).b(c3687cM);
        }
    }

    public final synchronized void t() {
        this.c = 8;
    }

    public synchronized void u() {
        q(Math.max(0L, this.p.g().a().getTime() - new Date(this.o.a()).getTime()));
    }

    public final void v(HttpURLConnection httpURLConnection) {
        l(httpURLConnection);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.i.n().b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.l.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", k());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    public final synchronized void w(boolean z) {
        this.b = z;
    }

    public void x(boolean z) {
        this.e = z;
    }

    public final void y(HttpURLConnection httpURLConnection) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        byte[] bytes = h().toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public synchronized com.google.firebase.remoteconfig.internal.a z(HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.a(httpURLConnection, this.h, this.k, this.a, new b(), this.g);
    }

    public class b implements InterfaceC9149vq {
        public b() {
        }

        @Override // com.daaw.InterfaceC9149vq
        public void b(C3687cM c3687cM) {
            e.this.i();
            e.this.s(c3687cM);
        }

        @Override // com.daaw.InterfaceC9149vq
        public void a(AbstractC8863uq abstractC8863uq) {
        }
    }
}
