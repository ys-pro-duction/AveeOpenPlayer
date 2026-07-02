package com.daaw;

import com.daaw.AbstractC1316Jt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.daaw.Xt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2795Xt {
    public static final Charset d = Charset.forName("UTF-8");
    public static final int e = 15;
    public static final C2275St f = new C2275St();
    public static final Comparator g = new Comparator() { // from class: com.daaw.Tt
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    };
    public static final FilenameFilter h = new FilenameFilter() { // from class: com.daaw.Ut
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("event");
        }
    };
    public final AtomicInteger a = new AtomicInteger(0);
    public final RK b;
    public final OQ0 c;

    public C2795Xt(RK rk, OQ0 oq0) {
        this.b = rk;
        this.c = oq0;
    }

    public static void D(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void E(File file, String str, long j) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), d);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int f(List list, int i) {
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (size <= i) {
                break;
            }
            RK.s(file);
            size--;
        }
        return size;
    }

    public static long h(long j) {
        return j * 1000;
    }

    public static String m(int i, boolean z) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i)) + (z ? "_" : "");
    }

    public static String o(String str) {
        return str.substring(0, e);
    }

    public static boolean s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    public static boolean t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    public static int v(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public static String y(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), d);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public final void A(String str, long j) {
        boolean z;
        List<File> listP = this.b.p(str, h);
        if (listP.isEmpty()) {
            C2106Rd0.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(listP);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z = false;
            for (File file : listP) {
                try {
                    arrayList.add(f.h(y(file)));
                } catch (IOException e2) {
                    C2106Rd0.f().l("Could not add event to report for " + file, e2);
                }
                if (z || s(file.getName())) {
                    z = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            B(this.b.o(str, "report"), arrayList, j, z, C2199Sa1.g(str, this.b));
            return;
        }
        C2106Rd0.f().k("Could not parse event files for session " + str);
    }

    public final void B(File file, List list, long j, boolean z, String str) {
        try {
            C2275St c2275St = f;
            AbstractC1316Jt abstractC1316JtN = c2275St.F(y(file)).p(j, z, str).n(NY.e(list));
            AbstractC1316Jt.e eVarK = abstractC1316JtN.k();
            if (eVarK == null) {
                return;
            }
            D(z ? this.b.j(eVarK.h()) : this.b.l(eVarK.h()), c2275St.G(abstractC1316JtN));
        } catch (IOException e2) {
            C2106Rd0.f().l("Could not synthesize final report file for " + file, e2);
        }
    }

    public final int C(String str, int i) {
        List listP = this.b.p(str, new FilenameFilter() { // from class: com.daaw.Vt
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return C2795Xt.t(file, str2);
            }
        });
        Collections.sort(listP, new Comparator() { // from class: com.daaw.Wt
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2795Xt.v((File) obj, (File) obj2);
            }
        });
        return f(listP, i);
    }

    public final SortedSet e(String str) {
        this.b.b();
        SortedSet sortedSetP = p();
        if (str != null) {
            sortedSetP.remove(str);
        }
        if (sortedSetP.size() > 8) {
            while (sortedSetP.size() > 8) {
                String str2 = (String) sortedSetP.last();
                C2106Rd0.f().b("Removing session over cap: " + str2);
                this.b.c(str2);
                sortedSetP.remove(str2);
            }
        }
        return sortedSetP;
    }

    public final void g() {
        int i = this.c.b().a.b;
        List listN = n();
        int size = listN.size();
        if (size <= i) {
            return;
        }
        Iterator it = listN.subList(i, size).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public void i() {
        j(this.b.m());
        j(this.b.k());
        j(this.b.h());
    }

    public final void j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public void k(String str, long j) {
        for (String str2 : e(str)) {
            C2106Rd0.f().i("Finalizing report for session " + str2);
            A(str2, j);
            this.b.c(str2);
        }
        g();
    }

    public void l(String str, AbstractC1316Jt.d dVar, AbstractC1316Jt.a aVar) {
        File fileO = this.b.o(str, "report");
        C2106Rd0.f().b("Writing native session report for " + str + " to file: " + fileO);
        z(fileO, dVar, str, aVar);
    }

    public final List n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b.k());
        arrayList.addAll(this.b.h());
        Comparator comparator = g;
        Collections.sort(arrayList, comparator);
        List listM = this.b.m();
        Collections.sort(listM, comparator);
        arrayList.addAll(listM);
        return arrayList;
    }

    public SortedSet p() {
        return new TreeSet(this.b.d()).descendingSet();
    }

    public long q(String str) {
        return this.b.o(str, "start-time").lastModified();
    }

    public boolean r() {
        return (this.b.m().isEmpty() && this.b.k().isEmpty() && this.b.h().isEmpty()) ? false : true;
    }

    public List u() {
        List<File> listN = n();
        ArrayList arrayList = new ArrayList();
        for (File file : listN) {
            try {
                arrayList.add(AbstractC2899Yt.a(f.F(y(file)), file.getName(), file));
            } catch (IOException e2) {
                C2106Rd0.f().l("Could not load report file " + file + "; deleting", e2);
                file.delete();
            }
        }
        return arrayList;
    }

    public void w(AbstractC1316Jt.e.d dVar, String str, boolean z) {
        int i = this.c.b().a.a;
        try {
            D(this.b.o(str, m(this.a.getAndIncrement(), z)), f.i(dVar));
        } catch (IOException e2) {
            C2106Rd0.f().l("Could not persist event for session " + str, e2);
        }
        C(str, i);
    }

    public void x(AbstractC1316Jt abstractC1316Jt) {
        AbstractC1316Jt.e eVarK = abstractC1316Jt.k();
        if (eVarK == null) {
            C2106Rd0.f().b("Could not get session for report");
            return;
        }
        String strH = eVarK.h();
        try {
            D(this.b.o(strH, "report"), f.G(abstractC1316Jt));
            E(this.b.o(strH, "start-time"), "", eVarK.k());
        } catch (IOException e2) {
            C2106Rd0.f().c("Could not persist report for session " + strH, e2);
        }
    }

    public final void z(File file, AbstractC1316Jt.d dVar, String str, AbstractC1316Jt.a aVar) {
        try {
            C2275St c2275St = f;
            D(this.b.g(str), c2275St.G(c2275St.F(y(file)).o(dVar).m(aVar)));
        } catch (IOException e2) {
            C2106Rd0.f().l("Could not synthesize final native report file for " + file, e2);
        }
    }
}
