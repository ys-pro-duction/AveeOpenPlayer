package com.daaw;

import com.revenuecat.purchases.common.Constants;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Gw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1017Gw0 {

    /* JADX INFO: renamed from: com.daaw.Gw0$a */
    public static class a {
        public String a;
    }

    public static C2078Qw0 a(long j, String str, a aVar) {
        return new C2078Qw0(j, c(str, aVar.a));
    }

    public static C2078Qw0 b(long j, String str, String str2, String str3, a aVar) {
        return new C2078Qw0(j, c(str, aVar.a), str2, str3);
    }

    public static String c(String str, String str2) {
        if (str.startsWith("/")) {
            return d(str, str2);
        }
        if (str.startsWith("\\")) {
            return d(str, str2);
        }
        if (str.startsWith("..")) {
            String strE = e(str, str2);
            return strE == null ? d(str, str2) : strE;
        }
        if (str.contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)) {
            return d(str, str2);
        }
        String strE2 = e(str, str2);
        return strE2 == null ? d(str, str2) : strE2;
    }

    public static String e(String str, String str2) {
        File parentFile;
        File file = new File(str2);
        if (!file.isDirectory() && (parentFile = file.getParentFile()) != null) {
            file = parentFile;
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            return null;
        }
        try {
            return file2.getCanonicalPath();
        } catch (IOException unused) {
            return file2.getAbsolutePath();
        }
    }

    public static int f(C0949Gf0 c0949Gf0, a aVar, List list) {
        c0949Gf0.d(true);
        List<LI0> listC = c0949Gf0.c();
        for (LI0 li0 : listC) {
            a aVar2 = aVar;
            list.add(b(-1L, li0.b(), li0.c(), null, aVar2));
            aVar = aVar2;
        }
        return listC.size();
    }

    public static int g(C1261Jf0 c1261Jf0, a aVar, List list) {
        List<JI0> listC = c1261Jf0.c();
        for (JI0 ji0 : listC) {
            a aVar2 = aVar;
            list.add(b(-1L, ji0.a(), null, ji0.b(), aVar2));
            aVar = aVar2;
        }
        return listC.size();
    }

    public static int h(C1724Nr0 c1724Nr0, a aVar, List list) {
        List listC = c1724Nr0.c();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            list.add(a(-1L, AbstractC0405Bb1.l((String) it.next()), aVar));
        }
        return listC.size();
    }

    public static int i(C1932Pr0 c1932Pr0, a aVar, List list) {
        List listC = c1932Pr0.c();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            list.add(a(-1L, (String) it.next(), aVar));
        }
        return listC.size();
    }

    public static int j(C2162Rr0 c2162Rr0, a aVar, List list) {
        List<LI0> listC = c2162Rr0.c();
        for (LI0 li0 : listC) {
            a aVar2 = aVar;
            list.add(b(-1L, li0.b(), li0.c(), null, aVar2));
            aVar = aVar2;
        }
        return listC.size();
    }

    public static int k(InterfaceC7649qV0 interfaceC7649qV0, a aVar, List list) {
        if (interfaceC7649qV0 == null) {
            return 0;
        }
        if (interfaceC7649qV0 instanceof C1724Nr0) {
            return h((C1724Nr0) interfaceC7649qV0, aVar, list);
        }
        if (interfaceC7649qV0 instanceof C2162Rr0) {
            return j((C2162Rr0) interfaceC7649qV0, aVar, list);
        }
        if (interfaceC7649qV0 instanceof C1261Jf0) {
            return g((C1261Jf0) interfaceC7649qV0, aVar, list);
        }
        if (interfaceC7649qV0 instanceof C1932Pr0) {
            return i((C1932Pr0) interfaceC7649qV0, aVar, list);
        }
        if (interfaceC7649qV0 instanceof C0949Gf0) {
            return f((C0949Gf0) interfaceC7649qV0, aVar, list);
        }
        return 0;
    }

    public static String d(String str, String str2) {
        return str;
    }
}
