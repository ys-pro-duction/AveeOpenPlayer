package com.google.firebase.remoteconfig.internal;

import com.daaw.A11;
import com.daaw.AbstractC6963o11;
import com.daaw.AbstractC8863uq;
import com.daaw.C3409bM;
import com.daaw.C3687cM;
import com.daaw.C4244eM;
import com.daaw.C5786jq;
import com.daaw.InterfaceC1519Ls;
import com.daaw.InterfaceC9149vq;
import com.google.firebase.remoteconfig.internal.c;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public final Set a;
    public final HttpURLConnection b;
    public final c c;
    public final C5786jq d;
    public final InterfaceC9149vq e;
    public final ScheduledExecutorService f;
    public final Random g = new Random();

    /* JADX INFO: renamed from: com.google.firebase.remoteconfig.internal.a$a, reason: collision with other inner class name */
    public class RunnableC0270a implements Runnable {
        public final /* synthetic */ int B;
        public final /* synthetic */ long C;

        public RunnableC0270a(int i, long j) {
            this.B = i;
            this.C = j;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            a.this.d(this.B, this.C);
        }
    }

    public a(HttpURLConnection httpURLConnection, c cVar, C5786jq c5786jq, Set set, InterfaceC9149vq interfaceC9149vq, ScheduledExecutorService scheduledExecutorService) {
        this.b = httpURLConnection;
        this.c = cVar;
        this.d = c5786jq;
        this.a = set;
        this.e = interfaceC9149vq;
        this.f = scheduledExecutorService;
    }

    public static /* synthetic */ AbstractC6963o11 a(a aVar, AbstractC6963o11 abstractC6963o11, AbstractC6963o11 abstractC6963o112, long j, int i, AbstractC6963o11 abstractC6963o113) {
        aVar.getClass();
        if (!abstractC6963o11.n()) {
            return A11.d(new C3409bM("Failed to auto-fetch config update.", abstractC6963o11.j()));
        }
        if (!abstractC6963o112.n()) {
            return A11.d(new C3409bM("Failed to get activated config for auto-fetch", abstractC6963o112.j()));
        }
        c.a aVar2 = (c.a) abstractC6963o11.k();
        b bVarA = (b) abstractC6963o112.k();
        if (!e(aVar2, j).booleanValue()) {
            aVar.b(i, j);
            return A11.e(null);
        }
        if (aVar2.d() == null) {
            return A11.e(null);
        }
        if (bVarA == null) {
            bVarA = b.j().a();
        }
        Set setE = bVarA.e(aVar2.d());
        if (setE.isEmpty()) {
            return A11.e(null);
        }
        aVar.c(AbstractC8863uq.a(setE));
        return A11.e(null);
    }

    public static Boolean e(c.a aVar, long j) {
        if (aVar.d() != null) {
            return Boolean.valueOf(aVar.d().i() >= j);
        }
        return Boolean.valueOf(aVar.f() == 1);
    }

    public final void b(int i, long j) {
        if (i == 0) {
            j(new C4244eM("Unable to fetch the latest version of the template.", C3687cM.a.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.f.schedule(new RunnableC0270a(i, j), this.g.nextInt(4), TimeUnit.SECONDS);
        }
    }

    public final synchronized void c(AbstractC8863uq abstractC8863uq) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC9149vq) it.next()).a(abstractC8863uq);
        }
    }

    public synchronized AbstractC6963o11 d(int i, final long j) throws Throwable {
        final int i2 = i - 1;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            final AbstractC6963o11 abstractC6963o11N = this.c.n(c.b.REALTIME, 3 - i2);
            final AbstractC6963o11 abstractC6963o11E = this.d.e();
            return A11.j(abstractC6963o11N, abstractC6963o11E).i(this.f, new InterfaceC1519Ls() { // from class: com.daaw.fq
                @Override // com.daaw.InterfaceC1519Ls
                public final Object a(AbstractC6963o11 abstractC6963o11) {
                    return com.google.firebase.remoteconfig.internal.a.a(this.a, abstractC6963o11N, abstractC6963o11E, j, i2, abstractC6963o11);
                }
            });
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r5 = new org.json.JSONObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r5.has("featureDisabled") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r5.getBoolean("featureDisabled") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        r9.e.b(new com.daaw.C4244eM("The server is temporarily unavailable. Try again in a few minutes.", com.daaw.C3687cM.a.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (g() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r5.has("latestTemplateVersionNumber") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        r6 = r9.c.r();
        r4 = r5.getLong("latestTemplateVersionNumber");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r4 <= r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        b(3, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.io.InputStream r10) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = "latestTemplateVersionNumber"
            java.lang.String r1 = "featureDisabled"
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.lang.String r4 = "utf-8"
            r3.<init>(r10, r4)
            r2.<init>(r3)
            java.lang.String r3 = ""
        L12:
            r4 = r3
        L13:
            java.lang.String r5 = r2.readLine()
            if (r5 == 0) goto L8e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "}"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L13
            java.lang.String r4 = r9.i(r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L3b
            goto L13
        L3b:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5b
            r5.<init>(r4)     // Catch: org.json.JSONException -> L5b
            boolean r4 = r5.has(r1)     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L5d
            boolean r4 = r5.getBoolean(r1)     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L5d
            com.daaw.vq r4 = r9.e     // Catch: org.json.JSONException -> L5b
            com.daaw.eM r5 = new com.daaw.eM     // Catch: org.json.JSONException -> L5b
            java.lang.String r6 = "The server is temporarily unavailable. Try again in a few minutes."
            com.daaw.cM$a r7 = com.daaw.C3687cM.a.CONFIG_UPDATE_UNAVAILABLE     // Catch: org.json.JSONException -> L5b
            r5.<init>(r6, r7)     // Catch: org.json.JSONException -> L5b
            r4.b(r5)     // Catch: org.json.JSONException -> L5b
            goto L8e
        L5b:
            r4 = move-exception
            goto L7d
        L5d:
            boolean r4 = r9.g()     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L64
            goto L8e
        L64:
            boolean r4 = r5.has(r0)     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L12
            com.google.firebase.remoteconfig.internal.c r4 = r9.c     // Catch: org.json.JSONException -> L5b
            long r6 = r4.r()     // Catch: org.json.JSONException -> L5b
            long r4 = r5.getLong(r0)     // Catch: org.json.JSONException -> L5b
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L12
            r6 = 3
            r9.b(r6, r4)     // Catch: org.json.JSONException -> L5b
            goto L12
        L7d:
            com.daaw.bM r5 = new com.daaw.bM
            java.lang.Throwable r4 = r4.getCause()
            com.daaw.cM$a r6 = com.daaw.C3687cM.a.CONFIG_UPDATE_MESSAGE_INVALID
            java.lang.String r7 = "Unable to parse config update message."
            r5.<init>(r7, r4, r6)
            r9.j(r5)
            goto L12
        L8e:
            r2.close()
            r10.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.a.f(java.io.InputStream):void");
    }

    public final synchronized boolean g() {
        return this.a.isEmpty();
    }

    public void h() {
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection == null) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            f(inputStream);
            inputStream.close();
        } catch (IOException unused) {
        } finally {
            this.b.disconnect();
        }
    }

    public final String i(String str) {
        int iIndexOf = str.indexOf(123);
        int iLastIndexOf = str.lastIndexOf(125);
        return (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : str.substring(iIndexOf, iLastIndexOf + 1);
    }

    public final synchronized void j(C3687cM c3687cM) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC9149vq) it.next()).b(c3687cM);
        }
    }
}
