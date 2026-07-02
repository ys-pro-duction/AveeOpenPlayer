package com.daaw;

import android.content.Context;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Jw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1329Jw0 {

    /* JADX INFO: renamed from: com.daaw.Jw0$a */
    public static class a {
        public String a;
        public boolean b;
    }

    public static int a(C0949Gf0 c0949Gf0, a aVar, List list) {
        Context contextK = com.daaw.avee.a.k();
        c0949Gf0.d(true);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2078Qw0 c2078Qw0 = (C2078Qw0) it.next();
            LI0 li0 = new LI0();
            li0.e(g(c2078Qw0, aVar.a, aVar.b));
            if (contextK != null) {
                li0.f(c2078Qw0.j(contextK).e);
                li0.d(r2.f());
            }
            c0949Gf0.c().add(li0);
        }
        return list.size();
    }

    public static int b(C1261Jf0 c1261Jf0, a aVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2078Qw0 c2078Qw0 = (C2078Qw0) it.next();
            JI0 ji0 = new JI0();
            ji0.d(g(c2078Qw0, aVar.a, aVar.b));
            c1261Jf0.c().add(ji0);
        }
        return list.size();
    }

    public static int c(C1724Nr0 c1724Nr0, a aVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c1724Nr0.c().add(g((C2078Qw0) it.next(), aVar.a, aVar.b));
        }
        return list.size();
    }

    public static int d(C1932Pr0 c1932Pr0, a aVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c1932Pr0.c().add(g((C2078Qw0) it.next(), aVar.a, aVar.b));
        }
        return list.size();
    }

    public static int e(C2162Rr0 c2162Rr0, a aVar, List list) {
        Context contextK = com.daaw.avee.a.k();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2078Qw0 c2078Qw0 = (C2078Qw0) it.next();
            LI0 li0 = new LI0();
            li0.e(g(c2078Qw0, aVar.a, aVar.b));
            if (contextK != null) {
                li0.f(c2078Qw0.j(contextK).e);
                li0.d(r2.f());
            }
            c2162Rr0.c().add(li0);
        }
        return list.size();
    }

    public static int f(InterfaceC7649qV0 interfaceC7649qV0, a aVar, List list) {
        if (list == null || interfaceC7649qV0 == null) {
            return 0;
        }
        if (interfaceC7649qV0 instanceof C1724Nr0) {
            return c((C1724Nr0) interfaceC7649qV0, aVar, list);
        }
        if (interfaceC7649qV0 instanceof C2162Rr0) {
            return e((C2162Rr0) interfaceC7649qV0, aVar, list);
        }
        if (interfaceC7649qV0 instanceof C1261Jf0) {
            return b((C1261Jf0) interfaceC7649qV0, aVar, list);
        }
        if (interfaceC7649qV0 instanceof C1932Pr0) {
            return d((C1932Pr0) interfaceC7649qV0, aVar, list);
        }
        if (interfaceC7649qV0 instanceof C0949Gf0) {
            return a((C0949Gf0) interfaceC7649qV0, aVar, list);
        }
        return 0;
    }

    public static String g(C2078Qw0 c2078Qw0, String str, boolean z) {
        String strM = c2078Qw0.m();
        if (strM.startsWith("file://") && strM.length() > 7) {
            strM = strM.substring(7, strM.length());
        }
        return (z && new File(strM).exists()) ? AbstractC0934Gb1.o(strM, str, "/") : strM;
    }
}
