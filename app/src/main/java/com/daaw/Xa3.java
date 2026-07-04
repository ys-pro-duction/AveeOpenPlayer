package com.daaw;

import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Xa3 implements Runnable {
    public final URL B;
    public final String C;
    public final /* synthetic */ C3195ab3 D;
    public final C7085oT2 E;

    public Xa3(C3195ab3 c3195ab3, String str, URL url, byte[] bArr, Map map, C7085oT2 c7085oT2) {
        this.D = c3195ab3;
        AbstractC7506py0.f(str);
        AbstractC7506py0.l(url);
        AbstractC7506py0.l(c7085oT2);
        this.B = url;
        this.E = c7085oT2;
        this.C = str;
    }

    public final /* synthetic */ void a(int i, Exception exc, byte[] bArr, Map map) {
        C7085oT2 c7085oT2 = this.E;
        c7085oT2.a.d(this.C, i, exc, bArr, map);
    }

    public final void b(final int i, final Exception exc, final byte[] bArr, final Map map) {
        this.D.a.x().z(new Runnable() { // from class: com.daaw.Ua3
            @Override // java.lang.Runnable
            public final void run() {
                this.B.a(i, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.daaw.Xa3] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            r9 = this;
            com.daaw.ab3 r0 = r9.D
            r0.c()
            r0 = 0
            r1 = 0
            com.daaw.ab3 r2 = r9.D     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            java.net.URL r3 = r9.B     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            if (r4 == 0) goto L84
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r3.setDefaultUseCaches(r0)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            com.daaw.wU2 r4 = r2.a     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r4.z()     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            com.daaw.wU2 r2 = r2.a     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r2.z()     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r2 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r3.setInstanceFollowRedirects(r0)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r2 = 1
            r3.setDoInput(r2)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            int r2 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L7b
            java.util.Map r4 = r3.getHeaderFields()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L68
            r5.<init>()     // Catch: java.lang.Throwable -> L68
            java.io.InputStream r6 = r3.getInputStream()     // Catch: java.lang.Throwable -> L68
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L54
        L4a:
            int r8 = r6.read(r7)     // Catch: java.lang.Throwable -> L54
            if (r8 <= 0) goto L56
            r5.write(r7, r0, r8)     // Catch: java.lang.Throwable -> L54
            goto L4a
        L54:
            r0 = move-exception
            goto L6a
        L56:
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.Throwable -> L54
            r6.close()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
            r3.disconnect()
            r9.b(r2, r1, r0, r4)
            return
        L64:
            r0 = move-exception
            goto L8f
        L66:
            r0 = move-exception
            goto L9b
        L68:
            r0 = move-exception
            r6 = r1
        L6a:
            if (r6 == 0) goto L6f
            r6.close()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
        L6f:
            throw r0     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
        L70:
            r0 = move-exception
            r4 = r1
            goto L8f
        L73:
            r0 = move-exception
            r4 = r1
            goto L9b
        L76:
            r2 = move-exception
            r4 = r1
        L78:
            r0 = r2
            r2 = 0
            goto L8f
        L7b:
            r2 = move-exception
            r4 = r1
        L7d:
            r0 = r2
            r2 = 0
            goto L9b
        L80:
            r2 = move-exception
            goto L8c
        L82:
            r2 = move-exception
            goto L98
        L84:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            throw r2     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
        L8c:
            r3 = r1
            r4 = r3
            goto L78
        L8f:
            if (r3 == 0) goto L94
            r3.disconnect()
        L94:
            r9.b(r2, r1, r1, r4)
            throw r0
        L98:
            r3 = r1
            r4 = r3
            goto L7d
        L9b:
            if (r3 == 0) goto La0
            r3.disconnect()
        La0:
            r9.b(r2, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Xa3.run():void");
    }
}
