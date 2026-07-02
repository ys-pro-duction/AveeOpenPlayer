package com.daaw;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class L43 extends TT2 implements K83 {
    public final boolean e;
    public final int f;
    public final int g;
    public final String h;
    public final G83 i;
    public final G83 j;
    public C5835k03 k;
    public HttpURLConnection l;
    public InputStream m;
    public boolean n;
    public int o;
    public long p;
    public long q;

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    @Override // com.daaw.InterfaceC7659qX2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.daaw.C5835k03 r23) throws com.daaw.C3912d83 {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.L43.a(com.daaw.k03):long");
    }

    @Override // com.daaw.InterfaceC8304sp3
    public final int d(byte[] bArr, int i, int i2) throws C3912d83 {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.p;
            if (j != -1) {
                long j2 = j - this.q;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.m;
            int i3 = AbstractC9004vJ2.a;
            int i4 = inputStream.read(bArr, i, i2);
            if (i4 == -1) {
                return -1;
            }
            this.q += (long) i4;
            b(i4);
            return i4;
        } catch (IOException e) {
            C5835k03 c5835k03 = this.k;
            int i5 = AbstractC9004vJ2.a;
            throw C3912d83.a(e, c5835k03, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.net.HttpURLConnection o(java.net.URL r3, int r4, byte[] r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) throws java.io.IOException {
        /*
            r2 = this;
            java.net.URLConnection r3 = r3.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            int r4 = r2.f
            r3.setConnectTimeout(r4)
            int r4 = r2.g
            r3.setReadTimeout(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.daaw.G83 r5 = r2.i
            java.util.Map r5 = r5.a()
            r4.putAll(r5)
            com.daaw.G83 r5 = r2.j
            java.util.Map r5 = r5.a()
            r4.putAll(r5)
            r4.putAll(r12)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r12 = r5.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r3.setRequestProperty(r12, r5)
            goto L32
        L4e:
            r4 = 0
            r0 = -1
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 != 0) goto L5d
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 != 0) goto L5c
            r4 = 0
            goto L7c
        L5c:
            r6 = r4
        L5d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "bytes="
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = "-"
            r4.append(r5)
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 == 0) goto L78
            long r6 = r6 + r8
            long r6 = r6 + r0
            r4.append(r6)
        L78:
            java.lang.String r4 = r4.toString()
        L7c:
            if (r4 == 0) goto L83
            java.lang.String r5 = "Range"
            r3.setRequestProperty(r5, r4)
        L83:
            java.lang.String r4 = r2.h
            if (r4 == 0) goto L8c
            java.lang.String r5 = "User-Agent"
            r3.setRequestProperty(r5, r4)
        L8c:
            r4 = 1
            if (r4 == r10) goto L92
            java.lang.String r4 = "identity"
            goto L94
        L92:
            java.lang.String r4 = "gzip"
        L94:
            java.lang.String r5 = "Accept-Encoding"
            r3.setRequestProperty(r5, r4)
            r3.setInstanceFollowRedirects(r11)
            r4 = 0
            r3.setDoOutput(r4)
            int r4 = com.daaw.C5835k03.j
            java.lang.String r4 = "GET"
            r3.setRequestMethod(r4)
            r3.connect()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.L43.o(java.net.URL, int, byte[], long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    public final URL p(URL url, String str, C5835k03 c5835k03) throws C3912d83 {
        if (str == null) {
            throw new C3912d83("Null location redirect", c5835k03, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new C3912d83("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), c5835k03, 2001, 1);
            }
            if (this.e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new C3912d83("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", c5835k03, 2001, 1);
        } catch (MalformedURLException e) {
            throw new C3912d83(e, c5835k03, 2001, 1);
        }
    }

    public final void q() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                AbstractC3305ay2.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.l = null;
        }
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f A[Catch: all -> 0x002e, Exception -> 0x0068, TryCatch #0 {Exception -> 0x0068, blocks: (B:15:0x001e, B:17:0x0026, B:25:0x0037, B:27:0x0047, B:29:0x004f, B:31:0x0059, B:32:0x0067), top: B:47:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059 A[Catch: all -> 0x002e, Exception -> 0x0068, TryCatch #0 {Exception -> 0x0068, blocks: (B:15:0x001e, B:17:0x0026, B:25:0x0037, B:27:0x0047, B:29:0x004f, B:31:0x0059, B:32:0x0067), top: B:47:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067 A[Catch: all -> 0x002e, Exception -> 0x0068, TRY_LEAVE, TryCatch #0 {Exception -> 0x0068, blocks: (B:15:0x001e, B:17:0x0026, B:25:0x0037, B:27:0x0047, B:29:0x004f, B:31:0x0059, B:32:0x0067), top: B:47:0x001e }] */
    @Override // com.daaw.InterfaceC7659qX2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd() {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r10.m     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L7a
            long r3 = r10.p     // Catch: java.lang.Throwable -> L2e
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L10
            r3 = r5
            goto L13
        L10:
            long r7 = r10.q     // Catch: java.lang.Throwable -> L2e
            long r3 = r3 - r7
        L13:
            java.net.HttpURLConnection r7 = r10.l     // Catch: java.lang.Throwable -> L2e
            if (r7 == 0) goto L68
            int r8 = com.daaw.AbstractC9004vJ2.a     // Catch: java.lang.Throwable -> L2e
            r9 = 20
            if (r8 <= r9) goto L1e
            goto L68
        L1e:
            java.io.InputStream r7 = r7.getInputStream()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L68
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L30
            int r3 = r7.read()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L68
            r4 = -1
            if (r3 == r4) goto L68
            goto L37
        L2e:
            r2 = move-exception
            goto L89
        L30:
            r5 = 2048(0x800, double:1.012E-320)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L37
            goto L68
        L37:
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L68
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L68
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r4.equals(r3)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L68
            if (r4 != 0) goto L4f
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L68
            if (r3 == 0) goto L68
        L4f:
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L68
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L68
            if (r3 == 0) goto L67
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r1)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L68
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L68
            r3.invoke(r7, r1)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L68
            goto L68
        L67:
            throw r1     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L68
        L68:
            r2.close()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L6c
            goto L7a
        L6c:
            r2 = move-exception
            com.daaw.d83 r3 = new com.daaw.d83     // Catch: java.lang.Throwable -> L2e
            com.daaw.k03 r4 = r10.k     // Catch: java.lang.Throwable -> L2e
            int r5 = com.daaw.AbstractC9004vJ2.a     // Catch: java.lang.Throwable -> L2e
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 3
            r3.<init>(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L2e
            throw r3     // Catch: java.lang.Throwable -> L2e
        L7a:
            r10.m = r1
            r10.q()
            boolean r1 = r10.n
            if (r1 == 0) goto L88
            r10.n = r0
            r10.l()
        L88:
            return
        L89:
            r10.m = r1
            r10.q()
            boolean r1 = r10.n
            if (r1 == 0) goto L97
            r10.n = r0
            r10.l()
        L97:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.L43.zzd():void");
    }

    @Override // com.daaw.TT2, com.daaw.InterfaceC7659qX2, com.daaw.K83
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.l;
        return httpURLConnection == null ? RP2.e() : new I33(httpURLConnection.getHeaderFields());
    }

    public L43(String str, int i, int i2, boolean z, G83 g83, InterfaceC5661jO2 interfaceC5661jO2, boolean z2) {
        super(true);
        this.h = str;
        this.f = i;
        this.g = i2;
        this.e = z;
        this.i = g83;
        this.j = new G83();
    }
}
