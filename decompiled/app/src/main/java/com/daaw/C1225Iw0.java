package com.daaw;

import com.daaw.AbstractC1017Gw0;
import com.daaw.AbstractC1329Jw0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.Iw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1225Iw0 {
    public static C1225Iw0 c;
    public final InterfaceC0412Bd0 a = AbstractC0837Fd0.a(getClass());
    public Iterable b;

    public C1225Iw0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1828Or0());
        arrayList.add(new C2268Sr0());
        arrayList.add(new C1365Kf0());
        arrayList.add(new C2058Qr0());
        arrayList.add(new C1053Hf0());
        this.b = arrayList;
    }

    public static String f(String str, String str2, C1121Hw0 c1121Hw0) {
        if (str == null || str.length() <= 0) {
            str = "//";
        } else if (str.charAt(str.length() - 1) != '/') {
            str = str + "/";
        }
        return str + str2 + "." + c1121Hw0.b;
    }

    public static C1225Iw0 h() {
        if (c == null) {
            c = new C1225Iw0();
        }
        return c;
    }

    public int a(C7378pX0 c7378pX0, String str, List list, boolean z, boolean z2) {
        return b(c7378pX0, str, C2078Qw0.q(list), z, z2);
    }

    public int b(C7378pX0 c7378pX0, String str, List list, boolean z, boolean z2) {
        URL url;
        InterfaceC7649qV0 interfaceC7649qV0C;
        InterfaceC7927rV0 interfaceC7927rV0A;
        try {
            if (str.startsWith("file:")) {
                url = new URL(str);
            } else {
                url = new URL("file://" + str);
            }
            File file = new File(str);
            if (file.exists()) {
                try {
                    interfaceC7649qV0C = g(url);
                    try {
                        interfaceC7927rV0A = interfaceC7649qV0C.a();
                    } catch (IOException e) {
                        e = e;
                        interfaceC7927rV0A = null;
                    }
                } catch (IOException e2) {
                    e = e2;
                    interfaceC7649qV0C = null;
                    interfaceC7927rV0A = null;
                }
                try {
                    if (interfaceC7649qV0C instanceof C0949Gf0) {
                        ((C0949Gf0) interfaceC7649qV0C).d(true);
                    }
                    if (z) {
                        try {
                            interfaceC7649qV0C = interfaceC7927rV0A.c(new C0809Ew0());
                        } catch (Exception e3) {
                            AbstractC0441Bk1.c(e3.getMessage());
                        }
                    }
                } catch (IOException e4) {
                    e = e4;
                    AbstractC0441Bk1.c(e.getMessage());
                }
                if (interfaceC7649qV0C == null || interfaceC7927rV0A == null) {
                    if (!z) {
                        return 0;
                    }
                    try {
                        interfaceC7649qV0C = d(str).c(new C0809Ew0());
                    } catch (Exception e5) {
                        AbstractC0441Bk1.c(e5.getMessage());
                    }
                }
            } else {
                try {
                    interfaceC7649qV0C = d(str).c(new C0809Ew0());
                } catch (Exception e6) {
                    AbstractC0441Bk1.c(e6.getMessage());
                    interfaceC7649qV0C = null;
                }
            }
            if (interfaceC7649qV0C == null) {
                AbstractC0441Bk1.c("error specificPlaylist is null");
                c7378pX0.a("Error specificPlaylist is null");
                return 0;
            }
            AbstractC1329Jw0.a aVar = new AbstractC1329Jw0.a();
            aVar.b = z2;
            try {
                aVar.a = file.getCanonicalPath();
            } catch (Exception unused) {
                aVar.a = file.getAbsolutePath();
            }
            int iF = AbstractC1329Jw0.f(interfaceC7649qV0C, aVar, list);
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    interfaceC7649qV0C.b(fileOutputStream, null);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (Exception e7) {
                    AbstractC0441Bk1.c("outputSpecificPlaylist.writeTo: " + e7.getMessage());
                    c7378pX0.b("OutputSpecificPlaylist", e7);
                }
                return iF;
            } catch (Exception e8) {
                c7378pX0.b("File Output", e8);
                return 0;
            }
        } catch (MalformedURLException unused2) {
            c7378pX0.a("MalformedURLException");
            return 0;
        }
    }

    public int c(C7378pX0 c7378pX0, String str, C1121Hw0 c1121Hw0, List list, boolean z) {
        return a(c7378pX0, str, list, true, z);
    }

    public final InterfaceC7927rV0 d(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        InterfaceC7927rV0 interfaceC7927rV0 = null;
        for (InterfaceC7927rV0 interfaceC7927rV02 : this.b) {
            C8036rs[] c8036rsArrB = interfaceC7927rV02.b();
            int length = c8036rsArrB.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (c8036rsArrB[i].b(lowerCase)) {
                    interfaceC7927rV0 = interfaceC7927rV02;
                    break;
                }
                i++;
            }
            if (interfaceC7927rV0 != null) {
                break;
            }
        }
        return interfaceC7927rV0;
    }

    public List e(String str) {
        URL url;
        File file;
        InterfaceC7649qV0 interfaceC7649qV0G;
        ArrayList arrayList = null;
        try {
            url = new URL("file://" + str);
            file = new File(str);
        } catch (MalformedURLException unused) {
        }
        if (com.daaw.avee.a.k() == null) {
            return null;
        }
        try {
            interfaceC7649qV0G = g(url);
        } catch (IOException e) {
            AbstractC0441Bk1.c(e.getMessage());
            interfaceC7649qV0G = null;
        }
        if (interfaceC7649qV0G == null) {
            return null;
        }
        arrayList = new ArrayList();
        if (file.exists()) {
            AbstractC1017Gw0.a aVar = new AbstractC1017Gw0.a();
            try {
                aVar.a = file.getCanonicalPath();
            } catch (Exception unused2) {
                aVar.a = file.getAbsolutePath();
            }
            AbstractC1017Gw0.k(interfaceC7649qV0G, aVar, arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:10|23|11|12|(2:14|29)(2:15|(2:17|28)(1:30))|18) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if (r8.a.b() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        r8.a.d("Playlist provider " + r1.getId() + " cannot unmarshal <" + r9 + ">", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        if (r8.a.a() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        r8.a.c("Playlist provider " + r1.getId() + " cannot unmarshal <" + r9 + ">: " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ad, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
    
        r9 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.InterfaceC7649qV0 g(java.net.URL r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.Iterable r0 = r8.b
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lae
            java.lang.Object r1 = r0.next()
            com.daaw.rV0 r1 = (com.daaw.InterfaceC7927rV0) r1
            java.net.URLConnection r2 = r9.openConnection()
            r3 = 0
            r2.setAllowUserInteraction(r3)
            r4 = 10000(0x2710, float:1.4013E-41)
            r2.setConnectTimeout(r4)
            r4 = 1
            r2.setDoInput(r4)
            r2.setDoOutput(r3)
            r3 = 60000(0xea60, float:8.4078E-41)
            r2.setReadTimeout(r3)
            r2.setUseCaches(r4)
            r2.connect()
            java.lang.String r3 = r2.getContentEncoding()
            java.io.InputStream r2 = r2.getInputStream()
            com.daaw.Bd0 r4 = r8.a     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            com.daaw.qV0 r9 = r1.a(r2, r3, r4)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r2.close()
            goto Laf
        L44:
            r9 = move-exception
            goto Laa
        L46:
            r3 = move-exception
            com.daaw.Bd0 r4 = r8.a     // Catch: java.lang.Throwable -> L44
            boolean r4 = r4.b()     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = " cannot unmarshal <"
            java.lang.String r6 = "Playlist provider "
            if (r4 == 0) goto L77
            com.daaw.Bd0 r4 = r8.a     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r7.<init>()     // Catch: java.lang.Throwable -> L44
            r7.append(r6)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r1.getId()     // Catch: java.lang.Throwable -> L44
            r7.append(r1)     // Catch: java.lang.Throwable -> L44
            r7.append(r5)     // Catch: java.lang.Throwable -> L44
            r7.append(r9)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = ">"
            r7.append(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> L44
            r4.d(r1, r3)     // Catch: java.lang.Throwable -> L44
            goto La5
        L77:
            com.daaw.Bd0 r4 = r8.a     // Catch: java.lang.Throwable -> L44
            boolean r4 = r4.a()     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto La5
            com.daaw.Bd0 r4 = r8.a     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r7.<init>()     // Catch: java.lang.Throwable -> L44
            r7.append(r6)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r1.getId()     // Catch: java.lang.Throwable -> L44
            r7.append(r1)     // Catch: java.lang.Throwable -> L44
            r7.append(r5)     // Catch: java.lang.Throwable -> L44
            r7.append(r9)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = ">: "
            r7.append(r1)     // Catch: java.lang.Throwable -> L44
            r7.append(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> L44
            r4.c(r1)     // Catch: java.lang.Throwable -> L44
        La5:
            r2.close()
            goto L6
        Laa:
            r2.close()
            throw r9
        Lae:
            r9 = 0
        Laf:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1225Iw0.g(java.net.URL):com.daaw.qV0");
    }
}
