package com.daaw;

import com.daaw.YV0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5548j {
    public static final a c = new a(null);
    public static final Map d;
    public final E30 a;
    public final ConcurrentHashMap b;

    /* JADX INFO: renamed from: com.daaw.j$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (S7 s7 : S7.values()) {
            String strC = s7.c();
            if (linkedHashMap.get(strC) == null) {
                linkedHashMap.put(strC, s7);
            }
        }
        d = linkedHashMap;
    }

    public AbstractC5548j(E30 e30) {
        G10.g(e30, "javaTypeEnhancementState");
        this.a = e30;
        this.b = new ConcurrentHashMap();
    }

    public static final boolean f(Object obj) {
        G10.g(obj, "$this$extractNullability");
        return false;
    }

    public final Set b(Set set) {
        return set.contains(S7.F) ? AbstractC10146zQ0.j(AbstractC10146zQ0.i(AbstractC5431ib.t0(S7.values()), S7.G), set) : set;
    }

    public abstract Iterable c(Object obj, boolean z);

    public final J30 d(J30 j30, Iterable iterable) {
        EnumMap enumMapB;
        G10.g(iterable, "annotations");
        if (!this.a.b()) {
            ArrayList<N20> arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                N20 n20E = e(it.next());
                if (n20E != null) {
                    arrayList.add(n20E);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = (j30 == null || (enumMapB = j30.b()) == null) ? new EnumMap(S7.class) : new EnumMap(enumMapB);
                boolean z = false;
                for (N20 n20 : arrayList) {
                    Iterator it2 = n20.e().iterator();
                    while (it2.hasNext()) {
                        enumMap.put((S7) it2.next(), n20);
                        z = true;
                    }
                }
                if (z) {
                    return new J30(enumMap);
                }
            }
        }
        return j30;
    }

    public final N20 e(Object obj) {
        C3541bp0 c3541bp0I;
        N20 n20T = t(obj);
        if (n20T != null) {
            return n20T;
        }
        C0576Cs0 c0576Cs0V = v(obj);
        if (c0576Cs0V == null) {
            return null;
        }
        Object objA = c0576Cs0V.a();
        Set set = (Set) c0576Cs0V.b();
        EnumC5076hI0 enumC5076hI0S = s(obj);
        if (enumC5076hI0S == null) {
            enumC5076hI0S = r(objA);
        }
        if (enumC5076hI0S.g() || (c3541bp0I = i(objA, C5271i.B)) == null) {
            return null;
        }
        return new N20(C3541bp0.b(c3541bp0I, null, enumC5076hI0S.h(), 1, null), set, false, 4, null);
    }

    public final EnumC3247am0 g(Iterable iterable) {
        EnumC3247am0 enumC3247am0;
        G10.g(iterable, "annotations");
        Iterator it = iterable.iterator();
        EnumC3247am0 enumC3247am02 = null;
        while (it.hasNext()) {
            AP apK = k(it.next());
            if (C40.q().contains(apK)) {
                enumC3247am0 = EnumC3247am0.B;
            } else if (C40.n().contains(apK)) {
                enumC3247am0 = EnumC3247am0.C;
            } else {
                continue;
            }
            if (enumC3247am02 != null && enumC3247am02 != enumC3247am0) {
                return null;
            }
            enumC3247am02 = enumC3247am0;
        }
        return enumC3247am02;
    }

    public final C3541bp0 h(Iterable iterable, NQ nq) {
        G10.g(iterable, "annotations");
        G10.g(nq, "forceWarning");
        Iterator it = iterable.iterator();
        C3541bp0 c3541bp0 = null;
        while (it.hasNext()) {
            C3541bp0 c3541bp0I = i(it.next(), nq);
            if (c3541bp0 != null) {
                if (c3541bp0I != null && !G10.c(c3541bp0I, c3541bp0) && (!c3541bp0I.d() || c3541bp0.d())) {
                    if (c3541bp0I.d() || !c3541bp0.d()) {
                        return null;
                    }
                }
            }
            c3541bp0 = c3541bp0I;
        }
        return c3541bp0;
    }

    public final C3541bp0 i(Object obj, NQ nq) {
        C3541bp0 c3541bp0P;
        C3541bp0 c3541bp0P2 = p(obj, ((Boolean) nq.invoke(obj)).booleanValue());
        if (c3541bp0P2 != null) {
            return c3541bp0P2;
        }
        Object objU = u(obj);
        if (objU == null) {
            return null;
        }
        EnumC5076hI0 enumC5076hI0R = r(obj);
        if (enumC5076hI0R.g() || (c3541bp0P = p(objU, ((Boolean) nq.invoke(objU)).booleanValue())) == null) {
            return null;
        }
        return C3541bp0.b(c3541bp0P, null, enumC5076hI0R.h(), 1, null);
    }

    public final Object j(Object obj, AP ap) {
        for (Object obj2 : m(obj)) {
            if (G10.c(k(obj2), ap)) {
                return obj2;
            }
        }
        return null;
    }

    public abstract AP k(Object obj);

    public abstract Object l(Object obj);

    public abstract Iterable m(Object obj);

    public final boolean n(Object obj, AP ap) {
        Iterable iterableM = m(obj);
        if ((iterableM instanceof Collection) && ((Collection) iterableM).isEmpty()) {
            return false;
        }
        Iterator it = iterableM.iterator();
        while (it.hasNext()) {
            if (G10.c(k(it.next()), ap)) {
                return true;
            }
        }
        return false;
    }

    public final boolean o(Object obj) {
        G10.g(obj, "annotation");
        Object objJ = j(obj, YV0.a.H);
        if (objJ == null) {
            return false;
        }
        Iterable iterableC = c(objJ, false);
        if ((iterableC instanceof Collection) && ((Collection) iterableC).isEmpty()) {
            return false;
        }
        Iterator it = iterableC.iterator();
        while (it.hasNext()) {
            if (G10.c((String) it.next(), "TYPE")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
    
        if (r6.equals("NEVER") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b4, code lost:
    
        if (r6.equals("MAYBE") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b7, code lost:
    
        r6 = com.daaw.EnumC3262ap0.C;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.C3541bp0 p(java.lang.Object r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC5548j.p(java.lang.Object, boolean):com.daaw.bp0");
    }

    public final EnumC5076hI0 q(Object obj) {
        AP apK = k(obj);
        return (apK == null || !T7.c().containsKey(apK)) ? r(obj) : (EnumC5076hI0) this.a.c().invoke(apK);
    }

    public final EnumC5076hI0 r(Object obj) {
        EnumC5076hI0 enumC5076hI0S = s(obj);
        return enumC5076hI0S != null ? enumC5076hI0S : this.a.d().c();
    }

    public final EnumC5076hI0 s(Object obj) {
        Iterable iterableC;
        String str;
        EnumC5076hI0 enumC5076hI0 = (EnumC5076hI0) this.a.d().e().get(k(obj));
        if (enumC5076hI0 != null) {
            return enumC5076hI0;
        }
        Object objJ = j(obj, T7.d());
        if (objJ == null || (iterableC = c(objJ, false)) == null || (str = (String) AbstractC2455Um.f0(iterableC)) == null) {
            return null;
        }
        EnumC5076hI0 enumC5076hI0D = this.a.d().d();
        if (enumC5076hI0D != null) {
            return enumC5076hI0D;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -2137067054) {
            if (iHashCode != -1838656823) {
                if (iHashCode == 2656902 && str.equals("WARN")) {
                    return EnumC5076hI0.E;
                }
            } else if (str.equals("STRICT")) {
                return EnumC5076hI0.F;
            }
        } else if (str.equals("IGNORE")) {
            return EnumC5076hI0.D;
        }
        return null;
    }

    public final N20 t(Object obj) {
        N20 n20;
        if (this.a.b() || (n20 = (N20) T7.a().get(k(obj))) == null) {
            return null;
        }
        EnumC5076hI0 enumC5076hI0Q = q(obj);
        if (enumC5076hI0Q == EnumC5076hI0.D) {
            enumC5076hI0Q = null;
        }
        if (enumC5076hI0Q == null) {
            return null;
        }
        return N20.b(n20, C3541bp0.b(n20.d(), null, enumC5076hI0Q.h(), 1, null), null, false, 6, null);
    }

    public final Object u(Object obj) {
        Object objU;
        G10.g(obj, "annotation");
        if (this.a.d().f()) {
            return null;
        }
        if (AbstractC2455Um.W(T7.b(), k(obj)) || n(obj, T7.f())) {
            return obj;
        }
        if (!n(obj, T7.g())) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        Object objL = l(obj);
        V v = concurrentHashMap.get(objL);
        if (v != 0) {
            return v;
        }
        Iterator it = m(obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                objU = null;
                break;
            }
            objU = u(it.next());
            if (objU != null) {
                break;
            }
        }
        if (objU == null) {
            return null;
        }
        V vPutIfAbsent = concurrentHashMap.putIfAbsent(objL, objU);
        return vPutIfAbsent == 0 ? objU : vPutIfAbsent;
    }

    public final C0576Cs0 v(Object obj) {
        Object objJ;
        Object next;
        if (this.a.d().f() || (objJ = j(obj, T7.e())) == null) {
            return null;
        }
        Iterator it = m(obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (u(next) != null) {
                break;
            }
        }
        if (next == null) {
            return null;
        }
        Iterable iterableC = c(objJ, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = iterableC.iterator();
        while (it2.hasNext()) {
            S7 s7 = (S7) d.get((String) it2.next());
            if (s7 != null) {
                linkedHashSet.add(s7);
            }
        }
        return new C0576Cs0(next, b(linkedHashSet));
    }
}
