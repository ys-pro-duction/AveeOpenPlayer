package com.daaw;

import com.daaw.C0355Ap;
import com.daaw.C4515fK;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Zd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2940Zd0 {
    public static ZK a(ZK zk) {
        f(zk);
        if (m(zk)) {
            return zk;
        }
        C0355Ap c0355Ap = (C0355Ap) zk;
        List listB = c0355Ap.b();
        if (listB.size() == 1) {
            return a((ZK) listB.get(0));
        }
        if (c0355Ap.k()) {
            return c0355Ap;
        }
        ArrayList<ZK> arrayList = new ArrayList();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(a((ZK) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (ZK zk2 : arrayList) {
            if (zk2 instanceof C4515fK) {
                arrayList2.add(zk2);
            } else if (zk2 instanceof C0355Ap) {
                C0355Ap c0355Ap2 = (C0355Ap) zk2;
                if (c0355Ap2.h().equals(c0355Ap.h())) {
                    arrayList2.addAll(c0355Ap2.b());
                } else {
                    arrayList2.add(c0355Ap2);
                }
            }
        }
        return arrayList2.size() == 1 ? (ZK) arrayList2.get(0) : new C0355Ap(arrayList2, c0355Ap.h());
    }

    public static ZK b(C0355Ap c0355Ap, C0355Ap c0355Ap2) {
        AbstractC6557mb.d((c0355Ap.b().isEmpty() || c0355Ap2.b().isEmpty()) ? false : true, "Found an empty composite filter", new Object[0]);
        if (c0355Ap.i() && c0355Ap2.i()) {
            return c0355Ap.m(c0355Ap2.b());
        }
        C0355Ap c0355Ap3 = c0355Ap.j() ? c0355Ap : c0355Ap2;
        if (c0355Ap.j()) {
            c0355Ap = c0355Ap2;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c0355Ap3.b().iterator();
        while (it.hasNext()) {
            arrayList.add(e((ZK) it.next(), c0355Ap));
        }
        return new C0355Ap(arrayList, C0355Ap.a.OR);
    }

    public static ZK c(C4515fK c4515fK, C0355Ap c0355Ap) {
        if (c0355Ap.i()) {
            return c0355Ap.m(Collections.singletonList(c4515fK));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c0355Ap.b().iterator();
        while (it.hasNext()) {
            arrayList.add(e(c4515fK, (ZK) it.next()));
        }
        return new C0355Ap(arrayList, C0355Ap.a.OR);
    }

    public static ZK d(C4515fK c4515fK, C4515fK c4515fK2) {
        return new C0355Ap(Arrays.asList(c4515fK, c4515fK2), C0355Ap.a.AND);
    }

    public static ZK e(ZK zk, ZK zk2) {
        f(zk);
        f(zk2);
        boolean z = zk instanceof C4515fK;
        return a((z && (zk2 instanceof C4515fK)) ? d((C4515fK) zk, (C4515fK) zk2) : (z && (zk2 instanceof C0355Ap)) ? c((C4515fK) zk, (C0355Ap) zk2) : ((zk instanceof C0355Ap) && (zk2 instanceof C4515fK)) ? c((C4515fK) zk2, (C0355Ap) zk) : b((C0355Ap) zk, (C0355Ap) zk2));
    }

    public static void f(ZK zk) {
        AbstractC6557mb.d((zk instanceof C4515fK) || (zk instanceof C0355Ap), "Only field filters and composite filters are accepted.", new Object[0]);
    }

    public static ZK g(ZK zk) {
        f(zk);
        if (zk instanceof C4515fK) {
            return zk;
        }
        C0355Ap c0355Ap = (C0355Ap) zk;
        if (c0355Ap.b().size() == 1) {
            return g((ZK) zk.b().get(0));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c0355Ap.b().iterator();
        while (it.hasNext()) {
            arrayList.add(g((ZK) it.next()));
        }
        ZK zkA = a(new C0355Ap(arrayList, c0355Ap.h()));
        if (k(zkA)) {
            return zkA;
        }
        AbstractC6557mb.d(zkA instanceof C0355Ap, "field filters are already in DNF form.", new Object[0]);
        C0355Ap c0355Ap2 = (C0355Ap) zkA;
        AbstractC6557mb.d(c0355Ap2.i(), "Disjunction of filters all of which are already in DNF form is itself in DNF form.", new Object[0]);
        AbstractC6557mb.d(c0355Ap2.b().size() > 1, "Single-filter composite filters are already in DNF form.", new Object[0]);
        ZK zkE = (ZK) c0355Ap2.b().get(0);
        for (int i = 1; i < c0355Ap2.b().size(); i++) {
            zkE = e(zkE, (ZK) c0355Ap2.b().get(i));
        }
        return zkE;
    }

    public static ZK h(ZK zk) {
        f(zk);
        ArrayList arrayList = new ArrayList();
        if (!(zk instanceof C4515fK)) {
            C0355Ap c0355Ap = (C0355Ap) zk;
            Iterator it = c0355Ap.b().iterator();
            while (it.hasNext()) {
                arrayList.add(h((ZK) it.next()));
            }
            return new C0355Ap(arrayList, c0355Ap.h());
        }
        if (!(zk instanceof C3739cZ)) {
            return zk;
        }
        C3739cZ c3739cZ = (C3739cZ) zk;
        Iterator it2 = c3739cZ.i().l0().g().iterator();
        while (it2.hasNext()) {
            arrayList.add(C4515fK.f(c3739cZ.g(), C4515fK.b.EQUAL, (C6564mc1) it2.next()));
        }
        return new C0355Ap(arrayList, C0355Ap.a.OR);
    }

    public static List i(C0355Ap c0355Ap) {
        if (c0355Ap.b().isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ZK zkG = g(h(c0355Ap));
        AbstractC6557mb.d(k(zkG), "computeDistributedNormalForm did not result in disjunctive normal form", new Object[0]);
        return (m(zkG) || l(zkG)) ? Collections.singletonList(zkG) : zkG.b();
    }

    public static boolean j(ZK zk) {
        if (zk instanceof C0355Ap) {
            C0355Ap c0355Ap = (C0355Ap) zk;
            if (c0355Ap.j()) {
                for (ZK zk2 : c0355Ap.b()) {
                    if (!m(zk2) && !l(zk2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean k(ZK zk) {
        return m(zk) || l(zk) || j(zk);
    }

    public static boolean l(ZK zk) {
        return (zk instanceof C0355Ap) && ((C0355Ap) zk).l();
    }

    public static boolean m(ZK zk) {
        return zk instanceof C4515fK;
    }
}
