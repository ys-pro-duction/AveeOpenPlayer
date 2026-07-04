package com.daaw;

import com.daaw.AbstractC5362iK;
import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.iK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5362iK {
    public static b a = b.a(0, a.B);
    public static final Comparator b = new Comparator() { // from class: com.daaw.gK
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC5362iK.a((AbstractC5362iK) obj, (AbstractC5362iK) obj2);
        }
    };

    /* JADX INFO: renamed from: com.daaw.iK$a */
    public static abstract class a implements Comparable {
        public static final a B = g(CU0.C, TC.g(), -1);
        public static final Comparator C = new Comparator() { // from class: com.daaw.hK
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC5362iK.a.k((C4083dm0) obj).compareTo(AbstractC5362iK.a.k((C4083dm0) obj2));
            }
        };

        public static a g(CU0 cu0, TC tc, int i) {
            return new C2311Tc(cu0, tc, i);
        }

        public static a h(CU0 cu0, int i) {
            long jG = cu0.c().g();
            int iC = cu0.c().c() + 1;
            return g(new CU0(((double) iC) == 1.0E9d ? new Timestamp(jG + 1, 0) : new Timestamp(jG, iC)), TC.g(), i);
        }

        public static a k(LC lc) {
            return g(lc.g(), lc.getKey(), -1);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            int iCompareTo = n().compareTo(aVar.n());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = l().compareTo(aVar.l());
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(m(), aVar.m());
        }

        public abstract TC l();

        public abstract int m();

        public abstract CU0 n();
    }

    /* JADX INFO: renamed from: com.daaw.iK$b */
    public static abstract class b {
        public static b a(long j, a aVar) {
            return new C2415Uc(j, aVar);
        }

        public static b b(long j, CU0 cu0, TC tc, int i) {
            return a(j, a.g(cu0, tc, i));
        }

        public abstract a c();

        public abstract long d();
    }

    /* JADX INFO: renamed from: com.daaw.iK$c */
    public static abstract class c implements Comparable {

        /* JADX INFO: renamed from: com.daaw.iK$c$a */
        public enum a {
            ASCENDING,
            DESCENDING,
            CONTAINS
        }

        public static c c(C6488mK c6488mK, a aVar) {
            return new C2519Vc(c6488mK, aVar);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int iCompareTo = g().compareTo(cVar.g());
            return iCompareTo != 0 ? iCompareTo : h().compareTo(cVar.h());
        }

        public abstract C6488mK g();

        public abstract a h();
    }

    public static /* synthetic */ int a(AbstractC5362iK abstractC5362iK, AbstractC5362iK abstractC5362iK2) {
        int iCompareTo = abstractC5362iK.d().compareTo(abstractC5362iK2.d());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        Iterator it = abstractC5362iK.h().iterator();
        Iterator it2 = abstractC5362iK2.h().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo2 = ((c) it.next()).compareTo((c) it2.next());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        }
        return Boolean.compare(it.hasNext(), it2.hasNext());
    }

    public static AbstractC5362iK b(int i, String str, List list, b bVar) {
        return new C2205Sc(i, str, list, bVar);
    }

    public c c() {
        for (c cVar : h()) {
            if (cVar.h().equals(c.a.CONTAINS)) {
                return cVar;
            }
        }
        return null;
    }

    public abstract String d();

    public List e() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : h()) {
            if (!cVar.h().equals(c.a.CONTAINS)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public abstract int f();

    public abstract b g();

    public abstract List h();
}
