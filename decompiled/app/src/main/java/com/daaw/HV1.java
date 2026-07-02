package com.daaw;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class HV1 extends TT2 implements K83 {
    public static final Pattern u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicReference v = new AtomicReference();
    public final SSLSocketFactory e;
    public final int f;
    public final int g;
    public final String h;
    public final G83 i;
    public C5835k03 j;
    public HttpURLConnection k;
    public InputStream l;
    public boolean m;
    public int n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public final Set t;

    public HV1(String str, InterfaceC3917d93 interfaceC3917d93, int i, int i2, int i3) {
        super(true);
        this.e = new GV1(this);
        this.t = new HashSet();
        AbstractC6048km2.c(str);
        this.h = str;
        this.i = new G83();
        this.f = i;
        this.g = i2;
        this.s = i3;
        if (interfaceC3917d93 != null) {
            k(interfaceC3917d93);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5 A[Catch: IOException -> 0x003f, TryCatch #3 {IOException -> 0x003f, blocks: (B:3:0x000e, B:4:0x0024, B:6:0x002a, B:8:0x0034, B:12:0x0045, B:13:0x005d, B:15:0x0063, B:22:0x008b, B:24:0x00a5, B:25:0x00b7, B:26:0x00bc, B:28:0x00c5, B:29:0x00cc, B:42:0x00f4, B:96:0x0239, B:98:0x0244, B:100:0x0255, B:103:0x025e, B:104:0x026d, B:106:0x0274, B:107:0x027b, B:108:0x027c, B:109:0x0292), top: B:118:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0244 A[Catch: IOException -> 0x003f, TryCatch #3 {IOException -> 0x003f, blocks: (B:3:0x000e, B:4:0x0024, B:6:0x002a, B:8:0x0034, B:12:0x0045, B:13:0x005d, B:15:0x0063, B:22:0x008b, B:24:0x00a5, B:25:0x00b7, B:26:0x00bc, B:28:0x00c5, B:29:0x00cc, B:42:0x00f4, B:96:0x0239, B:98:0x0244, B:100:0x0255, B:103:0x025e, B:104:0x026d, B:106:0x0274, B:107:0x027b, B:108:0x027c, B:109:0x0292), top: B:118:0x000e }] */
    @Override // com.daaw.InterfaceC7659qX2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.daaw.C5835k03 r21) throws com.daaw.C3912d83 {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.HV1.a(com.daaw.k03):long");
    }

    @Override // com.daaw.InterfaceC8304sp3
    public final int d(byte[] bArr, int i, int i2) throws C3912d83 {
        try {
            if (this.q != this.o) {
                byte[] bArr2 = (byte[]) v.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.q;
                    long j2 = this.o;
                    if (j == j2) {
                        v.set(bArr2);
                        break;
                    }
                    int i3 = this.l.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i3 == -1) {
                        throw new EOFException();
                    }
                    this.q += (long) i3;
                    b(i3);
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.p;
            if (j3 != -1) {
                long j4 = j3 - this.r;
                if (j4 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j4);
            }
            int i4 = this.l.read(bArr, i, i2);
            if (i4 == -1) {
                if (this.p == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.r += (long) i4;
            b(i4);
            return i4;
        } catch (IOException e) {
            throw new C3912d83(e, this.j, 2000, 2);
        }
    }

    public final void q(int i) {
        this.s = i;
        for (Socket socket : this.t) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.s);
                } catch (SocketException e) {
                    AbstractC4274eT1.zzk("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    public final void r() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                AbstractC4274eT1.zzh("Unexpected error while disconnecting", e);
            }
            this.k = null;
        }
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0050 A[Catch: all -> 0x002f, Exception -> 0x0065, TRY_LEAVE, TryCatch #0 {Exception -> 0x0065, blocks: (B:15:0x001f, B:17:0x0027, B:25:0x0038, B:27:0x0048, B:29:0x0050), top: B:46:0x001f }] */
    @Override // com.daaw.InterfaceC7659qX2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd() {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.l     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L77
            java.net.HttpURLConnection r2 = r9.k     // Catch: java.lang.Throwable -> L2f
            long r3 = r9.p     // Catch: java.lang.Throwable -> L2f
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L11
            goto L14
        L11:
            long r7 = r9.r     // Catch: java.lang.Throwable -> L2f
            long r3 = r3 - r7
        L14:
            int r7 = com.daaw.AbstractC9004vJ2.a     // Catch: java.lang.Throwable -> L2f
            r8 = 19
            if (r7 == r8) goto L1f
            r8 = 20
            if (r7 == r8) goto L1f
            goto L65
        L1f:
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L65
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L31
            int r3 = r2.read()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L65
            r4 = -1
            if (r3 == r4) goto L65
            goto L38
        L2f:
            r2 = move-exception
            goto L8b
        L31:
            r5 = 2048(0x800, double:1.012E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L38
            goto L65
        L38:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L65
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L65
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L65
            if (r4 != 0) goto L50
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L65
            if (r3 == 0) goto L65
        L50:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L65
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L65
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r1)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L65
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L65
            r3.invoke(r2, r1)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L65
        L65:
            java.io.InputStream r2 = r9.l     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L6b
            r2.close()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L6b
            goto L77
        L6b:
            r2 = move-exception
            com.daaw.d83 r3 = new com.daaw.d83     // Catch: java.lang.Throwable -> L2f
            com.daaw.k03 r4 = r9.j     // Catch: java.lang.Throwable -> L2f
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 3
            r3.<init>(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L2f
            throw r3     // Catch: java.lang.Throwable -> L2f
        L77:
            r9.l = r1
            r9.r()
            boolean r1 = r9.m
            if (r1 == 0) goto L85
            r9.m = r0
            r9.l()
        L85:
            java.util.Set r0 = r9.t
            r0.clear()
            return
        L8b:
            r9.l = r1
            r9.r()
            boolean r1 = r9.m
            if (r1 == 0) goto L99
            r9.m = r0
            r9.l()
        L99:
            java.util.Set r0 = r9.t
            r0.clear()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.HV1.zzd():void");
    }

    @Override // com.daaw.TT2, com.daaw.InterfaceC7659qX2, com.daaw.K83
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
