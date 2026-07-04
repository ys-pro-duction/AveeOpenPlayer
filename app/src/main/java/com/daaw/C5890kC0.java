package com.daaw;

import com.daaw.C4954gr0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.kC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5890kC0 {
    public static final C4954gr0 k;
    public static final C4954gr0 l;
    public final List a;
    public List b;
    public Z01 c;
    public final List d;
    public final UI0 e;
    public final String f;
    public final long g;
    public final a h;
    public final C7976rg i;
    public final C7976rg j;

    /* JADX INFO: renamed from: com.daaw.kC0$a */
    public enum a {
        LIMIT_TO_FIRST,
        LIMIT_TO_LAST
    }

    /* JADX INFO: renamed from: com.daaw.kC0$b */
    public static class b implements Comparator {
        public final List B;

        public b(List list) {
            boolean z;
            Iterator it = list.iterator();
            loop0: while (true) {
                while (it.hasNext()) {
                    z = z || ((C4954gr0) it.next()).c().equals(C6488mK.C);
                }
            }
            if (!z) {
                throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
            }
            this.B = list;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(LC lc, LC lc2) {
            Iterator it = this.B.iterator();
            while (it.hasNext()) {
                int iA = ((C4954gr0) it.next()).a(lc, lc2);
                if (iA != 0) {
                    return iA;
                }
            }
            return 0;
        }
    }

    static {
        C4954gr0.a aVar = C4954gr0.a.ASCENDING;
        C6488mK c6488mK = C6488mK.C;
        k = C4954gr0.d(aVar, c6488mK);
        l = C4954gr0.d(C4954gr0.a.DESCENDING, c6488mK);
    }

    public C5890kC0(UI0 ui0, String str, List list, List list2, long j, a aVar, C7976rg c7976rg, C7976rg c7976rg2) {
        this.e = ui0;
        this.f = str;
        this.a = list2;
        this.d = list;
        this.g = j;
        this.h = aVar;
        this.i = c7976rg;
        this.j = c7976rg2;
    }

    public static C5890kC0 b(UI0 ui0) {
        return new C5890kC0(ui0, null);
    }

    public C5890kC0 a(UI0 ui0) {
        return new C5890kC0(ui0, null, this.d, this.a, this.g, this.h, this.i, this.j);
    }

    public Comparator c() {
        return new b(l());
    }

    public C5890kC0 d(ZK zk) {
        boolean z = true;
        AbstractC6557mb.d(!r(), "No filter is allowed for document query", new Object[0]);
        C6488mK c6488mKC = zk.c();
        C6488mK c6488mKP = p();
        AbstractC6557mb.d(c6488mKP == null || c6488mKC == null || c6488mKP.equals(c6488mKC), "Query must only have one inequality field", new Object[0]);
        if (!this.a.isEmpty() && c6488mKC != null && !((C4954gr0) this.a.get(0)).b.equals(c6488mKC)) {
            z = false;
        }
        AbstractC6557mb.d(z, "First orderBy must match inequality field", new Object[0]);
        ArrayList arrayList = new ArrayList(this.d);
        arrayList.add(zk);
        return new C5890kC0(this.e, this.f, arrayList, this.a, this.g, this.h, this.i, this.j);
    }

    public String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5890kC0.class != obj.getClass()) {
            return false;
        }
        C5890kC0 c5890kC0 = (C5890kC0) obj;
        if (this.h != c5890kC0.h) {
            return false;
        }
        return z().equals(c5890kC0.z());
    }

    public C7976rg f() {
        return this.j;
    }

    public List g() {
        return this.a;
    }

    public List h() {
        return this.d;
    }

    public int hashCode() {
        return (z().hashCode() * 31) + this.h.hashCode();
    }

    public C6488mK i() {
        if (this.a.isEmpty()) {
            return null;
        }
        return ((C4954gr0) this.a.get(0)).c();
    }

    public long j() {
        return this.g;
    }

    public a k() {
        return this.h;
    }

    public List l() {
        C4954gr0.a aVarB;
        boolean z = false;
        if (this.b == null) {
            C6488mK c6488mKP = p();
            C6488mK c6488mKI = i();
            if (c6488mKP == null || c6488mKI != null) {
                ArrayList arrayList = new ArrayList();
                for (C4954gr0 c4954gr0 : this.a) {
                    arrayList.add(c4954gr0);
                    if (c4954gr0.c().equals(C6488mK.C)) {
                        z = true;
                    }
                }
                if (!z) {
                    if (this.a.size() > 0) {
                        List list = this.a;
                        aVarB = ((C4954gr0) list.get(list.size() - 1)).b();
                    } else {
                        aVarB = C4954gr0.a.ASCENDING;
                    }
                    arrayList.add(aVarB.equals(C4954gr0.a.ASCENDING) ? k : l);
                }
                this.b = arrayList;
            } else if (c6488mKP.w()) {
                this.b = Collections.singletonList(k);
            } else {
                this.b = Arrays.asList(C4954gr0.d(C4954gr0.a.ASCENDING, c6488mKP), k);
            }
        }
        return this.b;
    }

    public UI0 m() {
        return this.e;
    }

    public C7976rg n() {
        return this.i;
    }

    public boolean o() {
        return this.g != -1;
    }

    public C6488mK p() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            C6488mK c6488mKC = ((ZK) it.next()).c();
            if (c6488mKC != null) {
                return c6488mKC;
            }
        }
        return null;
    }

    public boolean q() {
        return this.f != null;
    }

    public boolean r() {
        return TC.s(this.e) && this.f == null && this.d.isEmpty();
    }

    public C5890kC0 s(long j) {
        return new C5890kC0(this.e, this.f, this.d, this.a, j, a.LIMIT_TO_FIRST, this.i, this.j);
    }

    public boolean t(LC lc) {
        return lc.b() && y(lc) && x(lc) && w(lc) && v(lc);
    }

    public String toString() {
        return "Query(target=" + z().toString() + ";limitType=" + this.h.toString() + ")";
    }

    public boolean u() {
        if (this.d.isEmpty() && this.g == -1 && this.i == null && this.j == null) {
            return g().isEmpty() || (g().size() == 1 && i().w());
        }
        return false;
    }

    public final boolean v(LC lc) {
        C7976rg c7976rg = this.i;
        if (c7976rg != null && !c7976rg.f(l(), lc)) {
            return false;
        }
        C7976rg c7976rg2 = this.j;
        return c7976rg2 == null || c7976rg2.e(l(), lc);
    }

    public final boolean w(LC lc) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            if (!((ZK) it.next()).e(lc)) {
                return false;
            }
        }
        return true;
    }

    public final boolean x(LC lc) {
        for (C4954gr0 c4954gr0 : l()) {
            if (!c4954gr0.c().equals(C6488mK.C) && lc.e(c4954gr0.b) == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean y(LC lc) {
        UI0 ui0Q = lc.getKey().q();
        return this.f != null ? lc.getKey().r(this.f) && this.e.o(ui0Q) : TC.s(this.e) ? this.e.equals(ui0Q) : this.e.o(ui0Q) && this.e.p() == ui0Q.p() - 1;
    }

    public Z01 z() {
        if (this.c == null) {
            if (this.h == a.LIMIT_TO_FIRST) {
                this.c = new Z01(m(), e(), h(), l(), this.g, n(), f());
            } else {
                ArrayList arrayList = new ArrayList();
                for (C4954gr0 c4954gr0 : l()) {
                    C4954gr0.a aVarB = c4954gr0.b();
                    C4954gr0.a aVar = C4954gr0.a.DESCENDING;
                    if (aVarB == aVar) {
                        aVar = C4954gr0.a.ASCENDING;
                    }
                    arrayList.add(C4954gr0.d(aVar, c4954gr0.c()));
                }
                C7976rg c7976rg = this.j;
                C7976rg c7976rg2 = c7976rg != null ? new C7976rg(c7976rg.b(), this.j.c()) : null;
                C7976rg c7976rg3 = this.i;
                this.c = new Z01(m(), e(), h(), arrayList, this.g, c7976rg2, c7976rg3 != null ? new C7976rg(c7976rg3.b(), this.i.c()) : null);
            }
        }
        return this.c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5890kC0(UI0 ui0, String str) {
        List list = Collections.EMPTY_LIST;
        this(ui0, str, list, list, -1L, a.LIMIT_TO_FIRST, null, null);
    }
}
