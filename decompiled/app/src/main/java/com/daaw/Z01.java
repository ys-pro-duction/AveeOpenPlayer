package com.daaw;

import android.util.Pair;
import com.daaw.AbstractC5362iK;
import com.daaw.C4515fK;
import com.daaw.C4954gr0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Z01 {
    public String a;
    public final List b;
    public final List c;
    public final UI0 d;
    public final String e;
    public final long f;
    public final C7976rg g;
    public final C7976rg h;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C4515fK.b.values().length];
            a = iArr;
            try {
                iArr[C4515fK.b.ARRAY_CONTAINS_ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C4515fK.b.ARRAY_CONTAINS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[C4515fK.b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[C4515fK.b.IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[C4515fK.b.NOT_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[C4515fK.b.NOT_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[C4515fK.b.LESS_THAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[C4515fK.b.LESS_THAN_OR_EQUAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[C4515fK.b.GREATER_THAN_OR_EQUAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[C4515fK.b.GREATER_THAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public Z01(UI0 ui0, String str, List list, List list2, long j, C7976rg c7976rg, C7976rg c7976rg2) {
        this.d = ui0;
        this.e = str;
        this.b = list2;
        this.c = list;
        this.f = j;
        this.g = c7976rg;
        this.h = c7976rg2;
    }

    public List a(AbstractC5362iK abstractC5362iK) {
        AbstractC5362iK.c cVarC = abstractC5362iK.c();
        if (cVarC == null) {
            return null;
        }
        for (C4515fK c4515fK : g(cVarC.g())) {
            int i = a.a[c4515fK.h().ordinal()];
            if (i == 1) {
                return c4515fK.i().l0().g();
            }
            if (i == 2) {
                return Collections.singletonList(c4515fK.i());
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Pair b(AbstractC5362iK.c cVar, C7976rg c7976rg) {
        C6564mc1 c6564mc1 = AbstractC0513Cc1.c;
        Iterator it = g(cVar.g()).iterator();
        boolean zC = true;
        while (true) {
            int i = 0;
            boolean z = false;
            if (!it.hasNext()) {
                if (c7976rg != null) {
                    while (true) {
                        if (i < this.b.size()) {
                            if (((C4954gr0) this.b.get(i)).c().equals(cVar.g())) {
                                C6564mc1 c6564mc12 = (C6564mc1) c7976rg.b().get(i);
                                if (AbstractC0513Cc1.C(c6564mc1, zC, c6564mc12, c7976rg.c()) < 0) {
                                    zC = c7976rg.c();
                                    c6564mc1 = c6564mc12;
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                }
                return new Pair(c6564mc1, Boolean.valueOf(zC));
            }
            C4515fK c4515fK = (C4515fK) it.next();
            C6564mc1 c6564mc1I = AbstractC0513Cc1.c;
            switch (a.a[c4515fK.h().ordinal()]) {
                case 3:
                case 4:
                case 9:
                    c6564mc1I = c4515fK.i();
                    z = true;
                    break;
                case 5:
                case 6:
                default:
                    z = true;
                    break;
                case 7:
                case 8:
                    c6564mc1I = AbstractC0513Cc1.r(c4515fK.i().w0());
                    z = true;
                    break;
                case 10:
                    c6564mc1I = c4515fK.i();
                    break;
            }
            if (AbstractC0513Cc1.C(c6564mc1, zC, c6564mc1I, z) < 0) {
                zC = z;
                c6564mc1 = c6564mc1I;
            }
        }
    }

    public String c() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(n().g());
        if (this.e != null) {
            sb.append("|cg:");
            sb.append(this.e);
        }
        sb.append("|f:");
        Iterator it = h().iterator();
        while (it.hasNext()) {
            sb.append(((ZK) it.next()).a());
        }
        sb.append("|ob:");
        for (C4954gr0 c4954gr0 : m()) {
            sb.append(c4954gr0.c().g());
            sb.append(c4954gr0.b().equals(C4954gr0.a.ASCENDING) ? "asc" : "desc");
        }
        if (r()) {
            sb.append("|l:");
            sb.append(j());
        }
        if (this.g != null) {
            sb.append("|lb:");
            sb.append(this.g.c() ? "b:" : "a:");
            sb.append(this.g.d());
        }
        if (this.h != null) {
            sb.append("|ub:");
            sb.append(this.h.c() ? "a:" : "b:");
            sb.append(this.h.d());
        }
        String string = sb.toString();
        this.a = string;
        return string;
    }

    public String d() {
        return this.e;
    }

    public final Pair e(AbstractC5362iK.c cVar, C7976rg c7976rg) {
        C6564mc1 c6564mc1 = AbstractC0513Cc1.e;
        Iterator it = g(cVar.g()).iterator();
        boolean zC = true;
        while (true) {
            int i = 0;
            z = false;
            boolean z = false;
            if (!it.hasNext()) {
                if (c7976rg != null) {
                    while (true) {
                        if (i < this.b.size()) {
                            if (((C4954gr0) this.b.get(i)).c().equals(cVar.g())) {
                                C6564mc1 c6564mc12 = (C6564mc1) c7976rg.b().get(i);
                                if (AbstractC0513Cc1.H(c6564mc1, zC, c6564mc12, c7976rg.c()) > 0) {
                                    zC = c7976rg.c();
                                    c6564mc1 = c6564mc12;
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                }
                return new Pair(c6564mc1, Boolean.valueOf(zC));
            }
            C4515fK c4515fK = (C4515fK) it.next();
            C6564mc1 c6564mc1I = AbstractC0513Cc1.e;
            switch (a.a[c4515fK.h().ordinal()]) {
                case 3:
                case 4:
                case 8:
                    c6564mc1I = c4515fK.i();
                case 5:
                case 6:
                default:
                    z = true;
                    break;
                case 7:
                    c6564mc1I = c4515fK.i();
                    break;
                case 9:
                case 10:
                    c6564mc1I = AbstractC0513Cc1.s(c4515fK.i().w0());
                    break;
            }
            if (AbstractC0513Cc1.H(c6564mc1, zC, c6564mc1I, z) > 0) {
                zC = z;
                c6564mc1 = c6564mc1I;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Z01.class == obj.getClass()) {
            Z01 z01 = (Z01) obj;
            String str = this.e;
            if (str == null ? z01.e != null : !str.equals(z01.e)) {
                return false;
            }
            if (this.f != z01.f || !this.b.equals(z01.b) || !this.c.equals(z01.c) || !this.d.equals(z01.d)) {
                return false;
            }
            C7976rg c7976rg = this.g;
            if (c7976rg == null ? z01.g != null : !c7976rg.equals(z01.g)) {
                return false;
            }
            C7976rg c7976rg2 = this.h;
            C7976rg c7976rg3 = z01.h;
            if (c7976rg2 != null) {
                return c7976rg2.equals(c7976rg3);
            }
            if (c7976rg3 == null) {
                return true;
            }
        }
        return false;
    }

    public C7976rg f() {
        return this.h;
    }

    public final List g(C6488mK c6488mK) {
        ArrayList arrayList = new ArrayList();
        for (ZK zk : this.c) {
            if (zk instanceof C4515fK) {
                C4515fK c4515fK = (C4515fK) zk;
                if (c4515fK.g().equals(c6488mK)) {
                    arrayList.add(c4515fK);
                }
            }
        }
        return arrayList;
    }

    public List h() {
        return this.c;
    }

    public int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.e;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        long j = this.f;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        C7976rg c7976rg = this.g;
        int iHashCode3 = (i + (c7976rg != null ? c7976rg.hashCode() : 0)) * 31;
        C7976rg c7976rg2 = this.h;
        return iHashCode3 + (c7976rg2 != null ? c7976rg2.hashCode() : 0);
    }

    public C4954gr0.a i() {
        return ((C4954gr0) this.b.get(r0.size() - 1)).b();
    }

    public long j() {
        return this.f;
    }

    public C7976rg k(AbstractC5362iK abstractC5362iK) {
        ArrayList arrayList = new ArrayList();
        boolean zBooleanValue = true;
        for (AbstractC5362iK.c cVar : abstractC5362iK.e()) {
            Pair pairB = cVar.h().equals(AbstractC5362iK.c.a.ASCENDING) ? b(cVar, this.g) : e(cVar, this.g);
            arrayList.add((C6564mc1) pairB.first);
            zBooleanValue &= ((Boolean) pairB.second).booleanValue();
        }
        return new C7976rg(arrayList, zBooleanValue);
    }

    public Collection l(AbstractC5362iK abstractC5362iK) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AbstractC5362iK.c cVar : abstractC5362iK.e()) {
            for (C4515fK c4515fK : g(cVar.g())) {
                int i = a.a[c4515fK.h().ordinal()];
                if (i == 3 || i == 4) {
                    linkedHashMap.put(cVar.g(), c4515fK.i());
                } else if (i == 5 || i == 6) {
                    linkedHashMap.put(cVar.g(), c4515fK.i());
                    return linkedHashMap.values();
                }
            }
        }
        return null;
    }

    public List m() {
        return this.b;
    }

    public UI0 n() {
        return this.d;
    }

    public int o() {
        HashSet hashSet = new HashSet();
        Iterator it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            for (C4515fK c4515fK : ((ZK) it.next()).d()) {
                if (!c4515fK.g().w()) {
                    if (c4515fK.h().equals(C4515fK.b.ARRAY_CONTAINS) || c4515fK.h().equals(C4515fK.b.ARRAY_CONTAINS_ANY)) {
                        i = 1;
                    } else {
                        hashSet.add(c4515fK.g());
                    }
                }
            }
        }
        for (C4954gr0 c4954gr0 : this.b) {
            if (!c4954gr0.c().w()) {
                hashSet.add(c4954gr0.c());
            }
        }
        return hashSet.size() + i;
    }

    public C7976rg p() {
        return this.g;
    }

    public C7976rg q(AbstractC5362iK abstractC5362iK) {
        ArrayList arrayList = new ArrayList();
        boolean zBooleanValue = true;
        for (AbstractC5362iK.c cVar : abstractC5362iK.e()) {
            Pair pairE = cVar.h().equals(AbstractC5362iK.c.a.ASCENDING) ? e(cVar, this.h) : b(cVar, this.h);
            arrayList.add((C6564mc1) pairE.first);
            zBooleanValue &= ((Boolean) pairE.second).booleanValue();
        }
        return new C7976rg(arrayList, zBooleanValue);
    }

    public boolean r() {
        return this.f != -1;
    }

    public boolean s() {
        return TC.s(this.d) && this.e == null && this.c.isEmpty();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Query(");
        sb.append(this.d.g());
        if (this.e != null) {
            sb.append(" collectionGroup=");
            sb.append(this.e);
        }
        if (!this.c.isEmpty()) {
            sb.append(" where ");
            for (int i = 0; i < this.c.size(); i++) {
                if (i > 0) {
                    sb.append(" and ");
                }
                sb.append(this.c.get(i));
            }
        }
        if (!this.b.isEmpty()) {
            sb.append(" order by ");
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(this.b.get(i2));
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
