package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.gW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4854gW1 extends TT2 implements K83 {
    public static final Pattern v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public final int e;
    public final int f;
    public final String g;
    public final G83 h;
    public C5835k03 i;
    public HttpURLConnection j;
    public final Queue k;
    public InputStream l;
    public boolean m;
    public int n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public final long t;
    public final long u;

    public C4854gW1(String str, InterfaceC3917d93 interfaceC3917d93, int i, int i2, long j, long j2) {
        super(true);
        AbstractC6048km2.c(str);
        this.g = str;
        this.h = new G83();
        this.e = i;
        this.f = i2;
        this.k = new ArrayDeque();
        this.t = j;
        this.u = j2;
        if (interfaceC3917d93 != null) {
            k(interfaceC3917d93);
        }
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final long a(C5835k03 c5835k03) throws C3912d83 {
        this.i = c5835k03;
        this.p = 0L;
        long j = c5835k03.f;
        long j2 = c5835k03.g;
        long jMin = j2 == -1 ? this.t : Math.min(this.t, j2);
        this.q = j;
        HttpURLConnection httpURLConnectionO = o(j, (jMin + j) - 1, 1);
        this.j = httpURLConnectionO;
        String headerField = httpURLConnectionO.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j3 = Long.parseLong(matcher.group(2));
                    long j4 = Long.parseLong(matcher.group(3));
                    long j5 = c5835k03.g;
                    if (j5 != -1) {
                        this.o = j5;
                        this.r = Math.max(j3, (this.q + j5) - 1);
                    } else {
                        this.o = j4 - this.q;
                        this.r = j4 - 1;
                    }
                    this.s = j3;
                    this.m = true;
                    n(c5835k03);
                    return this.o;
                } catch (NumberFormatException unused) {
                    AbstractC4274eT1.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new C4286eW1(headerField, c5835k03);
    }

    @Override // com.daaw.InterfaceC8304sp3
    public final int d(byte[] bArr, int i, int i2) throws C3912d83 {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.o;
            long j2 = this.p;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = this.q + j2;
            long j4 = i2;
            long j5 = j3 + j4 + this.u;
            long j6 = this.s;
            long j7 = j6 + 1;
            if (j5 > j7) {
                long j8 = this.r;
                if (j6 < j8) {
                    long jMin = Math.min(j8, Math.max(((this.t + j7) - r4) - 1, (-1) + j7 + j4));
                    o(j7, jMin, 2);
                    this.s = jMin;
                    j6 = jMin;
                }
            }
            int i3 = this.l.read(bArr, i, (int) Math.min(j4, ((j6 + 1) - this.q) - this.p));
            if (i3 == -1) {
                throw new EOFException();
            }
            this.p += (long) i3;
            b(i3);
            return i3;
        } catch (IOException e) {
            throw new C3912d83(e, this.i, 2000, 2);
        }
    }

    public final HttpURLConnection o(long j, long j2, int i) throws C3912d83 {
        int i2;
        IOException iOException;
        String string = this.i.a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.e);
            httpURLConnection.setReadTimeout(this.f);
            for (Map.Entry entry : this.h.a().entrySet()) {
                try {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                } catch (IOException e) {
                    iOException = e;
                    i2 = i;
                    throw new C3912d83("Unable to connect to ".concat(String.valueOf(string)), iOException, this.i, 2000, i2);
                }
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-" + j2);
            httpURLConnection.setRequestProperty("User-Agent", this.g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.k.add(httpURLConnection);
            String string2 = this.i.a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    p();
                    throw new C4575fW1(this.n, headerFields, this.i, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.l != null) {
                        inputStream = new SequenceInputStream(this.l, inputStream);
                    }
                    this.l = inputStream;
                    return httpURLConnection;
                } catch (IOException e2) {
                    p();
                    throw new C3912d83(e2, this.i, 2000, i);
                }
            } catch (IOException e3) {
                p();
                throw new C3912d83("Unable to connect to ".concat(String.valueOf(string2)), e3, this.i, 2000, i);
            }
        } catch (IOException e4) {
            i2 = i;
            iOException = e4;
        }
    }

    public final void p() {
        while (!this.k.isEmpty()) {
            try {
                ((HttpURLConnection) this.k.remove()).disconnect();
            } catch (Exception e) {
                AbstractC4274eT1.zzh("Unexpected error while disconnecting", e);
            }
        }
        this.j = null;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final void zzd() {
        try {
            InputStream inputStream = this.l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new C3912d83(e, this.i, 2000, 3);
                }
            }
        } finally {
            this.l = null;
            p();
            if (this.m) {
                this.m = false;
                l();
            }
        }
    }

    @Override // com.daaw.TT2, com.daaw.InterfaceC7659qX2, com.daaw.K83
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
