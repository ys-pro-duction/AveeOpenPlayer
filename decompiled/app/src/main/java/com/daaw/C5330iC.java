package com.daaw;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.iC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5330iC implements Closeable, AutoCloseable {
    public final File B;
    public final File C;
    public final File D;
    public final File E;
    public final int F;
    public long G;
    public final int H;
    public Writer J;
    public int L;
    public long I = 0;
    public final LinkedHashMap K = new LinkedHashMap(0, 0.75f, true);
    public long M = 0;
    public final ThreadPoolExecutor N = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final Callable O = new a();

    /* JADX INFO: renamed from: com.daaw.iC$a */
    public class a implements Callable {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (C5330iC.this) {
                try {
                    if (C5330iC.this.J == null) {
                        return null;
                    }
                    C5330iC.this.K0();
                    if (C5330iC.this.p0()) {
                        C5330iC.this.y0();
                        C5330iC.this.L = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.iC$b */
    public final class b {
        public final c a;
        public final boolean[] b;
        public boolean c;

        public /* synthetic */ b(C5330iC c5330iC, c cVar, a aVar) {
            this(cVar);
        }

        public void a() {
            C5330iC.this.N(this, false);
        }

        public void b() {
            if (this.c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            C5330iC.this.N(this, true);
            this.c = true;
        }

        public File f(int i) {
            File fileK;
            synchronized (C5330iC.this) {
                try {
                    if (this.a.f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.a.e) {
                        this.b[i] = true;
                    }
                    fileK = this.a.k(i);
                    if (!C5330iC.this.B.exists()) {
                        C5330iC.this.B.mkdirs();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fileK;
        }

        public b(c cVar) {
            this.a = cVar;
            this.b = cVar.e ? null : new boolean[C5330iC.this.H];
        }
    }

    /* JADX INFO: renamed from: com.daaw.iC$c */
    public final class c {
        public final String a;
        public final long[] b;
        public File[] c;
        public File[] d;
        public boolean e;
        public b f;
        public long g;

        public /* synthetic */ c(C5330iC c5330iC, String str, a aVar) {
            this(str);
        }

        public File j(int i) {
            return this.c[i];
        }

        public File k(int i) {
            return this.d[i];
        }

        public String l() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        public final IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final void n(String[] strArr) throws IOException {
            if (strArr.length != C5330iC.this.H) {
                throw m(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public c(String str) {
            this.a = str;
            this.b = new long[C5330iC.this.H];
            this.c = new File[C5330iC.this.H];
            this.d = new File[C5330iC.this.H];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C5330iC.this.H; i++) {
                sb.append(i);
                this.c[i] = new File(C5330iC.this.B, sb.toString());
                sb.append(".tmp");
                this.d[i] = new File(C5330iC.this.B, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.iC$d */
    public final class d {
        public final String a;
        public final long b;
        public final long[] c;
        public final File[] d;

        public /* synthetic */ d(C5330iC c5330iC, String str, long j, File[] fileArr, long[] jArr, a aVar) {
            this(str, j, fileArr, jArr);
        }

        public File a(int i) {
            return this.d[i];
        }

        public d(String str, long j, File[] fileArr, long[] jArr) {
            this.a = str;
            this.b = j;
            this.d = fileArr;
            this.c = jArr;
        }
    }

    public C5330iC(File file, int i, int i2, long j) {
        this.B = file;
        this.F = i;
        this.C = new File(file, "journal");
        this.D = new File(file, "journal.tmp");
        this.E = new File(file, "journal.bkp");
        this.H = i2;
        this.G = j;
    }

    public static void E0(File file, File file2, boolean z) throws IOException {
        if (z) {
            U(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void U(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static C5330iC q0(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                E0(file2, file3, false);
            }
        }
        C5330iC c5330iC = new C5330iC(file, i, i2, j);
        if (c5330iC.C.exists()) {
            try {
                c5330iC.w0();
                c5330iC.s0();
                return c5330iC;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                c5330iC.R();
            }
        }
        file.mkdirs();
        C5330iC c5330iC2 = new C5330iC(file, i, i2, j);
        c5330iC2.y0();
        return c5330iC2;
    }

    public synchronized boolean B0(String str) {
        try {
            I();
            c cVar = (c) this.K.get(str);
            if (cVar != null && cVar.f == null) {
                for (int i = 0; i < this.H; i++) {
                    File fileJ = cVar.j(i);
                    if (fileJ.exists() && !fileJ.delete()) {
                        throw new IOException("failed to delete " + fileJ);
                    }
                    this.I -= cVar.b[i];
                    cVar.b[i] = 0;
                }
                this.L++;
                this.J.append((CharSequence) "REMOVE");
                this.J.append(' ');
                this.J.append((CharSequence) str);
                this.J.append('\n');
                this.K.remove(str);
                if (p0()) {
                    this.N.submit(this.O);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    public final void I() {
        if (this.J == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final void K0() {
        while (this.I > this.G) {
            B0((String) ((Map.Entry) this.K.entrySet().iterator().next()).getKey());
        }
    }

    public final synchronized void N(b bVar, boolean z) {
        c cVar = bVar.a;
        if (cVar.f != bVar) {
            throw new IllegalStateException();
        }
        if (z && !cVar.e) {
            for (int i = 0; i < this.H; i++) {
                if (!bVar.b[i]) {
                    bVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!cVar.k(i).exists()) {
                    bVar.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.H; i2++) {
            File fileK = cVar.k(i2);
            if (!z) {
                U(fileK);
            } else if (fileK.exists()) {
                File fileJ = cVar.j(i2);
                fileK.renameTo(fileJ);
                long j = cVar.b[i2];
                long length = fileJ.length();
                cVar.b[i2] = length;
                this.I = (this.I - j) + length;
            }
        }
        this.L++;
        cVar.f = null;
        if (cVar.e || z) {
            cVar.e = true;
            this.J.append((CharSequence) "CLEAN");
            this.J.append(' ');
            this.J.append((CharSequence) cVar.a);
            this.J.append((CharSequence) cVar.l());
            this.J.append('\n');
            if (z) {
                long j2 = this.M;
                this.M = 1 + j2;
                cVar.g = j2;
            }
        } else {
            this.K.remove(cVar.a);
            this.J.append((CharSequence) "REMOVE");
            this.J.append(' ');
            this.J.append((CharSequence) cVar.a);
            this.J.append('\n');
        }
        this.J.flush();
        if (this.I > this.G || p0()) {
            this.N.submit(this.O);
        }
    }

    public void R() throws IOException {
        close();
        AbstractC8232sb1.b(this.B);
    }

    public b W(String str) {
        return Y(str, -1L);
    }

    public final synchronized b Y(String str, long j) {
        I();
        c cVar = (c) this.K.get(str);
        a aVar = null;
        if (j != -1 && (cVar == null || cVar.g != j)) {
            return null;
        }
        if (cVar == null) {
            cVar = new c(this, str, aVar);
            this.K.put(str, cVar);
        } else if (cVar.f != null) {
            return null;
        }
        b bVar = new b(this, cVar, aVar);
        cVar.f = bVar;
        this.J.append((CharSequence) "DIRTY");
        this.J.append(' ');
        this.J.append((CharSequence) str);
        this.J.append('\n');
        this.J.flush();
        return bVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.J == null) {
                return;
            }
            for (c cVar : new ArrayList(this.K.values())) {
                if (cVar.f != null) {
                    cVar.f.a();
                }
            }
            K0();
            this.J.close();
            this.J = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized d o0(String str) {
        Throwable th;
        try {
            try {
                I();
                c cVar = (c) this.K.get(str);
                if (cVar == null) {
                    return null;
                }
                if (!cVar.e) {
                    return null;
                }
                for (File file : cVar.c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                this.L++;
                this.J.append((CharSequence) "READ");
                this.J.append(' ');
                this.J.append((CharSequence) str);
                this.J.append('\n');
                if (p0()) {
                    this.N.submit(this.O);
                }
                return new d(this, str, cVar.g, cVar.c, cVar.b, null);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        throw th;
    }

    public final boolean p0() {
        int i = this.L;
        return i >= 2000 && i >= this.K.size();
    }

    public final void s0() throws IOException {
        U(this.D);
        Iterator it = this.K.values().iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            int i = 0;
            if (cVar.f == null) {
                while (i < this.H) {
                    this.I += cVar.b[i];
                    i++;
                }
            } else {
                cVar.f = null;
                while (i < this.H) {
                    U(cVar.j(i));
                    U(cVar.k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void w0() {
        C4015dY0 c4015dY0 = new C4015dY0(new FileInputStream(this.C), AbstractC8232sb1.a);
        try {
            String strJ = c4015dY0.j();
            String strJ2 = c4015dY0.j();
            String strJ3 = c4015dY0.j();
            String strJ4 = c4015dY0.j();
            String strJ5 = c4015dY0.j();
            if (!"libcore.io.DiskLruCache".equals(strJ) || !"1".equals(strJ2) || !Integer.toString(this.F).equals(strJ3) || !Integer.toString(this.H).equals(strJ4) || !"".equals(strJ5)) {
                throw new IOException("unexpected journal header: [" + strJ + ", " + strJ2 + ", " + strJ4 + ", " + strJ5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    x0(c4015dY0.j());
                    i++;
                } catch (EOFException unused) {
                    this.L = i - this.K.size();
                    if (c4015dY0.d()) {
                        y0();
                    } else {
                        this.J = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.C, true), AbstractC8232sb1.a));
                    }
                    AbstractC8232sb1.a(c4015dY0);
                    return;
                }
            }
        } catch (Throwable th) {
            AbstractC8232sb1.a(c4015dY0);
            throw th;
        }
    }

    public final void x0(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.K.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        c cVar = (c) this.K.get(strSubstring);
        a aVar = null;
        if (cVar == null) {
            cVar = new c(this, strSubstring, aVar);
            this.K.put(strSubstring, cVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            cVar.e = true;
            cVar.f = null;
            cVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            cVar.f = new b(this, cVar, aVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public final synchronized void y0() {
        try {
            Writer writer = this.J;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.D), AbstractC8232sb1.a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.F));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.H));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (c cVar : this.K.values()) {
                    if (cVar.f != null) {
                        bufferedWriter.write("DIRTY " + cVar.a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + cVar.a + cVar.l() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.C.exists()) {
                    E0(this.C, this.E, true);
                }
                E0(this.D, this.C, false);
                this.E.delete();
                this.J = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.C, true), AbstractC8232sb1.a));
            } catch (Throwable th) {
                bufferedWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
