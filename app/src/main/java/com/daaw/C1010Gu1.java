package com.daaw;

import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.daaw.Gu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1010Gu1 implements InterfaceC1318Jt1 {
    public final InterfaceC0906Fu1 c;
    public final Map a = new LinkedHashMap(16, 0.75f, true);
    public long b = 0;
    public final int d = 5242880;

    public C1010Gu1(InterfaceC0906Fu1 interfaceC0906Fu1, int i) {
        this.c = interfaceC0906Fu1;
    }

    public static int c(InputStream inputStream) {
        return (l(inputStream) << 24) | l(inputStream) | (l(inputStream) << 8) | (l(inputStream) << 16);
    }

    public static long d(InputStream inputStream) {
        return (((long) l(inputStream)) & 255) | ((((long) l(inputStream)) & 255) << 8) | ((((long) l(inputStream)) & 255) << 16) | ((((long) l(inputStream)) & 255) << 24) | ((((long) l(inputStream)) & 255) << 32) | ((((long) l(inputStream)) & 255) << 40) | ((((long) l(inputStream)) & 255) << 48) | ((((long) l(inputStream)) & 255) << 56);
    }

    public static String f(C0802Eu1 c0802Eu1) {
        return new String(k(c0802Eu1, d(c0802Eu1)), "UTF-8");
    }

    public static void h(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    public static void i(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    public static void j(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        i(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    public static byte[] k(C0802Eu1 c0802Eu1, long j) throws IOException {
        long jA = c0802Eu1.a();
        if (j >= 0 && j <= jA) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(c0802Eu1).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + jA);
    }

    public static int l(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    public static final String o(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.daaw.InterfaceC1318Jt1
    public final synchronized void a(String str, boolean z) {
        C1214It1 c1214It1Zza = zza(str);
        if (c1214It1Zza != null) {
            c1214It1Zza.f = 0L;
            c1214It1Zza.e = 0L;
            b(str, c1214It1Zza);
        }
    }

    @Override // com.daaw.InterfaceC1318Jt1
    public final synchronized void b(String str, C1214It1 c1214It1) {
        float f;
        try {
            long j = this.b;
            int length = c1214It1.a.length;
            long j2 = j + ((long) length);
            int i = this.d;
            if (j2 <= i || length <= i * 0.9f) {
                File fileE = e(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileE));
                    C9729xu1 c9729xu1 = new C9729xu1(str, c1214It1);
                    try {
                        h(bufferedOutputStream, 538247942);
                        j(bufferedOutputStream, c9729xu1.b);
                        String str2 = c9729xu1.c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        j(bufferedOutputStream, str2);
                        i(bufferedOutputStream, c9729xu1.d);
                        i(bufferedOutputStream, c9729xu1.e);
                        i(bufferedOutputStream, c9729xu1.f);
                        i(bufferedOutputStream, c9729xu1.g);
                        List<C2171Rt1> list = c9729xu1.h;
                        if (list != null) {
                            h(bufferedOutputStream, list.size());
                            for (C2171Rt1 c2171Rt1 : list) {
                                j(bufferedOutputStream, c2171Rt1.a());
                                j(bufferedOutputStream, c2171Rt1.b());
                            }
                        } else {
                            h(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(c1214It1.a);
                        bufferedOutputStream.close();
                        c9729xu1.a = fileE.length();
                        m(str, c9729xu1);
                        if (this.b >= this.d) {
                            if (AbstractC7770qu1.a) {
                                AbstractC7770qu1.d("Pruning old cache entries.", new Object[0]);
                            }
                            long j3 = this.b;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.a.entrySet().iterator();
                            int i2 = 0;
                            while (it.hasNext()) {
                                C9729xu1 c9729xu12 = (C9729xu1) ((Map.Entry) it.next()).getValue();
                                if (e(c9729xu12.b).delete()) {
                                    f = 0.9f;
                                    this.b -= c9729xu12.a;
                                } else {
                                    f = 0.9f;
                                    String str3 = c9729xu12.b;
                                    AbstractC7770qu1.a("Could not delete cache entry for key=%s, filename=%s", str3, o(str3));
                                }
                                it.remove();
                                i2++;
                                if (this.b < this.d * f) {
                                    break;
                                }
                            }
                            if (AbstractC7770qu1.a) {
                                AbstractC7770qu1.d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.b - j3), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e) {
                        AbstractC7770qu1.a("%s", e.toString());
                        bufferedOutputStream.close();
                        AbstractC7770qu1.a("Failed to write header for %s", fileE.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileE.delete()) {
                        AbstractC7770qu1.a("Could not clean up file %s", fileE.getAbsolutePath());
                    }
                    if (!this.c.zza().exists()) {
                        AbstractC7770qu1.a("Re-initializing cache after external clearing.", new Object[0]);
                        this.a.clear();
                        this.b = 0L;
                        zzb();
                    }
                }
            }
        } finally {
        }
    }

    public final File e(String str) {
        return new File(this.c.zza(), o(str));
    }

    public final synchronized void g(String str) {
        boolean zDelete = e(str).delete();
        n(str);
        if (zDelete) {
            return;
        }
        AbstractC7770qu1.a("Could not delete cache entry for key=%s, filename=%s", str, o(str));
    }

    public final void m(String str, C9729xu1 c9729xu1) {
        if (this.a.containsKey(str)) {
            this.b += c9729xu1.a - ((C9729xu1) this.a.get(str)).a;
        } else {
            this.b += c9729xu1.a;
        }
        this.a.put(str, c9729xu1);
    }

    public final void n(String str) {
        C9729xu1 c9729xu1 = (C9729xu1) this.a.remove(str);
        if (c9729xu1 != null) {
            this.b -= c9729xu1.a;
        }
    }

    @Override // com.daaw.InterfaceC1318Jt1
    public final synchronized C1214It1 zza(String str) {
        C9729xu1 c9729xu1 = (C9729xu1) this.a.get(str);
        if (c9729xu1 == null) {
            return null;
        }
        File fileE = e(str);
        try {
            C0802Eu1 c0802Eu1 = new C0802Eu1(new BufferedInputStream(new FileInputStream(fileE)), fileE.length());
            try {
                C9729xu1 c9729xu1A = C9729xu1.a(c0802Eu1);
                if (!TextUtils.equals(str, c9729xu1A.b)) {
                    AbstractC7770qu1.a("%s: key=%s, found=%s", fileE.getAbsolutePath(), str, c9729xu1A.b);
                    n(str);
                    return null;
                }
                byte[] bArrK = k(c0802Eu1, c0802Eu1.a());
                C1214It1 c1214It1 = new C1214It1();
                c1214It1.a = bArrK;
                c1214It1.b = c9729xu1.c;
                c1214It1.c = c9729xu1.d;
                c1214It1.d = c9729xu1.e;
                c1214It1.e = c9729xu1.f;
                c1214It1.f = c9729xu1.g;
                List<C2171Rt1> list = c9729xu1.h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (C2171Rt1 c2171Rt1 : list) {
                    treeMap.put(c2171Rt1.a(), c2171Rt1.b());
                }
                c1214It1.g = treeMap;
                c1214It1.h = DesugarCollections.unmodifiableList(c9729xu1.h);
                return c1214It1;
            } finally {
                c0802Eu1.close();
            }
        } catch (IOException e) {
            AbstractC7770qu1.a("%s: %s", fileE.getAbsolutePath(), e.toString());
            g(str);
            return null;
        }
    }

    @Override // com.daaw.InterfaceC1318Jt1
    public final synchronized void zzb() {
        synchronized (this) {
            File fileZza = this.c.zza();
            if (!fileZza.exists()) {
                if (fileZza.mkdirs()) {
                    return;
                }
                AbstractC7770qu1.b("Unable to create cache dir %s", fileZza.getAbsolutePath());
                return;
            }
            File[] fileArrListFiles = fileZza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        C0802Eu1 c0802Eu1 = new C0802Eu1(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            C9729xu1 c9729xu1A = C9729xu1.a(c0802Eu1);
                            c9729xu1A.a = length;
                            m(c9729xu1A.b, c9729xu1A);
                            c0802Eu1.close();
                        } catch (Throwable th) {
                            c0802Eu1.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        }
    }

    public C1010Gu1(File file, int i) {
        this.c = new C9450wu1(this, file);
    }
}
